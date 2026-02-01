package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class U5 implements T5 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29514a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29515b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29516c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29517d;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).a();
        f29514a = a4.f("measurement.client.consent_state_v1", true);
        f29515b = a4.f("measurement.client.3p_consent_state_v1", true);
        f29516c = a4.f("measurement.service.consent_state_v1_W36", true);
        f29517d = a4.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final long zza() {
        return ((Long) f29517d.b()).longValue();
    }
}
