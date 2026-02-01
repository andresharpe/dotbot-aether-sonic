package com.google.firebase.installations;

import androidx.annotation.N;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

@AutoValue
/* loaded from: classes2.dex */
public abstract class n {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @N
        public abstract n a();

        @N
        public abstract a b(@N String str);

        @N
        public abstract a c(long j4);

        @N
        public abstract a d(long j4);
    }

    @N
    public static a a() {
        return new a.b();
    }

    @N
    public abstract String b();

    @N
    public abstract long c();

    @N
    public abstract long d();

    @N
    public abstract a e();
}
