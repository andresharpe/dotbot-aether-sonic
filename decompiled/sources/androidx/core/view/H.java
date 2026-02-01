package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.InterfaceC0577u;

/* loaded from: classes.dex */
public final class H {

    @androidx.annotation.W(17)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @InterfaceC0577u
        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @InterfaceC0577u
        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @InterfaceC0577u
        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @InterfaceC0577u
        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.resolveLayoutDirection(i4);
        }

        @InterfaceC0577u
        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setLayoutDirection(i4);
        }

        @InterfaceC0577u
        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setMarginEnd(i4);
        }

        @InterfaceC0577u
        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setMarginStart(i4);
        }
    }

    private H() {
    }

    public static int a(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams) {
        int a4 = a.a(marginLayoutParams);
        if (a4 != 0 && a4 != 1) {
            return 0;
        }
        return a4;
    }

    public static int b(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int c(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static boolean d(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.d(marginLayoutParams);
    }

    public static void e(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        a.e(marginLayoutParams, i4);
    }

    public static void f(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        a.f(marginLayoutParams, i4);
    }

    public static void g(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        a.g(marginLayoutParams, i4);
    }

    public static void h(@androidx.annotation.N ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        a.h(marginLayoutParams, i4);
    }
}
