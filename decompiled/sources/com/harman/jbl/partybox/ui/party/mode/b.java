package com.harman.jbl.partybox.ui.party.mode;

import androidx.annotation.K;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumJoinPartyResult;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPanelStyle;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPartyStyle;
import com.harman.jbl.partybox.utils.LiveEvent;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.GestureInfo;
import com.harman.sdk.utils.AuracastStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Result;
import kotlin.W;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.w1;

@U({"SMAP\nAuracastProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastProvider.kt\ncom/harman/jbl/partybox/ui/party/mode/AuracastProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n2624#2,3:404\n2624#2,3:407\n*S KotlinDebug\n*F\n+ 1 AuracastProvider.kt\ncom/harman/jbl/partybox/ui/party/mode/AuracastProvider\n*L\n113#1:404,3\n87#1:407,3\n*E\n"})
/* loaded from: classes2.dex */
public final class b implements com.harman.jbl.partybox.ui.party.mode.c {

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    public static final a f44963k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private static final String f44964l = "Party.AuracastProvider";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final AuracastViewModel f44965a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44966b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final LiveData<HmDevice> f44967c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final LiveData<HmDevice> f44968d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final LiveData<HmDevice> f44969e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final LiveData<HmDevice> f44970f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final LiveData<HmDevice> f44971g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final LiveData<EnumPartyStyle> f44972h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    private final Q<List<HmDevice>> f44973i;

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private final LiveData<EnumPanelStyle> f44974j;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.mode.AuracastProvider", f = "AuracastProvider.kt", i = {0, 0, 1, 1}, l = {213, 233}, m = "asyncJoinAuracast", n = {"this", "device", "this", "device"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.harman.jbl.partybox.ui.party.mode.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0401b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44975H;

        /* renamed from: I, reason: collision with root package name */
        Object f44976I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f44977J;

        /* renamed from: L, reason: collision with root package name */
        int f44979L;

