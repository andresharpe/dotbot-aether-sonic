package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.animation.content.p;

/* loaded from: classes.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21670a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f21671b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f21672c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21673d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21674e;

    public g(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z3) {
        this.f21670a = str;
        this.f21671b = mVar;
        this.f21672c = mVar2;
        this.f21673d = bVar;
        this.f21674e = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new p(jVar, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f21673d;
    }

    public String c() {
        return this.f21670a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> d() {
        return this.f21671b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> e() {
        return this.f21672c;
    }

    public boolean f() {
        return this.f21674e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f21671b + ", size=" + this.f21672c + '}';
    }
}
