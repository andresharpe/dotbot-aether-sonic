package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.P;
import java.util.Collections;

/* loaded from: classes.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    private final A f21416i;

    public q(com.airbnb.lottie.value.j<A> jVar) {
        this(jVar, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public A h() {
        com.airbnb.lottie.value.j<A> jVar = this.f21362e;
        A a4 = this.f21416i;
        return jVar.b(0.0f, 0.0f, a4, a4, f(), f(), f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    A i(com.airbnb.lottie.value.a<K> aVar, float f4) {
        return h();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void k() {
        if (this.f21362e != null) {
            super.k();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f4) {
        this.f21361d = f4;
    }

    public q(com.airbnb.lottie.value.j<A> jVar, @P A a4) {
        super(Collections.emptyList());
        n(jVar);
        this.f21416i = a4;
    }
}
