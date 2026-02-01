package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.vectordrawable.graphics.drawable.b;
import com.google.android.material.progressindicator.c;

/* loaded from: classes2.dex */
public final class k<S extends c> extends h {

    /* renamed from: V, reason: collision with root package name */
    private i<S> f32961V;

    /* renamed from: W, reason: collision with root package name */
    private j<ObjectAnimator> f32962W;

    k(@N Context context, @N c cVar, @N i<S> iVar, @N j<ObjectAnimator> jVar) {
        super(context, cVar);
        C(iVar);
        B(jVar);
    }

    @N
    public static k<f> x(@N Context context, @N f fVar) {
        return new k<>(context, fVar, new d(fVar), new e(fVar));
    }

    @N
    public static k<p> y(@N Context context, @N p pVar) {
        j nVar;
        l lVar = new l(pVar);
        if (pVar.f32997g == 0) {
            nVar = new m(pVar);
        } else {
            nVar = new n(context, pVar);
        }
        return new k<>(context, pVar, lVar, nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public i<S> A() {
        return this.f32961V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(@N j<ObjectAnimator> jVar) {
        this.f32962W = jVar;
        jVar.e(this);
    }

    void C(@N i<S> iVar) {
        this.f32961V = iVar;
        iVar.f(this);
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
            this.f32961V.g(canvas, j());
            this.f32961V.c(canvas, this.f32952Q);
            int i4 = 0;
            while (true) {
                j<ObjectAnimator> jVar = this.f32962W;
                int[] iArr = jVar.f32960c;
                if (i4 < iArr.length) {
                    i<S> iVar = this.f32961V;
                    Paint paint = this.f32952Q;
                    float[] fArr = jVar.f32959b;
                    int i5 = i4 * 2;
                    iVar.b(canvas, paint, fArr[i5], fArr[i5 + 1], iArr[i4]);
                    i4++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f32961V.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f32961V.e();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        if (!isRunning()) {
            this.f32962W.a();
        }
        this.f32942G.a(this.f32940E.getContentResolver());
        if (z3 && z5) {
            this.f32962W.g();
        }
        return w3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public j<ObjectAnimator> z() {
        return this.f32962W;
    }
}
