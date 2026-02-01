package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.P;
import com.google.android.gms.internal.measurement.C1421j1;
import com.google.android.gms.measurement.internal.G2;
import com.google.android.gms.measurement.internal.H2;
import com.google.android.gms.measurement.internal.InterfaceC1693o3;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class c implements InterfaceC1693o3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1421j1 f34822a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(C1421j1 c1421j1) {
        this.f34822a = c1421j1;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final List a(@P String str, @P String str2) {
        return this.f34822a.L(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final Map b(@P String str, @P String str2, boolean z3) {
        return this.f34822a.M(str, str2, z3);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void c(String str, String str2, Bundle bundle, long j4) {
        this.f34822a.V(str, str2, bundle, j4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void d(Bundle bundle) {
        this.f34822a.d(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void e(String str, String str2, Bundle bundle) {
        this.f34822a.U(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void f(String str) {
        this.f34822a.Q(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void g(H2 h22) {
        this.f34822a.o(h22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void h(String str, @P String str2, @P Bundle bundle) {
        this.f34822a.R(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void i(String str) {
        this.f34822a.S(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void j(G2 g22) {
        this.f34822a.j(g22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final void k(H2 h22) {
        this.f34822a.b(h22);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final int zza(String str) {
        return this.f34822a.w(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    public final long zzb() {
        return this.f34822a.x();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    @P
    public final Object zzg(int i4) {
        return this.f34822a.D(i4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    @P
    public final String zzh() {
        return this.f34822a.H();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    @P
    public final String zzi() {
        return this.f34822a.I();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    @P
    public final String zzj() {
        return this.f34822a.J();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1693o3
    @P
    public final String zzk() {
        return this.f34822a.K();
    }
}
