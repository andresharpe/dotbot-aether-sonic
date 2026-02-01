package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f33160a;

    public m(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f33160a = f4;
    }

    @Override // com.google.android.material.shape.d
    public float a(@N RectF rectF) {
        return this.f33160a * rectF.height();
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public float b() {
        return this.f33160a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && this.f33160a == ((m) obj).f33160a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33160a)});
    }
}
