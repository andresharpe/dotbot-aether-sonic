package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

@androidx.annotation.W(22)
/* loaded from: classes.dex */
class o0 extends m0 {

    /* renamed from: l, reason: collision with root package name */
    private static boolean f20120l = true;

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public void f(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        if (f20120l) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f20120l = false;
            }
        }
    }
}
