package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0669d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class b0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f36872b = "|T|";

    /* renamed from: c, reason: collision with root package name */
    private static final String f36873c = "*";

    /* renamed from: d, reason: collision with root package name */
    static final String f36874d = "com.google.android.gms.appid";

    /* renamed from: e, reason: collision with root package name */
    static final String f36875e = "com.google.android.gms.appid-no-backup";

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f36876a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f36877d = "token";

        /* renamed from: e, reason: collision with root package name */
        private static final String f36878e = "appVersion";

        /* renamed from: f, reason: collision with root package name */
        private static final String f36879f = "timestamp";

        /* renamed from: g, reason: collision with root package name */
        private static final long f36880g = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f36881a;

        /* renamed from: b, reason: collision with root package name */
        final String f36882b;

        /* renamed from: c, reason: collision with root package name */
        final long f36883c;

        private a(String str, String str2, long j4) {
            this.f36881a = str;
            this.f36882b = str2;
            this.f36883c = j4;
        }

        static String a(String str, String str2, long j4) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(f36877d, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(f36879f, j4);
                return jSONObject.toString();
            } catch (JSONException e4) {
                Log.w(C1821f.f36920a, "Failed to encode token: " + e4);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString(f36877d), jSONObject.getString("appVersion"), jSONObject.getLong(f36879f));
                } catch (JSONException e4) {
                    Log.w(C1821f.f36920a, "Failed to parse token: " + e4);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(String str) {
            if (System.currentTimeMillis() <= this.f36883c + f36880g && str.equals(this.f36882b)) {
                return false;
            }
            return true;
        }
    }

    public b0(Context context) {
        this.f36876a = context.getSharedPreferences(f36874d, 0);
        a(context, f36875e);
    }

    private void a(Context context, String str) {
        File file = new File(C0669d.m(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !f()) {
                Log.i(C1821f.f36920a, "App restored, clearing state");
                c();
            }
        } catch (IOException e4) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Error creating file in no backup dir: " + e4.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + f36872b + str2 + "|" + f36873c;
    }

    public synchronized void c() {
        this.f36876a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b4 = b(str, str2);
        SharedPreferences.Editor edit = this.f36876a.edit();
        edit.remove(b4);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f36876a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f36876a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a4 = a.a(str3, str4, System.currentTimeMillis());
        if (a4 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f36876a.edit();
        edit.putString(b(str, str2), a4);
        edit.commit();
    }
}
