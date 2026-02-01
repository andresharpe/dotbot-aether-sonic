package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0633j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12166a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12167b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12168c = -2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface a {
    }

    private K() {
    }

    public static int a(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int b(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.P String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@androidx.annotation.N Context context, @androidx.annotation.N String str, int i4, int i5, @androidx.annotation.P String str2) {
        int e4;
        if (context.checkPermission(str, i4, i5) == -1) {
            return -1;
        }
        String f4 = C0633j.f(str);
        if (f4 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i5 && androidx.core.util.p.a(packageName, str2)) {
            e4 = C0633j.a(context, i5, f4, str2);
        } else {
            e4 = C0633j.e(context, f4, str2);
        }
        if (e4 == 0) {
            return 0;
        }
        return -2;
    }

    public static int d(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
