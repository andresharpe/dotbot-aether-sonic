package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23787d = LogFactory.c(c.class);

    /* renamed from: e, reason: collision with root package name */
    static final String f23788e = "AES";

    /* renamed from: f, reason: collision with root package name */
    static final int f23789f = 256;

    /* renamed from: g, reason: collision with root package name */
    static final String f23790g = "AndroidKeyStore";

    /* renamed from: h, reason: collision with root package name */
    static final String f23791h = "RSA";

    /* renamed from: i, reason: collision with root package name */
    static final String f23792i = "RSA/ECB/PKCS1Padding";

    /* renamed from: j, reason: collision with root package name */
    static final String f23793j = "AndroidOpenSSL";

    /* renamed from: k, reason: collision with root package name */
    static final String f23794k = "AesGcmNoPadding18-encrypted-encryption-key";

    /* renamed from: l, reason: collision with root package name */
    static final String f23795l = ".rsaKeyStoreAlias";

    /* renamed from: a, reason: collision with root package name */
    private SecureRandom f23796a;

    /* renamed from: b, reason: collision with root package name */
    private Context f23797b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f23798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, SharedPreferences sharedPreferences) {
        this.f23797b = context;
        this.f23798c = sharedPreferences;
    }

    private byte[] d(String str, byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f23790g);
            keyStore.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
            Cipher cipher = Cipher.getInstance(f23792i, f23793j);
            cipher.init(2, privateKeyEntry.getPrivateKey());
            return cipher.doFinal(bArr);
        } catch (Exception e4) {
            f23787d.l("Exception occurred while decrypting the encrypted AES key. ", e4);
            return null;
        }
    }

    private byte[] e(String str, byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f23790g);
            keyStore.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
            Cipher cipher = Cipher.getInstance(f23792i, f23793j);
            cipher.init(1, privateKeyEntry.getCertificate().getPublicKey());
            return cipher.doFinal(bArr);
        } catch (Exception e4) {
            f23787d.n("Exception occurred while encrypting data. " + e4.getMessage());
            return null;
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized Key a(String str) throws KeyNotFoundException {
        byte[] d4;
        try {
            KeyStore keyStore = KeyStore.getInstance(f23790g);
            keyStore.load(null);
            if (keyStore.containsAlias(str)) {
                if (this.f23798c.contains(f23794k)) {
                    f23787d.a("Loading the encryption key from SharedPreferences");
                    String string = this.f23798c.getString(f23794k, null);
                    if (string != null) {
                        byte[] b4 = Base64.b(string);
                        if (b4 != null && b4.length != 0) {
                            d4 = d(str, b4);
                            if (d4 != null && d4.length != 0) {
                            } else {
                                throw new KeyNotFoundException("Unable to RSA decrypt the encrypted AES key identified by: AesGcmNoPadding18-encrypted-encryption-key using the RSA key identified by keyAlias: " + str);
                            }
                        } else {
                            throw new KeyNotFoundException("Unable to Base64 decode the encrypted AES key identified by: AesGcmNoPadding18-encrypted-encryption-key");
                        }
                    } else {
                        throw new KeyNotFoundException("Unable to retrieve the encrypted AES Key identified by AesGcmNoPadding18-encrypted-encryption-key from the SharedPreferences.");
                    }
                } else {
                    throw new KeyNotFoundException("SharedPreferences does not have the key for keyAlias: AesGcmNoPadding18-encrypted-encryption-key");
                }
            } else {
                throw new KeyNotFoundException("The RSA Key identified by the alias: " + str + " cannot be found in " + f23790g);
            }
        } catch (Exception e4) {
            throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e4);
        }
        return new SecretKeySpec(d4, f23788e);
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized void b(String str) {
        try {
            this.f23798c.edit().remove(f23794k).apply();
        } catch (Exception e4) {
            f23787d.l("Error in deleting the encrypted AES key identified by AesGcmNoPadding18-encrypted-encryption-key from SharedPreferences.", e4);
        }
        try {
            KeyStore keyStore = KeyStore.getInstance(f23790g);
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e5) {
            f23787d.l("Error in deleting the RSA Key identified by the keyAlias: " + str + " from " + f23790g, e5);
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized Key c(String str) throws KeyNotGeneratedException {
        SecretKey generateKey;
        try {
            KeyStore.getInstance(f23790g).load(null);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 30);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(this.f23797b).setAlias(str).setSubject(new X500Principal("CN=" + str)).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f23791h, f23790g);
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
            try {
                this.f23796a = new SecureRandom();
                KeyGenerator keyGenerator = KeyGenerator.getInstance(f23788e);
                keyGenerator.init(256, this.f23796a);
                generateKey = keyGenerator.generateKey();
                if (generateKey != null) {
                    byte[] encoded = generateKey.getEncoded();
                    if (encoded != null && encoded.length != 0) {
                        byte[] e4 = e(str, encoded);
                        if (e4 != null && e4.length != 0) {
                            String g4 = Base64.g(e4);
                            if (g4 != null) {
                                this.f23798c.edit().putString(f23794k, g4).apply();
                                f23787d.i("Generated and saved the Encrypted AES encryption key for the AES keyAlias: AesGcmNoPadding18-encrypted-encryption-key to SharedPreferences.");
                            } else {
                                throw new KeyNotGeneratedException("Error in Base64 encoding of the Encrypted AES key for the AES keyAlias: AesGcmNoPadding18-encrypted-encryption-key using the rsaKeyAlias: " + str);
                            }
                        } else {
                            throw new KeyNotGeneratedException("Error in RSA encrypting the AES encryption key for the AES keyAlias: AesGcmNoPadding18-encrypted-encryption-key using the rsaKeyAlias: " + str);
                        }
                    } else {
                        throw new KeyNotGeneratedException("Error in generating the AES encryption key for the alias: AesGcmNoPadding18-encrypted-encryption-key");
                    }
                } else {
                    throw new KeyNotGeneratedException("Error in generating the AES encryption key for the alias: AesGcmNoPadding18-encrypted-encryption-key");
                }
            } catch (Exception e5) {
                throw new KeyNotGeneratedException("Error in generating the AES key and RSA encrypting the AES key using the rsaKeyAlias: " + str + " in " + f23790g, e5);
            }
        } catch (Exception e6) {
            throw new KeyNotGeneratedException("Error in generating the RSA Encryption key for the rsaKeyAlias: " + str + " in " + f23790g, e6);
        }
        return generateKey;
    }
}
