package com.google.android.material.shape;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public class t extends g {

    /* renamed from: E, reason: collision with root package name */
    private final float f33244E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f33245F;

    public t(float f4, boolean z3) {
        this.f33244E = f4;
        this.f33245F = z3;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f4, float f5, float f6, @N q qVar) {
        float f7;
        qVar.n(f5 - (this.f33244E * f6), 0.0f);
        if (this.f33245F) {
            f7 = this.f33244E;
        } else {
            f7 = -this.f33244E;
        }
        qVar.n(f5, f7 * f6);
        qVar.n(f5 + (this.f33244E * f6), 0.0f);
        qVar.n(f4, 0.0f);
    }
}
