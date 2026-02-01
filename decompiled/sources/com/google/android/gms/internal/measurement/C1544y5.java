package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1544y5 extends A5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1544y5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final double a(Object obj, long j4) {
        return Double.longBitsToDouble(k(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final float b(Object obj, long j4) {
        return Float.intBitsToFloat(j(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final void c(Object obj, long j4, boolean z3) {
        if (B5.f29279h) {
            B5.d(obj, j4, r3 ? (byte) 1 : (byte) 0);
        } else {
            B5.e(obj, j4, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final void d(Object obj, long j4, byte b4) {
        if (B5.f29279h) {
            B5.d(obj, j4, b4);
        } else {
            B5.e(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final void e(Object obj, long j4, double d4) {
        o(obj, j4, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final void f(Object obj, long j4, float f4) {
        n(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final boolean g(Object obj, long j4) {
        if (B5.f29279h) {
            return B5.y(obj, j4);
        }
        return B5.z(obj, j4);
    }
}
