package com.harman.jbl.partybox.ui.dashboard.lightshow;

import a2.AbstractC0557b;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import c2.C1008a;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.partybox.h;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.CustomLightPattern;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C2109w;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;
import z2.i;

@U({"SMAP\nLightShowControlViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowControlViewModel.kt\ncom/harman/jbl/partybox/ui/dashboard/lightshow/LightShowControlViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,480:1\n1549#2:481\n1620#2,3:482\n1549#2:485\n1620#2,3:486\n*S KotlinDebug\n*F\n+ 1 LightShowControlViewModel.kt\ncom/harman/jbl/partybox/ui/dashboard/lightshow/LightShowControlViewModel\n*L\n128#1:481\n128#1:482,3\n243#1:485\n243#1:486,3\n*E\n"})
/* loaded from: classes2.dex */
public final class f extends com.harman.jbl.partybox.c {

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    public static final a f43287h0 = new a(null);

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private static final String f43288i0 = "LightShowControlViewModel";

    /* renamed from: P, reason: collision with root package name */
    private boolean f43289P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f43290Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f43291R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private g f43292S;

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private ArrayList<C1008a> f43293T;

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f43294U;

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private final P<List<C1008a>> f43295V;

    /* renamed from: W, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f43296W;

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f43297X;

    /* renamed from: Y, reason: collision with root package name */
    @l3.e
    private LightPattern f43298Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f43299Z;

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private final P<Pair<List<Drawable>, Boolean>> f43300a0;

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    private LiveData<Pair<List<Drawable>, Boolean>> f43301b0;

    /* renamed from: c0, reason: collision with root package name */
    @l3.d
    private final P<List<AbstractC0557b>> f43302c0;

    /* renamed from: d0, reason: collision with root package name */
    @l3.d
    private final P<Pair<Color, ColorMode>> f43303d0;

    /* renamed from: e0, reason: collision with root package name */
    @l3.d
    private Color f43304e0;

    /* renamed from: f0, reason: collision with root package name */
    @l3.d
    private ColorMode f43305f0;

    /* renamed from: g0, reason: collision with root package name */
    @l3.d
    private final z2.d f43306g0;

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
        public static final /* synthetic */ int[] f43307a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43308b;

