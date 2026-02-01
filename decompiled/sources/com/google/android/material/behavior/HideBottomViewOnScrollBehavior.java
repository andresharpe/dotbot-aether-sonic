package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: e, reason: collision with root package name */
    protected static final int f31437e = 225;

    /* renamed from: f, reason: collision with root package name */
    protected static final int f31438f = 175;

    /* renamed from: g, reason: collision with root package name */
    private static final int f31439g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f31440h = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f31441a;

    /* renamed from: b, reason: collision with root package name */
    private int f31442b;

    /* renamed from: c, reason: collision with root package name */
    private int f31443c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private ViewPropertyAnimator f31444d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f31444d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f31441a = 0;
        this.f31442b = 2;
        this.f31443c = 0;
    }

    private void H(@N V v3, int i4, long j4, TimeInterpolator timeInterpolator) {
        this.f31444d = v3.animate().translationY(i4).setInterpolator(timeInterpolator).setDuration(j4).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean B(@N CoordinatorLayout coordinatorLayout, @N V v3, @N View view, @N View view2, int i4, int i5) {
        return i4 == 2;
    }

    public boolean I() {
        if (this.f31442b == 1) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if (this.f31442b == 2) {
            return true;
        }
        return false;
    }

    public void K(@N V v3, @r int i4) {
        this.f31443c = i4;
        if (this.f31442b == 1) {
            v3.setTranslationY(this.f31441a + i4);
        }
    }

    public void L(@N V v3) {
        M(v3, true);
    }

    public void M(@N V v3, boolean z3) {
        if (I()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f31444d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        this.f31442b = 1;
        int i4 = this.f31441a + this.f31443c;
        if (z3) {
            H(v3, i4, 175L, com.google.android.material.animation.a.f31209c);
        } else {
            v3.setTranslationY(i4);
        }
    }

    public void N(@N V v3) {
        O(v3, true);
    }

    public void O(@N V v3, boolean z3) {
        if (J()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f31444d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v3.clearAnimation();
        }
        this.f31442b = 2;
        if (z3) {
            H(v3, 0, 225L, com.google.android.material.animation.a.f31210d);
        } else {
            v3.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4) {
        this.f31441a = v3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v3.getLayoutParams()).bottomMargin;
        return super.m(coordinatorLayout, v3, i4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, @N V v3, @N View view, int i4, int i5, int i6, int i7, int i8, @N int[] iArr) {
        if (i5 > 0) {
            L(v3);
        } else if (i5 < 0) {
            N(v3);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31441a = 0;
        this.f31442b = 2;
        this.f31443c = 0;
    }
}
