package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements com.google.android.datatransport.runtime.dagger.internal.g<Executor> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final l f27481a = new l();

        private a() {
        }
    }

    public static l a() {
        return a.f27481a;
    }

    public static Executor b() {
        return (Executor) com.google.android.datatransport.runtime.dagger.internal.p.c(k.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // O2.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
