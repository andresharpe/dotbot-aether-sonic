package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1231c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ BinderC1171a1 f28219E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X0(BinderC1171a1 binderC1171a1) {
        this.f28219E = binderC1171a1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z0 z02;
        z02 = this.f28219E.f28231o;
        z02.b(new C1231c(4));
    }
}
