package com.google.android.material.shape;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public final class l extends g {

    /* renamed from: E, reason: collision with root package name */
    private final g f33158E;

    /* renamed from: F, reason: collision with root package name */
    private final float f33159F;

    public l(@N g gVar, float f4) {
        this.f33158E = gVar;
        this.f33159F = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.g
    public boolean a() {
        return this.f33158E.a();
    }

    @Override // com.google.android.material.shape.g
    public void b(float f4, float f5, float f6, @N q qVar) {
        this.f33158E.b(f4, f5 - this.f33159F, f6, qVar);
    }
}
