package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.p;

/* loaded from: classes.dex */
public class l implements com.airbnb.lottie.animation.content.m, com.airbnb.lottie.model.content.c {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final e f21583a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final m<PointF, PointF> f21584b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final g f21585c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final b f21586d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final d f21587e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private final b f21588f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final b f21589g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final b f21590h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private final b f21591i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.c
    @P
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    @P
    public e c() {
        return this.f21583a;
    }

    @P
    public b d() {
        return this.f21591i;
    }

    @P
    public d e() {
        return this.f21587e;
    }

    @P
    public m<PointF, PointF> f() {
        return this.f21584b;
    }

    @P
    public b g() {
        return this.f21586d;
    }

    @P
    public g h() {
        return this.f21585c;
    }

    @P
    public b i() {
        return this.f21588f;
    }

    @P
    public b j() {
        return this.f21589g;
    }

    @P
    public b k() {
        return this.f21590h;
    }

    public l(@P e eVar, @P m<PointF, PointF> mVar, @P g gVar, @P b bVar, @P d dVar, @P b bVar2, @P b bVar3, @P b bVar4, @P b bVar5) {
        this.f21583a = eVar;
        this.f21584b = mVar;
        this.f21585c = gVar;
        this.f21586d = bVar;
        this.f21587e = dVar;
        this.f21590h = bVar2;
        this.f21591i = bVar3;
        this.f21588f = bVar4;
        this.f21589g = bVar5;
    }
}
