package com.airbnb.lottie.model.content;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21640a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f21641b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f21642c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21643d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21644e;

    public b(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z3, boolean z4) {
        this.f21640a = str;
        this.f21641b = mVar;
        this.f21642c = fVar;
        this.f21643d = z3;
        this.f21644e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(jVar, bVar, this);
    }

    public String b() {
        return this.f21640a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> c() {
        return this.f21641b;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f21642c;
    }

    public boolean e() {
        return this.f21644e;
    }

    public boolean f() {
        return this.f21643d;
    }
}
