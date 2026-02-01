package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I4 implements InterfaceC1361b5 {

    /* renamed from: b, reason: collision with root package name */
    private static final N4 f29357b = new G4();

    /* renamed from: a, reason: collision with root package name */
    private final N4 f29358a;

    public I4() {
        N4 n4;
        N4[] n4Arr = new N4[2];
        n4Arr[0] = C1392f4.a();
        try {
            n4 = (N4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            n4 = f29357b;
        }
        n4Arr[1] = n4;
        H4 h4 = new H4(n4Arr);
        C1503t4.f(h4, "messageInfoFactory");
        this.f29358a = h4;
    }

    private static boolean a(M4 m4) {
        if (m4.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1361b5
    public final InterfaceC1353a5 zza(Class cls) {
        C1369c5.g(cls);
        M4 zzb = this.f29358a.zzb(cls);
        if (zzb.zzb()) {
            if (AbstractC1440l4.class.isAssignableFrom(cls)) {
                return T4.c(C1369c5.b(), C1352a4.b(), zzb.zza());
            }
            return T4.c(C1369c5.b0(), C1352a4.a(), zzb.zza());
        }
        if (AbstractC1440l4.class.isAssignableFrom(cls)) {
            if (a(zzb)) {
                return S4.y(cls, zzb, V4.b(), D4.d(), C1369c5.b(), C1352a4.b(), L4.b());
            }
            return S4.y(cls, zzb, V4.b(), D4.d(), C1369c5.b(), null, L4.b());
        }
        if (a(zzb)) {
            return S4.y(cls, zzb, V4.a(), D4.c(), C1369c5.b0(), C1352a4.a(), L4.a());
        }
        return S4.y(cls, zzb, V4.a(), D4.c(), C1369c5.a(), null, L4.a());
    }
}
