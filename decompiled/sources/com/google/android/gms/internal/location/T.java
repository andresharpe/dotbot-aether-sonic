package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class T extends zzbs {

    /* renamed from: G, reason: collision with root package name */
    final transient int f29196G;

    /* renamed from: H, reason: collision with root package name */
    final transient int f29197H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ zzbs f29198I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(zzbs zzbsVar, int i4, int i5) {
        this.f29198I = zzbsVar;
        this.f29196G = i4;
        this.f29197H = i5;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final Object[] c() {
        return this.f29198I.c();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int d() {
        return this.f29198I.d() + this.f29196G;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int f() {
        return this.f29198I.d() + this.f29196G + this.f29197H;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        O.a(i4, this.f29197H, FirebaseAnalytics.b.f34777X);
        return this.f29198I.get(i4 + this.f29196G);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* renamed from: l */
    public final zzbs subList(int i4, int i5) {
        O.c(i4, i5, this.f29197H);
        zzbs zzbsVar = this.f29198I;
        int i6 = this.f29196G;
        return zzbsVar.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29197H;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
        return subList(i4, i5);
    }
}