        static {
            int[] iArr = new int[LightElements.values().length];
            try {
                iArr[LightElements.LIGHT_STROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LightElements.LIGHT_EIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LightElements.LIGHT_SIDE_RING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LightElements.LIGHT_STRIPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LightElements.LIGHT_STAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LightElements.LIGHT_EDGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f43307a = iArr;
            int[] iArr2 = new int[MessageID.values().length];
            try {
                iArr2[MessageID.LIGHT_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f43308b = iArr2;
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
            com.harman.log.f.a(f.f43288i0, "Message onRead = " + msg);
            f.this.t0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            com.harman.log.f.a(f.f43288i0, "Message onChanged = " + msg);
            f.this.t0(device, code, msg);
        }
    }

    public f() {
        P<Boolean> p4 = new P<>();
        this.f43290Q = p4;
        this.f43291R = p4;
        this.f43292S = new g();
        this.f43293T = new ArrayList<>();
        this.f43294U = new P<>();
        this.f43295V = new P<>();
        P<Boolean> p5 = new P<>();
        this.f43296W = p5;
        this.f43297X = p5;
        this.f43299Z = com.harman.sdk.utils.c.f48436e;
        P<Pair<List<Drawable>, Boolean>> p6 = new P<>();
        this.f43300a0 = p6;
        this.f43301b0 = p6;
        this.f43302c0 = new P<>();
        this.f43303d0 = new P<>();
        this.f43304e0 = new Color(255, 255, 255);
        this.f43305f0 = ColorMode.COLOR_LOOP;
        this.f43306g0 = new c();
    }

    public static /* synthetic */ void K0(f fVar, HmDevice hmDevice, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        fVar.J0(hmDevice, z3);
    }

    private final void L0(HmDevice hmDevice, LightPattern lightPattern) {
        if (hmDevice != null) {
            com.harman.log.f.a(f43288i0, "setPatternChange, Connected Device = " + hmDevice.n() + " LightPattern = " + lightPattern);
            PartyBoxLightShowSettings h12 = ((PartyBoxDevice) hmDevice).h1();
            if (h12 != null) {
                h12.o(lightPattern);
            }
            this.f43298Y = lightPattern;
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.P(hmDevice, lightPattern, null);
            }
        }
        Bundle bundle = new Bundle();
        String i4 = lightPattern.i();
        Locale ENGLISH = Locale.ENGLISH;
        F.o(ENGLISH, "ENGLISH");
        String lowerCase = i4.toLowerCase(ENGLISH);
        F.o(lowerCase, "toLowerCase(...)");
        bundle.putString(L1.a.f1484I, lowerCase);
        o.f44128m1.j(lowerCase);
        y0(hmDevice, bundle);
    }

    private final void M0() {
        int b02;
        C1008a h4;
        com.harman.log.f.a(f43288i0, "updateCurrentLightPattern");
        ArrayList<C1008a> arrayList = this.f43293T;
        b02 = C2109w.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (C1008a c1008a : arrayList) {
            if (c1008a.j() == this.f43298Y) {
                h4 = C1008a.h(c1008a, null, 0, 0, 0, null, true, 31, null);
            } else {
                h4 = C1008a.h(c1008a, null, 0, 0, 0, null, false, 31, null);
            }
            arrayList2.add(h4);
        }
        this.f43293T.clear();
        this.f43293T.addAll(arrayList2);
        h.f40556a.b(this.f43295V, arrayList2);
    }

    private final void W(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("di_action_type", L1.a.f1538V1);
        bundle.putInt(L1.a.w3, com.harman.jbl.partybox.c.f38305O);
        bundle.putString(L1.a.f1522R1, L1.a.f1480H);
        bundle.putString(L1.a.f1484I, str);
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(str2));
        K1.a.a(L1.a.f1514P1, bundle);
    }

    private final LightPattern Y(PartyBoxDevice partyBoxDevice) {
        LightPattern lightPattern;
        PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
        com.harman.log.f.a(f43288i0, "getActivePattern partyBoxLightShowSettings:" + h12);
        if (h12 != null) {
            lightPattern = h12.a();
        } else {
            lightPattern = null;
        }
        LightPattern lightPattern2 = LightPattern.OFF;
        if (lightPattern == lightPattern2 && partyBoxDevice.E1(partyBoxDevice)) {
            LightPattern lightPattern3 = this.f43298Y;
            if (lightPattern3 == null) {
                return lightPattern2;
            }
            return lightPattern3;
        }
        if (h12 == null) {
            return null;
        }
        return h12.a();
    }

    private final boolean r0(Map<LightElements, Boolean> map) {
        for (Map.Entry<LightElements, Boolean> entry : map.entrySet()) {
            if (entry.getKey() == LightElements.LIGHT_EIGHT) {
                return entry.getValue().booleanValue();
            }
        }
        return false;
    }

    private final void s0(HmDevice hmDevice) {
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        List<CustomLightPattern> l4 = new com.harman.jbl.partybox.ui.lightshow.custompattern.a().l(aVar.i());
        com.harman.log.f.a(f43288i0, "onShuffleButtonAction lightPatternsList:" + l4);
        x0(hmDevice, l4);
        aVar.C(l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            MessageID b4 = baseMessage.b();
            if (b4 != null && b.f43308b[b4.ordinal()] == 1) {
                com.harman.log.f.a(f43288i0, "Received LIGHT_STATUS, msg = " + baseMessage + " device = " + hmDevice.J());
                h.f40556a.b(this.f43296W, Boolean.TRUE);
            }
        }
    }

    private final void w0() {
        androidx.localbroadcastmanager.content.a.b(E0.a()).d(new Intent(LightShowControlDialogFragment.EVENT_LIGHT_CARD_CHANGED_320));
    }

    private final void x0(HmDevice hmDevice, List<CustomLightPattern> list) {
        if (hmDevice != null) {
            com.harman.log.f.a(f43288i0, "sendCustomLightPatternToDUT, Connected Device = " + hmDevice.n() + " lightPatternList = " + list);
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.p0(hmDevice, list, null);
            }
        }
    }

    private final void y0(HmDevice hmDevice, Bundle bundle) {
        if (bundle != null && hmDevice != null) {
            bundle.putString("di_action_type", L1.a.f1538V1);
            bundle.putInt(L1.a.w3, com.harman.jbl.partybox.c.f38305O);
            bundle.putString(L1.a.f1522R1, L1.a.f1472F);
            LightPattern Y3 = Y((PartyBoxDevice) hmDevice);
            if (Y3 == null) {
                Y3 = LightPattern.OFF;
            }
            bundle.putString(L1.a.f1484I, com.harman.jbl.partybox.utils.c.f46169a.b(Integer.valueOf(Y3.g())));
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
            K1.a.a(L1.a.f1514P1, bundle);
        }
    }

