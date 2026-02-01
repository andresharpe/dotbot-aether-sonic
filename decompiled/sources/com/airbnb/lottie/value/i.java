package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.N;

/* loaded from: classes.dex */
public class i extends j<PointF> {

    /* renamed from: d, reason: collision with root package name */
    private final PointF f23338d;

    public i() {
        this.f23338d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF e(b<PointF> bVar) {
        T t3 = this.f23341c;
        if (t3 != 0) {
            return (PointF) t3;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PointF a(b<PointF> bVar) {
        this.f23338d.set(com.airbnb.lottie.utils.i.k(bVar.g().x, bVar.b().x, bVar.c()), com.airbnb.lottie.utils.i.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF e4 = e(bVar);
        this.f23338d.offset(e4.x, e4.y);
        return this.f23338d;
    }

    public i(@N PointF pointF) {
        super(pointF);
        this.f23338d = new PointF();
    }
}
