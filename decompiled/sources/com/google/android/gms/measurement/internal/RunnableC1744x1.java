package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import java.util.Map;

@androidx.annotation.j0
/* renamed from: com.google.android.gms.measurement.internal.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1744x1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final InterfaceC1732v1 f31026E;

    /* renamed from: F, reason: collision with root package name */
    private final int f31027F;

    /* renamed from: G, reason: collision with root package name */
    private final Throwable f31028G;

    /* renamed from: H, reason: collision with root package name */
    private final byte[] f31029H;

    /* renamed from: I, reason: collision with root package name */
    private final String f31030I;

    /* renamed from: J, reason: collision with root package name */
    private final Map f31031J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC1744x1(String str, InterfaceC1732v1 interfaceC1732v1, int i4, Throwable th, byte[] bArr, Map map, C1738w1 c1738w1) {
        C1285y.l(interfaceC1732v1);
        this.f31026E = interfaceC1732v1;
        this.f31027F = i4;
        this.f31028G = th;
        this.f31029H = bArr;
        this.f31030I = str;
        this.f31031J = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31026E.a(this.f31030I, this.f31027F, this.f31028G, this.f31029H, this.f31031J);
    }
}
