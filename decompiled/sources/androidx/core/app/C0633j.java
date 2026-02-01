package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.core.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11953a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11954b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11955c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11956d = 3;

    @androidx.annotation.W(19)
    /* renamed from: androidx.core.app.j$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(AppOpsManager appOpsManager, String str, int i4, String str2) {
            return appOpsManager.noteOp(str, i4, str2);
        }

        @InterfaceC0577u
        static int b(AppOpsManager appOpsManager, String str, int i4, String str2) {
            return appOpsManager.noteOpNoThrow(str, i4, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(23)
    /* renamed from: androidx.core.app.j$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @InterfaceC0577u
        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @InterfaceC0577u
        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @InterfaceC0577u
        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.app.j$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(@androidx.annotation.P AppOpsManager appOpsManager, @androidx.annotation.N String str, int i4, @androidx.annotation.N String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i4, str2);
        }

        @InterfaceC0577u
        @androidx.annotation.N
        static String b(@androidx.annotation.N Context context) {
            return context.getOpPackageName();
        }

        @androidx.annotation.P
        @InterfaceC0577u
        static AppOpsManager c(@androidx.annotation.N Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private C0633j() {
    }

    public static int a(@androidx.annotation.N Context context, int i4, @androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c4 = c.c(context);
            int a4 = c.a(c4, str, Binder.getCallingUid(), str2);
            if (a4 != 0) {
                return a4;
            }
            return c.a(c4, str, i4, c.b(context));
        }
        return e(context, str, str2);
    }

    public static int b(@androidx.annotation.N Context context, @androidx.annotation.N String str, int i4, @androidx.annotation.N String str2) {
        return a.a((AppOpsManager) context.getSystemService("appops"), str, i4, str2);
    }

    public static int c(@androidx.annotation.N Context context, @androidx.annotation.N String str, int i4, @androidx.annotation.N String str2) {
        return a.b((AppOpsManager) context.getSystemService("appops"), str, i4, str2);
    }

    public static int d(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.N String str2) {
        return b.b((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    public static int e(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.N String str2) {
        return b.c((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
    }

    @androidx.annotation.P
    public static String f(@androidx.annotation.N String str) {
        return b.d(str);
    }
}
