package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.M;
import java.io.IOException;
import java.io.OutputStream;
import w1.InterfaceC2431a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f37123b = new C0340a().a();

    /* renamed from: a, reason: collision with root package name */
    private final MessagingClientEvent f37124a;

    /* renamed from: com.google.firebase.messaging.reporting.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0340a {

        /* renamed from: a, reason: collision with root package name */
        private MessagingClientEvent f37125a = null;

        C0340a() {
        }

        public a a() {
            return new a(this.f37125a);
        }

        public C0340a b(MessagingClientEvent messagingClientEvent) {
            this.f37125a = messagingClientEvent;
            return this;
        }
    }

    a(MessagingClientEvent messagingClientEvent) {
        this.f37124a = messagingClientEvent;
    }

    public static a a() {
        return f37123b;
    }

    public static C0340a d() {
        return new C0340a();
    }

    @InterfaceC2431a.b
    public MessagingClientEvent b() {
        MessagingClientEvent messagingClientEvent = this.f37124a;
        if (messagingClientEvent == null) {
            return MessagingClientEvent.f();
        }
        return messagingClientEvent;
    }

    @InterfaceC2431a.InterfaceC0549a(name = "messagingClientEvent")
    @Protobuf(tag = 1)
    public MessagingClientEvent c() {
        return this.f37124a;
    }

    public byte[] e() {
        return M.b(this);
    }

    public void f(OutputStream outputStream) throws IOException {
        M.a(this, outputStream);
    }
}
