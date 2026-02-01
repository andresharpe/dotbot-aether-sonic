package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class H4 implements N4 {

    /* renamed from: a, reason: collision with root package name */
    private final N4[] f29348a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H4(N4... n4Arr) {
        this.f29348a = n4Arr;
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final M4 zzb(Class cls) {
        N4[] n4Arr = this.f29348a;
        for (int i4 = 0; i4 < 2; i4++) {
            N4 n4 = n4Arr[i4];
            if (n4.zzc(cls)) {
                return n4.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final boolean zzc(Class cls) {
        N4[] n4Arr = this.f29348a;
        for (int i4 = 0; i4 < 2; i4++) {
            if (n4Arr[i4].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
