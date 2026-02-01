package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1458n6 implements InterfaceC1450m6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29721a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29722b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29723c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29724d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1423j3 f29725e;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).b().a();
        f29721a = a4.f("measurement.client.global_params", true);
        f29722b = a4.f("measurement.service.global_params_in_payload", true);
        f29723c = a4.f("measurement.service.clear_global_params_on_uninstall", true);
        f29724d = a4.f("measurement.service.global_params", true);
        f29725e = a4.d("measurement.id.service.global_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1450m6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1450m6
    public final boolean zzb() {
        return ((Boolean) f29723c.b()).booleanValue();
    }
}
