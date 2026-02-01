package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.InterfaceC0568k;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;

/* renamed from: androidx.core.os.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0738a {

    @RequiresOptIn
    /* renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0093a {
    }

    private C0738a() {
    }

    @InterfaceC0568k(api = 24)
    @Deprecated
    public static boolean a() {
        return true;
    }

    @InterfaceC0568k(api = 25)
    @Deprecated
    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    @InterfaceC0568k(api = 26)
    @Deprecated
    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @InterfaceC0568k(api = 27)
    @Deprecated
    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    @InterfaceC0568k(api = 28)
    @Deprecated
    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    protected static boolean f(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @InterfaceC0568k(api = ConstraintLayout.b.a.f9571D)
    @Deprecated
    public static boolean g() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @InterfaceC0568k(api = 30)
    @Deprecated
    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    @InterfaceC0568k(api = ConstraintLayout.b.a.f9573F, codename = androidx.exifinterface.media.a.T4)
    @Deprecated
    public static boolean i() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31 && (i4 < 30 || !f(androidx.exifinterface.media.a.T4, Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @InterfaceC0093a
    @InterfaceC0568k(api = 32, codename = "Sv2")
    @Deprecated
    public static boolean j() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 32 && (i4 < 31 || !f("Sv2", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @InterfaceC0093a
    @InterfaceC0568k(api = 33, codename = "Tiramisu")
    public static boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33 && (i4 < 32 || !f("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    @InterfaceC0093a
    @InterfaceC0568k(codename = "UpsideDownCake")
    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 33 && f("UpsideDownCake", Build.VERSION.CODENAME)) {
            return true;
        }
        return false;
    }
}
