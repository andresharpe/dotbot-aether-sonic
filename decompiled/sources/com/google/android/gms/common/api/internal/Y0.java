package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class Y0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.l f28221E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ BinderC1171a1 f28222F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0(BinderC1171a1 binderC1171a1, com.google.android.gms.signin.internal.l lVar) {
        this.f28222F = binderC1171a1;
        this.f28221E = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC1171a1.P1(this.f28222F, this.f28221E);
    }
}
