package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.g<i> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Context> f27373a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27374b;

    /* renamed from: c, reason: collision with root package name */
    private final O2.c<com.google.android.datatransport.runtime.time.a> f27375c;

    public j(O2.c<Context> cVar, O2.c<com.google.android.datatransport.runtime.time.a> cVar2, O2.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        this.f27373a = cVar;
        this.f27374b = cVar2;
        this.f27375c = cVar3;
    }

    public static j a(O2.c<Context> cVar, O2.c<com.google.android.datatransport.runtime.time.a> cVar2, O2.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        return new j(cVar, cVar2, cVar3);
    }

    public static i c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f27373a.get(), this.f27374b.get(), this.f27375c.get());
    }
}
