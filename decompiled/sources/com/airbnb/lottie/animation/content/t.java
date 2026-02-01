package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class t implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f21351a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21352b;

    /* renamed from: c, reason: collision with root package name */
    private final List<a.b> f21353c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final ShapeTrimPath.Type f21354d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21355e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21356f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21357g;

    public t(com.airbnb.lottie.model.layer.b bVar, ShapeTrimPath shapeTrimPath) {
        this.f21351a = shapeTrimPath.c();
        this.f21352b = shapeTrimPath.g();
        this.f21354d = shapeTrimPath.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a4 = shapeTrimPath.e().a();
        this.f21355e = a4;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = shapeTrimPath.b().a();
        this.f21356f = a5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = shapeTrimPath.d().a();
        this.f21357g = a6;
        bVar.i(a4);
        bVar.i(a5);
        bVar.i(a6);
        a4.a(this);
        a5.a(this);
        a6.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        for (int i4 = 0; i4 < this.f21353c.size(); i4++) {
            this.f21353c.get(i4).a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a.b bVar) {
        this.f21353c.add(bVar);
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> e() {
        return this.f21356f;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21351a;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> h() {
        return this.f21357g;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> i() {
        return this.f21355e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShapeTrimPath.Type j() {
        return this.f21354d;
    }

    public boolean k() {
        return this.f21352b;
    }
}
