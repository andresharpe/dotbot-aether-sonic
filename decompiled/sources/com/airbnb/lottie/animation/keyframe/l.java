package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.value.k f21393i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f21393i = new com.airbnb.lottie.value.k();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k i(com.airbnb.lottie.value.a<com.airbnb.lottie.value.k> aVar, float f4) {
        com.airbnb.lottie.value.k kVar;
        com.airbnb.lottie.value.k kVar2;
        com.airbnb.lottie.value.k kVar3 = aVar.f23312b;
        if (kVar3 != null && (kVar = aVar.f23313c) != null) {
            com.airbnb.lottie.value.k kVar4 = kVar3;
            com.airbnb.lottie.value.k kVar5 = kVar;
            com.airbnb.lottie.value.j<A> jVar = this.f21362e;
            if (jVar != 0 && (kVar2 = (com.airbnb.lottie.value.k) jVar.b(aVar.f23317g, aVar.f23318h.floatValue(), kVar4, kVar5, f4, e(), f())) != null) {
                return kVar2;
            }
            this.f21393i.d(com.airbnb.lottie.utils.i.k(kVar4.b(), kVar5.b(), f4), com.airbnb.lottie.utils.i.k(kVar4.c(), kVar5.c(), f4));
            return this.f21393i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
