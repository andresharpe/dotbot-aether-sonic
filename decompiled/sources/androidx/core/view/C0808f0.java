package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.view.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(19)
    /* renamed from: androidx.core.view.f0$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @InterfaceC0577u
        static void b(ScaleGestureDetector scaleGestureDetector, boolean z3) {
            scaleGestureDetector.setQuickScaleEnabled(z3);
        }
    }

    private C0808f0() {
    }

    public static boolean a(@androidx.annotation.N ScaleGestureDetector scaleGestureDetector) {
        return a.a(scaleGestureDetector);
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(@androidx.annotation.N ScaleGestureDetector scaleGestureDetector, boolean z3) {
        a.b(scaleGestureDetector, z3);
    }

    @Deprecated
    public static void d(Object obj, boolean z3) {
        c((ScaleGestureDetector) obj, z3);
    }
}
