package com.harman.jbl.partybox.ui.main;

import B2.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.C0909k;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.google.gson.GsonBuilder;
import com.harman.analytics.deviceAws.DeviceAnalytics;
import com.harman.analytics.deviceAws.PlayAnalytics;
import com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.device.PartyLightDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.KaraokeMicEQInfo;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.ota.RemoteOTAConfig;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.StatusCode;
import f2.C2054a;
import jar.model.RequestPayloadDataDeviceAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.Pair;
import kotlin.W;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.X;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2323l;
import y2.InterfaceC2445a;

@U({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/harman/jbl/partybox/ui/main/MainViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2805:1\n766#2:2806\n857#2,2:2807\n766#2:2810\n857#2,2:2811\n766#2:2813\n857#2,2:2814\n766#2:2816\n857#2,2:2817\n288#2,2:2821\n766#2:2823\n857#2,2:2824\n1855#2,2:2826\n1549#2:2828\n1620#2,3:2829\n1238#2,4:2834\n1#3:2809\n215#4,2:2819\n453#5:2832\n403#5:2833\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/harman/jbl/partybox/ui/main/MainViewModel\n*L\n731#1:2806\n731#1:2807,2\n1336#1:2810\n1336#1:2811,2\n1428#1:2813\n1428#1:2814,2\n1441#1:2816\n1441#1:2817,2\n1501#1:2821,2\n1518#1:2823\n1518#1:2824,2\n2539#1:2826,2\n2560#1:2828\n2560#1:2829,3\n2787#1:2834,4\n1466#1:2819,2\n2787#1:2832\n2787#1:2833\n*E\n"})
/* loaded from: classes2.dex */
public final class o extends com.harman.jbl.partybox.c {

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private static final String f44129n1 = "MainViewModel";

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private static final String f44130o1 = " FIREBASE_LOG : ";

    /* renamed from: r1, reason: collision with root package name */
    @l3.e
    private static String f44133r1;

    /* renamed from: s1, reason: collision with root package name */
    @l3.e
    private static String f44134s1;

    /* renamed from: t1, reason: collision with root package name */
    @l3.e
    private static String f44135t1;

    /* renamed from: A0, reason: collision with root package name */
    @l3.d
    private final LiveData<String> f44136A0;

    /* renamed from: B0, reason: collision with root package name */
    @l3.d
    private final P<String> f44137B0;

    /* renamed from: C0, reason: collision with root package name */
    @l3.d
    private LiveData<String> f44138C0;

    /* renamed from: D0, reason: collision with root package name */
    @l3.d
    private final P<H0> f44139D0;

    /* renamed from: E0, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f44140E0;

    /* renamed from: F0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44141F0;

    /* renamed from: G0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44142G0;

    /* renamed from: H0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44143H0;

    /* renamed from: I0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44144I0;

    /* renamed from: J0, reason: collision with root package name */
    @l3.d
    private final P<Map<LightElements, Boolean>> f44145J0;

    /* renamed from: K0, reason: collision with root package name */
    @l3.d
    private P<Map<LightElements, Boolean>> f44146K0;

    /* renamed from: L0, reason: collision with root package name */
    @l3.d
    private final P<Pair<Color, ColorMode>> f44147L0;

    /* renamed from: M0, reason: collision with root package name */
    @l3.d
    private LiveData<Pair<Color, ColorMode>> f44148M0;

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final P<H0> f44149N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f44150O0;

    /* renamed from: P, reason: collision with root package name */
    private boolean f44151P;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final P<H0> f44152P0;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f44153Q;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final P<H0> f44154Q0;

    /* renamed from: R, reason: collision with root package name */
    private boolean f44155R;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44156R0;

    /* renamed from: S, reason: collision with root package name */
    private boolean f44157S = true;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44158S0;

    /* renamed from: T, reason: collision with root package name */
    private int f44159T;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44160T0;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private P<Boolean> f44161U;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final P<H0> f44162U0;

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private P<Boolean> f44163V;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private final LiveData<H0> f44164V0;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private P<PartyBoxDevice> f44165W;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private final P<String> f44166W0;

    /* renamed from: X, reason: collision with root package name */
    private long f44167X;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private final LiveData<String> f44168X0;

    /* renamed from: Y, reason: collision with root package name */
    private long f44169Y;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.d
    private final P<String> f44170Y0;

    /* renamed from: Z, reason: collision with root package name */
    @l3.e
    private List<String> f44171Z;

    /* renamed from: Z0, reason: collision with root package name */
    @l3.d
    private final LiveData<String> f44172Z0;

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private HashMap<String, HashMap<String, Boolean>> f44173a0;

    /* renamed from: a1, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f44174a1;

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44175b0;

    /* renamed from: b1, reason: collision with root package name */
    @l3.d
    private final LiveData<List<HmDevice>> f44176b1;

    /* renamed from: c0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44177c0;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f44178c1;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f44179d0;

    /* renamed from: d1, reason: collision with root package name */
    @l3.d
    private final LiveData<List<HmDevice>> f44180d1;

    /* renamed from: e0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44181e0;

    /* renamed from: e1, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partylight.lib.c f44182e1;

    /* renamed from: f0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44183f0;

    /* renamed from: f1, reason: collision with root package name */
    @l3.d
    private final c.b f44184f1;

    /* renamed from: g0, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.c f44185g0;

    /* renamed from: g1, reason: collision with root package name */
    @l3.d
    private final InterfaceC2445a.InterfaceC0551a f44186g1;

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final LinkedList<HmDevice> f44187h0;

    /* renamed from: h1, reason: collision with root package name */
    @l3.d
    private final z2.d f44188h1;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final P<UiPage> f44189i0;

    /* renamed from: i1, reason: collision with root package name */
    @l3.d
    private final P<Pair<Boolean, String>> f44190i1;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final LiveData<UiPage> f44191j0;

    /* renamed from: j1, reason: collision with root package name */
    @l3.d
    private LiveData<Pair<Boolean, String>> f44192j1;

    /* renamed from: k0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44193k0;

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final P<Pair<Boolean, String>> f44194k1;

    /* renamed from: l0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44195l0;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private LiveData<Pair<Boolean, String>> f44196l1;

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44197m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44198n0;

    /* renamed from: o0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44199o0;

    /* renamed from: p0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44200p0;

    /* renamed from: q0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44201q0;

    /* renamed from: r0, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44202r0;

    /* renamed from: s0, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f44203s0;

    /* renamed from: t0, reason: collision with root package name */
    @l3.d
    private final List<HmDevice> f44204t0;

    /* renamed from: u0, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f44205u0;

    /* renamed from: v0, reason: collision with root package name */
    @l3.d
    private final P<Pair<String, Boolean>> f44206v0;

    /* renamed from: w0, reason: collision with root package name */
    @l3.d
    private final LiveData<Pair<String, Boolean>> f44207w0;

    /* renamed from: x0, reason: collision with root package name */
    @l3.d
    private final P<Pair<String, Boolean>> f44208x0;

    /* renamed from: y0, reason: collision with root package name */
    @l3.d
    private final LiveData<Pair<String, Boolean>> f44209y0;

    /* renamed from: z0, reason: collision with root package name */
    @l3.d
    private final P<String> f44210z0;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    public static final a f44128m1 = new a(null);

    /* renamed from: p1, reason: collision with root package name */
    @l3.d
    private static String f44131p1 = "";

    /* renamed from: q1, reason: collision with root package name */
    private static boolean f44132q1 = true;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.e
        public final String a() {
            return o.f44133r1;
        }

        @l3.e
        public final String b() {
            return o.f44135t1;
        }

        @l3.d
        public final String c() {
            return o.f44131p1;
        }

        @l3.e
        public final String d() {
            return o.f44134s1;
        }

        public final boolean e() {
            return o.f44132q1;
        }

        public final void f(@l3.e String str) {
            o.f44133r1 = str;
        }

        public final void g(@l3.e String str) {
            o.f44135t1 = str;
        }

        public final void h(boolean z3) {
            o.f44132q1 = z3;
        }

        public final void i(@l3.d String str) {
            F.p(str, "<set-?>");
            o.f44131p1 = str;
        }

        public final void j(@l3.e String str) {
            o.f44134s1 = str;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44211a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44212b;

        static {
            int[] iArr = new int[MessageID.values().length];
            try {
                iArr[MessageID.ANALYTICS_INFO_DEVICE_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageID.ANALYTICS_INFO_PLAY_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageID.DEVICE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageID.DEVICE_FEATURE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageID.LIGHT_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageID.LIGHT_ACTIVE_PATTERN_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MessageID.PLAYER_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MessageID.PHONE_MAC_ADDRESS_STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MessageID.RET_PHONE_MAC_ADDRESS_STATUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MessageID.SECONDARY_MAC_STATUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MessageID.BASS_BOOST_STATUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MessageID.EQ_STATUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MessageID.RET_ADVANCED_EQ_STATUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MessageID.EQ_MODE_STATUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MessageID.UPDATE_CANCEL_STATUS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MessageID.RET_MIC_CONNECTION_INFO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MessageID.STEREO_GROUP_NAME.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MessageID.RET_ONE_TOUCH_MUSIC_TRIGGERED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f44211a = iArr;
            int[] iArr2 = new int[DeviceProtocol.values().length];
            try {
                iArr2[DeviceProtocol.PROTOCOL_BLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[DeviceProtocol.PROTOCOL_GATT_BR_EDR.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[DeviceProtocol.PROTOCOL_SPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            f44212b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.main.MainViewModel$checkAndDisplayDashboard$1", f = "MainViewModel.kt", i = {}, l = {1814}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44213I;

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44213I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.a a4 = com.harman.jbl.partybox.ui.a.f42082a.a();
                HmDevice k12 = o.this.k1();
                F.n(k12, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                this.f44213I = 1;
                if (a4.b((PartyBoxDevice) k12, this) == l4) {
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
            return new c(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC2445a.InterfaceC0551a {
        d() {
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            String str;
            F.p(protocol, "protocol");
            if (!(hmDevice instanceof PartyBoxDevice)) {
                return;
            }
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG connectionListener onStatusChanged and status : " + i4);
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG device mac address : " + hmDevice.n());
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG device.isOTARestartPhase : " + Boolean.valueOf(hmDevice.T()));
            HmDevice k12 = o.this.k1();
            if (k12 != null) {
                str = k12.n();
            } else {
                str = null;
            }
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG connectDevice mac address : " + str);
            HmDevice k13 = o.this.k1();
            if (k13 != null) {
                o oVar = o.this;
                if (i4 == 0) {
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
                    if (F.g(partyBoxDevice.n(), k13.n())) {
                        com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG post disconnected status for the connected device : " + partyBoxDevice.n());
                        oVar.I0();
                    }
                }
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void b(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void c(@l3.d HmDevice device) {
            B2.c k4;
            F.p(device, "device");
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG onStandby DeviceBLEConnected");
            HmDevice hmDevice = ((com.harman.jbl.partybox.c) o.this).f38311M;
            if (hmDevice != null && hmDevice.equals(device) && (k4 = com.harman.sdk.b.f47608a.k()) != null) {
                k4.f();
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void d(@l3.d BaseMessage deviceMessage) {
            F.p(deviceMessage, "deviceMessage");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements z2.d {
        e() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            if (!(device instanceof PartyBoxDevice)) {
                return;
            }
            com.harman.log.f.a(o.f44129n1, "Message " + msg);
            o.this.J2((PartyBoxDevice) device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            if (!(device instanceof PartyBoxDevice)) {
                return;
            }
            com.harman.log.f.a(o.f44129n1, "Message " + msg);
            o.this.J2((PartyBoxDevice) device, code, msg);
        }
    }

    @U({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/harman/jbl/partybox/ui/main/MainViewModel$deviceMgrObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2805:1\n1#2:2806\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class f implements com.harman.sdk.c {
        f() {
        }

        @Override // com.harman.sdk.c
        public void onA2DPConnected(@l3.e String str, boolean z3) {
            com.harman.log.f.a(o.f44129n1, "MainViewModel onA2DPConnected address = " + str + ", isConnected = " + z3);
            if (str != null) {
                com.harman.jbl.partybox.h.f40556a.b(o.this.f44206v0, new Pair(str, Boolean.valueOf(z3)));
            }
        }

        @Override // com.harman.sdk.c
        public void onBtEnabled(boolean z3) {
            com.harman.log.f.a(o.f44129n1, "MainViewModel onBtEnabled isEnable = " + z3);
            o oVar = o.this;
            oVar.T(oVar.f44141F0, Boolean.valueOf(z3));
            if (z3) {
                o.this.M1();
            } else {
                o.this.s3(UiPage.BLUETOOTH_PERMISSION);
            }
        }

        @Override // com.harman.sdk.c
        public void onLocationEnabled(boolean z3) {
            com.harman.log.f.a(o.f44129n1, "MainViewModel onLocationEnabled isEnable = " + z3);
            o oVar = o.this;
            oVar.T(oVar.f44143H0, Boolean.valueOf(z3));
            if (z3 && o.this.f44151P != z3) {
                o.this.M1();
                o.this.f44151P = z3;
            }
        }

        @Override // com.harman.sdk.c
        public void onNetworkEnabled(boolean z3) {
            com.harman.log.f.a(o.f44129n1, "MainViewModel onNetworkEnabled isEnable = " + z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.main.MainViewModel$logDJButtonEventSetting$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44219I;

        h(kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f44219I == 0) {
                W.n(obj);
                Bundle bundle = new Bundle();
                o oVar = o.this;
                HmDevice k12 = oVar.k1();
                if (k12 != null && (k12 instanceof PartyBoxDevice)) {
                    bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
                    bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
                    bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                    com.harman.log.f.a(o.f44129n1, "BLE_LOG djEffectButton1ToneId : " + partyBoxDevice.V0());
                    com.harman.log.f.a(o.f44129n1, "BLE_LOG djEffectButton2ToneId : " + partyBoxDevice.W0());
                    com.harman.log.f.a(o.f44129n1, "BLE_LOG djEffectButton3ToneId : " + partyBoxDevice.X0());
                    com.harman.jbl.partybox.utils.c cVar = com.harman.jbl.partybox.utils.c.f46169a;
                    String a4 = cVar.a(partyBoxDevice.V0());
                    String a5 = cVar.a(partyBoxDevice.W0());
                    String a6 = cVar.a(partyBoxDevice.X0());
                    bundle.putString(L1.a.f1653t1, a4);
                    bundle.putString(L1.a.f1657u1, a5);
                    bundle.putString(L1.a.f1661v1, a6);
                    com.harman.log.f.a(o.f44129n1, "BLE_LOG EVENT_SETTING_DJ_BUTTON_STATUS called");
                    oVar.n2(L1.a.f1631p, bundle);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return new h(cVar);
        }
    }

    @U({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/harman/jbl/partybox/ui/main/MainViewModel$plGroupObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2805:1\n1549#2:2806\n1620#2,3:2807\n766#2:2810\n857#2,2:2811\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/harman/jbl/partybox/ui/main/MainViewModel$plGroupObserver$1\n*L\n481#1:2806\n481#1:2807,3\n488#1:2810\n488#1:2811,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class i extends Lambda implements X2.l<List<? extends PLGroup>, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends PLGroup> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<PLGroup> it) {
            int b02;
            List V5;
            Collection H3;
            List D4;
            F.p(it, "it");
            com.harman.log.f.a(o.f44129n1, "plGroupObserver onChanged");
            b02 = C2109w.b0(it, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (PLGroup pLGroup : it) {
                PartyLightDevice partyLightDevice = new PartyLightDevice();
                partyLightDevice.n0(pLGroup.j());
                partyLightDevice.g0(pLGroup.h());
                partyLightDevice.O0(pLGroup);
                arrayList.add(partyLightDevice);
            }
            V5 = D.V5(arrayList);
            List list = (List) o.this.f44203s0.f();
            if (list == null) {
                H3 = CollectionsKt__CollectionsKt.H();
            } else {
                H3 = new ArrayList();
                for (Object obj : list) {
                    if (com.harman.sdk.utils.d.Q(((HmDevice) obj).q())) {
                        H3.add(obj);
                    }
                }
            }
            o oVar = o.this;
            D4 = D.D4(V5, H3);
            oVar.F2(D4, false);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.main.MainViewModel$powerOffDevice$1$1", f = "MainViewModel.kt", i = {}, l = {672}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class j extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44222I;

        j(kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f44222I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                this.f44222I = 1;
                if (C2269d0.b(500L, this) == l4) {
                    return l4;
                }
            }
            o.this.K1(true);
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
            return new j(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements c.b {
        k() {
        }

        @Override // B2.c.b
        public void b(int i4, @l3.e String str) {
            if (i4 == 2) {
                com.harman.log.f.a(o.f44129n1, "MainViewModel code is SCAN_FAILED_APPLICATION_REGISTRATION_FAILED, restart your device");
            }
        }

        @Override // B2.c.b
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG onDeviceRoleBitToNormal , request MTU");
            com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(device);
            if (c4 != null) {
                c4.f(device);
            }
        }

        @Override // B2.c.b
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
            if (!(device instanceof PartyBoxDevice)) {
                return;
            }
            com.harman.log.f.a(o.f44129n1, "MainViewModel BLE_LOG onDeviceOffline : " + device.n());
            o.this.J0(device);
        }

        @Override // B2.c.b
        public void e(@l3.d HmDevice scannedDevice) {
            F.p(scannedDevice, "scannedDevice");
            if (scannedDevice instanceof PartyBoxDevice) {
                o.this.M0((PartyBoxDevice) scannedDevice);
            }
        }
    }

    public o() {
        P<Boolean> p4 = new P<>();
        this.f44161U = p4;
        this.f44163V = p4;
        this.f44165W = new P<>();
        this.f44171Z = U1.a.g();
        this.f44173a0 = new HashMap<>();
        P<Boolean> p5 = new P<>();
        this.f44175b0 = p5;
        this.f44177c0 = p5;
        P<Boolean> p6 = new P<>(Boolean.TRUE);
        this.f44181e0 = p6;
        this.f44183f0 = p6;
        f fVar = new f();
        this.f44185g0 = fVar;
        this.f44187h0 = new LinkedList<>();
        P<UiPage> p7 = new P<>();
        this.f44189i0 = p7;
        this.f44191j0 = p7;
        P<Boolean> p8 = new P<>();
        this.f44193k0 = p8;
        this.f44195l0 = new P<>();
        this.f44197m0 = new P<>();
        this.f44198n0 = p8;
        P<Boolean> p9 = new P<>();
        this.f44199o0 = p9;
        this.f44200p0 = p9;
        P<Boolean> p10 = new P<>();
        this.f44201q0 = p10;
        this.f44202r0 = p10;
        this.f44203s0 = new P<>();
        this.f44204t0 = new ArrayList();
        this.f44205u0 = new P<>();
        P<Pair<String, Boolean>> p11 = new P<>();
        this.f44206v0 = p11;
        this.f44207w0 = p11;
        P<Pair<String, Boolean>> p12 = new P<>();
        this.f44208x0 = p12;
        this.f44209y0 = p12;
        P<String> p13 = new P<>();
        this.f44210z0 = p13;
        this.f44136A0 = p13;
        P<String> p14 = new P<>();
        this.f44137B0 = p14;
        this.f44138C0 = p14;
        P<H0> p15 = new P<>();
        this.f44139D0 = p15;
        this.f44140E0 = p15;
        P<Boolean> p16 = new P<>();
        this.f44141F0 = p16;
        this.f44142G0 = p16;
        P<Boolean> p17 = new P<>();
        this.f44143H0 = p17;
        this.f44144I0 = p17;
        P<Map<LightElements, Boolean>> p18 = new P<>();
        this.f44145J0 = p18;
        this.f44146K0 = p18;
        P<Pair<Color, ColorMode>> p19 = new P<>();
        this.f44147L0 = p19;
        this.f44148M0 = p19;
        P<H0> p20 = new P<>();
        this.f44149N0 = p20;
        this.f44150O0 = p20;
        this.f44152P0 = new P<>();
        this.f44154Q0 = new P<>();
        this.f44156R0 = new P<>();
        this.f44158S0 = new P<>();
        this.f44160T0 = new P<>();
        P<H0> p21 = new P<>();
        this.f44162U0 = p21;
        this.f44164V0 = p21;
        P<String> p22 = new P<>();
        this.f44166W0 = p22;
        this.f44168X0 = p22;
        P<String> p23 = new P<>();
        this.f44170Y0 = p23;
        this.f44172Z0 = p23;
        P<List<HmDevice>> p24 = new P<>();
        this.f44174a1 = p24;
        this.f44176b1 = p24;
        P<List<HmDevice>> p25 = new P<>();
        this.f44178c1 = p25;
        this.f44180d1 = p25;
        com.harman.jbl.partylight.lib.c cVar = new com.harman.jbl.partylight.lib.c(new i(), null, null, null, 14, null);
        this.f44182e1 = cVar;
        com.harman.sdk.b.f47608a.u(fVar);
        M1();
        com.harman.log.f.a(f44129n1, "init registerScannerListener");
        com.harman.jbl.partylight.lib.f.f46571a.a().b(cVar);
        this.f44184f1 = new k();
        this.f44186g1 = new d();
        this.f44188h1 = new e();
        P<Pair<Boolean, String>> p26 = new P<>();
        this.f44190i1 = p26;
        this.f44192j1 = p26;
        P<Pair<Boolean, String>> p27 = new P<>();
        this.f44194k1 = p27;
        this.f44196l1 = p27;
    }

    private final void A0() {
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (partyBoxDevice.I1() && !com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p(k12)) {
                ActivityC0889g activityC0889g = this.f38307I.get();
                if (activityC0889g != null) {
                    s3.c cVar = s3.c.f57654a;
                    F.m(activityC0889g);
                    cVar.f(activityC0889g, r3.d.f57452b, true);
                }
                O1();
                partyBoxDevice.W1(null);
                z2.c f4 = com.harman.sdk.b.f47608a.f(k12);
                if (f4 != null) {
                    f4.o(k12, this.f44188h1);
                }
            }
        }
    }

    private final void A2(RemoteOTAConfig remoteOTAConfig) {
        PartyBoxDevice partyBoxDevice;
        boolean z3;
        if (remoteOTAConfig != null) {
            try {
                HmDevice hmDevice = this.f38311M;
                if (hmDevice instanceof PartyBoxDevice) {
                    partyBoxDevice = (PartyBoxDevice) hmDevice;
                } else {
                    partyBoxDevice = null;
                }
                if (partyBoxDevice != null) {
                    z3 = partyBoxDevice.D1();
                } else {
                    z3 = false;
                }
                com.harman.log.f.a(f44129n1, "Whats new callback called");
                if (remoteOTAConfig.f() != null) {
                    P<Pair<Boolean, String>> p4 = this.f44190i1;
                    Boolean valueOf = Boolean.valueOf(z3);
                    String f4 = remoteOTAConfig.f();
                    F.m(f4);
                    T(p4, new Pair(valueOf, f4));
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private final void B0(WirelessMicInfo wirelessMicInfo) {
        H0 h02;
        com.harman.log.f.a(f44129n1, "MainViewModel, checkMicUpdate");
        if (wirelessMicInfo != null) {
            if (wirelessMicInfo.m() == 0) {
                T(this.f44194k1, new Pair(Boolean.FALSE, ""));
            } else if (com.harman.jbl.partybox.firmware.d.f40541a.d(wirelessMicInfo) > 0) {
                P<Pair<Boolean, String>> p4 = this.f44194k1;
                Boolean bool = Boolean.TRUE;
                String b4 = wirelessMicInfo.b();
                F.m(b4);
                T(p4, new Pair(bool, b4));
            } else {
                T(this.f44194k1, new Pair(Boolean.FALSE, ""));
            }
            h02 = H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            T(this.f44194k1, new Pair(Boolean.FALSE, ""));
        }
    }

    private final void C0(PartyBoxDevice partyBoxDevice, final X2.l<? super Map<String, RemoteOTAConfig.WhatsNewItem>, H0> lVar) {
        Context Z02 = Z0();
        if (Z02 == null) {
            return;
        }
        com.harman.log.f.d(f44129n1, "checkOTAByJsonConfig() >>> start OtaUpdateAsyncTask for device[" + partyBoxDevice.n() + "]");
        new OtaUpdateAsyncTask(Z02, partyBoxDevice.q(), partyBoxDevice.n(), "3.12.20", partyBoxDevice.w(), new com.harman.jbl.partybox.firmware.c() { // from class: com.harman.jbl.partybox.ui.main.l
            @Override // com.harman.jbl.partybox.firmware.c
            public final void a(com.harman.jbl.partybox.firmware.g gVar) {
                o.E0(o.this, lVar, gVar);
            }
        }).execute(new Void[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void D0(o oVar, PartyBoxDevice partyBoxDevice, X2.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        oVar.C0(partyBoxDevice, lVar);
    }

    private final void D2() {
        com.harman.log.f.a(f44129n1, "BLE_LOG processDeviceAnalytics called");
        final HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            DeviceAnalytics R02 = partyBoxDevice.R0();
            if (R02 != null) {
                partyBoxDevice.W1(new com.harman.analytics.deviceAws.a().f(R02.p(), R02, com.harman.sdk.utils.d.G(k12)));
                com.harman.log.f.a(f44129n1, "BLE_LOG device.deviceAnalytics : " + partyBoxDevice.R0());
                DeviceAnalytics R03 = partyBoxDevice.R0();
                F.m(R03);
                com.harman.log.f.a(f44129n1, "BLE_LOG device.deviceAnalytics : " + R03.n());
            }
            PlayAnalytics k13 = partyBoxDevice.k1();
            if (k13 != null) {
                partyBoxDevice.u2(new com.harman.analytics.deviceAws.b().d(k13.f(), k13));
                com.harman.log.f.a(f44129n1, "BLE_LOG device.playAnalytics : " + partyBoxDevice.k1());
                PlayAnalytics k14 = partyBoxDevice.k1();
                F.m(k14);
                com.harman.log.f.a(f44129n1, "BLE_LOG device.playAnalytics : " + k14.o());
            }
            Date time = Calendar.getInstance().getTime();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\nReceived on: " + time);
            stringBuffer.append("\n\n");
            stringBuffer.append(String.valueOf(partyBoxDevice.R0()));
            stringBuffer.append("\n--------------------------\n\n");
            RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics = new RequestPayloadDataDeviceAnalytics();
            com.harman.jbl.partybox.utils.b.b(partyBoxDevice, requestPayloadDataDeviceAnalytics);
            r3.c.h(requestPayloadDataDeviceAnalytics);
            PlayAnalytics k15 = partyBoxDevice.k1();
            if (k15 != null) {
                r3.c.i(k15.c());
            }
            com.harman.log.f.a(f44129n1, "AwsAnalyticsManager.saveLog BuildConfig.DEBUG = false && currentStatusData = " + com.harman.jbl.partybox.persistence.a.g(com.harman.jbl.partybox.constants.a.f38383t));
            com.harman.log.f.a(f44129n1, "device onUploadServer processDeviceAnalytics: " + new GsonBuilder().setPrettyPrinting().create().toJson(requestPayloadDataDeviceAnalytics));
            final Context Z02 = Z0();
            if (Z02 != null) {
                r3.c.k(com.harman.sdk.utils.d.I(k12.q()), Z02, new r3.f() { // from class: com.harman.jbl.partybox.ui.main.m
                    @Override // r3.f
                    public final void a(boolean z3) {
                        o.E2(HmDevice.this, Z02, this, z3);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(o this$0, X2.l lVar, com.harman.jbl.partybox.firmware.g gVar) {
        String str;
        boolean K12;
        Map<String, com.harman.jbl.partybox.firmware.h> a4;
        int j4;
        F.p(this$0, "this$0");
        com.harman.log.f.d(f44129n1, "checkOTAByJsonConfig() >>> on ota json fetch and parse suc.");
        HmDevice k12 = this$0.k1();
        String str2 = null;
        if (k12 != null) {
            str = k12.n();
        } else {
            str = null;
        }
        com.harman.log.f.a(f44129n1, "processFirmwareUpdate>>> mainDevice.deviceMAC = " + str + ", remoteModel.deviceMAC = " + gVar.f40547c);
        if (k12 != null) {
            str2 = k12.n();
        }
        K12 = z.K1(str2, gVar.f40547c, true);
        if (K12) {
            F.m(gVar);
            this$0.H2(gVar);
            if ((k12 instanceof PartyBoxDevice) && (a4 = gVar.a()) != null) {
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
                RemoteOTAConfig H3 = ((PartyBoxDevice) k12).H();
                if (H3 != null) {
                    H3.s(linkedHashMap);
                }
                com.harman.log.f.d(f44129n1, "checkOTAByJsonConfig() >>> whatsNew updated:\n" + linkedHashMap);
                if (lVar != null) {
                    lVar.C(linkedHashMap);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(HmDevice device, Context it, o this$0, boolean z3) {
        F.p(device, "$device");
        F.p(it, "$it");
        F.p(this$0, "this$0");
        String c4 = r3.c.c();
        F.o(c4, "getAwsLastUploadedJson(...)");
        com.harman.log.f.a(f44129n1, "device onUploadServer isSuccess: " + z3 + ", " + c4);
        if (z3) {
            com.harman.log.f.a(f44129n1, "device onUploadServer is Success so send clear analytics data command");
            com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
            z2.c f4 = bVar.f(device);
            if (f4 != null) {
                f4.T(device, null);
            }
            if (com.harman.sdk.utils.d.G(device)) {
                com.harman.log.f.a(f44129n1, "device onUploadServer is Success so send clear play analytics data command");
                z2.c f5 = bVar.f(device);
                if (f5 != null) {
                    f5.w(device, null);
                }
            }
            com.harman.jbl.partybox.persistence.a.g(com.harman.jbl.partybox.constants.a.f38383t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(List<? extends HmDevice> list, boolean z3) {
        try {
            com.harman.log.f.a(f44129n1, "processDeviceList deviceModels.size = " + list.size() + ", isAllSpeakers = " + z3);
            M2(false);
            l3(list, z3);
        } catch (Exception e4) {
            T1.a.b("BLE_LOG processDeviceList " + e4.getMessage());
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G0(o oVar, X2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        oVar.F0(lVar);
    }

    static /* synthetic */ void G2(o oVar, List list, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        oVar.F2(list, z3);
    }

    private final void H0() {
        HmDevice k12 = k1();
        if (k12 != null) {
            com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
            z2.e e4 = bVar.e(k12);
            if (e4 != null) {
                e4.h(this.f44188h1);
            }
            com.harman.sdk.impl.connect.i c4 = bVar.c(k12);
            if (c4 != null) {
                c4.d(this.f44186g1);
            }
            this.f44157S = true;
            T(this.f44190i1, new Pair(Boolean.FALSE, ""));
            if (k12 instanceof PartyBoxDevice) {
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                partyBoxDevice.r2(null);
                partyBoxDevice.o2(null);
            }
            k12.K0(null);
            T(this.f44165W, null);
            f44133r1 = null;
        }
    }

    private final void H2(com.harman.jbl.partybox.firmware.g gVar) {
        try {
            HmDevice hmDevice = this.f38311M;
            if (hmDevice != null) {
                RemoteOTAConfig remoteOTAConfig = new RemoteOTAConfig();
                remoteOTAConfig.r(gVar.f40546b);
                remoteOTAConfig.q(gVar.f40549e);
                remoteOTAConfig.m(gVar.f40545a);
                hmDevice.H0(remoteOTAConfig);
                if (hmDevice instanceof PartyBoxDevice) {
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
                    String e4 = remoteOTAConfig.e();
                    String str = "";
                    if (e4 == null) {
                        e4 = "";
                    }
                    partyBoxDevice.k2(e4);
                    PartyBoxDevice partyBoxDevice2 = (PartyBoxDevice) hmDevice;
                    String str2 = gVar.f40546b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    partyBoxDevice2.x2(str2);
                    ((PartyBoxDevice) hmDevice).h2(gVar.c());
                    PartyBoxDevice partyBoxDevice3 = (PartyBoxDevice) hmDevice;
                    String str3 = gVar.f40545a;
                    if (str3 != null) {
                        str = str3;
                    }
                    partyBoxDevice3.V1(str);
                }
                A2(remoteOTAConfig);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        String str;
        String n4;
        HmDevice k12 = k1();
        if (k12 != null) {
            str = k12.n();
        } else {
            str = null;
        }
        com.harman.log.f.a(f44129n1, "BLE_LOG BLEState Current Device is disconnected " + str);
        H0();
        if (k12 != null) {
            k12.g0(false);
        }
        if (k12 != null && (n4 = k12.n()) != null) {
            U(this.f44208x0, new Pair(n4, Boolean.FALSE));
        }
        L1(this, false, 1, null);
    }

    private final void I2(PartyBoxDevice partyBoxDevice) {
        LightPattern lightPattern;
        Color c4;
        PartyBoxLightShowSettings h12;
        ColorMode d4;
        boolean z3;
        try {
            PartyBoxLightShowSettings h13 = partyBoxDevice.h1();
            boolean z4 = false;
            if (h13 != null) {
                T(this.f44145J0, h13.i());
                if (!h13.i().isEmpty()) {
                    Iterator<Map.Entry<LightElements, Boolean>> it = h13.i().entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<LightElements, Boolean> next = it.next();
                            next.getKey();
                            if (next.getValue().booleanValue()) {
                                z3 = true;
                                break;
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    U2(z3);
                } else {
                    U2(false);
                }
                PartyBoxLightShowSettings h14 = partyBoxDevice.h1();
                if (h14 != null && (c4 = h14.c()) != null && (h12 = partyBoxDevice.h1()) != null && (d4 = h12.d()) != null) {
                    b3(c4, d4);
                }
            }
            com.harman.jbl.partybox.h hVar = com.harman.jbl.partybox.h.f40556a;
            P<Boolean> p4 = this.f44201q0;
            PartyBoxLightShowSettings h15 = partyBoxDevice.h1();
            if (h15 != null) {
                lightPattern = h15.a();
            } else {
                lightPattern = null;
            }
            if (lightPattern == LightPattern.CUSTOM) {
                z4 = true;
            }
            hVar.b(p4, Boolean.valueOf(z4));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(HmDevice hmDevice) {
        com.harman.log.f.a(f44129n1, "MainViewModel deviceInfoExpired called");
        synchronized (this.f44187h0) {
            this.f44187h0.remove(hmDevice);
            o3();
            H0 h02 = H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NullSafeMutableLiveData"})
    public final void J2(PartyBoxDevice partyBoxDevice, StatusCode statusCode, BaseMessage baseMessage) {
        HmDevice k12;
        String a4;
        com.harman.log.f.a(f44129n1, "MainViewModel, Process observer called, msg = " + baseMessage + " device = " + partyBoxDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            MessageID b4 = baseMessage.b();
            switch (b4 == null ? -1 : b.f44211a[b4.ordinal()]) {
                case 1:
                    DeviceAnalytics R02 = partyBoxDevice.R0();
                    if (R02 != null) {
                        com.harman.log.f.a(f44129n1, "MainViewModel, Received ANALYTICS_INFO_DEVICE_DATA , it.packages.size = " + R02.p().size() + " packageTotal = " + R02.o());
                        if (!new com.harman.analytics.deviceAws.a().a(R02.p(), Integer.valueOf(R02.o())) || R02.a()) {
                            return;
                        }
                        if (com.harman.sdk.utils.d.G(partyBoxDevice)) {
                            z2.c f4 = com.harman.sdk.b.f47608a.f(partyBoxDevice);
                            if (f4 != null) {
                                f4.y(partyBoxDevice, this.f44188h1);
                                return;
                            }
                            return;
                        }
                        R02.r(true);
                        D2();
                        return;
                    }
                    return;
                case 2:
                    PlayAnalytics k13 = partyBoxDevice.k1();
                    if (k13 != null) {
                        com.harman.log.f.a(f44129n1, "MainViewModel, Received ANALYTICS_INFO_PLAY_DATA , it.packages.size = " + k13.f().size() + " packageTotal = " + k13.e());
                        if (!new com.harman.analytics.deviceAws.b().a(k13.f(), Integer.valueOf(k13.e())) || k13.a()) {
                            return;
                        }
                        k13.h(true);
                        D2();
                        return;
                    }
                    return;
                case 3:
                    com.harman.jbl.partybox.h hVar = com.harman.jbl.partybox.h.f40556a;
                    hVar.b(this.f44158S0, Boolean.TRUE);
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received DEVICE_INFO , msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    com.harman.log.f.a(f44129n1, "MainViewModel, updateBatteryAndDeviceName>>>>>>>>");
                    com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
                    if (d4.q(partyBoxDevice) && partyBoxDevice.i() == AudioChannel.NONE_CHANNEL && d4.l(partyBoxDevice)) {
                        HmDevice h4 = d4.h(partyBoxDevice);
                        TWSInfo M3 = partyBoxDevice.M();
                        if (M3 != null && (a4 = M3.a()) != null) {
                            U1.a.l(a4);
                        }
                        d4.e(partyBoxDevice);
                        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
                        com.harman.sdk.impl.connect.i c4 = bVar.c(partyBoxDevice);
                        if (c4 != null) {
                            c4.h("", "");
                        }
                        if (h4 != null) {
                            d4.e(h4);
                            com.harman.sdk.impl.connect.i c5 = bVar.c(h4);
                            if (c5 != null) {
                                c5.h("", "");
                            }
                        }
                        B2.c k4 = bVar.k();
                        if (k4 != null) {
                            k4.d();
                        }
                    }
                    if (!TextUtils.isEmpty(partyBoxDevice.w()) && (k12 = k1()) != null) {
                        com.harman.log.f.a(f44129n1, "MainViewModel, update firmware to " + partyBoxDevice.w() + " from " + k12.w());
                        k12.t0(partyBoxDevice.w());
                    }
                    hVar.b(this.f44156R0, partyBoxDevice);
                    return;
                case 4:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received DEVICE_FEATURE_INFO , msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    g1(partyBoxDevice);
                    return;
                case 5:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received LIGHT_STATUS, msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    I2(partyBoxDevice);
                    return;
                case 6:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received LIGHT_ACTIVE_PATTERN_STATUS, msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    return;
                case 7:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received MUSIC_STATUS, msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    return;
                case 8:
                    if (partyBoxDevice.j1() == null || F.g(partyBoxDevice.j1(), "ffffffffffff")) {
                        return;
                    }
                    com.harman.log.f.a(f44129n1, "MainViewModel, phoneMacAddress is saved and it is = " + partyBoxDevice.j1());
                    com.harman.jbl.partybox.persistence.a.I("PREFERENCE_KEY_PHONE_MAC_ADDRESS", partyBoxDevice.j1());
                    return;
                case 9:
                    String q4 = com.harman.jbl.partybox.persistence.a.q("PREFERENCE_KEY_PHONE_MAC_ADDRESS", "");
                    String str = q4 != null ? q4 : "";
                    com.harman.log.f.a(f44129n1, "MainViewModel, phoneMacAddress saved and it is = " + str);
                    z2.j i4 = com.harman.sdk.b.f47608a.i(partyBoxDevice);
                    if (i4 != null) {
                        i4.V(partyBoxDevice, str, null);
                        return;
                    }
                    return;
                case 10:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received SECONDARY_MAC_STATUS, msg = " + baseMessage + " secondaryMAC = " + partyBoxDevice.m1());
                    Object a5 = baseMessage.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("MainViewModel, Received SECONDARY_MAC_STATUS, msg = ");
                    sb.append(a5);
                    com.harman.log.f.a(f44129n1, sb.toString());
                    return;
                case 11:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received BASS_BOOST_STATUS, msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    T(this.f44149N0, H0.f51801a);
                    return;
                case 12:
                case 13:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received EQ_STATUS, msg = " + baseMessage + " device = " + partyBoxDevice.J());
                    T(this.f44152P0, H0.f51801a);
                    return;
                case 14:
                    com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
                    String n4 = partyBoxDevice.n();
                    int P02 = partyBoxDevice.P0();
                    Context Z02 = Z0();
                    F.m(Z02);
                    aVar.z("BASS_BOOST_STATE_KEY", n4, P02, Z02);
                    T(this.f44149N0, H0.f51801a);
                    return;
                case 15:
                    HmDevice k14 = k1();
                    if (k14 == null || !(k14 instanceof PartyBoxDevice)) {
                        return;
                    }
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received UPDATE_CANCEL_STATUS, mainDevice isDeviceUpgradeCancel = " + ((PartyBoxDevice) k14).A1());
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received UPDATE_CANCEL_STATUS, isDeviceUpgradeCancel = " + partyBoxDevice.A1());
                    return;
                case 16:
                    com.harman.log.f.a(f44129n1, "MainViewModel, Received RET_MIC_CONNECTION_INFO, msg = " + baseMessage + " device = " + partyBoxDevice.d1());
                    U(this.f44162U0, H0.f51801a);
                    B0(partyBoxDevice.v1());
                    return;
                case 17:
                    HmDevice k15 = k1();
                    if (k15 != null) {
                        TWSInfo M4 = k15.M();
                        com.harman.log.f.a(f44129n1, "MainViewModel, Received STEREO_GROUP_NAME, mainDevice groupName = " + (M4 != null ? M4.b() : null));
                        return;
                    }
                    return;
                case 18:
                    com.harman.log.f.a(f44129n1, "processMsg MessageID.RET_ONE_TOUCH_MUSIC_TRIGGERED");
                    return;
                default:
                    return;
            }
        }
    }

    private final String L0(HmDevice hmDevice) {
        String str;
        Boolean bool;
        if (hmDevice instanceof PartyBoxDevice) {
            String n4 = hmDevice.n();
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            PartyConnectStatus i12 = partyBoxDevice.i1();
            boolean F12 = partyBoxDevice.F1();
            boolean R3 = hmDevice.R();
            boolean B12 = partyBoxDevice.B1();
            boolean s4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a.s(hmDevice);
            TWSInfo M3 = hmDevice.M();
            Integer num = null;
            if (M3 != null) {
                str = M3.a();
            } else {
                str = null;
            }
            DeviceRole J3 = hmDevice.J();
            BatteryInfo f4 = hmDevice.f();
            if (f4 != null) {
                bool = Boolean.valueOf(f4.d());
            } else {
                bool = null;
            }
            BatteryInfo f5 = hmDevice.f();
            if (f5 != null) {
                num = Integer.valueOf(f5.c());
            }
            return n4 + " partyConnectMode:" + i12 + "  standbyMode:" + F12 + "  isBLEConnected:" + R3 + "  isEverConnected:" + B12 + "  isGrouped:" + s4 + "  groupID:" + str + "  role:" + J3 + "  batterInfo:" + bool + " batteryLevel:" + num + partyBoxDevice.d1();
        }
        return "Unknown device type";
    }

    public static /* synthetic */ void L1(o oVar, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        oVar.K1(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(PartyBoxDevice partyBoxDevice) {
        Boolean bool;
        String str;
        boolean z3;
        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG deviceReceived : [" + partyBoxDevice.n() + "], " + partyBoxDevice);
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(partyBoxDevice);
        if (c4 != null) {
            bool = Boolean.valueOf(c4.g());
        } else {
            bool = null;
        }
        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG connector.getOtaRestartPhase() : " + bool);
        HmDevice k12 = k1();
        if (k12 != null) {
            str = k12.n();
        } else {
            str = null;
        }
        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG getMainDevice[" + str + "], " + k1());
        int i4 = 0;
        if (com.harman.sdk.utils.d.Q(partyBoxDevice.q())) {
            com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG deviceReceived<<<<<<<: " + L0(partyBoxDevice));
            synchronized (this.f44187h0) {
                try {
                    int size = this.f44187h0.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            if (F.g(this.f44187h0.get(i5).n(), partyBoxDevice.n())) {
                                HmDevice hmDevice = this.f44187h0.get(i5);
                                F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                F.n(partyBoxDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                ((PartyBoxDevice) hmDevice).f0(partyBoxDevice.Q());
                                HmDevice hmDevice2 = this.f44187h0.get(i5);
                                F.n(hmDevice2, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                ((PartyBoxDevice) hmDevice2).y2(partyBoxDevice.F1());
                                HmDevice hmDevice3 = this.f44187h0.get(i5);
                                F.n(hmDevice3, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                ((PartyBoxDevice) hmDevice3).V(partyBoxDevice.O());
                                HmDevice hmDevice4 = this.f44187h0.get(i5);
                                F.n(hmDevice4, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                ((PartyBoxDevice) hmDevice4).f2(U1(partyBoxDevice.n()));
                                HmDevice hmDevice5 = this.f44187h0.get(i5);
                                F.n(hmDevice5, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                ((PartyBoxDevice) hmDevice5).a0(partyBoxDevice.f());
                                HmDevice hmDevice6 = this.f44187h0.get(i5);
                                F.n(hmDevice6, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
                                ((PartyBoxDevice) hmDevice6).J0(partyBoxDevice.J());
                                com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG deviceReceived Device is existing so update it:" + partyBoxDevice.R());
                                HmDevice hmDevice7 = this.f44187h0.get(i5);
                                F.o(hmDevice7, "get(...)");
                                n3(hmDevice7);
                                z3 = true;
                                break;
                            }
                            i5++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    if (!z3) {
                        partyBoxDevice.f2(U1(partyBoxDevice.n()));
                        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG deviceReceived: add device===> :" + x0(partyBoxDevice));
                        this.f44187h0.add(partyBoxDevice);
                    }
                    if (!z3) {
                        R0(this.f44187h0);
                    }
                    LinkedList<HmDevice> linkedList = this.f44187h0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : linkedList) {
                        if (P1((HmDevice) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!I()) {
                        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG isBtEnabled " + (!I()) + " ");
                        return;
                    }
                    if (!arrayList.isEmpty()) {
                        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG Multiple device found list size:" + arrayList.size());
                        G2(this, arrayList, false, 2, null);
                    }
                    H0 h02 = H0.f51801a;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (com.harman.sdk.utils.d.n0(partyBoxDevice.q())) {
            this.f44204t0.remove(partyBoxDevice);
            int size2 = this.f44204t0.size();
            com.harman.log.f.a(f44129n1, "MTK device found");
            int size3 = this.f44204t0.size();
            while (true) {
                if (i4 >= size3) {
                    break;
                }
                if (this.f44204t0.get(i4).x() > partyBoxDevice.x()) {
                    this.f44204t0.add(i4, partyBoxDevice);
                    break;
                }
                i4++;
            }
            if (size2 == this.f44204t0.size()) {
                this.f44204t0.add(partyBoxDevice);
            }
            if (this.f44204t0.size() > 0) {
                com.harman.log.f.a(f44129n1, "wifiDevicesLiveData triggered");
                T(this.f44205u0, this.f44204t0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1() {
        com.harman.log.f.a(f44129n1, "handlePermissionsScenario called");
        if (!I()) {
            s3(UiPage.BLUETOOTH_PERMISSION);
        } else if (J() && K()) {
            s3(UiPage.DISCOVERY);
        } else {
            s3(UiPage.LOCATION_PERMISSION);
        }
    }

    private final void N2(Context context, String str) {
        com.harman.jbl.partybox.utils.a aVar = new com.harman.jbl.partybox.utils.a();
        aVar.c(context, str);
        com.harman.log.f.a(f44129n1, "AWS Analytics Log file path : " + aVar.a());
    }

    private final void O1() {
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            r3.e eVar = new r3.e();
            eVar.f57453a = k12.n();
            eVar.f57454b = com.harman.sdk.utils.d.v(k12.q());
            eVar.f57455c = k12.q();
            eVar.f57456d = k12.w();
            eVar.f57457e = ((PartyBoxDevice) k12).n1();
            r3.c.e(eVar);
        }
    }

    private final boolean P1(HmDevice hmDevice) {
        if (!com.harman.sdk.utils.d.Q(hmDevice.q())) {
            return false;
        }
        F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
        com.harman.log.f.a(f44129n1, "isAuthorized device: " + p2(partyBoxDevice));
        if (!hmDevice.Q() && !hmDevice.R()) {
            return false;
        }
        if ((!partyBoxDevice.F1() || !partyBoxDevice.B1() || R1(partyBoxDevice)) && !hmDevice.O()) {
            return false;
        }
        return true;
    }

    private final void Q0() {
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null) {
            k4.a(false);
        }
        u(this.f44184f1);
    }

    private final void R0(LinkedList<HmDevice> linkedList) {
        List V5;
        List V52;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(linkedList);
        if (arrayList.isEmpty()) {
            com.harman.log.f.a(f44129n1, "MainViewModel filterOutStereo deviceList is empty");
            return;
        }
        List<HmDevice> n12 = n1(arrayList);
        if (n12 != null && n12.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : n12) {
                HmDevice hmDevice = (HmDevice) obj;
                if (hmDevice.O() && com.harman.jbl.partybox.ui.party.stereo.D.f45020a.a(hmDevice)) {
                    arrayList2.add(obj);
                }
            }
            V5 = D.V5(arrayList2);
            if (V5.size() >= 2) {
                com.harman.jbl.partybox.h.f40556a.b(this.f44174a1, V5);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : n12) {
                if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.a((HmDevice) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            V52 = D.V5(arrayList3);
            if (V52.size() >= 2) {
                com.harman.jbl.partybox.h.f40556a.b(this.f44178c1, V52);
                return;
            }
            return;
        }
        com.harman.log.f.a(f44129n1, "MainViewModel filterOutStereo list is empty");
    }

    private final boolean R1(PartyBoxDevice partyBoxDevice) {
        String k4 = partyBoxDevice.k();
        if (k4 != null && k4.length() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean U1(String str) {
        List<String> list = this.f44171Z;
        boolean z3 = false;
        if (list == null || (list != null && list.size() == 0)) {
            return false;
        }
        com.harman.log.f.a(f44129n1, "MainViewModel everConnectedDeviceMacList:" + this.f44171Z);
        List<String> list2 = this.f44171Z;
        String str2 = null;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (F.g((String) next, str)) {
                    str2 = next;
                    break;
                }
            }
            str2 = str2;
        }
        if (str2 == null || str2.length() == 0) {
            z3 = true;
        }
        return true ^ z3;
    }

    private final Context Z0() {
        ActivityC0889g activityC0889g = this.f38307I.get();
        if (activityC0889g != null) {
            return activityC0889g.getApplicationContext();
        }
        return null;
    }

    private final void e2() {
        PartyBoxDevice partyBoxDevice;
        if (!T1()) {
            return;
        }
        HmDevice k12 = k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice == null) {
            return;
        }
        f44135t1 = L1.a.f(partyBoxDevice.i1().j());
        Bundle b4 = C0741d.b(C2122h0.a(L1.a.f1655u, com.harman.sdk.utils.d.v(partyBoxDevice.q())), C2122h0.a(L1.a.f1671y, com.harman.sdk.utils.j.b(partyBoxDevice.n())), C2122h0.a(L1.a.f1677z1, f44135t1), C2122h0.a(L1.a.u3, Integer.valueOf(com.harman.jbl.partybox.c.f38305O)));
        com.harman.log.f.a(f44129n1, "BLE_LOG event_setting_daisy_chain_status called");
        n2(L1.a.f1636q, b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(o this$0) {
        F.p(this$0, "this$0");
        this$0.q2();
        this$0.d2();
    }

    private final List<Pair<String, String>> i1(PartyBoxDevice partyBoxDevice) {
        int b02;
        String str;
        List<C2054a> b4 = com.harman.jbl.partybox.ui.lightshow.c.f43994n.a().b(partyBoxDevice);
        b02 = C2109w.b0(b4, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (C2054a c2054a : b4) {
            String g4 = com.harman.jbl.partybox.utils.c.f46169a.g(c2054a.h().g());
            if (c2054a.g()) {
                str = "on";
            } else {
                str = "off";
            }
            arrayList.add(new Pair(g4, str));
        }
        return arrayList;
    }

    private final void i2(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(L1.a.f1655u, str);
        bundle.putString(L1.a.f1659v, str2);
        K1.a.a(L1.a.f1581f, bundle);
    }

    private final void j2(int i4) {
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1659v, q1(k12));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1456B, k12.w());
            bundle.putInt(L1.a.f1452A, i4);
            K1.a.a(L1.a.f1576e, bundle);
        }
    }

    private final void l3(List<? extends HmDevice> list, boolean z3) {
        Collection H3;
        List D4;
        if (z3) {
            List<HmDevice> f4 = this.f44203s0.f();
            if (f4 == null) {
                H3 = CollectionsKt__CollectionsKt.H();
            } else {
                H3 = new ArrayList();
                for (Object obj : f4) {
                    if (((HmDevice) obj) instanceof PartyLightDevice) {
                        H3.add(obj);
                    }
                }
            }
            P<List<HmDevice>> p4 = this.f44203s0;
            D4 = D.D4(list, H3);
            U(p4, D4);
            return;
        }
        U(this.f44203s0, list);
    }

    static /* synthetic */ void m3(o oVar, List list, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        oVar.l3(list, z3);
    }

    private final List<HmDevice> n1(Collection<? extends HmDevice> collection) {
        if (collection.isEmpty()) {
            com.harman.log.f.a(f44129n1, "MainViewModel getMoreThenOneSamePid deviceModels:size =0 ");
            return null;
        }
        Stream<? extends HmDevice> stream = collection.stream();
        final g gVar = new MutablePropertyReference1Impl() { // from class: com.harman.jbl.partybox.ui.main.o.g
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.l
            public void W(@l3.e Object obj, @l3.e Object obj2) {
                ((HmDevice) obj).n0((String) obj2);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.p
            @l3.e
            public Object get(@l3.e Object obj) {
                return ((HmDevice) obj).q();
            }
        };
        Map map = (Map) stream.collect(Collectors.groupingBy(new Function() { // from class: com.harman.jbl.partybox.ui.main.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String o12;
                o12 = o.o1(X2.l.this, obj);
                return o12;
            }
        }));
        F.m(map);
        Object obj = "";
        for (Map.Entry entry : map.entrySet()) {
            if (((List) entry.getValue()).size() >= 2 && com.harman.sdk.utils.d.H((String) entry.getKey())) {
                obj = entry.getKey();
                F.o(obj, "<get-key>(...)");
            }
        }
        com.harman.log.f.a(f44129n1, "MainViewModel getMoreThenOneSamePid targetPid:" + obj + " ");
        if (((CharSequence) obj).length() <= 0) {
            return null;
        }
        return (List) map.get(obj);
    }

    private final void n3(HmDevice hmDevice) {
        String str;
        HmDevice k12;
        if (k1() != null) {
            HmDevice k13 = k1();
            if (k13 != null) {
                str = k13.n();
            } else {
                str = null;
            }
            if (F.g(str, hmDevice.n()) && (k12 = k1()) != null) {
                U(this.f44166W0, k12.n());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o1(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return (String) tmp0.C(obj);
    }

    private final void o3() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f44187h0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (P1((HmDevice) obj)) {
                arrayList2.add(obj);
            }
        }
        com.harman.log.f.a(f44129n1, "MainViewModel BLE_LOG Refresh Product updateMyProductList:" + arrayList2);
        m3(this, arrayList2, false, 2, null);
    }

    private final String p2(PartyBoxDevice partyBoxDevice) {
        return partyBoxDevice.n() + " isConnectable:" + partyBoxDevice.Q() + ",hadGroupId:" + com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(partyBoxDevice) + ",tws:" + partyBoxDevice.M() + ",isStandbyMode:" + partyBoxDevice.F1() + ",isEverConnected:" + partyBoxDevice.B1() + ",isA2dpConnected:" + partyBoxDevice.O() + ",isConnected:" + partyBoxDevice.R();
    }

    private final void p3(HmDevice hmDevice) {
        List<String> list;
        if (hmDevice != null) {
            U1.a.a(hmDevice);
            List<String> list2 = this.f44171Z;
            if (list2 != null && !list2.contains(hmDevice.n()) && (list = this.f44171Z) != null) {
                list.add(hmDevice.n());
            }
        }
    }

    private final String x0(PartyBoxDevice partyBoxDevice) {
        String str;
        String n4 = partyBoxDevice.n();
        com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
        boolean l4 = d4.l(partyBoxDevice);
        PartyConnectStatus i12 = partyBoxDevice.i1();
        TWSInfo M3 = partyBoxDevice.M();
        if (M3 != null) {
            str = M3.a();
        } else {
            str = null;
        }
        return n4 + ",hadGroupId:" + l4 + ",partyConnectMode:" + i12 + ",tws:" + str + ",isStandbyMode:" + partyBoxDevice.F1() + ",isEverConnected:" + partyBoxDevice.B1() + ",isA2dpConnected:" + partyBoxDevice.O() + ",isConnected:" + partyBoxDevice.R() + ",isPartyConnect:" + d4.o(partyBoxDevice);
    }

    @l3.e
    public final HmDevice A1(@l3.d String deviceMacAddress) {
        F.p(deviceMacAddress, "deviceMacAddress");
        LinkedList<HmDevice> linkedList = this.f44187h0;
        com.harman.log.f.a(f44129n1, "BLE_LOG deviceList is : " + linkedList);
        if (linkedList != null) {
            Iterator<HmDevice> it = linkedList.iterator();
            while (it.hasNext()) {
                HmDevice next = it.next();
                if (F.g(next.n(), deviceMacAddress)) {
                    com.harman.log.f.a(f44129n1, "BLE_LOG Device found in deviceList is : " + next.n());
                    return next;
                }
            }
            return null;
        }
        return null;
    }

    @l3.d
    public final LiveData<Boolean> B1() {
        return this.f44195l0;
    }

    public final void B2(@l3.d String renamedString) {
        F.p(renamedString, "renamedString");
        HmDevice k12 = k1();
        if (k12 != null) {
            k12.m0(renamedString);
            z2.e e4 = com.harman.sdk.b.f47608a.e(k12);
            if (e4 != null) {
                e4.G(k12, renamedString, this.f44188h1);
            }
            U(this.f44137B0, renamedString);
        }
        l2(L1.a.f1604j2, C0741d.a());
    }

    @l3.d
    public final P<PartyBoxDevice> C1() {
        return this.f44165W;
    }

    public final void C2() {
        com.harman.log.f.a(f44129n1, "MainViewModel powerOffDevice");
        l2(L1.a.f1526S1, new Bundle());
        this.f44153Q = true;
        H0();
        HmDevice k12 = k1();
        if (k12 != null) {
            z2.j i4 = com.harman.sdk.b.f47608a.i(k12);
            if (i4 != null) {
                i4.Y(k12, this.f44188h1);
            }
            C2323l.f(k0.a(this), null, null, new j(null), 3, null);
        }
    }

    @l3.d
    public final P<Boolean> D1() {
        return this.f44163V;
    }

    @l3.e
    public final String E1(@l3.e HmDevice hmDevice) {
        TWSInfo M3;
        String str = null;
        if (hmDevice != null && (M3 = hmDevice.M()) != null) {
            String n4 = hmDevice.n();
            String a4 = M3.a();
            if (a4 != null) {
                String substring = a4.substring(0, 2);
                F.o(substring, "substring(...)");
                if (substring != null) {
                    str = substring.toUpperCase();
                    F.o(str, "toUpperCase(...)");
                }
            }
            String str2 = n4 + str;
            String b4 = M3.b();
            if (b4 != null && b4.length() != 0) {
                str = M3.b();
            } else {
                str = com.harman.jbl.partybox.persistence.a.f42065a.k(str2);
            }
            com.harman.log.f.a(f44129n1, "MainViewModel updateTwsInfo get>>> key:" + str2 + " groupName:" + str);
        }
        return str;
    }

    public final void F0(@l3.e X2.l<? super Map<String, RemoteOTAConfig.WhatsNewItem>, H0> lVar) {
        T(this.f44190i1, new Pair(Boolean.FALSE, ""));
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            C0((PartyBoxDevice) k12, lVar);
        }
    }

    @l3.d
    public final LiveData<H0> F1() {
        return this.f44154Q0;
    }

    @l3.d
    public final LiveData<UiPage> G1() {
        return this.f44191j0;
    }

    @l3.d
    public final LiveData<Boolean> H1() {
        return this.f44177c0;
    }

    @l3.d
    public final LiveData<Boolean> I1() {
        return this.f44197m0;
    }

    @l3.d
    public final LiveData<List<HmDevice>> J1() {
        return this.f44205u0;
    }

    @l3.d
    public final LiveData<List<HmDevice>> K0() {
        return this.f44203s0;
    }

    public final void K1(boolean z3) {
        com.harman.log.f.a(f44129n1, "MainViewModel handleBTUnPairState");
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        B2.c k4 = bVar.k();
        if (k4 != null) {
            k4.d();
        }
        HmDevice k12 = k1();
        if (k12 != null) {
            com.harman.log.f.a(f44129n1, "MainViewModel disconnect device : " + k12.n());
            com.harman.sdk.impl.connect.i c4 = bVar.c(k12);
            if (c4 != null) {
                c4.k(k12);
            }
            com.harman.sdk.impl.connect.i c5 = bVar.c(k12);
            if (c5 != null) {
                c5.h("", "");
            }
        }
        if (z3) {
            com.harman.log.f.a(f44129n1, "MainViewModel shouldClearDeviceModel is true. So clear deviceModels List.");
            this.f44187h0.clear();
            m3(this, this.f44187h0, false, 2, null);
        }
    }

    public final void K2(@l3.d String deviceMac) {
        F.p(deviceMac, "deviceMac");
        com.harman.log.f.a(f44129n1, "MainViewModel removeOfflineDevice :" + deviceMac);
        if (deviceMac.length() == 0) {
            return;
        }
        T(this.f44210z0, deviceMac);
    }

    public final void L2() {
        com.harman.log.f.a(f44129n1, "requestLocationPermission called");
        T(this.f44139D0, H0.f51801a);
    }

    public final void M2(boolean z3) {
        T(this.f44160T0, Boolean.valueOf(z3));
    }

    public final void N0(@l3.d String deviceMacAddress) {
        F.p(deviceMacAddress, "deviceMacAddress");
        com.harman.log.f.a(f44129n1, "doSomeThingConnectBefore>>> deviceMacAddress = " + deviceMacAddress);
        H0();
        k3(A1(deviceMacAddress));
        HmDevice k12 = k1();
        if (k12 != null) {
            com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
            z2.e e4 = bVar.e(k12);
            if (e4 != null) {
                e4.m(this.f44188h1);
            }
            com.harman.sdk.impl.connect.i c4 = bVar.c(k12);
            if (c4 != null) {
                c4.c(this.f44186g1);
            }
        }
    }

    public final boolean N1() {
        return this.f44179d0;
    }

    @Override // com.harman.jbl.partybox.c
    public void O() {
        z2.e e4;
        super.O();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f44188h1);
        }
    }

    public final void O0(@l3.d String deviceMacAddress) {
        F.p(deviceMacAddress, "deviceMacAddress");
        com.harman.log.f.a(f44129n1, "doSomeThingConnectFail>>> deviceMacAddress = " + deviceMacAddress);
        HmDevice k12 = k1();
        if (k12 != null) {
            String v3 = com.harman.sdk.utils.d.v(k12.q());
            F.o(v3, "getProductModelName(...)");
            i2(v3, q1(k12));
        }
        I0();
    }

    public final void O2(boolean z3) {
        T(this.f44158S0, Boolean.valueOf(z3));
    }

    @Override // com.harman.jbl.partybox.c
    public void P() {
        super.P();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null) {
            com.harman.log.f.a(f44129n1, "BLE_LOG  onResume -  registerGlobalListener");
            z2.e e4 = com.harman.sdk.b.f47608a.e(hmDevice);
            if (e4 != null) {
                e4.m(this.f44188h1);
            }
        }
    }

    public final void P0(@l3.d String deviceMacAddress) {
        F.p(deviceMacAddress, "deviceMacAddress");
        com.harman.log.f.a(f44129n1, "doSomeThingConnectSuccess>>> deviceMacAddress = " + deviceMacAddress);
        k3(A1(deviceMacAddress));
        HmDevice k12 = k1();
        if (k12 != null) {
            com.harman.log.f.a(f44129n1, "BLE_LOG ConnectedDeviceMac address is " + k12.n());
            com.harman.jbl.partybox.persistence.a.F("PREFERENCE_KEY_DEVICE_MAC_ADDRESS", k12.n(), k12.n());
            B2.c k4 = com.harman.sdk.b.f47608a.k();
            if (k4 != null) {
                k4.d();
            }
            this.f44169Y = System.currentTimeMillis();
            p3(k12);
            U(this.f44208x0, new Pair(k12.n(), Boolean.TRUE));
        }
    }

    public final void P2(@l3.d LiveData<Pair<Color, ColorMode>> liveData) {
        F.p(liveData, "<set-?>");
        this.f44148M0 = liveData;
    }

    @l3.d
    public final LiveData<Boolean> Q1() {
        return this.f44198n0;
    }

    public final void Q2(boolean z3) {
        T(this.f44201q0, Boolean.valueOf(z3));
    }

    public final void R2() {
        RemoteOTAConfig remoteOTAConfig;
        HmDevice hmDevice = this.f38309K;
        if (hmDevice != null) {
            remoteOTAConfig = hmDevice.H();
        } else {
            remoteOTAConfig = null;
        }
        A2(remoteOTAConfig);
    }

    @l3.d
    public final LiveData<Boolean> S0() {
        return this.f44158S0;
    }

    @l3.d
    public final LiveData<Boolean> S1() {
        return this.f44202r0;
    }

    public final void S2(boolean z3) {
        this.f44179d0 = z3;
    }

    public final int T0() {
        return com.harman.jbl.partybox.c.f38305O;
    }

    public final boolean T1() {
        HmDevice k12 = k1();
        if (k12 != null) {
            return com.harman.sdk.utils.d.c0(k12.q());
        }
        return false;
    }

    public final void T2(boolean z3) {
        U(this.f44181e0, Boolean.valueOf(z3));
    }

    @l3.d
    public final LiveData<H0> U0() {
        return this.f44150O0;
    }

    public final void U2(boolean z3) {
        T(this.f44199o0, Boolean.valueOf(z3));
    }

    @l3.d
    public final LiveData<Pair<String, Boolean>> V0() {
        return this.f44209y0;
    }

    public final boolean V1() {
        return this.f44153Q;
    }

    public final void V2(@l3.d P<Map<LightElements, Boolean>> p4) {
        F.p(p4, "<set-?>");
        this.f44146K0 = p4;
    }

    @l3.d
    public final LiveData<Pair<String, Boolean>> W0() {
        return this.f44207w0;
    }

    @l3.d
    public final LiveData<Boolean> W1() {
        return this.f44183f0;
    }

    public final void W2(@l3.d Context context) {
        F.p(context, "context");
        com.harman.log.f.a(f44129n1, "setLocationPermissionGranted called");
        M1();
        com.harman.jbl.partybox.persistence.a.f42065a.v(false);
    }

    @l3.d
    public final LiveData<Pair<Color, ColorMode>> X0() {
        return this.f44148M0;
    }

    @l3.d
    public final LiveData<Boolean> X1() {
        return this.f44200p0;
    }

    public final void X2(@l3.d LiveData<Pair<Boolean, String>> liveData) {
        F.p(liveData, "<set-?>");
        this.f44196l1 = liveData;
    }

    @l3.d
    public final LiveData<HmDevice> Y0() {
        return this.f44156R0;
    }

    public final boolean Y1() {
        return this.f44155R;
    }

    public final void Y2(@l3.d LiveData<Pair<Boolean, String>> liveData) {
        F.p(liveData, "<set-?>");
        this.f44192j1 = liveData;
    }

    public final void Z(@l3.d ActivityC0889g fragmentActivity) {
        F.p(fragmentActivity, "fragmentActivity");
        super.F(fragmentActivity);
    }

    public final boolean Z1() {
        HmDevice k12 = k1();
        if (k12 != null) {
            return com.harman.sdk.utils.d.l0(k12.q());
        }
        return false;
    }

    public final void Z2(@l3.d LiveData<String> liveData) {
        F.p(liveData, "<set-?>");
        this.f44138C0 = liveData;
    }

    public final int a1() {
        ActivityC0889g activityC0889g = this.f38307I.get();
        if (activityC0889g != null && (activityC0889g instanceof MainActivityNav)) {
            int Y02 = ((MainActivityNav) activityC0889g).Y0();
            com.harman.log.f.a(f44129n1, "getCurrentTabIndex:" + Y02);
            return Y02;
        }
        return 0;
    }

    public final void a2(@l3.d Context context) {
        F.p(context, "context");
        com.harman.log.f.a(f44129n1, "locationPermissionDenied called");
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        if (aVar.m(false)) {
            s3(UiPage.PERMISSION_INFO);
        }
        if (this.f44159T >= 1) {
            aVar.v(true);
        }
        this.f44159T++;
    }

    public final void a3(boolean z3) {
        this.f44157S = z3;
    }

    @l3.d
    public final LiveData<String> b1() {
        return this.f44172Z0;
    }

    public final void b2() {
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1673y1, L1.a.d(((PartyBoxDevice) k12).T0()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            com.harman.log.f.a(f44129n1, "BLE_LOG event_setting_power_status called");
            n2(L1.a.f1641r, bundle);
        }
    }

    public final void b3(@l3.d Color color, @l3.d ColorMode colorMode) {
        F.p(color, "color");
        F.p(colorMode, "colorMode");
        com.harman.jbl.partybox.h.f40556a.b(this.f44147L0, new Pair(color, colorMode));
    }

    @l3.d
    public final com.harman.sdk.c c1() {
        return this.f44185g0;
    }

    public final void c2(@l3.d PartyConnectStatus partyConnectStatus) {
        F.p(partyConnectStatus, "partyConnectStatus");
        if (T1()) {
            if (partyConnectStatus.f().length() > 0 && partyConnectStatus == PartyConnectStatus.PARTY_CONNECT_WIRED) {
                if (!F.g(f44135t1, "on")) {
                    Bundle bundle = new Bundle();
                    bundle.putString(L1.a.f1522R1, "on");
                    l2(L1.a.f1599i2, bundle);
                }
                f44135t1 = "on";
                return;
            }
            if (!F.g(f44135t1, "off")) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(L1.a.f1522R1, "off");
                l2(L1.a.f1599i2, bundle2);
            }
            f44135t1 = "off";
        }
    }

    public final void c3(boolean z3) {
        T(this.f44195l0, Boolean.valueOf(z3));
    }

    @l3.d
    public final LinkedList<HmDevice> d1() {
        return this.f44187h0;
    }

    public final void d2() {
        if (Z1()) {
            C2323l.f(k0.a(this), null, null, new h(null), 3, null);
        }
    }

    public final void d3(@l3.d P<PartyBoxDevice> p4) {
        F.p(p4, "<set-?>");
        this.f44165W = p4;
    }

    @l3.d
    public final LiveData<String> e1() {
        return this.f44168X0;
    }

    public final void e3(@l3.d P<Boolean> p4) {
        F.p(p4, "<set-?>");
        this.f44163V = p4;
    }

    @l3.d
    public final LiveData<H0> f1() {
        return this.f44152P0;
    }

    public final void f2() {
        String str;
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            Context Z02 = Z0();
            if (Z02 != null) {
                if (com.harman.jbl.partybox.utils.c.f46169a.d(Z02)) {
                    str = L1.a.f1650s3;
                } else {
                    str = L1.a.t3;
                }
                bundle.putString(L1.a.f1663w, str);
            }
            if (k12 instanceof PartyBoxDevice) {
                bundle.putString(L1.a.f1667x, L1.a.e(((PartyBoxDevice) k12).T0()));
            }
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_DEVICE_DASHBOARD called");
            n2(L1.a.f1596i, bundle);
        }
    }

    public final void f3(boolean z3) {
        com.harman.jbl.partybox.h.f40556a.b(this.f44175b0, Boolean.valueOf(z3));
    }

    public final void g1(@l3.d PartyBoxDevice device) {
        z2.m l4;
        F.p(device, "device");
        if (device.P1() && !com.harman.sdk.utils.d.G(device) && (l4 = com.harman.sdk.b.f47608a.l(device)) != null) {
            l4.r(device, this.f44188h1);
        }
    }

    public final void g2() {
        String str;
        if (this.f38311M != null) {
            com.harman.log.f.a(f44129n1, "BLE_LOG logDashboardEvent called");
            f44132q1 = true;
            HmDevice hmDevice = this.f38311M;
            if (hmDevice == null || (str = hmDevice.n()) == null) {
                str = "";
            }
            f44131p1 = str;
            f2();
            v2();
            w2();
            s2();
            o2();
            r2();
            e2();
            b2();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.main.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.h2(o.this);
                }
            }, C0909k.f15658a);
        }
    }

    public final void g3(boolean z3) {
        T(this.f44197m0, Boolean.valueOf(z3));
    }

    public final boolean h1() {
        return this.f44179d0;
    }

    public final void h3() {
        com.harman.log.f.a(f44129n1, "MainViewModel Start Scan");
        Q0();
    }

    public final void i3() {
        com.harman.log.f.a(f44129n1, "MainViewModel Start startScanAfterOTA");
        Q0();
    }

    @l3.d
    public final P<Map<LightElements, Boolean>> j1() {
        return this.f44146K0;
    }

    public final void j3() {
        Q(this.f44184f1);
    }

    @l3.e
    public final HmDevice k1() {
        return this.f38311M;
    }

    public final void k2(@l3.d String actionType, @l3.d Bundle bundle) {
        F.p(actionType, "actionType");
        F.p(bundle, "bundle");
        bundle.putString("di_action_type", actionType);
        bundle.putInt(L1.a.u3, com.harman.jbl.partybox.c.f38305O);
        K1.a.a(L1.a.f1514P1, bundle);
    }

    public final void k3(@l3.e HmDevice hmDevice) {
        com.harman.log.f.a(f44129n1, "BLE_LOG  switchMainDevice - " + hmDevice);
        this.f38311M = hmDevice;
        if (hmDevice == null) {
            com.harman.log.f.a(f44129n1, "BLE_LOG  switchMainDevice device is null");
        }
    }

    @l3.d
    public final LiveData<H0> l1() {
        return this.f44164V0;
    }

    public final void l2(@l3.d String actionType, @l3.d Bundle bundle) {
        F.p(actionType, "actionType");
        F.p(bundle, "bundle");
        bundle.putString("di_action_type", actionType);
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
        }
        bundle.putInt(L1.a.u3, com.harman.jbl.partybox.c.f38305O);
        K1.a.a(L1.a.f1514P1, bundle);
    }

    @l3.d
    public final LiveData<Pair<Boolean, String>> m1() {
        return this.f44196l1;
    }

    public final void m2(@l3.d String actionType, @l3.d String actionItem, @l3.d Bundle bundle) {
        F.p(actionType, "actionType");
        F.p(actionItem, "actionItem");
        F.p(bundle, "bundle");
        bundle.putString(L1.a.f1522R1, actionItem);
        bundle.putInt(L1.a.u3, com.harman.jbl.partybox.c.f38305O);
        l2(actionType, bundle);
    }

    public final void n2(@l3.d String eventName, @l3.d Bundle bundle) {
        String str;
        F.p(eventName, "eventName");
        F.p(bundle, "bundle");
        HmDevice hmDevice = this.f38311M;
        if (hmDevice == null) {
            return;
        }
        if (hmDevice == null || (str = hmDevice.n()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, Boolean> hashMap = this.f44173a0.get(str);
        if (hashMap != null) {
            Boolean bool = hashMap.get(eventName);
            if (bool != null && bool.booleanValue()) {
                kotlin.jvm.internal.W w3 = kotlin.jvm.internal.W.f52310a;
                String format = String.format("logEventSetting  %s repeat report  event %s", Arrays.copyOf(new Object[]{str, eventName}, 2));
                F.o(format, "format(...)");
                com.harman.log.f.a(f44129n1, "MainViewModel FIREBASE_LOG : " + format);
                return;
            }
            hashMap.put(eventName, Boolean.TRUE);
            kotlin.jvm.internal.W w4 = kotlin.jvm.internal.W.f52310a;
            String format2 = String.format("logEventSetting  %s report different event %s", Arrays.copyOf(new Object[]{str, eventName}, 2));
            F.o(format2, "format(...)");
            com.harman.log.f.a(f44129n1, "MainViewModel FIREBASE_LOG : " + format2);
        } else {
            HashMap<String, Boolean> hashMap2 = new HashMap<>();
            hashMap2.put(eventName, Boolean.TRUE);
            this.f44173a0.put(str, hashMap2);
            kotlin.jvm.internal.W w5 = kotlin.jvm.internal.W.f52310a;
            String format3 = String.format("logEventSetting  %s first report %s", Arrays.copyOf(new Object[]{str, eventName}, 2));
            F.o(format3, "format(...)");
            com.harman.log.f.a(f44129n1, "MainViewModel FIREBASE_LOG : " + format3);
        }
        K1.a.a(eventName, bundle);
    }

    public final void o2() {
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            Iterator<T> it = i1((PartyBoxDevice) k12).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                bundle.putString((String) pair.e(), (String) pair.f());
            }
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_TOP_PANEL_LIGHT_SHOW called");
            n2(L1.a.f1651t, bundle);
        }
    }

    @l3.d
    public final LiveData<Pair<Boolean, String>> p1() {
        return this.f44192j1;
    }

    @l3.d
    public final String q1(@l3.d HmDevice device) {
        F.p(device, "device");
        int i4 = b.f44212b[device.F().ordinal()];
        if (i4 == 1) {
            return L1.a.f1561b;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return L1.a.f1561b;
            }
            return L1.a.f1571d;
        }
        return L1.a.f1566c;
    }

    public final void q2() {
        int i4;
        int i5;
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            bundle.putInt(L1.a.f1633p1, partyBoxDevice.d1());
            KaraokeMicEQInfo Y02 = partyBoxDevice.Y0();
            int i6 = 0;
            if (Y02 != null) {
                i4 = Y02.a();
            } else {
                i4 = 0;
            }
            bundle.putInt(L1.a.f1638q1, i4);
            KaraokeMicEQInfo Y03 = partyBoxDevice.Y0();
            if (Y03 != null) {
                i5 = Y03.c();
            } else {
                i5 = 0;
            }
            bundle.putInt(L1.a.f1643r1, i5);
            KaraokeMicEQInfo Y04 = partyBoxDevice.Y0();
            if (Y04 != null) {
                i6 = Y04.b();
            }
            bundle.putInt(L1.a.f1648s1, i6);
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_KARAOKE_STATUS called");
            n2(L1.a.f1626o, bundle);
        }
    }

    public final void q3() {
        this.f44179d0 = true;
    }

    @l3.d
    public final LiveData<String> r1() {
        return this.f44136A0;
    }

    public final void r2() {
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_LIGHT_CONTROLS called");
            n2(L1.a.f1606k, com.harman.jbl.partybox.utils.c.f46169a.e((PartyBoxDevice) k12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r3(@l3.e com.harman.sdk.device.HmDevice r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L62
            com.harman.sdk.message.TWSInfo r0 = r5.M()
            if (r0 == 0) goto L62
            java.lang.String r5 = r5.n()
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto L29
            r2 = 0
            r3 = 2
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.F.o(r1, r2)
            if (r1 == 0) goto L29
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.F.o(r1, r2)
            goto L2a
        L29:
            r1 = 0
        L2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = r0.b()
            if (r0 == 0) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MainViewModel updateTwsInfo set>>> key:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " groupName:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MainViewModel"
            com.harman.log.f.a(r2, r1)
            com.harman.jbl.partybox.persistence.a r1 = com.harman.jbl.partybox.persistence.a.f42065a
            r1.E(r5, r0)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.main.o.r3(com.harman.sdk.device.HmDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0
    public void s() {
        super.s();
        com.harman.jbl.partylight.lib.f.f46571a.a().f(this.f44182e1);
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        bVar.w(this.f44185g0);
        com.harman.log.f.a(f44129n1, "stopScan 5");
        j3();
        HmDevice k12 = k1();
        if (k12 != null) {
            com.harman.log.f.a(f44129n1, "MainViewModel disconnectDevice : " + k12.n());
            com.harman.sdk.impl.connect.i c4 = bVar.c(k12);
            if (c4 != null) {
                c4.k(k12);
            }
        }
    }

    @l3.d
    public final LiveData<String> s1() {
        return this.f44138C0;
    }

    public final void s2() {
        Integer num;
        LightPattern a4;
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            com.harman.jbl.partybox.utils.c cVar = com.harman.jbl.partybox.utils.c.f46169a;
            PartyBoxLightShowSettings h12 = ((PartyBoxDevice) k12).h1();
            if (h12 != null && (a4 = h12.a()) != null) {
                num = Integer.valueOf(a4.g());
            } else {
                num = null;
            }
            bundle.putString(L1.a.f1563b1, cVar.h(num));
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_LIGHT_SHOW called");
            n2(L1.a.f1601j, bundle);
        }
    }

    public final void s3(@l3.d UiPage newUiPage) {
        F.p(newUiPage, "newUiPage");
        com.harman.log.f.a(f44129n1, "MainViewModel updateUIPage newUiPage: " + newUiPage + ", currentPage: " + this.f44189i0.f());
        if (newUiPage == UiPage.BLUETOOTH_PERMISSION || newUiPage == UiPage.LOCATION_PERMISSION) {
            k3(null);
        }
        if (this.f44189i0.f() != newUiPage) {
            U(this.f44189i0, newUiPage);
        }
    }

    @l3.d
    public final LiveData<Boolean> t1() {
        return this.f44142G0;
    }

    public final void t2(int i4, @l3.d String firmwareVersion, @l3.d String targetVersion, @l3.d String result) {
        F.p(firmwareVersion, "firmwareVersion");
        F.p(targetVersion, "targetVersion");
        F.p(result, "result");
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            bundle.putString(L1.a.f1456B, firmwareVersion);
            bundle.putString(L1.a.f1460C, targetVersion);
            if (i4 > 0) {
                bundle.putInt(L1.a.f1468E, i4);
            }
            bundle.putString(L1.a.f1464D, result);
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_OTA_RESULT called");
            K1.a.a(L1.a.f1591h, bundle);
        }
    }

    @l3.d
    public final LiveData<Boolean> u1() {
        return this.f44144I0;
    }

    public final void u2() {
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            bundle.putString(L1.a.f1456B, k12.w());
            bundle.putString(L1.a.f1460C, ((PartyBoxDevice) k12).p1());
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_OTA_STARTED called");
            K1.a.a(L1.a.f1586g, bundle);
        }
    }

    @l3.d
    public final LiveData<H0> v1() {
        return this.f44140E0;
    }

    public final void v2() {
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            String a4 = L1.a.a(k12.c());
            bundle.putString(L1.a.f1665w1, a4);
            f44133r1 = a4;
            bundle.putInt(L1.a.f1669x1, ((PartyBoxDevice) k12).t1());
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_PLAYER_STATUS called");
            n2(L1.a.f1621n, bundle);
        }
    }

    @l3.d
    public final LiveData<Boolean> w1() {
        return this.f44160T0;
    }

    public final void w2() {
        String str;
        Bundle bundle = new Bundle();
        HmDevice k12 = k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            if (((PartyBoxDevice) k12).i1() == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
                if (k12.i().i() == AudioChannel.NONE_CHANNEL.i()) {
                    str = "party";
                } else {
                    str = "stereo";
                }
            } else {
                str = "off";
            }
            bundle.putString(L1.a.f1454A1, str);
            com.harman.log.f.a(f44129n1, "BLE_LOG EVENT_SETTING_TWS_STATUS called");
            n2(L1.a.f1646s, bundle);
        }
    }

    public final boolean x1() {
        return this.f44157S;
    }

    public final void x2() {
        this.f44155R = true;
    }

    public final void y0() {
        com.harman.log.f.a(f44129n1, "checkAllPermission called");
        if (I() && J() && K()) {
            s3(UiPage.DISCOVERY);
        }
    }

    @l3.d
    public final LiveData<List<HmDevice>> y1() {
        return this.f44176b1;
    }

    public final void y2() {
        U(this.f44154Q0, H0.f51801a);
    }

    public final void z0() {
        String str;
        String str2;
        com.harman.log.f.a(f44129n1, "BLE_LOG checkAndDisplayDashboard");
        if (a1() == 0) {
            Pair<String, Boolean> f4 = this.f44208x0.f();
            if (f4 != null) {
                str = f4.e();
            } else {
                str = null;
            }
            HmDevice k12 = k1();
            if (k12 != null) {
                str2 = k12.n();
            } else {
                str2 = null;
            }
            if (F.g(str, str2) && f4 != null && !f4.f().booleanValue()) {
                com.harman.log.f.a(f44129n1, "MainViewModel updateUIPage current device ble not connect");
                return;
            }
            HmDevice k13 = k1();
            if (k13 != null && com.harman.jbl.partybox.ui.party.b.f44881a.g(k13)) {
                com.harman.log.f.a(f44129n1, "MainViewModel updateUIPage current device is standby");
                return;
            } else {
                com.harman.log.f.a(f44129n1, "MainViewModel updateUIPage:UiPage.DASHBOARD>>>1");
                C2323l.f(k0.a(this), null, null, new c(null), 3, null);
            }
        }
        if (k1() != null) {
            com.harman.log.f.a(f44129n1, "BLE_LOG connectEndTime : " + this.f44169Y);
            com.harman.log.f.a(f44129n1, "BLE_LOG connectStartTime : " + this.f44167X);
            long j4 = (long) 1000;
            com.harman.log.f.a(f44129n1, "BLE_LOG duration : " + ((this.f44169Y - this.f44167X) / j4));
            long j5 = (this.f44169Y - this.f44167X) / j4;
            if (j5 > 1) {
                j5 = 1;
            }
            j2((int) j5);
            A0();
        }
    }

    @l3.d
    public final LiveData<List<HmDevice>> z1() {
        return this.f44180d1;
    }

    public final void z2(@l3.d String deviceMAC) {
        F.p(deviceMAC, "deviceMAC");
        U(this.f44170Y0, deviceMAC);
    }
}
