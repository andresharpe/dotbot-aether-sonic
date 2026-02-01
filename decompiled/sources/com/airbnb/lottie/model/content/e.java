package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final GradientType f21647a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f21648b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f21649c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f21650d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f21651e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f21652f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21653g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.b f21654h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.b f21655i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21656j;

    public e(String str, GradientType gradientType, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z3) {
        this.f21647a = gradientType;
        this.f21648b = fillType;
        this.f21649c = cVar;
        this.f21650d = dVar;
        this.f21651e = fVar;
        this.f21652f = fVar2;
        this.f21653g = str;
        this.f21654h = bVar;
        this.f21655i = bVar2;
        this.f21656j = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(jVar, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.f b() {
        return this.f21652f;
    }

    public Path.FillType c() {
        return this.f21648b;
    }

    public com.airbnb.lottie.model.animatable.c d() {
        return this.f21649c;
    }

    public GradientType e() {
        return this.f21647a;
    }

    public String f() {
        return this.f21653g;
    }

    public com.airbnb.lottie.model.animatable.d g() {
        return this.f21650d;
    }

    public com.airbnb.lottie.model.animatable.f h() {
        return this.f21651e;
    }

    public boolean i() {
        return this.f21656j;
    }
}
