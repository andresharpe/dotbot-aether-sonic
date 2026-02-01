package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC1184f;
import com.google.android.gms.common.api.internal.InterfaceC1211q;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

@I0.a
/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1260l<T extends IInterface> extends AbstractC1246e<T> implements C1164a.f, Y {

    /* renamed from: P, reason: collision with root package name */
    @androidx.annotation.P
    private static volatile Executor f28782P;

    /* renamed from: M, reason: collision with root package name */
    private final C1250g f28783M;

    /* renamed from: N, reason: collision with root package name */
    private final Set<Scope> f28784N;

    /* renamed from: O, reason: collision with root package name */
    @androidx.annotation.P
    private final Account f28785O;

    @I0.a
    @com.google.android.gms.common.util.D
    protected AbstractC1260l(@androidx.annotation.N Context context, @androidx.annotation.N Handler handler, int i4, @androidx.annotation.N C1250g c1250g) {
        super(context, handler, AbstractC1262m.d(context), C1236h.x(), i4, null, null);
        this.f28783M = (C1250g) C1285y.l(c1250g);
        this.f28785O = c1250g.b();
        this.f28784N = t0(c1250g.e());
    }

    private final Set<Scope> t0(@androidx.annotation.N Set<Scope> set) {
        Set<Scope> s02 = s0(set);
        Iterator<Scope> it = s02.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return s02;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @androidx.annotation.P
    public final Account C() {
        return this.f28785O;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @androidx.annotation.P
    protected final Executor E() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @I0.a
    @androidx.annotation.N
    protected final Set<Scope> L() {
        return this.f28784N;
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @I0.a
    @androidx.annotation.N
    public Set<Scope> h() {
        if (x()) {
            return this.f28784N;
        }
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.C1164a.f
    @I0.a
    @androidx.annotation.N
    public C1233e[] o() {
        return new C1233e[0];
    }

    @I0.a
    @androidx.annotation.N
    protected final C1250g r0() {
        return this.f28783M;
    }

    @I0.a
    @androidx.annotation.N
    protected Set<Scope> s0(@androidx.annotation.N Set<Scope> set) {
        return set;
    }

    @I0.a
    protected AbstractC1260l(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, int i4, @androidx.annotation.N C1250g c1250g) {
        this(context, looper, AbstractC1262m.d(context), C1236h.x(), i4, c1250g, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @Deprecated
    public AbstractC1260l(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, int i4, @androidx.annotation.N C1250g c1250g, @androidx.annotation.N i.b bVar, @androidx.annotation.N i.c cVar) {
        this(context, looper, i4, c1250g, (InterfaceC1184f) bVar, (InterfaceC1211q) cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public AbstractC1260l(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, int i4, @androidx.annotation.N C1250g c1250g, @androidx.annotation.N InterfaceC1184f interfaceC1184f, @androidx.annotation.N InterfaceC1211q interfaceC1211q) {
        this(context, looper, AbstractC1262m.d(context), C1236h.x(), i4, c1250g, (InterfaceC1184f) C1285y.l(interfaceC1184f), (InterfaceC1211q) C1285y.l(interfaceC1211q));
    }

    @com.google.android.gms.common.util.D
    protected AbstractC1260l(@androidx.annotation.N Context context, @androidx.annotation.N Looper looper, @androidx.annotation.N AbstractC1262m abstractC1262m, @androidx.annotation.N C1236h c1236h, int i4, @androidx.annotation.N C1250g c1250g, @androidx.annotation.P InterfaceC1184f interfaceC1184f, @androidx.annotation.P InterfaceC1211q interfaceC1211q) {
        super(context, looper, abstractC1262m, c1236h, i4, interfaceC1184f == null ? null : new W(interfaceC1184f), interfaceC1211q == null ? null : new X(interfaceC1211q), c1250g.m());
        this.f28783M = c1250g;
        this.f28785O = c1250g.b();
        this.f28784N = t0(c1250g.e());
    }
}
