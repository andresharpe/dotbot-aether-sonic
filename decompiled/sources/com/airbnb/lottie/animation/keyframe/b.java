package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class b extends g<Integer> {
    public b(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(com.airbnb.lottie.value.a<Integer> aVar, float f4) {
        Integer num;
        if (aVar.f23312b != null && aVar.f23313c != null) {
            com.airbnb.lottie.value.j<A> jVar = this.f21362e;
            if (jVar != 0 && (num = (Integer) jVar.b(aVar.f23317g, aVar.f23318h.floatValue(), aVar.f23312b, aVar.f23313c, f4, e(), f())) != null) {
                return num.intValue();
            }
            return com.airbnb.lottie.utils.d.c(com.airbnb.lottie.utils.i.c(f4, 0.0f, 1.0f), aVar.f23312b.intValue(), aVar.f23313c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer i(com.airbnb.lottie.value.a<Integer> aVar, float f4) {
        return Integer.valueOf(q(aVar, f4));
    }
}
