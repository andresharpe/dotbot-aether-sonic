package com.google.android.material.shape;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public final class i extends g {

    /* renamed from: E, reason: collision with root package name */
    private final float f33102E;

    public i(float f4) {
        this.f33102E = f4 - 0.001f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.g
    public boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f4, float f5, float f6, @N q qVar) {
        float sqrt = (float) ((this.f33102E * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.f33102E, 2.0d) - Math.pow(sqrt, 2.0d));
        qVar.p(f5 - sqrt, ((float) (-((this.f33102E * Math.sqrt(2.0d)) - this.f33102E))) + sqrt2);
        qVar.n(f5, (float) (-((this.f33102E * Math.sqrt(2.0d)) - this.f33102E)));
        qVar.n(f5 + sqrt, ((float) (-((this.f33102E * Math.sqrt(2.0d)) - this.f33102E))) + sqrt2);
    }
}
