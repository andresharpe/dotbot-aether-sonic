package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.c;
import com.google.auto.value.AutoValue;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes.dex */
public abstract class p {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract p a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(com.google.android.datatransport.c cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(com.google.android.datatransport.d<?> dVar);

        public <T> a d(com.google.android.datatransport.d<T> dVar, com.google.android.datatransport.c cVar, com.google.android.datatransport.f<T, byte[]> fVar) {
            c(dVar);
            b(cVar);
            e(fVar);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a e(com.google.android.datatransport.f<?, byte[]> fVar);

        public abstract a f(q qVar);

        public abstract a g(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract com.google.android.datatransport.c b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract com.google.android.datatransport.d<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract com.google.android.datatransport.f<?, byte[]> e();

    public abstract q f();

    public abstract String g();
}
