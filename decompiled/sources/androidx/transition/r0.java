package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

@androidx.annotation.W(ConstraintLayout.b.a.f9571D)
/* loaded from: classes.dex */
class r0 extends q0 {
    @Override // androidx.transition.i0, androidx.transition.s0
    public float c(@androidx.annotation.N View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.m0, androidx.transition.s0
    public void e(@androidx.annotation.N View view, @androidx.annotation.P Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.o0, androidx.transition.s0
    public void f(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // androidx.transition.i0, androidx.transition.s0
    public void g(@androidx.annotation.N View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // androidx.transition.q0, androidx.transition.s0
    public void h(@androidx.annotation.N View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // androidx.transition.m0, androidx.transition.s0
    public void i(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.m0, androidx.transition.s0
    public void j(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
