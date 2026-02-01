package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1529w6 implements InterfaceC1521v6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29827a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29828b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29829c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29830d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1423j3 f29831e;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).a();
        f29827a = a4.f("measurement.test.boolean_flag", false);
        f29828b = a4.c("measurement.test.double_flag", -3.0d);
        f29829c = a4.d("measurement.test.int_flag", -2L);
        f29830d = a4.d("measurement.test.long_flag", -1L);
        f29831e = a4.e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1521v6
    public final double zza() {
        return ((Double) f29828b.b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1521v6
    public final long zzb() {
        return ((Long) f29829c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1521v6
    public final long zzc() {
        return ((Long) f29830d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1521v6
    public final String zzd() {
        return (String) f29831e.b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1521v6
    public final boolean zze() {
        return ((Boolean) f29827a.b()).booleanValue();
    }
}
