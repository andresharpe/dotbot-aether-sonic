package com.airbnb.lottie.value;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private float f23342a;

    /* renamed from: b, reason: collision with root package name */
    private float f23343b;

    public k(float f4, float f5) {
        this.f23342a = f4;
        this.f23343b = f5;
    }

    public boolean a(float f4, float f5) {
        if (this.f23342a == f4 && this.f23343b == f5) {
            return true;
        }
        return false;
    }

    public float b() {
        return this.f23342a;
    }

    public float c() {
        return this.f23343b;
    }

    public void d(float f4, float f5) {
        this.f23342a = f4;
        this.f23343b = f5;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
