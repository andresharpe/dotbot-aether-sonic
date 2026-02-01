package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1365c1 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Activity f29601I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1413i1 f29602J;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365c1(C1413i1 c1413i1, Activity activity) {
        super(c1413i1.f29669E, true);
        this.f29602J = c1413i1;
        this.f29601I = activity;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29602J.f29669E.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).onActivityResumed(com.google.android.gms.dynamic.f.O0(this.f29601I), this.f29547F);
    }
}
