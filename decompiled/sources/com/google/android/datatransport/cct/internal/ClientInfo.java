package com.google.android.datatransport.cct.internal;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.e;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class ClientInfo {

    /* loaded from: classes.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i4) {
            this.value = i4;
        }
    }

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        @N
        public abstract ClientInfo a();

        @N
        public abstract a b(@P com.google.android.datatransport.cct.internal.a aVar);

        @N
        public abstract a c(@P ClientType clientType);
    }

    @N
    public static a a() {
        return new e.b();
    }

    @P
    public abstract com.google.android.datatransport.cct.internal.a b();

    @P
    public abstract ClientType c();
}
