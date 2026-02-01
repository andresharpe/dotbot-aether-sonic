package b2;

import a2.AbstractC0557b;
import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.partybox.h;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.widget.x;
import com.harman.sdk.b;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C2109w;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;
import l3.d;
import l3.e;
import z2.i;

@U({"SMAP\nLightControlViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightControlViewModel.kt\ncom/harman/jbl/partybox/ui/lightcontrol/viewmodel/LightControlViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1549#2:272\n1620#2,3:273\n800#2,11:276\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 LightControlViewModel.kt\ncom/harman/jbl/partybox/ui/lightcontrol/viewmodel/LightControlViewModel\n*L\n78#1:272\n78#1:273,3\n261#1:276,11\n262#1:287\n262#1:288,2\n263#1:290\n263#1:291,3\n*E\n"})
/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1004a extends j0 {

    /* renamed from: H, reason: collision with root package name */
    private List<? extends AbstractC0557b> f21151H;

    /* renamed from: I, reason: collision with root package name */
    private int f21152I = c.f48436e;

    /* renamed from: J, reason: collision with root package name */
    @d
    private final P<Pair<List<Drawable>, Boolean>> f21153J;

    /* renamed from: K, reason: collision with root package name */
    @d
    private LiveData<Pair<List<Drawable>, Boolean>> f21154K;

    /* renamed from: L, reason: collision with root package name */
    @d
    private final P<List<AbstractC0557b>> f21155L;

    /* renamed from: M, reason: collision with root package name */
    @e
    private LightPattern f21156M;

    /* renamed from: b2.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0194a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21157a;

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
                iArr[LightElements.LIGHT_STROBE_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LightElements.LIGHT_EDGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f21157a = iArr;
        }
    }

    public C1004a() {
        P<Pair<List<Drawable>, Boolean>> p4 = new P<>();
        this.f21153J = p4;
        this.f21154K = p4;
        this.f21155L = new P<>();
    }

    private final boolean C(Map<LightElements, Boolean> map) {
        for (Map.Entry<LightElements, Boolean> entry : map.entrySet()) {
            if (entry.getKey() == LightElements.LIGHT_EIGHT) {
                return entry.getValue().booleanValue();
            }
        }
        return false;
    }

    private final void H() {
        List<LightElements> y3 = y(this.f21155L.f());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{Color.parseColor("#80646383"), Color.parseColor("#595E6B99")});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(x.a(10));
        ArrayList arrayList = new ArrayList();
        arrayList.add(gradientDrawable);
        com.harman.jbl.partybox.ui.lightcontrol.c cVar = new com.harman.jbl.partybox.ui.lightcontrol.c();
        Application a4 = E0.a();
        F.o(a4, "getApp(...)");
        int i4 = this.f21152I;
        F.m(y3);
        arrayList.addAll(cVar.b(a4, i4, y3));
        h.f40556a.b(this.f21153J, new Pair(arrayList, Boolean.valueOf(!y3.isEmpty())));
    }

    private final LightPattern v(PartyBoxDevice partyBoxDevice) {
        LightPattern a4;
        PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
        if (h12 == null || (a4 = h12.a()) == null) {
            return LightPattern.OFF;
        }
        return a4;
    }

    private final List<LightElements> y(List<? extends AbstractC0557b> list) {
        int b02;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof a2.c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((a2.c) obj2).h()) {
                    arrayList2.add(obj2);
                }
            }
            b02 = C2109w.b0(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(b02);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((a2.c) it.next()).f());
            }
            return arrayList3;
        }
        return null;
    }

    public final void A(@d Map<LightElements, Boolean> lightElementsMap) {
        int b02;
        boolean z3;
        F.p(lightElementsMap, "lightElementsMap");
        List<AbstractC0557b> t3 = new com.harman.jbl.partybox.ui.lightcontrol.c().t(this.f21152I);
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
        h.f40556a.b(this.f21155L, arrayList);
        H();
    }

    public final boolean B() {
        if (y(this.f21155L.f()) == null || !(!r0.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void D(@e HmDevice hmDevice, @d AbstractC0557b selectedElement) {
        Map<LightElements, Boolean> i4;
        String str;
        boolean z3;
        Map<LightElements, Boolean> i5;
        Map<LightElements, Boolean> i6;
        F.p(selectedElement, "selectedElement");
        o.f44128m1.j(null);
        if (hmDevice != null) {
            T1.a.a("BLE_LOG LightControls, Connected Device = " + hmDevice + " LightElementStatus = " + selectedElement);
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (selectedElement instanceof a2.c) {
                PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
                if (h12 != null && (i6 = h12.i()) != null) {
                    a2.c cVar = (a2.c) selectedElement;
                    i6.put(cVar.f(), Boolean.valueOf(cVar.h()));
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
                    this.f21156M = aVar.a(h4 ? 1 : 0);
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
                    i h5 = b.f47608a.h(hmDevice);
                    if (h5 != null) {
                        h5.P(hmDevice, aVar.a(h4 ? 1 : 0), null);
                    }
                } else {
                    b bVar = b.f47608a;
                    i h6 = bVar.h(hmDevice);
                    if (h6 != null) {
                        h6.A(hmDevice, cVar2.f(), cVar2.h(), null);
                    }
                    if (!partyBoxDevice.E1(hmDevice)) {
                        PartyBoxLightShowSettings h15 = partyBoxDevice.h1();
                        if (h15 != null && (i5 = h15.i()) != null) {
                            z3 = C(i5);
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
                    switch (C0194a.f21157a[cVar2.f().ordinal()]) {
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
                            str2 = L1.a.f1508O;
                            break;
                        case 8:
                            str2 = L1.a.f1516Q;
                            break;
                        default:
                            str2 = L1.a.f1520R;
                            break;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("di_action_type", L1.a.f1538V1);
                bundle.putString(L1.a.f1522R1, L1.a.f1476G);
                bundle.putString(L1.a.f1484I, ((Object) str2) + "_" + str);
                bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(partyBoxDevice.q()));
                K1.a.a(L1.a.f1514P1, bundle);
            }
            PartyBoxLightShowSettings h17 = partyBoxDevice.h1();
            if (h17 != null && (i4 = h17.i()) != null) {
                A(i4);
            }
        }
    }

    public final void E(@e LightPattern lightPattern) {
        this.f21156M = lightPattern;
    }

    public final void F(@d LiveData<Pair<List<Drawable>, Boolean>> liveData) {
        F.p(liveData, "<set-?>");
        this.f21154K = liveData;
    }

    public final void G(@e HmDevice hmDevice, @d LightPattern pattern) {
        F.p(pattern, "pattern");
        F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
    }

    @e
    public final LightPattern u() {
        return this.f21156M;
    }

    public final void w(@e HmDevice hmDevice) {
        Map<LightElements, Boolean> map;
        int a4;
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            if (partyBoxDevice.q().length() > 0) {
                String q4 = partyBoxDevice.q();
                a4 = C2220b.a(16);
                this.f21152I = Integer.parseInt(q4, a4);
            }
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null) {
                map = h12.i();
            } else {
                map = null;
            }
            if (map != null && (!map.isEmpty())) {
                A(map);
            } else {
                h.f40556a.b(this.f21155L, new com.harman.jbl.partybox.ui.lightcontrol.c().t(this.f21152I));
            }
            this.f21156M = v(partyBoxDevice);
            H();
        }
    }

    @d
    public final LiveData<Pair<List<Drawable>, Boolean>> x() {
        return this.f21154K;
    }

    @d
    public final P<List<AbstractC0557b>> z() {
        return this.f21155L;
    }
}
