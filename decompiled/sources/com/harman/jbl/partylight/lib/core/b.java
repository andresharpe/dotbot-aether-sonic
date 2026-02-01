package com.harman.jbl.partylight.lib.core;

import X2.l;
import X2.p;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp;
import com.harman.jbl.cd_biz_comm.wireless_tech.j;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.g;
import h2.C2063b;
import i2.C2069a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.D;
import kotlin.collections.Y;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.V;

@U({"SMAP\nPLGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1855#2:217\n1856#2:219\n1054#2:220\n1855#2,2:221\n1045#2:223\n1#3:218\n*S KotlinDebug\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager\n*L\n105#1:217\n105#1:219\n134#1:220\n145#1:221,2\n160#1:223\n*E\n"})
/* loaded from: classes2.dex */
public final class b implements kotlinx.coroutines.U {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final b f46256F = new b();

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final String f46257G = "PLGroupManager";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final Map<PLGroup.Type, List<PartyLightDevice>> f46258H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final Map<PLGroup.Type, PartyLightDevice> f46259I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final Map<com.harman.jbl.partylight.lib.c, com.harman.jbl.partylight.lib.c> f46260J;

    /* renamed from: K, reason: collision with root package name */
    private static PLGroup.Type f46261K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private static final com.harman.jbl.cd_biz_comm.wireless_tech.f f46262L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private static final com.harman.jbl.cd_biz_comm.wireless_tech.e f46263M;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.U f46264E = V.a(C2322k0.c());

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager\n*L\n1#1,328:1\n134#2:329\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            l4 = kotlin.comparisons.g.l(Boolean.valueOf(((PartyLightDevice) t4).h()), Boolean.valueOf(((PartyLightDevice) t3).h()));
            return l4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.core.PLGroupManager", f = "PLGroupManager.kt", i = {0, 0}, l = {146}, m = "connectGroup", n = {"plGroup", "it"}, s = {"L$0", "L$2"})
    /* renamed from: com.harman.jbl.partylight.lib.core.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0408b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f46265H;

        /* renamed from: I, reason: collision with root package name */
        Object f46266I;

        /* renamed from: J, reason: collision with root package name */
        Object f46267J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f46268K;

        /* renamed from: M, reason: collision with root package name */
        int f46270M;

