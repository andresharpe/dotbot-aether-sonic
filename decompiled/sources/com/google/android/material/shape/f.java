package com.google.android.material.shape;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    float f33094a;

    public f() {
        this.f33094a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void b(@N q qVar, float f4, float f5, float f6) {
        qVar.q(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        double d4 = f6;
        double d5 = f5;
        qVar.n((float) (Math.sin(Math.toRadians(f4)) * d4 * d5), (float) (Math.sin(Math.toRadians(90.0f - f4)) * d4 * d5));
    }

    @Deprecated
    public f(float f4) {
        this.f33094a = f4;
    }
}
