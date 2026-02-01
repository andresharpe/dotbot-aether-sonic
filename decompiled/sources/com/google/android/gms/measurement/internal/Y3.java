package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class Y3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ ComponentName f30491E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC1622c4 f30492F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y3(ServiceConnectionC1622c4 serviceConnectionC1622c4, ComponentName componentName) {
        this.f30492F = serviceConnectionC1622c4;
        this.f30491E = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1628d4.K(this.f30492F.f30572e, this.f30491E);
    }
}
