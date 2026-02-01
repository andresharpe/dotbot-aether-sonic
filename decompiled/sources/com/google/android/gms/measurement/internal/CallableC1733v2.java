package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC1733v2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f31008a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f31009b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1733v2(BinderC1751y2 binderC1751y2, String str) {
        this.f31009b = binderC1751y2;
        this.f31008a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        L4 l4;
        L4 l42;
        l4 = this.f31009b.f31053i;
        l4.c();
        l42 = this.f31009b.f31053i;
        return l42.U().a0(this.f31008a);
    }
}
