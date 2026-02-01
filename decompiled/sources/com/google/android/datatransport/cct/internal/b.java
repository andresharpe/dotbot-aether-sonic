package com.google.android.datatransport.cct.internal;

import com.google.firebase.remoteconfig.u;
import java.io.IOException;
import x1.InterfaceC2438a;
import x1.InterfaceC2439b;

/* loaded from: classes.dex */
public final class b implements InterfaceC2438a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27222a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC2438a f27223b = new b();

    /* loaded from: classes.dex */
    private static final class a implements com.google.firebase.encoders.d<com.google.android.datatransport.cct.internal.a> {

        /* renamed from: a, reason: collision with root package name */
        static final a f27224a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27225b = com.google.firebase.encoders.c.d(u.b.f37788f0);

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27226c = com.google.firebase.encoders.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27227d = com.google.firebase.encoders.c.d("hardware");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27228e = com.google.firebase.encoders.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27229f = com.google.firebase.encoders.c.d("product");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27230g = com.google.firebase.encoders.c.d("osBuild");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27231h = com.google.firebase.encoders.c.d("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27232i = com.google.firebase.encoders.c.d("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27233j = com.google.firebase.encoders.c.d("locale");

        /* renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27234k = com.google.firebase.encoders.c.d("country");

        /* renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27235l = com.google.firebase.encoders.c.d("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27236m = com.google.firebase.encoders.c.d("applicationBuild");

        private a() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.cct.internal.a aVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27225b, aVar.m());
            eVar.t(f27226c, aVar.j());
            eVar.t(f27227d, aVar.f());
            eVar.t(f27228e, aVar.d());
            eVar.t(f27229f, aVar.l());
            eVar.t(f27230g, aVar.k());
            eVar.t(f27231h, aVar.h());
            eVar.t(f27232i, aVar.e());
            eVar.t(f27233j, aVar.g());
            eVar.t(f27234k, aVar.c());
            eVar.t(f27235l, aVar.i());
            eVar.t(f27236m, aVar.b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0252b implements com.google.firebase.encoders.d<j> {

        /* renamed from: a, reason: collision with root package name */
        static final C0252b f27237a = new C0252b();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27238b = com.google.firebase.encoders.c.d("logRequest");

        private C0252b() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27238b, jVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements com.google.firebase.encoders.d<ClientInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final c f27239a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27240b = com.google.firebase.encoders.c.d("clientType");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27241c = com.google.firebase.encoders.c.d("androidClientInfo");

        private c() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ClientInfo clientInfo, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27240b, clientInfo.c());
            eVar.t(f27241c, clientInfo.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements com.google.firebase.encoders.d<k> {

        /* renamed from: a, reason: collision with root package name */
        static final d f27242a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27243b = com.google.firebase.encoders.c.d("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27244c = com.google.firebase.encoders.c.d("eventCode");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27245d = com.google.firebase.encoders.c.d("eventUptimeMs");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27246e = com.google.firebase.encoders.c.d("sourceExtension");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27247f = com.google.firebase.encoders.c.d("sourceExtensionJsonProto3");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27248g = com.google.firebase.encoders.c.d("timezoneOffsetSeconds");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27249h = com.google.firebase.encoders.c.d("networkConnectionInfo");

        private d() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k kVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f27243b, kVar.c());
            eVar.t(f27244c, kVar.b());
            eVar.b(f27245d, kVar.d());
            eVar.t(f27246e, kVar.f());
            eVar.t(f27247f, kVar.g());
            eVar.b(f27248g, kVar.h());
            eVar.t(f27249h, kVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements com.google.firebase.encoders.d<l> {

        /* renamed from: a, reason: collision with root package name */
        static final e f27250a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27251b = com.google.firebase.encoders.c.d("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27252c = com.google.firebase.encoders.c.d("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27253d = com.google.firebase.encoders.c.d("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27254e = com.google.firebase.encoders.c.d("logSource");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27255f = com.google.firebase.encoders.c.d("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27256g = com.google.firebase.encoders.c.d("logEvent");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27257h = com.google.firebase.encoders.c.d("qosTier");

        private e() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(l lVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f27251b, lVar.g());
            eVar.b(f27252c, lVar.h());
            eVar.t(f27253d, lVar.b());
            eVar.t(f27254e, lVar.d());
            eVar.t(f27255f, lVar.e());
            eVar.t(f27256g, lVar.c());
            eVar.t(f27257h, lVar.f());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements com.google.firebase.encoders.d<NetworkConnectionInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final f f27258a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27259b = com.google.firebase.encoders.c.d("networkType");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27260c = com.google.firebase.encoders.c.d("mobileSubtype");

        private f() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(NetworkConnectionInfo networkConnectionInfo, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27259b, networkConnectionInfo.c());
            eVar.t(f27260c, networkConnectionInfo.b());
        }
    }

    private b() {
    }

    @Override // x1.InterfaceC2438a
    public void a(InterfaceC2439b<?> interfaceC2439b) {
        C0252b c0252b = C0252b.f27237a;
        interfaceC2439b.b(j.class, c0252b);
        interfaceC2439b.b(com.google.android.datatransport.cct.internal.d.class, c0252b);
        e eVar = e.f27250a;
        interfaceC2439b.b(l.class, eVar);
        interfaceC2439b.b(g.class, eVar);
        c cVar = c.f27239a;
        interfaceC2439b.b(ClientInfo.class, cVar);
        interfaceC2439b.b(com.google.android.datatransport.cct.internal.e.class, cVar);
        a aVar = a.f27224a;
        interfaceC2439b.b(com.google.android.datatransport.cct.internal.a.class, aVar);
        interfaceC2439b.b(com.google.android.datatransport.cct.internal.c.class, aVar);
        d dVar = d.f27242a;
        interfaceC2439b.b(k.class, dVar);
        interfaceC2439b.b(com.google.android.datatransport.cct.internal.f.class, dVar);
        f fVar = f.f27258a;
        interfaceC2439b.b(NetworkConnectionInfo.class, fVar);
        interfaceC2439b.b(i.class, fVar);
    }
}
