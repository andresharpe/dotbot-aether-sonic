package com.harman.jbl.partybox.ui.party.stereo.state.channel;

import androidx.annotation.j0;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.StatusCode;
import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.r;
import l3.d;
import l3.e;
import z2.n;

@U({"SMAP\nStereoWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoWorker.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/channel/StereoWorker\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,74:1\n314#2,9:75\n323#2,2:88\n94#3,4:84\n*S KotlinDebug\n*F\n+ 1 StereoWorker.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/channel/StereoWorker\n*L\n29#1:75,9\n29#1:88,2\n32#1:84,4\n*E\n"})
/* loaded from: classes2.dex */
public final class b extends com.harman.jbl.partybox.ui.party.stereo.state.channel.a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f45280a = new b();

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final String f45281b = "Stereo.Worker";

    @U({"SMAP\nStereoWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoWorker.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/channel/StereoWorker$swipeDevices$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,74:1\n94#2,4:75\n*S KotlinDebug\n*F\n+ 1 StereoWorker.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/channel/StereoWorker$swipeDevices$2$listener$1\n*L\n60#1:75,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f45282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HmDevice f45283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f45284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AudioChannel f45285d;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, n nVar, AudioChannel audioChannel) {
            this.f45282a = interfaceC2333q;
            this.f45283b = hmDevice;
            this.f45284c = nVar;
            this.f45285d = audioChannel;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @androidx.annotation.InterfaceC0561d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void c(kotlinx.coroutines.InterfaceC2333q<? super java.lang.Boolean> r6, com.harman.sdk.device.HmDevice r7, com.harman.sdk.utils.StatusCode r8, com.harman.sdk.message.BaseMessage r9) {
            /*
                r5 = this;
                com.harman.jbl.partybox.ui.party.b r0 = com.harman.jbl.partybox.ui.party.b.f44881a
                com.harman.sdk.device.HmDevice r1 = r5.f45283b
                boolean r0 = r0.o(r1, r7)
                java.lang.String r1 = "]"
                java.lang.String r2 = "Stereo.Worker"
                if (r0 == 0) goto L8d
                com.harman.sdk.utils.MessageID r0 = com.harman.sdk.utils.MessageID.DEVICE_INFO
                com.harman.sdk.utils.MessageID r3 = r9.b()
                if (r0 != r3) goto L8d
                z2.n r0 = r5.f45284c
                r0.h(r5)
                java.lang.Object r9 = r9.a()
                boolean r0 = r9 instanceof com.harman.sdk.device.PartyBoxDevice
                r3 = 0
                if (r0 == 0) goto L27
                com.harman.sdk.device.PartyBoxDevice r9 = (com.harman.sdk.device.PartyBoxDevice) r9
                goto L28
            L27:
                r9 = r3
            L28:
                com.harman.sdk.utils.StatusCode r0 = com.harman.sdk.utils.StatusCode.STATUS_SUCCESS
                if (r0 != r8) goto L3a
                com.harman.sdk.utils.AudioChannel r0 = r5.f45285d
                if (r9 == 0) goto L35
                com.harman.sdk.utils.AudioChannel r4 = r9.i()
                goto L36
            L35:
                r4 = r3
            L36:
                if (r0 != r4) goto L3a
                r0 = 1
                goto L3b
            L3a:
                r0 = 0
            L3b:
                java.lang.String r8 = r8.e()
                if (r9 == 0) goto L4b
                com.harman.sdk.utils.AudioChannel r9 = r9.i()
                if (r9 == 0) goto L4b
                java.lang.String r3 = r9.f()
            L4b:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r4 = "swipeDevices.onStatusChanged() >>> success["
                r9.append(r4)
                r9.append(r0)
                java.lang.String r4 = "] code["
                r9.append(r4)
                r9.append(r8)
                java.lang.String r8 = "] rsp channel["
                r9.append(r8)
                r9.append(r3)
                r9.append(r1)
                java.lang.String r8 = r9.toString()
                com.harman.log.f.d(r2, r8)
                if (r0 == 0) goto L79
                com.harman.sdk.utils.AudioChannel r8 = r5.f45285d
                r7.e0(r8)
            L79:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                boolean r8 = r6.c()
                if (r8 == 0) goto La8
                kotlin.Result$a r8 = kotlin.Result.f51807F
                java.lang.Object r7 = kotlin.Result.b(r7)
                r6.x(r7)
                goto La8
            L8d:
                com.harman.sdk.utils.MessageID r6 = r9.b()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "swipeDevices.onStatusChanged() >>> no care msg.id["
                r7.append(r8)
                r7.append(r6)
                r7.append(r1)
                java.lang.String r6 = r7.toString()
                com.harman.log.f.a(r2, r6)
            La8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.state.channel.b.a.c(kotlinx.coroutines.q, com.harman.sdk.device.HmDevice, com.harman.sdk.utils.StatusCode, com.harman.sdk.message.BaseMessage):void");
        }

        @Override // z2.d
        public void a(@d HmDevice device, @d StatusCode code, @d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45282a, device, code, msg);
        }

        @Override // z2.d
        public void b(@d HmDevice device, @d StatusCode code, @d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45282a, device, code, msg);
        }
    }

    private b() {
        super(null);
    }

    @e
    @j0
    public final Object a(@d HmDevice hmDevice, @d AudioChannel audioChannel, @d c<? super Boolean> cVar) {
        c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        n n4 = com.harman.sdk.b.f47608a.n(hmDevice);
        if (n4 == null) {
            f.b(f45281b, "swipeDevices() >>> fail to get TWS controller");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            Boolean a4 = kotlin.coroutines.jvm.internal.a.a(false);
            if (rVar.c()) {
                Result.a aVar = Result.f51807F;
                rVar.x(Result.b(a4));
            }
        } else {
            n4.m(new a(rVar, hmDevice, n4, audioChannel));
            f.d(f45281b, "swipeDevices() >>> req set channel[" + audioChannel.f() + "] cmd to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
            n4.n0(hmDevice, audioChannel, null);
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }
}
