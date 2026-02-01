package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.view.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13638a = "ViewParentCompat";

    /* renamed from: b, reason: collision with root package name */
    private static int[] f13639b;

    @androidx.annotation.W(19)
    /* renamed from: androidx.core.view.r0$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(ViewParent viewParent, View view, View view2, int i4) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(21)
    /* renamed from: androidx.core.view.r0$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static boolean a(ViewParent viewParent, View view, float f4, float f5, boolean z3) {
            return viewParent.onNestedFling(view, f4, f5, z3);
        }

        @InterfaceC0577u
        static boolean b(ViewParent viewParent, View view, float f4, float f5) {
            return viewParent.onNestedPreFling(view, f4, f5);
        }

        @InterfaceC0577u
        static void c(ViewParent viewParent, View view, int i4, int i5, int[] iArr) {
            viewParent.onNestedPreScroll(view, i4, i5, iArr);
        }

        @InterfaceC0577u
        static void d(ViewParent viewParent, View view, int i4, int i5, int i6, int i7) {
            viewParent.onNestedScroll(view, i4, i5, i6, i7);
        }

        @InterfaceC0577u
        static void e(ViewParent viewParent, View view, View view2, int i4) {
            viewParent.onNestedScrollAccepted(view, view2, i4);
        }

        @InterfaceC0577u
        static boolean f(ViewParent viewParent, View view, View view2, int i4) {
            return viewParent.onStartNestedScroll(view, view2, i4);
        }

        @InterfaceC0577u
        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private C0846r0() {
    }

    private static int[] a() {
        int[] iArr = f13639b;
        if (iArr == null) {
            f13639b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f13639b;
    }

    public static void b(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, @androidx.annotation.N View view2, int i4) {
        a.a(viewParent, view, view2, i4);
    }

    public static boolean c(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, float f4, float f5, boolean z3) {
        try {
            return b.a(viewParent, view, f4, f5, z3);
        } catch (AbstractMethodError e4) {
            Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public static boolean d(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, float f4, float f5) {
        try {
            return b.b(viewParent, view, f4, f5);
        } catch (AbstractMethodError e4) {
            Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public static void e(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, int i4, int i5, @androidx.annotation.N int[] iArr) {
        f(viewParent, view, i4, i5, iArr, 0);
    }

    public static void f(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, int i4, int i5, @androidx.annotation.N int[] iArr, int i6) {
        if (viewParent instanceof W) {
            ((W) viewParent).v(view, i4, i5, iArr, i6);
            return;
        }
        if (i6 == 0) {
            try {
                b.c(viewParent, view, i4, i5, iArr);
            } catch (AbstractMethodError e4) {
                Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e4);
            }
        }
    }

    public static void g(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        i(viewParent, view, i4, i5, i6, i7, 0, a());
    }

    public static void h(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, int i4, int i5, int i6, int i7, int i8) {
        i(viewParent, view, i4, i5, i6, i7, i8, a());
    }

    public static void i(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, int i4, int i5, int i6, int i7, int i8, @androidx.annotation.N int[] iArr) {
        if (viewParent instanceof X) {
            ((X) viewParent).e(view, i4, i5, i6, i7, i8, iArr);
            return;
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (viewParent instanceof W) {
            ((W) viewParent).r(view, i4, i5, i6, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                b.d(viewParent, view, i4, i5, i6, i7);
            } catch (AbstractMethodError e4) {
                Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e4);
            }
        }
    }

    public static void j(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, @androidx.annotation.N View view2, int i4) {
        k(viewParent, view, view2, i4, 0);
    }

    public static void k(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, @androidx.annotation.N View view2, int i4, int i5) {
        if (viewParent instanceof W) {
            ((W) viewParent).t(view, view2, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                b.e(viewParent, view, view2, i4);
            } catch (AbstractMethodError e4) {
                Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e4);
            }
        }
    }

    public static boolean l(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, @androidx.annotation.N View view2, int i4) {
        return m(viewParent, view, view2, i4, 0);
    }

    public static boolean m(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, @androidx.annotation.N View view2, int i4, int i5) {
        if (viewParent instanceof W) {
            return ((W) viewParent).s(view, view2, i4, i5);
        }
        if (i5 == 0) {
            try {
                return b.f(viewParent, view, view2, i4);
            } catch (AbstractMethodError e4) {
                Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e4);
                return false;
            }
        }
        return false;
    }

    public static void n(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view) {
        o(viewParent, view, 0);
    }

    public static void o(@androidx.annotation.N ViewParent viewParent, @androidx.annotation.N View view, int i4) {
        if (viewParent instanceof W) {
            ((W) viewParent).u(view, i4);
            return;
        }
        if (i4 == 0) {
            try {
                b.g(viewParent, view);
            } catch (AbstractMethodError e4) {
                Log.e(f13638a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e4);
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
