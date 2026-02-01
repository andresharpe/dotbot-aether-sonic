package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {

    /* renamed from: s, reason: collision with root package name */
    @P
    private Path f21386s;

    /* renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.value.a<PointF> f21387t;

    public i(com.airbnb.lottie.g gVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(gVar, aVar.f23312b, aVar.f23313c, aVar.f23314d, aVar.f23315e, aVar.f23316f, aVar.f23317g, aVar.f23318h);
        this.f21387t = aVar;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        boolean z3;
        T t3;
        T t4;
        T t5 = this.f23313c;
        if (t5 != 0 && (t4 = this.f23312b) != 0 && ((PointF) t4).equals(((PointF) t5).x, ((PointF) t5).y)) {
            z3 = true;
        } else {
            z3 = false;
        }
        T t6 = this.f23312b;
        if (t6 != 0 && (t3 = this.f23313c) != 0 && !z3) {
            com.airbnb.lottie.value.a<PointF> aVar = this.f21387t;
            this.f21386s = com.airbnb.lottie.utils.j.d((PointF) t6, (PointF) t3, aVar.f23325o, aVar.f23326p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public Path j() {
        return this.f21386s;
    }
}
