package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f21388i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f21389j;

    /* renamed from: k, reason: collision with root package name */
    private final PathMeasure f21390k;

    /* renamed from: l, reason: collision with root package name */
    private i f21391l;

    public j(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f21388i = new PointF();
        this.f21389j = new float[2];
        this.f21390k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f4) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j4 = iVar.j();
        if (j4 == null) {
            return aVar.f23312b;
        }
        com.airbnb.lottie.value.j<A> jVar = this.f21362e;
        if (jVar != 0 && (pointF = (PointF) jVar.b(iVar.f23317g, iVar.f23318h.floatValue(), (PointF) iVar.f23312b, (PointF) iVar.f23313c, e(), f4, f())) != null) {
            return pointF;
        }
        if (this.f21391l != iVar) {
            this.f21390k.setPath(j4, false);
            this.f21391l = iVar;
        }
        PathMeasure pathMeasure = this.f21390k;
        pathMeasure.getPosTan(f4 * pathMeasure.getLength(), this.f21389j, null);
        PointF pointF2 = this.f21388i;
        float[] fArr = this.f21389j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f21388i;
    }
}
