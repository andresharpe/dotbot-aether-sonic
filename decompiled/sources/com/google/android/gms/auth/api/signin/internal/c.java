package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

@I0.a
/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f27880c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    @P
    @GuardedBy("sLk")
    private static c f27881d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f27882a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("mLk")
    private final SharedPreferences f27883b;

    @D
    c(Context context) {
        this.f27883b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @I0.a
    @N
    public static c b(@N Context context) {
        C1285y.l(context);
        Lock lock = f27880c;
        lock.lock();
        try {
            if (f27881d == null) {
                f27881d = new c(context.getApplicationContext());
            }
            c cVar = f27881d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f27880c.unlock();
            throw th;
        }
    }

    private static final String k(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @I0.a
    public void a() {
        this.f27882a.lock();
        try {
            this.f27883b.edit().clear().apply();
        } finally {
            this.f27882a.unlock();
        }
    }

    @P
    @I0.a
    public GoogleSignInAccount c() {
        String g4;
        String g5 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g5) || (g4 = g(k("googleSignInAccount", g5))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.i1(g4);
        } catch (JSONException unused) {
            return null;
        }
    }

    @P
    @I0.a
    public GoogleSignInOptions d() {
        String g4;
        String g5 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g5) || (g4 = g(k("googleSignInOptions", g5))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.F0(g4);
        } catch (JSONException unused) {
            return null;
        }
    }

    @P
    @I0.a
    public String e() {
        return g("refreshToken");
    }

    @I0.a
    public void f(@N GoogleSignInAccount googleSignInAccount, @N GoogleSignInOptions googleSignInOptions) {
        C1285y.l(googleSignInAccount);
        C1285y.l(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.j1());
        C1285y.l(googleSignInAccount);
        C1285y.l(googleSignInOptions);
        String j12 = googleSignInAccount.j1();
        j(k("googleSignInAccount", j12), googleSignInAccount.k1());
        j(k("googleSignInOptions", j12), googleSignInOptions.f1());
    }

    @P
    protected final String g(@N String str) {
        this.f27882a.lock();
        try {
            return this.f27883b.getString(str, null);
        } finally {
            this.f27882a.unlock();
        }
    }

    protected final void h(@N String str) {
        this.f27882a.lock();
        try {
            this.f27883b.edit().remove(str).apply();
        } finally {
            this.f27882a.unlock();
        }
    }

    public final void i() {
        String g4 = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g4)) {
            return;
        }
        h(k("googleSignInAccount", g4));
        h(k("googleSignInOptions", g4));
    }

    protected final void j(@N String str, @N String str2) {
        this.f27882a.lock();
        try {
            this.f27883b.edit().putString(str, str2).apply();
        } finally {
            this.f27882a.unlock();
        }
    }
}
