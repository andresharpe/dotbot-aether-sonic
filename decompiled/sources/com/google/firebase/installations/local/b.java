package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.firebase.e;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36058c = "com.google.android.gms.appid";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36059d = "|S||P|";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36060e = "|S|id";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36061f = "|T|";

    /* renamed from: g, reason: collision with root package name */
    private static final String f36062g = "|";

    /* renamed from: h, reason: collision with root package name */
    private static final String f36063h = "token";

    /* renamed from: i, reason: collision with root package name */
    private static final String f36064i = "{";

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f36065j = {"*", FirebaseMessaging.f36431s, com.google.android.gms.stats.a.f31108u, ""};

    /* renamed from: a, reason: collision with root package name */
    @B("iidPrefs")
    private final SharedPreferences f36066a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36067b;

    public b(@N e eVar) {
        this.f36066a = eVar.n().getSharedPreferences(f36058c, 0);
        this.f36067b = b(eVar);
    }

    private String a(@N String str, @N String str2) {
        return f36061f + str + f36062g + str2;
    }

    private static String b(e eVar) {
        String m4 = eVar.s().m();
        if (m4 != null) {
            return m4;
        }
        String j4 = eVar.s().j();
        if (!j4.startsWith("1:") && !j4.startsWith("2:")) {
            return j4;
        }
        String[] split = j4.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @P
    private static String c(@N PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString(f36063h);
        } catch (JSONException unused) {
            return null;
        }
    }

    @P
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e4) {
            Log.w("ContentValues", "Invalid key stored " + e4);
            return null;
        }
    }

    @P
    private String g() {
        String string;
        synchronized (this.f36066a) {
            string = this.f36066a.getString(f36060e, null);
        }
        return string;
    }

    @P
    private String h() {
        synchronized (this.f36066a) {
            try {
                String string = this.f36066a.getString(f36059d, null);
                if (string == null) {
                    return null;
                }
                PublicKey e4 = e(string);
                if (e4 == null) {
                    return null;
                }
                return c(e4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @P
    public String f() {
        synchronized (this.f36066a) {
            try {
                String g4 = g();
                if (g4 != null) {
                    return g4;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @P
    public String i() {
        synchronized (this.f36066a) {
            try {
                for (String str : f36065j) {
                    String string = this.f36066a.getString(a(this.f36067b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith(f36064i)) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @i0
    public b(@N SharedPreferences sharedPreferences, @P String str) {
        this.f36066a = sharedPreferences;
        this.f36067b = str;
    }
}
