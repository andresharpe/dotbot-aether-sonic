package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f34382a;

    /* renamed from: b, reason: collision with root package name */
    private float f34383b;

    /* renamed from: c, reason: collision with root package name */
    private float f34384c;

    /* renamed from: d, reason: collision with root package name */
    private float f34385d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34386e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34387f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34390c;

        a(View view, float f4, float f5) {
            this.f34388a = view;
            this.f34389b = f4;
            this.f34390c = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34388a.setScaleX(this.f34389b);
            this.f34388a.setScaleY(this.f34390c);
        }
    }

    public r() {
        this(true);
    }

    private static Animator c(View view, float f4, float f5) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f4, scaleX * f5), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f4 * scaleY, f5 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.v
    @P
    public Animator a(@N ViewGroup viewGroup, @N View view) {
        if (this.f34386e) {
            return c(view, this.f34384c, this.f34385d);
        }
        return c(view, this.f34383b, this.f34382a);
    }

    @Override // com.google.android.material.transition.v
    @P
    public Animator b(@N ViewGroup viewGroup, @N View view) {
        if (!this.f34387f) {
            return null;
        }
        if (this.f34386e) {
            return c(view, this.f34382a, this.f34383b);
        }
        return c(view, this.f34385d, this.f34384c);
    }

    public float d() {
        return this.f34385d;
    }

    public float e() {
        return this.f34384c;
    }

    public float f() {
        return this.f34383b;
    }

    public float g() {
        return this.f34382a;
    }

    public boolean h() {
        return this.f34386e;
    }

    public boolean i() {
        return this.f34387f;
    }

    public void j(boolean z3) {
        this.f34386e = z3;
    }

    public void k(float f4) {
        this.f34385d = f4;
    }

    public void l(float f4) {
        this.f34384c = f4;
    }

    public void m(float f4) {
        this.f34383b = f4;
    }

    public void n(float f4) {
        this.f34382a = f4;
    }

    public void o(boolean z3) {
        this.f34387f = z3;
    }

    public r(boolean z3) {
        this.f34382a = 1.0f;
        this.f34383b = 1.1f;
        this.f34384c = 0.8f;
        this.f34385d = 1.0f;
        this.f34387f = true;
        this.f34386e = z3;
    }
}
