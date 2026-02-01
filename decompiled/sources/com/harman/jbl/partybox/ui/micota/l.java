package com.harman.jbl.partybox.ui.micota;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask;
import com.harman.sdk.command.MicOTACommand;
import com.harman.sdk.command.MicOTAResultCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.ota.RemoteOTAConfig;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.W;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.X;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2323l;

@U({"SMAP\nMicOTAViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicOTAViewModel.kt\ncom/harman/jbl/partybox/ui/micota/MicOTAViewModel\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n453#2:163\n403#2:164\n1238#3,4:165\n*S KotlinDebug\n*F\n+ 1 MicOTAViewModel.kt\ncom/harman/jbl/partybox/ui/micota/MicOTAViewModel\n*L\n108#1:163\n108#1:164\n108#1:165,4\n*E\n"})
/* loaded from: classes2.dex */
public final class l extends com.harman.jbl.partybox.c {

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    public static final a f44297S = new a(null);

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private static final String f44298T = "MicOTAViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44299P = new P<>();

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final P<MicOTAResultCommand> f44300Q = new P<>();

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final z2.d f44301R = new b();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements z2.d {
        b() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            l.this.i0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            l.this.i0(device, code, msg);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.micota.MicOTAViewModel$reqCancelMicOTA$1", f = "MicOTAViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44303I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f44304J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ l f44305K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice, l lVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f44304J = hmDevice;
            this.f44305K = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f44303I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f44304J;
                l lVar = this.f44305K;
                com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
                com.harman.sdk.impl.connect.i c4 = bVar.c(hmDevice);
                if (c4 != null) {
                    c4.y(lVar.f44301R);
                }
                com.harman.sdk.impl.connect.i c5 = bVar.c(hmDevice);
                if (c5 != null) {
                    c5.G(hmDevice, new MicOTACommand(false), lVar.f44301R);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return new c(this.f44304J, this.f44305K, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.micota.MicOTAViewModel$reqStartMicOTA$1", f = "MicOTAViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44306I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f44307J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ l f44308K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, l lVar, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f44307J = hmDevice;
            this.f44308K = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f44306I == 0) {
                W.n(obj);
                HmDevice hmDevice = this.f44307J;
                l lVar = this.f44308K;
                com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(hmDevice);
                if (c4 != null) {
                    c4.G(hmDevice, new MicOTACommand(true), lVar.f44301R);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f44307J, this.f44308K, cVar);
        }
    }

    private final void Z(String str, final PartyBoxDevice partyBoxDevice, final X2.l<? super Map<String, RemoteOTAConfig.WhatsNewItem>, H0> lVar) {
        com.harman.log.f.d(f44298T, "checkOTAByJsonConfig() >>> start OtaUpdateAsyncTask for device[" + partyBoxDevice.n() + "]");
        new MicOtaUpdateAsyncTask(str, partyBoxDevice.q(), "3.12.20", partyBoxDevice.w(), new com.harman.jbl.partybox.firmware.c() { // from class: com.harman.jbl.partybox.ui.micota.k
            @Override // com.harman.jbl.partybox.firmware.c
            public final void a(com.harman.jbl.partybox.firmware.g gVar) {
                l.b0(l.this, partyBoxDevice, lVar, gVar);
            }
        }).execute(new Void[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a0(l lVar, String str, PartyBoxDevice partyBoxDevice, X2.l lVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            lVar2 = null;
        }
        lVar.Z(str, partyBoxDevice, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(l this$0, PartyBoxDevice device, X2.l lVar, com.harman.jbl.partybox.firmware.g gVar) {
        int j4;
        RemoteOTAConfig remoteOTAConfig;
        F.p(this$0, "this$0");
        F.p(device, "$device");
        com.harman.log.f.d(f44298T, "checkOTAByJsonConfig() >>> on ota json fetch and parse suc.");
        F.m(gVar);
        this$0.h0(device, gVar);
        Map<String, com.harman.jbl.partybox.firmware.h> a4 = gVar.a();
        if (a4 != null) {
            j4 = X.j(a4.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
            Iterator<T> it = a4.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                com.harman.jbl.partybox.firmware.h hVar = (com.harman.jbl.partybox.firmware.h) entry.getValue();
                RemoteOTAConfig.WhatsNewItem whatsNewItem = new RemoteOTAConfig.WhatsNewItem();
                whatsNewItem.e(hVar.f());
                List<String> e4 = hVar.e();
                if (e4 == null) {
                    e4 = CollectionsKt__CollectionsKt.H();
                }
                whatsNewItem.d(e4);
                linkedHashMap.put(key, whatsNewItem);
            }
            WirelessMicInfo v12 = device.v1();
            if (v12 != null) {
                remoteOTAConfig = v12.n();
            } else {
                remoteOTAConfig = null;
            }
            if (remoteOTAConfig != null) {
                remoteOTAConfig.s(linkedHashMap);
            }
            com.harman.log.f.d(f44298T, "checkOTAByJsonConfig() >>> whatsNew updated:\n" + linkedHashMap);
            if (lVar != null) {
                lVar.C(linkedHashMap);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d0(l lVar, PartyBoxDevice partyBoxDevice, X2.l lVar2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar2 = null;
        }
        lVar.c0(partyBoxDevice, lVar2);
    }

    private final void h0(PartyBoxDevice partyBoxDevice, com.harman.jbl.partybox.firmware.g gVar) {
        try {
            RemoteOTAConfig remoteOTAConfig = new RemoteOTAConfig();
            remoteOTAConfig.r(gVar.f40546b);
            WirelessMicInfo v12 = partyBoxDevice.v1();
            if (v12 != null) {
                v12.A(remoteOTAConfig);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        T1.a.a("MicOTAViewModel, micOTAUpdate observer called, msg = " + baseMessage + ", code = " + statusCode + ", device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            if (baseMessage.b() == MessageID.RET_OPTION_MIC_OTA_RESULT) {
                T(this.f44299P, Boolean.TRUE);
                return;
            }
            if (baseMessage.b() == MessageID.RET_MIC_OTA_RESULT) {
                Object a4 = baseMessage.a();
                if ((a4 instanceof MicOTAResultCommand) && ((MicOTAResultCommand) a4).z() != 0) {
                    T(this.f44300Q, a4);
                }
            }
        }
    }

    public final void Y(@l3.e HmDevice hmDevice) {
        com.harman.sdk.impl.connect.i c4;
        this.f38311M = hmDevice;
        if (hmDevice != null && (c4 = com.harman.sdk.b.f47608a.c(hmDevice)) != null) {
            c4.y(this.f44301R);
        }
    }

    public final void c0(@l3.d PartyBoxDevice device, @l3.e X2.l<? super Map<String, RemoteOTAConfig.WhatsNewItem>, H0> lVar) {
        String b4;
        F.p(device, "device");
        WirelessMicInfo v12 = device.v1();
        if (v12 != null && (b4 = v12.b()) != null) {
            Z(b4, device, lVar);
        }
    }

    @l3.d
    public final String e0(@l3.d String language, @l3.d Map<String, RemoteOTAConfig.WhatsNewItem> whatsNewUpdateMap) {
        F.p(language, "language");
        F.p(whatsNewUpdateMap, "whatsNewUpdateMap");
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
        F.o(sb2, "toString(...)");
        return sb2;
    }

    @l3.d
    public final LiveData<MicOTAResultCommand> f0() {
        return this.f44300Q;
    }

    @l3.d
    public final LiveData<Boolean> g0() {
        return this.f44299P;
    }

    public final void j0(@l3.d HmDevice device) {
        F.p(device, "device");
        C2323l.f(k0.a(this), null, null, new c(device, this, null), 3, null);
    }

    public final void k0(@l3.d HmDevice device) {
        F.p(device, "device");
        C2323l.f(k0.a(this), null, null, new d(device, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        z2.e e4;
        super.s();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f44301R);
        }
    }
}
