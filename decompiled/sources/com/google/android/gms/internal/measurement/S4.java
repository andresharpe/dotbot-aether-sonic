package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.C0755c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S4<T> implements InterfaceC1353a5<T> {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f29479p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    private static final Unsafe f29480q = B5.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f29481a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f29482b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29483c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29484d;

    /* renamed from: e, reason: collision with root package name */
    private final P4 f29485e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29486f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f29487g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f29488h;

    /* renamed from: i, reason: collision with root package name */
    private final int f29489i;

    /* renamed from: j, reason: collision with root package name */
    private final int f29490j;

    /* renamed from: k, reason: collision with root package name */
    private final D4 f29491k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC1488r5 f29492l;

    /* renamed from: m, reason: collision with root package name */
    private final Y3 f29493m;

    /* renamed from: n, reason: collision with root package name */
    private final U4 f29494n;

    /* renamed from: o, reason: collision with root package name */
    private final K4 f29495o;

    private S4(int[] iArr, Object[] objArr, int i4, int i5, P4 p4, boolean z3, boolean z4, int[] iArr2, int i6, int i7, U4 u4, D4 d4, AbstractC1488r5 abstractC1488r5, Y3 y3, K4 k4, byte[] bArr) {
        this.f29481a = iArr;
        this.f29482b = objArr;
        this.f29483c = i4;
        this.f29484d = i5;
        this.f29487g = z3;
        boolean z5 = false;
        if (y3 != null && y3.c(p4)) {
            z5 = true;
        }
        this.f29486f = z5;
        this.f29488h = iArr2;
        this.f29489i = i6;
        this.f29490j = i7;
        this.f29494n = u4;
        this.f29491k = d4;
        this.f29492l = abstractC1488r5;
        this.f29493m = y3;
        this.f29485e = p4;
        this.f29495o = k4;
    }

    private static double A(Object obj, long j4) {
        return ((Double) B5.k(obj, j4)).doubleValue();
    }

    private static float B(Object obj, long j4) {
        return ((Float) B5.k(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003a. Please report as an issue. */
    private final int C(Object obj) {
        int i4;
        int a4;
        int a5;
        int a6;
        int b4;
        int a7;
        int z3;
        int a8;
        int a9;
        int d4;
        int a10;
        int i5;
        int W3;
        boolean z4;
        int F3;
        int K3;
        int D3;
        int a11;
        int i6;
        int a12;
        int a13;
        int a14;
        int b5;
        int a15;
        int d5;
        int a16;
        int i7;
        Unsafe unsafe = f29480q;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < this.f29481a.length) {
            int d6 = d(i10);
            int[] iArr = this.f29481a;
            int i13 = iArr[i10];
            int c4 = c(d6);
            if (c4 <= 17) {
                int i14 = iArr[i10 + 2];
                int i15 = i14 & i8;
                i4 = 1 << (i14 >>> 20);
                if (i15 != i9) {
                    i12 = unsafe.getInt(obj, i15);
                    i9 = i15;
                }
            } else {
                i4 = 0;
            }
            long j4 = d6 & i8;
            switch (c4) {
                case 0:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a4 = S3.a(i13 << 3);
                        a8 = a4 + 8;
                        i11 += a8;
                        break;
                    }
                case 1:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a5 = S3.a(i13 << 3);
                        a8 = a5 + 4;
                        i11 += a8;
                        break;
                    }
                case 2:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j4);
                        a6 = S3.a(i13 << 3);
                        b4 = S3.b(j5);
                        i11 += a6 + b4;
                        break;
                    }
                case 3:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        long j6 = unsafe.getLong(obj, j4);
                        a6 = S3.a(i13 << 3);
                        b4 = S3.b(j6);
                        i11 += a6 + b4;
                        break;
                    }
                case 4:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j4);
                        a7 = S3.a(i13 << 3);
                        z3 = S3.z(i16);
                        i5 = a7 + z3;
                        i11 += i5;
                        break;
                    }
                case 5:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a4 = S3.a(i13 << 3);
                        a8 = a4 + 8;
                        i11 += a8;
                        break;
                    }
                case 6:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a5 = S3.a(i13 << 3);
                        a8 = a5 + 4;
                        i11 += a8;
                        break;
                    }
                case 7:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a8 = S3.a(i13 << 3) + 1;
                        i11 += a8;
                        break;
                    }
                case 8:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzjd) {
                            a9 = S3.a(i13 << 3);
                            d4 = ((zzjd) object).d();
                            a10 = S3.a(d4);
                            i5 = a9 + a10 + d4;
                            i11 += i5;
                            break;
                        } else {
                            a7 = S3.a(i13 << 3);
                            z3 = S3.C((String) object);
                            i5 = a7 + z3;
                            i11 += i5;
                        }
                    }
                case 9:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a8 = C1369c5.Q(i13, unsafe.getObject(obj, j4), g(i10));
                        i11 += a8;
                        break;
                    }
                case 10:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        zzjd zzjdVar = (zzjd) unsafe.getObject(obj, j4);
                        a9 = S3.a(i13 << 3);
                        d4 = zzjdVar.d();
                        a10 = S3.a(d4);
                        i5 = a9 + a10 + d4;
                        i11 += i5;
                        break;
                    }
                case 11:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j4);
                        a7 = S3.a(i13 << 3);
                        z3 = S3.a(i17);
                        i5 = a7 + z3;
                        i11 += i5;
                        break;
                    }
                case 12:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j4);
                        a7 = S3.a(i13 << 3);
                        z3 = S3.z(i18);
                        i5 = a7 + z3;
                        i11 += i5;
                        break;
                    }
                case 13:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a5 = S3.a(i13 << 3);
                        a8 = a5 + 4;
                        i11 += a8;
                        break;
                    }
                case 14:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a4 = S3.a(i13 << 3);
                        a8 = a4 + 8;
                        i11 += a8;
                        break;
                    }
                case 15:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        int i19 = unsafe.getInt(obj, j4);
                        a7 = S3.a(i13 << 3);
                        z3 = S3.a((i19 >> 31) ^ (i19 + i19));
                        i5 = a7 + z3;
                        i11 += i5;
                        break;
                    }
                case 16:
                    if ((i4 & i12) == 0) {
                        break;
                    } else {
                        long j7 = unsafe.getLong(obj, j4);
                        i11 += S3.a(i13 << 3) + S3.b((j7 >> 63) ^ (j7 + j7));
                        break;
                    }
                case 17:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        a8 = S3.y(i13, (P4) unsafe.getObject(obj, j4), g(i10));
                        i11 += a8;
                        break;
                    }
                case 18:
                    a8 = C1369c5.J(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 19:
                    a8 = C1369c5.H(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 20:
                    a8 = C1369c5.O(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 21:
                    a8 = C1369c5.Z(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 22:
                    a8 = C1369c5.M(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 23:
                    a8 = C1369c5.J(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 24:
                    a8 = C1369c5.H(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 25:
                    a8 = C1369c5.A(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += a8;
                    break;
                case 26:
                    W3 = C1369c5.W(i13, (List) unsafe.getObject(obj, j4));
                    i11 += W3;
                    break;
                case 27:
                    W3 = C1369c5.R(i13, (List) unsafe.getObject(obj, j4), g(i10));
                    i11 += W3;
                    break;
                case 28:
                    W3 = C1369c5.E(i13, (List) unsafe.getObject(obj, j4));
                    i11 += W3;
                    break;
                case ConstraintLayout.b.a.f9571D /* 29 */:
                    W3 = C1369c5.X(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += W3;
                    break;
                case 30:
                    z4 = false;
                    F3 = C1369c5.F(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += F3;
                    break;
                case ConstraintLayout.b.a.f9573F /* 31 */:
                    z4 = false;
                    F3 = C1369c5.H(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += F3;
                    break;
                case 32:
                    z4 = false;
                    F3 = C1369c5.J(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += F3;
                    break;
                case 33:
                    z4 = false;
                    F3 = C1369c5.S(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += F3;
                    break;
                case 34:
                    z4 = false;
                    F3 = C1369c5.U(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += F3;
                    break;
                case 35:
                    K3 = C1369c5.K((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 36:
                    K3 = C1369c5.I((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 37:
                    K3 = C1369c5.P((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 38:
                    K3 = C1369c5.a0((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 39:
                    K3 = C1369c5.N((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 40:
                    K3 = C1369c5.K((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 41:
                    K3 = C1369c5.I((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 42:
                    K3 = C1369c5.D((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 43:
                    K3 = C1369c5.Y((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 44:
                    K3 = C1369c5.G((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 45:
                    K3 = C1369c5.I((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 46:
                    K3 = C1369c5.K((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 47:
                    K3 = C1369c5.T((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 48:
                    K3 = C1369c5.V((List) unsafe.getObject(obj, j4));
                    if (K3 > 0) {
                        D3 = S3.D(i13);
                        a11 = S3.a(K3);
                        i6 = D3 + a11;
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 49:
                    W3 = C1369c5.L(i13, (List) unsafe.getObject(obj, j4), g(i10));
                    i11 += W3;
                    break;
                case 50:
                    K4.a(i13, unsafe.getObject(obj, j4), h(i10));
                    break;
                case 51:
                    if (t(obj, i13, i10)) {
                        a12 = S3.a(i13 << 3);
                        W3 = a12 + 8;
                        i11 += W3;
                    }
                    break;
                case 52:
                    if (t(obj, i13, i10)) {
                        a13 = S3.a(i13 << 3);
                        W3 = a13 + 4;
                        i11 += W3;
                    }
                    break;
                case 53:
                    if (t(obj, i13, i10)) {
                        long e4 = e(obj, j4);
                        a14 = S3.a(i13 << 3);
                        b5 = S3.b(e4);
                        i11 += a14 + b5;
                    }
                    break;
                case 54:
                    if (t(obj, i13, i10)) {
                        long e5 = e(obj, j4);
                        a14 = S3.a(i13 << 3);
                        b5 = S3.b(e5);
                        i11 += a14 + b5;
                    }
                    break;
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                    if (t(obj, i13, i10)) {
                        int E3 = E(obj, j4);
                        i6 = S3.a(i13 << 3);
                        K3 = S3.z(E3);
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 56:
                    if (t(obj, i13, i10)) {
                        a12 = S3.a(i13 << 3);
                        W3 = a12 + 8;
                        i11 += W3;
                    }
                    break;
                case 57:
                    if (t(obj, i13, i10)) {
                        a13 = S3.a(i13 << 3);
                        W3 = a13 + 4;
                        i11 += W3;
                    }
                    break;
                case 58:
                    if (t(obj, i13, i10)) {
                        W3 = S3.a(i13 << 3) + 1;
                        i11 += W3;
                    }
                    break;
                case 59:
                    if (t(obj, i13, i10)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzjd) {
                            a15 = S3.a(i13 << 3);
                            d5 = ((zzjd) object2).d();
                            a16 = S3.a(d5);
                            i7 = a15 + a16 + d5;
                            i11 += i7;
                        } else {
                            i6 = S3.a(i13 << 3);
                            K3 = S3.C((String) object2);
                            i7 = i6 + K3;
                            i11 += i7;
                        }
                    }
                    break;
                case 60:
                    if (t(obj, i13, i10)) {
                        W3 = C1369c5.Q(i13, unsafe.getObject(obj, j4), g(i10));
                        i11 += W3;
                    }
                    break;
                case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                    if (t(obj, i13, i10)) {
                        zzjd zzjdVar2 = (zzjd) unsafe.getObject(obj, j4);
                        a15 = S3.a(i13 << 3);
                        d5 = zzjdVar2.d();
                        a16 = S3.a(d5);
                        i7 = a15 + a16 + d5;
                        i11 += i7;
                    }
                    break;
                case 62:
                    if (t(obj, i13, i10)) {
                        int E4 = E(obj, j4);
                        i6 = S3.a(i13 << 3);
                        K3 = S3.a(E4);
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case C0755c.f12913k /* 63 */:
                    if (t(obj, i13, i10)) {
                        int E5 = E(obj, j4);
                        i6 = S3.a(i13 << 3);
                        K3 = S3.z(E5);
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case 64:
                    if (t(obj, i13, i10)) {
                        a13 = S3.a(i13 << 3);
                        W3 = a13 + 4;
                        i11 += W3;
                    }
                    break;
                case 65:
                    if (t(obj, i13, i10)) {
                        a12 = S3.a(i13 << 3);
                        W3 = a12 + 8;
                        i11 += W3;
                    }
                    break;
                case 66:
                    if (t(obj, i13, i10)) {
                        int E6 = E(obj, j4);
                        i6 = S3.a(i13 << 3);
                        K3 = S3.a((E6 >> 31) ^ (E6 + E6));
                        i7 = i6 + K3;
                        i11 += i7;
                    }
                    break;
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (t(obj, i13, i10)) {
                        long e6 = e(obj, j4);
                        i11 += S3.a(i13 << 3) + S3.b((e6 >> 63) ^ (e6 + e6));
                    }
                    break;
                case 68:
                    if (t(obj, i13, i10)) {
                        W3 = S3.y(i13, (P4) unsafe.getObject(obj, j4), g(i10));
                        i11 += W3;
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        AbstractC1488r5 abstractC1488r5 = this.f29492l;
        int a17 = i11 + abstractC1488r5.a(abstractC1488r5.c(obj));
        if (!this.f29486f) {
            return a17;
        }
        this.f29493m.a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0033. Please report as an issue. */
    private final int D(Object obj) {
        int a4;
        int a5;
        int a6;
        int b4;
        int a7;
        int z3;
        int a8;
        int a9;
        int d4;
        int a10;
        int Q3;
        int D3;
        int a11;
        int i4;
        Unsafe unsafe = f29480q;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f29481a.length; i6 += 3) {
            int d5 = d(i6);
            int c4 = c(d5);
            int i7 = this.f29481a[i6];
            long j4 = d5 & 1048575;
            if (c4 >= zzjw.zzJ.zza() && c4 <= zzjw.zzW.zza()) {
                int i8 = this.f29481a[i6 + 2];
            }
            switch (c4) {
                case 0:
                    if (q(obj, i6)) {
                        a4 = S3.a(i7 << 3);
                        Q3 = a4 + 8;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(obj, i6)) {
                        a5 = S3.a(i7 << 3);
                        Q3 = a5 + 4;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(obj, i6)) {
                        long i9 = B5.i(obj, j4);
                        a6 = S3.a(i7 << 3);
                        b4 = S3.b(i9);
                        i5 += a6 + b4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(obj, i6)) {
                        long i10 = B5.i(obj, j4);
                        a6 = S3.a(i7 << 3);
                        b4 = S3.b(i10);
                        i5 += a6 + b4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(obj, i6)) {
                        int h4 = B5.h(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.z(h4);
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(obj, i6)) {
                        a4 = S3.a(i7 << 3);
                        Q3 = a4 + 8;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(obj, i6)) {
                        a5 = S3.a(i7 << 3);
                        Q3 = a5 + 4;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(obj, i6)) {
                        a8 = S3.a(i7 << 3);
                        Q3 = a8 + 1;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!q(obj, i6)) {
                        break;
                    } else {
                        Object k4 = B5.k(obj, j4);
                        if (k4 instanceof zzjd) {
                            a9 = S3.a(i7 << 3);
                            d4 = ((zzjd) k4).d();
                            a10 = S3.a(d4);
                            i4 = a9 + a10 + d4;
                            i5 += i4;
                            break;
                        } else {
                            a7 = S3.a(i7 << 3);
                            z3 = S3.C((String) k4);
                            i4 = a7 + z3;
                            i5 += i4;
                        }
                    }
                case 9:
                    if (q(obj, i6)) {
                        Q3 = C1369c5.Q(i7, B5.k(obj, j4), g(i6));
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(obj, i6)) {
                        zzjd zzjdVar = (zzjd) B5.k(obj, j4);
                        a9 = S3.a(i7 << 3);
                        d4 = zzjdVar.d();
                        a10 = S3.a(d4);
                        i4 = a9 + a10 + d4;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(obj, i6)) {
                        int h5 = B5.h(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.a(h5);
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(obj, i6)) {
                        int h6 = B5.h(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.z(h6);
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(obj, i6)) {
                        a5 = S3.a(i7 << 3);
                        Q3 = a5 + 4;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(obj, i6)) {
                        a4 = S3.a(i7 << 3);
                        Q3 = a4 + 8;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(obj, i6)) {
                        int h7 = B5.h(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.a((h7 >> 31) ^ (h7 + h7));
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(obj, i6)) {
                        long i11 = B5.i(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.b((i11 >> 63) ^ (i11 + i11));
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(obj, i6)) {
                        Q3 = S3.y(i7, (P4) B5.k(obj, j4), g(i6));
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    Q3 = C1369c5.J(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 19:
                    Q3 = C1369c5.H(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 20:
                    Q3 = C1369c5.O(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 21:
                    Q3 = C1369c5.Z(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 22:
                    Q3 = C1369c5.M(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 23:
                    Q3 = C1369c5.J(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 24:
                    Q3 = C1369c5.H(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 25:
                    Q3 = C1369c5.A(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 26:
                    Q3 = C1369c5.W(i7, (List) B5.k(obj, j4));
                    i5 += Q3;
                    break;
                case 27:
                    Q3 = C1369c5.R(i7, (List) B5.k(obj, j4), g(i6));
                    i5 += Q3;
                    break;
                case 28:
                    Q3 = C1369c5.E(i7, (List) B5.k(obj, j4));
                    i5 += Q3;
                    break;
                case ConstraintLayout.b.a.f9571D /* 29 */:
                    Q3 = C1369c5.X(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 30:
                    Q3 = C1369c5.F(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case ConstraintLayout.b.a.f9573F /* 31 */:
                    Q3 = C1369c5.H(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 32:
                    Q3 = C1369c5.J(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 33:
                    Q3 = C1369c5.S(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 34:
                    Q3 = C1369c5.U(i7, (List) B5.k(obj, j4), false);
                    i5 += Q3;
                    break;
                case 35:
                    z3 = C1369c5.K((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    z3 = C1369c5.I((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    z3 = C1369c5.P((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    z3 = C1369c5.a0((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    z3 = C1369c5.N((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    z3 = C1369c5.K((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    z3 = C1369c5.I((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    z3 = C1369c5.D((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    z3 = C1369c5.Y((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    z3 = C1369c5.G((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    z3 = C1369c5.I((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    z3 = C1369c5.K((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    z3 = C1369c5.T((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    z3 = C1369c5.V((List) unsafe.getObject(obj, j4));
                    if (z3 > 0) {
                        D3 = S3.D(i7);
                        a11 = S3.a(z3);
                        a7 = D3 + a11;
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    Q3 = C1369c5.L(i7, (List) B5.k(obj, j4), g(i6));
                    i5 += Q3;
                    break;
                case 50:
                    K4.a(i7, B5.k(obj, j4), h(i6));
                    break;
                case 51:
                    if (t(obj, i7, i6)) {
                        a4 = S3.a(i7 << 3);
                        Q3 = a4 + 8;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(obj, i7, i6)) {
                        a5 = S3.a(i7 << 3);
                        Q3 = a5 + 4;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(obj, i7, i6)) {
                        long e4 = e(obj, j4);
                        a6 = S3.a(i7 << 3);
                        b4 = S3.b(e4);
                        i5 += a6 + b4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(obj, i7, i6)) {
                        long e5 = e(obj, j4);
                        a6 = S3.a(i7 << 3);
                        b4 = S3.b(e5);
                        i5 += a6 + b4;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                    if (t(obj, i7, i6)) {
                        int E3 = E(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.z(E3);
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(obj, i7, i6)) {
                        a4 = S3.a(i7 << 3);
                        Q3 = a4 + 8;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(obj, i7, i6)) {
                        a5 = S3.a(i7 << 3);
                        Q3 = a5 + 4;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(obj, i7, i6)) {
                        a8 = S3.a(i7 << 3);
                        Q3 = a8 + 1;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!t(obj, i7, i6)) {
                        break;
                    } else {
                        Object k5 = B5.k(obj, j4);
                        if (k5 instanceof zzjd) {
                            a9 = S3.a(i7 << 3);
                            d4 = ((zzjd) k5).d();
                            a10 = S3.a(d4);
                            i4 = a9 + a10 + d4;
                            i5 += i4;
                            break;
                        } else {
                            a7 = S3.a(i7 << 3);
                            z3 = S3.C((String) k5);
                            i4 = a7 + z3;
                            i5 += i4;
                        }
                    }
                case 60:
                    if (t(obj, i7, i6)) {
                        Q3 = C1369c5.Q(i7, B5.k(obj, j4), g(i6));
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                    if (t(obj, i7, i6)) {
                        zzjd zzjdVar2 = (zzjd) B5.k(obj, j4);
                        a9 = S3.a(i7 << 3);
                        d4 = zzjdVar2.d();
                        a10 = S3.a(d4);
                        i4 = a9 + a10 + d4;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(obj, i7, i6)) {
                        int E4 = E(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.a(E4);
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case C0755c.f12913k /* 63 */:
                    if (t(obj, i7, i6)) {
                        int E5 = E(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.z(E5);
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(obj, i7, i6)) {
                        a5 = S3.a(i7 << 3);
                        Q3 = a5 + 4;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(obj, i7, i6)) {
                        a4 = S3.a(i7 << 3);
                        Q3 = a4 + 8;
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(obj, i7, i6)) {
                        int E6 = E(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.a((E6 >> 31) ^ (E6 + E6));
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (t(obj, i7, i6)) {
                        long e6 = e(obj, j4);
                        a7 = S3.a(i7 << 3);
                        z3 = S3.b((e6 >> 63) ^ (e6 + e6));
                        i4 = a7 + z3;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(obj, i7, i6)) {
                        Q3 = S3.y(i7, (P4) B5.k(obj, j4), g(i6));
                        i5 += Q3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC1488r5 abstractC1488r5 = this.f29492l;
        return i5 + abstractC1488r5.a(abstractC1488r5.c(obj));
    }

    private static int E(Object obj, long j4) {
        return ((Integer) B5.k(obj, j4)).intValue();
    }

    private final int F(Object obj, byte[] bArr, int i4, int i5, int i6, long j4, C1542y3 c1542y3) throws IOException {
        Unsafe unsafe = f29480q;
        Object h4 = h(i6);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzlf) object).j()) {
            zzlf e4 = zzlf.a().e();
            K4.b(e4, object);
            unsafe.putObject(obj, j4, e4);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int G(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, int i11, C1542y3 c1542y3) throws IOException {
        boolean z3;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f29480q;
        long j5 = this.f29481a[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 == 1) {
                    unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(C1550z3.n(bArr, i4))));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 8;
                }
                return i4;
            case 52:
                if (i8 == 5) {
                    unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(C1550z3.b(bArr, i4))));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 4;
                }
                return i4;
            case 53:
            case 54:
                if (i8 == 0) {
                    int m4 = C1550z3.m(bArr, i4, c1542y3);
                    unsafe.putObject(obj, j4, Long.valueOf(c1542y3.f29841b));
                    unsafe.putInt(obj, j5, i7);
                    return m4;
                }
                return i4;
            case ConstraintLayout.b.a.f9601d0 /* 55 */:
            case 62:
                if (i8 == 0) {
                    int j6 = C1550z3.j(bArr, i4, c1542y3);
                    unsafe.putObject(obj, j4, Integer.valueOf(c1542y3.f29840a));
                    unsafe.putInt(obj, j5, i7);
                    return j6;
                }
                return i4;
            case 56:
            case 65:
                if (i8 == 1) {
                    unsafe.putObject(obj, j4, Long.valueOf(C1550z3.n(bArr, i4)));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 8;
                }
                return i4;
            case 57:
            case 64:
                if (i8 == 5) {
                    unsafe.putObject(obj, j4, Integer.valueOf(C1550z3.b(bArr, i4)));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 4;
                }
                return i4;
            case 58:
                if (i8 == 0) {
                    int m5 = C1550z3.m(bArr, i4, c1542y3);
                    if (c1542y3.f29841b != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    unsafe.putObject(obj, j4, Boolean.valueOf(z3));
                    unsafe.putInt(obj, j5, i7);
                    return m5;
                }
                return i4;
            case 59:
                if (i8 == 2) {
                    int j7 = C1550z3.j(bArr, i4, c1542y3);
                    int i12 = c1542y3.f29840a;
                    if (i12 == 0) {
                        unsafe.putObject(obj, j4, "");
                    } else {
                        if ((i9 & 536870912) != 0 && !H5.f(bArr, j7, j7 + i12)) {
                            throw zzko.c();
                        }
                        unsafe.putObject(obj, j4, new String(bArr, j7, i12, C1503t4.f29791b));
                        j7 += i12;
                    }
                    unsafe.putInt(obj, j5, i7);
                    return j7;
                }
                return i4;
            case 60:
                if (i8 == 2) {
                    int d4 = C1550z3.d(g(i11), bArr, i4, i5, c1542y3);
                    if (unsafe.getInt(obj, j5) == i7) {
                        obj2 = unsafe.getObject(obj, j4);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j4, c1542y3.f29842c);
                    } else {
                        unsafe.putObject(obj, j4, C1503t4.g(obj2, c1542y3.f29842c));
                    }
                    unsafe.putInt(obj, j5, i7);
                    return d4;
                }
                return i4;
            case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                if (i8 == 2) {
                    int a4 = C1550z3.a(bArr, i4, c1542y3);
                    unsafe.putObject(obj, j4, c1542y3.f29842c);
                    unsafe.putInt(obj, j5, i7);
                    return a4;
                }
                return i4;
            case C0755c.f12913k /* 63 */:
                if (i8 == 0) {
                    int j8 = C1550z3.j(bArr, i4, c1542y3);
                    int i13 = c1542y3.f29840a;
                    InterfaceC1472p4 f4 = f(i11);
                    if (f4 != null && !f4.zza(i13)) {
                        x(obj).h(i6, Long.valueOf(i13));
                    } else {
                        unsafe.putObject(obj, j4, Integer.valueOf(i13));
                        unsafe.putInt(obj, j5, i7);
                    }
                    return j8;
                }
                return i4;
            case 66:
                if (i8 == 0) {
                    int j9 = C1550z3.j(bArr, i4, c1542y3);
                    unsafe.putObject(obj, j4, Integer.valueOf(P3.a(c1542y3.f29840a)));
                    unsafe.putInt(obj, j5, i7);
                    return j9;
                }
                return i4;
            case ConstraintLayout.b.a.f9609h0 /* 67 */:
                if (i8 == 0) {
                    int m6 = C1550z3.m(bArr, i4, c1542y3);
                    unsafe.putObject(obj, j4, Long.valueOf(P3.b(c1542y3.f29841b)));
                    unsafe.putInt(obj, j5, i7);
                    return m6;
                }
                return i4;
            case 68:
                if (i8 == 3) {
                    int c4 = C1550z3.c(g(i11), bArr, i4, i5, (i6 & (-8)) | 4, c1542y3);
                    if (unsafe.getInt(obj, j5) == i7) {
                        obj3 = unsafe.getObject(obj, j4);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j4, c1542y3.f29842c);
                    } else {
                        unsafe.putObject(obj, j4, C1503t4.g(obj3, c1542y3.f29842c));
                    }
                    unsafe.putInt(obj, j5, i7);
                    return c4;
                }
                return i4;
            default:
                return i4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int H(Object obj, byte[] bArr, int i4, int i5, C1542y3 c1542y3) throws IOException {
        byte b4;
        int i6;
        int J3;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int i13;
        int m4;
        int d4;
        int i14;
        int i15;
        int i16;
        S4<T> s4 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i17 = i5;
        C1542y3 c1542y32 = c1542y3;
        Unsafe unsafe2 = f29480q;
        int i18 = 1048575;
        int i19 = -1;
        int i20 = i4;
        int i21 = -1;
        int i22 = 1048575;
        int i23 = 0;
        int i24 = 0;
        while (i20 < i17) {
            int i25 = i20 + 1;
            byte b5 = bArr2[i20];
            if (b5 < 0) {
                i6 = C1550z3.k(b5, bArr2, i25, c1542y32);
                b4 = c1542y32.f29840a;
            } else {
                b4 = b5;
                i6 = i25;
            }
            int i26 = b4 >>> 3;
            int i27 = b4 & 7;
            if (i26 > i21) {
                J3 = s4.K(i26, i23 / 3);
            } else {
                J3 = s4.J(i26);
            }
            int i28 = J3;
            if (i28 == i19) {
                i7 = i6;
                i8 = i26;
                i9 = i19;
                unsafe = unsafe2;
                i10 = 0;
            } else {
                int[] iArr = s4.f29481a;
                int i29 = iArr[i28 + 1];
                int c4 = c(i29);
                long j4 = i29 & i18;
                if (c4 <= 17) {
                    int i30 = iArr[i28 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i22) {
                        if (i22 != 1048575) {
                            unsafe2.putInt(obj2, i22, i24);
                        }
                        if (i32 != 1048575) {
                            i24 = unsafe2.getInt(obj2, i32);
                        }
                        i22 = i32;
                    }
                    switch (c4) {
                        case 0:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 1) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                B5.t(obj2, j4, Double.longBitsToDouble(C1550z3.n(bArr2, i12)));
                                i20 = i12 + 8;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 1:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 5) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                B5.u(obj2, j4, Float.intBitsToFloat(C1550z3.b(bArr2, i12)));
                                i20 = i12 + 4;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                m4 = C1550z3.m(bArr2, i12, c1542y32);
                                unsafe2.putLong(obj, j4, c1542y32.f29841b);
                                i24 |= i31;
                                i20 = m4;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                i20 = C1550z3.j(bArr2, i12, c1542y32);
                                unsafe2.putInt(obj2, j4, c1542y32.f29840a);
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 1) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                i12 = i6;
                                unsafe2.putLong(obj, j4, C1550z3.n(bArr2, i6));
                                i20 = i12 + 8;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 5) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j4, C1550z3.b(bArr2, i6));
                                i20 = i6 + 4;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 7:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                i20 = C1550z3.m(bArr2, i6, c1542y32);
                                B5.r(obj2, j4, c1542y32.f29841b != 0);
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 8:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 2) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                if ((536870912 & i29) == 0) {
                                    i20 = C1550z3.g(bArr2, i6, c1542y32);
                                } else {
                                    i20 = C1550z3.h(bArr2, i6, c1542y32);
                                }
                                unsafe2.putObject(obj2, j4, c1542y32.f29842c);
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 9:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 2) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                d4 = C1550z3.d(s4.g(i11), bArr2, i6, i17, c1542y32);
                                Object object = unsafe2.getObject(obj2, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j4, c1542y32.f29842c);
                                } else {
                                    unsafe2.putObject(obj2, j4, C1503t4.g(object, c1542y32.f29842c));
                                }
                                i24 |= i31;
                                i20 = d4;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 10:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 2) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                d4 = C1550z3.a(bArr2, i6, c1542y32);
                                unsafe2.putObject(obj2, j4, c1542y32.f29842c);
                                i24 |= i31;
                                i20 = d4;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 12:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                d4 = C1550z3.j(bArr2, i6, c1542y32);
                                unsafe2.putInt(obj2, j4, c1542y32.f29840a);
                                i24 |= i31;
                                i20 = d4;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 15:
                            c1542y32 = c1542y3;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                d4 = C1550z3.j(bArr2, i6, c1542y32);
                                unsafe2.putInt(obj2, j4, P3.a(c1542y32.f29840a));
                                i24 |= i31;
                                i20 = d4;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 16:
                            if (i27 != 0) {
                                i8 = i26;
                                i11 = i28;
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                c1542y32 = c1542y3;
                                m4 = C1550z3.m(bArr2, i6, c1542y32);
                                i11 = i28;
                                i8 = i26;
                                i13 = 1048575;
                                unsafe2.putLong(obj, j4, P3.b(c1542y32.f29841b));
                                i24 |= i31;
                                i20 = m4;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        default:
                            i8 = i26;
                            i11 = i28;
                            i12 = i6;
                            i7 = i12;
                            unsafe = unsafe2;
                            i10 = i11;
                            i9 = -1;
                            break;
                    }
                } else {
                    c1542y32 = c1542y3;
                    i11 = i28;
                    int i33 = i6;
                    i13 = 1048575;
                    i8 = i26;
                    if (c4 == 27) {
                        if (i27 == 2) {
                            InterfaceC1495s4 interfaceC1495s4 = (InterfaceC1495s4) unsafe2.getObject(obj2, j4);
                            if (!interfaceC1495s4.zzc()) {
                                int size = interfaceC1495s4.size();
                                interfaceC1495s4 = interfaceC1495s4.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j4, interfaceC1495s4);
                            }
                            i20 = C1550z3.e(s4.g(i11), b4, bArr, i33, i5, interfaceC1495s4, c1542y3);
                            i24 = i24;
                            i23 = i11;
                            i21 = i8;
                            i18 = i13;
                            i19 = -1;
                        } else {
                            i14 = i33;
                            i15 = i24;
                            i16 = i22;
                            unsafe = unsafe2;
                            i10 = i11;
                            i9 = -1;
                        }
                    } else if (c4 <= 49) {
                        i15 = i24;
                        i16 = i22;
                        i9 = -1;
                        unsafe = unsafe2;
                        i10 = i11;
                        i20 = I(obj, bArr, i33, i5, b4, i8, i27, i11, i29, c4, j4, c1542y3);
                        if (i20 != i33) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i17 = i5;
                            c1542y32 = c1542y3;
                            i22 = i16;
                            i19 = i9;
                            i21 = i8;
                            i24 = i15;
                            i23 = i10;
                            unsafe2 = unsafe;
                            i18 = 1048575;
                            s4 = this;
                        } else {
                            i7 = i20;
                            i22 = i16;
                            i24 = i15;
                        }
                    } else {
                        i14 = i33;
                        i15 = i24;
                        i16 = i22;
                        unsafe = unsafe2;
                        i10 = i11;
                        i9 = -1;
                        if (c4 != 50) {
                            i20 = G(obj, bArr, i14, i5, b4, i8, i27, i29, c4, j4, i10, c1542y3);
                            if (i20 != i14) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i17 = i5;
                                c1542y32 = c1542y3;
                                i22 = i16;
                                i19 = i9;
                                i21 = i8;
                                i24 = i15;
                                i23 = i10;
                                unsafe2 = unsafe;
                                i18 = 1048575;
                                s4 = this;
                            } else {
                                i7 = i20;
                                i22 = i16;
                                i24 = i15;
                            }
                        } else if (i27 == 2) {
                            i20 = F(obj, bArr, i14, i5, i10, j4, c1542y3);
                            if (i20 != i14) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i17 = i5;
                                c1542y32 = c1542y3;
                                i22 = i16;
                                i19 = i9;
                                i21 = i8;
                                i24 = i15;
                                i23 = i10;
                                unsafe2 = unsafe;
                                i18 = 1048575;
                                s4 = this;
                            } else {
                                i7 = i20;
                                i22 = i16;
                                i24 = i15;
                            }
                        }
                    }
                    i7 = i14;
                    i22 = i16;
                    i24 = i15;
                }
            }
            i20 = C1550z3.i(b4, bArr, i7, i5, x(obj), c1542y3);
            s4 = this;
            obj2 = obj;
            bArr2 = bArr;
            i17 = i5;
            c1542y32 = c1542y3;
            i19 = i9;
            i21 = i8;
            i23 = i10;
            unsafe2 = unsafe;
            i18 = 1048575;
        }
        int i34 = i24;
        int i35 = i22;
        Unsafe unsafe3 = unsafe2;
        if (i35 != i18) {
            unsafe3.putInt(obj, i35, i34);
        }
        if (i20 == i5) {
            return i20;
        }
        throw zzko.e();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int I(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, long j4, int i10, long j5, C1542y3 c1542y3) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int j6;
        int i15 = i4;
        Unsafe unsafe = f29480q;
        InterfaceC1495s4 interfaceC1495s4 = (InterfaceC1495s4) unsafe.getObject(obj, j5);
        if (!interfaceC1495s4.zzc()) {
            int size = interfaceC1495s4.size();
            interfaceC1495s4 = interfaceC1495s4.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j5, interfaceC1495s4);
        }
        switch (i10) {
            case 18:
            case 35:
                if (i8 == 2) {
                    U3 u3 = (U3) interfaceC1495s4;
                    int j7 = C1550z3.j(bArr, i15, c1542y3);
                    int i16 = c1542y3.f29840a + j7;
                    while (j7 < i16) {
                        u3.c(Double.longBitsToDouble(C1550z3.n(bArr, j7)));
                        j7 += 8;
                    }
                    if (j7 == i16) {
                        return j7;
                    }
                    throw zzko.f();
                }
                if (i8 == 1) {
                    U3 u32 = (U3) interfaceC1495s4;
                    u32.c(Double.longBitsToDouble(C1550z3.n(bArr, i4)));
                    while (true) {
                        i11 = i15 + 8;
                        if (i11 < i5) {
                            i15 = C1550z3.j(bArr, i11, c1542y3);
                            if (i6 == c1542y3.f29840a) {
                                u32.c(Double.longBitsToDouble(C1550z3.n(bArr, i15)));
                            }
                        }
                    }
                    return i11;
                }
                return i15;
            case 19:
            case 36:
                if (i8 == 2) {
                    C1376d4 c1376d4 = (C1376d4) interfaceC1495s4;
                    int j8 = C1550z3.j(bArr, i15, c1542y3);
                    int i17 = c1542y3.f29840a + j8;
                    while (j8 < i17) {
                        c1376d4.c(Float.intBitsToFloat(C1550z3.b(bArr, j8)));
                        j8 += 4;
                    }
                    if (j8 == i17) {
                        return j8;
                    }
                    throw zzko.f();
                }
                if (i8 == 5) {
                    C1376d4 c1376d42 = (C1376d4) interfaceC1495s4;
                    c1376d42.c(Float.intBitsToFloat(C1550z3.b(bArr, i4)));
                    while (true) {
                        i12 = i15 + 4;
                        if (i12 < i5) {
                            i15 = C1550z3.j(bArr, i12, c1542y3);
                            if (i6 == c1542y3.f29840a) {
                                c1376d42.c(Float.intBitsToFloat(C1550z3.b(bArr, i15)));
                            }
                        }
                    }
                    return i12;
                }
                return i15;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i8 == 2) {
                    F4 f4 = (F4) interfaceC1495s4;
                    int j9 = C1550z3.j(bArr, i15, c1542y3);
                    int i18 = c1542y3.f29840a + j9;
                    while (j9 < i18) {
                        j9 = C1550z3.m(bArr, j9, c1542y3);
                        f4.d(c1542y3.f29841b);
                    }
                    if (j9 == i18) {
                        return j9;
                    }
                    throw zzko.f();
                }
                if (i8 == 0) {
                    F4 f42 = (F4) interfaceC1495s4;
                    int m4 = C1550z3.m(bArr, i15, c1542y3);
                    f42.d(c1542y3.f29841b);
                    while (m4 < i5) {
                        int j10 = C1550z3.j(bArr, m4, c1542y3);
                        if (i6 != c1542y3.f29840a) {
                            return m4;
                        }
                        m4 = C1550z3.m(bArr, j10, c1542y3);
                        f42.d(c1542y3.f29841b);
                    }
                    return m4;
                }
                return i15;
            case 22:
            case ConstraintLayout.b.a.f9571D /* 29 */:
            case 39:
            case 43:
                if (i8 == 2) {
                    return C1550z3.f(bArr, i15, interfaceC1495s4, c1542y3);
                }
                if (i8 == 0) {
                    return C1550z3.l(i6, bArr, i4, i5, interfaceC1495s4, c1542y3);
                }
                return i15;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i8 == 2) {
                    F4 f43 = (F4) interfaceC1495s4;
                    int j11 = C1550z3.j(bArr, i15, c1542y3);
                    int i19 = c1542y3.f29840a + j11;
                    while (j11 < i19) {
                        f43.d(C1550z3.n(bArr, j11));
                        j11 += 8;
                    }
                    if (j11 == i19) {
                        return j11;
                    }
                    throw zzko.f();
                }
                if (i8 == 1) {
                    F4 f44 = (F4) interfaceC1495s4;
                    f44.d(C1550z3.n(bArr, i4));
                    while (true) {
                        i13 = i15 + 8;
                        if (i13 < i5) {
                            i15 = C1550z3.j(bArr, i13, c1542y3);
                            if (i6 == c1542y3.f29840a) {
                                f44.d(C1550z3.n(bArr, i15));
                            }
                        }
                    }
                    return i13;
                }
                return i15;
            case 24:
            case ConstraintLayout.b.a.f9573F /* 31 */:
            case 41:
            case 45:
                if (i8 == 2) {
                    C1448m4 c1448m4 = (C1448m4) interfaceC1495s4;
                    int j12 = C1550z3.j(bArr, i15, c1542y3);
                    int i20 = c1542y3.f29840a + j12;
                    while (j12 < i20) {
                        c1448m4.zzh(C1550z3.b(bArr, j12));
                        j12 += 4;
                    }
                    if (j12 == i20) {
                        return j12;
                    }
                    throw zzko.f();
                }
                if (i8 == 5) {
                    C1448m4 c1448m42 = (C1448m4) interfaceC1495s4;
                    c1448m42.zzh(C1550z3.b(bArr, i4));
                    while (true) {
                        i14 = i15 + 4;
                        if (i14 < i5) {
                            i15 = C1550z3.j(bArr, i14, c1542y3);
                            if (i6 == c1542y3.f29840a) {
                                c1448m42.zzh(C1550z3.b(bArr, i15));
                            }
                        }
                    }
                    return i14;
                }
                return i15;
            case 25:
            case 42:
                if (i8 == 2) {
                    A3 a32 = (A3) interfaceC1495s4;
                    j6 = C1550z3.j(bArr, i15, c1542y3);
                    int i21 = c1542y3.f29840a + j6;
                    while (j6 < i21) {
                        j6 = C1550z3.m(bArr, j6, c1542y3);
                        a32.c(c1542y3.f29841b != 0);
                    }
                    if (j6 != i21) {
                        throw zzko.f();
                    }
                    return j6;
                }
                if (i8 == 0) {
                    A3 a33 = (A3) interfaceC1495s4;
                    int m5 = C1550z3.m(bArr, i15, c1542y3);
                    a33.c(c1542y3.f29841b != 0);
                    while (m5 < i5) {
                        int j13 = C1550z3.j(bArr, m5, c1542y3);
                        if (i6 != c1542y3.f29840a) {
                            return m5;
                        }
                        m5 = C1550z3.m(bArr, j13, c1542y3);
                        a33.c(c1542y3.f29841b != 0);
                    }
                    return m5;
                }
                return i15;
            case 26:
                if (i8 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int j14 = C1550z3.j(bArr, i15, c1542y3);
                        int i22 = c1542y3.f29840a;
                        if (i22 < 0) {
                            throw zzko.d();
                        }
                        if (i22 == 0) {
                            interfaceC1495s4.add("");
                        } else {
                            interfaceC1495s4.add(new String(bArr, j14, i22, C1503t4.f29791b));
                            j14 += i22;
                        }
                        while (j14 < i5) {
                            int j15 = C1550z3.j(bArr, j14, c1542y3);
                            if (i6 != c1542y3.f29840a) {
                                return j14;
                            }
                            j14 = C1550z3.j(bArr, j15, c1542y3);
                            int i23 = c1542y3.f29840a;
                            if (i23 < 0) {
                                throw zzko.d();
                            }
                            if (i23 == 0) {
                                interfaceC1495s4.add("");
                            } else {
                                interfaceC1495s4.add(new String(bArr, j14, i23, C1503t4.f29791b));
                                j14 += i23;
                            }
                        }
                        return j14;
                    }
                    int j16 = C1550z3.j(bArr, i15, c1542y3);
                    int i24 = c1542y3.f29840a;
                    if (i24 < 0) {
                        throw zzko.d();
                    }
                    if (i24 == 0) {
                        interfaceC1495s4.add("");
                    } else {
                        int i25 = j16 + i24;
                        if (H5.f(bArr, j16, i25)) {
                            interfaceC1495s4.add(new String(bArr, j16, i24, C1503t4.f29791b));
                            j16 = i25;
                        } else {
                            throw zzko.c();
                        }
                    }
                    while (j16 < i5) {
                        int j17 = C1550z3.j(bArr, j16, c1542y3);
                        if (i6 != c1542y3.f29840a) {
                            return j16;
                        }
                        j16 = C1550z3.j(bArr, j17, c1542y3);
                        int i26 = c1542y3.f29840a;
                        if (i26 < 0) {
                            throw zzko.d();
                        }
                        if (i26 == 0) {
                            interfaceC1495s4.add("");
                        } else {
                            int i27 = j16 + i26;
                            if (H5.f(bArr, j16, i27)) {
                                interfaceC1495s4.add(new String(bArr, j16, i26, C1503t4.f29791b));
                                j16 = i27;
                            } else {
                                throw zzko.c();
                            }
                        }
                    }
                    return j16;
                }
                return i15;
            case 27:
                if (i8 == 2) {
                    return C1550z3.e(g(i9), i6, bArr, i4, i5, interfaceC1495s4, c1542y3);
                }
                return i15;
            case 28:
                if (i8 == 2) {
                    int j18 = C1550z3.j(bArr, i15, c1542y3);
                    int i28 = c1542y3.f29840a;
                    if (i28 >= 0) {
                        if (i28 > bArr.length - j18) {
                            throw zzko.f();
                        }
                        if (i28 == 0) {
                            interfaceC1495s4.add(zzjd.f29849F);
                        } else {
                            interfaceC1495s4.add(zzjd.o(bArr, j18, i28));
                            j18 += i28;
                        }
                        while (j18 < i5) {
                            int j19 = C1550z3.j(bArr, j18, c1542y3);
                            if (i6 != c1542y3.f29840a) {
                                return j18;
                            }
                            j18 = C1550z3.j(bArr, j19, c1542y3);
                            int i29 = c1542y3.f29840a;
                            if (i29 >= 0) {
                                if (i29 > bArr.length - j18) {
                                    throw zzko.f();
                                }
                                if (i29 == 0) {
                                    interfaceC1495s4.add(zzjd.f29849F);
                                } else {
                                    interfaceC1495s4.add(zzjd.o(bArr, j18, i29));
                                    j18 += i29;
                                }
                            } else {
                                throw zzko.d();
                            }
                        }
                        return j18;
                    }
                    throw zzko.d();
                }
                return i15;
            case 30:
            case 44:
                if (i8 != 2) {
                    if (i8 == 0) {
                        j6 = C1550z3.l(i6, bArr, i4, i5, interfaceC1495s4, c1542y3);
                    }
                    return i15;
                }
                j6 = C1550z3.f(bArr, i15, interfaceC1495s4, c1542y3);
                AbstractC1440l4 abstractC1440l4 = (AbstractC1440l4) obj;
                C1496s5 c1496s5 = abstractC1440l4.zzc;
                if (c1496s5 == C1496s5.c()) {
                    c1496s5 = null;
                }
                Object c4 = C1369c5.c(i7, interfaceC1495s4, f(i9), c1496s5, this.f29492l);
                if (c4 != null) {
                    abstractC1440l4.zzc = (C1496s5) c4;
                    return j6;
                }
                return j6;
            case 33:
            case 47:
                if (i8 == 2) {
                    C1448m4 c1448m43 = (C1448m4) interfaceC1495s4;
                    int j20 = C1550z3.j(bArr, i15, c1542y3);
                    int i30 = c1542y3.f29840a + j20;
                    while (j20 < i30) {
                        j20 = C1550z3.j(bArr, j20, c1542y3);
                        c1448m43.zzh(P3.a(c1542y3.f29840a));
                    }
                    if (j20 == i30) {
                        return j20;
                    }
                    throw zzko.f();
                }
                if (i8 == 0) {
                    C1448m4 c1448m44 = (C1448m4) interfaceC1495s4;
                    int j21 = C1550z3.j(bArr, i15, c1542y3);
                    c1448m44.zzh(P3.a(c1542y3.f29840a));
                    while (j21 < i5) {
                        int j22 = C1550z3.j(bArr, j21, c1542y3);
                        if (i6 != c1542y3.f29840a) {
                            return j21;
                        }
                        j21 = C1550z3.j(bArr, j22, c1542y3);
                        c1448m44.zzh(P3.a(c1542y3.f29840a));
                    }
                    return j21;
                }
                return i15;
            case 34:
            case 48:
                if (i8 == 2) {
                    F4 f45 = (F4) interfaceC1495s4;
                    int j23 = C1550z3.j(bArr, i15, c1542y3);
                    int i31 = c1542y3.f29840a + j23;
                    while (j23 < i31) {
                        j23 = C1550z3.m(bArr, j23, c1542y3);
                        f45.d(P3.b(c1542y3.f29841b));
                    }
                    if (j23 == i31) {
                        return j23;
                    }
                    throw zzko.f();
                }
                if (i8 == 0) {
                    F4 f46 = (F4) interfaceC1495s4;
                    int m6 = C1550z3.m(bArr, i15, c1542y3);
                    f46.d(P3.b(c1542y3.f29841b));
                    while (m6 < i5) {
                        int j24 = C1550z3.j(bArr, m6, c1542y3);
                        if (i6 != c1542y3.f29840a) {
                            return m6;
                        }
                        m6 = C1550z3.m(bArr, j24, c1542y3);
                        f46.d(P3.b(c1542y3.f29841b));
                    }
                    return m6;
                }
                return i15;
            default:
                if (i8 == 3) {
                    InterfaceC1353a5 g4 = g(i9);
                    int i32 = (i6 & (-8)) | 4;
                    int c5 = C1550z3.c(g4, bArr, i4, i5, i32, c1542y3);
                    interfaceC1495s4.add(c1542y3.f29842c);
                    while (c5 < i5) {
                        int j25 = C1550z3.j(bArr, c5, c1542y3);
                        if (i6 != c1542y3.f29840a) {
                            return c5;
                        }
                        c5 = C1550z3.c(g4, bArr, j25, i5, i32, c1542y3);
                        interfaceC1495s4.add(c1542y3.f29842c);
                    }
                    return c5;
                }
                return i15;
        }
    }

    private final int J(int i4) {
        if (i4 >= this.f29483c && i4 <= this.f29484d) {
            return M(i4, 0);
        }
        return -1;
    }

    private final int K(int i4, int i5) {
        if (i4 >= this.f29483c && i4 <= this.f29484d) {
            return M(i4, i5);
        }
        return -1;
    }

    private final int L(int i4) {
        return this.f29481a[i4 + 2];
    }

    private final int M(int i4, int i5) {
        int length = (this.f29481a.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.f29481a[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int c(int i4) {
        return (i4 >>> 20) & 255;
    }

    private final int d(int i4) {
        return this.f29481a[i4 + 1];
    }

    private static long e(Object obj, long j4) {
        return ((Long) B5.k(obj, j4)).longValue();
    }

    private final InterfaceC1472p4 f(int i4) {
        int i5 = i4 / 3;
        return (InterfaceC1472p4) this.f29482b[i5 + i5 + 1];
    }

    private final InterfaceC1353a5 g(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        InterfaceC1353a5 interfaceC1353a5 = (InterfaceC1353a5) this.f29482b[i6];
        if (interfaceC1353a5 != null) {
            return interfaceC1353a5;
        }
        InterfaceC1353a5 b4 = X4.a().b((Class) this.f29482b[i6 + 1]);
        this.f29482b[i6] = b4;
        return b4;
    }

    private final Object h(int i4) {
        int i5 = i4 / 3;
        return this.f29482b[i5 + i5];
    }

    private static Field i(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void j(Object obj, Object obj2, int i4) {
        long d4 = d(i4) & 1048575;
        if (!q(obj2, i4)) {
            return;
        }
        Object k4 = B5.k(obj, d4);
        Object k5 = B5.k(obj2, d4);
        if (k4 != null && k5 != null) {
            B5.x(obj, d4, C1503t4.g(k4, k5));
            l(obj, i4);
        } else if (k5 != null) {
            B5.x(obj, d4, k5);
            l(obj, i4);
        }
    }

    private final void k(Object obj, Object obj2, int i4) {
        Object obj3;
        int d4 = d(i4);
        int i5 = this.f29481a[i4];
        long j4 = d4 & 1048575;
        if (!t(obj2, i5, i4)) {
            return;
        }
        if (t(obj, i5, i4)) {
            obj3 = B5.k(obj, j4);
        } else {
            obj3 = null;
        }
        Object k4 = B5.k(obj2, j4);
        if (obj3 != null && k4 != null) {
            B5.x(obj, j4, C1503t4.g(obj3, k4));
            m(obj, i5, i4);
        } else if (k4 != null) {
            B5.x(obj, j4, k4);
            m(obj, i5, i4);
        }
    }

    private final void l(Object obj, int i4) {
        int L3 = L(i4);
        long j4 = 1048575 & L3;
        if (j4 == 1048575) {
            return;
        }
        B5.v(obj, j4, (1 << (L3 >>> 20)) | B5.h(obj, j4));
    }

    private final void m(Object obj, int i4, int i5) {
        B5.v(obj, L(i5) & 1048575, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003e. Please report as an issue. */
    private final void n(Object obj, I5 i5) throws IOException {
        int i4;
        boolean z3;
        if (!this.f29486f) {
            int length = this.f29481a.length;
            Unsafe unsafe = f29480q;
            int i6 = 1048575;
            int i7 = 1048575;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int d4 = d(i8);
                int[] iArr = this.f29481a;
                int i10 = iArr[i8];
                int c4 = c(d4);
                if (c4 <= 17) {
                    int i11 = iArr[i8 + 2];
                    int i12 = i11 & i6;
                    if (i12 != i7) {
                        i9 = unsafe.getInt(obj, i12);
                        i7 = i12;
                    }
                    i4 = 1 << (i11 >>> 20);
                } else {
                    i4 = 0;
                }
                long j4 = d4 & i6;
                switch (c4) {
                    case 0:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.s(i10, B5.f(obj, j4));
                            break;
                        }
                    case 1:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.v(i10, B5.g(obj, j4));
                            break;
                        }
                    case 2:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.h(i10, unsafe.getLong(obj, j4));
                            break;
                        }
                    case 3:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.C(i10, unsafe.getLong(obj, j4));
                            break;
                        }
                    case 4:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.p(i10, unsafe.getInt(obj, j4));
                            break;
                        }
                    case 5:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.G(i10, unsafe.getLong(obj, j4));
                            break;
                        }
                    case 6:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.d(i10, unsafe.getInt(obj, j4));
                            break;
                        }
                    case 7:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.e(i10, B5.B(obj, j4));
                            break;
                        }
                    case 8:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            v(i10, unsafe.getObject(obj, j4), i5);
                            break;
                        }
                    case 9:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.F(i10, unsafe.getObject(obj, j4), g(i8));
                            break;
                        }
                    case 10:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.q(i10, (zzjd) unsafe.getObject(obj, j4));
                            break;
                        }
                    case 11:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.a(i10, unsafe.getInt(obj, j4));
                            break;
                        }
                    case 12:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.n(i10, unsafe.getInt(obj, j4));
                            break;
                        }
                    case 13:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.u(i10, unsafe.getInt(obj, j4));
                            break;
                        }
                    case 14:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.j(i10, unsafe.getLong(obj, j4));
                            break;
                        }
                    case 15:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.f(i10, unsafe.getInt(obj, j4));
                            break;
                        }
                    case 16:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.I(i10, unsafe.getLong(obj, j4));
                            break;
                        }
                    case 17:
                        if ((i9 & i4) == 0) {
                            break;
                        } else {
                            i5.y(i10, unsafe.getObject(obj, j4), g(i8));
                            break;
                        }
                    case 18:
                        C1369c5.j(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 19:
                        C1369c5.n(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 20:
                        C1369c5.q(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 21:
                        C1369c5.y(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 22:
                        C1369c5.p(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 23:
                        C1369c5.m(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 24:
                        C1369c5.l(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 25:
                        C1369c5.h(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 26:
                        C1369c5.w(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5);
                        break;
                    case 27:
                        C1369c5.r(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, g(i8));
                        break;
                    case 28:
                        C1369c5.i(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5);
                        break;
                    case ConstraintLayout.b.a.f9571D /* 29 */:
                        z3 = false;
                        C1369c5.x(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 30:
                        z3 = false;
                        C1369c5.k(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case ConstraintLayout.b.a.f9573F /* 31 */:
                        z3 = false;
                        C1369c5.s(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 32:
                        z3 = false;
                        C1369c5.t(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 33:
                        z3 = false;
                        C1369c5.u(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 34:
                        z3 = false;
                        C1369c5.v(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, false);
                        break;
                    case 35:
                        C1369c5.j(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 36:
                        C1369c5.n(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 37:
                        C1369c5.q(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 38:
                        C1369c5.y(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 39:
                        C1369c5.p(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 40:
                        C1369c5.m(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 41:
                        C1369c5.l(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 42:
                        C1369c5.h(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 43:
                        C1369c5.x(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 44:
                        C1369c5.k(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 45:
                        C1369c5.s(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 46:
                        C1369c5.t(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 47:
                        C1369c5.u(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 48:
                        C1369c5.v(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, true);
                        break;
                    case 49:
                        C1369c5.o(this.f29481a[i8], (List) unsafe.getObject(obj, j4), i5, g(i8));
                        break;
                    case 50:
                        o(i5, i10, unsafe.getObject(obj, j4), i8);
                        break;
                    case 51:
                        if (t(obj, i10, i8)) {
                            i5.s(i10, A(obj, j4));
                        }
                        break;
                    case 52:
                        if (t(obj, i10, i8)) {
                            i5.v(i10, B(obj, j4));
                        }
                        break;
                    case 53:
                        if (t(obj, i10, i8)) {
                            i5.h(i10, e(obj, j4));
                        }
                        break;
                    case 54:
                        if (t(obj, i10, i8)) {
                            i5.C(i10, e(obj, j4));
                        }
                        break;
                    case ConstraintLayout.b.a.f9601d0 /* 55 */:
                        if (t(obj, i10, i8)) {
                            i5.p(i10, E(obj, j4));
                        }
                        break;
                    case 56:
                        if (t(obj, i10, i8)) {
                            i5.G(i10, e(obj, j4));
                        }
                        break;
                    case 57:
                        if (t(obj, i10, i8)) {
                            i5.d(i10, E(obj, j4));
                        }
                        break;
                    case 58:
                        if (t(obj, i10, i8)) {
                            i5.e(i10, u(obj, j4));
                        }
                        break;
                    case 59:
                        if (t(obj, i10, i8)) {
                            v(i10, unsafe.getObject(obj, j4), i5);
                        }
                        break;
                    case 60:
                        if (t(obj, i10, i8)) {
                            i5.F(i10, unsafe.getObject(obj, j4), g(i8));
                        }
                        break;
                    case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                        if (t(obj, i10, i8)) {
                            i5.q(i10, (zzjd) unsafe.getObject(obj, j4));
                        }
                        break;
                    case 62:
                        if (t(obj, i10, i8)) {
                            i5.a(i10, E(obj, j4));
                        }
                        break;
                    case C0755c.f12913k /* 63 */:
                        if (t(obj, i10, i8)) {
                            i5.n(i10, E(obj, j4));
                        }
                        break;
                    case 64:
                        if (t(obj, i10, i8)) {
                            i5.u(i10, E(obj, j4));
                        }
                        break;
                    case 65:
                        if (t(obj, i10, i8)) {
                            i5.j(i10, e(obj, j4));
                        }
                        break;
                    case 66:
                        if (t(obj, i10, i8)) {
                            i5.f(i10, E(obj, j4));
                        }
                        break;
                    case ConstraintLayout.b.a.f9609h0 /* 67 */:
                        if (t(obj, i10, i8)) {
                            i5.I(i10, e(obj, j4));
                        }
                        break;
                    case 68:
                        if (t(obj, i10, i8)) {
                            i5.y(i10, unsafe.getObject(obj, j4), g(i8));
                        }
                        break;
                }
                i8 += 3;
                i6 = 1048575;
            }
            AbstractC1488r5 abstractC1488r5 = this.f29492l;
            abstractC1488r5.i(abstractC1488r5.c(obj), i5);
            return;
        }
        this.f29493m.a(obj);
        throw null;
    }

    private final void o(I5 i5, int i4, Object obj, int i6) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean p(Object obj, Object obj2, int i4) {
        if (q(obj, i4) == q(obj2, i4)) {
            return true;
        }
        return false;
    }

    private final boolean q(Object obj, int i4) {
        int L3 = L(i4);
        long j4 = L3 & 1048575;
        if (j4 == 1048575) {
            int d4 = d(i4);
            long j5 = d4 & 1048575;
            switch (c(d4)) {
                case 0:
                    if (Double.doubleToRawLongBits(B5.f(obj, j5)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(B5.g(obj, j5)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (B5.i(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (B5.i(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (B5.h(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (B5.i(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (B5.h(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return B5.B(obj, j5);
                case 8:
                    Object k4 = B5.k(obj, j5);
                    if (k4 instanceof String) {
                        if (((String) k4).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (k4 instanceof zzjd) {
                        if (zzjd.f29849F.equals(k4)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (B5.k(obj, j5) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzjd.f29849F.equals(B5.k(obj, j5))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (B5.h(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (B5.h(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (B5.h(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (B5.i(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (B5.h(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (B5.i(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (B5.k(obj, j5) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((B5.h(obj, j4) & (1 << (L3 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean r(Object obj, int i4, int i5, int i6, int i7) {
        if (i5 == 1048575) {
            return q(obj, i4);
        }
        if ((i6 & i7) != 0) {
            return true;
        }
        return false;
    }

    private static boolean s(Object obj, int i4, InterfaceC1353a5 interfaceC1353a5) {
        return interfaceC1353a5.zzk(B5.k(obj, i4 & 1048575));
    }

    private final boolean t(Object obj, int i4, int i5) {
        if (B5.h(obj, L(i5) & 1048575) == i4) {
            return true;
        }
        return false;
    }

    private static boolean u(Object obj, long j4) {
        return ((Boolean) B5.k(obj, j4)).booleanValue();
    }

    private static final void v(int i4, Object obj, I5 i5) throws IOException {
        if (obj instanceof String) {
            i5.g(i4, (String) obj);
        } else {
            i5.q(i4, (zzjd) obj);
        }
    }

    static C1496s5 x(Object obj) {
        AbstractC1440l4 abstractC1440l4 = (AbstractC1440l4) obj;
        C1496s5 c1496s5 = abstractC1440l4.zzc;
        if (c1496s5 == C1496s5.c()) {
            C1496s5 e4 = C1496s5.e();
            abstractC1440l4.zzc = e4;
            return e4;
        }
        return c1496s5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static S4 y(Class cls, M4 m4, U4 u4, D4 d4, AbstractC1488r5 abstractC1488r5, Y3 y3, K4 k4) {
        if (m4 instanceof Z4) {
            return z((Z4) m4, u4, d4, abstractC1488r5, y3, k4);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.S4 z(com.google.android.gms.internal.measurement.Z4 r34, com.google.android.gms.internal.measurement.U4 r35, com.google.android.gms.internal.measurement.D4 r36, com.google.android.gms.internal.measurement.AbstractC1488r5 r37, com.google.android.gms.internal.measurement.Y3 r38, com.google.android.gms.internal.measurement.K4 r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S4.z(com.google.android.gms.internal.measurement.Z4, com.google.android.gms.internal.measurement.U4, com.google.android.gms.internal.measurement.D4, com.google.android.gms.internal.measurement.r5, com.google.android.gms.internal.measurement.Y3, com.google.android.gms.internal.measurement.K4):com.google.android.gms.internal.measurement.S4");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void a(Object obj, I5 i5) throws IOException {
        if (this.f29487g) {
            if (!this.f29486f) {
                int length = this.f29481a.length;
                for (int i4 = 0; i4 < length; i4 += 3) {
                    int d4 = d(i4);
                    int i6 = this.f29481a[i4];
                    switch (c(d4)) {
                        case 0:
                            if (q(obj, i4)) {
                                i5.s(i6, B5.f(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (q(obj, i4)) {
                                i5.v(i6, B5.g(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (q(obj, i4)) {
                                i5.h(i6, B5.i(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (q(obj, i4)) {
                                i5.C(i6, B5.i(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (q(obj, i4)) {
                                i5.p(i6, B5.h(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (q(obj, i4)) {
                                i5.G(i6, B5.i(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (q(obj, i4)) {
                                i5.d(i6, B5.h(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (q(obj, i4)) {
                                i5.e(i6, B5.B(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (q(obj, i4)) {
                                v(i6, B5.k(obj, d4 & 1048575), i5);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (q(obj, i4)) {
                                i5.F(i6, B5.k(obj, d4 & 1048575), g(i4));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (q(obj, i4)) {
                                i5.q(i6, (zzjd) B5.k(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (q(obj, i4)) {
                                i5.a(i6, B5.h(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (q(obj, i4)) {
                                i5.n(i6, B5.h(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (q(obj, i4)) {
                                i5.u(i6, B5.h(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (q(obj, i4)) {
                                i5.j(i6, B5.i(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (q(obj, i4)) {
                                i5.f(i6, B5.h(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (q(obj, i4)) {
                                i5.I(i6, B5.i(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (q(obj, i4)) {
                                i5.y(i6, B5.k(obj, d4 & 1048575), g(i4));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C1369c5.j(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 19:
                            C1369c5.n(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 20:
                            C1369c5.q(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 21:
                            C1369c5.y(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 22:
                            C1369c5.p(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 23:
                            C1369c5.m(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 24:
                            C1369c5.l(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 25:
                            C1369c5.h(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 26:
                            C1369c5.w(i6, (List) B5.k(obj, d4 & 1048575), i5);
                            break;
                        case 27:
                            C1369c5.r(i6, (List) B5.k(obj, d4 & 1048575), i5, g(i4));
                            break;
                        case 28:
                            C1369c5.i(i6, (List) B5.k(obj, d4 & 1048575), i5);
                            break;
                        case ConstraintLayout.b.a.f9571D /* 29 */:
                            C1369c5.x(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 30:
                            C1369c5.k(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case ConstraintLayout.b.a.f9573F /* 31 */:
                            C1369c5.s(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 32:
                            C1369c5.t(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 33:
                            C1369c5.u(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 34:
                            C1369c5.v(i6, (List) B5.k(obj, d4 & 1048575), i5, false);
                            break;
                        case 35:
                            C1369c5.j(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 36:
                            C1369c5.n(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 37:
                            C1369c5.q(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 38:
                            C1369c5.y(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 39:
                            C1369c5.p(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 40:
                            C1369c5.m(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 41:
                            C1369c5.l(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 42:
                            C1369c5.h(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 43:
                            C1369c5.x(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 44:
                            C1369c5.k(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 45:
                            C1369c5.s(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 46:
                            C1369c5.t(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 47:
                            C1369c5.u(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 48:
                            C1369c5.v(i6, (List) B5.k(obj, d4 & 1048575), i5, true);
                            break;
                        case 49:
                            C1369c5.o(i6, (List) B5.k(obj, d4 & 1048575), i5, g(i4));
                            break;
                        case 50:
                            o(i5, i6, B5.k(obj, d4 & 1048575), i4);
                            break;
                        case 51:
                            if (t(obj, i6, i4)) {
                                i5.s(i6, A(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (t(obj, i6, i4)) {
                                i5.v(i6, B(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (t(obj, i6, i4)) {
                                i5.h(i6, e(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (t(obj, i6, i4)) {
                                i5.C(i6, e(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.b.a.f9601d0 /* 55 */:
                            if (t(obj, i6, i4)) {
                                i5.p(i6, E(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (t(obj, i6, i4)) {
                                i5.G(i6, e(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (t(obj, i6, i4)) {
                                i5.d(i6, E(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (t(obj, i6, i4)) {
                                i5.e(i6, u(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (t(obj, i6, i4)) {
                                v(i6, B5.k(obj, d4 & 1048575), i5);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (t(obj, i6, i4)) {
                                i5.F(i6, B5.k(obj, d4 & 1048575), g(i4));
                                break;
                            } else {
                                break;
                            }
                        case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                            if (t(obj, i6, i4)) {
                                i5.q(i6, (zzjd) B5.k(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (t(obj, i6, i4)) {
                                i5.a(i6, E(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case C0755c.f12913k /* 63 */:
                            if (t(obj, i6, i4)) {
                                i5.n(i6, E(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (t(obj, i6, i4)) {
                                i5.u(i6, E(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (t(obj, i6, i4)) {
                                i5.j(i6, e(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (t(obj, i6, i4)) {
                                i5.f(i6, E(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case ConstraintLayout.b.a.f9609h0 /* 67 */:
                            if (t(obj, i6, i4)) {
                                i5.I(i6, e(obj, d4 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (t(obj, i6, i4)) {
                                i5.y(i6, B5.k(obj, d4 & 1048575), g(i4));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC1488r5 abstractC1488r5 = this.f29492l;
                abstractC1488r5.i(abstractC1488r5.c(obj), i5);
                return;
            }
            this.f29493m.a(obj);
            throw null;
        }
        n(obj, i5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void b(Object obj, byte[] bArr, int i4, int i5, C1542y3 c1542y3) throws IOException {
        if (this.f29487g) {
            H(obj, bArr, i4, i5, c1542y3);
        } else {
            w(obj, bArr, i4, i5, 0, c1542y3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03ab, code lost:
    
        if (r0 != r20) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03ad, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r2 = r33;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r5 = r20;
        r1 = r21;
        r3 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03c7, code lost:
    
        r2 = r0;
        r7 = r21;
        r6 = r23;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03f0, code lost:
    
        if (r0 != r15) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0416, code lost:
    
        if (r0 != r15) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0490, code lost:
    
        if (r6 == 1048575) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0492, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0498, code lost:
    
        r3 = r8.f29489i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x049c, code lost:
    
        if (r3 >= r8.f29490j) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x049e, code lost:
    
        r4 = r8.f29488h[r3];
        r5 = r8.f29481a[r4];
        r5 = com.google.android.gms.internal.measurement.B5.k(r12, r8.d(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04b0, code lost:
    
        if (r5 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04b7, code lost:
    
        if (r8.f(r4) != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04bc, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzlf) r5;
        r0 = (com.google.android.gms.internal.measurement.J4) r8.h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04b9, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04c5, code lost:
    
        if (r9 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04c9, code lost:
    
        if (r0 != r34) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04d0, code lost:
    
        throw com.google.android.gms.internal.measurement.zzko.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04d7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04d3, code lost:
    
        if (r0 > r34) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04d5, code lost:
    
        if (r1 != r9) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x04dc, code lost:
    
        throw com.google.android.gms.internal.measurement.zzko.e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0091. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.C1542y3 r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S4.w(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.y3):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final int zza(Object obj) {
        if (this.f29487g) {
            return D(obj);
        }
        return C(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final int zzb(Object obj) {
        int i4;
        int c4;
        int length = this.f29481a.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int d4 = d(i6);
            int i7 = this.f29481a[i6];
            long j4 = 1048575 & d4;
            int i8 = 37;
            switch (c(d4)) {
                case 0:
                    i4 = i5 * 53;
                    c4 = C1503t4.c(Double.doubleToLongBits(B5.f(obj, j4)));
                    i5 = i4 + c4;
                    break;
                case 1:
                    i4 = i5 * 53;
                    c4 = Float.floatToIntBits(B5.g(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 2:
                    i4 = i5 * 53;
                    c4 = C1503t4.c(B5.i(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 3:
                    i4 = i5 * 53;
                    c4 = C1503t4.c(B5.i(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 4:
                    i4 = i5 * 53;
                    c4 = B5.h(obj, j4);
                    i5 = i4 + c4;
                    break;
                case 5:
                    i4 = i5 * 53;
                    c4 = C1503t4.c(B5.i(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 6:
                    i4 = i5 * 53;
                    c4 = B5.h(obj, j4);
                    i5 = i4 + c4;
                    break;
                case 7:
                    i4 = i5 * 53;
                    c4 = C1503t4.a(B5.B(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 8:
                    i4 = i5 * 53;
                    c4 = ((String) B5.k(obj, j4)).hashCode();
                    i5 = i4 + c4;
                    break;
                case 9:
                    Object k4 = B5.k(obj, j4);
                    if (k4 != null) {
                        i8 = k4.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 10:
                    i4 = i5 * 53;
                    c4 = B5.k(obj, j4).hashCode();
                    i5 = i4 + c4;
                    break;
                case 11:
                    i4 = i5 * 53;
                    c4 = B5.h(obj, j4);
                    i5 = i4 + c4;
                    break;
                case 12:
                    i4 = i5 * 53;
                    c4 = B5.h(obj, j4);
                    i5 = i4 + c4;
                    break;
                case 13:
                    i4 = i5 * 53;
                    c4 = B5.h(obj, j4);
                    i5 = i4 + c4;
                    break;
                case 14:
                    i4 = i5 * 53;
                    c4 = C1503t4.c(B5.i(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 15:
                    i4 = i5 * 53;
                    c4 = B5.h(obj, j4);
                    i5 = i4 + c4;
                    break;
                case 16:
                    i4 = i5 * 53;
                    c4 = C1503t4.c(B5.i(obj, j4));
                    i5 = i4 + c4;
                    break;
                case 17:
                    Object k5 = B5.k(obj, j4);
                    if (k5 != null) {
                        i8 = k5.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.f9571D /* 29 */:
                case 30:
                case ConstraintLayout.b.a.f9573F /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i5 * 53;
                    c4 = B5.k(obj, j4).hashCode();
                    i5 = i4 + c4;
                    break;
                case 50:
                    i4 = i5 * 53;
                    c4 = B5.k(obj, j4).hashCode();
                    i5 = i4 + c4;
                    break;
                case 51:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.c(Double.doubleToLongBits(A(obj, j4)));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = Float.floatToIntBits(B(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.c(e(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.c(e(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = E(obj, j4);
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.c(e(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = E(obj, j4);
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.a(u(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = ((String) B5.k(obj, j4)).hashCode();
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = B5.k(obj, j4).hashCode();
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = B5.k(obj, j4).hashCode();
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = E(obj, j4);
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case C0755c.f12913k /* 63 */:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = E(obj, j4);
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = E(obj, j4);
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.c(e(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = E(obj, j4);
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = C1503t4.c(e(obj, j4));
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (t(obj, i7, i6)) {
                        i4 = i5 * 53;
                        c4 = B5.k(obj, j4).hashCode();
                        i5 = i4 + c4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i5 * 53) + this.f29492l.c(obj).hashCode();
        if (!this.f29486f) {
            return hashCode;
        }
        this.f29493m.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final Object zze() {
        return ((AbstractC1440l4) this.f29485e).y(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void zzf(Object obj) {
        int i4;
        int i5 = this.f29489i;
        while (true) {
            i4 = this.f29490j;
            if (i5 >= i4) {
                break;
            }
            long d4 = d(this.f29488h[i5]) & 1048575;
            Object k4 = B5.k(obj, d4);
            if (k4 != null) {
                ((zzlf) k4).h();
                B5.x(obj, d4, k4);
            }
            i5++;
        }
        int length = this.f29488h.length;
        while (i4 < length) {
            this.f29491k.a(obj, this.f29488h[i4]);
            i4++;
        }
        this.f29492l.g(obj);
        if (this.f29486f) {
            this.f29493m.b(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i4 = 0; i4 < this.f29481a.length; i4 += 3) {
            int d4 = d(i4);
            long j4 = 1048575 & d4;
            int i5 = this.f29481a[i4];
            switch (c(d4)) {
                case 0:
                    if (q(obj2, i4)) {
                        B5.t(obj, j4, B5.f(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(obj2, i4)) {
                        B5.u(obj, j4, B5.g(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(obj2, i4)) {
                        B5.w(obj, j4, B5.i(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(obj2, i4)) {
                        B5.w(obj, j4, B5.i(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(obj2, i4)) {
                        B5.v(obj, j4, B5.h(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(obj2, i4)) {
                        B5.w(obj, j4, B5.i(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(obj2, i4)) {
                        B5.v(obj, j4, B5.h(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(obj2, i4)) {
                        B5.r(obj, j4, B5.B(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(obj2, i4)) {
                        B5.x(obj, j4, B5.k(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    j(obj, obj2, i4);
                    break;
                case 10:
                    if (q(obj2, i4)) {
                        B5.x(obj, j4, B5.k(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(obj2, i4)) {
                        B5.v(obj, j4, B5.h(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(obj2, i4)) {
                        B5.v(obj, j4, B5.h(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(obj2, i4)) {
                        B5.v(obj, j4, B5.h(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(obj2, i4)) {
                        B5.w(obj, j4, B5.i(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(obj2, i4)) {
                        B5.v(obj, j4, B5.h(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(obj2, i4)) {
                        B5.w(obj, j4, B5.i(obj2, j4));
                        l(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    j(obj, obj2, i4);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.f9571D /* 29 */:
                case 30:
                case ConstraintLayout.b.a.f9573F /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f29491k.b(obj, obj2, j4);
                    break;
                case 50:
                    C1369c5.B(this.f29495o, obj, obj2, j4);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (t(obj2, i5, i4)) {
                        B5.x(obj, j4, B5.k(obj2, j4));
                        m(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    k(obj, obj2, i4);
                    break;
                case kotlinx.coroutines.internal.B.f54416q /* 61 */:
                case 62:
                case C0755c.f12913k /* 63 */:
                case 64:
                case 65:
                case 66:
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (t(obj2, i5, i4)) {
                        B5.x(obj, j4, B5.k(obj2, j4));
                        m(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    k(obj, obj2, i4);
                    break;
            }
        }
        C1369c5.f(this.f29492l, obj, obj2);
        if (this.f29486f) {
            C1369c5.e(this.f29493m, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzj(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S4.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1353a5
    public final boolean zzk(Object obj) {
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f29489i) {
            int i9 = this.f29488h[i8];
            int i10 = this.f29481a[i9];
            int d4 = d(i9);
            int i11 = this.f29481a[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f29480q.getInt(obj, i12);
                }
                i5 = i7;
                i4 = i12;
            } else {
                i4 = i6;
                i5 = i7;
            }
            if ((268435456 & d4) != 0 && !r(obj, i9, i4, i5, i13)) {
                return false;
            }
            int c4 = c(d4);
            if (c4 != 9 && c4 != 17) {
                if (c4 != 27) {
                    if (c4 != 60 && c4 != 68) {
                        if (c4 != 49) {
                            if (c4 == 50 && !((zzlf) B5.k(obj, d4 & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (t(obj, i10, i9) && !s(obj, d4, g(i9))) {
                        return false;
                    }
                }
                List list = (List) B5.k(obj, d4 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC1353a5 g4 = g(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!g4.zzk(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (r(obj, i9, i4, i5, i13) && !s(obj, d4, g(i9))) {
                return false;
            }
            i8++;
            i6 = i4;
            i7 = i5;
        }
        if (!this.f29486f) {
            return true;
        }
        this.f29493m.a(obj);
        throw null;
    }
}
