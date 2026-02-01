package com.harman.jbl.partybox.persistence;

import X2.l;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.reflect.n;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final X2.a<T> f42080a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final l<T, H0> f42081b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@d X2.a<? extends T> getter, @d l<? super T, H0> setter) {
        F.p(getter, "getter");
        F.p(setter, "setter");
        this.f42080a = getter;
        this.f42081b = setter;
    }

    public final T a(@e Object obj, @d n<?> property) {
        F.p(property, "property");
        return this.f42080a.n();
    }

    public final void b(@e Object obj, @d n<?> property, T t3) {
        F.p(property, "property");
        this.f42081b.C(t3);
    }
}
