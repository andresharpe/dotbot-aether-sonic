package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.D;

/* renamed from: androidx.transition.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0979m extends t0 {

    /* renamed from: H0, reason: collision with root package name */
    private static final TimeInterpolator f20104H0 = new DecelerateInterpolator();

    /* renamed from: I0, reason: collision with root package name */
    private static final TimeInterpolator f20105I0 = new AccelerateInterpolator();

    /* renamed from: J0, reason: collision with root package name */
    private static final String f20106J0 = "android:explode:screenBounds";

    /* renamed from: G0, reason: collision with root package name */
    private int[] f20107G0;

    public C0979m() {
        this.f20107G0 = new int[2];
        A0(new C0978l());
    }

    private void E0(S s4) {
        View view = s4.f19960b;
        view.getLocationOnScreen(this.f20107G0);
        int[] iArr = this.f20107G0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        s4.f19959a.put(f20106J0, new Rect(i4, i5, view.getWidth() + i4, view.getHeight() + i5));
    }

    private static float N0(float f4, float f5) {
        return (float) Math.sqrt((f4 * f4) + (f5 * f5));
    }

    private static float O0(View view, int i4, int i5) {
        return N0(Math.max(i4, view.getWidth() - i4), Math.max(i5, view.getHeight() - i5));
    }

    private void P0(View view, Rect rect, int[] iArr) {
        int centerY;
        int i4;
        view.getLocationOnScreen(this.f20107G0);
        int[] iArr2 = this.f20107G0;
        int i5 = iArr2[0];
        int i6 = iArr2[1];
        Rect L3 = L();
        if (L3 == null) {
            i4 = (view.getWidth() / 2) + i5 + Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i6 + Math.round(view.getTranslationY());
        } else {
            int centerX = L3.centerX();
            centerY = L3.centerY();
            i4 = centerX;
        }
        float centerX2 = rect.centerX() - i4;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float N02 = N0(centerX2, centerY2);
        float O02 = O0(view, i4 - i5, centerY - i6);
        iArr[0] = Math.round((centerX2 / N02) * O02);
        iArr[1] = Math.round(O02 * (centerY2 / N02));
    }

    @Override // androidx.transition.t0
    @androidx.annotation.P
    public Animator I0(ViewGroup viewGroup, View view, S s4, S s5) {
        if (s5 == null) {
            return null;
        }
        Rect rect = (Rect) s5.f19959a.get(f20106J0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        P0(viewGroup, rect, this.f20107G0);
        int[] iArr = this.f20107G0;
        return U.a(view, s5, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f20104H0, this);
    }

    @Override // androidx.transition.t0
    @androidx.annotation.P
    public Animator K0(ViewGroup viewGroup, View view, S s4, S s5) {
        float f4;
        float f5;
        if (s4 == null) {
            return null;
        }
        Rect rect = (Rect) s4.f19959a.get(f20106J0);
        int i4 = rect.left;
        int i5 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) s4.f19960b.getTag(D.g.f19191T1);
        if (iArr != null) {
            f4 = (r7 - rect.left) + translationX;
            f5 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f4 = translationX;
            f5 = translationY;
        }
        P0(viewGroup, rect, this.f20107G0);
        int[] iArr2 = this.f20107G0;
        return U.a(view, s4, i4, i5, translationX, translationY, f4 + iArr2[0], f5 + iArr2[1], f20105I0, this);
    }

    @Override // androidx.transition.t0, androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        super.l(s4);
        E0(s4);
    }

    @Override // androidx.transition.t0, androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        super.p(s4);
        E0(s4);
    }

    public C0979m(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20107G0 = new int[2];
        A0(new C0978l());
    }
}
