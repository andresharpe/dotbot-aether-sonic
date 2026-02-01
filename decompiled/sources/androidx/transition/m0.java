package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

@androidx.annotation.W(21)
/* loaded from: classes.dex */
class m0 extends i0 {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f20108i = true;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f20109j = true;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f20110k = true;

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public void e(@androidx.annotation.N View view, @androidx.annotation.P Matrix matrix) {
        if (f20108i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f20108i = false;
            }
        }
    }

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public void i(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        if (f20109j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f20109j = false;
            }
        }
    }

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public void j(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        if (f20110k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f20110k = false;
            }
        }
    }
}
