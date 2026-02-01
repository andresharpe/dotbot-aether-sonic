package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
final class F4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f30182E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30183F = "_err";

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Bundle f30184G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ G4 f30185H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F4(G4 g4, String str, String str2, Bundle bundle) {
        this.f30185H = g4;
        this.f30182E = str;
        this.f30184G = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30185H.f30190a.i((C1736w) C1285y.l(this.f30185H.f30190a.f0().u0(this.f30182E, this.f30183F, this.f30184G, kotlinx.coroutines.W.f52989c, this.f30185H.f30190a.zzav().a(), false, true)), this.f30182E);
    }
}
