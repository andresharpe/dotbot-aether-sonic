package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1610a4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC1622c4 f30540E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1610a4(ServiceConnectionC1622c4 serviceConnectionC1622c4) {
        this.f30540E = serviceConnectionC1622c4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1628d4 c1628d4 = this.f30540E.f30572e;
        Context d4 = c1628d4.f31060a.d();
        this.f30540E.f30572e.f31060a.zzaw();
        C1628d4.K(c1628d4, new ComponentName(d4, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
