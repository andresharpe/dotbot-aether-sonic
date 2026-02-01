package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1392f4 implements N4 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1392f4 f29647a = new C1392f4();

    private C1392f4() {
    }

    public static C1392f4 a() {
        return f29647a;
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final M4 zzb(Class cls) {
        if (AbstractC1440l4.class.isAssignableFrom(cls)) {
            try {
                return (M4) AbstractC1440l4.x(cls.asSubclass(AbstractC1440l4.class)).y(3, null, null);
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final boolean zzc(Class cls) {
        return AbstractC1440l4.class.isAssignableFrom(cls);
    }
}
