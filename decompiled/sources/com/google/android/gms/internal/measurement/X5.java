package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class X5 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29559a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29560b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29561c;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).b().a();
        f29559a = a4.f("measurement.collection.event_safelist", true);
        f29560b = a4.f("measurement.service.store_null_safelist", true);
        f29561c = a4.f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.W5
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.W5
    public final boolean zzb() {
        return ((Boolean) f29560b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.W5
    public final boolean zzc() {
        return ((Boolean) f29561c.b()).booleanValue();
    }
}
