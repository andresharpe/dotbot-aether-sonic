package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public final class e implements v {

    /* renamed from: b, reason: collision with root package name */
    static final float f34042b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    private float f34043a = f34042b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34044a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34045b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34046c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f34047d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f34048e;

        a(View view, float f4, float f5, float f6, float f7) {
            this.f34044a = view;
            this.f34045b = f4;
            this.f34046c = f5;
            this.f34047d = f6;
            this.f34048e = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34044a.setAlpha(u.l(this.f34045b, this.f34046c, this.f34047d, this.f34048e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34050b;

        b(View view, float f4) {
            this.f34049a = view;
            this.f34050b = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34049a.setAlpha(this.f34050b);
        }
    }

    private static Animator c(View view, float f4, float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f7, float f8) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f4, f5, f6, f7));
        ofFloat.addListener(new b(view, f8));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.v
    @P
    public Animator a(@N ViewGroup viewGroup, @N View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f4 = alpha;
        return c(view, 0.0f, f4, this.f34043a, 1.0f, f4);
    }

    @Override // com.google.android.material.transition.v
    @P
    public Animator b(@N ViewGroup viewGroup, @N View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f4 = alpha;
        return c(view, f4, 0.0f, 0.0f, this.f34043a, f4);
    }

    public float d() {
        return this.f34043a;
    }

    public void e(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f34043a = f4;
    }
}
