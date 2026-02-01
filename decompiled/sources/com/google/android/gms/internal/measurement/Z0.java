package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class Z0 extends AbstractBinderC1436l0 {

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.H2 f29571i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z0(com.google.android.gms.measurement.internal.H2 h22) {
        this.f29571i = h22;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1444m0
    public final void L(String str, String str2, Bundle bundle, long j4) {
        this.f29571i.a(str, str2, bundle, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1444m0
    public final int zzd() {
        return System.identityHashCode(this.f29571i);
    }
}
