package com.airbnb.lottie.value;

import androidx.annotation.N;

/* loaded from: classes.dex */
public class g extends j<Float> {
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float e(b<Float> bVar) {
        T t3 = this.f23341c;
        if (t3 != 0) {
            return (Float) t3;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float a(b<Float> bVar) {
        return Float.valueOf(com.airbnb.lottie.utils.i.k(bVar.g().floatValue(), bVar.b().floatValue(), bVar.c()) + e(bVar).floatValue());
    }

    public g(@N Float f4) {
        super(f4);
    }
}
