package com.harman.jbl.partybox.ui.ota.business;

import B2.c;
import android.text.TextUtils;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.List;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.collections.C2101p;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.r;
import kotlinx.coroutines.w1;
import y2.InterfaceC2445a;

@U({"SMAP\nOTABusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,336:1\n314#2,11:337\n314#2,11:348\n314#2,11:359\n*S KotlinDebug\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness\n*L\n104#1:337,11\n169#1:348,11\n222#1:359,11\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f44560a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final String f44561b = "OTABusiness";

    /* renamed from: c, reason: collision with root package name */
    public static final long f44562c = 6000;

    /* renamed from: d, reason: collision with root package name */
    public static final long f44563d = 20000;

    /* renamed from: e, reason: collision with root package name */
    public static final long f44564e = 40000;

    /* renamed from: f, reason: collision with root package name */
    public static final long f44565f = 410000;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.business.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0389a extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ com.harman.sdk.impl.connect.i f44566F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ b f44567G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0389a(com.harman.sdk.impl.connect.i iVar, b bVar) {
            super(1);
            this.f44566F = iVar;
            this.f44567G = bVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            this.f44566F.d(this.f44567G);
        }
    }

    @U({"SMAP\nOTABusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness$connectDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,336:1\n94#2,4:337\n94#2,4:341\n*S KotlinDebug\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness$connectDevice$2$listener$1\n*L\n192#1:337,4\n204#1:341,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC2445a.InterfaceC0551a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HmDevice f44568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.harman.sdk.impl.connect.i f44569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44570c;

        /* JADX WARN: Multi-variable type inference failed */
        b(HmDevice hmDevice, com.harman.sdk.impl.connect.i iVar, InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f44568a = hmDevice;
            this.f44569b = iVar;
            this.f44570c = interfaceC2333q;
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            String str;
            F.p(protocol, "protocol");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f44568a, hmDevice) || 2 != i4) {
                return;
            }
            this.f44569b.d(this);
            com.harman.jbl.partybox.ui.party.auracast.o oVar = com.harman.jbl.partybox.ui.party.auracast.o.f44854a;
            if (oVar.q(i4)) {
                str = "suc";
            } else {
                str = L1.a.f1625n3;
            }
            com.harman.log.f.d(a.f44561b, "connectDevice() >>> connect device " + str + " @[" + System.currentTimeMillis() + "]:\n" + bVar.t(this.f44568a));
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44570c;
            Boolean valueOf = Boolean.valueOf(oVar.q(i4));
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(valueOf));
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void b(@l3.d HmDevice hmDevice) {
            InterfaceC2445a.InterfaceC0551a.C0552a.a(this, hmDevice);
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
            InterfaceC2445a.InterfaceC0551a.C0552a.b(this, device);
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f44568a, device)) {
                return;
            }
            com.harman.log.f.d(a.f44561b, "onStandbyDeviceBLEConnected() >>> connect suc. device:\n" + bVar.t(device));
            this.f44569b.d(this);
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44570c;
            Boolean bool = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(bool));
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void d(@l3.d BaseMessage deviceMessage) {
            F.p(deviceMessage, "deviceMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {0}, l = {267}, m = "connectDeviceWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44571H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44572I;

        /* renamed from: K, reason: collision with root package name */
        int f44574K;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44572I = obj;
            this.f44574K |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness$connectDeviceWithTimeout$connectResult$1$1", f = "OTABusiness.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44575I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44577K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f44577K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44575I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f44577K;
                this.f44575I = 1;
                obj = aVar.k(hmDevice, this);
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
            return new d(this.f44577K, cVar);
        }
    }

    @U({"SMAP\nOTABusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness$reqDeviceInfo$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,336:1\n94#2,4:337\n94#2,4:341\n*S KotlinDebug\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness$reqDeviceInfo$2$listener$1\n*L\n125#1:337,4\n131#1:341,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class e implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44578a;

        /* renamed from: com.harman.jbl.partybox.ui.ota.business.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0390a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44579a;

            static {
                int[] iArr = new int[StatusCode.values().length];
                try {
                    iArr[StatusCode.STATUS_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StatusCode.STATUS_TIMEOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f44579a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f44578a = interfaceC2333q;
        }

        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            if (MessageID.DEVICE_INFO != baseMessage.b()) {
                return;
            }
            int i4 = C0390a.f44579a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.d(a.f44561b, "reqDeviceInfo.onStatusChanged() >>> timeout. MAC[" + hmDevice.n() + "]");
                    com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
                    Boolean bool = Boolean.FALSE;
                    if (interfaceC2333q.c()) {
                        Result.a aVar = Result.f51807F;
                        interfaceC2333q.x(Result.b(bool));
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f44561b, "reqDeviceInfo.onStatusChanged() >>> success. MAC[" + hmDevice.n() + ", firmwareVer = " + hmDevice.w() + "]");
            if (!TextUtils.isEmpty(hmDevice.w())) {
                com.harman.jbl.partybox.ui.party.b bVar2 = com.harman.jbl.partybox.ui.party.b.f44881a;
                Boolean bool2 = Boolean.TRUE;
                if (interfaceC2333q.c()) {
                    Result.a aVar2 = Result.f51807F;
                    interfaceC2333q.x(Result.b(bool2));
                }
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44578a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44578a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {0}, l = {283}, m = "reqDeviceInfoWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class f extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44580H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44581I;

        /* renamed from: K, reason: collision with root package name */
        int f44583K;

        f(kotlin.coroutines.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44581I = obj;
            this.f44583K |= Integer.MIN_VALUE;
            return a.this.o(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness$reqDeviceInfoWithTimeout$connectResult$1$1", f = "OTABusiness.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class g extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44584I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44586K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(HmDevice hmDevice, kotlin.coroutines.c<? super g> cVar) {
            super(2, cVar);
            this.f44586K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44584I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f44586K;
                this.f44584I = 1;
                obj = aVar.n(hmDevice, this);
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
            return ((g) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new g(this.f44586K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {0, 0}, l = {149, 153}, m = "scanAndConnect", n = {"this", "device"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class h extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44587H;

        /* renamed from: I, reason: collision with root package name */
        Object f44588I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f44589J;

        /* renamed from: L, reason: collision with root package name */
        int f44591L;

        h(kotlin.coroutines.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44589J = obj;
            this.f44591L |= Integer.MIN_VALUE;
            return a.this.p(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ j f44592F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(1);
            this.f44592F = jVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            List Jy;
            B2.c k4 = com.harman.sdk.b.f47608a.k();
            if (k4 != null) {
                Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                k4.j(Jy, this.f44592F);
            }
        }
    }

    @U({"SMAP\nOTABusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness$scanDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,336:1\n94#2,4:337\n94#2,4:341\n*S KotlinDebug\n*F\n+ 1 OTABusiness.kt\ncom/harman/jbl/partybox/ui/ota/business/OTABusiness$scanDevice$2$listener$1\n*L\n241#1:337,4\n250#1:341,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class j implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HmDevice f44593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44594b;

        /* JADX WARN: Multi-variable type inference failed */
        j(HmDevice hmDevice, InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f44593a = hmDevice;
            this.f44594b = interfaceC2333q;
        }

        @Override // B2.c.b
        public void b(int i4, @l3.e String str) {
            List Jy;
            B2.c k4 = com.harman.sdk.b.f47608a.k();
            if (k4 != null) {
                Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                k4.j(Jy, this);
            }
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44594b;
            Boolean bool = Boolean.FALSE;
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(bool));
            }
        }

        @Override // B2.c.b
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // B2.c.b
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // B2.c.b
        public void e(@l3.d HmDevice scannedDevice) {
            List Jy;
            F.p(scannedDevice, "scannedDevice");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f44593a, scannedDevice)) {
                return;
            }
            if (scannedDevice.O() && !scannedDevice.R()) {
                B2.c k4 = com.harman.sdk.b.f47608a.k();
                if (k4 != null) {
                    Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                    k4.j(Jy, this);
                }
                com.harman.log.f.d(a.f44561b, "scanDevice() >>> scan device suc @[" + System.currentTimeMillis() + "]:\n" + bVar.t(this.f44593a));
                InterfaceC2333q<Boolean> interfaceC2333q = this.f44594b;
                Boolean bool = Boolean.TRUE;
                if (interfaceC2333q.c()) {
                    Result.a aVar = Result.f51807F;
                    interfaceC2333q.x(Result.b(bool));
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f44561b, "scanDevice() >>> scan device suc but A2dp is not connected or bt is connected");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {0}, l = {299}, m = "scanDeviceWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class k extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44595H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44596I;

        /* renamed from: K, reason: collision with root package name */
        int f44598K;

        k(kotlin.coroutines.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44596I = obj;
            this.f44598K |= Integer.MIN_VALUE;
            return a.this.r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness$scanDeviceWithTimeout$scanResult$1$1", f = "OTABusiness.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class l extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44599I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44601K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(HmDevice hmDevice, kotlin.coroutines.c<? super l> cVar) {
            super(2, cVar);
            this.f44601K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44599I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f44601K;
                this.f44599I = 1;
                obj = aVar.q(hmDevice, this);
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
            return ((l) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new l(this.f44601K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {}, l = {56}, m = "scanWithRetry-yxL6bBk", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class m extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f44602H;

        /* renamed from: J, reason: collision with root package name */
        int f44604J;

        m(kotlin.coroutines.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            this.f44602H = obj;
            this.f44604J |= Integer.MIN_VALUE;
            Object s4 = a.this.s(null, 0L, 0L, 0L, this);
            l4 = kotlin.coroutines.intrinsics.b.l();
            return s4 == l4 ? s4 : Result.a(s4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness$scanWithRetry$2", f = "OTABusiness.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class n extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Result<? extends Boolean>>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44605I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f44606J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f44607K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f44608L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ long f44609M;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness$scanWithRetry$2$1", f = "OTABusiness.kt", i = {0, 1}, l = {64, 80}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"})
        /* renamed from: com.harman.jbl.partybox.ui.ota.business.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0391a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Result<? extends Boolean>>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f44610I;

            /* renamed from: J, reason: collision with root package name */
            private /* synthetic */ Object f44611J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f44612K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ Ref.IntRef f44613L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<Throwable> f44614M;

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ Ref.LongRef f44615N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ long f44616O;

            /* renamed from: P, reason: collision with root package name */
            final /* synthetic */ long f44617P;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0391a(HmDevice hmDevice, Ref.IntRef intRef, Ref.ObjectRef<Throwable> objectRef, Ref.LongRef longRef, long j4, long j5, kotlin.coroutines.c<? super C0391a> cVar) {
                super(2, cVar);
                this.f44612K = hmDevice;
                this.f44613L = intRef;
                this.f44614M = objectRef;
                this.f44615N = longRef;
                this.f44616O = j4;
                this.f44617P = j5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0159 -> B:6:0x015c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object D(@l3.d java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 413
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.n.C0391a.D(java.lang.Object):java.lang.Object");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Result<Boolean>> cVar) {
                return ((C0391a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                C0391a c0391a = new C0391a(this.f44612K, this.f44613L, this.f44614M, this.f44615N, this.f44616O, this.f44617P, cVar);
                c0391a.f44611J = obj;
                return c0391a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j4, long j5, HmDevice hmDevice, long j6, kotlin.coroutines.c<? super n> cVar) {
            super(2, cVar);
            this.f44606J = j4;
            this.f44607K = j5;
            this.f44608L = hmDevice;
            this.f44609M = j6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44605I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            W.n(obj);
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.f52300E = this.f44606J;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.IntRef intRef = new Ref.IntRef();
            long j4 = this.f44607K;
            C0391a c0391a = new C0391a(this.f44608L, intRef, objectRef, longRef, this.f44609M, j4, null);
            this.f44605I = 1;
            Object c4 = w1.c(j4, c0391a, this);
            if (c4 == l4) {
                return l4;
            }
            return c4;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Result<Boolean>> cVar) {
            return ((n) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new n(this.f44606J, this.f44607K, this.f44608L, this.f44609M, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {0}, l = {42}, m = "startOTADetection", n = {"mainDevice"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class o extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44618H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44619I;

        /* renamed from: K, reason: collision with root package name */
        int f44621K;

        o(kotlin.coroutines.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44619I = obj;
            this.f44621K |= Integer.MIN_VALUE;
            return a.this.u(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.ota.business.OTABusiness", f = "OTABusiness.kt", i = {0, 0}, l = {91, 95}, m = "startSingleDeviceDetection", n = {"this", "device"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class p extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44622H;

        /* renamed from: I, reason: collision with root package name */
        Object f44623I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f44624J;

        /* renamed from: L, reason: collision with root package name */
        int f44626L;

        p(kotlin.coroutines.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44624J = obj;
            this.f44626L |= Integer.MIN_VALUE;
            return a.this.v(null, this);
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(HmDevice hmDevice, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(hmDevice);
        if (c4 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e4, 1);
            rVar.T();
            b bVar = new b(hmDevice, c4, rVar);
            rVar.u(new C0389a(c4, bVar));
            com.harman.log.f.d(f44561b, "connectDevice() >>> try to connect device.MAC[" + hmDevice.n() + "] ble.addr[" + hmDevice.g() + "]");
            c4.c(bVar);
            c4.j(hmDevice);
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.g(f44561b, "connectDevice() >>> fail to get controller for \n" + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
        return kotlin.coroutines.jvm.internal.a.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|(1:17)|18|(3:20|21|22))|24|21|22))|34|6|7|(0)(0)|12|13|(0)|24|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r0 = kotlin.Result.f51807F;
        r9 = kotlin.Result.b(kotlin.W.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.harman.sdk.device.HmDevice r8, kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.ota.business.a.c
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.ota.business.a$c r0 = (com.harman.jbl.partybox.ui.ota.business.a.c) r0
            int r1 = r0.f44574K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44574K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.ota.business.a$c r0 = new com.harman.jbl.partybox.ui.ota.business.a$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44572I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44574K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f44571H
            com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L2e:
            r9 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.W.n(r9)
            kotlin.Result$a r9 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2e
            com.harman.jbl.partybox.ui.ota.business.a$d r9 = new com.harman.jbl.partybox.ui.ota.business.a$d     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r0.f44571H = r8     // Catch: java.lang.Throwable -> L2e
            r0.f44574K = r4     // Catch: java.lang.Throwable -> L2e
            r5 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r9 = kotlinx.coroutines.w1.c(r5, r9, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L68
        L5e:
            kotlin.Result$a r0 = kotlin.Result.f51807F
            java.lang.Object r9 = kotlin.W.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L68:
            boolean r0 = kotlin.Result.j(r9)
            java.lang.String r1 = "connectDeviceWithTimeout() >>> connect to bt device["
            java.lang.String r2 = "OTABusiness"
            if (r0 == 0) goto La0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r5 = kotlin.Result.i(r9)
            if (r5 == 0) goto L7d
            goto L7e
        L7d:
            r3 = r9
        L7e:
            boolean r9 = kotlin.jvm.internal.F.g(r0, r3)
            if (r9 == 0) goto La0
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] success"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.d(r2, r8)
            goto Lbc
        La0:
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] fail for some reason"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.a(r2, r8)
            r4 = 0
        Lbc:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.l(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(HmDevice hmDevice) {
        if (!hmDevice.R()) {
            com.harman.log.f.a(f44561b, "disconnectDevice() >>> already in disconnect state");
            return;
        }
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(hmDevice);
        if (c4 == null) {
            com.harman.log.f.g(f44561b, "disconnectDevice() >>> fail to get controller");
            return;
        }
        c4.k(hmDevice);
        com.harman.log.f.d(f44561b, "disconnectDevice() >>> send disconnect cmd to device:\n" + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(HmDevice hmDevice, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        z2.e e5 = com.harman.sdk.b.f47608a.e(hmDevice);
        if (e5 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e4, 1);
            rVar.T();
            e eVar = new e(rVar);
            com.harman.log.f.d(f44561b, "reqDeviceInfo() >>> request fw firmware version to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
            e5.h0(hmDevice, eVar);
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.a(f44561b, "reqDeviceInfo() >>> cant get dev controller");
        return kotlin.coroutines.jvm.internal.a.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|(1:17)|18|(3:20|21|22))|24|21|22))|34|6|7|(0)(0)|12|13|(0)|24|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r0 = kotlin.Result.f51807F;
        r9 = kotlin.Result.b(kotlin.W.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.harman.sdk.device.HmDevice r8, kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.ota.business.a.f
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.ota.business.a$f r0 = (com.harman.jbl.partybox.ui.ota.business.a.f) r0
            int r1 = r0.f44583K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44583K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.ota.business.a$f r0 = new com.harman.jbl.partybox.ui.ota.business.a$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44581I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44583K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f44580H
            com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L2e:
            r9 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.W.n(r9)
            kotlin.Result$a r9 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2e
            com.harman.jbl.partybox.ui.ota.business.a$g r9 = new com.harman.jbl.partybox.ui.ota.business.a$g     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r0.f44580H = r8     // Catch: java.lang.Throwable -> L2e
            r0.f44583K = r4     // Catch: java.lang.Throwable -> L2e
            r5 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r9 = kotlinx.coroutines.w1.c(r5, r9, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L68
        L5e:
            kotlin.Result$a r0 = kotlin.Result.f51807F
            java.lang.Object r9 = kotlin.W.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L68:
            boolean r0 = kotlin.Result.j(r9)
            java.lang.String r1 = "reqDeviceInfoWithTimeout() >>> connect to bt device["
            java.lang.String r2 = "OTABusiness"
            if (r0 == 0) goto La0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r5 = kotlin.Result.i(r9)
            if (r5 == 0) goto L7d
            goto L7e
        L7d:
            r3 = r9
        L7e:
            boolean r9 = kotlin.jvm.internal.F.g(r0, r3)
            if (r9 == 0) goto La0
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] success"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.d(r2, r8)
            goto Lbc
        La0:
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] fail for some reason"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.a(r2, r8)
            r4 = 0
        Lbc:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.o(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.harman.sdk.device.HmDevice r9, kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.ota.business.a.h
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.ota.business.a$h r0 = (com.harman.jbl.partybox.ui.ota.business.a.h) r0
            int r1 = r0.f44591L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44591L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.ota.business.a$h r0 = new com.harman.jbl.partybox.ui.ota.business.a$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f44589J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44591L
            r3 = 0
            r4 = 2
            java.lang.String r5 = "OTABusiness"
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L37
            if (r2 != r4) goto L2f
            kotlin.W.n(r10)
            goto L9b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.f44588I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r2 = r0.f44587H
            com.harman.jbl.partybox.ui.ota.business.a r2 = (com.harman.jbl.partybox.ui.ota.business.a) r2
            kotlin.W.n(r10)
            goto L74
        L43:
            kotlin.W.n(r10)
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r10.t(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "scanAndConnect() >>>  "
            r2.append(r7)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.harman.log.f.a(r5, r10)
            boolean r10 = r9.R()
            if (r10 != 0) goto L86
            r0.f44587H = r8
            r0.f44588I = r9
            r0.f44591L = r6
            java.lang.Object r10 = r8.r(r9, r0)
            if (r10 != r1) goto L73
            return r1
        L73:
            r2 = r8
        L74:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L87
            java.lang.String r9 = "scanAndConnect() >>>  scanDeviceWithTimeout"
            com.harman.log.f.a(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        L86:
            r2 = r8
        L87:
            boolean r10 = r9.R()
            if (r10 != 0) goto Lad
            r10 = 0
            r0.f44587H = r10
            r0.f44588I = r10
            r0.f44591L = r4
            java.lang.Object r10 = r2.l(r9, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto Lad
            java.lang.String r9 = "scanAndConnect() >>>  connectDeviceWithTimeout"
            com.harman.log.f.a(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        Lad:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.p(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(HmDevice hmDevice, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        List Jy;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        j jVar = new j(hmDevice, rVar);
        rVar.u(new i(jVar));
        com.harman.log.f.d(f44561b, "scanDevice() >>> try to scan device.MAC[" + hmDevice.n() + "] ble.addr[" + hmDevice.g() + "]");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null) {
            Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
            k4.g(Jy, jVar, null);
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|(1:17)|18|(3:20|21|22))|24|21|22))|34|6|7|(0)(0)|12|13|(0)|24|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r0 = kotlin.Result.f51807F;
        r9 = kotlin.Result.b(kotlin.W.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.harman.sdk.device.HmDevice r8, kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.ota.business.a.k
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.ota.business.a$k r0 = (com.harman.jbl.partybox.ui.ota.business.a.k) r0
            int r1 = r0.f44598K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44598K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.ota.business.a$k r0 = new com.harman.jbl.partybox.ui.ota.business.a$k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44596I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44598K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f44595H
            com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L2e:
            r9 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.W.n(r9)
            kotlin.Result$a r9 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2e
            com.harman.jbl.partybox.ui.ota.business.a$l r9 = new com.harman.jbl.partybox.ui.ota.business.a$l     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r0.f44595H = r8     // Catch: java.lang.Throwable -> L2e
            r0.f44598K = r4     // Catch: java.lang.Throwable -> L2e
            r5 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r9 = kotlinx.coroutines.w1.c(r5, r9, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L68
        L5e:
            kotlin.Result$a r0 = kotlin.Result.f51807F
            java.lang.Object r9 = kotlin.W.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L68:
            boolean r0 = kotlin.Result.j(r9)
            java.lang.String r1 = "scanDeviceWithTimeout() >>> scan to bt device["
            java.lang.String r2 = "OTABusiness"
            if (r0 == 0) goto La0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r5 = kotlin.Result.i(r9)
            if (r5 == 0) goto L7d
            goto L7e
        L7d:
            r3 = r9
        L7e:
            boolean r9 = kotlin.jvm.internal.F.g(r0, r3)
            if (r9 == 0) goto La0
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] success"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.d(r2, r8)
            goto Lbc
        La0:
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] fail for some reason"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.a(r2, r8)
            r4 = 0
        Lbc:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.r(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.harman.sdk.device.HmDevice r16, long r17, long r19, long r21, kotlin.coroutines.c<? super kotlin.Result<java.lang.Boolean>> r23) {
        /*
            r15 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.harman.jbl.partybox.ui.ota.business.a.m
            if (r1 == 0) goto L16
            r1 = r0
            com.harman.jbl.partybox.ui.ota.business.a$m r1 = (com.harman.jbl.partybox.ui.ota.business.a.m) r1
            int r2 = r1.f44604J
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f44604J = r2
            r2 = r15
            goto L1c
        L16:
            com.harman.jbl.partybox.ui.ota.business.a$m r1 = new com.harman.jbl.partybox.ui.ota.business.a$m
            r2 = r15
            r1.<init>(r0)
        L1c:
            java.lang.Object r0 = r1.f44602H
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            int r4 = r1.f44604J
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            kotlin.W.n(r0)
            goto L54
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.W.n(r0)
            kotlinx.coroutines.N r0 = kotlinx.coroutines.C2322k0.c()
            com.harman.jbl.partybox.ui.ota.business.a$n r4 = new com.harman.jbl.partybox.ui.ota.business.a$n
            r14 = 0
            r6 = r4
            r7 = r19
            r9 = r17
            r11 = r16
            r12 = r21
            r6.<init>(r7, r9, r11, r12, r14)
            r1.f44604J = r5
            java.lang.Object r0 = kotlinx.coroutines.C2319j.h(r0, r4, r1)
            if (r0 != r3) goto L54
            return r3
        L54:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.s(com.harman.sdk.device.HmDevice, long, long, long, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object t(a aVar, HmDevice hmDevice, long j4, long j5, long j6, kotlin.coroutines.c cVar, int i4, Object obj) {
        long j7;
        long j8;
        long j9;
        if ((i4 & 2) != 0) {
            j7 = 410000;
        } else {
            j7 = j4;
        }
        if ((i4 & 4) != 0) {
            j8 = 1000;
        } else {
            j8 = j5;
        }
        if ((i4 & 8) != 0) {
            j9 = 5000;
        } else {
            j9 = j6;
        }
        return aVar.s(hmDevice, j7, j8, j9, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9 A[PHI: r9
  0x00a9: PHI (r9v13 java.lang.Object) = (r9v7 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x00a6, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.harman.sdk.device.HmDevice r8, kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.ota.business.a.p
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.ota.business.a$p r0 = (com.harman.jbl.partybox.ui.ota.business.a.p) r0
            int r1 = r0.f44626L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44626L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.ota.business.a$p r0 = new com.harman.jbl.partybox.ui.ota.business.a$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44624J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44626L
            java.lang.String r3 = "OTABusiness"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.W.n(r9)
            goto La9
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f44623I
            com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
            java.lang.Object r2 = r0.f44622H
            com.harman.jbl.partybox.ui.ota.business.a r2 = (com.harman.jbl.partybox.ui.ota.business.a) r2
            kotlin.W.n(r9)
            goto L72
        L43:
            kotlin.W.n(r9)
            boolean r9 = r8.R()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "startSingleDeviceDetection() >>> device.isConnected = "
            r2.append(r6)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            com.harman.log.f.a(r3, r9)
            boolean r9 = r8.R()
            if (r9 != 0) goto L9a
            r0.f44622H = r7
            r0.f44623I = r8
            r0.f44626L = r5
            java.lang.Object r9 = r7.p(r8, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            r2 = r7
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L9b
            com.harman.jbl.partybox.ui.party.b r9 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r8 = r9.t(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "startSingleDeviceDetection() >>> cant connect with mainDev "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.a(r3, r8)
            r8 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r8)
            return r8
        L9a:
            r2 = r7
        L9b:
            r9 = 0
            r0.f44622H = r9
            r0.f44623I = r9
            r0.f44626L = r4
            java.lang.Object r9 = r2.o(r8, r0)
            if (r9 != r1) goto La9
            return r1
        La9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.v(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(4:10|11|12|13)(2:29|30))(9:31|(1:33)|34|35|36|37|38|39|(1:41)(1:42))|14|15|16|(1:18)(1:22)|19|20))|49|6|7|(0)(0)|14|15|16|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(@l3.d com.harman.sdk.device.HmDevice r18, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.ota.business.a.u(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }
}
