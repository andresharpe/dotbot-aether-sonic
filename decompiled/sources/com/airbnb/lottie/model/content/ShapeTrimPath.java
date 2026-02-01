package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.t;

/* loaded from: classes.dex */
public class ShapeTrimPath implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21633a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f21634b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21635c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21636d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21637e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21638f;

    /* loaded from: classes.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type b(int i4) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i4);
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z3) {
        this.f21633a = str;
        this.f21634b = type;
        this.f21635c = bVar;
        this.f21636d = bVar2;
        this.f21637e = bVar3;
        this.f21638f = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new t(bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f21636d;
    }

    public String c() {
        return this.f21633a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f21637e;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f21635c;
    }

    public Type f() {
        return this.f21634b;
    }

    public boolean g() {
        return this.f21638f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f21635c + ", end: " + this.f21636d + ", offset: " + this.f21637e + "}";
    }
}
