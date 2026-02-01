package d2;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import c2.C1008a;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.partybox.h;
import com.harman.jbl.partybox.ui.lightcontrol.view.LightControlFragment;
import com.harman.jbl.partybox.ui.lightshow.c;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.b;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.CustomLightPattern;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C2109w;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;
import z2.i;

@U({"SMAP\nLightShowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowViewModel.kt\ncom/harman/jbl/partybox/ui/lightshow/viewmodel/LightShowViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1549#2:215\n1620#2,3:216\n*S KotlinDebug\n*F\n+ 1 LightShowViewModel.kt\ncom/harman/jbl/partybox/ui/lightshow/viewmodel/LightShowViewModel\n*L\n197#1:215\n197#1:216,3\n*E\n"})
/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2045a extends j0 {

    /* renamed from: M, reason: collision with root package name */
    @d
    public static final C0440a f50195M = new C0440a(null);

    /* renamed from: N, reason: collision with root package name */
    @d
    private static final String f50196N = "LightShowViewModel";

    /* renamed from: H, reason: collision with root package name */
    private boolean f50197H;

    /* renamed from: J, reason: collision with root package name */
    @e
    private LightPattern f50199J;

    /* renamed from: I, reason: collision with root package name */
    @d
    private ArrayList<C1008a> f50198I = new ArrayList<>();

    /* renamed from: K, reason: collision with root package name */
    @d
    private final P<Boolean> f50200K = new P<>();

    /* renamed from: L, reason: collision with root package name */
    @d
    private final P<List<C1008a>> f50201L = new P<>();

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0440a {
        public /* synthetic */ C0440a(C2197u c2197u) {
            this();
        }

        private C0440a() {
        }
    }

    private final void E(HmDevice hmDevice, List<CustomLightPattern> list) {
        i h4;
        if (hmDevice != null && (h4 = b.f47608a.h(hmDevice)) != null) {
            h4.p0(hmDevice, list, null);
        }
    }

    private final void F(HmDevice hmDevice, Bundle bundle) {
        if (bundle != null && hmDevice != null) {
            bundle.putString("di_action_type", L1.a.f1538V1);
            bundle.putString(L1.a.f1522R1, L1.a.f1472F);
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
            K1.a.a(L1.a.f1514P1, bundle);
        }
    }

    private final void M() {
        int b02;
        C1008a h4;
        ArrayList<C1008a> arrayList = this.f50198I;
        b02 = C2109w.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        for (C1008a c1008a : arrayList) {
            if (c1008a.j() == this.f50199J) {
                h4 = C1008a.h(c1008a, null, 0, 0, 0, null, true, 31, null);
            } else {
                h4 = C1008a.h(c1008a, null, 0, 0, 0, null, false, 31, null);
            }
            arrayList2.add(h4);
        }
        this.f50198I.clear();
        this.f50198I.addAll(arrayList2);
        h.f40556a.b(this.f50201L, arrayList2);
    }

    private final LightPattern v(PartyBoxDevice partyBoxDevice) {
        LightPattern lightPattern;
        PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
        if (h12 != null) {
            lightPattern = h12.a();
        } else {
            lightPattern = null;
        }
        LightPattern lightPattern2 = LightPattern.OFF;
        if (lightPattern == lightPattern2 && partyBoxDevice.E1(partyBoxDevice)) {
            LightPattern lightPattern3 = this.f50199J;
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

    public final boolean A() {
        return this.f50197H;
    }

    public final void B(@e HmDevice hmDevice) {
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        List<CustomLightPattern> l4 = new com.harman.jbl.partybox.ui.lightshow.custompattern.a().l(aVar.i());
        T1.a.a("LightShowViewModel lightPatternsList:" + l4);
        E(hmDevice, l4);
        aVar.C(l4);
    }

    public final void C(@d C1008a selectedLightShowCard, @e HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        PartyBoxLightShowSettings h12;
        Map<LightElements, Boolean> map;
        F.p(selectedLightShowCard, "selectedLightShowCard");
        if (hmDevice != null) {
            LightPattern j4 = selectedLightShowCard.j();
            LightPattern lightPattern = LightPattern.CUSTOM;
            if (j4 == lightPattern && this.f50199J == selectedLightShowCard.j()) {
                B(hmDevice);
                h.f40556a.b(this.f50200K, Boolean.TRUE);
            }
            if (this.f50199J != selectedLightShowCard.j()) {
                L(hmDevice, selectedLightShowCard.j());
                if (this.f50199J == lightPattern) {
                    I(hmDevice);
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
                        D();
                    }
                }
            }
            M();
        }
    }

    public final void D() {
        androidx.localbroadcastmanager.content.a.b(E0.a()).d(new Intent(LightControlFragment.EVENT_LIGHT_CARD_CHANGED_310));
    }

    public final void G(@e HmDevice hmDevice) {
        o.a aVar = o.f44128m1;
        if (!F.g(aVar.d(), L1.a.f1674y2)) {
            aVar.j(L1.a.f1674y2);
            Bundle bundle = new Bundle();
            bundle.putString(L1.a.f1484I, L1.a.f1674y2);
            F(hmDevice, bundle);
        }
    }

    public final void H(@e LightPattern lightPattern) {
        this.f50199J = lightPattern;
    }

    public final void I(@e HmDevice hmDevice) {
        com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
        List<CustomLightPattern> i4 = aVar.i();
        T1.a.a("LightShowViewModel lightPatternsList from SP:" + i4);
        if (i4 == null) {
            i4 = new com.harman.jbl.partybox.ui.lightshow.custompattern.a().l(i4);
            aVar.C(i4);
        }
        E(hmDevice, i4);
    }

    public final void J(@d ArrayList<C1008a> arrayList) {
        F.p(arrayList, "<set-?>");
        this.f50198I = arrayList;
    }

    public final void K(boolean z3) {
        this.f50197H = z3;
    }

    public final void L(@e HmDevice hmDevice, @d LightPattern pattern) {
        F.p(pattern, "pattern");
        if (hmDevice != null) {
            T1.a.a("BLE_LOG LightShow, Connected Device = " + hmDevice + " LightPattern = " + pattern);
            PartyBoxLightShowSettings h12 = ((PartyBoxDevice) hmDevice).h1();
            if (h12 != null) {
                h12.o(pattern);
            }
            this.f50199J = pattern;
            i h4 = b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.P(hmDevice, pattern, null);
            }
        }
        Bundle bundle = new Bundle();
        String i4 = pattern.i();
        Locale ENGLISH = Locale.ENGLISH;
        F.o(ENGLISH, "ENGLISH");
        String lowerCase = i4.toLowerCase(ENGLISH);
        F.o(lowerCase, "toLowerCase(...)");
        bundle.putString(L1.a.f1484I, lowerCase);
        o.f44128m1.j(lowerCase);
        F(hmDevice, bundle);
    }

    @e
    public final LightPattern u() {
        return this.f50199J;
    }

    @d
    public final LiveData<Boolean> w() {
        return this.f50200K;
    }

    @d
    public final LiveData<List<C1008a>> x() {
        return this.f50201L;
    }

    public final void y(@e HmDevice hmDevice) {
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            this.f50198I.clear();
            this.f50198I.addAll(c.f43994n.a().c(partyBoxDevice));
            this.f50199J = v(partyBoxDevice);
            M();
        }
    }

    @d
    public final ArrayList<C1008a> z() {
        return this.f50198I;
    }
}
