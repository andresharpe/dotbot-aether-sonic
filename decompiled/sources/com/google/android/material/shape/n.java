package com.google.android.material.shape;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public class n extends e {

    /* renamed from: a, reason: collision with root package name */
    float f33161a;

    public n() {
        this.f33161a = -1.0f;
    }

    @Override // com.google.android.material.shape.e
    public void b(@N q qVar, float f4, float f5, float f6) {
        qVar.q(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        float f7 = f6 * 2.0f * f5;
        qVar.a(0.0f, 0.0f, f7, f7, 180.0f, f4);
    }

    @Deprecated
    public n(float f4) {
        this.f33161a = f4;
    }
}
