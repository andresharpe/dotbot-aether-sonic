package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S2 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ String f30402E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30403F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Object f30404G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f30405H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30406I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S2(C1687n3 c1687n3, String str, String str2, Object obj, long j4) {
        this.f30406I = c1687n3;
        this.f30402E = str;
        this.f30403F = str2;
        this.f30404G = obj;
        this.f30405H = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30406I.K(this.f30402E, this.f30403F, this.f30404G, this.f30405H);
    }
}
