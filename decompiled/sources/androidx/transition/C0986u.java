package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0986u {
    private C0986u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static InterfaceC0983q a(@androidx.annotation.N View view, @androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C0984s.b(view, viewGroup, matrix);
        }
        return C0985t.b(view, viewGroup, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C0984s.f(view);
        } else {
            C0985t.f(view);
        }
    }
}
