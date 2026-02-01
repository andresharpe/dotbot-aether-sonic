package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC1674l2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30839a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30840b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f30841c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30842d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1674l2(BinderC1751y2 binderC1751y2, String str, String str2, String str3) {
        this.f30842d = binderC1751y2;
        this.f30839a = str;
        this.f30840b = str2;
        this.f30841c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        L4 l4;
        L4 l42;
        l4 = this.f30842d.f31053i;
        l4.c();
        l42 = this.f30842d.f31053i;
        return l42.U().b0(this.f30839a, this.f30840b, this.f30841c);
    }
}
