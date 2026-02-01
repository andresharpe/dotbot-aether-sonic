package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.N;
import androidx.core.util.q;
import com.google.android.gms.common.util.v;

@I0.a
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @N
    protected final Context f29033a;

    public d(@N Context context) {
        this.f29033a = context;
    }

    @I0.a
    public int a(@N String str) {
        return this.f29033a.checkCallingOrSelfPermission(str);
    }

    @I0.a
    public int b(@N String str, @N String str2) {
        return this.f29033a.getPackageManager().checkPermission(str, str2);
    }

    @I0.a
    @N
    public ApplicationInfo c(@N String str, int i4) throws PackageManager.NameNotFoundException {
        return this.f29033a.getPackageManager().getApplicationInfo(str, i4);
    }

    @I0.a
    @N
    public CharSequence d(@N String str) throws PackageManager.NameNotFoundException {
        return this.f29033a.getPackageManager().getApplicationLabel(this.f29033a.getPackageManager().getApplicationInfo(str, 0));
    }

    @I0.a
    @N
    public q<CharSequence, Drawable> e(@N String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f29033a.getPackageManager().getApplicationInfo(str, 0);
        return q.a(this.f29033a.getPackageManager().getApplicationLabel(applicationInfo), this.f29033a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @I0.a
    @N
    public PackageInfo f(@N String str, int i4) throws PackageManager.NameNotFoundException {
        return this.f29033a.getPackageManager().getPackageInfo(str, i4);
    }

    @I0.a
    public boolean g() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f29033a);
        }
        if (v.n() && (nameForUid = this.f29033a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.f29033a.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @TargetApi(19)
    public final boolean h(int i4, @N String str) {
        if (v.h()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f29033a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i4, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f29033a.getPackageManager().getPackagesForUid(i4);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
