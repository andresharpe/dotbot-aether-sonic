package com.google.android.datatransport.cct.internal;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.g;
import com.google.auto.value.AutoValue;
import java.util.List;
import w1.InterfaceC2431a;

@AutoValue
/* loaded from: classes.dex */
public abstract class l {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        @N
        public abstract l a();

        @N
        public abstract a b(@P ClientInfo clientInfo);

        @N
        public abstract a c(@P List<k> list);

        @N
        abstract a d(@P Integer num);

        @N
        abstract a e(@P String str);

        @N
        public abstract a f(@P QosTier qosTier);

        @N
        public abstract a g(long j4);

        @N
        public abstract a h(long j4);

        @N
        public a i(int i4) {
            return d(Integer.valueOf(i4));
        }

        @N
        public a j(@N String str) {
            return e(str);
        }
    }

    @N
    public static a a() {
        return new g.b();
    }

    @P
    public abstract ClientInfo b();

    @P
    @InterfaceC2431a.InterfaceC0549a(name = "logEvent")
    public abstract List<k> c();

    @P
    public abstract Integer d();

    @P
    public abstract String e();

    @P
    public abstract QosTier f();

    public abstract long g();

    public abstract long h();
}
