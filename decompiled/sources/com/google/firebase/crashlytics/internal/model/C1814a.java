package com.google.firebase.crashlytics.internal.model;

import N0.a;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.remoteconfig.u;
import java.io.IOException;
import x1.InterfaceC2438a;
import x1.InterfaceC2439b;

/* renamed from: com.google.firebase.crashlytics.internal.model.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1814a implements InterfaceC2438a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f35275a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC2438a f35276b = new C1814a();

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0329a implements com.google.firebase.encoders.d<CrashlyticsReport.a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0329a f35277a = new C0329a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35278b = com.google.firebase.encoders.c.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35279c = com.google.firebase.encoders.c.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35280d = com.google.firebase.encoders.c.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35281e = com.google.firebase.encoders.c.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35282f = com.google.firebase.encoders.c.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35283g = com.google.firebase.encoders.c.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35284h = com.google.firebase.encoders.c.d("timestamp");

        /* renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35285i = com.google.firebase.encoders.c.d("traceFile");

        private C0329a() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.a aVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.c(f35278b, aVar.c());
            eVar.t(f35279c, aVar.d());
            eVar.c(f35280d, aVar.f());
            eVar.c(f35281e, aVar.b());
            eVar.b(f35282f, aVar.e());
            eVar.b(f35283g, aVar.g());
            eVar.b(f35284h, aVar.h());
            eVar.t(f35285i, aVar.i());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$b */
    /* loaded from: classes2.dex */
    private static final class b implements com.google.firebase.encoders.d<CrashlyticsReport.d> {

        /* renamed from: a, reason: collision with root package name */
        static final b f35286a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35287b = com.google.firebase.encoders.c.d("key");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35288c = com.google.firebase.encoders.c.d("value");

        private b() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.d dVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35287b, dVar.b());
            eVar.t(f35288c, dVar.c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$c */
    /* loaded from: classes2.dex */
    private static final class c implements com.google.firebase.encoders.d<CrashlyticsReport> {

        /* renamed from: a, reason: collision with root package name */
        static final c f35289a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35290b = com.google.firebase.encoders.c.d(u.b.f37788f0);

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35291c = com.google.firebase.encoders.c.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35292d = com.google.firebase.encoders.c.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35293e = com.google.firebase.encoders.c.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35294f = com.google.firebase.encoders.c.d("buildVersion");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35295g = com.google.firebase.encoders.c.d("displayVersion");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35296h = com.google.firebase.encoders.c.d("session");

        /* renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35297i = com.google.firebase.encoders.c.d("ndkPayload");

        private c() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport crashlyticsReport, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35290b, crashlyticsReport.i());
            eVar.t(f35291c, crashlyticsReport.e());
            eVar.c(f35292d, crashlyticsReport.h());
            eVar.t(f35293e, crashlyticsReport.f());
            eVar.t(f35294f, crashlyticsReport.c());
            eVar.t(f35295g, crashlyticsReport.d());
            eVar.t(f35296h, crashlyticsReport.j());
            eVar.t(f35297i, crashlyticsReport.g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$d */
    /* loaded from: classes2.dex */
    private static final class d implements com.google.firebase.encoders.d<CrashlyticsReport.e> {

        /* renamed from: a, reason: collision with root package name */
        static final d f35298a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35299b = com.google.firebase.encoders.c.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35300c = com.google.firebase.encoders.c.d("orgId");

        private d() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.e eVar, com.google.firebase.encoders.e eVar2) throws IOException {
            eVar2.t(f35299b, eVar.b());
            eVar2.t(f35300c, eVar.c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$e */
    /* loaded from: classes2.dex */
    private static final class e implements com.google.firebase.encoders.d<CrashlyticsReport.e.b> {

        /* renamed from: a, reason: collision with root package name */
        static final e f35301a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35302b = com.google.firebase.encoders.c.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35303c = com.google.firebase.encoders.c.d("contents");

        private e() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.e.b bVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35302b, bVar.c());
            eVar.t(f35303c, bVar.b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$f */
    /* loaded from: classes2.dex */
    private static final class f implements com.google.firebase.encoders.d<CrashlyticsReport.f.a> {

        /* renamed from: a, reason: collision with root package name */
        static final f f35304a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35305b = com.google.firebase.encoders.c.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35306c = com.google.firebase.encoders.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35307d = com.google.firebase.encoders.c.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35308e = com.google.firebase.encoders.c.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35309f = com.google.firebase.encoders.c.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35310g = com.google.firebase.encoders.c.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35311h = com.google.firebase.encoders.c.d("developmentPlatformVersion");

        private f() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.a aVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35305b, aVar.e());
            eVar.t(f35306c, aVar.h());
            eVar.t(f35307d, aVar.d());
            eVar.t(f35308e, aVar.g());
            eVar.t(f35309f, aVar.f());
            eVar.t(f35310g, aVar.b());
            eVar.t(f35311h, aVar.c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$g */
    /* loaded from: classes2.dex */
    private static final class g implements com.google.firebase.encoders.d<CrashlyticsReport.f.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final g f35312a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35313b = com.google.firebase.encoders.c.d("clsId");

        private g() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.a.b bVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35313b, bVar.b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$h */
    /* loaded from: classes2.dex */
    private static final class h implements com.google.firebase.encoders.d<CrashlyticsReport.f.c> {

        /* renamed from: a, reason: collision with root package name */
        static final h f35314a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35315b = com.google.firebase.encoders.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35316c = com.google.firebase.encoders.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35317d = com.google.firebase.encoders.c.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35318e = com.google.firebase.encoders.c.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35319f = com.google.firebase.encoders.c.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35320g = com.google.firebase.encoders.c.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35321h = com.google.firebase.encoders.c.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35322i = com.google.firebase.encoders.c.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35323j = com.google.firebase.encoders.c.d("modelClass");

        private h() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.c cVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.c(f35315b, cVar.b());
            eVar.t(f35316c, cVar.f());
            eVar.c(f35317d, cVar.c());
            eVar.b(f35318e, cVar.h());
            eVar.b(f35319f, cVar.d());
            eVar.a(f35320g, cVar.j());
            eVar.c(f35321h, cVar.i());
            eVar.t(f35322i, cVar.e());
            eVar.t(f35323j, cVar.g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$i */
    /* loaded from: classes2.dex */
    private static final class i implements com.google.firebase.encoders.d<CrashlyticsReport.f> {

        /* renamed from: a, reason: collision with root package name */
        static final i f35324a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35325b = com.google.firebase.encoders.c.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35326c = com.google.firebase.encoders.c.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35327d = com.google.firebase.encoders.c.d("startedAt");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35328e = com.google.firebase.encoders.c.d("endedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35329f = com.google.firebase.encoders.c.d("crashed");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35330g = com.google.firebase.encoders.c.d(com.spotify.android.appremote.internal.l.f48821i);

        /* renamed from: h, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35331h = com.google.firebase.encoders.c.d("user");

        /* renamed from: i, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35332i = com.google.firebase.encoders.c.d("os");

        /* renamed from: j, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35333j = com.google.firebase.encoders.c.d("device");

        /* renamed from: k, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35334k = com.google.firebase.encoders.c.d("events");

        /* renamed from: l, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35335l = com.google.firebase.encoders.c.d("generatorType");

        private i() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f fVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35325b, fVar.f());
            eVar.t(f35326c, fVar.i());
            eVar.b(f35327d, fVar.k());
            eVar.t(f35328e, fVar.d());
            eVar.a(f35329f, fVar.m());
            eVar.t(f35330g, fVar.b());
            eVar.t(f35331h, fVar.l());
            eVar.t(f35332i, fVar.j());
            eVar.t(f35333j, fVar.c());
            eVar.t(f35334k, fVar.e());
            eVar.c(f35335l, fVar.g());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$j */
    /* loaded from: classes2.dex */
    private static final class j implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a> {

        /* renamed from: a, reason: collision with root package name */
        static final j f35336a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35337b = com.google.firebase.encoders.c.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35338c = com.google.firebase.encoders.c.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35339d = com.google.firebase.encoders.c.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35340e = com.google.firebase.encoders.c.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35341f = com.google.firebase.encoders.c.d("uiOrientation");

        private j() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a aVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35337b, aVar.d());
            eVar.t(f35338c, aVar.c());
            eVar.t(f35339d, aVar.e());
            eVar.t(f35340e, aVar.b());
            eVar.c(f35341f, aVar.f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$k */
    /* loaded from: classes2.dex */
    private static final class k implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.AbstractC0318a> {

        /* renamed from: a, reason: collision with root package name */
        static final k f35342a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35343b = com.google.firebase.encoders.c.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35344c = com.google.firebase.encoders.c.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35345d = com.google.firebase.encoders.c.d(a.C0015a.f1688b);

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35346e = com.google.firebase.encoders.c.d("uuid");

        private k() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a.b.AbstractC0318a abstractC0318a, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f35343b, abstractC0318a.b());
            eVar.b(f35344c, abstractC0318a.d());
            eVar.t(f35345d, abstractC0318a.c());
            eVar.t(f35346e, abstractC0318a.f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$l */
    /* loaded from: classes2.dex */
    private static final class l implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final l f35347a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35348b = com.google.firebase.encoders.c.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35349c = com.google.firebase.encoders.c.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35350d = com.google.firebase.encoders.c.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35351e = com.google.firebase.encoders.c.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35352f = com.google.firebase.encoders.c.d("binaries");

        private l() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a.b bVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35348b, bVar.f());
            eVar.t(f35349c, bVar.d());
            eVar.t(f35350d, bVar.b());
            eVar.t(f35351e, bVar.e());
            eVar.t(f35352f, bVar.c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$m */
    /* loaded from: classes2.dex */
    private static final class m implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        static final m f35353a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35354b = com.google.firebase.encoders.c.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35355c = com.google.firebase.encoders.c.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35356d = com.google.firebase.encoders.c.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35357e = com.google.firebase.encoders.c.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35358f = com.google.firebase.encoders.c.d("overflowCount");

        private m() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a.b.c cVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35354b, cVar.f());
            eVar.t(f35355c, cVar.e());
            eVar.t(f35356d, cVar.c());
            eVar.t(f35357e, cVar.b());
            eVar.c(f35358f, cVar.d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$n */
    /* loaded from: classes2.dex */
    private static final class n implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.AbstractC0322d> {

        /* renamed from: a, reason: collision with root package name */
        static final n f35359a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35360b = com.google.firebase.encoders.c.d(a.C0015a.f1688b);

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35361c = com.google.firebase.encoders.c.d(com.spotify.sdk.android.auth.a.f48965k);

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35362d = com.google.firebase.encoders.c.d("address");

        private n() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a.b.AbstractC0322d abstractC0322d, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35360b, abstractC0322d.d());
            eVar.t(f35361c, abstractC0322d.c());
            eVar.b(f35362d, abstractC0322d.b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$o */
    /* loaded from: classes2.dex */
    private static final class o implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.e> {

        /* renamed from: a, reason: collision with root package name */
        static final o f35363a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35364b = com.google.firebase.encoders.c.d(a.C0015a.f1688b);

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35365c = com.google.firebase.encoders.c.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35366d = com.google.firebase.encoders.c.d("frames");

        private o() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a.b.e eVar, com.google.firebase.encoders.e eVar2) throws IOException {
            eVar2.t(f35364b, eVar.d());
            eVar2.c(f35365c, eVar.c());
            eVar2.t(f35366d, eVar.b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$p */
    /* loaded from: classes2.dex */
    private static final class p implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> {

        /* renamed from: a, reason: collision with root package name */
        static final p f35367a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35368b = com.google.firebase.encoders.c.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35369c = com.google.firebase.encoders.c.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35370d = com.google.firebase.encoders.c.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35371e = com.google.firebase.encoders.c.d(v.c.f7432R);

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35372f = com.google.firebase.encoders.c.d("importance");

        private p() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.a.b.e.AbstractC0325b abstractC0325b, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f35368b, abstractC0325b.e());
            eVar.t(f35369c, abstractC0325b.f());
            eVar.t(f35370d, abstractC0325b.b());
            eVar.b(f35371e, abstractC0325b.d());
            eVar.c(f35372f, abstractC0325b.c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$q */
    /* loaded from: classes2.dex */
    private static final class q implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.c> {

        /* renamed from: a, reason: collision with root package name */
        static final q f35373a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35374b = com.google.firebase.encoders.c.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35375c = com.google.firebase.encoders.c.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35376d = com.google.firebase.encoders.c.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35377e = com.google.firebase.encoders.c.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35378f = com.google.firebase.encoders.c.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35379g = com.google.firebase.encoders.c.d("diskUsed");

        private q() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.c cVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35374b, cVar.b());
            eVar.c(f35375c, cVar.c());
            eVar.a(f35376d, cVar.g());
            eVar.c(f35377e, cVar.e());
            eVar.b(f35378f, cVar.f());
            eVar.b(f35379g, cVar.d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$r */
    /* loaded from: classes2.dex */
    private static final class r implements com.google.firebase.encoders.d<CrashlyticsReport.f.d> {

        /* renamed from: a, reason: collision with root package name */
        static final r f35380a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35381b = com.google.firebase.encoders.c.d("timestamp");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35382c = com.google.firebase.encoders.c.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35383d = com.google.firebase.encoders.c.d(com.spotify.android.appremote.internal.l.f48821i);

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35384e = com.google.firebase.encoders.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35385f = com.google.firebase.encoders.c.d("log");

        private r() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d dVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.b(f35381b, dVar.e());
            eVar.t(f35382c, dVar.f());
            eVar.t(f35383d, dVar.b());
            eVar.t(f35384e, dVar.c());
            eVar.t(f35385f, dVar.d());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$s */
    /* loaded from: classes2.dex */
    private static final class s implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.AbstractC0327d> {

        /* renamed from: a, reason: collision with root package name */
        static final s f35386a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35387b = com.google.firebase.encoders.c.d(FirebaseAnalytics.b.f34769P);

        private s() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.d.AbstractC0327d abstractC0327d, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35387b, abstractC0327d.b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$t */
    /* loaded from: classes2.dex */
    private static final class t implements com.google.firebase.encoders.d<CrashlyticsReport.f.e> {

        /* renamed from: a, reason: collision with root package name */
        static final t f35388a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35389b = com.google.firebase.encoders.c.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35390c = com.google.firebase.encoders.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35391d = com.google.firebase.encoders.c.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35392e = com.google.firebase.encoders.c.d("jailbroken");

        private t() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.e eVar, com.google.firebase.encoders.e eVar2) throws IOException {
            eVar2.c(f35389b, eVar.c());
            eVar2.t(f35390c, eVar.d());
            eVar2.t(f35391d, eVar.b());
            eVar2.a(f35392e, eVar.e());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$u */
    /* loaded from: classes2.dex */
    private static final class u implements com.google.firebase.encoders.d<CrashlyticsReport.f.AbstractC0328f> {

        /* renamed from: a, reason: collision with root package name */
        static final u f35393a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f35394b = com.google.firebase.encoders.c.d("identifier");

        private u() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CrashlyticsReport.f.AbstractC0328f abstractC0328f, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.t(f35394b, abstractC0328f.b());
        }
    }

    private C1814a() {
    }

    @Override // x1.InterfaceC2438a
    public void a(InterfaceC2439b<?> interfaceC2439b) {
        c cVar = c.f35289a;
        interfaceC2439b.b(CrashlyticsReport.class, cVar);
        interfaceC2439b.b(C1815b.class, cVar);
        i iVar = i.f35324a;
        interfaceC2439b.b(CrashlyticsReport.f.class, iVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.g.class, iVar);
        f fVar = f.f35304a;
        interfaceC2439b.b(CrashlyticsReport.f.a.class, fVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.h.class, fVar);
        g gVar = g.f35312a;
        interfaceC2439b.b(CrashlyticsReport.f.a.b.class, gVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.i.class, gVar);
        u uVar = u.f35393a;
        interfaceC2439b.b(CrashlyticsReport.f.AbstractC0328f.class, uVar);
        interfaceC2439b.b(v.class, uVar);
        t tVar = t.f35388a;
        interfaceC2439b.b(CrashlyticsReport.f.e.class, tVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.u.class, tVar);
        h hVar = h.f35314a;
        interfaceC2439b.b(CrashlyticsReport.f.c.class, hVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.j.class, hVar);
        r rVar = r.f35380a;
        interfaceC2439b.b(CrashlyticsReport.f.d.class, rVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.k.class, rVar);
        j jVar = j.f35336a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.class, jVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.l.class, jVar);
        l lVar = l.f35347a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.b.class, lVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.m.class, lVar);
        o oVar = o.f35363a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.b.e.class, oVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.q.class, oVar);
        p pVar = p.f35367a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.b.e.AbstractC0325b.class, pVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.r.class, pVar);
        m mVar = m.f35353a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.b.c.class, mVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.o.class, mVar);
        C0329a c0329a = C0329a.f35277a;
        interfaceC2439b.b(CrashlyticsReport.a.class, c0329a);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.c.class, c0329a);
        n nVar = n.f35359a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.b.AbstractC0322d.class, nVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.p.class, nVar);
        k kVar = k.f35342a;
        interfaceC2439b.b(CrashlyticsReport.f.d.a.b.AbstractC0318a.class, kVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.n.class, kVar);
        b bVar = b.f35286a;
        interfaceC2439b.b(CrashlyticsReport.d.class, bVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.d.class, bVar);
        q qVar = q.f35373a;
        interfaceC2439b.b(CrashlyticsReport.f.d.c.class, qVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.s.class, qVar);
        s sVar = s.f35386a;
        interfaceC2439b.b(CrashlyticsReport.f.d.AbstractC0327d.class, sVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.t.class, sVar);
        d dVar = d.f35298a;
        interfaceC2439b.b(CrashlyticsReport.e.class, dVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.e.class, dVar);
        e eVar = e.f35301a;
        interfaceC2439b.b(CrashlyticsReport.e.b.class, eVar);
        interfaceC2439b.b(com.google.firebase.crashlytics.internal.model.f.class, eVar);
    }
}
