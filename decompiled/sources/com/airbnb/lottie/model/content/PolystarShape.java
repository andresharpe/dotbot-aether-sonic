package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.animation.content.o;

/* loaded from: classes.dex */
public class PolystarShape implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21611a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f21612b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21613c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f21614d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21615e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21616f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21617g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21618h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21619i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21620j;

    /* loaded from: classes.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i4) {
            this.value = i4;
        }

        public static Type b(int i4) {
            for (Type type : values()) {
                if (type.value == i4) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z3) {
        this.f21611a = str;
        this.f21612b = type;
        this.f21613c = bVar;
        this.f21614d = mVar;
        this.f21615e = bVar2;
        this.f21616f = bVar3;
        this.f21617g = bVar4;
        this.f21618h = bVar5;
        this.f21619i = bVar6;
        this.f21620j = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new o(jVar, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f21616f;
    }

    public com.airbnb.lottie.model.animatable.b c() {
        return this.f21618h;
    }

    public String d() {
        return this.f21611a;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f21617g;
    }

    public com.airbnb.lottie.model.animatable.b f() {
        return this.f21619i;
    }

    public com.airbnb.lottie.model.animatable.b g() {
        return this.f21613c;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> h() {
        return this.f21614d;
    }

    public com.airbnb.lottie.model.animatable.b i() {
        return this.f21615e;
    }

    public Type j() {
        return this.f21612b;
    }

    public boolean k() {
        return this.f21620j;
    }
}
