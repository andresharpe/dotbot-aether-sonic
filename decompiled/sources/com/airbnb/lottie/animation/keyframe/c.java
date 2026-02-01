package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.parser.C1018j;

/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: h, reason: collision with root package name */
    private static final double f21372h = 0.017453292519943295d;

    /* renamed from: a, reason: collision with root package name */
    private final a.b f21373a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21374b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f21375c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f21376d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f21377e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f21378f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21379g = true;

    /* loaded from: classes.dex */
    class a extends com.airbnb.lottie.value.j<Float> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f21380d;

        a(com.airbnb.lottie.value.j jVar) {
            this.f21380d = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @P
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f4 = (Float) this.f21380d.a(bVar);
            if (f4 == null) {
                return null;
            }
            return Float.valueOf(f4.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.b bVar2, C1018j c1018j) {
        this.f21373a = bVar;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a4 = c1018j.a().a();
        this.f21374b = a4;
        a4.a(this);
        bVar2.i(a4);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = c1018j.d().a();
        this.f21375c = a5;
        a5.a(this);
        bVar2.i(a5);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = c1018j.b().a();
        this.f21376d = a6;
        a6.a(this);
        bVar2.i(a6);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = c1018j.c().a();
        this.f21377e = a7;
        a7.a(this);
        bVar2.i(a7);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = c1018j.e().a();
        this.f21378f = a8;
        a8.a(this);
        bVar2.i(a8);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f21379g = true;
        this.f21373a.a();
    }

    public void b(Paint paint) {
        if (!this.f21379g) {
            return;
        }
        this.f21379g = false;
        double floatValue = this.f21376d.h().floatValue() * f21372h;
        float floatValue2 = this.f21377e.h().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.f21374b.h().intValue();
        paint.setShadowLayer(this.f21378f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f21375c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public void c(@P com.airbnb.lottie.value.j<Integer> jVar) {
        this.f21374b.n(jVar);
    }

    public void d(@P com.airbnb.lottie.value.j<Float> jVar) {
        this.f21376d.n(jVar);
    }

    public void e(@P com.airbnb.lottie.value.j<Float> jVar) {
        this.f21377e.n(jVar);
    }

    public void f(@P com.airbnb.lottie.value.j<Float> jVar) {
        if (jVar == null) {
            this.f21375c.n(null);
        } else {
            this.f21375c.n(new a(jVar));
        }
    }

    public void g(@P com.airbnb.lottie.value.j<Float> jVar) {
        this.f21378f.n(jVar);
    }
}
