package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

@androidx.annotation.W(23)
/* loaded from: classes.dex */
class q0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    private static boolean f20139m = true;

    @Override // androidx.transition.s0
    @SuppressLint({"NewApi"})
    public void h(@androidx.annotation.N View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i4);
        } else if (f20139m) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f20139m = false;
            }
        }
    }
}
