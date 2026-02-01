package com.harman.jbl.partylight.lib.ota.sdk;

import android.util.Log;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.A;
import kotlin.C;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.V;
import n2.C2376b;

@U({"SMAP\nBleOtaHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleOtaHelper.kt\ncom/harman/jbl/partylight/lib/ota/sdk/BleOtaHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n49#2,4:338\n1#3:342\n215#4,2:343\n766#5:345\n857#5,2:346\n*S KotlinDebug\n*F\n+ 1 BleOtaHelper.kt\ncom/harman/jbl/partylight/lib/ota/sdk/BleOtaHelper\n*L\n33#1:338,4\n295#1:343,2\n256#1:345\n256#1:346,2\n*E\n"})
/* loaded from: classes2.dex */
public final class f implements kotlinx.coroutines.U {

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    public static final a f47315O = new a(null);

    /* renamed from: P, reason: collision with root package name */
    private static final int f47316P = 251;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private static final String f47317Q = "BleOtaHelper";

    /* renamed from: R, reason: collision with root package name */
    private static final long f47318R = 60000;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partylight.lib.ota.sdk.k f47319E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.U f47320F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f47321G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final A f47322H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f47323I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final List<PartyLightDevice> f47324J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final Map<PartyLightDevice, L0> f47325K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final List<PartyLightDevice> f47326L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.e f47327M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.f f47328N;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @U({"SMAP\nBleOtaHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleOtaHelper.kt\ncom/harman/jbl/partylight/lib/ota/sdk/BleOtaHelper$connectorObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<ModuleDevice, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(ModuleDevice moduleDevice) {
            c(moduleDevice);
            return H0.f51801a;
        }

        public final void c(@l3.d ModuleDevice it) {
            Object obj;
            Object G22;
            F.p(it, "it");
            if (!f.this.D()) {
                return;
            }
            Iterator<T> it2 = f.this.f47319E.g().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (F.g((PartyLightDevice) obj, it)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                G22 = D.G2(f.this.f47326L);
                PartyLightDevice partyLightDevice = (PartyLightDevice) G22;
                if (partyLightDevice != null) {
                    f fVar = f.this;
                    if (F.g(partyLightDevice, it)) {
                        fVar.t("Device disconnected");
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {
        c() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice dev, @l3.d List<PartyLightDevice> list) {
            F.p(dev, "dev");
            F.p(list, "<anonymous parameter 1>");
            f.this.s(dev);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.p<PartyLightDevice, List<? extends PartyLightDevice>, H0> {
        d() {
            super(2);
        }

        public final void c(@l3.d PartyLightDevice dev, @l3.d List<PartyLightDevice> list) {
            F.p(dev, "dev");
            F.p(list, "<anonymous parameter 1>");
            f.this.s(dev);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(PartyLightDevice partyLightDevice, List<? extends PartyLightDevice> list) {
            c(partyLightDevice, list);
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.a<RandomAccessFile> {
        e() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final RandomAccessFile n() {
            return new RandomAccessFile(f.this.f47319E.i(), "r");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper", f = "BleOtaHelper.kt", i = {0, 0, 0}, l = {195}, m = "handleApplyDfu", n = {"this", com.spotify.sdk.android.auth.a.f48959e, "it"}, s = {"L$0", "L$1", "L$3"})
    /* renamed from: com.harman.jbl.partylight.lib.ota.sdk.f$f, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0421f extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47333H;

        /* renamed from: I, reason: collision with root package name */
        Object f47334I;

        /* renamed from: J, reason: collision with root package name */
        Object f47335J;

        /* renamed from: K, reason: collision with root package name */
        Object f47336K;

        /* renamed from: L, reason: collision with root package name */
        /* synthetic */ Object f47337L;

        /* renamed from: N, reason: collision with root package name */
        int f47339N;

        C0421f(kotlin.coroutines.c<? super C0421f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47337L = obj;
            this.f47339N |= Integer.MIN_VALUE;
            return f.this.y(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper$handleApplyDfu$2$1", f = "BleOtaHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class g extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47340I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyLightDevice f47342K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(PartyLightDevice partyLightDevice, kotlin.coroutines.c<? super g> cVar) {
            super(2, cVar);
            this.f47342K = partyLightDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f47340I == 0) {
                W.n(obj);
                f.this.f47319E.j().h(this.f47342K);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return new g(this.f47342K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper$handleApplyDfu$2$scanJob$1", f = "BleOtaHelper.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47343I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyLightDevice f47345K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(PartyLightDevice partyLightDevice, kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
            this.f47345K = partyLightDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47343I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                this.f47343I = 1;
                if (C2269d0.b(60000L, this) == l4) {
                    return l4;
                }
            }
            if (f.this.E(this.f47345K)) {
                f.this.z(this.f47345K);
            } else {
                com.harman.jbl.cd_biz_comm.logger.d.b(f.f47317Q, "扫描超时，检查新fw version失败");
                f.this.B(this.f47345K);
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
            return new h(this.f47345K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper$nextDeviceOtaIfAvailable$1", f = "BleOtaHelper.kt", i = {}, l = {244, 245}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class i extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47346I;

        i(kotlin.coroutines.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47346I;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        W.n(obj);
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                this.f47346I = 1;
                if (C2269d0.b(1000L, this) == l4) {
                    return l4;
                }
            }
            f fVar = f.this;
            this.f47346I = 2;
            if (fVar.I(this) == l4) {
                return l4;
            }
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
            return new i(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper", f = "BleOtaHelper.kt", i = {0, 0}, l = {138, com.harman.analytics.deviceAws.a.f37828k, 150}, m = "reqDfuStart", n = {"this", "dev"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class j extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47348H;

        /* renamed from: I, reason: collision with root package name */
        Object f47349I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f47350J;

        /* renamed from: L, reason: collision with root package name */
        int f47352L;

        j(kotlin.coroutines.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47350J = obj;
            this.f47352L |= Integer.MIN_VALUE;
            return f.this.G(null, this);
        }
    }

    @U({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BleOtaHelper.kt\ncom/harman/jbl/partylight/lib/ota/sdk/BleOtaHelper\n*L\n1#1,110:1\n34#2,3:111\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.coroutines.a implements O {
        public k(O.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.O
        public void Y0(@l3.d kotlin.coroutines.f fVar, @l3.d Throwable th) {
            com.harman.jbl.cd_biz_comm.logger.d.b(f.f47317Q, "CoroutineException  " + Log.getStackTraceString(th));
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper", f = "BleOtaHelper.kt", i = {0, 0, 1, 1}, l = {117, 120, 122}, m = "startConnectDevToOta", n = {"this", "it", "this", "it"}, s = {"L$0", "L$2", "L$0", "L$2"})
    /* loaded from: classes2.dex */
    public static final class l extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47353H;

        /* renamed from: I, reason: collision with root package name */
        Object f47354I;

        /* renamed from: J, reason: collision with root package name */
        Object f47355J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f47356K;

        /* renamed from: M, reason: collision with root package name */
        int f47358M;

        l(kotlin.coroutines.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47356K = obj;
            this.f47358M |= Integer.MIN_VALUE;
            return f.this.I(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper$startConnectDevToOta$2$1", f = "BleOtaHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class m extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47359I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyLightDevice f47361K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(PartyLightDevice partyLightDevice, kotlin.coroutines.c<? super m> cVar) {
            super(2, cVar);
            this.f47361K = partyLightDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f47359I == 0) {
                W.n(obj);
                f.this.f47319E.j().k(this.f47361K);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((m) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new m(this.f47361K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper$startOta$1", f = "BleOtaHelper.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class n extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47362I;

        n(kotlin.coroutines.c<? super n> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47362I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                f fVar = f.this;
                this.f47362I = 1;
                if (fVar.I(this) == l4) {
                    return l4;
                }
            }
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
            return new n(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper", f = "BleOtaHelper.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 3, 3}, l = {173, 176, 180, 181}, m = "startTransfer", n = {"this", "dev", "transfering", "this", "dev", "transfering", "this", "dev", "this", "dev"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class o extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f47364H;

        /* renamed from: I, reason: collision with root package name */
        Object f47365I;

        /* renamed from: J, reason: collision with root package name */
        int f47366J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f47367K;

        /* renamed from: M, reason: collision with root package name */
        int f47369M;

        o(kotlin.coroutines.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f47367K = obj;
            this.f47369M |= Integer.MIN_VALUE;
            return f.this.K(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.ota.sdk.BleOtaHelper$startTransfer$2", f = "BleOtaHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class p extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47370I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyLightDevice f47372K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ double f47373L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(PartyLightDevice partyLightDevice, double d4, kotlin.coroutines.c<? super p> cVar) {
            super(2, cVar);
            this.f47372K = partyLightDevice;
            this.f47373L = d4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f47370I == 0) {
                W.n(obj);
                f.this.f47319E.j().e(this.f47372K, this.f47373L);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((p) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new p(this.f47372K, this.f47373L, cVar);
        }
    }

    public f(@l3.d com.harman.jbl.partylight.lib.ota.sdk.k config) {
        A a4;
        List<PartyLightDevice> Y5;
        F.p(config, "config");
        this.f47319E = config;
        this.f47320F = V.a(C2322k0.c().A(new k(O.f52951v)));
        a4 = C.a(new e());
        this.f47322H = a4;
        this.f47324J = new ArrayList();
        this.f47325K = new LinkedHashMap();
        Y5 = D.Y5(config.g());
        this.f47326L = Y5;
        this.f47327M = new com.harman.jbl.cd_biz_comm.wireless_tech.e(null, new b(), null, 5, null);
        this.f47328N = new com.harman.jbl.cd_biz_comm.wireless_tech.f(new c(), new d(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(f this$0, PartyLightDevice device) {
        F.p(this$0, "this$0");
        F.p(device, "$device");
        this$0.f47319E.j().m(device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(final PartyLightDevice partyLightDevice) {
        this.f47324J.remove(partyLightDevice);
        this.f47325K.remove(partyLightDevice);
        com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.partylight.lib.ota.sdk.d
            @Override // java.lang.Runnable
            public final void run() {
                f.C(f.this, partyLightDevice);
            }
        });
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(f this$0, PartyLightDevice device) {
        F.p(this$0, "this$0");
        F.p(device, "$device");
        this$0.f47319E.j().a(device, "install failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(PartyLightDevice partyLightDevice) {
        return F.g(partyLightDevice.p(), this.f47319E.h().m());
    }

    private final void F() {
        if (!this.f47326L.isEmpty()) {
            C2323l.f(this, null, null, new i(null), 3, null);
        } else {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r11, kotlin.coroutines.c<? super kotlin.H0> r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.ota.sdk.f.G(com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(kotlin.coroutines.c<? super kotlin.H0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partylight.lib.ota.sdk.f.l
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partylight.lib.ota.sdk.f$l r0 = (com.harman.jbl.partylight.lib.ota.sdk.f.l) r0
            int r1 = r0.f47358M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47358M = r1
            goto L18
        L13:
            com.harman.jbl.partylight.lib.ota.sdk.f$l r0 = new com.harman.jbl.partylight.lib.ota.sdk.f$l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f47356K
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f47358M
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f47353H
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r0 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r0
            kotlin.W.n(r10)
            goto Lb2
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            java.lang.Object r2 = r0.f47355J
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r2 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r2
            java.lang.Object r4 = r0.f47354I
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r4 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r4
            java.lang.Object r5 = r0.f47353H
            com.harman.jbl.partylight.lib.ota.sdk.f r5 = (com.harman.jbl.partylight.lib.ota.sdk.f) r5
            kotlin.W.n(r10)
            goto L96
        L4d:
            java.lang.Object r2 = r0.f47355J
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r2 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r2
            java.lang.Object r5 = r0.f47354I
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r5 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r5
            java.lang.Object r7 = r0.f47353H
            com.harman.jbl.partylight.lib.ota.sdk.f r7 = (com.harman.jbl.partylight.lib.ota.sdk.f) r7
            kotlin.W.n(r10)
            r10 = r5
            r5 = r7
            goto L82
        L5f:
            kotlin.W.n(r10)
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r10 = r9.v()
            if (r10 == 0) goto Lb2
            kotlinx.coroutines.W0 r2 = kotlinx.coroutines.C2322k0.e()
            com.harman.jbl.partylight.lib.ota.sdk.f$m r7 = new com.harman.jbl.partylight.lib.ota.sdk.f$m
            r7.<init>(r10, r6)
            r0.f47353H = r9
            r0.f47354I = r10
            r0.f47355J = r10
            r0.f47358M = r5
            java.lang.Object r2 = kotlinx.coroutines.C2319j.h(r2, r7, r0)
            if (r2 != r1) goto L80
            return r1
        L80:
            r5 = r9
            r2 = r10
        L82:
            com.harman.jbl.cd_biz_comm.wireless_tech.c r7 = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G
            r0.f47353H = r5
            r0.f47354I = r10
            r0.f47355J = r2
            r0.f47358M = r4
            java.lang.Object r4 = r7.p(r2, r0)
            if (r4 != r1) goto L93
            return r1
        L93:
            r8 = r4
            r4 = r10
            r10 = r8
        L96:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lad
            r0.f47353H = r4
            r0.f47354I = r6
            r0.f47355J = r6
            r0.f47358M = r3
            java.lang.Object r10 = r5.G(r2, r0)
            if (r10 != r1) goto Lb2
            return r1
        Lad:
            java.lang.String r10 = "Device connect failed"
            r5.t(r10)
        Lb2:
            kotlin.H0 r10 = kotlin.H0.f51801a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.ota.sdk.f.I(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016e -> B:13:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0172 -> B:13:0x016f). Please report as a decompilation issue!!! */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r19, kotlin.coroutines.c<? super kotlin.H0> r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.ota.sdk.f.K(com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice, kotlin.coroutines.c):java.lang.Object");
    }

    private final void q() {
        if (this.f47326L.isEmpty() && this.f47325K.isEmpty()) {
            this.f47323I = false;
            com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.partylight.lib.ota.sdk.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.r(f.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(f this$0) {
        F.p(this$0, "this$0");
        com.harman.jbl.partylight.lib.ota.sdk.l j4 = this$0.f47319E.j();
        List<PartyLightDevice> g4 = this$0.f47319E.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g4) {
            if (this$0.E((PartyLightDevice) obj)) {
                arrayList.add(obj);
            }
        }
        j4.d(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(PartyLightDevice partyLightDevice) {
        Object obj;
        Iterator<T> it = this.f47324J.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                PartyLightDevice partyLightDevice2 = (PartyLightDevice) obj;
                if (F.g(partyLightDevice2, partyLightDevice) && E(partyLightDevice2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PartyLightDevice partyLightDevice3 = (PartyLightDevice) obj;
        if (partyLightDevice3 != null) {
            z(partyLightDevice3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final String str) {
        com.harman.jbl.cd_biz_comm.logger.d.b(f47317Q, "升级失败: " + str);
        final PartyLightDevice v3 = v();
        if (v3 != null) {
            this.f47326L.remove(v3);
            com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.q(v3);
            com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.partylight.lib.ota.sdk.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(f.this, v3, str);
                }
            });
        }
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(f this$0, PartyLightDevice it, String msg) {
        F.p(this$0, "this$0");
        F.p(it, "$it");
        F.p(msg, "$msg");
        this$0.f47319E.j().a(it, msg);
    }

    private final PartyLightDevice v() {
        Object G22;
        G22 = D.G2(this.f47326L);
        return (PartyLightDevice) G22;
    }

    private final RandomAccessFile x() {
        return (RandomAccessFile) this.f47322H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlinx.coroutines.U r11, boolean r12, kotlin.coroutines.c<? super kotlin.H0> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.harman.jbl.partylight.lib.ota.sdk.f.C0421f
            if (r0 == 0) goto L13
            r0 = r13
            com.harman.jbl.partylight.lib.ota.sdk.f$f r0 = (com.harman.jbl.partylight.lib.ota.sdk.f.C0421f) r0
            int r1 = r0.f47339N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47339N = r1
            goto L18
        L13:
            com.harman.jbl.partylight.lib.ota.sdk.f$f r0 = new com.harman.jbl.partylight.lib.ota.sdk.f$f
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f47337L
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f47339N
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r11 = r0.f47336K
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r11 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r11
            java.lang.Object r12 = r0.f47334I
            kotlinx.coroutines.U r12 = (kotlinx.coroutines.U) r12
            java.lang.Object r0 = r0.f47333H
            com.harman.jbl.partylight.lib.ota.sdk.f r0 = (com.harman.jbl.partylight.lib.ota.sdk.f) r0
            kotlin.W.n(r13)
            r4 = r12
            goto L6f
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            kotlin.W.n(r13)
            if (r12 == 0) goto L85
            java.util.List<com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice> r12 = r10.f47326L
            java.lang.Object r12 = kotlin.collections.C2107u.M0(r12)
            r13 = r12
            com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice r13 = (com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice) r13
            java.util.List<com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice> r2 = r10.f47324J
            r2.add(r13)
            kotlinx.coroutines.W0 r2 = kotlinx.coroutines.C2322k0.e()
            com.harman.jbl.partylight.lib.ota.sdk.f$g r5 = new com.harman.jbl.partylight.lib.ota.sdk.f$g
            r5.<init>(r13, r3)
            r0.f47333H = r10
            r0.f47334I = r11
            r0.f47335J = r12
            r0.f47336K = r13
            r0.f47339N = r4
            java.lang.Object r12 = kotlinx.coroutines.C2319j.h(r2, r5, r0)
            if (r12 != r1) goto L6c
            return r1
        L6c:
            r0 = r10
            r4 = r11
            r11 = r13
        L6f:
            r5 = 0
            r6 = 0
            com.harman.jbl.partylight.lib.ota.sdk.f$h r7 = new com.harman.jbl.partylight.lib.ota.sdk.f$h
            r7.<init>(r11, r3)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.L0 r12 = kotlinx.coroutines.C2319j.e(r4, r5, r6, r7, r8, r9)
            java.util.Map<com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice, kotlinx.coroutines.L0> r13 = r0.f47325K
            r13.put(r11, r12)
            r0.F()
            goto L8a
        L85:
            java.lang.String r11 = "Apply dfu failed"
            r10.t(r11)
        L8a:
            kotlin.H0 r11 = kotlin.H0.f51801a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.ota.sdk.f.y(kotlinx.coroutines.U, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(final PartyLightDevice partyLightDevice) {
        this.f47324J.remove(partyLightDevice);
        L0 remove = this.f47325K.remove(partyLightDevice);
        if (remove != null) {
            L0.a.b(remove, null, 1, null);
        }
        com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.partylight.lib.ota.sdk.c
            @Override // java.lang.Runnable
            public final void run() {
                f.A(f.this, partyLightDevice);
            }
        });
        q();
    }

    public final boolean D() {
        return this.f47323I;
    }

    public final void H(@l3.d PartyLightDevice device) {
        F.p(device, "device");
        if (!this.f47319E.g().contains(device)) {
            return;
        }
        this.f47323I = true;
        this.f47326L.add(device);
        if (this.f47326L.size() == 1) {
            F();
        }
    }

    public final void J() {
        if (!this.f47323I && !this.f47319E.g().isEmpty()) {
            this.f47323I = true;
            com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.x(this.f47327M);
            com.harman.jbl.cd_biz_comm.wireless_tech.j.f38190F.y(this.f47328N);
            C2323l.f(this, null, null, new n(null), 3, null);
        }
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f47320F.getCoroutineContext();
    }

    public final void w() {
        V.f(this, null, 1, null);
        com.harman.jbl.cd_biz_comm.wireless_tech.j.f38190F.A(this.f47328N);
        com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
        cVar.A(this.f47327M);
        if (F.g(com.harman.jbl.partylight.lib.core.b.f46256F.j(), v())) {
            PartyLightDevice v3 = v();
            F.m(v3);
            cVar.z(v3, new C2376b());
        } else {
            cVar.q(v());
        }
        x().close();
        Iterator<Map.Entry<PartyLightDevice, L0>> it = this.f47325K.entrySet().iterator();
        while (it.hasNext()) {
            L0.a.b(it.next().getValue(), null, 1, null);
        }
        this.f47325K.clear();
        this.f47324J.clear();
        this.f47326L.clear();
        this.f47323I = false;
    }
}
