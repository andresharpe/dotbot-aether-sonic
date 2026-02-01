package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.common.internal.C1285y;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class N implements InterfaceC1202l0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1208o0 f28190a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28191b = false;

    public N(C1208o0 c1208o0) {
        this.f28190a = c1208o0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void a(@androidx.annotation.P Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void b() {
        if (this.f28191b) {
            this.f28191b = false;
            this.f28190a.s(new M(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void c(C1231c c1231c, C1164a<?> c1164a, boolean z3) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void d(int i4) {
        this.f28190a.r(null);
        this.f28190a.f28378w.b(i4, this.f28191b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void e() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T f(T t3) {
        h(t3);
        return t3;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final boolean g() {
        if (this.f28191b) {
            return false;
        }
        Set<C1195i1> set = this.f28190a.f28377v.f28346z;
        if (set != null && !set.isEmpty()) {
            this.f28191b = true;
            Iterator<C1195i1> it = set.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
            return false;
        }
        this.f28190a.r(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T h(T t3) {
        try {
            this.f28190a.f28377v.f28323A.a(t3);
            C1200k0 c1200k0 = this.f28190a.f28377v;
            C1164a.f fVar = c1200k0.f28338r.get(t3.g());
            C1285y.m(fVar, "Appropriate Api was not requested.");
            if (!fVar.a() && this.f28190a.f28370o.containsKey(t3.g())) {
                t3.a(new Status(17));
            } else {
                t3.i(fVar);
            }
        } catch (DeadObjectException unused) {
            this.f28190a.s(new L(this, this));
        }
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (this.f28191b) {
            this.f28191b = false;
            this.f28190a.f28377v.f28323A.b();
            g();
        }
    }
}
