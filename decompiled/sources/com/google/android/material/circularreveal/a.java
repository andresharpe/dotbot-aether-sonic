package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.N;
import com.google.android.material.circularreveal.g;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.google.android.material.circularreveal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0281a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f31892a;

        C0281a(g gVar) {
            this.f31892a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31892a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f31892a.a();
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public static Animator a(@N g gVar, float f4, float f5, float f6) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(gVar, (Property<g, V>) g.c.f31914a, (TypeEvaluator) g.b.f31912b, (Object[]) new g.e[]{new g.e(f4, f5, f6)});
        g.e revealInfo = gVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f4, (int) f5, revealInfo.f31919c, f6);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public static Animator b(g gVar, float f4, float f5, float f6, float f7) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(gVar, (Property<g, V>) g.c.f31914a, (TypeEvaluator) g.b.f31912b, (Object[]) new g.e[]{new g.e(f4, f5, f6), new g.e(f4, f5, f7)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f4, (int) f5, f6, f7);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @N
    public static Animator.AnimatorListener c(@N g gVar) {
        return new C0281a(gVar);
    }
}
