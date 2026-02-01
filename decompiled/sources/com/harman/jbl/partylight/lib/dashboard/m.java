package com.harman.jbl.partylight.lib.dashboard;

import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.biz.AuracastMode;
import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import com.harman.jbl.partylight.lib.biz.Switch;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.ota.sdk.j;
import com.harman.jbl.partylight.lib.partystage.v;
import com.harman.sdk.message.GestureInfo;
import h2.C2063b;
import i2.C2069a;
import i2.C2070b;
import j2.C2074a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k2.C2078a;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import l2.C2355a;

@U({"SMAP\nLightDashboardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightDashboardViewModel.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1#2:318\n1#2:320\n2634#3:319\n*S KotlinDebug\n*F\n+ 1 LightDashboardViewModel.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardViewModel\n*L\n139#1:320\n139#1:319\n*E\n"})
/* loaded from: classes2.dex */
public final class m extends j0 {

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    public static final a f46339Y = new a(null);

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    private static final String f46340Z = "LightDashboardViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<Integer> f46341H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f46342I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<r> f46343J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partylight.lib.dashboard.a> f46344K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final P<Integer> f46345L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final P<Integer> f46346M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partylight.lib.dashboard.b> f46347N;

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f46348O;

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partylight.lib.dashboard.b> f46349P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final P<List<C2355a>> f46350Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final P<q> f46351R;

    /* renamed from: S, reason: collision with root package name */
    private int f46352S;

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private LightInfo f46353T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private C2063b f46354U;

