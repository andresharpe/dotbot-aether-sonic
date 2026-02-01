package com.harman.jbl.partybox.ui.ota;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.ui.ota.C2024j;
import com.harman.jbl.partybox.ui.ota.OtaManager;
import com.harman.jbl.partybox.utils.FirmwareCurrentOperation;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.GestureInfo;
import com.harman.sdk.ota.RemoteOTAConfig;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.InterfaceC2350z;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class N extends com.harman.jbl.partybox.c {

    /* renamed from: d0, reason: collision with root package name */
    @l3.d
    public static final a f44503d0 = new a(null);

    /* renamed from: e0, reason: collision with root package name */
    @l3.d
    public static final String f44504e0 = "OTAViewModel";

    /* renamed from: f0, reason: collision with root package name */
    @l3.d
    public static final String f44505f0 = "OTA_CONNECTION_FAILED";

    /* renamed from: g0, reason: collision with root package name */
    private static final int f44506g0 = 5;

    /* renamed from: P, reason: collision with root package name */
    @l3.e
    private C2024j f44507P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.e
    private C2023i f44508Q;

    /* renamed from: R, reason: collision with root package name */
    public HmDevice f44509R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final P<Integer> f44510S = new P<>(0);

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final P<Long> f44511T = new P<>(0L);

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final P<Integer> f44512U = new P<>(-1);

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44513V = new P<>(Boolean.FALSE);

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44514W = new P<>();

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private C2024j.c f44515X = new f();

    /* renamed from: Y, reason: collision with root package name */
    private int f44516Y;

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    private Handler f44517Z;

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private Runnable f44518a0;

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    private OtaManager.b f44519b0;

    /* renamed from: c0, reason: collision with root package name */
    @l3.e
    private InterfaceC2350z<H0> f44520c0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.OTAViewModel", f = "OTAViewModel.kt", i = {0}, l = {252, GestureInfo.f48245e0}, m = "cancelOta", n = {"this"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44521H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44522I;

        /* renamed from: K, reason: collision with root package name */
        int f44524K;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44522I = obj;
            this.f44524K |= Integer.MIN_VALUE;
            return N.this.k0(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!OtaManager.f44545a.h()) {
                if (N.this.f44516Y < 5) {
                    N.this.f44516Y++;
                    C2024j c2024j = N.this.f44507P;
                    if (c2024j != null) {
                        c2024j.o();
                    }
                    N.this.f44517Z.postDelayed(this, 1000L);
                    T1.a.a("OTA_LOG Sending REQDFUINFO mDFUInfoCommandCount=" + N.this.f44516Y);
                    return;
                }
                N n4 = N.this;
                n4.T(n4.f44512U, Integer.valueOf(C2024j.d.OTA_FAIL.ordinal()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements OtaManager.b {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44527a;

            static {
                int[] iArr = new int[OtaManager.PbSppConnectionStatus.values().length];
                try {
                    iArr[OtaManager.PbSppConnectionStatus.PB_SPP_CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OtaManager.PbSppConnectionStatus.PB_SPP_DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f44527a = iArr;
            }
        }

        d() {
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void a(@l3.d String dfuVerStr, int i4) {
            PartyBoxDevice partyBoxDevice;
            kotlin.jvm.internal.F.p(dfuVerStr, "dfuVerStr");
            T1.a.a("OTA_LOG onDFUInfoReceived Start Upgrading");
            N n4 = N.this;
            n4.T(n4.f44513V, Boolean.TRUE);
            N.this.A0(dfuVerStr, i4);
            HmDevice hmDevice = N.this.f44509R;
            if (hmDevice instanceof PartyBoxDevice) {
                partyBoxDevice = (PartyBoxDevice) hmDevice;
            } else {
                partyBoxDevice = null;
            }
            if (partyBoxDevice != null) {
                N n5 = N.this;
                C2024j c2024j = n5.f44507P;
                if (c2024j != null) {
                    c2024j.t(n5.o0());
                }
                C2024j c2024j2 = n5.f44507P;
                if (c2024j2 != null) {
                    c2024j2.x(OtaManager.f44545a.d());
                }
                C2024j c2024j3 = n5.f44507P;
                if (c2024j3 != null) {
                    c2024j3.u(partyBoxDevice);
                }
                n5.f44508Q = new C2023i();
                C2023i c2023i = n5.f44508Q;
                if (c2023i != null) {
                    c2023i.c(OtaManager.f44545a.d());
                }
                partyBoxDevice.Z1(true);
                partyBoxDevice.a2(false);
                C2024j c2024j4 = n5.f44507P;
                if (c2024j4 != null) {
                    c2024j4.m();
                }
            }
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void b() {
            C2024j c2024j = N.this.f44507P;
            if (c2024j != null) {
                c2024j.w();
            }
            HmDevice unused = N.this.f44509R;
            T1.a.a("OTA_LOG setOtaRestartPhase to true");
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void c() {
            HmDevice hmDevice = N.this.f44509R;
            kotlin.jvm.internal.F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            ((PartyBoxDevice) hmDevice).a2(true);
            InterfaceC2350z interfaceC2350z = N.this.f44520c0;
            if (interfaceC2350z != null) {
                interfaceC2350z.F0(H0.f51801a);
            }
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void d(@l3.d FirmwareCurrentOperation currentOperation) {
            kotlin.jvm.internal.F.p(currentOperation, "currentOperation");
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void e(@l3.d OtaManager.PbSppConnectionStatus sppStatus) {
            kotlin.jvm.internal.F.p(sppStatus, "sppStatus");
            int i4 = a.f44527a[sppStatus.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    T1.a.a("OTA_LOG PB_SPP_DISCONNECTED");
                    N.this.l0();
                    N n4 = N.this;
                    n4.T(n4.f44512U, Integer.valueOf(C2024j.d.OTA_FAIL.ordinal()));
                    return;
                }
                return;
            }
            T1.a.a("OTA_LOG PB_SPP_CONNECTED");
            C2028n d4 = OtaManager.f44545a.d();
            if (d4 != null && d4.o() == 3) {
                N.this.z0();
            }
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void f() {
            C2024j c2024j = N.this.f44507P;
            if (c2024j != null) {
                c2024j.k();
            }
        }

        @Override // com.harman.jbl.partybox.ui.ota.OtaManager.b
        public void g(@l3.d String otaAckPayload) {
            kotlin.jvm.internal.F.p(otaAckPayload, "otaAckPayload");
            C2024j c2024j = N.this.f44507P;
            if (c2024j != null) {
                c2024j.l(otaAckPayload);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.OTAViewModel$startOTADetection$1", f = "OTAViewModel.kt", i = {1}, l = {281, 282}, m = "invokeSuspend", n = {"connectResult"}, s = {"Z$0"})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        boolean f44528I;

        /* renamed from: J, reason: collision with root package name */
        int f44529J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44530K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ N f44531L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, N n4, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f44530K = hmDevice;
            this.f44531L = n4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            boolean z3;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44529J;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        z3 = this.f44528I;
                        W.n(obj);
                        com.harman.log.f.a(N.f44504e0, "BLE_LOG otaRestartLiveData set to " + z3);
                        N n4 = this.f44531L;
                        n4.T(n4.f44514W, kotlin.coroutines.jvm.internal.a.a(z3));
                        return H0.f51801a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                W.n(obj);
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.ota.business.a aVar = com.harman.jbl.partybox.ui.ota.business.a.f44560a;
                HmDevice hmDevice = this.f44530K;
                this.f44529J = 1;
                obj = aVar.u(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            com.harman.jbl.partybox.ui.business.a aVar2 = com.harman.jbl.partybox.ui.business.a.f42135a;
            HmDevice hmDevice2 = this.f44530K;
            this.f44528I = booleanValue;
            this.f44529J = 2;
            if (aVar2.m(hmDevice2, this) == l4) {
                return l4;
            }
            z3 = booleanValue;
            com.harman.log.f.a(N.f44504e0, "BLE_LOG otaRestartLiveData set to " + z3);
            N n42 = this.f44531L;
            n42.T(n42.f44514W, kotlin.coroutines.jvm.internal.a.a(z3));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f44530K, this.f44531L, cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements C2024j.c {
        f() {
        }

        @Override // com.harman.jbl.partybox.ui.ota.C2024j.c
        public /* bridge */ /* synthetic */ void a(Long l4) {
            d(l4.longValue());
        }

        @Override // com.harman.jbl.partybox.ui.ota.C2024j.c
        public void b(int i4) {
            N n4 = N.this;
            n4.T(n4.f44510S, Integer.valueOf(i4));
        }

        @Override // com.harman.jbl.partybox.ui.ota.C2024j.c
        public void c(@l3.d C2024j.d upgradeStatus) {
            kotlin.jvm.internal.F.p(upgradeStatus, "upgradeStatus");
            N n4 = N.this;
            n4.T(n4.f44512U, Integer.valueOf(upgradeStatus.ordinal()));
        }

        public void d(long j4) {
            N n4 = N.this;
            n4.T(n4.f44511T, Long.valueOf(j4));
        }
    }

    public N() {
        C2024j c2024j = new C2024j();
        this.f44507P = c2024j;
        c2024j.y(this.f44515X);
        C2024j c2024j2 = this.f44507P;
        if (c2024j2 != null) {
            c2024j2.u(this.f44509R);
        }
        this.f44517Z = new Handler();
        this.f44518a0 = new c();
        this.f44519b0 = new d();
    }

    private final String E0(String str) {
        int D3;
        if (str == null) {
            return null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            if (str.charAt(i5) == '.') {
                i4++;
            }
        }
        if (i4 > 3) {
            D3 = kotlin.text.A.D3(str, ".", 0, false, 6, null);
            String substring = str.substring(0, D3);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context o0() {
        ActivityC0889g activityC0889g = this.f38307I.get();
        if (activityC0889g != null) {
            return activityC0889g.getApplicationContext();
        }
        return null;
    }

    public final void A0(@l3.d String dfuOri, int i4) {
        kotlin.jvm.internal.F.p(dfuOri, "dfuOri");
        String substring = dfuOri.substring(0, 2);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        Integer valueOf = Integer.valueOf(substring, 16);
        String substring2 = dfuOri.substring(2, 4);
        kotlin.jvm.internal.F.o(substring2, "substring(...)");
        Integer valueOf2 = Integer.valueOf(substring2, 16);
        String substring3 = dfuOri.substring(4, 6);
        kotlin.jvm.internal.F.o(substring3, "substring(...)");
        Integer valueOf3 = Integer.valueOf(substring3, 16);
        String str = valueOf + "." + valueOf2 + "." + valueOf3;
        kotlin.jvm.internal.F.m(valueOf);
        int intValue = valueOf.intValue();
        kotlin.jvm.internal.F.m(valueOf2);
        int intValue2 = valueOf2.intValue();
        kotlin.jvm.internal.F.m(valueOf3);
        int[] iArr = {intValue, intValue2, valueOf3.intValue()};
        HmDevice hmDevice = this.f44509R;
        kotlin.jvm.internal.F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
        partyBoxDevice.b2(iArr);
        partyBoxDevice.p0(str);
        partyBoxDevice.q2(i4);
        T1.a.a("OTA_LOG onDFUInfoReceived and dfuVersionInts : " + partyBoxDevice.U0() + " and dfuVersion : " + partyBoxDevice.s() + " and breakpointBytes : " + partyBoxDevice.g1());
    }

    public final void B0(@l3.d HmDevice hmDevice) {
        kotlin.jvm.internal.F.p(hmDevice, "<set-?>");
        this.f44509R = hmDevice;
    }

    public final void C0(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        C2323l.f(k0.a(this), C2322k0.e(), null, new e(device, this, null), 2, null);
    }

    public final void D0() {
        OtaManager.f44545a.n();
        this.f44508Q = null;
        this.f44507P = null;
    }

    public final void V(@l3.d ActivityC0889g fragmentActivity) {
        kotlin.jvm.internal.F.p(fragmentActivity, "fragmentActivity");
        super.F(fragmentActivity);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(@l3.d kotlin.coroutines.c<? super kotlin.H0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.harman.jbl.partybox.ui.ota.N.b
            if (r0 == 0) goto L13
            r0 = r8
            com.harman.jbl.partybox.ui.ota.N$b r0 = (com.harman.jbl.partybox.ui.ota.N.b) r0
            int r1 = r0.f44524K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44524K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.ota.N$b r0 = new com.harman.jbl.partybox.ui.ota.N$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f44522I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44524K
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.W.n(r8)
            goto L69
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f44521H
            com.harman.jbl.partybox.ui.ota.N r2 = (com.harman.jbl.partybox.ui.ota.N) r2
            kotlin.W.n(r8)
            goto L57
        L3d:
            kotlin.W.n(r8)
            kotlinx.coroutines.z r8 = kotlinx.coroutines.B.c(r4, r5, r4)
            r7.f44520c0 = r8
            r7.l0()
            r0.f44521H = r7
            r0.f44524K = r5
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r8 = kotlinx.coroutines.C2269d0.b(r5, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r2 = r7
        L57:
            r2.l0()
            kotlinx.coroutines.z<kotlin.H0> r8 = r2.f44520c0
            if (r8 == 0) goto L6c
            r0.f44521H = r4
            r0.f44524K = r3
            java.lang.Object r8 = r8.c0(r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            kotlin.H0 r8 = kotlin.H0.f51801a
            return r8
        L6c:
            kotlin.H0 r8 = kotlin.H0.f51801a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.N.k0(kotlin.coroutines.c):java.lang.Object");
    }

    public final void l0() {
        T1.a.a("OTA_LOG cancelUpgradeOperation called");
        if (this.f44507P != null) {
            C2024j.z(false);
            C2024j c2024j = this.f44507P;
            if (c2024j != null) {
                c2024j.d();
            }
        }
        C2023i c2023i = this.f44508Q;
        if (c2023i != null) {
            c2023i.a();
        }
    }

    public final void m0() {
        if (this.f44507P != null) {
            C2024j.z(false);
            C2024j c2024j = this.f44507P;
            if (c2024j != null) {
                c2024j.d();
            }
        }
    }

    @l3.d
    public final String n0(@l3.d String language, @l3.d Map<String, RemoteOTAConfig.WhatsNewItem> whatsNewUpdateMap) {
        kotlin.jvm.internal.F.p(language, "language");
        kotlin.jvm.internal.F.p(whatsNewUpdateMap, "whatsNewUpdateMap");
        StringBuilder sb = new StringBuilder();
        if (whatsNewUpdateMap.isEmpty()) {
            return "";
        }
        RemoteOTAConfig.WhatsNewItem whatsNewItem = whatsNewUpdateMap.get(language);
        if (whatsNewItem == null && (whatsNewItem = whatsNewUpdateMap.get("en")) == null) {
            return "";
        }
        List<String> b4 = whatsNewItem.b();
        if (b4.isEmpty()) {
            return "";
        }
        int size = b4.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            sb.append(i5);
            sb.append(". ");
            sb.append(b4.get(i4));
            sb.append("\n");
            i4 = i5;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @l3.d
    public final HmDevice p0() {
        HmDevice hmDevice = this.f44509R;
        if (hmDevice != null) {
            return hmDevice;
        }
        kotlin.jvm.internal.F.S("mainDevice");
        return null;
    }

    @l3.e
    public final String q0(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        return E0(((PartyBoxDevice) device).p1());
    }

    public final long r0() {
        if (C2024j.f44637p <= 0) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - C2024j.f44637p;
        if (currentTimeMillis <= 0) {
            return 0L;
        }
        return currentTimeMillis / 1000;
    }

    @l3.d
    public final LiveData<Boolean> s0() {
        return this.f44514W;
    }

    @l3.d
    public final LiveData<Integer> t0() {
        return this.f44510S;
    }

    @l3.d
    public final LiveData<Long> u0() {
        return this.f44511T;
    }

    @l3.d
    public final LiveData<Integer> v0() {
        return this.f44512U;
    }

    public final void w0() {
        T1.a.a("OTA_LOG PB_SPP_CONNECTED");
        C2024j c2024j = this.f44507P;
        if (c2024j != null) {
            c2024j.x(OtaManager.f44545a.d());
        }
    }

    public final void x0(@l3.d HmDevice device) {
        kotlin.jvm.internal.F.p(device, "device");
        this.f44509R = device;
        OtaManager otaManager = OtaManager.f44545a;
        otaManager.g(this.f44519b0);
        otaManager.m();
        otaManager.c(this.f44509R.n());
    }

    @l3.d
    public final LiveData<Boolean> y0() {
        return this.f44513V;
    }

    public final void z0() {
        OtaManager.f44545a.j(false);
        this.f44516Y = 0;
        this.f44517Z.postDelayed(this.f44518a0, 10L);
    }
}
