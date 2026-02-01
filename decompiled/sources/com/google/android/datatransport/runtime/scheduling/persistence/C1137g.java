package com.google.android.datatransport.runtime.scheduling.persistence;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137g implements com.google.android.datatransport.runtime.dagger.internal.g<String> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C1137g f27671a = new C1137g();

        private a() {
        }
    }

    public static C1137g a() {
        return a.f27671a;
    }

    public static String b() {
        return (String) com.google.android.datatransport.runtime.dagger.internal.p.c(AbstractC1136f.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // O2.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