    /* renamed from: V, reason: collision with root package name */
    @l3.e
    private L0 f46355V;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.e f46356W;

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partylight.lib.c f46357X;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$checkStickStageState$1", f = "LightDashboardViewModel.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46358I;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            q qVar;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46358I;
            q qVar2 = null;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                P<q> P3 = m.this.P();
                q f4 = m.this.P().f();
                if (f4 != null) {
                    qVar = q.e(f4, false, false, false, 1, null);
                } else {
                    qVar = null;
                }
                P3.r(qVar);
                v vVar = v.f47482a;
                String r4 = m.this.f46353T.r();
                this.f46358I = 1;
                obj = vVar.f(r4, this);
                if (obj == l4) {
                    return l4;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            P<q> P4 = m.this.P();
            q f5 = m.this.P().f();
            if (f5 != null) {
                qVar2 = q.e(f5, false, booleanValue, false, 1, null);
            }
            P4.r(qVar2);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$checkUpdate$1", f = "LightDashboardViewModel.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    @U({"SMAP\nLightDashboardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightDashboardViewModel.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardViewModel$checkUpdate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n*S KotlinDebug\n*F\n+ 1 LightDashboardViewModel.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardViewModel$checkUpdate$1\n*L\n285#1:318,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46360I;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46360I;
            boolean z3 = true;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partylight.lib.ota.sdk.a aVar = com.harman.jbl.partylight.lib.ota.sdk.a.f47294a;
                String d4 = m.this.M().d();
                this.f46360I = 1;
                obj = aVar.e(d4, this);
                if (obj == l4) {
                    return l4;
                }
            }
            j.a aVar2 = (j.a) obj;
            if (aVar2 != null) {
                P<Boolean> L3 = m.this.L();
                if (!C2074a.b("auto_ota_test")) {
                    List<PartyLightDevice> i5 = com.harman.jbl.partylight.lib.core.b.f46256F.i();
                    if (!(i5 instanceof Collection) || !i5.isEmpty()) {
                        Iterator<T> it = i5.iterator();
                        while (it.hasNext()) {
                            if (com.harman.jbl.partylight.lib.ota.sdk.i.f47376a.a(aVar2.m(), ((PartyLightDevice) it.next()).p())) {
                                break;
                            }
                        }
                    }
                    z3 = false;
                }
                L3.r(kotlin.coroutines.jvm.internal.a.a(z3));
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.p<ModuleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.g, H0> {
        d() {
            super(2);
        }

        public final void c(@l3.d ModuleDevice dev, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.g notify) {
            byte[] h4;
            F.p(dev, "dev");
            F.p(notify, "notify");
            if (F.g(dev, m.this.M())) {
                byte f4 = notify.f();
                if (f4 == 50) {
                    byte[] h5 = notify.h();
                    if (h5 != null) {
                        m.this.c0(LightInfo.f46228i.a(h5), false);
                        return;
                    }
                    return;
                }
                if (f4 == 18 && (h4 = notify.h()) != null) {
                    m.this.a0(C2063b.f50735f.a(h4), false);
                }
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(ModuleDevice moduleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.g gVar) {
            c(moduleDevice, gVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel", f = "LightDashboardViewModel.kt", i = {0, 0, 1}, l = {150, 156}, m = "followSpeaker", n = {"this", "mainSpeaker", "this"}, s = {"L$0", "L$1", "L$0"})
    /* loaded from: classes2.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f46363H;

        /* renamed from: I, reason: collision with root package name */
        Object f46364I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f46365J;

        /* renamed from: L, reason: collision with root package name */
        int f46367L;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f46365J = obj;
            this.f46367L |= Integer.MIN_VALUE;
            return m.this.E(this);
        }
    }

    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.l<List<? extends PLGroup>, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends PLGroup> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<PLGroup> it) {
            F.p(it, "it");
            com.harman.jbl.partylight.lib.core.b bVar = com.harman.jbl.partylight.lib.core.b.f46256F;
            int size = bVar.i().size();
            m mVar = m.this;
            Integer f4 = mVar.K().f();
            if (f4 == null || size != f4.intValue()) {
                mVar.K().r(Integer.valueOf(bVar.i().size()));
                mVar.A();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$selectedLightShowCard$1", f = "LightDashboardViewModel.kt", i = {0}, l = {231}, m = "invokeSuspend", n = {"targetPattern"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    static final class g extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f46369I;

        /* renamed from: J, reason: collision with root package name */
        int f46370J;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f46372L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i4, kotlin.coroutines.c<? super g> cVar) {
            super(2, cVar);
            this.f46372L = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object y3;
            LightInfo.Pattern pattern;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46370J;
            if (i4 != 0) {
                if (i4 == 1) {
                    LightInfo.Pattern pattern2 = (LightInfo.Pattern) this.f46369I;
                    W.n(obj);
                    y3 = obj;
                    pattern = pattern2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                List<C2355a> f4 = m.this.H().f();
                F.m(f4);
                LightInfo.Pattern j4 = f4.get(this.f46372L).j();
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice M3 = m.this.M();
                i2.d dVar = new i2.d(j4, null, null, null, null, null, null, null, GestureInfo.f48245e0, null);
                this.f46369I = j4;
                this.f46370J = 1;
                y3 = cVar.y(M3, dVar, this);
                if (y3 == l4) {
                    return l4;
                }
                pattern = j4;
            }
            m mVar = m.this;
            m.d0(mVar, LightInfo.j(mVar.f46353T, pattern, null, null, null, null, null, null, null, GestureInfo.f48245e0, null), false, 2, null);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((g) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new g(this.f46372L, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setAuracastMode$1", f = "LightDashboardViewModel.kt", i = {0}, l = {194, 198}, m = "invokeSuspend", n = {"mode"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    static final class h extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f46373I;

        /* renamed from: J, reason: collision with root package name */
        int f46374J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f46375K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ m f46376L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z3, m mVar, kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
            this.f46375K = z3;
            this.f46376L = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            AuracastMode auracastMode;
            AuracastMode auracastMode2;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46374J;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                auracastMode2 = (AuracastMode) this.f46373I;
                W.n(obj);
            } else {
                W.n(obj);
                if (this.f46375K) {
                    auracastMode = AuracastMode.ON;
                } else {
                    auracastMode = AuracastMode.OFF;
                }
                auracastMode2 = auracastMode;
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice M3 = this.f46376L.M();
                i2.c cVar2 = new i2.c(null, auracastMode2, null, 5, null);
                this.f46373I = auracastMode2;
                this.f46374J = 1;
                if (cVar.y(M3, cVar2, this) == l4) {
                    return l4;
                }
            }
            m mVar = this.f46376L;
            m.b0(mVar, C2063b.g(mVar.f46354U, auracastMode2, null, null, null, null, 30, null), false, 2, null);
            if (auracastMode2 == AuracastMode.ON) {
                m mVar2 = this.f46376L;
                this.f46373I = null;
                this.f46374J = 2;
                if (mVar2.E(this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
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
            return new h(this.f46375K, this.f46376L, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setColorChange$1", f = "LightDashboardViewModel.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class i extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46377I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ Color f46379K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Color color, kotlin.coroutines.c<? super i> cVar) {
            super(2, cVar);
            this.f46379K = color;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object y3;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46377I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                    y3 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice M3 = m.this.M();
                i2.d dVar = new i2.d(null, this.f46379K, LightInfo.PatternLooping.STATIC_COLOR, null, null, null, null, null, 249, null);
                this.f46377I = 1;
                y3 = cVar.y(M3, dVar, this);
                if (y3 == l4) {
                    return l4;
                }
            }
            m mVar = m.this;
            m.d0(mVar, LightInfo.j(mVar.f46353T, null, this.f46379K, LightInfo.PatternLooping.STATIC_COLOR, null, null, null, null, null, 249, null), false, 2, null);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((i) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new i(this.f46379K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setDanceMode$1", f = "LightDashboardViewModel.kt", i = {0}, l = {223}, m = "invokeSuspend", n = {L1.a.f1499L2}, s = {"L$0"})
    /* loaded from: classes2.dex */
    static final class j extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f46380I;

        /* renamed from: J, reason: collision with root package name */
        int f46381J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f46382K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ m f46383L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z3, m mVar, kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
            this.f46382K = z3;
            this.f46383L = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Switch r12;
            Switch r32;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46381J;
            if (i4 != 0) {
                if (i4 == 1) {
                    Switch r02 = (Switch) this.f46380I;
                    W.n(obj);
                    r32 = r02;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                if (this.f46382K) {
                    r12 = Switch.ON;
                } else {
                    r12 = Switch.OFF;
                }
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice M3 = this.f46383L.M();
                i2.c cVar2 = new i2.c(null, null, r12, 3, null);
                this.f46380I = r12;
                this.f46381J = 1;
                Object y3 = cVar.y(M3, cVar2, this);
                if (y3 == l4) {
                    return l4;
                }
                r32 = r12;
                obj = y3;
            }
            m mVar = this.f46383L;
            m.b0(mVar, C2063b.g(mVar.f46354U, null, null, r32, null, null, 27, null), false, 2, null);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((j) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new j(this.f46382K, this.f46383L, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setLEDMovementSpeed$1", f = "LightDashboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class k extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46384I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f46386K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i4, kotlin.coroutines.c<? super k> cVar) {
            super(2, cVar);
            this.f46386K = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f46384I == 0) {
                W.n(obj);
                int C3 = m.this.C(this.f46386K);
                com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.z(m.this.M(), new i2.d(null, null, null, null, kotlin.coroutines.jvm.internal.a.f(C3), null, null, null, 239, null));
                m mVar = m.this;
                m.d0(mVar, LightInfo.j(mVar.f46353T, null, null, null, null, kotlin.coroutines.jvm.internal.a.f(C3), null, null, null, 239, null), false, 2, null);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((k) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new k(this.f46386K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setLightBrightness$1", f = "LightDashboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class l extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46387I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f46389K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i4, kotlin.coroutines.c<? super l> cVar) {
            super(2, cVar);
            this.f46389K = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f46387I == 0) {
                W.n(obj);
                com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.z(m.this.M(), new i2.d(null, null, null, kotlin.coroutines.jvm.internal.a.f(this.f46389K), null, null, null, null, 247, null));
                m mVar = m.this;
                m.d0(mVar, LightInfo.j(mVar.f46353T, null, null, null, kotlin.coroutines.jvm.internal.a.f(this.f46389K), null, null, null, null, 247, null), false, 2, null);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((l) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new l(this.f46389K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setLoopingOperation$1", f = "LightDashboardViewModel.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.harman.jbl.partylight.lib.dashboard.m$m, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0410m extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f46390I;

        C0410m(kotlin.coroutines.c<? super C0410m> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object y3;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46390I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                    y3 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice M3 = m.this.M();
                i2.d dVar = new i2.d(null, null, LightInfo.PatternLooping.COLOR_LOOP, null, null, null, null, null, 251, null);
                this.f46390I = 1;
                y3 = cVar.y(M3, dVar, this);
                if (y3 == l4) {
                    return l4;
                }
            }
            m mVar = m.this;
            m.d0(mVar, LightInfo.j(mVar.f46353T, null, null, LightInfo.PatternLooping.COLOR_LOOP, null, null, null, null, null, 251, null), false, 2, null);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((C0410m) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new C0410m(cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.dashboard.LightDashboardViewModel$setSoundDetectionMode$1", f = "LightDashboardViewModel.kt", i = {0}, l = {207}, m = "invokeSuspend", n = {L1.a.f1499L2}, s = {"L$0"})
    /* loaded from: classes2.dex */
    static final class n extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f46392I;

        /* renamed from: J, reason: collision with root package name */
        int f46393J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f46394K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ m f46395L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z3, m mVar, kotlin.coroutines.c<? super n> cVar) {
            super(2, cVar);
            this.f46394K = z3;
            this.f46395L = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Switch r12;
            Switch r22;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f46393J;
            if (i4 != 0) {
                if (i4 == 1) {
                    Switch r02 = (Switch) this.f46392I;
                    W.n(obj);
                    r22 = r02;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                if (this.f46394K) {
                    r12 = Switch.ON;
                } else {
                    r12 = Switch.OFF;
                }
                com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                PartyLightDevice M3 = this.f46395L.M();
                i2.c cVar2 = new i2.c(r12, null, null, 6, null);
                this.f46392I = r12;
                this.f46393J = 1;
                Object y3 = cVar.y(M3, cVar2, this);
                if (y3 == l4) {
                    return l4;
                }
                r22 = r12;
                obj = y3;
            }
            m mVar = this.f46395L;
            m.b0(mVar, C2063b.g(mVar.f46354U, null, r22, null, null, null, 29, null), false, 2, null);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((n) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new n(this.f46394K, this.f46395L, cVar);
        }
    }

    public m() {
        Object B22;
        com.harman.jbl.partylight.lib.core.b bVar = com.harman.jbl.partylight.lib.core.b.f46256F;
        this.f46341H = new P<>(Integer.valueOf(bVar.i().size()));
        Boolean bool = Boolean.FALSE;
        this.f46342I = new P<>(bool);
        this.f46343J = new P<>(new r(null, null, 3, null));
        this.f46344K = new P<>(new com.harman.jbl.partylight.lib.dashboard.a(null, null, 3, null));
        this.f46345L = new P<>(0);
        this.f46346M = new P<>(0);
        this.f46347N = new P<>(new com.harman.jbl.partylight.lib.dashboard.b(M().v(), false, 2, null));
        this.f46348O = new P<>(bool);
        this.f46349P = new P<>(new com.harman.jbl.partylight.lib.dashboard.b(false, false, 3, null));
        List<C2355a> a4 = new C2078a().a();
        B22 = D.B2(a4);
        ((C2355a) B22).o(true);
        this.f46350Q = new P<>(a4);
        this.f46351R = new P<>(new q(false, false, false, 7, null));
        LightInfo.Pattern pattern = LightInfo.Pattern.NEON;
        Color a5 = Color.f46223H.a();
        LightInfo.PatternLooping patternLooping = LightInfo.PatternLooping.COLOR_LOOP;
        Switch r18 = Switch.OFF;
        this.f46353T = new LightInfo(pattern, a5, patternLooping, 0, 0, null, 0, r18);
        this.f46354U = new C2063b(AuracastMode.OFF, r18, r18, null, null, 24, null);
        com.harman.jbl.cd_biz_comm.wireless_tech.e eVar = new com.harman.jbl.cd_biz_comm.wireless_tech.e(null, null, new d(), 3, null);
        this.f46356W = eVar;
        com.harman.jbl.partylight.lib.c cVar = new com.harman.jbl.partylight.lib.c(new f(), null, null, null, 14, null);
        this.f46357X = cVar;
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.x(eVar);
        bVar.p(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        L0 f4;
        q f5 = this.f46351R.f();
        q qVar = null;
        if (f5 != null && f5.f()) {
            if (this.f46354U.n()) {
                P<q> p4 = this.f46351R;
                q f6 = p4.f();
                if (f6 != null) {
                    qVar = q.e(f6, false, true, true, 1, null);
                }
                p4.r(qVar);
                return;
            }
            L0 l02 = this.f46355V;
            if (l02 != null) {
                L0.a.b(l02, null, 1, null);
            }
            f4 = C2323l.f(k0.a(this), null, null, new b(null), 3, null);
            this.f46355V = f4;
            return;
        }
        P<q> p5 = this.f46351R;
        q f7 = p5.f();
        if (f7 != null) {
            qVar = q.e(f7, false, false, false, 5, null);
        }
        p5.r(qVar);
    }

    private final void B() {
        C2323l.f(k0.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(kotlin.coroutines.c<? super kotlin.H0> r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.dashboard.m.E(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(C2063b c2063b, boolean z3) {
        q qVar;
        boolean z4;
        boolean z5;
        boolean z6;
        if (!z3) {
            c2063b = this.f46354U.h(c2063b);
        }
        this.f46354U = c2063b;
        P<q> p4 = this.f46351R;
        q f4 = p4.f();
        boolean z7 = false;
        if (f4 != null) {
            if (M().v() && this.f46354U.i() != AuracastMode.OFF) {
                z6 = true;
            } else {
                z6 = false;
            }
            qVar = q.e(f4, z6, false, false, 6, null);
        } else {
            qVar = null;
        }
        com.harman.jbl.cd_biz_comm.utils.i.a(p4, qVar);
        P<r> p5 = this.f46343J;
        r f5 = p5.f();
        F.m(f5);
        AuracastMode i4 = this.f46354U.i();
        F.m(i4);
        p5.r(r.d(f5, i4, null, 2, null));
        P<Boolean> p6 = this.f46348O;
        Switch l4 = this.f46354U.l();
        Switch r02 = Switch.ON;
        if (l4 == r02) {
            z4 = true;
        } else {
            z4 = false;
        }
        com.harman.jbl.cd_biz_comm.utils.i.a(p6, Boolean.valueOf(z4));
        P<com.harman.jbl.partylight.lib.dashboard.b> p7 = this.f46349P;
        com.harman.jbl.partylight.lib.dashboard.b f6 = p7.f();
        F.m(f6);
        com.harman.jbl.partylight.lib.dashboard.b bVar = f6;
        if (M().t() && this.f46354U.i() != AuracastMode.OFF) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f46354U.j() == r02) {
            z7 = true;
        }
        com.harman.jbl.cd_biz_comm.utils.i.a(p7, bVar.c(z5, z7));
        if (this.f46354U.i() == AuracastMode.OFF) {
            this.f46353T = LightInfo.j(this.f46353T, null, null, null, null, null, null, null, null, 223, null);
        }
        A();
    }

    static /* synthetic */ void b0(m mVar, C2063b c2063b, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        mVar.a0(c2063b, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(LightInfo lightInfo, boolean z3) {
        boolean z4;
        List<C2355a> V5;
        boolean z5;
        if (!z3) {
            lightInfo = this.f46353T.k(lightInfo);
        }
        this.f46353T = lightInfo;
        P<r> p4 = this.f46343J;
        r f4 = p4.f();
        F.m(f4);
        p4.r(r.d(f4, null, this.f46353T.r(), 1, null));
        P<com.harman.jbl.partylight.lib.dashboard.a> p5 = this.f46344K;
        Color m4 = this.f46353T.m();
        if (m4 == null) {
            m4 = Color.f46223H.a();
        }
        LightInfo.PatternLooping q4 = this.f46353T.q();
        if (q4 == null) {
            q4 = LightInfo.PatternLooping.COLOR_LOOP;
        }
        com.harman.jbl.cd_biz_comm.utils.i.a(p5, new com.harman.jbl.partylight.lib.dashboard.a(m4, q4));
        com.harman.jbl.cd_biz_comm.utils.i.a(this.f46345L, this.f46353T.n());
        com.harman.jbl.cd_biz_comm.utils.i.a(this.f46346M, this.f46353T.o());
        P<com.harman.jbl.partylight.lib.dashboard.b> p6 = this.f46347N;
        com.harman.jbl.partylight.lib.dashboard.b f5 = p6.f();
        F.m(f5);
        com.harman.jbl.partylight.lib.dashboard.b bVar = f5;
        if (this.f46353T.l() == Switch.ON) {
            z4 = true;
        } else {
            z4 = false;
        }
        com.harman.jbl.cd_biz_comm.utils.i.a(p6, com.harman.jbl.partylight.lib.dashboard.b.d(bVar, false, z4, 1, null));
        P<List<C2355a>> p7 = this.f46350Q;
        List<C2355a> f6 = p7.f();
        F.m(f6);
        List<C2355a> list = f6;
        for (C2355a c2355a : list) {
            if (c2355a.j() == this.f46353T.p()) {
                z5 = true;
            } else {
                z5 = false;
            }
            c2355a.o(z5);
        }
        F.o(list, "onEach(...)");
        V5 = D.V5(list);
        p7.r(V5);
        A();
    }

    static /* synthetic */ void d0(m mVar, LightInfo lightInfo, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        mVar.c0(lightInfo, z3);
    }

    public final int C(int i4) {
        if (M().t()) {
            if (i4 < 25) {
                return 0;
            }
            if (25 <= i4 && i4 < 76) {
                return 50;
            }
            return 100;
        }
        return i4;
    }

    public final void D() {
        com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
        cVar.z(M(), new C2069a());
        cVar.z(M(), new C2070b());
        B();
    }

    @l3.d
    public final P<com.harman.jbl.partylight.lib.dashboard.b> F() {
        return this.f46347N;
    }

    @l3.d
    public final P<Integer> G() {
        return this.f46346M;
    }

    @l3.d
    public final P<List<C2355a>> H() {
        return this.f46350Q;
    }

    @l3.d
    public final P<com.harman.jbl.partylight.lib.dashboard.a> I() {
        return this.f46344K;
    }

    @l3.d
    public final P<com.harman.jbl.partylight.lib.dashboard.b> J() {
        return this.f46349P;
    }

    @l3.d
    public final P<Integer> K() {
        return this.f46341H;
    }

    @l3.d
    public final P<Boolean> L() {
        return this.f46342I;
    }

    @l3.d
    public final PartyLightDevice M() {
        return com.harman.jbl.partylight.lib.core.b.f46256F.j();
    }

    @l3.d
    public final P<Boolean> N() {
        return this.f46348O;
    }

    @l3.d
    public final P<Integer> O() {
        return this.f46345L;
    }

    @l3.d
    public final P<q> P() {
        return this.f46351R;
    }

    @l3.d
    public final P<r> Q() {
        return this.f46343J;
    }

    public final void R(int i4) {
        C2323l.f(k0.a(this), null, null, new g(i4, null), 3, null);
    }

    public final void S(boolean z3) {
        C2323l.f(k0.a(this), null, null, new h(z3, this, null), 3, null);
    }

    public final void T(boolean z3) {
        Switch r15;
        if (z3) {
            r15 = Switch.ON;
        } else {
            r15 = Switch.OFF;
        }
        Switch r8 = r15;
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.z(M(), new i2.d(null, null, null, null, null, null, null, r8, kotlinx.coroutines.scheduling.q.f54649c, null));
        H0 h02 = H0.f51801a;
        d0(this, LightInfo.j(this.f46353T, null, null, null, null, null, null, null, r8, kotlinx.coroutines.scheduling.q.f54649c, null), false, 2, null);
    }

    public final void U(@l3.d Color updatedColor) {
        F.p(updatedColor, "updatedColor");
        C2323l.f(k0.a(this), null, null, new i(updatedColor, null), 3, null);
    }

    public final void V(boolean z3) {
        C2323l.f(k0.a(this), null, null, new j(z3, this, null), 3, null);
    }

    public final void W(int i4) {
        C2323l.f(k0.a(this), null, null, new k(i4, null), 3, null);
    }

    public final void X(int i4) {
        C2323l.f(k0.a(this), null, null, new l(i4, null), 3, null);
    }

    public final void Y() {
        C2323l.f(k0.a(this), null, null, new C0410m(null), 3, null);
    }

    public final void Z(boolean z3) {
        C2323l.f(k0.a(this), null, null, new n(z3, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.A(this.f46356W);
        com.harman.jbl.partylight.lib.core.b.f46256F.r(this.f46357X);
        v.f47482a.e();
    }
}
