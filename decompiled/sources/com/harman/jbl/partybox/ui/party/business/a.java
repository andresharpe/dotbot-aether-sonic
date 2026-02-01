package com.harman.jbl.partybox.ui.party.business;

import B2.c;
import androidx.annotation.InterfaceC0561d;
import androidx.core.app.C0;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.PlayerStatus;
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
import kotlin.jvm.internal.U;
import kotlinx.coroutines.InterfaceC2333q;
import y2.InterfaceC2445a;

@U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,587:1\n314#2,11:588\n314#2,11:599\n314#2,11:610\n314#2,11:621\n314#2,11:632\n314#2,11:643\n314#2,11:654\n314#2,11:665\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business\n*L\n48#1:588,11\n97#1:599,11\n210#1:610,11\n305#1:621,11\n357#1:632,11\n416#1:643,11\n465#1:654,11\n548#1:665,11\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f44891a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f44892b = "Party.Business";

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0, 0, 0}, l = {192, com.harman.analytics.deviceAws.a.f37831n}, m = "changeAuracastStatus", n = {"this", "device", C0.f11537F0}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.harman.jbl.partybox.ui.party.business.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0394a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44893H;

        /* renamed from: I, reason: collision with root package name */
        Object f44894I;

        /* renamed from: J, reason: collision with root package name */
        Object f44895J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f44896K;

        /* renamed from: M, reason: collision with root package name */
        int f44898M;

        C0394a(kotlin.coroutines.c<? super C0394a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44896K = obj;
            this.f44898M |= Integer.MIN_VALUE;
            return a.this.d(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ com.harman.sdk.impl.connect.i f44899F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ c f44900G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.harman.sdk.impl.connect.i iVar, c cVar) {
            super(1);
            this.f44899F = iVar;
            this.f44900G = cVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            this.f44899F.d(this.f44900G);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$connectDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$connectDevice$2$listener$1\n*L\n68#1:588,4\n80#1:592,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC2445a.InterfaceC0551a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HmDevice f44901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.harman.sdk.impl.connect.i f44902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44903c;

        /* JADX WARN: Multi-variable type inference failed */
        c(HmDevice hmDevice, com.harman.sdk.impl.connect.i iVar, InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f44901a = hmDevice;
            this.f44902b = iVar;
            this.f44903c = interfaceC2333q;
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            String str;
            F.p(protocol, "protocol");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f44901a, hmDevice) || 2 != i4) {
                return;
            }
            this.f44902b.d(this);
            com.harman.jbl.partybox.ui.party.auracast.o oVar = com.harman.jbl.partybox.ui.party.auracast.o.f44854a;
            if (oVar.q(i4)) {
                str = "suc";
            } else {
                str = L1.a.f1625n3;
            }
            com.harman.log.f.d(a.f44892b, "connectDevice() >>> connect device " + str + " @[" + System.currentTimeMillis() + "]:\n" + bVar.t(this.f44901a));
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44903c;
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
            if (!bVar.o(this.f44901a, device)) {
                return;
            }
            com.harman.log.f.d(a.f44892b, "onStandbyDeviceBLEConnected() >>> connect suc. device:\n" + bVar.t(device));
            this.f44902b.d(this);
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44903c;
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
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0}, l = {com.harman.analytics.deviceAws.a.f37827j}, m = "connectDeviceWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44904H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44905I;

        /* renamed from: K, reason: collision with root package name */
        int f44907K;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44905I = obj;
            this.f44907K |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business$connectDeviceWithTimeout$connectResult$1$1", f = "Business.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44908I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44910K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f44910K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44908I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f44910K;
                this.f44908I = 1;
                obj = aVar.e(hmDevice, this);
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
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f44910K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0, 0, 1, 1}, l = {295, 588}, m = "groupSingleDevice", n = {"this", "device", "device", "controller"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class f extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44911H;

        /* renamed from: I, reason: collision with root package name */
        Object f44912I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f44913J;

        /* renamed from: L, reason: collision with root package name */
        int f44915L;

        f(kotlin.coroutines.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44913J = obj;
            this.f44915L |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$groupSingleDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$groupSingleDevice$2$listener$1\n*L\n323#1:588,4\n327#1:592,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class g implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44916a;

        /* renamed from: com.harman.jbl.partybox.ui.party.business.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0395a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44917a;

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
                f44917a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f44916a = interfaceC2333q;
        }

        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            if (MessageID.STEREO_FLOW != baseMessage.b()) {
                return;
            }
            int i4 = C0395a.f44917a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.d(a.f44892b, "groupSingleDevice.onStatusChanged() >>> timeout. MAC[" + hmDevice.n() + "]");
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
            com.harman.log.f.d(a.f44892b, "groupSingleDevice.onStatusChanged() >>> success. MAC[" + hmDevice.n() + "]");
            com.harman.jbl.partybox.ui.party.b bVar2 = com.harman.jbl.partybox.ui.party.b.f44881a;
            Boolean bool2 = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar2 = Result.f51807F;
                interfaceC2333q.x(Result.b(bool2));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44916a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44916a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0, 0, 1, 1}, l = {347, 588}, m = "groupSingleDeviceWithFeature", n = {"this", "device", "device", "controller"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class h extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44918H;

        /* renamed from: I, reason: collision with root package name */
        Object f44919I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f44920J;

        /* renamed from: L, reason: collision with root package name */
        int f44922L;

        h(kotlin.coroutines.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44920J = obj;
            this.f44922L |= Integer.MIN_VALUE;
            return a.this.i(null, this);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$groupSingleDeviceWithFeature$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n94#2,4:596\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$groupSingleDeviceWithFeature$2$listener$1\n*L\n381#1:588,4\n392#1:592,4\n396#1:596,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class i implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44923a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z2.e f44924b;

        /* renamed from: com.harman.jbl.partybox.ui.party.business.a$i$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0396a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44925a;

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
                f44925a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(InterfaceC2333q<? super Boolean> interfaceC2333q, z2.e eVar) {
            this.f44923a = interfaceC2333q;
            this.f44924b = eVar;
        }

        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            PartyBoxDevice partyBoxDevice;
            if (MessageID.DEVICE_FEATURE_INFO == baseMessage.b()) {
                if (hmDevice instanceof PartyBoxDevice) {
                    partyBoxDevice = (PartyBoxDevice) hmDevice;
                } else {
                    partyBoxDevice = null;
                }
                if (partyBoxDevice != null && partyBoxDevice.H1()) {
                    com.harman.log.f.d(a.f44892b, "groupSingleDevice() >>> request stereo flow to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
                    this.f44924b.D(hmDevice, AudioChannel.NONE_CHANNEL, PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING, "", null, this);
                    return;
                }
                com.harman.log.f.d(a.f44892b, "groupSingleDevice() >>> device not support Cross TWS " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
                Boolean bool = Boolean.FALSE;
                if (interfaceC2333q.c()) {
                    Result.a aVar = Result.f51807F;
                    interfaceC2333q.x(Result.b(bool));
                    return;
                }
                return;
            }
            if (MessageID.STEREO_FLOW != baseMessage.b()) {
                return;
            }
            int i4 = C0396a.f44925a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.d(a.f44892b, "groupSingleDevice.onStatusChanged() >>> timeout. MAC[" + hmDevice.n() + "]");
                    com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
                    Boolean bool2 = Boolean.FALSE;
                    if (interfaceC2333q.c()) {
                        Result.a aVar2 = Result.f51807F;
                        interfaceC2333q.x(Result.b(bool2));
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f44892b, "groupSingleDevice.onStatusChanged() >>> success. MAC[" + hmDevice.n() + "]");
            com.harman.jbl.partybox.ui.party.b bVar2 = com.harman.jbl.partybox.ui.party.b.f44881a;
            Boolean bool3 = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar3 = Result.f51807F;
                interfaceC2333q.x(Result.b(bool3));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44923a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44923a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ k f44926F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k kVar) {
            super(1);
            this.f44926F = kVar;
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
                k4.j(Jy, this.f44926F);
            }
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$scanDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$scanDevice$2$listener$1\n*L\n109#1:588,4\n118#1:592,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class k implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HmDevice f44927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44928b;

        /* JADX WARN: Multi-variable type inference failed */
        k(HmDevice hmDevice, InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f44927a = hmDevice;
            this.f44928b = interfaceC2333q;
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
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44928b;
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
            if (!bVar.o(this.f44927a, scannedDevice)) {
                return;
            }
            B2.c k4 = com.harman.sdk.b.f47608a.k();
            if (k4 != null) {
                Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                k4.j(Jy, this);
            }
            com.harman.log.f.d(a.f44892b, "scanDevice() >>> scan device suc @[" + System.currentTimeMillis() + "]:\n" + bVar.t(this.f44927a));
            InterfaceC2333q<Boolean> interfaceC2333q = this.f44928b;
            Boolean bool = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(bool));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0}, l = {152}, m = "scanDeviceWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class l extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44929H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f44930I;

        /* renamed from: K, reason: collision with root package name */
        int f44932K;

        l(kotlin.coroutines.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44930I = obj;
            this.f44932K |= Integer.MIN_VALUE;
            return a.this.k(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business$scanDeviceWithTimeout$scanResult$1$1", f = "Business.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class m extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44933I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f44935K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(HmDevice hmDevice, kotlin.coroutines.c<? super m> cVar) {
            super(2, cVar);
            this.f44935K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44933I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f44935K;
                this.f44933I = 1;
                obj = aVar.j(hmDevice, this);
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
            return ((m) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new m(this.f44935K, cVar);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$setAuracastStatus$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n94#2,4:596\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$setAuracastStatus$2$listener$1\n*L\n230#1:588,4\n234#1:592,4\n238#1:596,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class n implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44936a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AuracastStatus f44937b;

        /* renamed from: com.harman.jbl.partybox.ui.party.business.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0397a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44938a;

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
                f44938a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n(InterfaceC2333q<? super Boolean> interfaceC2333q, AuracastStatus auracastStatus) {
            this.f44936a = interfaceC2333q;
            this.f44937b = auracastStatus;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            int i4 = C0397a.f44938a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.g(a.f44892b, "setAuracastStatus.onStatusChanged() >>> timeout, fail to setting Auracast status[" + this.f44937b + "]. MAC[" + hmDevice.n() + "]");
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
            if (MessageID.AURACAST_STATUS != baseMessage.b()) {
                com.harman.log.f.g(a.f44892b, "setAuracastStatus.onStatusChanged() >>> msgId = " + baseMessage.b() + ", fail to setting Auracast status[" + this.f44937b + "]. MAC[" + hmDevice.n() + "]");
                com.harman.jbl.partybox.ui.party.b bVar2 = com.harman.jbl.partybox.ui.party.b.f44881a;
                Boolean bool2 = Boolean.FALSE;
                if (interfaceC2333q.c()) {
                    Result.a aVar2 = Result.f51807F;
                    interfaceC2333q.x(Result.b(bool2));
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f44892b, "setAuracastStatus.onStatusChanged() >>> success for setting Auracast status[" + this.f44937b + "]. MAC[" + hmDevice.n() + "]");
            com.harman.jbl.partybox.ui.party.b bVar3 = com.harman.jbl.partybox.ui.party.b.f44881a;
            Boolean bool3 = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar3 = Result.f51807F;
                interfaceC2333q.x(Result.b(bool3));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44936a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44936a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3}, l = {264, 270, 281, 285}, m = "startGrouping", n = {"this", "mainDevice", "coDevice", "startTs", "this", "mainDevice", "coDevice", "startTs", "this", "mainDevice", "coDevice", "mainDevice"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
    /* loaded from: classes2.dex */
    public static final class o extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44939H;

        /* renamed from: I, reason: collision with root package name */
        Object f44940I;

        /* renamed from: J, reason: collision with root package name */
        Object f44941J;

        /* renamed from: K, reason: collision with root package name */
        long f44942K;

        /* renamed from: L, reason: collision with root package name */
        /* synthetic */ Object f44943L;

        /* renamed from: N, reason: collision with root package name */
        int f44945N;

        o(kotlin.coroutines.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44943L = obj;
            this.f44945N |= Integer.MIN_VALUE;
            return a.this.m(null, null, false, this);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$unGroup$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n1#2:588\n94#3,4:589\n94#3,4:593\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$unGroup$2$listener$1\n*L\n504#1:589,4\n508#1:593,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class p implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44946a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HmDevice f44947b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HmDevice f44948c;

        /* renamed from: com.harman.jbl.partybox.ui.party.business.a$p$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0398a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44949a;

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
                f44949a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, HmDevice hmDevice2) {
            this.f44946a = interfaceC2333q;
            this.f44947b = hmDevice;
            this.f44948c = hmDevice2;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            String a4;
            if (MessageID.STEREO_FLOW != baseMessage.b()) {
                return;
            }
            int i4 = C0398a.f44949a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.g(a.f44892b, "unGroup.onStatusChanged() >>> timeout");
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
            com.harman.log.f.d(a.f44892b, "unGroup.onStatusChanged() >>> ungroup success");
            TWSInfo M3 = this.f44947b.M();
            if (M3 != null && (a4 = M3.a()) != null) {
                U1.a.l(a4);
            }
            D d4 = D.f45020a;
            d4.e(this.f44947b);
            com.harman.sdk.b bVar2 = com.harman.sdk.b.f47608a;
            com.harman.sdk.impl.connect.i c4 = bVar2.c(this.f44947b);
            if (c4 != null) {
                c4.h("", "");
            }
            HmDevice hmDevice2 = this.f44948c;
            if (hmDevice2 != null) {
                d4.e(hmDevice2);
                com.harman.sdk.impl.connect.i c5 = bVar2.c(this.f44948c);
                if (c5 != null) {
                    c5.h("", "");
                }
            }
            B2.c k4 = bVar2.k();
            if (k4 != null) {
                k4.d();
            }
            com.harman.jbl.partybox.ui.party.b bVar3 = com.harman.jbl.partybox.ui.party.b.f44881a;
            Boolean bool2 = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar2 = Result.f51807F;
                interfaceC2333q.x(Result.b(bool2));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44946a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44946a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.business.Business", f = "Business.kt", i = {0, 0, 0, 1, 1, 1}, l = {534, 588}, m = "updatePlayerStatus", n = {"this", "device", C0.f11537F0, "device", C0.f11537F0, "controller"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class q extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f44950H;

        /* renamed from: I, reason: collision with root package name */
        Object f44951I;

        /* renamed from: J, reason: collision with root package name */
        Object f44952J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f44953K;

        /* renamed from: M, reason: collision with root package name */
        int f44955M;

        q(kotlin.coroutines.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f44953K = obj;
            this.f44955M |= Integer.MIN_VALUE;
            return a.this.p(null, null, this);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$updatePlayerStatus$2$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$updatePlayerStatus$2$1\n*L\n569#1:588,4\n574#1:592,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class r implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<PlayerStatus> f44956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PlayerStatus f44957b;

        /* renamed from: com.harman.jbl.partybox.ui.party.business.a$r$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0399a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44958a;

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
                f44958a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        r(InterfaceC2333q<? super PlayerStatus> interfaceC2333q, PlayerStatus playerStatus) {
            this.f44956a = interfaceC2333q;
            this.f44957b = playerStatus;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super PlayerStatus> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            if (MessageID.PLAYER_INFO != baseMessage.b()) {
                return;
            }
            int i4 = C0399a.f44958a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.g(a.f44892b, "updatePlayerStatus.onStatusChanged() >>> timeout, fail to set play status[" + this.f44957b + "] to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
                    if (interfaceC2333q.c()) {
                        Result.a aVar = Result.f51807F;
                        interfaceC2333q.x(Result.b(null));
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f44892b, "updatePlayerStatus.onStatusChanged() >>> set play status[" + this.f44957b + "] success to device " + hmDevice.n());
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            PlayerStatus playerStatus = this.f44957b;
            if (interfaceC2333q.c()) {
                Result.a aVar2 = Result.f51807F;
                interfaceC2333q.x(Result.b(playerStatus));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44956a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44956a, device, code, msg);
        }
    }

    @U({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$waitConnectStatus$2$observer$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,587:1\n94#2,4:588\n94#2,4:592\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/harman/jbl/partybox/ui/party/business/Business$waitConnectStatus$2$observer$1\n*L\n439#1:588,4\n445#1:592,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class s implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f44959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z2.e f44960b;

        /* renamed from: com.harman.jbl.partybox.ui.party.business.a$s$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0400a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44961a;

            static {
                int[] iArr = new int[PartyConnectStatus.values().length];
                try {
                    iArr[PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PartyConnectStatus.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PartyConnectStatus.PARTY_CONNECT_OFF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PartyConnectStatus.PARTY_CONNECT_WIRED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f44961a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        s(InterfaceC2333q<? super Boolean> interfaceC2333q, z2.e eVar) {
            this.f44959a = interfaceC2333q;
            this.f44960b = eVar;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            PartyBoxDevice partyBoxDevice;
            PartyConnectStatus i12;
            if (MessageID.DEVICE_INFO != baseMessage.b()) {
                return;
            }
            Object a4 = baseMessage.a();
            if (a4 instanceof PartyBoxDevice) {
                partyBoxDevice = (PartyBoxDevice) a4;
            } else {
                partyBoxDevice = null;
            }
            if (partyBoxDevice != null && (i12 = partyBoxDevice.i1()) != null) {
                String f4 = i12.f();
                com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
                com.harman.log.f.d(a.f44892b, "waitConnectStatus.onStatusChanged() >>> status recv[" + f4 + "] from dev " + bVar.t(hmDevice));
                int i4 = C0400a.f44961a[i12.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        com.harman.log.f.b(a.f44892b, "waitConnectStatus.onStatusChanged() >>> TWS cant connect, msg from " + bVar.t(hmDevice));
                        this.f44960b.h(this);
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
                com.harman.log.f.d(a.f44892b, "waitConnectStatus.onStatusChanged() >>> TWS connected, msg from " + bVar.t(hmDevice));
                this.f44960b.h(this);
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
            c(this.f44959a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f44959a, device, code, msg);
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.harman.sdk.device.HmDevice r10, kotlin.coroutines.c<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.harman.jbl.partybox.ui.party.business.a.f
            if (r0 == 0) goto L13
            r0 = r11
            com.harman.jbl.partybox.ui.party.business.a$f r0 = (com.harman.jbl.partybox.ui.party.business.a.f) r0
            int r1 = r0.f44915L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44915L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.party.business.a$f r0 = new com.harman.jbl.partybox.ui.party.business.a$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f44913J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44915L
            r3 = 0
            r4 = 2
            java.lang.String r5 = "Party.Business"
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r10 = r0.f44912I
            z2.e r10 = (z2.e) r10
            java.lang.Object r10 = r0.f44911H
            com.harman.sdk.device.HmDevice r10 = (com.harman.sdk.device.HmDevice) r10
            kotlin.W.n(r11)
            goto Le7
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            java.lang.Object r10 = r0.f44912I
            com.harman.sdk.device.HmDevice r10 = (com.harman.sdk.device.HmDevice) r10
            java.lang.Object r2 = r0.f44911H
            com.harman.jbl.partybox.ui.party.business.a r2 = (com.harman.jbl.partybox.ui.party.business.a) r2
            kotlin.W.n(r11)
            goto L62
        L4c:
            kotlin.W.n(r11)
            boolean r11 = r10.R()
            if (r11 != 0) goto L89
            r0.f44911H = r9
            r0.f44912I = r10
            r0.f44915L = r6
            java.lang.Object r11 = r9.f(r10, r0)
            if (r11 != r1) goto L62
            return r1
        L62:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L89
            com.harman.jbl.partybox.ui.party.b r11 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r11.t(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "groupSingleDevice() >>> cant connect with mainDev "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.harman.log.f.b(r5, r10)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r10
        L89:
            com.harman.sdk.b r11 = com.harman.sdk.b.f47608a
            z2.e r2 = r11.e(r10)
            if (r2 != 0) goto L9b
            java.lang.String r10 = "groupSingleDevice() >>> cant get dev controller"
            com.harman.log.f.b(r5, r10)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r10
        L9b:
            r0.f44911H = r10
            r0.f44912I = r2
            r0.f44915L = r4
            kotlinx.coroutines.r r11 = new kotlinx.coroutines.r
            kotlin.coroutines.c r3 = kotlin.coroutines.intrinsics.a.e(r0)
            r11.<init>(r3, r6)
            r11.T()
            com.harman.jbl.partybox.ui.party.business.a$g r8 = new com.harman.jbl.partybox.ui.party.business.a$g
            r8.<init>(r11)
            com.harman.jbl.partybox.ui.party.b r3 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r3 = r3.t(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "groupSingleDevice() >>> request stereo flow to device "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.harman.log.f.d(r5, r3)
            com.harman.sdk.utils.AudioChannel r4 = com.harman.sdk.utils.AudioChannel.NONE_CHANNEL
            com.harman.sdk.utils.PartyConnectStatus r5 = com.harman.sdk.utils.PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING
            java.lang.String r6 = ""
            r7 = 0
            r3 = r10
            r2.D(r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = r11.z()
            java.lang.Object r10 = kotlin.coroutines.intrinsics.a.l()
            if (r11 != r10) goto Le4
            kotlin.coroutines.jvm.internal.f.c(r0)
        Le4:
            if (r11 != r1) goto Le7
            return r1
        Le7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.h(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.harman.sdk.device.HmDevice r9, kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.party.business.a.h
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.party.business.a$h r0 = (com.harman.jbl.partybox.ui.party.business.a.h) r0
            int r1 = r0.f44922L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44922L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.party.business.a$h r0 = new com.harman.jbl.partybox.ui.party.business.a$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f44920J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44922L
            r3 = 0
            r4 = 2
            java.lang.String r5 = "Party.Business"
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r9 = r0.f44919I
            z2.e r9 = (z2.e) r9
            java.lang.Object r9 = r0.f44918H
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            kotlin.W.n(r10)
            goto Ldf
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r0.f44919I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r2 = r0.f44918H
            com.harman.jbl.partybox.ui.party.business.a r2 = (com.harman.jbl.partybox.ui.party.business.a) r2
            kotlin.W.n(r10)
            goto L62
        L4c:
            kotlin.W.n(r10)
            boolean r10 = r9.R()
            if (r10 != 0) goto L89
            r0.f44918H = r8
            r0.f44919I = r9
            r0.f44922L = r6
            java.lang.Object r10 = r8.f(r9, r0)
            if (r10 != r1) goto L62
            return r1
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L89
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r9 = r10.t(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "groupSingleDevice() >>> cant connect with mainDev "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.harman.log.f.b(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        L89:
            com.harman.sdk.b r10 = com.harman.sdk.b.f47608a
            z2.e r10 = r10.e(r9)
            if (r10 != 0) goto L9b
            java.lang.String r9 = "groupSingleDevice() >>> cant get dev controller"
            com.harman.log.f.b(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        L9b:
            r0.f44918H = r9
            r0.f44919I = r10
            r0.f44922L = r4
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.c r3 = kotlin.coroutines.intrinsics.a.e(r0)
            r2.<init>(r3, r6)
            r2.T()
            com.harman.jbl.partybox.ui.party.business.a$i r3 = new com.harman.jbl.partybox.ui.party.business.a$i
            r3.<init>(r2, r10)
            com.harman.jbl.partybox.ui.party.b r4 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r4 = r4.t(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "groupSingleDevice() >>> request device feature info "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.harman.log.f.d(r5, r4)
            r10.a0(r9, r3)
            java.lang.Object r10 = r2.z()
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.l()
            if (r10 != r9) goto Ldc
            kotlin.coroutines.jvm.internal.f.c(r0)
        Ldc:
            if (r10 != r1) goto Ldf
            return r1
        Ldf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.i(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(HmDevice hmDevice, AuracastStatus auracastStatus, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        com.harman.log.f.d(f44892b, "setAuracastStatus() >>> ready to update status[" + auracastStatus + "] to device: " + bVar.t(hmDevice));
        z2.e e5 = com.harman.sdk.b.f47608a.e(hmDevice);
        if (e5 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
            rVar.T();
            e5.u0(hmDevice, auracastStatus, new n(rVar, auracastStatus));
            com.harman.log.f.d(f44892b, "setAuracastStatus() >>> send AURACAST_STATUS CMD status[" + auracastStatus + "] to device " + bVar.t(hmDevice));
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.g(f44892b, "setAuracastStatus() >>> fail to get controller");
        return kotlin.coroutines.jvm.internal.a.a(false);
    }

    public static /* synthetic */ Object n(a aVar, HmDevice hmDevice, HmDevice hmDevice2, boolean z3, kotlin.coroutines.c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return aVar.m(hmDevice, hmDevice2, z3, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@l3.d com.harman.sdk.device.HmDevice r10, @l3.d com.harman.sdk.utils.AuracastStatus r11, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.d(com.harman.sdk.device.HmDevice, com.harman.sdk.utils.AuracastStatus, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final Object e(@l3.d HmDevice hmDevice, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(hmDevice);
        if (c4 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
            rVar.T();
            c cVar2 = new c(hmDevice, c4, rVar);
            rVar.u(new b(c4, cVar2));
            com.harman.log.f.d(f44892b, "connectDevice() >>> try to connect device.MAC[" + hmDevice.n() + "] ble.addr[" + hmDevice.g() + "]");
            c4.c(cVar2);
            c4.j(hmDevice);
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.g(f44892b, "connectDevice() >>> fail to get controller for \n" + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
        return kotlin.coroutines.jvm.internal.a.a(false);
    }

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
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@l3.d com.harman.sdk.device.HmDevice r8, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.party.business.a.d
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.party.business.a$d r0 = (com.harman.jbl.partybox.ui.party.business.a.d) r0
            int r1 = r0.f44907K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44907K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.party.business.a$d r0 = new com.harman.jbl.partybox.ui.party.business.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44905I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44907K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f44904H
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
            com.harman.jbl.partybox.ui.party.business.a$e r9 = new com.harman.jbl.partybox.ui.party.business.a$e     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r0.f44904H = r8     // Catch: java.lang.Throwable -> L2e
            r0.f44907K = r4     // Catch: java.lang.Throwable -> L2e
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
            java.lang.String r2 = "Party.Business"
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
            com.harman.log.f.b(r2, r8)
            r4 = 0
        Lbc:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.f(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    public final void g(@l3.d HmDevice targetDevice) {
        F.p(targetDevice, "targetDevice");
        if (!targetDevice.R()) {
            com.harman.log.f.a(f44892b, "disconnectDevice() >>> already in disconnect state");
            return;
        }
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(targetDevice);
        if (c4 == null) {
            com.harman.log.f.g(f44892b, "disconnectDevice() >>> fail to get controller");
            return;
        }
        c4.k(targetDevice);
        com.harman.log.f.d(f44892b, "disconnectDevice() >>> send disconnect cmd to device:\n" + com.harman.jbl.partybox.ui.party.b.f44881a.t(targetDevice));
    }

    @l3.e
    public final Object j(@l3.d HmDevice hmDevice, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        List Jy;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        k kVar = new k(hmDevice, rVar);
        rVar.u(new j(kVar));
        com.harman.log.f.d(f44892b, "scanDevice() >>> try to scan device.MAC[" + hmDevice.n() + "] ble.addr[" + hmDevice.g() + "]");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null) {
            Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
            k4.g(Jy, kVar, null);
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

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
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(@l3.d com.harman.sdk.device.HmDevice r8, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.party.business.a.l
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.party.business.a$l r0 = (com.harman.jbl.partybox.ui.party.business.a.l) r0
            int r1 = r0.f44932K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44932K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.party.business.a$l r0 = new com.harman.jbl.partybox.ui.party.business.a$l
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f44930I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f44932K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f44929H
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
            com.harman.jbl.partybox.ui.party.business.a$m r9 = new com.harman.jbl.partybox.ui.party.business.a$m     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r0.f44929H = r8     // Catch: java.lang.Throwable -> L2e
            r0.f44932K = r4     // Catch: java.lang.Throwable -> L2e
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
            java.lang.String r2 = "Party.Business"
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
            com.harman.log.f.b(r2, r8)
            r4 = 0
        Lbc:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.k(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@l3.d com.harman.sdk.device.HmDevice r21, @l3.d com.harman.sdk.device.HmDevice r22, boolean r23, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.m(com.harman.sdk.device.HmDevice, com.harman.sdk.device.HmDevice, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @InterfaceC0561d
    @l3.e
    public final Object o(@l3.d HmDevice hmDevice, @l3.e HmDevice hmDevice2, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        String str;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        p pVar = new p(rVar, hmDevice, hmDevice2);
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        String t3 = bVar.t(hmDevice);
        if (hmDevice2 != null) {
            str = bVar.t(hmDevice2);
        } else {
            str = null;
        }
        com.harman.log.f.d(f44892b, "unGroup() >>> req unGroup TWS group. main[" + t3 + "] co[" + str + "]");
        z2.e e5 = com.harman.sdk.b.f47608a.e(hmDevice);
        if (e5 != null) {
            e5.D(hmDevice, AudioChannel.NONE_CHANNEL, PartyConnectStatus.PARTY_CONNECT_OFF, "", null, pVar);
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(@l3.d com.harman.sdk.device.HmDevice r9, @l3.d com.harman.sdk.utils.PlayerStatus r10, @l3.d kotlin.coroutines.c<? super com.harman.sdk.utils.PlayerStatus> r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.business.a.p(com.harman.sdk.device.HmDevice, com.harman.sdk.utils.PlayerStatus, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final Object q(@l3.d HmDevice hmDevice, @l3.d HmDevice hmDevice2, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        z2.e e5 = com.harman.sdk.b.f47608a.e(hmDevice);
        if (e5 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
            rVar.T();
            e5.m(new s(rVar, e5));
            com.harman.log.f.d(f44892b, "waitConnectStatus() >>> start observing main DevInfo msg");
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.b(f44892b, "waitConnectStatus() >>> fail to get mainDev controller");
        return kotlin.coroutines.jvm.internal.a.a(false);
    }
}
