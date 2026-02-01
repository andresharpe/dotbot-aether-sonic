package com.harman.jbl.partybox.ui.party.stereo.state.create;

import X2.p;
import androidx.annotation.InterfaceC0561d;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.StatusCode;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.r;

@U({"SMAP\nStereoGroupingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoGroupingState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/StereoGroupingState\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,205:1\n314#2,11:206\n314#2,11:217\n*S KotlinDebug\n*F\n+ 1 StereoGroupingState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/StereoGroupingState\n*L\n114#1:206,11\n164#1:217,11\n*E\n"})
/* loaded from: classes2.dex */
public final class f extends com.harman.jbl.partybox.ui.party.stereo.state.create.e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final f f45292a = new f();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f45293b = "Party.Stereo.StereoGroupingState";

    @U({"SMAP\nStereoGroupingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoGroupingState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/StereoGroupingState$execStereoFlow$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,205:1\n94#2,4:206\n*S KotlinDebug\n*F\n+ 1 StereoGroupingState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/StereoGroupingState$execStereoFlow$listener$1\n*L\n143#1:206,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f45294a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f45294a = interfaceC2333q;
        }

        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            Integer num;
            boolean z3;
            if (MessageID.STEREO_FLOW == baseMessage.b()) {
                if (StatusCode.STATUS_SUCCESS == statusCode) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.harman.log.f.d(f.f45293b, "execStereoFlow.onStatusChanged() >>> success[" + z3 + "] code[" + statusCode.e() + "] msg.id[" + baseMessage.b() + "] device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
                Boolean valueOf = Boolean.valueOf(z3);
                if (interfaceC2333q.c()) {
                    Result.a aVar = Result.f51807F;
                    interfaceC2333q.x(Result.b(valueOf));
                    return;
                }
                return;
            }
            MessageID b4 = baseMessage.b();
            if (b4 != null) {
                num = Integer.valueOf(b4.g());
            } else {
                num = null;
            }
            com.harman.log.f.a(f.f45293b, "execStereoFlow.onStatusChanged() >>> code[" + statusCode + "] msg.id[" + num + "] device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45294a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45294a, device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.state.create.StereoGroupingState", f = "StereoGroupingState.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {a.b.f43494d, a.c.f43514g}, m = "groupSingleDevice", n = {"this", "device", "channel", "groupID", "groupName", "device", "channel", "groupID", "groupName", "mainController"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f45295H;

        /* renamed from: I, reason: collision with root package name */
        Object f45296I;

        /* renamed from: J, reason: collision with root package name */
        Object f45297J;

        /* renamed from: K, reason: collision with root package name */
        Object f45298K;

        /* renamed from: L, reason: collision with root package name */
        Object f45299L;

        /* renamed from: M, reason: collision with root package name */
        /* synthetic */ Object f45300M;

        /* renamed from: O, reason: collision with root package name */
        int f45302O;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f45300M = obj;
            this.f45302O |= Integer.MIN_VALUE;
            return f.this.d(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.state.create.StereoGroupingState", f = "StereoGroupingState.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {58, 66, 80, 89, 92}, m = "startGrouping", n = {"this", "mainChannel", "coChannel", "groupID", "groupName", "mainDevice", "coDevice", "this", "mainChannel", "coChannel", "groupID", "groupName", "mainDevice", "coDevice", "this", "mainChannel", "groupID", "groupName", "mainDevice", "coDevice", "startTs", "this", "mainChannel", "groupID", "groupName", "mainDevice"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f45303H;

        /* renamed from: I, reason: collision with root package name */
        Object f45304I;

        /* renamed from: J, reason: collision with root package name */
        Object f45305J;

        /* renamed from: K, reason: collision with root package name */
        Object f45306K;

        /* renamed from: L, reason: collision with root package name */
        Object f45307L;

        /* renamed from: M, reason: collision with root package name */
        Object f45308M;

        /* renamed from: N, reason: collision with root package name */
        Object f45309N;

        /* renamed from: O, reason: collision with root package name */
        long f45310O;

        /* renamed from: P, reason: collision with root package name */
        /* synthetic */ Object f45311P;

        /* renamed from: R, reason: collision with root package name */
        int f45313R;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f45311P = obj;
            this.f45313R |= Integer.MIN_VALUE;
            return f.this.e(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.state.create.StereoGroupingState$startGrouping$result$1$1", f = "StereoGroupingState.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45314I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45315J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f45315J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45314I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                HmDevice hmDevice = this.f45315J;
                HmDevice h4 = D.f45020a.h(hmDevice);
                this.f45314I = 1;
                obj = aVar.o(hmDevice, h4, this);
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
            return new d(this.f45315J, cVar);
        }
    }

    @U({"SMAP\nStereoGroupingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoGroupingState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/StereoGroupingState$waitConnectStatus$2$observer$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,205:1\n94#2,4:206\n*S KotlinDebug\n*F\n+ 1 StereoGroupingState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/StereoGroupingState$waitConnectStatus$2$observer$1\n*L\n188#1:206,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class e implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f45316a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HmDevice f45317b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z2.e f45318c;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45319a;

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
                f45319a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, z2.e eVar) {
            this.f45316a = interfaceC2333q;
            this.f45317b = hmDevice;
            this.f45318c = eVar;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            PartyBoxDevice partyBoxDevice;
            PartyConnectStatus i12;
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (bVar.o(hmDevice, this.f45317b) && MessageID.DEVICE_INFO == baseMessage.b()) {
                Object a4 = baseMessage.a();
                if (a4 instanceof PartyBoxDevice) {
                    partyBoxDevice = (PartyBoxDevice) a4;
                } else {
                    partyBoxDevice = null;
                }
                if (partyBoxDevice != null && (i12 = partyBoxDevice.i1()) != null) {
                    com.harman.log.f.d(f.f45293b, "onStatusChanged() >>> status recv[" + i12.f() + "] from dev " + bVar.t(hmDevice));
                    if (a.f45319a[i12.ordinal()] == 1) {
                        com.harman.log.f.d(f.f45293b, "onStatusChanged() >>> TWS connected, msg from " + bVar.t(hmDevice));
                        this.f45318c.h(this);
                        Boolean bool = Boolean.TRUE;
                        if (interfaceC2333q.c()) {
                            Result.a aVar = Result.f51807F;
                            interfaceC2333q.x(Result.b(bool));
                        }
                    }
                }
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45316a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45316a, device, code, msg);
        }
    }

    private f() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(z2.e eVar, InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, AudioChannel audioChannel, String str, String str2) {
        a aVar = new a(interfaceC2333q);
        com.harman.log.f.d(f45293b, "execStereoFlow() >>> request stereo flow to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
        eVar.D(hmDevice, audioChannel, PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING, str, str2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.harman.sdk.device.HmDevice r20, com.harman.sdk.utils.AudioChannel r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.c<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.state.create.f.d(com.harman.sdk.device.HmDevice, com.harman.sdk.utils.AudioChannel, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(1:(1:(1:(1:(1:(3:13|14|(2:16|17)(2:19|20))(2:21|22))(6:23|24|25|(1:27)|14|(0)(0)))(3:28|29|(4:31|(1:33)|34|35)(6:36|(1:38)|39|(1:41)|42|(2:44|(1:46)(6:47|24|25|(0)|14|(0)(0)))(5:48|25|(0)|14|(0)(0)))))(6:49|50|51|(1:53)|54|(1:56)(3:57|29|(0)(0))))(4:58|59|60|61))(2:89|(12:92|93|94|95|96|97|98|99|100|101|102|(1:104)(1:105))(5:91|51|(0)|54|(0)(0)))|62|63|64|65|(4:67|(1:69)(1:76)|70|(2:72|(1:74)(6:75|50|51|(0)|54|(0)(0))))|77|(1:79)(1:82)|80|81))|118|6|(0)(0)|62|63|64|65|(0)|77|(0)(0)|80|81|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@l3.d com.harman.sdk.device.HmDevice r20, @l3.d com.harman.sdk.utils.AudioChannel r21, @l3.d com.harman.sdk.device.HmDevice r22, @l3.d com.harman.sdk.utils.AudioChannel r23, @l3.d java.lang.String r24, @l3.d java.lang.String r25, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r26) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.state.create.f.e(com.harman.sdk.device.HmDevice, com.harman.sdk.utils.AudioChannel, com.harman.sdk.device.HmDevice, com.harman.sdk.utils.AudioChannel, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final Object f(@l3.d HmDevice hmDevice, @l3.d HmDevice hmDevice2, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        z2.e e5 = com.harman.sdk.b.f47608a.e(hmDevice);
        if (e5 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e4, 1);
            rVar.T();
            e5.m(new e(rVar, hmDevice, e5));
            com.harman.log.f.d(f45293b, "waitConnectStatus() >>> start observing main DevInfo msg");
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.b(f45293b, "waitConnectStatus() >>> fail to get mainDev controller");
        return kotlin.coroutines.jvm.internal.a.a(false);
    }
}
