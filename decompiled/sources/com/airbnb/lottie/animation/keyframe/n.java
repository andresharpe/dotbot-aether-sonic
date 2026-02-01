package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.P;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f21396i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f21397j;

    /* renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f21398k;

    /* renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f21399l;

    /* renamed from: m, reason: collision with root package name */
    @P
    protected com.airbnb.lottie.value.j<Float> f21400m;

    /* renamed from: n, reason: collision with root package name */
    @P
    protected com.airbnb.lottie.value.j<Float> f21401n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f21396i = new PointF();
        this.f21397j = new PointF();
        this.f21398k = aVar;
        this.f21399l = aVar2;
        m(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f4) {
        this.f21398k.m(f4);
        this.f21399l.m(f4);
        this.f21396i.set(this.f21398k.h().floatValue(), this.f21399l.h().floatValue());
        for (int i4 = 0; i4 < this.f21358a.size(); i4++) {
            this.f21358a.get(i4).a();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f4) {
        Float f5;
        com.airbnb.lottie.value.a<Float> b4;
        float floatValue;
        com.airbnb.lottie.value.a<Float> b5;
        float floatValue2;
        Float f6 = null;
        if (this.f21400m != null && (b5 = this.f21398k.b()) != null) {
            float d4 = this.f21398k.d();
            Float f7 = b5.f23318h;
            com.airbnb.lottie.value.j<Float> jVar = this.f21400m;
            float f8 = b5.f23317g;
            if (f7 == null) {
                floatValue2 = f8;
            } else {
                floatValue2 = f7.floatValue();
            }
            f5 = jVar.b(f8, floatValue2, b5.f23312b, b5.f23313c, f4, f4, d4);
        } else {
            f5 = null;
        }
        if (this.f21401n != null && (b4 = this.f21399l.b()) != null) {
            float d5 = this.f21399l.d();
            Float f9 = b4.f23318h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f21401n;
            float f10 = b4.f23317g;
            if (f9 == null) {
                floatValue = f10;
            } else {
                floatValue = f9.floatValue();
            }
            f6 = jVar2.b(f10, floatValue, b4.f23312b, b4.f23313c, f4, f4, d5);
        }
        if (f5 == null) {
            this.f21397j.set(this.f21396i.x, 0.0f);
        } else {
            this.f21397j.set(f5.floatValue(), 0.0f);
        }
        if (f6 == null) {
            PointF pointF = this.f21397j;
            pointF.set(pointF.x, this.f21396i.y);
        } else {
            PointF pointF2 = this.f21397j;
            pointF2.set(pointF2.x, f6.floatValue());
        }
        return this.f21397j;
    }

    public void r(@P com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f21400m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f21400m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void s(@P com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f21401n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f21401n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
