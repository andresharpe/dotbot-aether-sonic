package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.InterfaceC0568k;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.C0738a;

@I0.a
@D
/* loaded from: classes.dex */
public final class v {
    private v() {
    }

    @I0.a
    @InterfaceC0568k(api = 11)
    public static boolean a() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 12)
    public static boolean b() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 14)
    public static boolean c() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 15)
    public static boolean d() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 16)
    public static boolean e() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 17)
    public static boolean f() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 18)
    public static boolean g() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 19)
    public static boolean h() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 20)
    public static boolean i() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 21)
    public static boolean j() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 22)
    public static boolean k() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 23)
    public static boolean l() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 24)
    public static boolean m() {
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 26)
    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @I0.a
    @InterfaceC0568k(api = 28)
    public static boolean o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @I0.a
    @InterfaceC0568k(api = ConstraintLayout.b.a.f9571D)
    public static boolean p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @I0.a
    @InterfaceC0568k(api = 30)
    public static boolean q() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @I0.a
    @InterfaceC0568k(api = ConstraintLayout.b.a.f9573F)
    public static boolean r() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @I0.a
    @InterfaceC0568k(api = 32)
    public static boolean s() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @I0.a
    @InterfaceC0568k(api = 33)
    public static boolean t() {
        if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
            return false;
        }
        return true;
    }

    @I0.a
    @InterfaceC0568k(api = 33, codename = "UpsideDownCake")
    public static boolean u() {
        if (!t()) {
            return false;
        }
        return C0738a.l();
    }
}
