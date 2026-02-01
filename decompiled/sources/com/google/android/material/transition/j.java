package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.transition.l;

/* loaded from: classes2.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f34059a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f34060b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f34061c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.p f34062d = com.google.android.material.shape.p.k();

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.o f34063e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        canvas.clipPath(this.f34059a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f4, com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.o o4 = u.o(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f4);
        this.f34063e = o4;
        this.f34062d.d(o4, 1.0f, rectF2, this.f34060b);
        this.f34062d.d(this.f34063e, 1.0f, rectF3, this.f34061c);
        this.f34059a.op(this.f34060b, this.f34061c, Path.Op.UNION);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.shape.o c() {
        return this.f34063e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path d() {
        return this.f34059a;
    }
}
