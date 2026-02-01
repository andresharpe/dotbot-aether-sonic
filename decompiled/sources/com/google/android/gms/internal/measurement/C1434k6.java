package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1434k6 implements InterfaceC1426j6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29709a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29710b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29711c;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).a();
        f29709a = a4.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f29710b = a4.f("measurement.client.sessions.check_on_startup", true);
        f29711c = a4.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1426j6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1426j6
    public final boolean zzb() {
        return ((Boolean) f29709a.b()).booleanValue();
    }
}
