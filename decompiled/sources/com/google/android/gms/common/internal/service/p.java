package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC1220v;
import com.google.android.gms.common.internal.F;
import com.google.android.gms.common.internal.H;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes.dex */
public final class p extends com.google.android.gms.common.api.h<I> implements H {

    /* renamed from: k, reason: collision with root package name */
    private static final C1164a.g<q> f28808k;

    /* renamed from: l, reason: collision with root package name */
    private static final C1164a.AbstractC0265a<q, I> f28809l;

    /* renamed from: m, reason: collision with root package name */
    private static final C1164a<I> f28810m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f28811n = 0;

    static {
        C1164a.g<q> gVar = new C1164a.g<>();
        f28808k = gVar;
        o oVar = new o();
        f28809l = oVar;
        f28810m = new C1164a<>("ClientTelemetry.API", oVar, gVar);
    }

    public p(Context context, I i4) {
        super(context, f28810m, i4, h.a.f28086c);
    }

    @Override // com.google.android.gms.common.internal.H
    public final AbstractC1770k<Void> a(final F f4) {
        A.a a4 = A.a();
        a4.e(com.google.android.gms.internal.base.d.f29100a);
        a4.d(false);
        a4.c(new InterfaceC1220v() { // from class: com.google.android.gms.common.internal.service.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
            public final void a(Object obj, Object obj2) {
                F f5 = F.this;
                int i4 = p.f28811n;
                ((j) ((q) obj).M()).N1(f5);
                ((C1771l) obj2).c(null);
            }
        });
        return g(a4.a());
    }
}
