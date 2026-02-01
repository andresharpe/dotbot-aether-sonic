package com.google.firebase.messaging;

import java.io.IOException;
import java.io.OutputStream;
import w1.InterfaceC2431a;

@InterfaceC2431a
/* loaded from: classes2.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.g f36495a = com.google.firebase.encoders.proto.g.a().e(C1816a.f36839b).d();

    private M() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f36495a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f36495a.c(obj);
    }

    public abstract com.google.firebase.messaging.reporting.a c();
}
