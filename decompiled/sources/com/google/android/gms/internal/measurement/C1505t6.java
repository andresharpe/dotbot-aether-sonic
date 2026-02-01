package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1505t6 implements InterfaceC1497s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1423j3 f29796a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423j3 f29797b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1423j3 f29798c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423j3 f29799d;

    static {
        C1391f3 a4 = new C1391f3(X2.a("com.google.android.gms.measurement")).a();
        f29796a = a4.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f29797b = a4.f("measurement.lifecycle.app_backgrounded_tracking", true);
        f29798c = a4.f("measurement.lifecycle.app_in_background_parameter", false);
        f29799d = a4.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1497s6
    public final boolean zza() {
        return ((Boolean) f29798c.b()).booleanValue();
    }
}
