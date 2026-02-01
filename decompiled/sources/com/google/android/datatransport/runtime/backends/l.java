package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements com.google.android.datatransport.runtime.dagger.internal.g<k> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Context> f27383a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<i> f27384b;

    public l(O2.c<Context> cVar, O2.c<i> cVar2) {
        this.f27383a = cVar;
        this.f27384b = cVar2;
    }

    public static l a(O2.c<Context> cVar, O2.c<i> cVar2) {
        return new l(cVar, cVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f27383a.get(), this.f27384b.get());
    }
}
