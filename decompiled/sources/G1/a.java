package G1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.i0;
import androidx.core.content.C0669d;
import com.google.firebase.b;
import y1.C2444a;
import y1.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f573e = "com.google.firebase.common.prefs:";

    /* renamed from: f, reason: collision with root package name */
    @i0
    public static final String f574f = "firebase_data_collection_default_enabled";

    /* renamed from: a, reason: collision with root package name */
    private final Context f575a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f576b;

    /* renamed from: c, reason: collision with root package name */
    private final c f577c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f578d;

    public a(Context context, String str, c cVar) {
        Context a4 = a(context);
        this.f575a = a4;
        this.f576b = a4.getSharedPreferences(f573e + str, 0);
        this.f577c = cVar;
        this.f578d = c();
    }

    private static Context a(Context context) {
        return C0669d.b(context);
    }

    private boolean c() {
        if (this.f576b.contains(f574f)) {
            return this.f576b.getBoolean(f574f, true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f575a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f575a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f574f)) {
                return applicationInfo.metaData.getBoolean(f574f);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z3) {
        if (this.f578d != z3) {
            this.f578d = z3;
            this.f577c.a(new C2444a<>(b.class, new b(z3)));
        }
    }

    public synchronized boolean b() {
        return this.f578d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f576b.edit().remove(f574f).apply();
                f(d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f576b.edit().putBoolean(f574f, equals).apply();
                f(equals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
