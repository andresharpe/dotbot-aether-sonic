package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
public final class e implements w {

    /* renamed from: b, reason: collision with root package name */
    static final float f34197b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    private float f34198a = f34197b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34199a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34201c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f34202d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f34203e;

        a(View view, float f4, float f5, float f6, float f7) {
            this.f34199a = view;
            this.f34200b = f4;
            this.f34201c = f5;
            this.f34202d = f6;
            this.f34203e = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34199a.setAlpha(v.l(this.f34200b, this.f34201c, this.f34202d, this.f34203e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34204a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34205b;

        b(View view, float f4) {
            this.f34204a = view;
            this.f34205b = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34204a.setAlpha(this.f34205b);
        }
    }

    private static Animator c(View view, float f4, float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f7, float f8) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f4, f5, f6, f7));
        ofFloat.addListener(new b(view, f8));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.platform.w
    @P
    public Animator a(@N ViewGroup viewGroup, @N View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f4 = alpha;
        return c(view, 0.0f, f4, this.f34198a, 1.0f, f4);
    }

    @Override // com.google.android.material.transition.platform.w
    @P
    public Animator b(@N ViewGroup viewGroup, @N View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f4 = alpha;
        return c(view, f4, 0.0f, 0.0f, this.f34198a, f4);
    }

    public float d() {
        return this.f34198a;
    }

    public void e(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f34198a = f4;
    }
}
