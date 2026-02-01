package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.view.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13612a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13613b = 1;

    @androidx.annotation.W(18)
    /* renamed from: androidx.core.view.n0$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @InterfaceC0577u
        static void b(ViewGroup viewGroup, int i4) {
            viewGroup.setLayoutMode(i4);
        }
    }

    @androidx.annotation.W(21)
    /* renamed from: androidx.core.view.n0$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @InterfaceC0577u
        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @InterfaceC0577u
        static void c(ViewGroup viewGroup, boolean z3) {
            viewGroup.setTransitionGroup(z3);
        }
    }

    private C0835n0() {
    }

    public static int a(@androidx.annotation.N ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static int b(@androidx.annotation.N ViewGroup viewGroup) {
        return b.a(viewGroup);
    }

    public static boolean c(@androidx.annotation.N ViewGroup viewGroup) {
        return b.b(viewGroup);
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@androidx.annotation.N ViewGroup viewGroup, int i4) {
        a.b(viewGroup, i4);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z3) {
        viewGroup.setMotionEventSplittingEnabled(z3);
    }

    public static void g(@androidx.annotation.N ViewGroup viewGroup, boolean z3) {
        b.c(viewGroup, z3);
    }
}
