package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class A1 implements i.b, i.c {

    /* renamed from: i, reason: collision with root package name */
    public final C1164a<?> f28128i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f28129j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.P
    private B1 f28130k;

    public A1(C1164a<?> c1164a, boolean z3) {
        this.f28128i = c1164a;
        this.f28129j = z3;
    }

    private final B1 b() {
        C1285y.m(this.f28130k, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f28130k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1211q
    public final void A(@androidx.annotation.N C1231c c1231c) {
        b().O0(c1231c, this.f28128i, this.f28129j);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void G(@androidx.annotation.P Bundle bundle) {
        b().G(bundle);
    }

    public final void a(B1 b12) {
        this.f28130k = b12;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void v(int i4) {
        b().v(i4);
    }
}
