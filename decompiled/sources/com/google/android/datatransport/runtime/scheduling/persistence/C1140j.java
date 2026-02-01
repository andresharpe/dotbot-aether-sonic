package com.google.android.datatransport.runtime.scheduling.persistence;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140j implements com.google.android.datatransport.runtime.dagger.internal.g<AbstractC1135e> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.j$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C1140j f27674a = new C1140j();

        private a() {
        }
    }

    public static C1140j a() {
        return a.f27674a;
    }

    public static AbstractC1135e c() {
        return (AbstractC1135e) com.google.android.datatransport.runtime.dagger.internal.p.c(AbstractC1136f.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // O2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1135e get() {
        return c();
    }
}
