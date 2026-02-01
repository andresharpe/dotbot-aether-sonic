package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.N;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f33089a;

    public a(float f4) {
        this.f33089a = f4;
    }

    @Override // com.google.android.material.shape.d
    public float a(@N RectF rectF) {
        return this.f33089a;
    }

    public float b() {
        return this.f33089a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f33089a == ((a) obj).f33089a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33089a)});
    }
}
