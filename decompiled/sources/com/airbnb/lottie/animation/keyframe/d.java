package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class d extends g<Float> {
    public d(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(com.airbnb.lottie.value.a<Float> aVar, float f4) {
        Float f5;
        if (aVar.f23312b != null && aVar.f23313c != null) {
            com.airbnb.lottie.value.j<A> jVar = this.f21362e;
            if (jVar != 0 && (f5 = (Float) jVar.b(aVar.f23317g, aVar.f23318h.floatValue(), aVar.f23312b, aVar.f23313c, f4, e(), f())) != null) {
                return f5.floatValue();
            }
            return com.airbnb.lottie.utils.i.k(aVar.f(), aVar.c(), f4);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(com.airbnb.lottie.value.a<Float> aVar, float f4) {
        return Float.valueOf(q(aVar, f4));
    }
}
