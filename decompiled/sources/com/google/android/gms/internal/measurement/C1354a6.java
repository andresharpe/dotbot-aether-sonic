package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1354a6 implements Z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29588a = new C1391f3(X2.a("com.google.android.gms.measurement")).a().f("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.Z5
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Z5
    public final boolean zzb() {
        return ((Boolean) f29588a.b()).booleanValue();
    }
}
