package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1728u3 f30104E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ long f30105F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C3 f30106G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A3(C3 c32, C1728u3 c1728u3, long j4) {
        this.f30106G = c32;
        this.f30104E = c1728u3;
        this.f30105F = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30106G.n(this.f30104E, false, this.f30105F);
        C3 c32 = this.f30106G;
        c32.f30127e = null;
        c32.f31060a.J().s(null);
    }
}
