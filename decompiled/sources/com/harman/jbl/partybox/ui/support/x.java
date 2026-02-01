package com.harman.jbl.partybox.ui.support;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.harman.sdk.command.ReqBatteryStatusCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.List;
import java.util.Map;
import kotlin.H0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class x extends j0 {

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    public static final a f45635V = new a(null);

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    public static final String f45636W = "SupportViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f45637H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f45638I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<H0> f45639J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f45640K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final P<H0> f45641L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f45642M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private final P<WirelessMicInfo> f45643N;

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private final LiveData<WirelessMicInfo> f45644O;

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<H0> f45645P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f45646Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final P<H0> f45647R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f45648S;

    /* renamed from: T, reason: collision with root package name */
    @l3.e
    private HmDevice f45649T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final z2.d f45650U;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45651a;

        static {
            int[] iArr = new int[MessageID.values().length];
            try {
                iArr[MessageID.FEEDBACK_TONE_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageID.BATTERY_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageID.RET_LE_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageID.RET_MIC_CONNECTION_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageID.DEVICE_FEATURE_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageID.DEVICE_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f45651a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements z2.d {
        c() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            com.harman.log.f.a(x.f45636W, "onRead Message " + msg);
            x.this.G(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            com.harman.log.f.a(x.f45636W, "onChanged Message " + msg);
            x.this.G(device, code, msg);
        }
    }

    public x() {
        P<Boolean> p4 = new P<>();
        this.f45637H = p4;
        this.f45638I = p4;
        P<H0> p5 = new P<>();
        this.f45639J = p5;
        this.f45640K = p5;
        P<H0> p6 = new P<>();
        this.f45641L = p6;
        this.f45642M = p6;
        P<WirelessMicInfo> p7 = new P<>();
        this.f45643N = p7;
        this.f45644O = p7;
        P<H0> p8 = new P<>();
        this.f45645P = p8;
        this.f45646Q = p8;
        P<H0> p9 = new P<>();
        this.f45647R = p9;
        this.f45648S = p9;
        this.f45650U = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        int i4;
        Map<Integer, Integer> map;
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            MessageID b4 = baseMessage.b();
            if (b4 == null) {
                i4 = -1;
            } else {
                i4 = b.f45651a[b4.ordinal()];
            }
            switch (i4) {
                case 1:
                    com.harman.log.f.a(f45636W, "Received FEEDBACK_TONE_STATUS, msg = " + baseMessage + " device = " + ((int) hmDevice.v()));
                    com.harman.jbl.partybox.h.f40556a.b(this.f45645P, H0.f51801a);
                    return;
                case 2:
                    BatteryInfo f4 = hmDevice.f();
                    if (f4 != null) {
                        map = f4.b();
                    } else {
                        map = null;
                    }
                    com.harman.log.f.a(f45636W, "Received BATTERY_STATUS, msg = " + baseMessage + " device = " + map);
                    com.harman.jbl.partybox.h.f40556a.b(this.f45637H, Boolean.TRUE);
                    return;
                case 3:
                    com.harman.log.f.a(f45636W, "Received RET_LE_AUDIO, msg = " + baseMessage + " device = " + partyBoxDevice.Z0());
                    com.harman.jbl.partybox.h.f40556a.b(this.f45639J, H0.f51801a);
                    return;
                case 4:
                    com.harman.log.f.a(f45636W, "Received RET_MIC_CONNECTION_INFO, msg = " + baseMessage + " device = " + hmDevice);
                    WirelessMicInfo v12 = partyBoxDevice.v1();
                    if (v12 != null) {
                        com.harman.jbl.partybox.h.f40556a.b(this.f45643N, v12);
                        return;
                    }
                    return;
                case 5:
                    com.harman.log.f.a(f45636W, "Received DEVICE_FEATURE_INFO , msg = " + baseMessage + " device = " + hmDevice.J());
                    com.harman.jbl.partybox.h.f40556a.b(this.f45647R, H0.f51801a);
                    return;
                case 6:
                    com.harman.log.f.a(f45636W, "Received DEVICE_INFO , msg = " + baseMessage + " device = " + partyBoxDevice.b1());
                    com.harman.jbl.partybox.h.f40556a.b(this.f45641L, H0.f51801a);
                    return;
                default:
                    return;
            }
        }
    }

    public final void A(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.log.f.a(f45636W, "getFeedbackToneData device = " + device.n());
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.R(device, null);
        }
    }

    @l3.d
    public final LiveData<H0> B() {
        return this.f45646Q;
    }

    public final void C(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.log.f.a(f45636W, "getLEAudioStatus device = " + device.n());
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.c0(device, null);
        }
    }

    @l3.d
    public final LiveData<H0> D() {
        return this.f45640K;
    }

    @l3.d
    public final LiveData<H0> E() {
        return this.f45642M;
    }

    @l3.d
    public final LiveData<WirelessMicInfo> F() {
        return this.f45644O;
    }

    public final void H(@l3.e HmDevice hmDevice) {
        this.f45649T = hmDevice;
    }

    public final void I(@l3.d HmDevice device, int i4) {
        F.p(device, "device");
        com.harman.log.f.a(f45636W, "setFeedbackToneStatus device = " + device.n() + ", status = " + i4);
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.l0(device, (byte) i4, null);
        }
    }

    public final void J(@l3.d PartyBoxDevice device, int i4) {
        F.p(device, "device");
        com.harman.log.f.a(f45636W, "setLEAudioStatus device = " + device.n() + ", audioStatus = " + i4);
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.k(device, i4, null);
        }
    }

    public final void K(@l3.d HmDevice device, boolean z3) {
        F.p(device, "device");
        com.harman.log.f.a(f45636W, "setLockPanelStatus device = " + device.n() + ", status = " + z3);
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.A0(device, z3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        z2.e e4;
        super.s();
        HmDevice hmDevice = this.f45649T;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f45650U);
        }
    }

    public final void v(@l3.e HmDevice hmDevice) {
        com.harman.sdk.impl.connect.i c4;
        this.f45649T = hmDevice;
        if (hmDevice != null && (c4 = com.harman.sdk.b.f47608a.c(hmDevice)) != null) {
            c4.y(this.f45650U);
        }
    }

    @l3.d
    public final LiveData<Boolean> w() {
        return this.f45638I;
    }

    public final void x(@l3.d HmDevice device) {
        List O3;
        F.p(device, "device");
        com.harman.log.f.a(f45636W, "getBatteryUsage device = " + device.n());
        O3 = CollectionsKt__CollectionsKt.O(BatteryInfo.FeatureType.TOTAL_POWER_ON_DURATION, BatteryInfo.FeatureType.TOTAL_PLAYBACK_TIME_DURATION);
        z2.e e4 = com.harman.sdk.b.f47608a.e(device);
        if (e4 != null) {
            e4.q0(device, new ReqBatteryStatusCommand(O3), this.f45650U);
        }
    }

    @l3.e
    public final HmDevice y() {
        return this.f45649T;
    }

    @l3.d
    public final LiveData<H0> z() {
        return this.f45648S;
    }
}
