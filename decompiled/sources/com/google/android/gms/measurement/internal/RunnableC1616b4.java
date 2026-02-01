package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1616b4 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC1622c4 f30553E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1616b4(ServiceConnectionC1622c4 serviceConnectionC1622c4) {
        this.f30553E = serviceConnectionC1622c4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30553E.f30572e.f30589d = null;
        this.f30553E.f30572e.B();
    }
}
