package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.vectordrawable.graphics.drawable.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class h extends Drawable implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: S, reason: collision with root package name */
    private static final boolean f32937S = false;

    /* renamed from: T, reason: collision with root package name */
    private static final int f32938T = 500;

    /* renamed from: U, reason: collision with root package name */
    private static final Property<h, Float> f32939U = new c(Float.class, "growFraction");

    /* renamed from: E, reason: collision with root package name */
    final Context f32940E;

    /* renamed from: F, reason: collision with root package name */
    final com.google.android.material.progressindicator.c f32941F;

    /* renamed from: H, reason: collision with root package name */
    private ValueAnimator f32943H;

    /* renamed from: I, reason: collision with root package name */
    private ValueAnimator f32944I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f32945J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f32946K;

    /* renamed from: L, reason: collision with root package name */
    private float f32947L;

    /* renamed from: M, reason: collision with root package name */
    private List<b.a> f32948M;

    /* renamed from: N, reason: collision with root package name */
    private b.a f32949N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f32950O;

    /* renamed from: P, reason: collision with root package name */
    private float f32951P;

    /* renamed from: R, reason: collision with root package name */
    private int f32953R;

    /* renamed from: Q, reason: collision with root package name */
    final Paint f32952Q = new Paint();

    /* renamed from: G, reason: collision with root package name */
    com.google.android.material.progressindicator.a f32942G = new com.google.android.material.progressindicator.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            h.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            h.super.setVisible(false, false);
            h.this.g();
        }
    }

    /* loaded from: classes2.dex */
    class c extends Property<h, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(h hVar) {
            return Float.valueOf(hVar.j());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(h hVar, Float f4) {
            hVar.p(f4.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(@N Context context, @N com.google.android.material.progressindicator.c cVar) {
        this.f32940E = context;
        this.f32941F = cVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        b.a aVar = this.f32949N;
        if (aVar != null) {
            aVar.b(this);
        }
        List<b.a> list = this.f32948M;
        if (list != null && !this.f32950O) {
            Iterator<b.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        b.a aVar = this.f32949N;
        if (aVar != null) {
            aVar.c(this);
        }
        List<b.a> list = this.f32948M;
        if (list != null && !this.f32950O) {
            Iterator<b.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(this);
            }
        }
    }

    private void i(@N ValueAnimator... valueAnimatorArr) {
        boolean z3 = this.f32950O;
        this.f32950O = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f32950O = z3;
    }

    private void o() {
        if (this.f32943H == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f32939U, 0.0f, 1.0f);
            this.f32943H = ofFloat;
            ofFloat.setDuration(500L);
            this.f32943H.setInterpolator(com.google.android.material.animation.a.f31208b);
            u(this.f32943H);
        }
        if (this.f32944I == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f32939U, 1.0f, 0.0f);
            this.f32944I = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f32944I.setInterpolator(com.google.android.material.animation.a.f31208b);
            q(this.f32944I);
        }
    }

    private void q(@N ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f32944I;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f32944I = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void u(@N ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f32943H;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f32943H = valueAnimator;
        valueAnimator.addListener(new a());
    }

    public void b(@N b.a aVar) {
        if (this.f32948M == null) {
            this.f32948M = new ArrayList();
        }
        if (!this.f32948M.contains(aVar)) {
            this.f32948M.add(aVar);
        }
    }

    public void c() {
        this.f32948M.clear();
        this.f32948M = null;
    }

    public boolean d(@N b.a aVar) {
        List<b.a> list = this.f32948M;
        if (list != null && list.contains(aVar)) {
            this.f32948M.remove(aVar);
            if (this.f32948M.isEmpty()) {
                this.f32948M = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f32953R;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        if (!n() && !m()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        if (!this.f32941F.b() && !this.f32941F.a()) {
            return 1.0f;
        }
        if (!this.f32946K && !this.f32945J) {
            return this.f32951P;
        }
        return this.f32947L;
    }

    @N
    ValueAnimator k() {
        return this.f32944I;
    }

    public boolean l() {
        return v(false, false, false);
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f32944I;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f32946K) {
            return true;
        }
        return false;
    }

    public boolean n() {
        ValueAnimator valueAnimator = this.f32943H;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f32945J) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f32951P != f4) {
            this.f32951P = f4;
            invalidateSelf();
        }
    }

    void r(@N b.a aVar) {
        this.f32949N = aVar;
    }

    @i0
    void s(boolean z3, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f32946K = z3;
        this.f32947L = f4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f32953R = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f32952Q.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        return v(z3, z4, true);
    }

    public void start() {
        w(true, true, false);
    }

    public void stop() {
        w(false, true, false);
    }

    @i0
    void t(boolean z3, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f32945J = z3;
        this.f32947L = f4;
    }

    public boolean v(boolean z3, boolean z4, boolean z5) {
        boolean z6;
        float a4 = this.f32942G.a(this.f32940E.getContentResolver());
        if (z5 && a4 > 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        return w(z3, z4, z6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(boolean z3, boolean z4, boolean z5) {
        ValueAnimator valueAnimator;
        boolean a4;
        o();
        boolean z6 = false;
        if (!isVisible() && !z3) {
            return false;
        }
        if (z3) {
            valueAnimator = this.f32943H;
        } else {
            valueAnimator = this.f32944I;
        }
        if (!z5) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                i(valueAnimator);
            }
            return super.setVisible(z3, false);
        }
        if (z5 && valueAnimator.isRunning()) {
            return false;
        }
        if (!z3 || super.setVisible(z3, false)) {
            z6 = true;
        }
        if (z3) {
            a4 = this.f32941F.b();
        } else {
            a4 = this.f32941F.a();
        }
        if (!a4) {
            i(valueAnimator);
            return z6;
        }
        if (!z4 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return z6;
    }
}
