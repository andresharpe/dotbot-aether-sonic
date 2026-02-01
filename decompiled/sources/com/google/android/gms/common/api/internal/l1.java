package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.api.internal.C1181e.a;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class l1<A extends C1181e.a<? extends com.google.android.gms.common.api.q, C1164a.b>> extends p1 {

    /* renamed from: b, reason: collision with root package name */
    protected final A f28351b;

    public l1(int i4, A a4) {
        super(i4);
        this.f28351b = (A) C1285y.m(a4, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(@androidx.annotation.N Status status) {
        try {
            this.f28351b.a(status);
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(@androidx.annotation.N Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f28351b.a(new Status(10, sb.toString()));
        } catch (IllegalStateException e4) {
            Log.w("ApiCallRunner", "Exception reporting failure", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(C1223w0<?> c1223w0) throws DeadObjectException {
        try {
            this.f28351b.i(c1223w0.s());
        } catch (RuntimeException e4) {
            b(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void d(@androidx.annotation.N H h4, boolean z3) {
        h4.c(this.f28351b, z3);
    }
}
