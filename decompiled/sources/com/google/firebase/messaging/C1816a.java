package com.google.firebase.messaging;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.remoteconfig.u;
import java.io.IOException;
import x1.InterfaceC2438a;
import x1.InterfaceC2439b;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1816a implements InterfaceC2438a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f36838a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC2438a f36839b = new C1816a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0338a implements com.google.firebase.encoders.d<MessagingClientEvent> {

        /* renamed from: a, reason: collision with root package name */
        static final C0338a f36840a = new C0338a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36841b = com.google.firebase.encoders.c.a("projectNumber").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36842c = com.google.firebase.encoders.c.a("messageId").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36843d = com.google.firebase.encoders.c.a("instanceId").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36844e = com.google.firebase.encoders.c.a("messageType").b(com.google.firebase.encoders.proto.a.b().d(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36845f = com.google.firebase.encoders.c.a("sdkPlatform").b(com.google.firebase.encoders.proto.a.b().d(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36846g = com.google.firebase.encoders.c.a(u.b.f37787e0).b(com.google.firebase.encoders.proto.a.b().d(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36847h = com.google.firebase.encoders.c.a("collapseKey").b(com.google.firebase.encoders.proto.a.b().d(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36848i = com.google.firebase.encoders.c.a("priority").b(com.google.firebase.encoders.proto.a.b().d(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36849j = com.google.firebase.encoders.c.a("ttl").b(com.google.firebase.encoders.proto.a.b().d(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36850k = com.google.firebase.encoders.c.a("topic").b(com.google.firebase.encoders.proto.a.b().d(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36851l = com.google.firebase.encoders.c.a("bulkId").b(com.google.firebase.encoders.proto.a.b().d(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36852m = com.google.firebase.encoders.c.a("event").b(com.google.firebase.encoders.proto.a.b().d(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36853n = com.google.firebase.encoders.c.a("analyticsLabel").b(com.google.firebase.encoders.proto.a.b().d(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36854o = com.google.firebase.encoders.c.a("campaignId").b(com.google.firebase.encoders.proto.a.b().d(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36855p = com.google.firebase.encoders.c.a("composerLabel").b(com.google.firebase.encoders.proto.a.b().d(15).a()).a();

        private C0338a() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MessagingClientEvent messagingClientEvent, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f36841b, messagingClientEvent.m());
            eVar.t(f36842c, messagingClientEvent.i());
            eVar.t(f36843d, messagingClientEvent.h());
            eVar.t(f36844e, messagingClientEvent.j());
            eVar.t(f36845f, messagingClientEvent.n());
            eVar.t(f36846g, messagingClientEvent.k());
            eVar.t(f36847h, messagingClientEvent.d());
            eVar.c(f36848i, messagingClientEvent.l());
            eVar.c(f36849j, messagingClientEvent.p());
            eVar.t(f36850k, messagingClientEvent.o());
            eVar.b(f36851l, messagingClientEvent.b());
            eVar.t(f36852m, messagingClientEvent.g());
            eVar.t(f36853n, messagingClientEvent.a());
            eVar.b(f36854o, messagingClientEvent.c());
            eVar.t(f36855p, messagingClientEvent.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes2.dex */
    private static final class b implements com.google.firebase.encoders.d<com.google.firebase.messaging.reporting.a> {

        /* renamed from: a, reason: collision with root package name */
        static final b f36856a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36857b = com.google.firebase.encoders.c.a("messagingClientEvent").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        private b() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.firebase.messaging.reporting.a aVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f36857b, aVar.c());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes2.dex */
    private static final class c implements com.google.firebase.encoders.d<M> {

        /* renamed from: a, reason: collision with root package name */
        static final c f36858a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f36859b = com.google.firebase.encoders.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(M m4, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f36859b, m4.c());
        }
    }

    private C1816a() {
    }

    @Override // x1.InterfaceC2438a
    public void a(InterfaceC2439b<?> interfaceC2439b) {
        interfaceC2439b.b(M.class, c.f36858a);
        interfaceC2439b.b(com.google.firebase.messaging.reporting.a.class, b.f36856a);
        interfaceC2439b.b(MessagingClientEvent.class, C0338a.f36840a);
    }
}
