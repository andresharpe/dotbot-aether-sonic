package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class C6 implements B6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29287a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29288b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29289c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29290d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1423j3 f29291e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1423j3 f29292f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC1423j3 f29293g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC1423j3 f29294h;

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC1423j3 f29295i;

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC1423j3 f29296j;

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC1423j3 f29297k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC1423j3 f29298l;

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC1423j3 f29299m;

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC1423j3 f29300n;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).b().a();
        f29287a = a4.f("measurement.redaction.app_instance_id", true);
        f29288b = a4.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f29289c = a4.f("measurement.redaction.config_redacted_fields", true);
        f29290d = a4.f("measurement.redaction.device_info", true);
        f29291e = a4.f("measurement.redaction.e_tag", true);
        f29292f = a4.f("measurement.redaction.enhanced_uid", true);
        f29293g = a4.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f29294h = a4.f("measurement.redaction.google_signals", true);
        f29295i = a4.f("measurement.redaction.no_aiid_in_config_request", true);
        f29296j = a4.f("measurement.redaction.retain_major_os_version", true);
        f29297k = a4.f("measurement.redaction.scion_payload_generator", true);
        f29298l = a4.f("measurement.redaction.upload_redacted_fields", true);
        f29299m = a4.f("measurement.redaction.upload_subdomain_override", true);
        f29300n = a4.f("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzb() {
        return ((Boolean) f29287a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzc() {
        return ((Boolean) f29288b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzd() {
        return ((Boolean) f29289c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zze() {
        return ((Boolean) f29290d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzf() {
        return ((Boolean) f29291e.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzg() {
        return ((Boolean) f29292f.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzh() {
        return ((Boolean) f29293g.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzi() {
        return ((Boolean) f29294h.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzj() {
        return ((Boolean) f29295i.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzk() {
        return ((Boolean) f29296j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzl() {
        return ((Boolean) f29297k.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzm() {
        return ((Boolean) f29298l.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzn() {
        return ((Boolean) f29299m.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B6
    public final boolean zzo() {
        return ((Boolean) f29300n.b()).booleanValue();
    }
}
