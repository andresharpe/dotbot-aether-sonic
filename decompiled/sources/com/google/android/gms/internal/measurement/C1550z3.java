package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1550z3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i4, C1542y3 c1542y3) throws zzko {
        int j4 = j(bArr, i4, c1542y3);
        int i5 = c1542y3.f29840a;
        if (i5 >= 0) {
            if (i5 <= bArr.length - j4) {
                if (i5 == 0) {
                    c1542y3.f29842c = zzjd.f29849F;
                    return j4;
                }
                c1542y3.f29842c = zzjd.o(bArr, j4, i5);
                return j4 + i5;
            }
            throw zzko.f();
        }
        throw zzko.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i4) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(InterfaceC1353a5 interfaceC1353a5, byte[] bArr, int i4, int i5, int i6, C1542y3 c1542y3) throws IOException {
        S4 s4 = (S4) interfaceC1353a5;
        Object zze = s4.zze();
        int w3 = s4.w(zze, bArr, i4, i5, i6, c1542y3);
        s4.zzf(zze);
        c1542y3.f29842c = zze;
        return w3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(InterfaceC1353a5 interfaceC1353a5, byte[] bArr, int i4, int i5, C1542y3 c1542y3) throws IOException {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = k(i7, bArr, i6, c1542y3);
            i7 = c1542y3.f29840a;
        }
        int i8 = i6;
        if (i7 >= 0 && i7 <= i5 - i8) {
            Object zze = interfaceC1353a5.zze();
            int i9 = i7 + i8;
            interfaceC1353a5.b(zze, bArr, i8, i9, c1542y3);
            interfaceC1353a5.zzf(zze);
            c1542y3.f29842c = zze;
            return i9;
        }
        throw zzko.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(InterfaceC1353a5 interfaceC1353a5, int i4, byte[] bArr, int i5, int i6, InterfaceC1495s4 interfaceC1495s4, C1542y3 c1542y3) throws IOException {
        int d4 = d(interfaceC1353a5, bArr, i5, i6, c1542y3);
        interfaceC1495s4.add(c1542y3.f29842c);
        while (d4 < i6) {
            int j4 = j(bArr, d4, c1542y3);
            if (i4 != c1542y3.f29840a) {
                break;
            }
            d4 = d(interfaceC1353a5, bArr, j4, i6, c1542y3);
            interfaceC1495s4.add(c1542y3.f29842c);
        }
        return d4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(byte[] bArr, int i4, InterfaceC1495s4 interfaceC1495s4, C1542y3 c1542y3) throws IOException {
        C1448m4 c1448m4 = (C1448m4) interfaceC1495s4;
        int j4 = j(bArr, i4, c1542y3);
        int i5 = c1542y3.f29840a + j4;
        while (j4 < i5) {
            j4 = j(bArr, j4, c1542y3);
            c1448m4.zzh(c1542y3.f29840a);
        }
        if (j4 == i5) {
            return j4;
        }
        throw zzko.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i4, C1542y3 c1542y3) throws zzko {
        int j4 = j(bArr, i4, c1542y3);
        int i5 = c1542y3.f29840a;
        if (i5 >= 0) {
            if (i5 == 0) {
                c1542y3.f29842c = "";
                return j4;
            }
            c1542y3.f29842c = new String(bArr, j4, i5, C1503t4.f29791b);
            return j4 + i5;
        }
        throw zzko.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i4, C1542y3 c1542y3) throws zzko {
        int j4 = j(bArr, i4, c1542y3);
        int i5 = c1542y3.f29840a;
        if (i5 >= 0) {
            if (i5 == 0) {
                c1542y3.f29842c = "";
                return j4;
            }
            c1542y3.f29842c = H5.d(bArr, j4, i5);
            return j4 + i5;
        }
        throw zzko.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i4, byte[] bArr, int i5, int i6, C1496s5 c1496s5, C1542y3 c1542y3) throws zzko {
        if ((i4 >>> 3) != 0) {
            int i7 = i4 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 5) {
                                c1496s5.h(i4, Integer.valueOf(b(bArr, i5)));
                                return i5 + 4;
                            }
                            throw zzko.b();
                        }
                        int i8 = (i4 & (-8)) | 4;
                        C1496s5 e4 = C1496s5.e();
                        int i9 = 0;
                        while (true) {
                            if (i5 >= i6) {
                                break;
                            }
                            int j4 = j(bArr, i5, c1542y3);
                            int i10 = c1542y3.f29840a;
                            if (i10 == i8) {
                                i9 = i10;
                                i5 = j4;
                                break;
                            }
                            i9 = i10;
                            i5 = i(i10, bArr, j4, i6, e4, c1542y3);
                        }
                        if (i5 <= i6 && i9 == i8) {
                            c1496s5.h(i4, e4);
                            return i5;
                        }
                        throw zzko.e();
                    }
                    int j5 = j(bArr, i5, c1542y3);
                    int i11 = c1542y3.f29840a;
                    if (i11 >= 0) {
                        if (i11 <= bArr.length - j5) {
                            if (i11 == 0) {
                                c1496s5.h(i4, zzjd.f29849F);
                            } else {
                                c1496s5.h(i4, zzjd.o(bArr, j5, i11));
                            }
                            return j5 + i11;
                        }
                        throw zzko.f();
                    }
                    throw zzko.d();
                }
                c1496s5.h(i4, Long.valueOf(n(bArr, i5)));
                return i5 + 8;
            }
            int m4 = m(bArr, i5, c1542y3);
            c1496s5.h(i4, Long.valueOf(c1542y3.f29841b));
            return m4;
        }
        throw zzko.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i4, C1542y3 c1542y3) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 >= 0) {
            c1542y3.f29840a = b4;
            return i5;
        }
        return k(b4, bArr, i5, c1542y3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i4, byte[] bArr, int i5, C1542y3 c1542y3) {
        int i6 = i4 & kotlinx.coroutines.scheduling.q.f54649c;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            c1542y3.f29840a = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            c1542y3.f29840a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c1542y3.f29840a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c1542y3.f29840a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] < 0) {
                i13 = i15;
            } else {
                c1542y3.f29840a = i14;
                return i15;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i4, byte[] bArr, int i5, int i6, InterfaceC1495s4 interfaceC1495s4, C1542y3 c1542y3) {
        C1448m4 c1448m4 = (C1448m4) interfaceC1495s4;
        int j4 = j(bArr, i5, c1542y3);
        c1448m4.zzh(c1542y3.f29840a);
        while (j4 < i6) {
            int j5 = j(bArr, j4, c1542y3);
            if (i4 != c1542y3.f29840a) {
                break;
            }
            j4 = j(bArr, j5, c1542y3);
            c1448m4.zzh(c1542y3.f29840a);
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(byte[] bArr, int i4, C1542y3 c1542y3) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 >= 0) {
            c1542y3.f29841b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        c1542y3.f29841b = j5;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long n(byte[] bArr, int i4) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }
}
