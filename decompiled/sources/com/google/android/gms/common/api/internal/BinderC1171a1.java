package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.InterfaceC0564g;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1259k0;
import com.google.android.gms.common.internal.C1285y;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1171a1 extends com.google.android.gms.signin.internal.d implements i.b, i.c {

    /* renamed from: p, reason: collision with root package name */
    private static final C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> f28224p = com.google.android.gms.signin.e.f31083c;

    /* renamed from: i, reason: collision with root package name */
    private final Context f28225i;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f28226j;

    /* renamed from: k, reason: collision with root package name */
    private final C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> f28227k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<Scope> f28228l;

    /* renamed from: m, reason: collision with root package name */
    private final C1250g f28229m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.android.gms.signin.f f28230n;

    /* renamed from: o, reason: collision with root package name */
    private Z0 f28231o;

    @androidx.annotation.j0
    public BinderC1171a1(Context context, Handler handler, @androidx.annotation.N C1250g c1250g) {
        C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a = f28224p;
        this.f28225i = context;
        this.f28226j = handler;
        this.f28229m = (C1250g) C1285y.m(c1250g, "ClientSettings must not be null");
        this.f28228l = c1250g.i();
        this.f28227k = abstractC0265a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void P1(BinderC1171a1 binderC1171a1, com.google.android.gms.signin.internal.l lVar) {
        C1231c c02 = lVar.c0();
        if (c02.x0()) {
            C1259k0 c1259k0 = (C1259k0) C1285y.l(lVar.e0());
            C1231c c03 = c1259k0.c0();
            if (!c03.x0()) {
                String valueOf = String.valueOf(c03);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC1171a1.f28231o.b(c03);
                binderC1171a1.f28230n.c();
                return;
            }
            binderC1171a1.f28231o.c(c1259k0.e0(), binderC1171a1.f28228l);
        } else {
            binderC1171a1.f28231o.b(c02);
        }
        binderC1171a1.f28230n.c();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1211q
    @androidx.annotation.j0
    public final void A(@androidx.annotation.N C1231c c1231c) {
        this.f28231o.b(c1231c);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    @androidx.annotation.j0
    public final void G(@androidx.annotation.P Bundle bundle) {
        this.f28230n.r(this);
    }

    @androidx.annotation.j0
    public final void Q1(Z0 z02) {
        com.google.android.gms.signin.f fVar = this.f28230n;
        if (fVar != null) {
            fVar.c();
        }
        this.f28229m.o(Integer.valueOf(System.identityHashCode(this)));
        C1164a.AbstractC0265a<? extends com.google.android.gms.signin.f, com.google.android.gms.signin.a> abstractC0265a = this.f28227k;
        Context context = this.f28225i;
        Looper looper = this.f28226j.getLooper();
        C1250g c1250g = this.f28229m;
        this.f28230n = abstractC0265a.c(context, looper, c1250g, c1250g.k(), this, this);
        this.f28231o = z02;
        Set<Scope> set = this.f28228l;
        if (set != null && !set.isEmpty()) {
            this.f28230n.d();
        } else {
            this.f28226j.post(new X0(this));
        }
    }

    public final void R1() {
        com.google.android.gms.signin.f fVar = this.f28230n;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // com.google.android.gms.signin.internal.d, com.google.android.gms.signin.internal.f
    @InterfaceC0564g
    public final void n0(com.google.android.gms.signin.internal.l lVar) {
        this.f28226j.post(new Y0(this, lVar));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    @androidx.annotation.j0
    public final void v(int i4) {
        this.f28230n.c();
    }
}
