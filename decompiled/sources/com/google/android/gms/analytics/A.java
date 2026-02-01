package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzfu;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@com.google.android.gms.common.util.D
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class A {

    /* renamed from: g, reason: collision with root package name */
    private static volatile A f27734g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f27735a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27736b;

    /* renamed from: c, reason: collision with root package name */
    private final p f27737c;

    /* renamed from: d, reason: collision with root package name */
    private final w f27738d;

    /* renamed from: e, reason: collision with root package name */
    private volatile zzax f27739e;

    /* renamed from: f, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f27740f;

    @com.google.android.gms.common.util.D
    A(Context context) {
        Context applicationContext = context.getApplicationContext();
        C1285y.l(applicationContext);
        this.f27735a = applicationContext;
        this.f27738d = new w(this);
        this.f27736b = new CopyOnWriteArrayList();
        this.f27737c = new p();
    }

    public static A b(Context context) {
        C1285y.l(context);
        if (f27734g == null) {
            synchronized (A.class) {
                try {
                    if (f27734g == null) {
                        f27734g = new A(context);
                    }
                } finally {
                }
            }
        }
        return f27734g;
    }

    public static void h() {
        if (Thread.currentThread() instanceof z) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Context a() {
        return this.f27735a;
    }

    public final zzax c() {
        if (this.f27739e == null) {
            synchronized (this) {
                try {
                    if (this.f27739e == null) {
                        zzax zzaxVar = new zzax();
                        PackageManager packageManager = this.f27735a.getPackageManager();
                        String packageName = this.f27735a.getPackageName();
                        zzaxVar.zzi(packageName);
                        zzaxVar.zzj(packageManager.getInstallerPackageName(packageName));
                        String str = null;
                        try {
                            PackageInfo packageInfo = packageManager.getPackageInfo(this.f27735a.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    packageName = applicationLabel.toString();
                                }
                                str = packageInfo.versionName;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            Log.e("GAv4", "Error retrieving package info: appName set to " + packageName);
                        }
                        zzaxVar.zzk(packageName);
                        zzaxVar.zzl(str);
                        this.f27739e = zzaxVar;
                    }
                } finally {
                }
            }
        }
        return this.f27739e;
    }

    public final zzbc d() {
        DisplayMetrics displayMetrics = this.f27735a.getResources().getDisplayMetrics();
        zzbc zzbcVar = new zzbc();
        zzbcVar.zze(zzfu.zzd(Locale.getDefault()));
        zzbcVar.zza = displayMetrics.widthPixels;
        zzbcVar.zzb = displayMetrics.heightPixels;
        return zzbcVar;
    }

    public final Future g(Callable callable) {
        C1285y.l(callable);
        if (Thread.currentThread() instanceof z) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.f27738d.submit(callable);
    }

    public final void i(Runnable runnable) {
        C1285y.l(runnable);
        this.f27738d.submit(runnable);
    }

    public final void j(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f27740f = uncaughtExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(q qVar) {
        if (!qVar.l()) {
            if (!qVar.m()) {
                q qVar2 = new q(qVar);
                qVar2.i();
                this.f27738d.execute(new u(this, qVar2));
                return;
            }
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        throw new IllegalStateException("Measurement prototype can't be submitted");
    }
}
