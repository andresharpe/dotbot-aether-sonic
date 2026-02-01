package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.r;

/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21692a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21693b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f21694c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21695d;

    public l(String str, int i4, com.airbnb.lottie.model.animatable.h hVar, boolean z3) {
        this.f21692a = str;
        this.f21693b = i4;
        this.f21694c = hVar;
        this.f21695d = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new r(jVar, bVar, this);
    }

    public String b() {
        return this.f21692a;
    }

    public com.airbnb.lottie.model.animatable.h c() {
        return this.f21694c;
    }

    public boolean d() {
        return this.f21695d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f21692a + ", index=" + this.f21693b + '}';
    }
}
