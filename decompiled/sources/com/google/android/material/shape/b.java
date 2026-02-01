package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f33090a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33091b;

    public b(float f4, @N d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f33090a;
            f4 += ((b) dVar).f33091b;
        }
        this.f33090a = dVar;
        this.f33091b = f4;
    }

    @Override // com.google.android.material.shape.d
    public float a(@N RectF rectF) {
        return Math.max(0.0f, this.f33090a.a(rectF) + this.f33091b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f33090a.equals(bVar.f33090a) && this.f33091b == bVar.f33091b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33090a, Float.valueOf(this.f33091b)});
    }
}
