package com.google.firebase.installations.remote;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.b;

@AutoValue
/* loaded from: classes2.dex */
public abstract class TokenResult {

    /* loaded from: classes2.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @N
        public abstract TokenResult a();

        @N
        public abstract a b(@N ResponseCode responseCode);

        @N
        public abstract a c(@N String str);

        @N
        public abstract a d(long j4);
    }

    @N
    public static a a() {
        return new b.C0337b().d(0L);
    }

    @P
    public abstract ResponseCode b();

    @P
    public abstract String c();

    @N
    public abstract long d();

    @N
    public abstract a e();
}
