package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J2 implements InterfaceC1685n1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1638f2 f30270a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(K2 k22, C1638f2 c1638f2) {
        this.f30270a = c1638f2;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1685n1
    public final boolean zza() {
        if (this.f30270a.o() && Log.isLoggable(this.f30270a.b().A(), 3)) {
            return true;
        }
        return false;
    }
}
