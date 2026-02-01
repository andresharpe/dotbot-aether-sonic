package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1496s5 {

    /* renamed from: f, reason: collision with root package name */
    private static final C1496s5 f29776f = new C1496s5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f29777a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f29778b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f29779c;

    /* renamed from: d, reason: collision with root package name */
    private int f29780d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29781e;

    private C1496s5(int i4, int[] iArr, Object[] objArr, boolean z3) {
        this.f29780d = -1;
        this.f29777a = i4;
        this.f29778b = iArr;
        this.f29779c = objArr;
        this.f29781e = z3;
    }

    public static C1496s5 c() {
        return f29776f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1496s5 d(C1496s5 c1496s5, C1496s5 c1496s52) {
        int i4 = c1496s5.f29777a + c1496s52.f29777a;
        int[] copyOf = Arrays.copyOf(c1496s5.f29778b, i4);
        System.arraycopy(c1496s52.f29778b, 0, copyOf, c1496s5.f29777a, c1496s52.f29777a);
        Object[] copyOf2 = Arrays.copyOf(c1496s5.f29779c, i4);
        System.arraycopy(c1496s52.f29779c, 0, copyOf2, c1496s5.f29777a, c1496s52.f29777a);
        return new C1496s5(i4, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1496s5 e() {
        return new C1496s5(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int a4;
        int b4;
        int i4;
        int i5 = this.f29780d;
        if (i5 == -1) {
            int i6 = 0;
            for (int i7 = 0; i7 < this.f29777a; i7++) {
                int i8 = this.f29778b[i7];
                int i9 = i8 >>> 3;
                int i10 = i8 & 7;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 5) {
                                    ((Integer) this.f29779c[i7]).intValue();
                                    i4 = S3.a(i9 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzko.a());
                                }
                            } else {
                                int D3 = S3.D(i9);
                                a4 = D3 + D3;
                                b4 = ((C1496s5) this.f29779c[i7]).a();
                            }
                        } else {
                            zzjd zzjdVar = (zzjd) this.f29779c[i7];
                            int a5 = S3.a(i9 << 3);
                            int d4 = zzjdVar.d();
                            i6 += a5 + S3.a(d4) + d4;
                        }
                    } else {
                        ((Long) this.f29779c[i7]).longValue();
                        i4 = S3.a(i9 << 3) + 8;
                    }
                    i6 += i4;
                } else {
                    long longValue = ((Long) this.f29779c[i7]).longValue();
                    a4 = S3.a(i9 << 3);
                    b4 = S3.b(longValue);
                }
                i4 = a4 + b4;
                i6 += i4;
            }
            this.f29780d = i6;
            return i6;
        }
        return i5;
    }

    public final int b() {
        int i4 = this.f29780d;
        if (i4 == -1) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.f29777a; i6++) {
                int i7 = this.f29778b[i6];
                zzjd zzjdVar = (zzjd) this.f29779c[i6];
                int a4 = S3.a(8);
                int d4 = zzjdVar.d();
                i5 += a4 + a4 + S3.a(16) + S3.a(i7 >>> 3) + S3.a(24) + S3.a(d4) + d4;
            }
            this.f29780d = i5;
            return i5;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1496s5)) {
            return false;
        }
        C1496s5 c1496s5 = (C1496s5) obj;
        int i4 = this.f29777a;
        if (i4 == c1496s5.f29777a) {
            int[] iArr = this.f29778b;
            int[] iArr2 = c1496s5.f29778b;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (iArr[i5] != iArr2[i5]) {
                        break;
                    }
                    i5++;
                } else {
                    Object[] objArr = this.f29779c;
                    Object[] objArr2 = c1496s5.f29779c;
                    int i6 = this.f29777a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        this.f29781e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.f29777a; i5++) {
            R4.b(sb, i4, String.valueOf(this.f29778b[i5] >>> 3), this.f29779c[i5]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i4, Object obj) {
        int i5;
        if (this.f29781e) {
            int i6 = this.f29777a;
            int[] iArr = this.f29778b;
            if (i6 == iArr.length) {
                if (i6 < 4) {
                    i5 = 8;
                } else {
                    i5 = i6 >> 1;
                }
                int i7 = i6 + i5;
                this.f29778b = Arrays.copyOf(iArr, i7);
                this.f29779c = Arrays.copyOf(this.f29779c, i7);
            }
            int[] iArr2 = this.f29778b;
            int i8 = this.f29777a;
            iArr2[i8] = i4;
            this.f29779c[i8] = obj;
            this.f29777a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i4 = this.f29777a;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.f29778b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.f29779c;
        int i10 = this.f29777a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final void i(I5 i5) throws IOException {
        if (this.f29777a != 0) {
            for (int i4 = 0; i4 < this.f29777a; i4++) {
                int i6 = this.f29778b[i4];
                Object obj = this.f29779c[i4];
                int i7 = i6 >>> 3;
                int i8 = i6 & 7;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 == 5) {
                                    i5.d(i7, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzko.a());
                                }
                            } else {
                                i5.D(i7);
                                ((C1496s5) obj).i(i5);
                                i5.zzh(i7);
                            }
                        } else {
                            i5.q(i7, (zzjd) obj);
                        }
                    } else {
                        i5.G(i7, ((Long) obj).longValue());
                    }
                } else {
                    i5.h(i7, ((Long) obj).longValue());
                }
            }
        }
    }

    private C1496s5() {
        this(0, new int[8], new Object[8], true);
    }
}
