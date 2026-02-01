package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final b f21577a;

    /* renamed from: b, reason: collision with root package name */
    private final b f21578b;

    public i(b bVar, b bVar2) {
        this.f21577a = bVar;
        this.f21578b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f21577a.a(), this.f21578b.a());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        if (this.f21577a.c() && this.f21578b.c()) {
            return true;
        }
        return false;
    }
}
