package g2;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.harman.jbl.partybox.h;
import com.harman.log.f;
import com.harman.sdk.b;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.LightPattern;
import f2.C2054a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;
import l3.d;
import l3.e;
import z2.i;

@U({"SMAP\nLightShowButtonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowButtonViewModel.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/viewmodel/LightShowButtonViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1549#2:82\n1620#2,2:83\n1622#2:86\n1#3:85\n*S KotlinDebug\n*F\n+ 1 LightShowButtonViewModel.kt\ncom/harman/jbl/partybox/ui/lightshowbutton/viewmodel/LightShowButtonViewModel\n*L\n37#1:82\n37#1:83,2\n37#1:86\n*E\n"})
/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2058a extends j0 {

    /* renamed from: J, reason: collision with root package name */
    @d
    public static final C0445a f50555J = new C0445a(null);

    /* renamed from: K, reason: collision with root package name */
    @d
    private static final String f50556K = "LightShowButtonViewModel";

    /* renamed from: H, reason: collision with root package name */
    @d
    private final P<PartyBoxDevice> f50557H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @d
    private final P<List<C2054a>> f50558I = new P<>();

    /* renamed from: g2.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0445a {
        public /* synthetic */ C0445a(C2197u c2197u) {
            this();
        }

        private C0445a() {
        }
    }

    private final LightPattern u(PartyBoxDevice partyBoxDevice) {
        LightPattern a4;
        PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
        if (h12 == null || (a4 = h12.a()) == null) {
            return LightPattern.OFF;
        }
        return a4;
    }

    @d
    public final LiveData<PartyBoxDevice> v() {
        return this.f50557H;
    }

    @d
    public final LiveData<List<C2054a>> w() {
        return this.f50558I;
    }

    public final void x(@d HmDevice device) {
        F.p(device, "device");
        i h4 = b.f47608a.h(device);
        if (h4 != null) {
            h4.a(device, null);
        }
    }

    public final void y(@e HmDevice hmDevice) {
        int a4;
        int b02;
        List Y5;
        Object obj;
        C2054a f4;
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            f.a(f50556K, "setLightShowButtonData called ");
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 == null) {
                return;
            }
            com.harman.jbl.partybox.ui.lightshowbutton.d dVar = com.harman.jbl.partybox.ui.lightshowbutton.d.f44050a;
            String q4 = partyBoxDevice.q();
            a4 = C2220b.a(16);
            List<C2054a> g4 = dVar.g(Integer.parseInt(q4, a4));
            b02 = C2109w.b0(g4, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (C2054a c2054a : g4) {
                Iterator<T> it = h12.f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((LightPattern) obj) == c2054a.h()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (((LightPattern) obj) != null && (f4 = C2054a.f(c2054a, null, 0, 0, false, 7, null)) != null) {
                    c2054a = f4;
                }
                arrayList.add(c2054a);
            }
            Y5 = D.Y5(arrayList);
            h.f40556a.b(this.f50558I, Y5);
        }
    }

    public final void z(@e HmDevice hmDevice, @d LightPattern pattern, boolean z3) {
        F.p(pattern, "pattern");
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            i h4 = b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.J(hmDevice, pattern, z3, null);
            }
            Bundle bundle = new Bundle();
            bundle.putString("di_action_type", L1.a.f1574d2);
            bundle.putString(L1.a.f1522R1, L1.a.f1469E0);
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(partyBoxDevice.q()));
            K1.a.a(L1.a.f1514P1, bundle);
        }
    }
}
