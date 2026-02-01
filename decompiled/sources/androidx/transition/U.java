package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.D;
import androidx.transition.J;

/* loaded from: classes.dex */
class U {

    /* loaded from: classes.dex */
    private static class a extends AnimatorListenerAdapter implements J.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f19966a;

        /* renamed from: b, reason: collision with root package name */
        private final View f19967b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19968c;

        /* renamed from: d, reason: collision with root package name */
        private final int f19969d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f19970e;

        /* renamed from: f, reason: collision with root package name */
        private float f19971f;

        /* renamed from: g, reason: collision with root package name */
        private float f19972g;

        /* renamed from: h, reason: collision with root package name */
        private final float f19973h;

        /* renamed from: i, reason: collision with root package name */
        private final float f19974i;

        a(View view, View view2, int i4, int i5, float f4, float f5) {
            this.f19967b = view;
            this.f19966a = view2;
            this.f19968c = i4 - Math.round(view.getTranslationX());
            this.f19969d = i5 - Math.round(view.getTranslationY());
            this.f19973h = f4;
            this.f19974i = f5;
            int[] iArr = (int[]) view2.getTag(D.g.f19191T1);
            this.f19970e = iArr;
            if (iArr != null) {
                view2.setTag(D.g.f19191T1, null);
            }
        }

        @Override // androidx.transition.J.h
        public void a(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void b(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            this.f19967b.setTranslationX(this.f19973h);
            this.f19967b.setTranslationY(this.f19974i);
            j4.m0(this);
        }

        @Override // androidx.transition.J.h
        public void d(@androidx.annotation.N J j4) {
        }

        @Override // androidx.transition.J.h
        public void e(@androidx.annotation.N J j4) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f19970e == null) {
                this.f19970e = new int[2];
            }
            this.f19970e[0] = Math.round(this.f19968c + this.f19967b.getTranslationX());
            this.f19970e[1] = Math.round(this.f19969d + this.f19967b.getTranslationY());
            this.f19966a.setTag(D.g.f19191T1, this.f19970e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f19971f = this.f19967b.getTranslationX();
            this.f19972g = this.f19967b.getTranslationY();
            this.f19967b.setTranslationX(this.f19973h);
            this.f19967b.setTranslationY(this.f19974i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f19967b.setTranslationX(this.f19971f);
            this.f19967b.setTranslationY(this.f19972g);
        }
    }

    private U() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static Animator a(@androidx.annotation.N View view, @androidx.annotation.N S s4, int i4, int i5, float f4, float f5, float f6, float f7, @androidx.annotation.P TimeInterpolator timeInterpolator, @androidx.annotation.N J j4) {
        float f8;
        float f9;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) s4.f19960b.getTag(D.g.f19191T1)) != null) {
            f8 = (r7[0] - i4) + translationX;
            f9 = (r7[1] - i5) + translationY;
        } else {
            f8 = f4;
            f9 = f5;
        }
        int round = Math.round(f8 - translationX) + i4;
        int round2 = i5 + Math.round(f9 - translationY);
        view.setTranslationX(f8);
        view.setTranslationY(f9);
        if (f8 == f6 && f9 == f7) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f8, f6), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f9, f7));
        a aVar = new a(view, s4.f19960b, round, round2, translationX, translationY);
        j4.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C0967a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
