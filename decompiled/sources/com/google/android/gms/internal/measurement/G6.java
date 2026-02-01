package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class G6 implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29342a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29343b;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).b().a();
        f29342a = a4.f("measurement.collection.enable_session_stitching_token.client.dev", false);
        f29343b = a4.f("measurement.collection.enable_session_stitching_token.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zzb() {
        return ((Boolean) f29342a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zzc() {
        return ((Boolean) f29343b.b()).booleanValue();
    }
}
