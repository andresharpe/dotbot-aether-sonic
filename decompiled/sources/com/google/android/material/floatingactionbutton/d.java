package com.google.android.material.floatingactionbutton;

import T0.a;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.u;
import androidx.core.view.C0823k0;
import c1.C1007a;
import com.google.android.material.internal.r;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: E, reason: collision with root package name */
    static final long f32394E = 100;

    /* renamed from: F, reason: collision with root package name */
    static final long f32395F = 100;

    /* renamed from: G, reason: collision with root package name */
    static final int f32396G = 0;

    /* renamed from: H, reason: collision with root package name */
    static final int f32397H = 1;

    /* renamed from: I, reason: collision with root package name */
    static final int f32398I = 2;

    /* renamed from: J, reason: collision with root package name */
    static final float f32399J = 1.5f;

    /* renamed from: K, reason: collision with root package name */
    private static final float f32400K = 0.0f;

    /* renamed from: L, reason: collision with root package name */
    private static final float f32401L = 0.4f;

    /* renamed from: M, reason: collision with root package name */
    private static final float f32402M = 0.4f;

    /* renamed from: N, reason: collision with root package name */
    private static final float f32403N = 1.0f;

    /* renamed from: O, reason: collision with root package name */
    private static final float f32404O = 1.0f;

    /* renamed from: P, reason: collision with root package name */
    private static final float f32405P = 1.0f;

    /* renamed from: Q, reason: collision with root package name */
    private static final float f32406Q = 0.0f;

    /* renamed from: R, reason: collision with root package name */
    private static final float f32407R = 0.0f;

    /* renamed from: C, reason: collision with root package name */
    @P
    private ViewTreeObserver.OnPreDrawListener f32416C;

    /* renamed from: a, reason: collision with root package name */
    @P
    o f32417a;

    /* renamed from: b, reason: collision with root package name */
    @P
    com.google.android.material.shape.j f32418b;

    /* renamed from: c, reason: collision with root package name */
    @P
    Drawable f32419c;

    /* renamed from: d, reason: collision with root package name */
    @P
    com.google.android.material.floatingactionbutton.c f32420d;

    /* renamed from: e, reason: collision with root package name */
    @P
    Drawable f32421e;

    /* renamed from: f, reason: collision with root package name */
    boolean f32422f;

    /* renamed from: h, reason: collision with root package name */
    float f32424h;

    /* renamed from: i, reason: collision with root package name */
    float f32425i;

    /* renamed from: j, reason: collision with root package name */
    float f32426j;

    /* renamed from: k, reason: collision with root package name */
    int f32427k;

    /* renamed from: l, reason: collision with root package name */
    @N
    private final r f32428l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private Animator f32429m;

    /* renamed from: n, reason: collision with root package name */
    @P
    private com.google.android.material.animation.h f32430n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private com.google.android.material.animation.h f32431o;

    /* renamed from: p, reason: collision with root package name */
    private float f32432p;

    /* renamed from: r, reason: collision with root package name */
    private int f32434r;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f32436t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f32437u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<j> f32438v;

    /* renamed from: w, reason: collision with root package name */
    final FloatingActionButton f32439w;

    /* renamed from: x, reason: collision with root package name */
    final com.google.android.material.shadow.c f32440x;

    /* renamed from: D, reason: collision with root package name */
    static final TimeInterpolator f32393D = com.google.android.material.animation.a.f31209c;

    /* renamed from: S, reason: collision with root package name */
    static final int[] f32408S = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: T, reason: collision with root package name */
    static final int[] f32409T = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: U, reason: collision with root package name */
    static final int[] f32410U = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: V, reason: collision with root package name */
    static final int[] f32411V = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: W, reason: collision with root package name */
    static final int[] f32412W = {R.attr.state_enabled};

    /* renamed from: X, reason: collision with root package name */
    static final int[] f32413X = new int[0];

    /* renamed from: g, reason: collision with root package name */
    boolean f32423g = true;

    /* renamed from: q, reason: collision with root package name */
    private float f32433q = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private int f32435s = 0;

    /* renamed from: y, reason: collision with root package name */
    private final Rect f32441y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    private final RectF f32442z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    private final RectF f32414A = new RectF();

    /* renamed from: B, reason: collision with root package name */
    private final Matrix f32415B = new Matrix();

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f32445c;

        a(boolean z3, k kVar) {
            this.f32444b = z3;
            this.f32445c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32443a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i4;
            d.this.f32435s = 0;
            d.this.f32429m = null;
            if (!this.f32443a) {
                FloatingActionButton floatingActionButton = d.this.f32439w;
                boolean z3 = this.f32444b;
                if (z3) {
                    i4 = 8;
                } else {
                    i4 = 4;
                }
                floatingActionButton.c(i4, z3);
                k kVar = this.f32445c;
                if (kVar != null) {
                    kVar.b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f32439w.c(0, this.f32444b);
            d.this.f32435s = 1;
            d.this.f32429m = animator;
            this.f32443a = false;
        }
    }

    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32447a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f32448b;

        b(boolean z3, k kVar) {
            this.f32447a = z3;
            this.f32448b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f32435s = 0;
            d.this.f32429m = null;
            k kVar = this.f32448b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f32439w.c(0, this.f32447a);
            d.this.f32435s = 2;
            d.this.f32429m = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends com.google.android.material.animation.g {
        c() {
        }

        @Override // com.google.android.material.animation.g, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f4, @N Matrix matrix, @N Matrix matrix2) {
            d.this.f32433q = f4;
            return super.evaluate(f4, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0285d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f32451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f32452b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f32453c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f32454d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f32455e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f32456f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f32457g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f32458h;

        C0285d(float f4, float f5, float f6, float f7, float f8, float f9, float f10, Matrix matrix) {
            this.f32451a = f4;
            this.f32452b = f5;
            this.f32453c = f6;
            this.f32454d = f7;
            this.f32455e = f8;
            this.f32456f = f9;
            this.f32457g = f10;
            this.f32458h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f32439w.setAlpha(com.google.android.material.animation.a.b(this.f32451a, this.f32452b, 0.0f, 0.2f, floatValue));
            d.this.f32439w.setScaleX(com.google.android.material.animation.a.a(this.f32453c, this.f32454d, floatValue));
            d.this.f32439w.setScaleY(com.google.android.material.animation.a.a(this.f32455e, this.f32454d, floatValue));
            d.this.f32433q = com.google.android.material.animation.a.a(this.f32456f, this.f32457g, floatValue);
            d.this.h(com.google.android.material.animation.a.a(this.f32456f, this.f32457g, floatValue), this.f32458h);
            d.this.f32439w.setImageMatrix(this.f32458h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f32460a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f4, Float f5, Float f6) {
            float floatValue = this.f32460a.evaluate(f4, (Number) f5, (Number) f6).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.H();
            return true;
        }
    }

    /* loaded from: classes2.dex */
    private class g extends m {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return 0.0f;
        }
    }

    /* loaded from: classes2.dex */
    private class h extends m {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f32424h + dVar.f32425i;
        }
    }

    /* loaded from: classes2.dex */
    private class i extends m {
        i() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f32424h + dVar.f32426j;
        }
    }

    /* loaded from: classes2.dex */
    interface j {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    interface k {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    private class l extends m {
        l() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return d.this.f32424h;
        }
    }

    /* loaded from: classes2.dex */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32467a;

        /* renamed from: b, reason: collision with root package name */
        private float f32468b;

        /* renamed from: c, reason: collision with root package name */
        private float f32469c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.j0((int) this.f32469c);
            this.f32467a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            float x3;
            if (!this.f32467a) {
                com.google.android.material.shape.j jVar = d.this.f32418b;
                if (jVar == null) {
                    x3 = 0.0f;
                } else {
                    x3 = jVar.x();
                }
                this.f32468b = x3;
                this.f32469c = a();
                this.f32467a = true;
            }
            d dVar = d.this;
            float f4 = this.f32468b;
            dVar.j0((int) (f4 + ((this.f32469c - f4) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(d dVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        this.f32439w = floatingActionButton;
        this.f32440x = cVar;
        r rVar = new r();
        this.f32428l = rVar;
        rVar.a(f32408S, k(new i()));
        rVar.a(f32409T, k(new h()));
        rVar.a(f32410U, k(new h()));
        rVar.a(f32411V, k(new h()));
        rVar.a(f32412W, k(new l()));
        rVar.a(f32413X, k(new g()));
        this.f32432p = floatingActionButton.getRotation();
    }

    private boolean d0() {
        if (C0823k0.U0(this.f32439w) && !this.f32439w.isInEditMode()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f4, @N Matrix matrix) {
        matrix.reset();
        if (this.f32439w.getDrawable() != null && this.f32434r != 0) {
            RectF rectF = this.f32442z;
            RectF rectF2 = this.f32414A;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i4 = this.f32434r;
            rectF2.set(0.0f, 0.0f, i4, i4);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i5 = this.f32434r;
            matrix.postScale(f4, f4, i5 / 2.0f, i5 / 2.0f);
        }
    }

    @N
    private AnimatorSet i(@N com.google.android.material.animation.h hVar, float f4, float f5, float f6) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f32439w, (Property<FloatingActionButton, Float>) View.ALPHA, f4);
        hVar.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f32439w, (Property<FloatingActionButton, Float>) View.SCALE_X, f5);
        hVar.h("scale").a(ofFloat2);
        k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32439w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f5);
        hVar.h("scale").a(ofFloat3);
        k0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f6, this.f32415B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f32439w, new com.google.android.material.animation.f(), new c(), new Matrix(this.f32415B));
        hVar.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f4, float f5, float f6) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0285d(this.f32439w.getAlpha(), f4, this.f32439w.getScaleX(), f5, this.f32439w.getScaleY(), this.f32433q, f6, new Matrix(this.f32415B)));
        arrayList.add(ofFloat);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        animatorSet.setDuration(C1007a.d(this.f32439w.getContext(), a.c.Mb, this.f32439w.getContext().getResources().getInteger(a.i.f2859F)));
        animatorSet.setInterpolator(C1007a.e(this.f32439w.getContext(), a.c.Wb, com.google.android.material.animation.a.f31208b));
        return animatorSet;
    }

    @N
    private ValueAnimator k(@N m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f32393D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @N
    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.f32416C == null) {
            this.f32416C = new f();
        }
        return this.f32416C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.f32428l.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        com.google.android.material.shape.j jVar = this.f32418b;
        if (jVar != null) {
            com.google.android.material.shape.k.f(this.f32439w, jVar);
        }
        if (N()) {
            this.f32439w.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        ViewTreeObserver viewTreeObserver = this.f32439w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f32416C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f32416C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int[] iArr) {
        this.f32428l.d(iArr);
    }

    void F(float f4, float f5, float f6) {
        i0();
        j0(f4);
    }

    void G(@N Rect rect) {
        u.m(this.f32421e, "Didn't initialize content background");
        if (c0()) {
            this.f32440x.b(new InsetDrawable(this.f32421e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f32440x.b(this.f32421e);
        }
    }

    void H() {
        float rotation = this.f32439w.getRotation();
        if (this.f32432p != rotation) {
            this.f32432p = rotation;
            g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        ArrayList<j> arrayList = this.f32438v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        ArrayList<j> arrayList = this.f32438v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K(@N Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f32437u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@N Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f32436t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(@N j jVar) {
        ArrayList<j> arrayList = this.f32438v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    boolean N() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(@P ColorStateList colorStateList) {
        com.google.android.material.shape.j jVar = this.f32418b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f32420d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(@P PorterDuff.Mode mode) {
        com.google.android.material.shape.j jVar = this.f32418b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(float f4) {
        if (this.f32424h != f4) {
            this.f32424h = f4;
            F(f4, this.f32425i, this.f32426j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(boolean z3) {
        this.f32422f = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(@P com.google.android.material.animation.h hVar) {
        this.f32431o = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(float f4) {
        if (this.f32425i != f4) {
            this.f32425i = f4;
            F(this.f32424h, f4, this.f32426j);
        }
    }

    final void U(float f4) {
        this.f32433q = f4;
        Matrix matrix = this.f32415B;
        h(f4, matrix);
        this.f32439w.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(int i4) {
        if (this.f32434r != i4) {
            this.f32434r = i4;
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(int i4) {
        this.f32427k = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(float f4) {
        if (this.f32426j != f4) {
            this.f32426j = f4;
            F(this.f32424h, this.f32425i, f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(@P ColorStateList colorStateList) {
        Drawable drawable = this.f32419c;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, com.google.android.material.ripple.b.d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(boolean z3) {
        this.f32423g = z3;
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a0(@N o oVar) {
        this.f32417a = oVar;
        com.google.android.material.shape.j jVar = this.f32418b;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        Object obj = this.f32419c;
        if (obj instanceof s) {
            ((s) obj).setShapeAppearanceModel(oVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f32420d;
        if (cVar != null) {
            cVar.g(oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(@P com.google.android.material.animation.h hVar) {
        this.f32430n = hVar;
    }

    boolean c0() {
        return true;
    }

    public void e(@N Animator.AnimatorListener animatorListener) {
        if (this.f32437u == null) {
            this.f32437u = new ArrayList<>();
        }
        this.f32437u.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e0() {
        if (this.f32422f && this.f32439w.getSizeDimension() < this.f32427k) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(@N Animator.AnimatorListener animatorListener) {
        if (this.f32436t == null) {
            this.f32436t = new ArrayList<>();
        }
        this.f32436t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(@P k kVar, boolean z3) {
        boolean z4;
        AnimatorSet j4;
        float f4;
        float f5;
        if (z()) {
            return;
        }
        Animator animator = this.f32429m;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f32430n == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (d0()) {
            if (this.f32439w.getVisibility() != 0) {
                float f6 = 0.0f;
                this.f32439w.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.f32439w;
                if (z4) {
                    f4 = 0.4f;
                } else {
                    f4 = 0.0f;
                }
                floatingActionButton.setScaleY(f4);
                FloatingActionButton floatingActionButton2 = this.f32439w;
                if (z4) {
                    f5 = 0.4f;
                } else {
                    f5 = 0.0f;
                }
                floatingActionButton2.setScaleX(f5);
                if (z4) {
                    f6 = 0.4f;
                }
                U(f6);
            }
            com.google.android.material.animation.h hVar = this.f32430n;
            if (hVar != null) {
                j4 = i(hVar, 1.0f, 1.0f, 1.0f);
            } else {
                j4 = j(1.0f, 1.0f, 1.0f);
            }
            j4.addListener(new b(z3, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f32436t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j4.addListener(it.next());
                }
            }
            j4.start();
            return;
        }
        this.f32439w.c(0, z3);
        this.f32439w.setAlpha(1.0f);
        this.f32439w.setScaleY(1.0f);
        this.f32439w.setScaleX(1.0f);
        U(1.0f);
        if (kVar != null) {
            kVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@N j jVar) {
        if (this.f32438v == null) {
            this.f32438v = new ArrayList<>();
        }
        this.f32438v.add(jVar);
    }

    void g0() {
        com.google.android.material.shape.j jVar = this.f32418b;
        if (jVar != null) {
            jVar.w0((int) this.f32432p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h0() {
        U(this.f32433q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0() {
        Rect rect = this.f32441y;
        s(rect);
        G(rect);
        this.f32440x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(float f4) {
        com.google.android.material.shape.j jVar = this.f32418b;
        if (jVar != null) {
            jVar.n0(f4);
        }
    }

    com.google.android.material.shape.j l() {
        return new com.google.android.material.shape.j((o) u.l(this.f32417a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public final Drawable m() {
        return this.f32421e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float n() {
        return this.f32424h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f32422f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public final com.google.android.material.animation.h p() {
        return this.f32431o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float q() {
        return this.f32425i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(@N Rect rect) {
        int i4;
        float f4;
        if (this.f32422f) {
            i4 = (this.f32427k - this.f32439w.getSizeDimension()) / 2;
        } else {
            i4 = 0;
        }
        if (this.f32423g) {
            f4 = n() + this.f32426j;
        } else {
            f4 = 0.0f;
        }
        int max = Math.max(i4, (int) Math.ceil(f4));
        int max2 = Math.max(i4, (int) Math.ceil(f4 * f32399J));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        return this.f32426j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public final o u() {
        return this.f32417a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public final com.google.android.material.animation.h v() {
        return this.f32430n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(@P k kVar, boolean z3) {
        int i4;
        AnimatorSet j4;
        if (y()) {
            return;
        }
        Animator animator = this.f32429m;
        if (animator != null) {
            animator.cancel();
        }
        if (d0()) {
            com.google.android.material.animation.h hVar = this.f32431o;
            if (hVar != null) {
                j4 = i(hVar, 0.0f, 0.0f, 0.0f);
            } else {
                j4 = j(0.0f, 0.4f, 0.4f);
            }
            j4.addListener(new a(z3, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f32437u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j4.addListener(it.next());
                }
            }
            j4.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f32439w;
        if (z3) {
            i4 = 8;
        } else {
            i4 = 4;
        }
        floatingActionButton.c(i4, z3);
        if (kVar != null) {
            kVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, @P PorterDuff.Mode mode, ColorStateList colorStateList2, int i4) {
        com.google.android.material.shape.j l4 = l();
        this.f32418b = l4;
        l4.setTintList(colorStateList);
        if (mode != null) {
            this.f32418b.setTintMode(mode);
        }
        this.f32418b.v0(-12303292);
        this.f32418b.Z(this.f32439w.getContext());
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f32418b.getShapeAppearanceModel());
        aVar.setTintList(com.google.android.material.ripple.b.d(colorStateList2));
        this.f32419c = aVar;
        this.f32421e = new LayerDrawable(new Drawable[]{(Drawable) u.l(this.f32418b), aVar});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        if (this.f32439w.getVisibility() == 0) {
            if (this.f32435s != 1) {
                return false;
            }
            return true;
        }
        if (this.f32435s == 2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        if (this.f32439w.getVisibility() != 0) {
            if (this.f32435s != 2) {
                return false;
            }
            return true;
        }
        if (this.f32435s == 1) {
            return false;
        }
        return true;
    }
}
