package com.google.firebase.installations.remote;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.a;

@AutoValue
/* loaded from: classes2.dex */
public abstract class InstallationResponse {

    /* loaded from: classes2.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @N
        public abstract InstallationResponse a();

        @N
        public abstract a b(@N TokenResult tokenResult);

        @N
        public abstract a c(@N String str);

        @N
        public abstract a d(@N String str);

        @N
        public abstract a e(@N ResponseCode responseCode);

        @N
        public abstract a f(@N String str);
    }

    @N
    public static a a() {
        return new a.b();
    }

    @P
    public abstract TokenResult b();

    @P
    public abstract String c();

    @P
    public abstract String d();

    @P
    public abstract ResponseCode e();

    @P
    public abstract String f();

    @N
    public abstract a g();
}
