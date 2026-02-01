package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes.dex */
public final class n1<ResultT> extends G0 {

    /* renamed from: b, reason: collision with root package name */
    private final A<C1164a.b, ResultT> f28360b;

    /* renamed from: c, reason: collision with root package name */
    private final C1771l<ResultT> f28361c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1226y f28362d;

    public n1(int i4, A<C1164a.b, ResultT> a4, C1771l<ResultT> c1771l, InterfaceC1226y interfaceC1226y) {
        super(i4);
        this.f28361c = c1771l;
        this.f28360b = a4;
        this.f28362d = interfaceC1226y;
        if (i4 == 2 && a4.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(@androidx.annotation.N Status status) {
        this.f28361c.d(this.f28362d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(@androidx.annotation.N Exception exc) {
        this.f28361c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(C1223w0<?> c1223w0) throws DeadObjectException {
        try {
            this.f28360b.b(c1223w0.s(), this.f28361c);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            a(p1.e(e5));
        } catch (RuntimeException e6) {
            this.f28361c.d(e6);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void d(@androidx.annotation.N H h4, boolean z3) {
        h4.d(this.f28361c, z3);
    }

    @Override // com.google.android.gms.common.api.internal.G0
    public final boolean f(C1223w0<?> c1223w0) {
        return this.f28360b.c();
    }

    @Override // com.google.android.gms.common.api.internal.G0
    @androidx.annotation.P
    public final C1233e[] g(C1223w0<?> c1223w0) {
        return this.f28360b.e();
    }
}
