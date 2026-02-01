package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.measurement.internal.C1638f2;
import com.google.android.gms.measurement.internal.C1687n3;
import com.google.android.gms.measurement.internal.G2;
import com.google.android.gms.measurement.internal.H2;
import com.google.android.gms.measurement.internal.P4;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final C1638f2 f30094a;

    /* renamed from: b, reason: collision with root package name */
    private final C1687n3 f30095b;

    public b(@N C1638f2 c1638f2) {
        super(null);
        C1285y.l(c1638f2);
        this.f30094a = c1638f2;
        this.f30095b = c1638f2.G();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final List a(String str, String str2) {
        return this.f30095b.X(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final Map b(String str, String str2, boolean z3) {
        return this.f30095b.Z(str, str2, z3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void c(String str, String str2, Bundle bundle, long j4) {
        this.f30095b.q(str, str2, bundle, true, false, j4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void d(Bundle bundle) {
        this.f30095b.B(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void e(String str, String str2, Bundle bundle) {
        this.f30095b.p(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void f(String str) {
        this.f30094a.w().j(str, this.f30094a.zzav().c());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void g(H2 h22) {
        this.f30095b.L(h22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void h(String str, String str2, Bundle bundle) {
        this.f30094a.G().m(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void i(String str) {
        this.f30094a.w().k(str, this.f30094a.zzav().c());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void j(G2 g22) {
        this.f30095b.F(g22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void k(H2 h22) {
        this.f30095b.v(h22);
    }

    @Override // com.google.android.gms.measurement.e
    public final Boolean l() {
        return this.f30095b.P();
    }

    @Override // com.google.android.gms.measurement.e
    public final Double m() {
        return this.f30095b.Q();
    }

    @Override // com.google.android.gms.measurement.e
    public final Integer n() {
        return this.f30095b.R();
    }

    @Override // com.google.android.gms.measurement.e
    public final Long o() {
        return this.f30095b.S();
    }

    @Override // com.google.android.gms.measurement.e
    public final String p() {
        return this.f30095b.W();
    }

    @Override // com.google.android.gms.measurement.e
    public final Map q(boolean z3) {
        List<P4> Y3 = this.f30095b.Y(z3);
        androidx.collection.a aVar = new androidx.collection.a(Y3.size());
        for (P4 p4 : Y3) {
            Object c02 = p4.c0();
            if (c02 != null) {
                aVar.put(p4.f30366F, c02);
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final int zza(String str) {
        this.f30095b.O(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final long zzb() {
        return this.f30094a.L().p0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final Object zzg(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return this.f30095b.P();
                    }
                    return this.f30095b.R();
                }
                return this.f30095b.Q();
            }
            return this.f30095b.S();
        }
        return this.f30095b.W();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzh() {
        return this.f30095b.T();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzi() {
        return this.f30095b.U();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzj() {
        return this.f30095b.V();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzk() {
        return this.f30095b.T();
    }
}
