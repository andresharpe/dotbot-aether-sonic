package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class F5 extends D5 {
    @Override // com.google.android.gms.internal.measurement.D5
    final int a(int i4, byte[] bArr, int i5, int i6) {
        while (i5 < i6 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i6) {
            return 0;
        }
        while (i5 < i6) {
            int i7 = i5 + 1;
            byte b4 = bArr[i5];
            if (b4 < 0) {
                if (b4 < -32) {
                    if (i7 < i6) {
                        if (b4 >= -62) {
                            i5 += 2;
                            if (bArr[i7] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b4;
                }
                if (b4 < -16) {
                    if (i7 >= i6 - 1) {
                        return H5.a(bArr, i7, i6);
                    }
                    int i8 = i5 + 2;
                    byte b5 = bArr[i7];
                    if (b5 <= -65 && ((b4 != -32 || b5 >= -96) && (b4 != -19 || b5 < -96))) {
                        i5 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (i7 >= i6 - 2) {
                    return H5.a(bArr, i7, i6);
                }
                int i9 = i5 + 2;
                byte b6 = bArr[i7];
                if (b6 <= -65 && (((b4 << 28) + (b6 + com.harman.sdk.utils.k.f48602N0)) >> 30) == 0) {
                    int i10 = i5 + 3;
                    if (bArr[i9] <= -65) {
                        i5 += 4;
                        if (bArr[i10] > -65) {
                        }
                    }
                }
                return -1;
            }
            i5 = i7;
        }
        return 0;
    }
}
