package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f21392i;

    public k(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f21392i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f4) {
        return j(aVar, f4, f4, f4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF j(com.airbnb.lottie.value.a<PointF> aVar, float f4, float f5, float f6) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f23312b;
        if (pointF3 != null && (pointF = aVar.f23313c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            com.airbnb.lottie.value.j<A> jVar = this.f21362e;
            if (jVar != 0 && (pointF2 = (PointF) jVar.b(aVar.f23317g, aVar.f23318h.floatValue(), pointF4, pointF5, f4, e(), f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f21392i;
            float f7 = pointF4.x;
            float f8 = f7 + (f5 * (pointF5.x - f7));
            float f9 = pointF4.y;
            pointF6.set(f8, f9 + (f6 * (pointF5.y - f9)));
            return this.f21392i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
