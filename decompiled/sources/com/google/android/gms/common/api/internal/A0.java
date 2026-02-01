package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1246e;
import com.google.android.gms.common.internal.InterfaceC1268p;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class A0 implements AbstractC1246e.c, Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1164a.f f28122a;

    /* renamed from: b, reason: collision with root package name */
    private final C1175c<?> f28123b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private InterfaceC1268p f28124c = null;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    private Set<Scope> f28125d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28126e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1193i f28127f;

    public A0(C1193i c1193i, C1164a.f fVar, C1175c<?> c1175c) {
        this.f28127f = c1193i;
        this.f28122a = fVar;
        this.f28123b = c1175c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.j0
    public final void h() {
        InterfaceC1268p interfaceC1268p;
        if (this.f28126e && (interfaceC1268p = this.f28124c) != null) {
            this.f28122a.i(interfaceC1268p, this.f28125d);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e.c
    public final void a(@androidx.annotation.N C1231c c1231c) {
        Handler handler;
        handler = this.f28127f.f28303r;
        handler.post(new RunnableC1229z0(this, c1231c));
    }

    @Override // com.google.android.gms.common.api.internal.Z0
    @androidx.annotation.j0
    public final void b(C1231c c1231c) {
        Map map;
        map = this.f28127f.f28299n;
        C1223w0 c1223w0 = (C1223w0) map.get(this.f28123b);
        if (c1223w0 != null) {
            c1223w0.I(c1231c);
        }
    }

    @Override // com.google.android.gms.common.api.internal.Z0
    @androidx.annotation.j0
    public final void c(@androidx.annotation.P InterfaceC1268p interfaceC1268p, @androidx.annotation.P Set<Scope> set) {
        if (interfaceC1268p != null && set != null) {
            this.f28124c = interfaceC1268p;
            this.f28125d = set;
            h();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new C1231c(4));
        }
    }
}
