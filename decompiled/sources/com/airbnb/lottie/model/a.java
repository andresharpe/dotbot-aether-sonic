package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f21573a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f21574b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f21575c;

    public a() {
        this.f21573a = new PointF();
        this.f21574b = new PointF();
        this.f21575c = new PointF();
    }

    public PointF a() {
        return this.f21573a;
    }

    public PointF b() {
        return this.f21574b;
    }

    public PointF c() {
        return this.f21575c;
    }

    public void d(float f4, float f5) {
        this.f21573a.set(f4, f5);
    }

    public void e(float f4, float f5) {
        this.f21574b.set(f4, f5);
    }

    public void f(float f4, float f5) {
        this.f21575c.set(f4, f5);
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f21573a = pointF;
        this.f21574b = pointF2;
        this.f21575c = pointF3;
    }
}
