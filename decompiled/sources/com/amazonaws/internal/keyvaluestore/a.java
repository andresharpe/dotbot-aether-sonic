package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public class a {

    /* renamed from: j, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23759j = LogFactory.c(a.class);

    /* renamed from: k, reason: collision with root package name */
    static Map<String, HashMap<String, String>> f23760k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private static final int f23761l = 23;

    /* renamed from: m, reason: collision with root package name */
    private static final int f23762m = 18;

    /* renamed from: n, reason: collision with root package name */
    private static final int f23763n = 10;

    /* renamed from: o, reason: collision with root package name */
    private static final String f23764o = "AES/GCM/NoPadding";

    /* renamed from: p, reason: collision with root package name */
    private static final int f23765p = 12;

    /* renamed from: q, reason: collision with root package name */
    private static final int f23766q = 128;

    /* renamed from: r, reason: collision with root package name */
    private static final String f23767r = "UTF-8";

    /* renamed from: s, reason: collision with root package name */
    static final String f23768s = ".encrypted";

    /* renamed from: t, reason: collision with root package name */
    static final String f23769t = ".iv";

    /* renamed from: u, reason: collision with root package name */
    static final String f23770u = ".keyvaluestoreversion";

    /* renamed from: v, reason: collision with root package name */
    static final String f23771v = ".encryptionkey";

    /* renamed from: w, reason: collision with root package name */
    private static final int f23772w = 1;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f23773a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23774b;

    /* renamed from: c, reason: collision with root package name */
    Context f23775c;

    /* renamed from: d, reason: collision with root package name */
    SharedPreferences f23776d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23777e;

    /* renamed from: f, reason: collision with root package name */
    SharedPreferences f23778f;

    /* renamed from: g, reason: collision with root package name */
    e f23779g;

    /* renamed from: h, reason: collision with root package name */
    private SecureRandom f23780h = new SecureRandom();

    /* renamed from: i, reason: collision with root package name */
    private int f23781i = Build.VERSION.SDK_INT;

    public a(Context context, String str, boolean z3) {
        this.f23773a = i(str);
        this.f23777e = str;
        this.f23775c = context;
        r(z3);
    }

    private String c(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            byte[] b4 = Base64.b(str);
            Cipher cipher = Cipher.getInstance(f23764o);
            cipher.init(2, key, algorithmParameterSpec);
            return new String(cipher.doFinal(b4), "UTF-8");
        } catch (Exception e4) {
            f23759j.l("Error in decrypting data. ", e4);
            return null;
        }
    }

    private String d(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            Cipher cipher = Cipher.getInstance(f23764o);
            cipher.init(1, key, algorithmParameterSpec);
            return Base64.g(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception e4) {
            f23759j.l("Error in encrypting data. ", e4);
            return null;
        }
    }

    private byte[] f() {
        byte[] bArr = new byte[12];
        this.f23780h.nextBytes(bArr);
        return bArr;
    }

    private AlgorithmParameterSpec h(byte[] bArr) {
        if (this.f23781i >= 23) {
            return new GCMParameterSpec(128, bArr);
        }
        return new IvParameterSpec(bArr);
    }

    private static Map<String, String> i(String str) {
        if (f23760k.containsKey(str)) {
            return f23760k.get(str);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        f23760k.put(str, hashMap);
        return hashMap;
    }

    private String j(String str) {
        if (str == null) {
            return null;
        }
        return str + f23768s;
    }

    private String k() {
        int i4 = this.f23781i;
        if (i4 >= 23) {
            return this.f23777e + ".aesKeyStoreAlias";
        }
        if (i4 >= 18) {
            return this.f23777e + ".rsaKeyStoreAlias";
        }
        if (i4 >= 10) {
            return "AesGcmNoPaddingEncryption10-encryption-key";
        }
        f23759j.n("API Level " + String.valueOf(Build.VERSION.SDK_INT) + " not supported by the SDK. Setting persistence to false.");
        this.f23774b = false;
        return null;
    }

    private AlgorithmParameterSpec l(String str) throws Exception {
        String str2 = str + f23769t;
        if (this.f23776d.contains(str2)) {
            String string = this.f23776d.getString(str2, null);
            if (string != null) {
                byte[] b4 = Base64.b(string);
                if (b4 != null && b4.length != 0) {
                    return h(b4);
                }
                throw new Exception("Cannot base64 decode the initialization vector for " + str + " read from SharedPreferences.");
            }
            throw new Exception("Cannot read the initialization vector for " + str + " from SharedPreferences.");
        }
        throw new Exception("Initialization vector for " + str + " is missing from the SharedPreferences.");
    }

    private void m() {
        int i4 = this.f23781i;
        if (i4 >= 23) {
            this.f23779g = new d();
            return;
        }
        if (i4 >= 18) {
            this.f23779g = new c(this.f23775c, this.f23778f);
            return;
        }
        if (i4 >= 10) {
            this.f23779g = new b(this.f23778f);
            return;
        }
        f23759j.n("API Level " + String.valueOf(Build.VERSION.SDK_INT) + " not supported by the SDK. Setting persistence to false.");
        this.f23774b = false;
    }

    private void n() {
        Map<String, ?> all = this.f23776d.getAll();
        for (String str : all.keySet()) {
            if (!str.endsWith(f23768s) && !str.endsWith(f23769t) && !str.endsWith(f23770u)) {
                if (all.get(str) instanceof Long) {
                    o(str, String.valueOf(Long.valueOf(this.f23776d.getLong(str, 0L))));
                } else if (all.get(str) instanceof String) {
                    o(str, this.f23776d.getString(str, null));
                } else if (all.get(str) instanceof Float) {
                    o(str, String.valueOf(Float.valueOf(this.f23776d.getFloat(str, 0.0f))));
                } else if (all.get(str) instanceof Boolean) {
                    o(str, String.valueOf(Boolean.valueOf(this.f23776d.getBoolean(str, false))));
                } else if (all.get(str) instanceof Integer) {
                    o(str, String.valueOf(Integer.valueOf(this.f23776d.getInt(str, 0))));
                } else if (all.get(str) instanceof Set) {
                    Set set = (Set) all.get(str);
                    StringBuilder sb = new StringBuilder();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        if (it.hasNext()) {
                            sb.append(",");
                        }
                    }
                    o(str, sb.toString());
                }
                this.f23776d.edit().remove(str).apply();
            }
        }
    }

    private synchronized Key q(String str) {
        try {
        } catch (KeyNotFoundException e4) {
            com.amazonaws.logging.c cVar = f23759j;
            cVar.n(e4);
            cVar.i("Deleting the encryption key identified by the keyAlias: " + str);
            this.f23779g.b(str);
            return null;
        }
        return this.f23779g.a(str);
    }

    public synchronized void a() {
        this.f23773a.clear();
        if (this.f23774b) {
            this.f23776d.edit().clear().apply();
        }
    }

    public synchronized boolean b(String str) {
        if (this.f23774b) {
            return this.f23776d.contains(j(str));
        }
        return this.f23773a.containsKey(str);
    }

    synchronized Key e(String str) {
        try {
        } catch (KeyNotGeneratedException e4) {
            f23759j.l("Encryption Key cannot be generated successfully.", e4);
            return null;
        }
        return this.f23779g.c(str);
    }

    public synchronized String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f23774b) {
            return this.f23773a.get(str);
        }
        String j4 = j(str);
        Key q4 = q(k());
        if (q4 == null) {
            f23759j.n("Error in retrieving the decryption key used to decrypt the data from the persistent store. Returning null for the requested dataKey = " + str);
            return null;
        }
        if (!this.f23776d.contains(j4)) {
            return null;
        }
        try {
            if (Integer.parseInt(this.f23776d.getString(j4 + f23770u, null)) != 1) {
                f23759j.n("The version of the data read from SharedPreferences for " + str + " does not match the version of the store.");
                return null;
            }
            String c4 = c(q4, l(j4), this.f23776d.getString(j4, null));
            this.f23773a.put(str, c4);
            return c4;
        } catch (Exception e4) {
            f23759j.l("Error in retrieving value for dataKey = " + str, e4);
            p(str);
            return null;
        }
    }

    public synchronized void o(String str, String str2) {
        byte[] f4;
        if (str == null) {
            f23759j.n("dataKey is null.");
            return;
        }
        this.f23773a.put(str, str2);
        if (!this.f23774b) {
            return;
        }
        if (str2 == null) {
            f23759j.a("Value is null. Removing the data, IV and version from SharedPreferences");
            this.f23773a.remove(str);
            p(str);
            return;
        }
        String j4 = j(str);
        String k4 = k();
        Key q4 = q(k4);
        if (q4 == null) {
            com.amazonaws.logging.c cVar = f23759j;
            cVar.m("No encryption key found for encryptionKeyAlias: " + k4);
            Key e4 = e(k4);
            if (e4 == null) {
                cVar.n("Error in generating the encryption key for encryptionKeyAlias: " + k4 + " used to encrypt the data before storing. Skipping persisting the data in the persistent store.");
                return;
            }
            q4 = e4;
        }
        try {
            f4 = f();
        } catch (Exception e5) {
            f23759j.l("Error in storing value for dataKey = " + str + ". This data has not been stored in the persistent store.", e5);
        }
        if (f4 != null) {
            String d4 = d(q4, h(f4), str2);
            String g4 = Base64.g(f4);
            if (g4 != null) {
                this.f23776d.edit().putString(j4, d4).putString(j4 + f23769t, g4).putString(j4 + f23770u, String.valueOf(1)).apply();
                return;
            }
            throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
        }
        throw new Exception("The generated IV for dataKey = " + str + " is null.");
    }

    public synchronized void p(String str) {
        this.f23773a.remove(str);
        if (this.f23774b) {
            String j4 = j(str);
            this.f23776d.edit().remove(j4).remove(j4 + f23769t).remove(j4 + f23770u).apply();
        }
    }

    public synchronized void r(boolean z3) {
        try {
            try {
                boolean z4 = this.f23774b;
                this.f23774b = z3;
                if (z3 && !z4) {
                    this.f23776d = this.f23775c.getSharedPreferences(this.f23777e, 0);
                    this.f23778f = this.f23775c.getSharedPreferences(this.f23777e + f23771v, 0);
                    m();
                    com.amazonaws.logging.c cVar = f23759j;
                    cVar.i("Detected Android API Level = " + this.f23781i);
                    cVar.i("Creating the AWSKeyValueStore with key for sharedPreferencesForData = " + this.f23777e);
                    n();
                } else if (!z3) {
                    f23759j.i("Persistence is disabled. Data will be accessed from memory.");
                }
                if (!z3 && z4) {
                    this.f23776d.edit().clear().apply();
                }
            } catch (Exception e4) {
                f23759j.l("Error in enabling persistence for " + this.f23777e, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
