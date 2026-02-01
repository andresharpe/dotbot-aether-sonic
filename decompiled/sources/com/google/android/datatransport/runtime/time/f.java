package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.p;

/* loaded from: classes.dex */
public final class f implements com.google.android.datatransport.runtime.dagger.internal.g<com.google.android.datatransport.runtime.time.a> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f27709a = new f();

        private a() {
        }
    }

    public static f a() {
        return a.f27709a;
    }

    public static com.google.android.datatransport.runtime.time.a c() {
        return (com.google.android.datatransport.runtime.time.a) p.c(d.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.time.a get() {
        return c();
    }
}
