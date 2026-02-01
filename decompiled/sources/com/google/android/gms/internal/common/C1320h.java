package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: Access modifiers changed from: package-private */
@NullMarked
/* renamed from: com.google.android.gms.internal.common.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320h extends zzag {

    /* renamed from: I, reason: collision with root package name */
    static final zzag f29150I = new C1320h(new Object[0], 0);

    /* renamed from: G, reason: collision with root package name */
    final transient Object[] f29151G;

    /* renamed from: H, reason: collision with root package name */
    private final transient int f29152H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1320h(Object[] objArr, int i4) {
        this.f29151G = objArr;
        this.f29152H = i4;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    final int b(Object[] objArr, int i4) {
        System.arraycopy(this.f29151G, 0, objArr, 0, this.f29152H);
        return this.f29152H;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int c() {
        return this.f29152H;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        B.a(i4, this.f29152H, FirebaseAnalytics.b.f34777X);
        Object obj = this.f29151G[i4];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] k() {
        return this.f29151G;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29152H;
    }
}
