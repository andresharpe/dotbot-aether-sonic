package com.harman.jbl.partybox.ui.party.stereo;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.EnumSyncOnOff;
import com.harman.sdk.utils.PartyConnectStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.collections.C2108v;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.P;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.random.Random;
import kotlin.text.C2221c;

@U({"SMAP\nStereoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoUtils.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,407:1\n288#2,2:408\n1855#2,2:410\n766#2:412\n857#2,2:413\n766#2:415\n857#2,2:416\n288#2,2:418\n288#2,2:420\n288#2,2:422\n766#2:424\n857#2,2:425\n1855#2,2:427\n288#2,2:429\n*S KotlinDebug\n*F\n+ 1 StereoUtils.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoUtils\n*L\n99#1:408,2\n115#1:410,2\n140#1:412\n140#1:413,2\n142#1:415\n142#1:416,2\n144#1:418,2\n167#1:420,2\n211#1:422,2\n322#1:424\n322#1:425,2\n325#1:427,2\n378#1:429,2\n*E\n"})
/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final D f45020a = new D();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final List<DeviceProtocol> f45021b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f45022c = 5000;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final String f45023d = "StereoUtils";

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45024a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f45025b;

        static {
            int[] iArr = new int[AudioChannel.values().length];
            try {
                iArr[AudioChannel.STEREO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioChannel.STEREO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45024a = iArr;
            int[] iArr2 = new int[EnumSyncOnOff.values().length];
            try {
                iArr2[EnumSyncOnOff.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumSyncOnOff.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f45025b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ClickableSpan {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ g f45026E;

        b(g gVar) {
            this.f45026E = gVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@l3.d View textView) {
            F.p(textView, "textView");
            this.f45026E.onUnGroupClick();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@l3.d TextPaint ds) {
            F.p(ds, "ds");
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
        }
    }

    static {
        List<DeviceProtocol> k4;
        k4 = C2108v.k(DeviceProtocol.PROTOCOL_BLE);
        f45021b = k4;
    }

    private D() {
    }

    public final boolean a(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        if (bVar.c(hmDevice) && !bVar.f(hmDevice) && !bVar.g(hmDevice) && !o(hmDevice)) {
            return true;
        }
        return false;
    }

    public final boolean b(@l3.e HmDevice hmDevice, @l3.e HmDevice hmDevice2) {
        boolean S12;
        boolean S13;
        boolean K12;
        boolean K13;
        if (hmDevice != null && hmDevice2 != null && a(hmDevice2)) {
            S12 = kotlin.text.z.S1(hmDevice.n());
            if (!S12) {
                S13 = kotlin.text.z.S1(hmDevice2.n());
                if (!S13) {
                    K12 = kotlin.text.z.K1(hmDevice.n(), hmDevice2.n(), true);
                    if (!K12) {
                        K13 = kotlin.text.z.K1(hmDevice.q(), hmDevice2.q(), true);
                        if (!K13 && !com.harman.sdk.utils.d.E(hmDevice.q(), hmDevice2.q())) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean c(@l3.e HmDevice hmDevice, @l3.e HmDevice hmDevice2) {
        boolean S12;
        boolean S13;
        boolean K12;
        if (hmDevice != null && hmDevice2 != null && com.harman.sdk.utils.d.I(hmDevice2.q()) && a(hmDevice2)) {
            S12 = kotlin.text.z.S1(hmDevice.n());
            if (!S12) {
                S13 = kotlin.text.z.S1(hmDevice2.n());
                if (!S13) {
                    K12 = kotlin.text.z.K1(hmDevice.n(), hmDevice2.n(), true);
                    if (K12) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean d(@l3.e HmDevice hmDevice, @l3.e HmDevice hmDevice2) {
        boolean S12;
        boolean S13;
        boolean K12;
        if (hmDevice != null && hmDevice2 != null && com.harman.sdk.utils.d.Q(hmDevice2.q()) && a(hmDevice2)) {
            S12 = kotlin.text.z.S1(hmDevice.n());
            if (!S12) {
                S13 = kotlin.text.z.S1(hmDevice2.n());
                if (!S13) {
                    K12 = kotlin.text.z.K1(hmDevice.n(), hmDevice2.n(), true);
                    if (K12) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void e(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        PartyBoxDevice partyBoxDevice = null;
        hmDevice.M0(null);
        hmDevice.e0(AudioChannel.UNKNOWN);
        if (hmDevice instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) hmDevice;
        }
        if (partyBoxDevice != null) {
            partyBoxDevice.s2(PartyConnectStatus.PARTY_CONNECT_OFF);
        }
    }

    public final void f(@l3.d HmCustomFontTextView tv, @l3.d String fullTxt, @l3.d String reactTxt, @l3.d g observer) {
        int p32;
        F.p(tv, "tv");
        F.p(fullTxt, "fullTxt");
        F.p(reactTxt, "reactTxt");
        F.p(observer, "observer");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fullTxt);
        p32 = kotlin.text.A.p3(fullTxt, reactTxt, 0, false, 6, null);
        int length = fullTxt.length();
        if (p32 >= 0 && p32 < length) {
            spannableStringBuilder.setSpan(new b(observer), p32, length, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), p32, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(tv.getContext().getResources().getColor(j.d.f40725W0)), p32, length, 33);
        }
        tv.setText(spannableStringBuilder);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @l3.e
    public final HmDevice g(@l3.d PartyBoxDevice partyBoxDevice) {
        Collection<HmDevice> H3;
        String str;
        String str2;
        boolean S12;
        Object obj;
        String str3;
        String str4;
        BatteryInfo batteryInfo;
        String str5;
        Object obj2;
        F.p(partyBoxDevice, "<this>");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null || (H3 = k4.i()) == null) {
            H3 = CollectionsKt__CollectionsKt.H();
        }
        String n4 = partyBoxDevice.n();
        TWSInfo M3 = partyBoxDevice.M();
        String str6 = null;
        if (M3 != null) {
            str = M3.a();
        } else {
            str = null;
        }
        com.harman.log.f.a(f45023d, "findCoDevice() >>> MAC[" + n4 + "] group.id[" + str + "] snapshots:\n" + com.harman.jbl.partybox.ui.party.b.f44881a.h(H3));
        if (l(partyBoxDevice)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : H3) {
                if (!com.harman.jbl.partybox.ui.party.b.f44881a.o(partyBoxDevice, (HmDevice) obj3)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (com.harman.jbl.partybox.ui.party.b.f44881a.q(partyBoxDevice, (HmDevice) obj4)) {
                    arrayList2.add(obj4);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (f45020a.w(partyBoxDevice, (HmDevice) obj2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            HmDevice hmDevice = (HmDevice) obj2;
            if (hmDevice != null) {
                String n5 = hmDevice.n();
                String n6 = partyBoxDevice.n();
                TWSInfo M4 = partyBoxDevice.M();
                if (M4 != null) {
                    str6 = M4.a();
                }
                com.harman.log.f.a(f45023d, "findCoDevice() >>> find coDevice[" + n5 + "] paired with mainDevice[" + n6 + "] by groupID[" + str6 + "]");
                return hmDevice;
            }
        }
        if (partyBoxDevice.m1().length() > 0) {
            str2 = partyBoxDevice.m1();
        } else {
            Object obj5 = partyBoxDevice.l1().get("Mac_Address");
            if (obj5 instanceof String) {
                str2 = (String) obj5;
            } else {
                str2 = null;
            }
        }
        if (str2 != null) {
            S12 = kotlin.text.z.S1(str2);
            if (!S12) {
                com.harman.log.f.a(f45023d, "findCoDevice() >>> secondaryMacAddr[" + str2 + "]");
                Iterator<T> it2 = H3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (com.harman.jbl.partybox.ui.party.b.f44881a.p(str2, ((HmDevice) obj).n())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                HmDevice hmDevice2 = (HmDevice) obj;
                if (hmDevice2 != null) {
                    com.harman.log.f.a(f45023d, "findCoDevice() >>> find coDevice[" + hmDevice2.n() + "] paired with mainDevice[" + partyBoxDevice.n() + "] by secondary mac");
                    return hmDevice2;
                }
                PartyBoxDevice partyBoxDevice2 = new PartyBoxDevice();
                partyBoxDevice2.k0(str2);
                Object obj6 = partyBoxDevice.l1().get("Product_ID");
                if (obj6 instanceof String) {
                    str3 = (String) obj6;
                } else {
                    str3 = null;
                }
                String str7 = "";
                if (str3 == null) {
                    str3 = "";
                }
                partyBoxDevice2.n0(str3);
                Object obj7 = partyBoxDevice.l1().get("Model_ID");
                if (obj7 instanceof String) {
                    str4 = (String) obj7;
                } else {
                    str4 = null;
                }
                partyBoxDevice2.l0(str4);
                Object obj8 = partyBoxDevice.l1().get("Device_Battery");
                if (obj8 instanceof BatteryInfo) {
                    batteryInfo = (BatteryInfo) obj8;
                } else {
                    batteryInfo = null;
                }
                partyBoxDevice2.a0(batteryInfo);
                Object obj9 = partyBoxDevice.l1().get("Serial_Number");
                if (obj9 instanceof String) {
                    str5 = (String) obj9;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = "";
                }
                partyBoxDevice2.w2(str5);
                Object obj10 = partyBoxDevice.l1().get("Firmware_Version");
                if (obj10 instanceof String) {
                    str6 = (String) obj10;
                }
                if (str6 != null) {
                    str7 = str6;
                }
                partyBoxDevice2.t0(str7);
                com.harman.log.f.a(f45023d, "findCoDevice() >>> generate coDevice by secondaryMacAddr[" + str2 + "]");
                return partyBoxDevice2;
            }
        }
        com.harman.log.f.a(f45023d, "findCoDevice() >>> missing secondary mac address from mainDevice[" + partyBoxDevice.n() + "]");
        return null;
    }

    @l3.e
    public final HmDevice h(@l3.d HmDevice hmDevice) {
        String str;
        boolean S12;
        Collection<HmDevice> i4;
        F.p(hmDevice, "<this>");
        Object obj = null;
        if (!(hmDevice instanceof PartyBoxDevice)) {
            return null;
        }
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
        if (partyBoxDevice.m1().length() > 0) {
            str = partyBoxDevice.m1();
        } else {
            Object obj2 = partyBoxDevice.l1().get("Mac_Address");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
        }
        if (str != null) {
            S12 = kotlin.text.z.S1(str);
            if (!S12) {
                com.harman.log.f.a(f45023d, "findCoDeviceBy2ndMac() >>> targetMac[" + str + "]");
                B2.c k4 = com.harman.sdk.b.f47608a.k();
                if (k4 == null || (i4 = k4.i()) == null) {
                    return null;
                }
                Iterator<T> it = i4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (com.harman.jbl.partybox.ui.party.b.f44881a.p(str, ((HmDevice) next).n())) {
                        obj = next;
                        break;
                    }
                }
                return (HmDevice) obj;
            }
        }
        com.harman.log.f.g(f45023d, "findCoDeviceBy2ndMac() >>> targetMac is null");
        return null;
    }

    @l3.d
    public final String i() {
        boolean S12;
        String m22;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(Random.f52425E.n(1, com.clj.fastble.a.f26980l));
        String b4 = com.harman.sdk.utils.j.b(sb.toString());
        if (b4 == null) {
            b4 = "";
        }
        S12 = kotlin.text.z.S1(b4);
        if (S12) {
            b4 = String.valueOf(System.currentTimeMillis());
        }
        if (b4.length() > 8) {
            b4 = b4.substring(0, 8);
            F.o(b4, "substring(...)");
        }
        String str = b4;
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            F.o(substring, "substring(...)");
            if (F.g("00", substring)) {
                m22 = kotlin.text.z.m2(str, "00", "01", false, 4, null);
                return m22;
            }
            return str;
        }
        return str;
    }

    @l3.e
    public final BatteryInfo j(@l3.d PartyBoxDevice partyBoxDevice, @l3.d AudioChannel audioChannel) {
        F.p(partyBoxDevice, "<this>");
        F.p(audioChannel, "audioChannel");
        if (partyBoxDevice.i() == audioChannel) {
            return partyBoxDevice.f();
        }
        if (partyBoxDevice.l1().get("Device_Battery") != null) {
            Object obj = partyBoxDevice.l1().get("Device_Battery");
            F.n(obj, "null cannot be cast to non-null type com.harman.sdk.message.BatteryInfo");
            return (BatteryInfo) obj;
        }
        return null;
    }

    @l3.d
    public final List<DeviceProtocol> k() {
        return f45021b;
    }

    public final boolean l(@l3.d HmDevice hmDevice) {
        String str;
        String a4;
        boolean S12;
        F.p(hmDevice, "<this>");
        String n4 = hmDevice.n();
        TWSInfo M3 = hmDevice.M();
        if (M3 != null) {
            str = M3.a();
        } else {
            str = null;
        }
        com.harman.log.f.a(f45023d, "StereoUtils device: " + n4 + ",tws info:" + str);
        TWSInfo M4 = hmDevice.M();
        if (M4 != null && (a4 = M4.a()) != null) {
            S12 = kotlin.text.z.S1(a4);
            return !S12;
        }
        return false;
    }

    public final boolean m(@l3.d HmDevice hmDevice, @l3.e String str) {
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String a4;
        String a5;
        F.p(hmDevice, "<this>");
        String n4 = hmDevice.n();
        TWSInfo M3 = hmDevice.M();
        String str4 = null;
        if (M3 != null) {
            str2 = M3.a();
        } else {
            str2 = null;
        }
        com.harman.log.f.a(f45023d, "StereoUtils device: " + n4 + ",tws info:" + str2 + ", secGroupId = " + str);
        TWSInfo M4 = hmDevice.M();
        if (M4 != null && (a5 = M4.a()) != null) {
            num = Integer.valueOf(a5.length());
        } else {
            num = null;
        }
        if (str != null) {
            num2 = Integer.valueOf(str.length());
        } else {
            num2 = null;
        }
        if (F.g(num, num2)) {
            TWSInfo M5 = hmDevice.M();
            if (M5 != null) {
                str4 = M5.a();
            }
            return F.g(str4, str);
        }
        TWSInfo M6 = hmDevice.M();
        if (M6 != null && (a4 = M6.a()) != null) {
            str3 = a4.substring(0, 2);
            F.o(str3, "substring(...)");
        } else {
            str3 = null;
        }
        if (str != null) {
            str4 = str.substring(0, 2);
            F.o(str4, "substring(...)");
        }
        return F.g(str3, str4);
    }

    @l3.d
    public final HmDevice n(@l3.d HmDevice hmDevice) {
        Collection<HmDevice> i4;
        Object obj;
        F.p(hmDevice, "<this>");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null && (i4 = k4.i()) != null) {
            Iterator<T> it = i4.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (com.harman.jbl.partybox.ui.party.b.f44881a.o(hmDevice, (HmDevice) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            HmDevice hmDevice2 = (HmDevice) obj;
            if (hmDevice2 != null) {
                return hmDevice2;
            }
            return hmDevice;
        }
        return hmDevice;
    }

    public final boolean o(@l3.d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        PartyConnectStatus partyConnectStatus = PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED;
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

    public final boolean p(@l3.d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        PartyConnectStatus partyConnectStatus = PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING;
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

    public final boolean q(@l3.d HmDevice hmDevice) {
        PartyBoxDevice partyBoxDevice;
        F.p(hmDevice, "<this>");
        PartyConnectStatus partyConnectStatus = PartyConnectStatus.PARTY_CONNECT_OFF;
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

    public final boolean r(@l3.d PartyBoxDevice partyBoxDevice) {
        String str;
        boolean S12;
        B2.c k4;
        Collection<HmDevice> i4;
        F.p(partyBoxDevice, "<this>");
        Object obj = partyBoxDevice.l1().get("Mac_Address");
        Object obj2 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            S12 = kotlin.text.z.S1(str);
            if (S12 || (k4 = com.harman.sdk.b.f47608a.k()) == null || (i4 = k4.i()) == null) {
                return false;
            }
            Iterator<T> it = i4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (com.harman.jbl.partybox.ui.party.b.f44881a.p(str, ((HmDevice) next).n())) {
                    obj2 = next;
                    break;
                }
            }
            HmDevice hmDevice = (HmDevice) obj2;
            if (hmDevice == null) {
                return false;
            }
            return com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p(hmDevice);
        }
        return false;
    }

    public final boolean s(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        return l(hmDevice);
    }

    @l3.d
    public final EnumSyncOnOff t(@l3.e EnumSyncOnOff enumSyncOnOff) {
        int i4;
        if (enumSyncOnOff == null) {
            i4 = -1;
        } else {
            i4 = a.f45025b[enumSyncOnOff.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                return EnumSyncOnOff.ON;
            }
            return EnumSyncOnOff.OFF;
        }
        return EnumSyncOnOff.ON;
    }

    @l3.d
    public final AudioChannel u(@l3.d AudioChannel audioChannel) {
        F.p(audioChannel, "<this>");
        int i4 = a.f45024a[audioChannel.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return AudioChannel.STEREO_RIGHT;
            }
            return AudioChannel.STEREO_LEFT;
        }
        return AudioChannel.STEREO_RIGHT;
    }

    public final boolean v(long j4) {
        if (Math.abs(j4 - System.currentTimeMillis()) > 5000) {
            return true;
        }
        return false;
    }

    public final boolean w(@l3.d HmDevice hmDevice, @l3.e HmDevice hmDevice2) {
        char[] cArr;
        kotlin.ranges.l ie;
        int c4;
        boolean J3;
        TWSInfo M3;
        String a4;
        String a5;
        F.p(hmDevice, "<this>");
        TWSInfo M4 = hmDevice.M();
        char[] cArr2 = null;
        if (M4 != null && (a5 = M4.a()) != null) {
            cArr = a5.toCharArray();
            F.o(cArr, "toCharArray(...)");
        } else {
            cArr = null;
        }
        if (hmDevice2 != null && (M3 = hmDevice2.M()) != null && (a4 = M3.a()) != null) {
            cArr2 = a4.toCharArray();
            F.o(cArr2, "toCharArray(...)");
        }
        if (cArr != null && cArr2 != null && cArr.length != 0 && cArr2.length != 0) {
            ie = C2101p.ie(cArr);
            Iterator<Integer> it = ie.iterator();
            while (it.hasNext() && (c4 = ((P) it).c()) < cArr2.length) {
                J3 = C2221c.J(cArr[c4], cArr2[c4], true);
                if (!J3) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean x(@l3.d PartyBoxDevice partyBoxDevice) {
        boolean z3;
        F.p(partyBoxDevice, "<this>");
        if (partyBoxDevice.l1().get("Mac_Address") != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean o4 = o(partyBoxDevice);
        com.harman.log.f.a(f45023d, "secondaryDeviceExists() >>> 2nd.MAC[" + z3 + "] partyConnected[" + o4 + "]");
        if (!z3 || !o4) {
            return false;
        }
        return true;
    }

    @l3.d
    public final HmDevice y(@l3.d HmDevice hmDevice, @l3.d AudioChannel channel) {
        Collection<HmDevice> i4;
        F.p(hmDevice, "<this>");
        F.p(channel, "channel");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null && (i4 = k4.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : i4) {
                if (com.harman.jbl.partybox.ui.party.b.f44881a.o(hmDevice, (HmDevice) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((HmDevice) it.next()).e0(channel);
            }
        }
        return hmDevice;
    }
}
