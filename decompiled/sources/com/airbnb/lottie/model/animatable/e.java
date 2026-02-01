package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<PointF>> f21576a;

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.f21576a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a() {
        if (this.f21576a.get(0).h()) {
            return new com.airbnb.lottie.animation.keyframe.k(this.f21576a);
        }
        return new com.airbnb.lottie.animation.keyframe.j(this.f21576a);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> b() {
        return this.f21576a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        if (this.f21576a.size() != 1 || !this.f21576a.get(0).h()) {
            return false;
        }
        return true;
    }
}
