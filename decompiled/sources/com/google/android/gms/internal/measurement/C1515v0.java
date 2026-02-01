package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1515v0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Activity f29811I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29812J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ String f29813K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29814L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515v0(C1421j1 c1421j1, Activity activity, String str, String str2) {
        super(c1421j1, true);
        this.f29814L = c1421j1;
        this.f29811I = activity;
        this.f29812J = str;
        this.f29813K = str2;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    final void a() throws RemoteException {
        InterfaceC1396g0 interfaceC1396g0;
        interfaceC1396g0 = this.f29814L.f29685i;
        ((InterfaceC1396g0) C1285y.l(interfaceC1396g0)).setCurrentScreen(com.google.android.gms.dynamic.f.O0(this.f29811I), this.f29812J, this.f29813K, this.f29546E);
    }
}
