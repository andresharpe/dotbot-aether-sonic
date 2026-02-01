package com.airbnb.lottie.model.content;

import androidx.annotation.P;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;

/* loaded from: classes.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21657a;

    /* renamed from: b, reason: collision with root package name */
    private final GradientType f21658b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f21659c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f21660d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f21661e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f21662f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21663g;

    /* renamed from: h, reason: collision with root package name */
    private final ShapeStroke.LineCapType f21664h;

    /* renamed from: i, reason: collision with root package name */
    private final ShapeStroke.LineJoinType f21665i;

    /* renamed from: j, reason: collision with root package name */
    private final float f21666j;

    /* renamed from: k, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f21667k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.b f21668l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f21669m;

    public f(String str, GradientType gradientType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f4, List<com.airbnb.lottie.model.animatable.b> list, @P com.airbnb.lottie.model.animatable.b bVar2, boolean z3) {
        this.f21657a = str;
        this.f21658b = gradientType;
        this.f21659c = cVar;
        this.f21660d = dVar;
        this.f21661e = fVar;
        this.f21662f = fVar2;
        this.f21663g = bVar;
        this.f21664h = lineCapType;
        this.f21665i = lineJoinType;
        this.f21666j = f4;
        this.f21667k = list;
        this.f21668l = bVar2;
        this.f21669m = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(jVar, bVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.f21664h;
    }

    @P
    public com.airbnb.lottie.model.animatable.b c() {
        return this.f21668l;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f21662f;
    }

    public com.airbnb.lottie.model.animatable.c e() {
        return this.f21659c;
    }

    public GradientType f() {
        return this.f21658b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.f21665i;
    }

    public List<com.airbnb.lottie.model.animatable.b> h() {
        return this.f21667k;
    }

    public float i() {
        return this.f21666j;
    }

    public String j() {
        return this.f21657a;
    }

    public com.airbnb.lottie.model.animatable.d k() {
        return this.f21660d;
    }

    public com.airbnb.lottie.model.animatable.f l() {
        return this.f21661e;
    }

    public com.airbnb.lottie.model.animatable.b m() {
        return this.f21663g;
    }

    public boolean n() {
        return this.f21669m;
    }
}
