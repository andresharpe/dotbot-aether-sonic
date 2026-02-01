package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.common.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318f extends zzag {

    /* renamed from: G, reason: collision with root package name */
    final transient int f29147G;

    /* renamed from: H, reason: collision with root package name */
    final transient int f29148H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ zzag f29149I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1318f(zzag zzagVar, int i4, int i5) {
        this.f29149I = zzagVar;
        this.f29147G = i4;
        this.f29148H = i5;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int c() {
        return this.f29149I.d() + this.f29147G + this.f29148H;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int d() {
        return this.f29149I.d() + this.f29147G;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        B.a(i4, this.f29148H, FirebaseAnalytics.b.f34777X);
        return this.f29149I.get(i4 + this.f29147G);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @CheckForNull
    final Object[] k() {
        return this.f29149I.k();
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* renamed from: l */
    public final zzag subList(int i4, int i5) {
        B.c(i4, i5, this.f29148H);
        zzag zzagVar = this.f29149I;
        int i6 = this.f29147G;
        return zzagVar.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29148H;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i4, int i5) {
        return subList(i4, i5);
    }
}
