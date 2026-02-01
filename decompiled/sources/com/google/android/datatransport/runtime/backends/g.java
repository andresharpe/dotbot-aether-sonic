package com.google.android.datatransport.runtime.backends;

import androidx.annotation.P;
import com.google.android.datatransport.runtime.backends.a;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class g {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract g a();

        public abstract a b(Iterable<com.google.android.datatransport.runtime.j> iterable);

        public abstract a c(@P byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public static g b(Iterable<com.google.android.datatransport.runtime.j> iterable) {
        return a().b(iterable).a();
    }

    public abstract Iterable<com.google.android.datatransport.runtime.j> c();

    @P
    public abstract byte[] d();
}
