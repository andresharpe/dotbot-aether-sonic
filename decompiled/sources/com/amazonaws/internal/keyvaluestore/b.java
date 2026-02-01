package com.amazonaws.internal.keyvaluestore;

import android.content.SharedPreferences;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
class b implements e {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23782b = LogFactory.d(b.class.getSimpleName());

    /* renamed from: c, reason: collision with root package name */
    private static final String f23783c = "AES";

    /* renamed from: d, reason: collision with root package name */
    private static final int f23784d = 256;

    /* renamed from: e, reason: collision with root package name */
    static final String f23785e = "AesGcmNoPaddingEncryption10-encryption-key";

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f23786a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(SharedPreferences sharedPreferences) {
        this.f23786a = sharedPreferences;
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized Key a(String str) throws KeyNotFoundException {
        byte[] b4;
        try {
            if (this.f23786a.contains(str)) {
                f23782b.a("Loading the encryption key from SharedPreferences");
                String string = this.f23786a.getString(str, null);
                if (string != null) {
                    b4 = Base64.b(string);
                    if (b4 != null && b4.length != 0) {
                    } else {
                        throw new KeyNotFoundException("Error in Base64 decoding the AES encryption key identified by the keyAlias: " + str);
                    }
                } else {
                    throw new KeyNotFoundException("SharedPreferences does not have the key for keyAlias: " + str);
                }
            } else {
                throw new KeyNotFoundException("SharedPreferences does not have the key for keyAlias: " + str);
            }
        } catch (Exception e4) {
            throw new KeyNotFoundException("Error occurred while retrieving key for keyAlias: " + str, e4);
        }
        return new SecretKeySpec(b4, f23783c);
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized void b(String str) {
        try {
            this.f23786a.edit().remove(str).apply();
        } catch (Exception e4) {
            f23782b.l("Error in deleting the AES key identified by " + str + " from SharedPreferences.", e4);
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized Key c(String str) throws KeyNotGeneratedException {
        SecretKey generateKey;
        try {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance(f23783c);
            keyGenerator.init(256, secureRandom);
            generateKey = keyGenerator.generateKey();
            SecretKey generateKey2 = keyGenerator.generateKey();
            if (generateKey2 != null) {
                byte[] encoded = generateKey2.getEncoded();
                if (encoded != null && encoded.length != 0) {
                    String g4 = Base64.g(encoded);
                    if (g4 != null) {
                        this.f23786a.edit().putString(str, g4).apply();
                        f23782b.i("Generated and saved the AES encryption key identified by the aesEncryptionKeyAlias: " + str + " to SharedPreferences.");
                    } else {
                        throw new KeyNotGeneratedException("Error in Base64 encoding of the AES encryption key for the aesEncryptionKeyAlias: " + str);
                    }
                } else {
                    throw new KeyNotGeneratedException("Error in getting the encoded bytes for the AES encryption key identified by the aesEncryptionKeyAlias: " + str);
                }
            } else {
                throw new KeyNotGeneratedException("Error in generating the AES encryption key identified by the aesEncryptionKeyAlias: " + str);
            }
        } catch (Exception e4) {
            throw new KeyNotGeneratedException("Error in generating the AES Encryption key for the aesEncryptionKeyAlias", e4);
        }
        return generateKey;
    }
}
