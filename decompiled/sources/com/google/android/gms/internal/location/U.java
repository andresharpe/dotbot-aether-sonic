package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class U<E> extends zzbs<E> {

    /* renamed from: I, reason: collision with root package name */
    static final zzbs<Object> f29199I = new U(new Object[0], 0);

    /* renamed from: G, reason: collision with root package name */
    final transient Object[] f29200G;

    /* renamed from: H, reason: collision with root package name */
    private final transient int f29201H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(Object[] objArr, int i4) {
        this.f29200G = objArr;
        this.f29201H = i4;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final Object[] c() {
        return this.f29200G;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int f() {
        return this.f29201H;
    }

    @Override // java.util.List
    public final E get(int i4) {
        O.a(i4, this.f29201H, FirebaseAnalytics.b.f34777X);
        return (E) this.f29200G[i4];
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
    final int k(Object[] objArr, int i4) {
        System.arraycopy(this.f29200G, 0, objArr, 0, this.f29201H);
        return this.f29201H;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29201H;
    }
}
