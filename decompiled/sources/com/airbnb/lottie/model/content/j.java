package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21683a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f21684b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21685c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.a f21686d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.d f21687e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21688f;

    public j(String str, boolean z3, Path.FillType fillType, @P com.airbnb.lottie.model.animatable.a aVar, @P com.airbnb.lottie.model.animatable.d dVar, boolean z4) {
        this.f21685c = str;
        this.f21683a = z3;
        this.f21684b = fillType;
        this.f21686d = aVar;
        this.f21687e = dVar;
        this.f21688f = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(jVar, bVar, this);
    }

    @P
    public com.airbnb.lottie.model.animatable.a b() {
        return this.f21686d;
    }

    public Path.FillType c() {
        return this.f21684b;
    }

    public String d() {
        return this.f21685c;
    }

    @P
    public com.airbnb.lottie.model.animatable.d e() {
        return this.f21687e;
    }

    public boolean f() {
        return this.f21688f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f21683a + '}';
    }
}