        C0401b(kotlin.coroutines.c<? super C0401b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44977J = obj;
            this.f44979L |= Integer.MIN_VALUE;
            return b.this.r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.mode.AuracastProvider$asyncJoinAuracast$2", f = "AuracastProvider.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44980I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44982K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f44982K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44980I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                b bVar = b.this;
                HmDevice hmDevice = this.f44982K;
                this.f44980I = 1;
                if (bVar.r(hmDevice, this) == l4) {
                    return l4;
                }
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
            return new c(this.f44982K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.mode.AuracastProvider$asyncJoinAuracast$result$1$1", f = "AuracastProvider.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44983I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f44984J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f44984J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44983I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.log.f.a(b.f44964l, "asyncJoinAuracast() >>> start open Auracast to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f44984J));
                com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                HmDevice hmDevice = this.f44984J;
                AuracastStatus auracastStatus = AuracastStatus.AURACAST_MODE;
                this.f44983I = 1;
                obj = aVar.d(hmDevice, auracastStatus, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f44984J, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.mode.AuracastProvider$onBtnQuitPartyClick$1", f = "AuracastProvider.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44985I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f44986J;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f44988L;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.mode.AuracastProvider$onBtnQuitPartyClick$1$result$1$1", f = "AuracastProvider.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f44989I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmDevice f44990J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f44990J = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f44989I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.log.f.d(b.f44964l, "onBtnQuitPartyClick() >>> start close Auracast to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f44990J));
                    com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                    HmDevice hmDevice = this.f44990J;
                    AuracastStatus auracastStatus = AuracastStatus.NORMAL_MODE;
                    this.f44989I = 1;
                    obj = aVar.d(hmDevice, auracastStatus, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f44990J, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f44988L = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            AuracastInfo d4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44985I;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    HmDevice hmDevice = this.f44988L;
                    Result.a aVar = Result.f51807F;
                    a aVar2 = new a(hmDevice, null);
                    this.f44985I = 1;
                    obj = w1.c(30000L, aVar2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                b4 = Result.b(kotlin.coroutines.jvm.internal.a.a(((Boolean) obj).booleanValue()));
            } catch (Throwable th) {
                Result.a aVar3 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            com.harman.log.f.d(b.f44964l, "onBtnQuitPartyClick() >>> result[" + Result.k(b4) + "]");
            b.this.f44965a.q0().remove(this.f44988L);
            b.this.f44965a.s0().r(null);
            if (Result.j(b4)) {
                Boolean a4 = kotlin.coroutines.jvm.internal.a.a(true);
                if (Result.i(b4)) {
                    b4 = null;
                }
                if (F.g(a4, b4)) {
                    com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
                    com.harman.log.f.d(b.f44964l, "onBtnQuitPartyClick() >>> quit Auracast success for device " + bVar.t(this.f44988L));
                    if (bVar.o(b.this.f44965a.e0().f(), this.f44988L)) {
                        b.this.f44965a.e0().r(null);
                    } else {
                        com.harman.jbl.partybox.ui.party.auracast.o.f44854a.y(b.this.f44965a.r0(), this.f44988L);
                    }
                    if (!this.f44988L.O()) {
                        com.harman.log.f.a(b.f44964l, "onBtnQuitPartyClick() >>> try to disconnect device [" + this.f44988L.n() + "]");
                        com.harman.jbl.partybox.ui.party.business.a.f44891a.g(this.f44988L);
                    }
                    return H0.f51801a;
                }
            }
            if (!this.f44988L.O()) {
                com.harman.log.f.a(b.f44964l, "onBtnQuitPartyClick() >>> try to disconnect not A2dp device [" + this.f44988L.n() + "]");
                com.harman.jbl.partybox.ui.party.business.a.f44891a.g(this.f44988L);
            }
            com.harman.log.f.b(b.f44964l, "onBtnQuitPartyClick() >>> quit Auracast fail for some reason. device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f44988L));
            if (!com.harman.sdk.utils.d.g(this.f44988L) && ((d4 = this.f44988L.d()) == null || !d4.d())) {
                com.harman.jbl.partybox.h.f40556a.b(b.this.f44965a.p0(), LiveEvent.QuitEvent.Companion.a(com.harman.sdk.utils.d.f(this.f44988L.q())));
            } else {
                com.harman.jbl.partybox.h.f40556a.b(b.this.f44965a.p0(), LiveEvent.QuitEvent.AURACAST);
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            e eVar = new e(this.f44988L, cVar);
            eVar.f44986J = obj;
            return eVar;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.mode.AuracastProvider$onNearbyDeviceClick$1", f = "AuracastProvider.kt", i = {}, l = {a.c.f43512e}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class f extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44991I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44993K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(HmDevice hmDevice, kotlin.coroutines.c<? super f> cVar) {
            super(2, cVar);
            this.f44993K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44991I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                b bVar = b.this;
                HmDevice hmDevice = this.f44993K;
                this.f44991I = 1;
                if (bVar.r(hmDevice, this) == l4) {
                    return l4;
                }
            }
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
            return new f(this.f44993K, cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.l<List<? extends HmDevice>, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f44995G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(N<EnumPanelStyle> n4) {
            super(1);
            this.f44995G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<? extends HmDevice> scannedDevices) {
            F.p(scannedDevices, "scannedDevices");
            EnumPanelStyle t3 = b.t(b.this, this.f44995G.f(), null, scannedDevices, null, null, null, null, null, null, v.g.f7531n, null);
            if (this.f44995G.f() != t3) {
                this.f44995G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class h extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f44997G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N<EnumPanelStyle> n4) {
            super(1);
            this.f44997G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            EnumPanelStyle t3 = b.t(b.this, this.f44997G.f(), null, null, hmDevice, null, null, null, null, null, v.g.f7527j, null);
            if (this.f44997G.f() != t3) {
                this.f44997G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class i extends Lambda implements X2.l<List<? extends HmDevice>, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f44999G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(N<EnumPanelStyle> n4) {
            super(1);
            this.f44999G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            EnumPanelStyle t3 = b.t(b.this, this.f44999G.f(), null, null, null, list, null, null, null, null, 494, null);
            if (this.f44999G.f() != t3) {
                this.f44999G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class j extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f45001G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(N<EnumPanelStyle> n4) {
            super(1);
            this.f45001G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            EnumPanelStyle t3 = b.t(b.this, this.f45001G.f(), null, null, null, null, hmDevice, null, null, null, 478, null);
            if (this.f45001G.f() != t3) {
                this.f45001G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class k extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f45003G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(N<EnumPanelStyle> n4) {
            super(1);
            this.f45003G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            EnumPanelStyle t3 = b.t(b.this, this.f45003G.f(), null, null, null, null, null, hmDevice, null, null, 446, null);
            if (this.f45003G.f() != t3) {
                this.f45003G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class l extends Lambda implements X2.l<LiveEvent.Event, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f45005G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(N<EnumPanelStyle> n4) {
            super(1);
            this.f45005G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(LiveEvent.Event event) {
            c(event);
            return H0.f51801a;
        }

        public final void c(@l3.e LiveEvent.Event event) {
            EnumPanelStyle t3 = b.t(b.this, this.f45005G.f(), null, null, null, null, null, null, event, null, 382, null);
            if (this.f45005G.f() != t3) {
                this.f45005G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class m extends Lambda implements X2.l<LiveEvent.Event, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f45007G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(N<EnumPanelStyle> n4) {
            super(1);
            this.f45007G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(LiveEvent.Event event) {
            c(event);
            return H0.f51801a;
        }

        public final void c(LiveEvent.Event event) {
            EnumPanelStyle t3 = b.t(b.this, this.f45007G.f(), null, null, null, null, null, null, null, event, GestureInfo.f48245e0, null);
            if (this.f45007G.f() != t3) {
                this.f45007G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class n extends Lambda implements X2.l<Boolean, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumPanelStyle> f45009G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(N<EnumPanelStyle> n4) {
            super(1);
            this.f45009G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            EnumPanelStyle t3 = b.t(b.this, this.f45009G.f(), bool, null, null, null, null, null, null, null, v.g.f7533p, null);
            if (this.f45009G.f() != t3) {
                this.f45009G.r(t3);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class o extends Lambda implements X2.l<HmDevice, EnumPartyStyle> {

        /* renamed from: F, reason: collision with root package name */
        public static final o f45010F = new o();

        o() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final EnumPartyStyle C(@l3.e HmDevice hmDevice) {
            if (hmDevice == null) {
                return EnumPartyStyle.NO_BROADCASTER;
            }
            return EnumPartyStyle.BROADCASTER;
        }
    }

    /* loaded from: classes2.dex */
    static final class p implements Q, A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45011a;

        p(X2.l function) {
            F.p(function, "function");
            this.f45011a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45011a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof A)) {
                return F.g(a(), ((A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45011a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    static final class q extends Lambda implements X2.l<List<HmDevice>, HmDevice> {

        /* renamed from: F, reason: collision with root package name */
        public static final q f45012F = new q();

        q() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final HmDevice C(List<HmDevice> list) {
            Object W22;
            if (list != null) {
                W22 = D.W2(list, 4);
                return (HmDevice) W22;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static final class r extends Lambda implements X2.l<List<HmDevice>, HmDevice> {

        /* renamed from: F, reason: collision with root package name */
        public static final r f45013F = new r();

        r() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final HmDevice C(List<HmDevice> list) {
            Object W22;
            if (list != null) {
                W22 = D.W2(list, 3);
                return (HmDevice) W22;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static final class s extends Lambda implements X2.l<List<HmDevice>, HmDevice> {

        /* renamed from: F, reason: collision with root package name */
        public static final s f45014F = new s();

        s() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final HmDevice C(List<HmDevice> list) {
            Object W22;
            if (list != null) {
                W22 = D.W2(list, 0);
                return (HmDevice) W22;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static final class t extends Lambda implements X2.l<List<HmDevice>, HmDevice> {

        /* renamed from: F, reason: collision with root package name */
        public static final t f45015F = new t();

        t() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final HmDevice C(List<HmDevice> list) {
            Object W22;
            if (list != null) {
                W22 = D.W2(list, 2);
                return (HmDevice) W22;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static final class u extends Lambda implements X2.l<List<HmDevice>, HmDevice> {

        /* renamed from: F, reason: collision with root package name */
        public static final u f45016F = new u();

        u() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final HmDevice C(List<HmDevice> list) {
            Object W22;
            if (list != null) {
                W22 = D.W2(list, 1);
                return (HmDevice) W22;
            }
            return null;
        }
    }

    public b(@l3.d AuracastViewModel viewModel) {
        F.p(viewModel, "viewModel");
        this.f44965a = viewModel;
        this.f44966b = viewModel.e0();
        this.f44967c = h0.b(viewModel.r0(), s.f45014F);
        this.f44968d = h0.b(viewModel.r0(), u.f45016F);
        this.f44969e = h0.b(viewModel.r0(), t.f45015F);
        this.f44970f = h0.b(viewModel.r0(), r.f45013F);
        this.f44971g = h0.b(viewModel.r0(), q.f45012F);
        this.f44972h = h0.b(viewModel.e0(), o.f45010F);
        this.f44973i = new Q() { // from class: com.harman.jbl.partybox.ui.party.mode.a
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                b.w(b.this, (List) obj);
            }
        };
        N n4 = new N();
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        bVar.l(n4, viewModel.k0(), new p(new g(n4)));
        bVar.l(n4, viewModel.e0(), new p(new h(n4)));
        bVar.l(n4, viewModel.r0(), new p(new i(n4)));
        bVar.l(n4, viewModel.f0(), new p(new j(n4)));
        bVar.l(n4, viewModel.s0(), new p(new k(n4)));
        bVar.l(n4, viewModel.l0(), new p(new l(n4)));
        bVar.l(n4, viewModel.j0(), new p(new m(n4)));
        bVar.l(n4, viewModel.i0(), new p(new n(n4)));
        this.f44974j = n4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.harman.sdk.device.HmDevice r20, kotlin.coroutines.c<? super kotlin.H0> r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.mode.b.r(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    private final EnumPanelStyle s(EnumPanelStyle enumPanelStyle, Boolean bool, List<? extends HmDevice> list, HmDevice hmDevice, List<? extends HmDevice> list2, HmDevice hmDevice2, HmDevice hmDevice3, LiveEvent.Event event, LiveEvent.Event event2) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        String str4 = null;
        if (enumPanelStyle != null) {
            str = enumPanelStyle.e();
        } else {
            str = null;
        }
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (hmDevice != null) {
            str2 = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice);
        } else {
            str2 = null;
        }
        if (list2 != null) {
            num2 = Integer.valueOf(list2.size());
        } else {
            num2 = null;
        }
        if (hmDevice2 != null) {
            str3 = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice2);
        } else {
            str3 = null;
        }
        if (hmDevice3 != null) {
            str4 = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice3);
        }
        com.harman.log.f.a(f44964l, "changePanelStyle() >>> prev[" + str + "]\ndeviceListEmpty[" + bool + "]nearby[" + num + "]\nbroadcaster[" + str2 + "]\nreceivers[" + num2 + "]\nbt[" + str3 + "]\nselected[" + str4 + "]\notherDevicesBtnClick[" + event + "]\nforceNearby[" + event2 + "]\n");
        if (F.g(bool, Boolean.TRUE)) {
            return EnumPanelStyle.NO_CONNECTABLE_DEVICE;
        }
        LiveEvent.Event event3 = LiveEvent.Event.ON_CLICK;
        if (event3 == event) {
            return EnumPanelStyle.OTHER_DEVICES_POPUP;
        }
        if (hmDevice3 != null) {
            return EnumPanelStyle.DEVICE_CARD;
        }
        if (event3 == event2) {
            return EnumPanelStyle.NONE;
        }
        if (this.f44965a.y0(hmDevice, hmDevice2)) {
            return EnumPanelStyle.SHARING_TIPS;
        }
        if (hmDevice != null) {
            return EnumPanelStyle.RECEIVER_TIPS;
        }
        if ((list2 != null && !list2.isEmpty() && (list == null || list.isEmpty())) || (list2 != null && !list2.isEmpty() && list2.size() >= 2)) {
            return EnumPanelStyle.PLAY_MUSIC_TIPS;
        }
        return EnumPanelStyle.NONE;
    }

    static /* synthetic */ EnumPanelStyle t(b bVar, EnumPanelStyle enumPanelStyle, Boolean bool, List list, HmDevice hmDevice, List list2, HmDevice hmDevice2, HmDevice hmDevice3, LiveEvent.Event event, LiveEvent.Event event2, int i4, Object obj) {
        Boolean bool2;
        List list3;
        HmDevice hmDevice4;
        List list4;
        HmDevice hmDevice5;
        HmDevice hmDevice6;
        LiveEvent.Event event3;
        LiveEvent.Event event4;
        if ((i4 & 2) != 0) {
            bool2 = bVar.f44965a.i0().f();
        } else {
            bool2 = bool;
        }
        if ((i4 & 4) != 0) {
            list3 = (List) bVar.f44965a.k0().f();
        } else {
            list3 = list;
        }
        if ((i4 & 8) != 0) {
            hmDevice4 = bVar.f44965a.e0().f();
        } else {
            hmDevice4 = hmDevice;
        }
        if ((i4 & 16) != 0) {
            list4 = (List) bVar.f44965a.r0().f();
        } else {
            list4 = list2;
        }
        if ((i4 & 32) != 0) {
            hmDevice5 = bVar.f44965a.f0().f();
        } else {
            hmDevice5 = hmDevice2;
        }
        if ((i4 & 64) != 0) {
            hmDevice6 = bVar.f44965a.s0().f();
        } else {
            hmDevice6 = hmDevice3;
        }
        if ((i4 & 128) != 0) {
            event3 = bVar.f44965a.l0().f();
        } else {
            event3 = event;
        }
        if ((i4 & 256) != 0) {
            event4 = bVar.f44965a.j0().f();
        } else {
            event4 = event2;
        }
        return bVar.s(enumPanelStyle, bool2, list3, hmDevice4, list4, hmDevice5, hmDevice6, event3, event4);
    }

    @K
    private final boolean u(HmDevice hmDevice) {
        if (this.f44965a.h0().isEmpty()) {
            com.harman.log.f.a(f44964l, "checkConnectingDevices() >>> empty. enqueue [" + hmDevice.n() + "]");
            this.f44965a.h0().add(hmDevice);
            return true;
        }
        int indexOf = this.f44965a.h0().indexOf(hmDevice);
        if (indexOf != -1) {
            if (indexOf != 0) {
                this.f44965a.h0().remove(hmDevice);
                com.harman.log.f.a(f44964l, "checkConnectingDevices() >>> in queue and not head. pop [" + hmDevice.n() + "]");
                return false;
            }
            com.harman.log.f.a(f44964l, "checkConnectingDevices() >>> first device in connecting queue. do nothing [" + hmDevice.n() + "]");
            return false;
        }
        this.f44965a.h0().add(hmDevice);
        com.harman.log.f.a(f44964l, "checkConnectingDevices() >>> not in queue. enqueue [" + hmDevice.n() + "]");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(b this$0, List devices) {
        F.p(this$0, "this$0");
        F.p(devices, "devices");
        if (!(devices instanceof Collection) || !devices.isEmpty()) {
            Iterator it = devices.iterator();
            while (it.hasNext()) {
                if (com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p((HmDevice) it.next())) {
                    return;
                }
            }
        }
        if (this$0.f44965a.h0().isEmpty()) {
            com.harman.log.f.g(f44964l, "snapshotDevicesObserver >>> neither device open Auracast in snapshots nor in connecting queue. Degrade into VoidProvider ");
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    @K
    public com.harman.jbl.partybox.ui.party.mode.c a(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        bVar.i(L1.a.f1525S0, device);
        if (this.f44965a.g0().contains(device)) {
            com.harman.log.f.d(f44964l, "onNearbyDeviceClick() >>> device already in connected state " + bVar.t(device));
            return this;
        }
        if (u(device)) {
            C2323l.f(k0.a(this.f44965a), C2322k0.e(), null, new f(device, null), 2, null);
            return this;
        }
        return this;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public EnumJoinPartyResult b(@l3.d HmDevice device, @l3.e HmDevice hmDevice, @l3.e HmDevice hmDevice2, @l3.e HmDevice hmDevice3) {
        F.p(device, "device");
        if (com.harman.jbl.partybox.ui.party.b.f44881a.o(device, hmDevice)) {
            if (com.harman.jbl.partybox.ui.party.auracast.o.f44854a.v(device)) {
                return EnumJoinPartyResult.OK;
            }
            return EnumJoinPartyResult.START_NEW_PARTY;
        }
        if (!com.harman.jbl.partybox.ui.party.auracast.o.f44854a.v(device)) {
            return EnumJoinPartyResult.NON_COMPATIBLE_TO_CURRENT_PARTY;
        }
        return EnumJoinPartyResult.OK;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    public void c() {
        com.harman.log.f.a(f44964l, "onCreate() >>> ");
        this.f44965a.t0().l(this.f44973i);
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    public void d() {
        com.harman.log.f.a(f44964l, "onDestroy() >>> ");
        this.f44965a.h0().clear();
        this.f44965a.g0().clear();
        this.f44965a.q0().clear();
        this.f44965a.t0().p(this.f44973i);
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<HmDevice> e() {
        return this.f44967c;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    public void f(@l3.d HmDevice device) {
        AuracastInfo d4;
        F.p(device, "device");
        if (this.f44965a.q0().contains(device)) {
            com.harman.log.f.d(f44964l, "onBtnQuitPartyClick() >>> prev connecting device:" + com.harman.jbl.partybox.ui.party.b.f44881a.t(device));
            return;
        }
        if (!device.O()) {
            com.harman.log.f.b(f44964l, "onBtnQuitPartyClick() >>> quit Auracast fail for device is not connect. device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(device));
            if (!com.harman.sdk.utils.d.g(device) && ((d4 = device.d()) == null || !d4.d())) {
                com.harman.jbl.partybox.h.f40556a.b(this.f44965a.p0(), LiveEvent.QuitEvent.Companion.a(com.harman.sdk.utils.d.f(device.q())));
                return;
            } else {
                com.harman.jbl.partybox.h.f40556a.b(this.f44965a.p0(), LiveEvent.QuitEvent.AURACAST);
                return;
            }
        }
        this.f44965a.q0().add(device);
        C2323l.f(k0.a(this.f44965a), C2322k0.e(), null, new e(device, null), 2, null);
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<HmDevice> g() {
        return this.f44970f;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<EnumPartyStyle> i() {
        return this.f44972h;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<HmDevice> j() {
        return this.f44969e;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<EnumPanelStyle> k() {
        return this.f44974j;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<HmDevice> l() {
        return this.f44971g;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    public LiveData<HmDevice> m() {
        return this.f44968d;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    public boolean n(@l3.d HmDevice device, @l3.e HmDevice hmDevice, @l3.d List<? extends HmDevice> receivers, @l3.e HmDevice hmDevice2, @l3.e HmDevice hmDevice3) {
        F.p(device, "device");
        F.p(receivers, "receivers");
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        if (!bVar.a(device)) {
            return false;
        }
        com.harman.jbl.partybox.ui.party.auracast.o oVar = com.harman.jbl.partybox.ui.party.auracast.o.f44854a;
        if (!oVar.v(device) || oVar.r(device)) {
            return false;
        }
        if ((com.harman.sdk.utils.d.C(device) && com.harman.jbl.partybox.ui.party.stereo.D.f45020a.o(device)) || !com.harman.sdk.utils.d.a(device.q()) || bVar.o(hmDevice, device)) {
            return false;
        }
        if (!(receivers instanceof Collection) || !receivers.isEmpty()) {
            Iterator<T> it = receivers.iterator();
            while (it.hasNext()) {
                if (com.harman.jbl.partybox.ui.party.b.f44881a.o((HmDevice) it.next(), device)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.harman.jbl.partybox.ui.party.mode.c
    @l3.d
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public P<HmDevice> h() {
        return this.f44966b;
    }
}
