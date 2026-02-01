package com.harman.jbl.partybox.ui.party;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.os.C0741d;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import com.harman.jbl.partybox.c;
import com.harman.jbl.partybox.ui.party.auracast.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.PartyConnectStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C2122h0;
import kotlin.Result;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import kotlinx.coroutines.InterfaceC2333q;
import l3.d;
import l3.e;

@U({"SMAP\nPartyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n766#2:203\n857#2,2:204\n288#2,2:206\n1855#2,2:208\n*S KotlinDebug\n*F\n+ 1 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n74#1:203\n74#1:204,2\n78#1:206,2\n86#1:208,2\n*E\n"})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final long f44882b = 20000;

    /* renamed from: c, reason: collision with root package name */
    public static final long f44883c = 60000;

    /* renamed from: d, reason: collision with root package name */
    public static final long f44884d = 30000;

    /* renamed from: e, reason: collision with root package name */
    public static final long f44885e = 30000;

    /* renamed from: f, reason: collision with root package name */
    public static final long f44886f = 40000;

    /* renamed from: g, reason: collision with root package name */
    public static final long f44887g = 10000;

    /* renamed from: i, reason: collision with root package name */
    public static final long f44889i = 100;

    /* renamed from: j, reason: collision with root package name */
    public static final long f44890j = 2500;

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f44881a = new b();

    /* renamed from: h, reason: collision with root package name */
    private static final long f44888h = 180000;

    private b() {
    }

    private final Bundle b(Bundle bundle, HmDevice hmDevice) {
        if (hmDevice == null) {
            return bundle;
        }
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
        return bundle;
    }

    public final boolean a(@d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        if (!f(hmDevice) && !g(hmDevice) && c(hmDevice)) {
            return true;
        }
        return false;
    }

    public final boolean c(@d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        if (!hmDevice.R() && !hmDevice.Q()) {
            return false;
        }
        return true;
    }

    @e
    public final HmDevice d(@d List<? extends HmDevice> list) {
        Object obj;
        Object G22;
        F.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((HmDevice) obj2).O()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.f44854a.s((HmDevice) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        HmDevice hmDevice = (HmDevice) obj;
        if (hmDevice == null) {
            G22 = D.G2(arrayList);
            return (HmDevice) G22;
        }
        return hmDevice;
    }

    public final long e() {
        return f44888h;
    }

    public final boolean f(@d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        PartyConnectStatus partyConnectStatus = PartyConnectStatus.PARTY_CONNECT_WIRED;
        PartyConnectStatus partyConnectStatus2 = null;
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            partyConnectStatus2 = partyBoxDevice.i1();
        }
        if (partyConnectStatus == partyConnectStatus2) {
            return true;
        }
        return false;
    }

    public final boolean g(@d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice == null || true != partyBoxDevice.F1()) {
            return false;
        }
        return true;
    }

    @d
    public final String h(@d Collection<? extends HmDevice> collection) {
        F.p(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        for (HmDevice hmDevice : collection) {
            sb.append("{\n");
            sb.append(f44881a.t(hmDevice));
            sb.append("\n}\n");
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public final void i(@d String actionItem, @e HmDevice hmDevice) {
        F.p(actionItem, "actionItem");
        K1.a.a(L1.a.f1514P1, b(C0741d.b(C2122h0.a("di_action_type", L1.a.f1662v2), C2122h0.a(L1.a.f1522R1, actionItem), C2122h0.a(L1.a.u3, Integer.valueOf(c.f38305O))), hmDevice));
    }

    public final void j(@d String actionItem) {
        F.p(actionItem, "actionItem");
        K1.a.a(L1.a.f1514P1, C0741d.b(C2122h0.a("di_action_type", L1.a.f1658u2), C2122h0.a(L1.a.f1522R1, actionItem), C2122h0.a(L1.a.u3, Integer.valueOf(c.f38305O))));
    }

    public final void k(@d String actionItem, @e HmDevice hmDevice) {
        F.p(actionItem, "actionItem");
        K1.a.a(L1.a.f1514P1, b(C0741d.b(C2122h0.a("di_action_type", L1.a.f1666w2), C2122h0.a(L1.a.f1522R1, actionItem), C2122h0.a(L1.a.u3, Integer.valueOf(c.f38305O))), hmDevice));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <S, T> void l(@d N<S> n4, @d LiveData<T> source, @d Q<? super T> onChanged) {
        F.p(n4, "<this>");
        F.p(source, "source");
        F.p(onChanged, "onChanged");
        n4.t(source);
        n4.s(source, onChanged);
    }

    public final <T> void m(@d InterfaceC2333q<? super T> interfaceC2333q, T t3) {
        F.p(interfaceC2333q, "<this>");
        if (interfaceC2333q.c()) {
            Result.a aVar = Result.f51807F;
            interfaceC2333q.x(Result.b(t3));
        }
    }

    public final boolean n(@e HmDevice hmDevice, @e HmDevice hmDevice2) {
        String str;
        String str2;
        String str3;
        String str4;
        PartyBoxDevice partyBoxDevice;
        PartyConnectStatus partyConnectStatus;
        PartyBoxDevice partyBoxDevice2;
        if (!o(hmDevice, hmDevice2)) {
            return false;
        }
        PartyConnectStatus partyConnectStatus2 = null;
        if (hmDevice != null) {
            str = hmDevice.p();
        } else {
            str = null;
        }
        if (hmDevice2 != null) {
            str2 = hmDevice2.p();
        } else {
            str2 = null;
        }
        if (!F.g(str, str2)) {
            return false;
        }
        if (hmDevice != null) {
            str3 = hmDevice.q();
        } else {
            str3 = null;
        }
        if (hmDevice2 != null) {
            str4 = hmDevice2.q();
        } else {
            str4 = null;
        }
        if (!F.g(str3, str4)) {
            return false;
        }
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            partyConnectStatus = partyBoxDevice.i1();
        } else {
            partyConnectStatus = null;
        }
        if (hmDevice2 instanceof PartyBoxDevice) {
            partyBoxDevice2 = (PartyBoxDevice) hmDevice2;
        } else {
            partyBoxDevice2 = null;
        }
        if (partyBoxDevice2 != null) {
            partyConnectStatus2 = partyBoxDevice2.i1();
        }
        if (partyConnectStatus != partyConnectStatus2) {
            return false;
        }
        return true;
    }

    public final boolean o(@e HmDevice hmDevice, @e HmDevice hmDevice2) {
        String str;
        String str2 = null;
        if (hmDevice != null) {
            str = hmDevice.n();
        } else {
            str = null;
        }
        if (hmDevice2 != null) {
            str2 = hmDevice2.n();
        }
        return p(str, str2);
    }

    public final boolean p(@e String str, @e String str2) {
        boolean S12;
        boolean S13;
        boolean K12;
        if (str != null) {
            S12 = z.S1(str);
            if (!S12 && str2 != null) {
                S13 = z.S1(str2);
                if (!S13) {
                    K12 = z.K1(str, str2, true);
                    if (K12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean q(@d HmDevice hmDevice, @d HmDevice target) {
        boolean S12;
        boolean K12;
        F.p(hmDevice, "<this>");
        F.p(target, "target");
        S12 = z.S1(hmDevice.q());
        if (!S12) {
            K12 = z.K1(hmDevice.q(), target.q(), true);
            return K12;
        }
        return false;
    }

    public final void r(@d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            partyBoxDevice.s2(PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED);
        }
    }

    public final void s(@d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null) {
            partyBoxDevice.s2(PartyConnectStatus.PARTY_CONNECT_OFF);
        }
    }

    @d
    public final String t(@d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        String str;
        String str2;
        PartyConnectStatus i12;
        F.p(hmDevice, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(" dev.name[" + hmDevice.p() + "]");
        sb.append(" MAC[" + hmDevice.n() + "]");
        sb.append(" BLE[" + hmDevice.g() + "]");
        sb.append(" BT.connect[" + hmDevice.O() + "]");
        sb.append(" BLE.connect[" + hmDevice.R() + "]");
        sb.append(" isStandbyMode[" + g(hmDevice) + "]");
        sb.append(" isConnectable[" + hmDevice.Q() + "]");
        sb.append(" role[" + hmDevice.J() + "]");
        sb.append(" channel[" + hmDevice.i().f() + "]");
        String str3 = null;
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice != null && (i12 = partyBoxDevice.i1()) != null) {
            str = i12.f();
        } else {
            str = null;
        }
        sb.append(" connect.state[" + str + "]");
        TWSInfo M3 = hmDevice.M();
        if (M3 != null) {
            str2 = M3.a();
        } else {
            str2 = null;
        }
        sb.append(" GroupId[" + str2 + "]");
        TWSInfo M4 = hmDevice.M();
        if (M4 != null) {
            str3 = M4.b();
        }
        sb.append(" GroupName[" + str3 + "]");
        sb.append(" touch.ts[" + hmDevice.x() + "]");
        o oVar = o.f44854a;
        sb.append(" support Auracast[" + oVar.v(hmDevice) + "]");
        sb.append(" disable Auracast[" + oVar.r(hmDevice) + "]");
        sb.append(" Auracast status[" + oVar.p(hmDevice) + "]");
        sb.append(" isMaster[" + oVar.s(hmDevice) + "]");
        sb.append(" isSlave[" + oVar.t(hmDevice) + "]");
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public final void u(@d DialogFragment dialogFragment) {
        Window window;
        WindowManager.LayoutParams attributes;
        Window window2;
        F.p(dialogFragment, "<this>");
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.dimAmount = 0.0f;
            Dialog dialog2 = dialogFragment.getDialog();
            if (dialog2 != null) {
                window2 = dialog2.getWindow();
            } else {
                window2 = null;
            }
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
    }
}
