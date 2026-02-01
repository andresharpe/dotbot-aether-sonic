package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.dynamicanimation.animation.b;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.color.s;
import com.google.android.material.progressindicator.c;

/* loaded from: classes2.dex */
public final class g<S extends c> extends h {

    /* renamed from: a0, reason: collision with root package name */
    private static final int f32929a0 = 10000;

    /* renamed from: b0, reason: collision with root package name */
    private static final float f32930b0 = 50.0f;

    /* renamed from: c0, reason: collision with root package name */
    private static final androidx.dynamicanimation.animation.d<g> f32931c0 = new a("indicatorLevel");

    /* renamed from: V, reason: collision with root package name */
    private i<S> f32932V;

    /* renamed from: W, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.h f32933W;

    /* renamed from: X, reason: collision with root package name */
    private final androidx.dynamicanimation.animation.g f32934X;

    /* renamed from: Y, reason: collision with root package name */
    private float f32935Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f32936Z;

    /* loaded from: classes2.dex */
    class a extends androidx.dynamicanimation.animation.d<g> {
        a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(g gVar) {
            return gVar.D() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(g gVar, float f4) {
            gVar.G(f4 / 10000.0f);
        }
    }

    g(@N Context context, @N c cVar, @N i<S> iVar) {
        super(context, cVar);
        this.f32936Z = false;
        F(iVar);
        androidx.dynamicanimation.animation.h hVar = new androidx.dynamicanimation.animation.h();
        this.f32933W = hVar;
        hVar.g(1.0f);
        hVar.i(50.0f);
        androidx.dynamicanimation.animation.g gVar = new androidx.dynamicanimation.animation.g(this, f32931c0);
        this.f32934X = gVar;
        gVar.D(hVar);
        p(1.0f);
    }

    @N
    public static g<f> A(@N Context context, @N f fVar) {
        return new g<>(context, fVar, new d(fVar));
    }

    @N
    public static g<p> B(@N Context context, @N p pVar) {
        return new g<>(context, pVar, new l(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float D() {
        return this.f32935Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f4) {
        this.f32935Y = f4;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public i<S> C() {
        return this.f32932V;
    }

    public void E(@N b.q qVar) {
        this.f32934X.l(qVar);
    }

    void F(@N i<S> iVar) {
        this.f32932V = iVar;
        iVar.f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(float f4) {
        setLevel((int) (f4 * 10000.0f));
    }

    @Override // com.google.android.material.progressindicator.h, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void b(@N b.a aVar) {
        super.b(aVar);
    }

    @Override // com.google.android.material.progressindicator.h, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.material.progressindicator.h, androidx.vectordrawable.graphics.drawable.b
    public /* bridge */ /* synthetic */ boolean d(@N b.a aVar) {
        return super.d(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f32932V.g(canvas, j());
            this.f32932V.c(canvas, this.f32952Q);
            this.f32932V.b(canvas, this.f32952Q, 0.0f, D(), s.a(this.f32941F.f32894c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f32932V.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f32932V.e();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f32934X.E();
        G(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        if (this.f32936Z) {
            this.f32934X.E();
            G(i4 / 10000.0f);
            return true;
        }
        this.f32934X.t(D() * 10000.0f);
        this.f32934X.z(i4);
        return true;
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i4) {
        super.setAlpha(i4);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@P ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z3, boolean z4) {
        return super.setVisible(z3, z4);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean v(boolean z3, boolean z4, boolean z5) {
        return super.v(z3, z4, z5);
    }

    @Override // com.google.android.material.progressindicator.h
    boolean w(boolean z3, boolean z4, boolean z5) {
        boolean w3 = super.w(z3, z4, z5);
        float a4 = this.f32942G.a(this.f32940E.getContentResolver());
        if (a4 == 0.0f) {
            this.f32936Z = true;
        } else {
            this.f32936Z = false;
            this.f32933W.i(50.0f / a4);
        }
        return w3;
    }

    public void z(@N b.q qVar) {
        this.f32934X.b(qVar);
    }
}
