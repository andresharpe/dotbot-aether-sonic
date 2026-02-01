package com.amazonaws.internal.keyvaluestore;

import android.security.keystore.KeyGenParameterSpec;
import com.amazonaws.logging.LogFactory;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23799a = LogFactory.c(d.class);

    /* renamed from: b, reason: collision with root package name */
    private static final String f23800b = "AES";

    /* renamed from: c, reason: collision with root package name */
    private static final int f23801c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final String f23802d = "AndroidKeyStore";

    /* renamed from: e, reason: collision with root package name */
    static final String f23803e = ".aesKeyStoreAlias";

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized Key a(String str) throws KeyNotFoundException {
        Key key;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance(f23802d);
                keyStore.load(null);
                if (keyStore.containsAlias(str)) {
                    com.amazonaws.logging.c cVar = f23799a;
                    cVar.a("AndroidKeyStore contains keyAlias " + str);
                    cVar.a("Loading the encryption key from Android KeyStore.");
                    key = keyStore.getKey(str, null);
                    if (key == null) {
                        throw new KeyNotFoundException("Key is null even though the keyAlias: " + str + " is present in " + f23802d);
                    }
                } else {
                    throw new KeyNotFoundException("AndroidKeyStore does not contain the keyAlias: " + str);
                }
            } catch (Exception e4) {
                throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return key;
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized void b(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance(f23802d);
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e4) {
            f23799a.l("Error in deleting the key for keyAlias: " + str + " from Android KeyStore.", e4);
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.e
    public synchronized Key c(String str) throws KeyNotGeneratedException {
        SecretKey generateKey;
        try {
            KeyStore keyStore = KeyStore.getInstance(f23802d);
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(f23800b, f23802d);
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(com.google.android.gms.stats.a.f31108u).setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build());
                generateKey = keyGenerator.generateKey();
                f23799a.i("Generated the encryption key identified by the keyAlias: " + str + " using " + f23802d);
            } else {
                throw new KeyNotGeneratedException("Key already exists for the keyAlias: " + str + " in " + f23802d);
            }
        } catch (Exception e4) {
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " + str + " in " + f23802d, e4);
        }
        return generateKey;
    }
}
