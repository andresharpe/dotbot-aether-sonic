package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes.dex */
public final class m1 extends AbstractC1192h1<Void> {

    /* renamed from: c, reason: collision with root package name */
    public final P0 f28353c;

    public m1(P0 p02, C1771l<Void> c1771l) {
        super(3, c1771l);
        this.f28353c = p02;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1192h1, com.google.android.gms.common.api.internal.p1
    public final /* bridge */ /* synthetic */ void d(@androidx.annotation.N H h4, boolean z3) {
    }

    @Override // com.google.android.gms.common.api.internal.G0
    public final boolean f(C1223w0<?> c1223w0) {
        return this.f28353c.f28201a.f();
    }

    @Override // com.google.android.gms.common.api.internal.G0
    @androidx.annotation.P
    public final C1233e[] g(C1223w0<?> c1223w0) {
        return this.f28353c.f28201a.c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1192h1
    public final void h(C1223w0<?> c1223w0) throws RemoteException {
        this.f28353c.f28201a.d(c1223w0.s(), this.f28283b);
        C1205n.a<?> b4 = this.f28353c.f28201a.b();
        if (b4 != null) {
            c1223w0.u().put(b4, this.f28353c);
        }
    }
}
