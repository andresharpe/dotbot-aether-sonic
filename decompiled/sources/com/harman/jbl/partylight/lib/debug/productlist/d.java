package com.harman.jbl.partylight.lib.debug.productlist;

import X2.l;
import X2.p;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.cd_biz_comm.wireless_tech.j;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.debug.productlist.d;
import com.harman.jbl.partylight.lib.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;

@U({"SMAP\nDebugProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1549#2:99\n1620#2,3:100\n*S KotlinDebug\n*F\n+ 1 DebugProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListViewModel\n*L\n59#1:99\n59#1:100,3\n*E\n"})
/* loaded from: classes2.dex */
public final class d extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<List<com.harman.jbl.partylight.lib.debug.productlist.f>> f46513H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f46514I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<String> f46515J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.f f46516K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.e f46517L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partylight.lib.c f46518M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private List<PLGroup> f46519N;

    @U({"SMAP\nDebugProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListViewModel$connectorObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements l<ModuleDevice, H0> {
        a() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(@l3.d ModuleDevice dev) {
            F.p(dev, "dev");
            List<com.harman.jbl.partylight.lib.debug.productlist.f> f4 = d.this.z().f();
            com.harman.jbl.partylight.lib.debug.productlist.f fVar = null;
            if (f4 != null) {
                Iterator<T> it = f4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (F.g(((com.harman.jbl.partylight.lib.debug.productlist.f) next).e(), dev)) {
                        fVar = next;
                        break;
                    }
                }
                fVar = fVar;
            }
            if (fVar != null) {
                fVar.g(true);
            }
            d.this.C();
        }
    }

    @U({"SMAP\nDebugProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListViewModel$connectorObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements l<ModuleDevice, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(@l3.d ModuleDevice dev) {
            F.p(dev, "dev");
            List<com.harman.jbl.partylight.lib.debug.productlist.f> f4 = d.this.z().f();
            com.harman.jbl.partylight.lib.debug.productlist.f fVar = null;
            if (f4 != null) {
                Iterator<T> it = f4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (F.g(((com.harman.jbl.partylight.lib.debug.productlist.f) next).e(), dev)) {
                        fVar = next;
                        break;
                    }
                }
                fVar = fVar;
            }
            if (fVar != null) {
                fVar.g(false);
            }
            d.this.C();
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {
        c() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice newDev, @l3.d List<PartyLightDevice> list) {
            F.p(newDev, "newDev");
            F.p(list, "<anonymous parameter 1>");
            List<com.harman.jbl.partylight.lib.debug.productlist.f> f4 = d.this.z().f();
            if (f4 != null) {
                f4.add(new com.harman.jbl.partylight.lib.debug.productlist.f(newDev, com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.u(newDev)));
            }
            d.this.C();
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    /* renamed from: com.harman.jbl.partylight.lib.debug.productlist.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0415d extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {
        C0415d() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice partyLightDevice, @l3.d List<PartyLightDevice> list) {
            F.p(partyLightDevice, "<anonymous parameter 0>");
            F.p(list, "<anonymous parameter 1>");
            d.this.C();
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements l<com.harman.jbl.partylight.lib.debug.productlist.f, Boolean> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ PartyLightDevice f46525F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PartyLightDevice partyLightDevice) {
                super(1);
                this.f46525F = partyLightDevice;
            }

            @Override // X2.l
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean C(@l3.d com.harman.jbl.partylight.lib.debug.productlist.f it) {
                F.p(it, "it");
                return Boolean.valueOf(F.g(it.e(), this.f46525F));
            }
        }

        e() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(l tmp0, Object obj) {
            F.p(tmp0, "$tmp0");
            return ((Boolean) tmp0.C(obj)).booleanValue();
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            d(partyLightDevice, list);
            return H0.f51801a;
        }

        public final void d(@l3.d PartyLightDevice loseDev, @l3.d List<PartyLightDevice> list) {
            F.p(loseDev, "loseDev");
            F.p(list, "<anonymous parameter 1>");
            List<com.harman.jbl.partylight.lib.debug.productlist.f> f4 = d.this.z().f();
            if (f4 != null) {
                final a aVar = new a(loseDev);
                f4.removeIf(new Predicate() { // from class: com.harman.jbl.partylight.lib.debug.productlist.e
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean e4;
                        e4 = d.e.e(l.this, obj);
                        return e4;
                    }
                });
            }
            d.this.C();
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.debug.productlist.DebugProductListViewModel$enterDashboard$1", f = "DebugProductListViewModel.kt", i = {}, l = {85, 88}, m = "invokeSuspend", n = {}, s = {})
    @U({"SMAP\nDebugProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListViewModel$enterDashboard$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    /* loaded from: classes2.dex */
    static final class f extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f46526I;

        /* renamed from: J, reason: collision with root package name */
        int f46527J;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.partylight.lib.debug.productlist.f f46529L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.harman.jbl.partylight.lib.debug.productlist.f fVar, kotlin.coroutines.c<? super f> cVar) {
            super(2, cVar);
            this.f46529L = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object obj2;
            PLGroup.Type type;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46527J;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        d.this.y().r(kotlin.coroutines.jvm.internal.a.a(false));
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                d.this.y().r(kotlin.coroutines.jvm.internal.a.a(true));
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice e4 = this.f46529L.e();
                this.f46527J = 1;
                obj = cVar.p(e4, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                List list = d.this.f46519N;
                com.harman.jbl.partylight.lib.debug.productlist.f fVar = this.f46529L;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        PLGroup.Type l5 = ((PLGroup) obj2).l();
                        if (com.harman.jbl.cd_biz_comm.utils.h.c(fVar.e().d())) {
                            type = PLGroup.Type.Beam;
                        } else {
                            type = PLGroup.Type.Stick;
                        }
                        if (l5 == type) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                PLGroup pLGroup = (PLGroup) obj2;
                if (pLGroup != null) {
                    com.harman.jbl.partylight.lib.f a4 = com.harman.jbl.partylight.lib.f.f46571a.a();
                    this.f46526I = pLGroup;
                    this.f46527J = 2;
                    if (f.b.b(a4, pLGroup, null, null, this, 6, null) == l4) {
                        return l4;
                    }
                }
            } else {
                d.this.A().r("connect fail");
            }
            d.this.y().r(kotlin.coroutines.jvm.internal.a.a(false));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((f) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new f(this.f46529L, cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements l<List<? extends PLGroup>, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends PLGroup> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<PLGroup> it) {
            F.p(it, "it");
            d.this.f46519N = it;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.debug.productlist.DebugProductListViewModel$launchLoopRefresh$1", f = "DebugProductListViewModel.kt", i = {0}, l = {kotlin.io.encoding.a.f52115i}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46531I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f46532J;

        h(kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.f46531I
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r5.f46532J
                kotlinx.coroutines.U r1 = (kotlinx.coroutines.U) r1
                kotlin.W.n(r6)
                goto L36
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.W.n(r6)
                java.lang.Object r6 = r5.f46532J
                kotlinx.coroutines.U r6 = (kotlinx.coroutines.U) r6
                r1 = r6
            L23:
                boolean r6 = kotlinx.coroutines.V.k(r1)
                if (r6 == 0) goto L3c
                r5.f46532J = r1
                r5.f46531I = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.C2269d0.b(r3, r5)
                if (r6 != r0) goto L36
                return r0
            L36:
                com.harman.jbl.partylight.lib.debug.productlist.d r6 = com.harman.jbl.partylight.lib.debug.productlist.d.this
                com.harman.jbl.partylight.lib.debug.productlist.d.w(r6)
                goto L23
            L3c:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.debug.productlist.d.h.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((h) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            h hVar = new h(cVar);
            hVar.f46532J = obj;
            return hVar;
        }
    }

    public d() {
        List<PLGroup> H3;
        int b02;
        List<com.harman.jbl.partylight.lib.debug.productlist.f> Y5;
        P<List<com.harman.jbl.partylight.lib.debug.productlist.f>> p4 = new P<>(new ArrayList());
        this.f46513H = p4;
        this.f46514I = new P<>();
        this.f46515J = new P<>();
        com.harman.jbl.cd_biz_comm.wireless_tech.f fVar = new com.harman.jbl.cd_biz_comm.wireless_tech.f(new c(), new C0415d(), new e());
        this.f46516K = fVar;
        com.harman.jbl.cd_biz_comm.wireless_tech.e eVar = new com.harman.jbl.cd_biz_comm.wireless_tech.e(new a(), new b(), null, 4, null);
        this.f46517L = eVar;
        com.harman.jbl.partylight.lib.c cVar = new com.harman.jbl.partylight.lib.c(new g(), null, null, null, 14, null);
        this.f46518M = cVar;
        H3 = CollectionsKt__CollectionsKt.H();
        this.f46519N = H3;
        j jVar = j.f38190F;
        jVar.y(fVar);
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.x(eVar);
        com.harman.jbl.partylight.lib.core.b.f46256F.p(cVar);
        B();
        List<PartyLightDevice> q4 = jVar.q();
        b02 = C2109w.b0(q4, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (PartyLightDevice partyLightDevice : q4) {
            arrayList.add(new com.harman.jbl.partylight.lib.debug.productlist.f(partyLightDevice, com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.u(partyLightDevice)));
        }
        Y5 = D.Y5(arrayList);
        p4.r(Y5);
    }

    private final void B() {
        C2323l.f(k0.a(this), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        List<com.harman.jbl.partylight.lib.debug.productlist.f> list;
        P<List<com.harman.jbl.partylight.lib.debug.productlist.f>> p4 = this.f46513H;
        List<com.harman.jbl.partylight.lib.debug.productlist.f> f4 = p4.f();
        if (f4 != null) {
            list = D.Y5(f4);
        } else {
            list = null;
        }
        p4.r(list);
    }

    @l3.d
    public final P<String> A() {
        return this.f46515J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        super.s();
        j.f38190F.A(this.f46516K);
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.A(this.f46517L);
        com.harman.jbl.partylight.lib.core.b.f46256F.r(this.f46518M);
    }

    public final void x(@l3.d com.harman.jbl.partylight.lib.debug.productlist.f item) {
        F.p(item, "item");
        C2323l.f(k0.a(this), null, null, new f(item, null), 3, null);
    }

    @l3.d
    public final P<Boolean> y() {
        return this.f46514I;
    }

    @l3.d
    public final P<List<com.harman.jbl.partylight.lib.debug.productlist.f>> z() {
        return this.f46513H;
    }
}
