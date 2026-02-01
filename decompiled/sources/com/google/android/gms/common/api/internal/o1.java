package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes.dex */
public final class o1 extends AbstractC1192h1<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    public final C1205n.a<?> f28379c;

    public o1(C1205n.a<?> aVar, C1771l<Boolean> c1771l) {
        super(4, c1771l);
        this.f28379c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1192h1, com.google.android.gms.common.api.internal.p1
    public final /* bridge */ /* synthetic */ void d(@androidx.annotation.N H h4, boolean z3) {
    }

    @Override // com.google.android.gms.common.api.internal.G0
    public final boolean f(C1223w0<?> c1223w0) {
        P0 p02 = c1223w0.u().get(this.f28379c);
        if (p02 != null && p02.f28201a.f()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.G0
    @androidx.annotation.P
    public final C1233e[] g(C1223w0<?> c1223w0) {
        P0 p02 = c1223w0.u().get(this.f28379c);
        if (p02 == null) {
            return null;
        }
        return p02.f28201a.c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1192h1
    public final void h(C1223w0<?> c1223w0) throws RemoteException {
        P0 remove = c1223w0.u().remove(this.f28379c);
        if (remove != null) {
            remove.f28202b.b(c1223w0.s(), this.f28283b);
            remove.f28201a.a();
        } else {
            this.f28283b.e(Boolean.FALSE);
        }
    }
}
