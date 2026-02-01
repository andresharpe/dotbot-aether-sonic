package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.measurement.internal.G2;
import com.google.android.gms.measurement.internal.H2;
import com.google.android.gms.measurement.internal.InterfaceC1693o3;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1693o3 f30096a;

    public c(InterfaceC1693o3 interfaceC1693o3) {
        super(null);
        C1285y.l(interfaceC1693o3);
        this.f30096a = interfaceC1693o3;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final List a(String str, String str2) {
        return this.f30096a.a(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final Map b(String str, String str2, boolean z3) {
        return this.f30096a.b(str, str2, z3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void c(String str, String str2, Bundle bundle, long j4) {
        this.f30096a.c(str, str2, bundle, j4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void d(Bundle bundle) {
        this.f30096a.d(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void e(String str, String str2, Bundle bundle) {
        this.f30096a.e(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void f(String str) {
        this.f30096a.f(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void g(H2 h22) {
        this.f30096a.g(h22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void h(String str, String str2, Bundle bundle) {
        this.f30096a.h(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void i(String str) {
        this.f30096a.i(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void j(G2 g22) {
        this.f30096a.j(g22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void k(H2 h22) {
        this.f30096a.k(h22);
    }

    @Override // com.google.android.gms.measurement.e
    public final Boolean l() {
        return (Boolean) this.f30096a.zzg(4);
    }

    @Override // com.google.android.gms.measurement.e
    public final Double m() {
        return (Double) this.f30096a.zzg(2);
    }

    @Override // com.google.android.gms.measurement.e
    public final Integer n() {
        return (Integer) this.f30096a.zzg(3);
    }

    @Override // com.google.android.gms.measurement.e
    public final Long o() {
        return (Long) this.f30096a.zzg(1);
    }

    @Override // com.google.android.gms.measurement.e
    public final String p() {
        return (String) this.f30096a.zzg(0);
    }

    @Override // com.google.android.gms.measurement.e
    public final Map q(boolean z3) {
        return this.f30096a.b(null, null, z3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final int zza(String str) {
        return this.f30096a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final long zzb() {
        return this.f30096a.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final Object zzg(int i4) {
        return this.f30096a.zzg(i4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzh() {
        return this.f30096a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzi() {
        return this.f30096a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzj() {
        return this.f30096a.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final String zzk() {
        return this.f30096a.zzk();
    }
}
