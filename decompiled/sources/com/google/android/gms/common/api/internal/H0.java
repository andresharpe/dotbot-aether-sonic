package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1181e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface H0 {
    C1231c d();

    boolean e();

    C1231c f(long j4, TimeUnit timeUnit);

    void g();

    <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T h(@androidx.annotation.N T t3);

    boolean i();

    <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T j(@androidx.annotation.N T t3);

    void k();

    void l();

    void m();

    boolean n(InterfaceC1222w interfaceC1222w);

    void o(String str, @androidx.annotation.P FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.P String[] strArr);

    @androidx.annotation.P
    C1231c p(@androidx.annotation.N C1164a<?> c1164a);
}
