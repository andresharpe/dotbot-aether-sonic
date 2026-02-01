package com.airbnb.lottie.model.content;

import androidx.annotation.P;
import com.airbnb.lottie.animation.content.q;

/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21675a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21676b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21677c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.l f21678d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21679e;

    public h(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z3) {
        this.f21675a = str;
        this.f21676b = bVar;
        this.f21677c = bVar2;
        this.f21678d = lVar;
        this.f21679e = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    @P
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new q(jVar, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f21676b;
    }

    public String c() {
        return this.f21675a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f21677c;
    }

    public com.airbnb.lottie.model.animatable.l e() {
        return this.f21678d;
    }

    public boolean f() {
        return this.f21679e;
    }
}
