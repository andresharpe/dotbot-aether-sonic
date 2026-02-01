package com.harman.jbl.partylight.lib.debug.ultimate;

import X2.l;
import X2.p;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g;
import com.harman.jbl.cd_biz_comm.wireless_tech.j;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import com.harman.jbl.partylight.lib.partystage.command.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;

@U({"SMAP\nDebugUltimateProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugUltimateProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/ultimate/DebugUltimateProductListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n766#2:70\n857#2,2:71\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 DebugUltimateProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/ultimate/DebugUltimateProductListViewModel\n*L\n42#1:70\n42#1:71,2\n42#1:73\n42#1:74,3\n*E\n"})
/* loaded from: classes2.dex */
public final class d extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<List<e>> f46554H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f46555I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<String> f46556J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.e f46557K;

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.debug.ultimate.DebugUltimateProductListViewModel$connectUltimate$1", f = "DebugUltimateProductListViewModel.kt", i = {}, l = {57, 59}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46558I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ e f46560K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f46560K = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46558I;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        System.out.println();
                        d.this.w().r(kotlin.coroutines.jvm.internal.a.a(false));
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                d.this.w().r(kotlin.coroutines.jvm.internal.a.a(true));
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                SpeakerDevice e4 = this.f46560K.e();
                this.f46558I = 1;
                obj = cVar.p(e4, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar2 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                SpeakerDevice e5 = this.f46560K.e();
                g<h> a4 = com.harman.jbl.partylight.lib.partystage.command.b.f47437a.a(this.f46560K.e());
                this.f46558I = 2;
                obj = cVar2.y(e5, a4, this);
                if (obj == l4) {
                    return l4;
                }
                System.out.println();
                d.this.w().r(kotlin.coroutines.jvm.internal.a.a(false));
                return H0.f51801a;
            }
            d.this.y().r("connect fail");
            d.this.w().r(kotlin.coroutines.jvm.internal.a.a(false));
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
            return new a(this.f46560K, cVar);
        }
    }

    @U({"SMAP\nDebugUltimateProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugUltimateProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/ultimate/DebugUltimateProductListViewModel$connectorObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
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
            List<e> f4 = d.this.x().f();
            e eVar = null;
            if (f4 != null) {
                Iterator<T> it = f4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (F.g(((e) next).e(), dev)) {
                        eVar = next;
                        break;
                    }
                }
                eVar = eVar;
            }
            if (eVar != null) {
                eVar.g(true);
            }
            d.this.A();
        }
    }

    @U({"SMAP\nDebugUltimateProductListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugUltimateProductListViewModel.kt\ncom/harman/jbl/partylight/lib/debug/ultimate/DebugUltimateProductListViewModel$connectorObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<ModuleDevice, H0> {
        c() {
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
            List<e> f4 = d.this.x().f();
            e eVar = null;
            if (f4 != null) {
                Iterator<T> it = f4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (F.g(((e) next).e(), dev)) {
                        eVar = next;
                        break;
                    }
                }
                eVar = eVar;
            }
            if (eVar != null) {
                eVar.g(false);
            }
            d.this.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.debug.ultimate.DebugUltimateProductListViewModel$launchLoopRefresh$1", f = "DebugUltimateProductListViewModel.kt", i = {0}, l = {48}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.harman.jbl.partylight.lib.debug.ultimate.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0417d extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46563I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f46564J;

        C0417d(kotlin.coroutines.c<? super C0417d> cVar) {
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
                int r1 = r5.f46563I
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r5.f46564J
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
                java.lang.Object r6 = r5.f46564J
                kotlinx.coroutines.U r6 = (kotlinx.coroutines.U) r6
                r1 = r6
            L23:
                boolean r6 = kotlinx.coroutines.V.k(r1)
                if (r6 == 0) goto L3c
                r5.f46564J = r1
                r5.f46563I = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.C2269d0.b(r3, r5)
                if (r6 != r0) goto L36
                return r0
            L36:
                com.harman.jbl.partylight.lib.debug.ultimate.d r6 = com.harman.jbl.partylight.lib.debug.ultimate.d.this
                com.harman.jbl.partylight.lib.debug.ultimate.d.u(r6)
                goto L23
            L3c:
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.debug.ultimate.d.C0417d.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C0417d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            C0417d c0417d = new C0417d(cVar);
            c0417d.f46564J = obj;
            return c0417d;
        }
    }

    public d() {
        List H3;
        H3 = CollectionsKt__CollectionsKt.H();
        this.f46554H = new P<>(H3);
        this.f46555I = new P<>();
        this.f46556J = new P<>();
        com.harman.jbl.cd_biz_comm.wireless_tech.e eVar = new com.harman.jbl.cd_biz_comm.wireless_tech.e(new b(), new c(), null, 4, null);
        this.f46557K = eVar;
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.x(eVar);
        z();
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        int b02;
        P<List<e>> p4 = this.f46554H;
        List<SpeakerDevice> r4 = j.f38190F.r();
        ArrayList<SpeakerDevice> arrayList = new ArrayList();
        for (Object obj : r4) {
            if (((SpeakerDevice) obj).r()) {
                arrayList.add(obj);
            }
        }
        b02 = C2109w.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (SpeakerDevice speakerDevice : arrayList) {
            arrayList2.add(new e(speakerDevice, com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.u(speakerDevice)));
        }
        p4.r(arrayList2);
    }

    private final void z() {
        C2323l.f(k0.a(this), null, null, new C0417d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        super.s();
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.A(this.f46557K);
    }

    public final void v(@l3.d e item) {
        F.p(item, "item");
        C2323l.f(k0.a(this), null, null, new a(item, null), 3, null);
    }

    @l3.d
    public final P<Boolean> w() {
        return this.f46555I;
    }

    @l3.d
    public final P<List<e>> x() {
        return this.f46554H;
    }

    @l3.d
    public final P<String> y() {
        return this.f46556J;
    }
}
