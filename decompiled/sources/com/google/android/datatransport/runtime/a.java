package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.io.IOException;
import x1.InterfaceC2438a;
import x1.InterfaceC2439b;

/* loaded from: classes.dex */
public final class a implements InterfaceC2438a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27324a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC2438a f27325b = new a();

    /* renamed from: com.google.android.datatransport.runtime.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0253a implements com.google.firebase.encoders.d<com.google.android.datatransport.runtime.firebase.transport.a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0253a f27326a = new C0253a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27327b = com.google.firebase.encoders.c.a("window").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27328c = com.google.firebase.encoders.c.a("logSourceMetrics").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27329d = com.google.firebase.encoders.c.a("globalMetrics").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27330e = com.google.firebase.encoders.c.a("appNamespace").b(com.google.firebase.encoders.proto.a.b().d(4).a()).a();

        private C0253a() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.a aVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27327b, aVar.g());
            eVar.t(f27328c, aVar.e());
            eVar.t(f27329d, aVar.d());
            eVar.t(f27330e, aVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements com.google.firebase.encoders.d<com.google.android.datatransport.runtime.firebase.transport.b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f27331a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27332b = com.google.firebase.encoders.c.a("storageMetrics").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        private b() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.b bVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27332b, bVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements com.google.firebase.encoders.d<LogEventDropped> {

        /* renamed from: a, reason: collision with root package name */
        static final c f27333a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27334b = com.google.firebase.encoders.c.a("eventsDroppedCount").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27335c = com.google.firebase.encoders.c.a("reason").b(com.google.firebase.encoders.proto.a.b().d(3).a()).a();

        private c() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(LogEventDropped logEventDropped, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f27334b, logEventDropped.b());
            eVar.t(f27335c, logEventDropped.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements com.google.firebase.encoders.d<com.google.android.datatransport.runtime.firebase.transport.c> {

        /* renamed from: a, reason: collision with root package name */
        static final d f27336a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27337b = com.google.firebase.encoders.c.a("logSource").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27338c = com.google.firebase.encoders.c.a("logEventDropped").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        private d() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.c cVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27337b, cVar.c());
            eVar.t(f27338c, cVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements com.google.firebase.encoders.d<m> {

        /* renamed from: a, reason: collision with root package name */
        static final e f27339a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27340b = com.google.firebase.encoders.c.d("clientMetrics");

        private e() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f27340b, mVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements com.google.firebase.encoders.d<com.google.android.datatransport.runtime.firebase.transport.d> {

        /* renamed from: a, reason: collision with root package name */
        static final f f27341a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27342b = com.google.firebase.encoders.c.a("currentCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27343c = com.google.firebase.encoders.c.a("maxCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        private f() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.d dVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f27342b, dVar.a());
            eVar.b(f27343c, dVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements com.google.firebase.encoders.d<com.google.android.datatransport.runtime.firebase.transport.e> {

        /* renamed from: a, reason: collision with root package name */
        static final g f27344a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27345b = com.google.firebase.encoders.c.a("startMs").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f27346c = com.google.firebase.encoders.c.a("endMs").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

        private g() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(com.google.android.datatransport.runtime.firebase.transport.e eVar, com.google.firebase.encoders.e eVar2) throws IOException {
            eVar2.b(f27345b, eVar.c());
            eVar2.b(f27346c, eVar.b());
        }
    }

    private a() {
    }

    @Override // x1.InterfaceC2438a
    public void a(InterfaceC2439b<?> interfaceC2439b) {
        interfaceC2439b.b(m.class, e.f27339a);
        interfaceC2439b.b(com.google.android.datatransport.runtime.firebase.transport.a.class, C0253a.f27326a);
        interfaceC2439b.b(com.google.android.datatransport.runtime.firebase.transport.e.class, g.f27344a);
        interfaceC2439b.b(com.google.android.datatransport.runtime.firebase.transport.c.class, d.f27336a);
        interfaceC2439b.b(LogEventDropped.class, c.f27333a);
        interfaceC2439b.b(com.google.android.datatransport.runtime.firebase.transport.b.class, b.f27331a);
        interfaceC2439b.b(com.google.android.datatransport.runtime.firebase.transport.d.class, f.f27341a);
    }
}
