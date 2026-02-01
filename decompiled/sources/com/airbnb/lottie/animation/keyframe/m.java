package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a<com.airbnb.lottie.model.content.i, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.i f21394i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f21395j;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.i>> list) {
        super(list);
        this.f21394i = new com.airbnb.lottie.model.content.i();
        this.f21395j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.i> aVar, float f4) {
        this.f21394i.c(aVar.f23312b, aVar.f23313c, f4);
        com.airbnb.lottie.utils.i.i(this.f21394i, this.f21395j);
        return this.f21395j;
    }
}
