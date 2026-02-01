package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1523w0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Boolean f29820I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29821J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523w0(C1421j1 c1421j1, Boolean bool) {
        super(c1421j1, true);
        this.f29821J = c1421j1;
        this.f29820I = bool;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        InterfaceC1396g0 interfaceC1396g02;
        if (this.f29820I != null) {
            interfaceC1396g02 = this.f29821J.f29685i;
            ((InterfaceC1396g0) C1285y.l(interfaceC1396g02)).setMeasurementEnabled(this.f29820I.booleanValue(), this.f29546E);
        } else {
            interfaceC1396g0 = this.f29821J.f29685i;
            ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).clearMeasurementEnabled(this.f29546E);
        }
    }
}
