package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

@androidx.annotation.W(19)
/* loaded from: classes.dex */
class i0 extends s0 {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f20063h = true;

    @Override // androidx.transition.s0
    public void a(@androidx.annotation.N View view) {
    }

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public float c(@androidx.annotation.N View view) {
        float transitionAlpha;
        if (f20063h) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f20063h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.s0
    public void d(@androidx.annotation.N View view) {
    }

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public void g(@androidx.annotation.N View view, float f4) {
        if (f20063h) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f20063h = false;
            }
        }
        view.setAlpha(f4);
    }
}
