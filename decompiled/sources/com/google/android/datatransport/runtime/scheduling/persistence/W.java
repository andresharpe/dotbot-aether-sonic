package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* loaded from: classes.dex */
public final class W implements com.google.android.datatransport.runtime.dagger.internal.g<V> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Context> f27649a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<String> f27650b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<Integer> f27651c;

    public W(O2.c<Context> cVar, O2.c<String> cVar2, O2.c<Integer> cVar3) {
        this.f27649a = cVar;
        this.f27650b = cVar2;
        this.f27651c = cVar3;
    }

    public static W a(O2.c<Context> cVar, O2.c<String> cVar2, O2.c<Integer> cVar3) {
        return new W(cVar, cVar2, cVar3);
    }

    public static V c(Context context, String str, int i4) {
        return new V(context, str, i4);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public V get() {
        return c(this.f27649a.get(), this.f27650b.get(), this.f27651c.get().intValue());
    }
}
