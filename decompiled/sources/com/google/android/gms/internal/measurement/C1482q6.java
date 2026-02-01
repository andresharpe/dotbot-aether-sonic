package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1482q6 implements InterfaceC1474p6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29750a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29751b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29752c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29753d;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).a();
        f29750a = a4.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f29751b = a4.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f29752c = a4.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f29753d = a4.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1474p6
    public final boolean zza() {
        return ((Boolean) f29752c.b()).booleanValue();
    }
}
