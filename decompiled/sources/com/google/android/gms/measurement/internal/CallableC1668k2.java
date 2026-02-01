package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC1668k2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30826a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30827b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f30828c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30829d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1668k2(BinderC1751y2 binderC1751y2, String str, String str2, String str3) {
        this.f30829d = binderC1751y2;
        this.f30826a = str;
        this.f30827b = str2;
        this.f30828c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        L4 l4;
        L4 l42;
        l4 = this.f30829d.f31053i;
        l4.c();
        l42 = this.f30829d.f31053i;
        return l42.U().b0(this.f30826a, this.f30827b, this.f30828c);
    }
}
