package com.google.android.datatransport.runtime;

import java.io.IOException;
import java.io.OutputStream;
import w1.InterfaceC2431a;

@InterfaceC2431a
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.g f27482a = com.google.firebase.encoders.proto.g.a().e(a.f27325b).d();

    private m() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f27482a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f27482a.c(obj);
    }

    public abstract com.google.android.datatransport.runtime.firebase.transport.a c();
}
