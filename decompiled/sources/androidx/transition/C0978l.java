package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0978l extends u0 {

    /* renamed from: d, reason: collision with root package name */
    private float f20103d = 3.0f;

    private static float h(float f4, float f5, float f6, float f7) {
        float f8 = f6 - f4;
        float f9 = f7 - f5;
        return (float) Math.sqrt((f8 * f8) + (f9 * f9));
    }

    @Override // androidx.transition.N
    public long c(ViewGroup viewGroup, J j4, S s4, S s5) {
        int i4;
        int round;
        int i5;
        if (s4 == null && s5 == null) {
            return 0L;
        }
        if (s5 != null && e(s4) != 0) {
            s4 = s5;
            i4 = 1;
        } else {
            i4 = -1;
        }
        int f4 = f(s4);
        int g4 = g(s4);
        Rect L3 = j4.L();
        if (L3 != null) {
            i5 = L3.centerX();
            round = L3.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i5 = round2;
        }
        float h4 = h(f4, g4, i5, round) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long K3 = j4.K();
        if (K3 < 0) {
            K3 = 300;
        }
        return Math.round((((float) (K3 * i4)) / this.f20103d) * h4);
    }

    public void i(float f4) {
        if (f4 != 0.0f) {
            this.f20103d = f4;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
