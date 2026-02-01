package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f21645a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f21646b;

    public d(float[] fArr, int[] iArr) {
        this.f21645a = fArr;
        this.f21646b = iArr;
    }

    public int[] a() {
        return this.f21646b;
    }

    public float[] b() {
        return this.f21645a;
    }

    public int c() {
        return this.f21646b.length;
    }

    public void d(d dVar, d dVar2, float f4) {
        if (dVar.f21646b.length == dVar2.f21646b.length) {
            for (int i4 = 0; i4 < dVar.f21646b.length; i4++) {
                this.f21645a[i4] = com.airbnb.lottie.utils.i.k(dVar.f21645a[i4], dVar2.f21645a[i4], f4);
                this.f21646b[i4] = com.airbnb.lottie.utils.d.c(f4, dVar.f21646b[i4], dVar2.f21646b[i4]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f21646b.length + " vs " + dVar2.f21646b.length + ")");
    }
}
