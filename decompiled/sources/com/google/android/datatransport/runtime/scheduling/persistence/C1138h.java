package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1138h implements com.google.android.datatransport.runtime.dagger.internal.g<String> {

    /* renamed from: a, reason: collision with root package name */
    private final O2.c<Context> f27672a;

    public C1138h(O2.c<Context> cVar) {
        this.f27672a = cVar;
    }

    public static C1138h a(O2.c<Context> cVar) {
        return new C1138h(cVar);
    }

    public static String c(Context context) {
        return (String) com.google.android.datatransport.runtime.dagger.internal.p.c(AbstractC1136f.d(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f27672a.get());
    }
}
