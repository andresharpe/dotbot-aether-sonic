package com.airbnb.lottie.model.content;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21689a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f21690b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21691c;

    public k(String str, List<c> list, boolean z3) {
        this.f21689a = str;
        this.f21690b = list;
        this.f21691c = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(jVar, bVar, this);
    }

    public List<c> b() {
        return this.f21690b;
    }

    public String c() {
        return this.f21689a;
    }

    public boolean d() {
        return this.f21691c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f21689a + "' Shapes: " + Arrays.toString(this.f21690b.toArray()) + '}';
    }
}