    public final void A0(@l3.d Color value) {
        F.p(value, "value");
        if (F.g(value, new Color(0, 0, 0))) {
            value = new Color(255, 255, 255);
        }
        this.f43304e0 = value;
    }

    public final void B0(@l3.e HmDevice hmDevice, @l3.d Color updatedColor) {
        F.p(updatedColor, "updatedColor");
        if (hmDevice != null) {
            com.harman.log.f.a(f43288i0, "ColorPicker, Connected Device = " + hmDevice.n() + " Color = " + updatedColor);
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            A0(updatedColor);
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null) {
                h12.q(updatedColor);
                h12.r(ColorMode.STATIC_COLOR);
            }
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.L(hmDevice, updatedColor, null);
            }
            W(L1.a.f1524S, partyBoxDevice.q());
        }
    }

    public final void C0(@l3.d ColorMode colorMode) {
        F.p(colorMode, "<set-?>");
        this.f43305f0 = colorMode;
    }

    public final void D0(@l3.e HmDevice hmDevice) {
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        List<CustomLightPattern> i4 = aVar.i();
        com.harman.log.f.a(f43288i0, "setCustomLightShowOperation from SP:" + i4);
        if (i4 == null) {
            i4 = new com.harman.jbl.partybox.ui.lightshow.custompattern.a().l(i4);
            aVar.C(i4);
        }
        x0(hmDevice, i4);
    }

    public final void E0(@l3.d LiveData<Pair<List<Drawable>, Boolean>> liveData) {
        F.p(liveData, "<set-?>");
        this.f43301b0 = liveData;
    }

    public final void F0(@l3.d ArrayList<C1008a> arrayList) {
        F.p(arrayList, "<set-?>");
        this.f43293T = arrayList;
    }

    public final void G0(boolean z3) {
        this.f43289P = z3;
    }

    public final void H0(@l3.d g gVar) {
        F.p(gVar, "<set-?>");
        this.f43292S = gVar;
    }

    public final void I0(@l3.e HmDevice hmDevice) {
        if (hmDevice != null) {
            com.harman.log.f.a(f43288i0, "setLoopingOperation ColorLoop, Connected Device = " + hmDevice.n());
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null) {
                h12.r(ColorMode.COLOR_LOOP);
            }
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.j0(hmDevice, true, null);
            }
            W(L1.a.f1528T, partyBoxDevice.q());
        }
    }

    public final void J0(@l3.e HmDevice hmDevice, boolean z3) {
        i h4;
        com.harman.log.f.a(f43288i0, "LightShowControlViewModel setMainSwitch:" + z3);
        if (hmDevice != null && (h4 = com.harman.sdk.b.f47608a.h(hmDevice)) != null) {
            h4.n(hmDevice, z3, null);
        }
    }

    @l3.e
    public final LightPattern X() {
        return this.f43298Y;
    }

    @l3.d
    public final LiveData<Boolean> Z() {
        return this.f43294U;
    }

    @l3.d
    public final LiveData<List<C1008a>> a0() {
        return this.f43295V;
    }

    @l3.d
    public final Color b0() {
        return this.f43304e0;
    }

    @l3.d
    public final LiveData<Pair<Color, ColorMode>> c0() {
        return this.f43303d0;
    }

    @l3.d
    public final ColorMode d0() {
        return this.f43305f0;
    }

    public final void e0(@l3.d HmDevice device) {
        ColorMode d4;
        Color c4;
        F.p(device, "device");
        com.harman.log.f.a(f43288i0, "getColorPickerData, Connected Device = " + device.n());
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) device;
        PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
        if (h12 != null && (c4 = h12.c()) != null) {
            A0(c4);
        }
        PartyBoxLightShowSettings h13 = partyBoxDevice.h1();
        if (h13 != null && (d4 = h13.d()) != null) {
            this.f43305f0 = d4;
        }
        h.f40556a.b(this.f43303d0, new Pair(this.f43304e0, this.f43305f0));
    }

    @l3.d
    public final LiveData<Pair<List<Drawable>, Boolean>> f0() {
        return this.f43301b0;
    }

    @l3.d
    public final P<List<AbstractC0557b>> g0() {
        return this.f43302c0;
    }

    public final void h0(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.log.f.a(f43288i0, "getLightInfo, Connected Device = " + device.n());
        i h4 = com.harman.sdk.b.f47608a.h(device);
        if (h4 != null) {
            h4.a(device, this.f43306g0);
        }
    }

    @l3.d
    public final LiveData<Boolean> i0() {
        return this.f43297X;
    }

    public final void j0(@l3.e HmDevice hmDevice) {
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (this.f43293T.isEmpty()) {
                this.f43293T.addAll(com.harman.jbl.partybox.ui.lightshow.c.f43994n.a().c(partyBoxDevice));
            }
            this.f43298Y = Y(partyBoxDevice);
            M0();
        }
    }

    @l3.d
    public final ArrayList<C1008a> k0() {
        return this.f43293T;
    }

    public final void l0(@l3.e HmDevice hmDevice) {
        Map<LightElements, Boolean> map;
        int a4;
        com.harman.log.f.a(f43288i0, "getLightShowElementData");
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (partyBoxDevice.q().length() > 0) {
                String q4 = partyBoxDevice.q();
                a4 = C2220b.a(16);
                this.f43299Z = Integer.parseInt(q4, a4);
            }
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null) {
                map = h12.i();
            } else {
                map = null;
            }
            if (map != null && (!map.isEmpty())) {
                p0(map);
            } else {
                h.f40556a.b(this.f43302c0, new com.harman.jbl.partybox.ui.lightcontrol.c().t(this.f43299Z));
            }
        }
    }

    @l3.d
    public final g m0() {
        return this.f43292S;
    }

    public final void n0(@l3.e HmDevice hmDevice) {
        boolean z3;
        Map<LightElements, Boolean> i4;
        Boolean bool;
        F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
        PartyBoxLightShowSettings h12 = ((PartyBoxDevice) hmDevice).h1();
        if (h12 != null && (i4 = h12.i()) != null && (bool = i4.get(LightElements.MAIN_SWITCH)) != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        com.harman.log.f.a(f43288i0, "LightShowControlViewModel getMainSwitch:" + z3);
        h.f40556a.b(this.f43290Q, Boolean.valueOf(z3));
    }

    @l3.d
    public final LiveData<Boolean> o0() {
        return this.f43291R;
    }

    public final void p0(@l3.d Map<LightElements, Boolean> lightElementsMap) {
        int b02;
        boolean z3;
        F.p(lightElementsMap, "lightElementsMap");
        com.harman.log.f.a(f43288i0, "getUpdatedLightControlElements, lightElementsMap = " + lightElementsMap);
        List<AbstractC0557b> t3 = new com.harman.jbl.partybox.ui.lightcontrol.c().t(this.f43299Z);
        b02 = C2109w.b0(t3, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Object obj : t3) {
            if (obj instanceof a2.c) {
                a2.c cVar = (a2.c) obj;
                Boolean bool = lightElementsMap.get(cVar.f());
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    z3 = false;
                }
                obj = a2.c.e(cVar, null, 0, z3, 3, null);
            }
            arrayList.add(obj);
        }
        h.f40556a.b(this.f43302c0, arrayList);
    }

    public final boolean q0() {
        return this.f43289P;
    }

    public final void u0(@l3.e HmDevice hmDevice, @l3.d AbstractC0557b selectedElement) {
        String str;
        boolean z3;
        Map<LightElements, Boolean> i4;
        Map<LightElements, Boolean> i5;
        F.p(selectedElement, "selectedElement");
        o.f44128m1.j(null);
        if (hmDevice != null) {
            com.harman.log.f.a(f43288i0, "selectedElementDone, Connected Device = " + hmDevice.n() + " LightElementStatus = " + selectedElement);
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (selectedElement instanceof a2.c) {
                PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
                if (h12 != null && (i5 = h12.i()) != null) {
                    a2.c cVar = (a2.c) selectedElement;
                    i5.put(cVar.f(), Boolean.valueOf(cVar.h()));
                }
                a2.c cVar2 = (a2.c) selectedElement;
                if (cVar2.h()) {
                    str = "on";
                } else {
                    str = "off";
                }
                boolean E12 = partyBoxDevice.E1(hmDevice);
                String str2 = L1.a.f1488J;
                if (!E12 && cVar2.f() == LightElements.LIGHT_EIGHT) {
                    boolean h4 = cVar2.h();
                    LightPattern.a aVar = LightPattern.Companion;
                    this.f43298Y = aVar.a(h4 ? 1 : 0);
                    if (h4) {
                        PartyBoxLightShowSettings h13 = partyBoxDevice.h1();
                        if (h13 != null) {
                            h13.o(LightPattern.ROCK);
                        }
                    } else {
                        PartyBoxLightShowSettings h14 = partyBoxDevice.h1();
                        if (h14 != null) {
                            h14.o(LightPattern.OFF);
                        }
                    }
                    i h5 = com.harman.sdk.b.f47608a.h(hmDevice);
                    if (h5 != null) {
                        h5.P(hmDevice, aVar.a(h4 ? 1 : 0), null);
                    }
                } else {
                    com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
                    i h6 = bVar.h(hmDevice);
                    if (h6 != null) {
                        h6.A(hmDevice, cVar2.f(), cVar2.h(), null);
                    }
                    if (!partyBoxDevice.E1(hmDevice)) {
                        PartyBoxLightShowSettings h15 = partyBoxDevice.h1();
                        if (h15 != null && (i4 = h15.i()) != null) {
                            z3 = r0(i4);
                        } else {
                            z3 = false;
                        }
                        boolean h7 = cVar2.h();
                        if (!z3 && !h7) {
                            PartyBoxLightShowSettings h16 = partyBoxDevice.h1();
                            if (h16 != null) {
                                h16.o(LightPattern.OFF);
                            }
                            i h8 = bVar.h(hmDevice);
                            if (h8 != null) {
                                h8.P(hmDevice, LightPattern.Companion.a(h7 ? 1 : 0), null);
                            }
                        }
                    }
                    switch (b.f43307a[cVar2.f().ordinal()]) {
                        case 1:
                            str2 = L1.a.f1500M;
                            break;
                        case 2:
                            break;
                        case 3:
                            str2 = L1.a.f1512P;
                            break;
                        case 4:
                            str2 = L1.a.f1492K;
                            break;
                        case 5:
                            str2 = L1.a.f1496L;
                            break;
                        case 6:
                            str2 = "di_strobe_up_light_status";
                            break;
                        case 7:
                            str2 = L1.a.f1516Q;
                            break;
                        case 8:
                            str2 = L1.a.f1508O;
                            break;
                        default:
                            str2 = L1.a.f1520R;
                            break;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("di_action_type", L1.a.f1538V1);
                bundle.putInt(L1.a.w3, com.harman.jbl.partybox.c.f38305O);
                bundle.putString(L1.a.f1522R1, L1.a.f1476G);
                bundle.putString(L1.a.f1484I, ((Object) str2) + "_" + str);
                bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
                K1.a.a(L1.a.f1514P1, bundle);
            }
        }
    }

    public final void v0(@l3.d C1008a selectedLightShowCard, @l3.e HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        PartyBoxLightShowSettings h12;
        Map<LightElements, Boolean> map;
        F.p(selectedLightShowCard, "selectedLightShowCard");
        if (hmDevice != null) {
            com.harman.log.f.a(f43288i0, "selectedLightShowCard, Connected Device = " + hmDevice.n() + " selectedLightShowCard = " + selectedLightShowCard);
            LightPattern j4 = selectedLightShowCard.j();
            LightPattern lightPattern = LightPattern.CUSTOM;
            if (j4 == lightPattern && this.f43298Y == selectedLightShowCard.j()) {
                s0(hmDevice);
                h.f40556a.b(this.f43294U, Boolean.TRUE);
            }
            if (this.f43298Y != selectedLightShowCard.j()) {
                L0(hmDevice, selectedLightShowCard.j());
                if (this.f43298Y == lightPattern) {
                    D0(hmDevice);
                }
            }
            if (com.harman.sdk.utils.d.L(hmDevice.q()) && (h12 = (partyBoxDevice = (PartyBoxDevice) hmDevice).h1()) != null && h12.i() != null) {
                PartyBoxLightShowSettings h13 = partyBoxDevice.h1();
                if (h13 != null) {
                    map = h13.i();
                } else {
                    map = null;
                }
                F.m(map);
                for (Map.Entry<LightElements, Boolean> entry : map.entrySet()) {
                    if (entry.getKey() == LightElements.LIGHT_EIGHT) {
                        entry.setValue(Boolean.TRUE);
                        w0();
                    }
                }
            }
            M0();
        }
    }

    public final void z0(@l3.e LightPattern lightPattern) {
        this.f43298Y = lightPattern;
    }
}
