package com.google.android.datatransport.cct.internal;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.f;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class k {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        @N
        public abstract k a();

        @N
        public abstract a b(@P Integer num);

        @N
        public abstract a c(long j4);

        @N
        public abstract a d(long j4);

        @N
        public abstract a e(@P NetworkConnectionInfo networkConnectionInfo);

        @N
        abstract a f(@P byte[] bArr);

        @N
        abstract a g(@P String str);

        @N
        public abstract a h(long j4);
    }

    private static a a() {
        return new f.b();
    }

    @N
    public static a i(@N String str) {
        return a().g(str);
    }

    @N
    public static a j(@N byte[] bArr) {
        return a().f(bArr);
    }

    @P
    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    @P
    public abstract NetworkConnectionInfo e();

    @P
    public abstract byte[] f();

    @P
    public abstract String g();

    public abstract long h();
}
