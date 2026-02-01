package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.W;
import com.google.android.material.transition.platform.l;

@W(21)
/* loaded from: classes2.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f34214a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f34215b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f34216c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.p f34217d = com.google.android.material.shape.p.k();

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.o f34218e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        canvas.clipPath(this.f34214a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f4, com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.o o4 = v.o(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f4);
        this.f34218e = o4;
        this.f34217d.d(o4, 1.0f, rectF2, this.f34215b);
        this.f34217d.d(this.f34218e, 1.0f, rectF3, this.f34216c);
        this.f34214a.op(this.f34215b, this.f34216c, Path.Op.UNION);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.shape.o c() {
        return this.f34218e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path d() {
        return this.f34214a;
    }
}