        C0408b(kotlin.coroutines.c<? super C0408b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f46268K = obj;
            this.f46270M |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    @U({"SMAP\nPLGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$connectObserver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$connectObserver$1\n*L\n75#1:217,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<ModuleDevice, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f46271F = new c();

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.core.PLGroupManager$connectObserver$1$2$1", f = "PLGroupManager.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
        @U({"SMAP\nPLGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$connectObserver$1$2$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$connectObserver$1$2$1\n*L\n85#1:217,2\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f46272I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ ModuleDevice f46273J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ModuleDevice moduleDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f46273J = moduleDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f46272I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                    ModuleDevice moduleDevice = this.f46273J;
                    C2069a c2069a = new C2069a();
                    this.f46272I = 1;
                    obj = cVar.y(moduleDevice, c2069a, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                C2063b c2063b = (C2063b) ((WriteResp) obj).k();
                if (c2063b != null) {
                    ModuleDevice moduleDevice2 = this.f46273J;
                    Iterator it = b.f46260J.entrySet().iterator();
                    while (it.hasNext()) {
                        l<com.harman.jbl.partylight.lib.e, H0> j4 = ((com.harman.jbl.partylight.lib.c) ((Map.Entry) it.next()).getValue()).j();
                        String g4 = moduleDevice2.g();
                        String k4 = c2063b.k();
                        if (k4 == null) {
                            k4 = "";
                        }
                        j4.C(new com.harman.jbl.partylight.lib.e(g4, k4, moduleDevice2.d()));
                    }
                }
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f46273J, cVar);
            }
        }

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        public final void c(@l3.d ModuleDevice dev) {
            boolean W12;
            PartyLightDevice partyLightDevice;
            F.p(dev, "dev");
            W12 = D.W1(b.f46259I.values(), dev);
            if (W12) {
                List<PLGroup> k4 = b.f46256F.k();
                Iterator it = b.f46260J.entrySet().iterator();
                while (it.hasNext()) {
                    ((com.harman.jbl.partylight.lib.c) ((Map.Entry) it.next()).getValue()).g().C(k4);
                }
            }
            if (dev instanceof PartyLightDevice) {
                partyLightDevice = (PartyLightDevice) dev;
            } else {
                partyLightDevice = null;
            }
            if (partyLightDevice != null) {
                C2323l.f(b.f46256F, C2322k0.e(), null, new a(dev, null), 2, null);
            }
        }
    }

    @U({"SMAP\nPLGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$connectObserver$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n215#2,2:219\n*S KotlinDebug\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$connectObserver$2\n*L\n60#1:217,2\n66#1:219,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class d extends Lambda implements l<ModuleDevice, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f46274F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        public final void c(@l3.d ModuleDevice it) {
            boolean W12;
            F.p(it, "it");
            if (F.g(it, b.f46256F.j())) {
                Iterator it2 = b.f46260J.entrySet().iterator();
                while (it2.hasNext()) {
                    ((com.harman.jbl.partylight.lib.c) ((Map.Entry) it2.next()).getValue()).i().n();
                }
            }
            W12 = D.W1(b.f46259I.values(), it);
            if (W12) {
                List<PLGroup> k4 = b.f46256F.k();
                Iterator it3 = b.f46260J.entrySet().iterator();
                while (it3.hasNext()) {
                    ((com.harman.jbl.partylight.lib.c) ((Map.Entry) it3.next()).getValue()).g().C(k4);
                }
            }
        }
    }

    @U({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager\n*L\n1#1,328:1\n162#2:329\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t4) {
            int l4;
            Map map = b.f46259I;
            b bVar = b.f46256F;
            l4 = kotlin.comparisons.g.l(Integer.valueOf(F.g((PartyLightDevice) t3, map.get(bVar.l())) ? 1 : 0), Integer.valueOf(F.g((PartyLightDevice) t4, b.f46259I.get(bVar.l())) ? 1 : 0));
            return l4;
        }
    }

    @U({"SMAP\nPLGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$plObserver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$plObserver$1\n*L\n42#1:217,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final f f46275F = new f();

        f() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice dev, @l3.d List<PartyLightDevice> list) {
            F.p(dev, "dev");
            F.p(list, "<anonymous parameter 1>");
            List list2 = (List) b.f46258H.get(com.harman.jbl.partylight.lib.core.c.a(dev));
            if (list2 != null) {
                list2.add(dev);
            }
            List<PLGroup> k4 = b.f46256F.k();
            Iterator it = b.f46260J.entrySet().iterator();
            while (it.hasNext()) {
                ((com.harman.jbl.partylight.lib.c) ((Map.Entry) it.next()).getValue()).g().C(k4);
            }
            com.harman.jbl.cd_biz_comm.logger.d.d(b.f46257G, "light add " + k4);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    @U({"SMAP\nPLGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$plObserver$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,216:1\n215#2,2:217\n*S KotlinDebug\n*F\n+ 1 PLGroupManager.kt\ncom/harman/jbl/partylight/lib/core/PLGroupManager$plObserver$2\n*L\n50#1:217,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class g extends Lambda implements p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final g f46276F = new g();

        g() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice dev, @l3.d List<PartyLightDevice> list) {
            F.p(dev, "dev");
            F.p(list, "<anonymous parameter 1>");
            List list2 = (List) b.f46258H.get(com.harman.jbl.partylight.lib.core.c.a(dev));
            if (list2 != null) {
                list2.remove(dev);
            }
            List<PLGroup> k4 = b.f46256F.k();
            Iterator it = b.f46260J.entrySet().iterator();
            while (it.hasNext()) {
                ((com.harman.jbl.partylight.lib.c) ((Map.Entry) it.next()).getValue()).g().C(k4);
            }
            com.harman.jbl.cd_biz_comm.logger.d.d(b.f46257G, "light lose " + k4);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    static {
        Map<PLGroup.Type, List<PartyLightDevice>> j02;
        j02 = Y.j0(C2122h0.a(PLGroup.Type.Beam, new ArrayList()), C2122h0.a(PLGroup.Type.Stick, new ArrayList()));
        f46258H = j02;
        f46259I = new LinkedHashMap();
        f46260J = new LinkedHashMap();
        f46262L = new com.harman.jbl.cd_biz_comm.wireless_tech.f(f.f46275F, null, g.f46276F, 2, null);
        f46263M = new com.harman.jbl.cd_biz_comm.wireless_tech.e(c.f46271F, d.f46274F, null, 4, null);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PLGroup> k() {
        List<PLGroup> V5;
        int i4;
        int i5;
        String str;
        Object B22;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f46258H.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((Collection) entry.getValue()).isEmpty()) {
                if (entry.getKey() == PLGroup.Type.Beam) {
                    i4 = g.i.f47044r;
                    i5 = g.e.f46759B;
                    str = "JBL PartyLight Beam";
                } else {
                    i4 = g.i.f47046t;
                    i5 = g.e.f46766I;
                    str = "JBL PartyLight Stick";
                }
                PLGroup.Type type = (PLGroup.Type) entry.getKey();
                B22 = D.B2((List) entry.getValue());
                String d4 = ((PartyLightDevice) B22).d();
                int size = ((List) entry.getValue()).size();
                PartyLightDevice partyLightDevice = f46259I.get(entry.getKey());
                if (partyLightDevice != null) {
                    z3 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.u(partyLightDevice);
                } else {
                    z3 = false;
                }
                arrayList.add(new PLGroup(type, d4, size, z3, new PLGroup.Source(i4, str, i5)));
            }
        }
        V5 = D.V5(arrayList);
        return V5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(com.harman.jbl.partylight.lib.c observer) {
        F.p(observer, "$observer");
        observer.g().C(f46256F.k());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r10 = kotlin.collections.D.u5(r10, new com.harman.jbl.partylight.lib.core.b.a());
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00d2 -> B:10:0x00d5). Please report as a decompilation issue!!! */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@l3.d com.harman.jbl.partylight.lib.core.PLGroup r9, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.core.b.g(com.harman.jbl.partylight.lib.core.PLGroup, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f46264E.getCoroutineContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        r0 = kotlin.collections.D.u5(r0, new com.harman.jbl.partylight.lib.core.b.e());
     */
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice> i() {
        /*
            r2 = this;
            java.util.Map<com.harman.jbl.partylight.lib.core.PLGroup$Type, java.util.List<com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice>> r0 = com.harman.jbl.partylight.lib.core.b.f46258H
            com.harman.jbl.partylight.lib.core.PLGroup$Type r1 = r2.l()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L19
            com.harman.jbl.partylight.lib.core.b$e r1 = new com.harman.jbl.partylight.lib.core.b$e
            r1.<init>()
            java.util.List r0 = kotlin.collections.C2107u.u5(r0, r1)
            if (r0 != 0) goto L1d
        L19:
            java.util.List r0 = kotlin.collections.C2107u.H()
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.core.b.i():java.util.List");
    }

    @l3.d
    public final PartyLightDevice j() {
        PartyLightDevice partyLightDevice = f46259I.get(l());
        F.m(partyLightDevice);
        return partyLightDevice;
    }

    @l3.d
    public final PLGroup.Type l() {
        PLGroup.Type type = f46261K;
        if (type != null) {
            return type;
        }
        F.S("currentGroupType");
        return null;
    }

    @l3.d
    public final Map<PLGroup.Type, List<PartyLightDevice>> m() {
        Map<PLGroup.Type, List<PartyLightDevice>> D02;
        D02 = Y.D0(f46258H);
        return D02;
    }

    public final void n() {
        j.f38190F.y(f46262L);
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.x(f46263M);
    }

    public final boolean o() {
        if (i().size() == 1) {
            return true;
        }
        return false;
    }

    public final void p(@l3.d final com.harman.jbl.partylight.lib.c observer) {
        F.p(observer, "observer");
        f46260J.put(observer, observer);
        com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.partylight.lib.core.a
            @Override // java.lang.Runnable
            public final void run() {
                b.q(com.harman.jbl.partylight.lib.c.this);
            }
        });
    }

    public final void r(@l3.d com.harman.jbl.partylight.lib.c observer) {
        F.p(observer, "observer");
        f46260J.remove(observer);
    }
}
