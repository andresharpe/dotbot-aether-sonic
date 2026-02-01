package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class B4 extends D4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ B4(A4 a4) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D4
    public final void a(Object obj, long j4) {
        ((InterfaceC1495s4) B5.k(obj, j4)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D4
    public final void b(Object obj, Object obj2, long j4) {
        InterfaceC1495s4 interfaceC1495s4 = (InterfaceC1495s4) B5.k(obj, j4);
        InterfaceC1495s4 interfaceC1495s42 = (InterfaceC1495s4) B5.k(obj2, j4);
        int size = interfaceC1495s4.size();
        int size2 = interfaceC1495s42.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC1495s4.zzc()) {
                interfaceC1495s4 = interfaceC1495s4.zzd(size2 + size);
            }
            interfaceC1495s4.addAll(interfaceC1495s42);
        }
        if (size > 0) {
            interfaceC1495s42 = interfaceC1495s4;
        }
        B5.x(obj, j4, interfaceC1495s42);
    }

    private B4() {
        super(null);
    }
}
