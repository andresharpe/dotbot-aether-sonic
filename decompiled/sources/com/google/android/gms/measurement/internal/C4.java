package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class C4 implements InterfaceC1732v1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30135a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L4 f30136b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4(L4 l4, String str) {
        this.f30136b = l4;
        this.f30135a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1732v1
    public final void a(String str, int i4, Throwable th, byte[] bArr, Map map) {
        this.f30136b.n(i4, th, bArr, this.f30135a);
    }
}
