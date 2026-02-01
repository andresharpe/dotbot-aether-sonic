package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1386e6 implements InterfaceC1370c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29630a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29631b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29632c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29633d;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).a();
        f29630a = a4.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f29631b = a4.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f29632c = a4.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f29633d = a4.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1370c6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1370c6
    public final boolean zzb() {
        return ((Boolean) f29631b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1370c6
    public final boolean zzc() {
        return ((Boolean) f29632c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1370c6
    public final boolean zzd() {
        return ((Boolean) f29633d.b()).booleanValue();
    }
}
