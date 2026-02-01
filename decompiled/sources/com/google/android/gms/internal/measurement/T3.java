package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class T3 implements I5 {

    /* renamed from: a, reason: collision with root package name */
    private final S3 f29501a;

    private T3(S3 s32) {
        C1503t4.f(s32, "output");
        this.f29501a = s32;
        s32.f29478a = this;
    }

    public static T3 J(S3 s32) {
        T3 t3 = s32.f29478a;
        if (t3 != null) {
            return t3;
        }
        return new T3(s32);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void A(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).intValue();
                i6 += 4;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.l(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.k(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void B(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).doubleValue();
                i6 += 8;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.n(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.m(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void C(int i4, long j4) throws IOException {
        this.f29501a.v(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    @Deprecated
    public final void D(int i4) throws IOException {
        this.f29501a.s(i4, 3);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void E(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).floatValue();
                i6 += 4;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.l(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.k(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void F(int i4, Object obj, InterfaceC1353a5 interfaceC1353a5) throws IOException {
        Object obj2 = (P4) obj;
        Q3 q32 = (Q3) this.f29501a;
        q32.u((i4 << 3) | 2);
        AbstractC1518v3 abstractC1518v3 = (AbstractC1518v3) obj2;
        int h4 = abstractC1518v3.h();
        if (h4 == -1) {
            h4 = interfaceC1353a5.zza(abstractC1518v3);
            abstractC1518v3.j(h4);
        }
        q32.u(h4);
        interfaceC1353a5.a(obj2, q32.f29478a);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void G(int i4, long j4) throws IOException {
        this.f29501a.m(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void H(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                long longValue = ((Long) list.get(i7)).longValue();
                i6 += S3.b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                S3 s32 = this.f29501a;
                long longValue2 = ((Long) list.get(i5)).longValue();
                s32.w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            S3 s33 = this.f29501a;
            long longValue3 = ((Long) list.get(i5)).longValue();
            s33.v(i4, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void I(int i4, long j4) throws IOException {
        this.f29501a.v(i4, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void a(int i4, int i5) throws IOException {
        this.f29501a.t(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void b(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).longValue();
                i6 += 8;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.n(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.m(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void c(int i4, List list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f29501a.j(i4, (zzjd) list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void d(int i4, int i5) throws IOException {
        this.f29501a.k(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void e(int i4, boolean z3) throws IOException {
        this.f29501a.i(i4, z3);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void f(int i4, int i5) throws IOException {
        this.f29501a.t(i4, (i5 >> 31) ^ (i5 + i5));
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void g(int i4, String str) throws IOException {
        this.f29501a.r(i4, str);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void h(int i4, long j4) throws IOException {
        this.f29501a.v(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void i(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).booleanValue();
                i6++;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.h(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.i(i4, ((Boolean) list.get(i5)).booleanValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void j(int i4, long j4) throws IOException {
        this.f29501a.m(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void k(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += S3.a(((Integer) list.get(i7)).intValue());
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.u(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.t(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void l(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).intValue();
                i6 += 4;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.l(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.k(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void m(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += S3.z(((Integer) list.get(i7)).intValue());
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.p(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.o(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void n(int i4, int i5) throws IOException {
        this.f29501a.o(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void o(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += S3.z(((Integer) list.get(i7)).intValue());
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.p(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.o(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void p(int i4, int i5) throws IOException {
        this.f29501a.o(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void q(int i4, zzjd zzjdVar) throws IOException {
        this.f29501a.j(i4, zzjdVar);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void r(int i4, List list) throws IOException {
        int i5 = 0;
        if (list instanceof InterfaceC1535x4) {
            InterfaceC1535x4 interfaceC1535x4 = (InterfaceC1535x4) list;
            while (i5 < list.size()) {
                Object zzf = interfaceC1535x4.zzf(i5);
                if (zzf instanceof String) {
                    this.f29501a.r(i4, (String) zzf);
                } else {
                    this.f29501a.j(i4, (zzjd) zzf);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.r(i4, (String) list.get(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void s(int i4, double d4) throws IOException {
        this.f29501a.m(i4, Double.doubleToRawLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void t(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).longValue();
                i6 += 8;
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.n(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.m(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void u(int i4, int i5) throws IOException {
        this.f29501a.k(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void v(int i4, float f4) throws IOException {
        this.f29501a.k(i4, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void w(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue = ((Integer) list.get(i7)).intValue();
                i6 += S3.a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                S3 s32 = this.f29501a;
                int intValue2 = ((Integer) list.get(i5)).intValue();
                s32.u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            S3 s33 = this.f29501a;
            int intValue3 = ((Integer) list.get(i5)).intValue();
            s33.t(i4, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void x(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += S3.b(((Long) list.get(i7)).longValue());
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.w(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.v(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void y(int i4, Object obj, InterfaceC1353a5 interfaceC1353a5) throws IOException {
        S3 s32 = this.f29501a;
        s32.s(i4, 3);
        interfaceC1353a5.a((P4) obj, s32.f29478a);
        s32.s(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final void z(int i4, List list, boolean z3) throws IOException {
        int i5 = 0;
        if (z3) {
            this.f29501a.s(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += S3.b(((Long) list.get(i7)).longValue());
            }
            this.f29501a.u(i6);
            while (i5 < list.size()) {
                this.f29501a.w(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f29501a.v(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I5
    @Deprecated
    public final void zzh(int i4) throws IOException {
        this.f29501a.s(i4, 4);
    }
}
