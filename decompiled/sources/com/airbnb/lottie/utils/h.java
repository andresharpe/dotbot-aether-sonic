package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private float f23295a;

    /* renamed from: b, reason: collision with root package name */
    private int f23296b;

    public void a(float f4) {
        float f5 = this.f23295a + f4;
        this.f23295a = f5;
        int i4 = this.f23296b + 1;
        this.f23296b = i4;
        if (i4 == Integer.MAX_VALUE) {
            this.f23295a = f5 / 2.0f;
            this.f23296b = i4 / 2;
        }
    }

    public float b() {
        int i4 = this.f23296b;
        if (i4 == 0) {
            return 0.0f;
        }
        return this.f23295a / i4;
    }
}
