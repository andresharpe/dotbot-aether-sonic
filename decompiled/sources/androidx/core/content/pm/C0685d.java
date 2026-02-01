package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.pm.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685d {

    @androidx.annotation.W(28)
    /* renamed from: androidx.core.content.pm.d$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @InterfaceC0577u
        static int b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.content.pm.d$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.content.pm.d$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    private C0685d() {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@androidx.annotation.N PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@androidx.annotation.N PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(permissionInfo);
        }
        return permissionInfo.protectionLevel & (-16);
    }
}
