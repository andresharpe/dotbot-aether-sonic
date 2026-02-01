package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.d f21382i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        com.airbnb.lottie.model.content.d dVar = list.get(0).f23312b;
        int c4 = dVar != null ? dVar.c() : 0;
        this.f21382i = new com.airbnb.lottie.model.content.d(new float[c4], new int[c4]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar, float f4) {
        this.f21382i.d(aVar.f23312b, aVar.f23313c, f4);
        return this.f21382i;
    }
}
