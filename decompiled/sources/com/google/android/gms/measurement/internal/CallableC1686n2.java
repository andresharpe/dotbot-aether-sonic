package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC1686n2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30869a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30870b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f30871c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC1751y2 f30872d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1686n2(BinderC1751y2 binderC1751y2, String str, String str2, String str3) {
        this.f30872d = binderC1751y2;
        this.f30869a = str;
        this.f30870b = str2;
        this.f30871c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        L4 l4;
        L4 l42;
        l4 = this.f30872d.f31053i;
        l4.c();
        l42 = this.f30872d.f31053i;
        return l42.U().Y(this.f30869a, this.f30870b, this.f30871c);
    }
}
