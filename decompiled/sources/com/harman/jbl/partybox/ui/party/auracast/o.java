package com.harman.jbl.partybox.ui.party.auracast;

import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPanelStyle;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.utils.AuracastForbiddenStatus;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.AuracastSupport;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.SpotifyQuickAccess;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nAuracastUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastUtils.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1747#2,3:214\n1864#2,3:217\n*S KotlinDebug\n*F\n+ 1 AuracastUtils.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastUtils\n*L\n45#1:214,3\n119#1:217,3\n*E\n"})
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f44855b = "Auracast";

    /* renamed from: c, reason: collision with root package name */
    public static final int f44856c = 32;

    /* renamed from: d, reason: collision with root package name */
    public static final int f44857d = 0;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final o f44854a = new o();

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final Comparator<HmDevice> f44858e = new Comparator() { // from class: com.harman.jbl.partybox.ui.party.auracast.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int k4;
            k4 = o.k((HmDevice) obj, (HmDevice) obj2);
            return k4;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final Comparator<HmDevice> f44859f = new Comparator() { // from class: com.harman.jbl.partybox.ui.party.auracast.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int x3;
            x3 = o.x((HmDevice) obj, (HmDevice) obj2);
            return x3;
        }
    };

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(HmDevice hmDevice, HmDevice hmDevice2) {
        if (hmDevice.R() && hmDevice2.R()) {
            if (hmDevice.x() >= hmDevice2.x()) {
                return 1;
            }
        } else if (!hmDevice.R()) {
            if (hmDevice2.R()) {
                return 1;
            }
            if (hmDevice.O() && hmDevice2.O()) {
                if (hmDevice.x() >= hmDevice2.x()) {
                    return 1;
                }
            } else if (!hmDevice.O()) {
                if (hmDevice2.O()) {
                    return 1;
                }
                o oVar = f44854a;
                F.m(hmDevice);
                F.m(hmDevice2);
                return oVar.i(hmDevice, hmDevice2);
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(HmDevice hmDevice, HmDevice hmDevice2) {
        if (hmDevice.O() && hmDevice2.O()) {
            if (hmDevice.x() >= hmDevice2.x()) {
                return 1;
            }
        } else if (!hmDevice.O()) {
            if (hmDevice2.O()) {
                return 1;
            }
            if (hmDevice.R() && hmDevice2.R()) {
                if (hmDevice.x() >= hmDevice2.x()) {
                    return 1;
                }
            } else if (!hmDevice.R()) {
                if (hmDevice2.R()) {
                    return 1;
                }
                o oVar = f44854a;
                F.m(hmDevice);
                F.m(hmDevice2);
                return oVar.i(hmDevice, hmDevice2);
            }
        }
        return -1;
    }

    public final boolean c(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        if (v(hmDevice) && p(hmDevice) && s(hmDevice)) {
            return true;
        }
        return false;
    }

    public final boolean d(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        if (v(hmDevice) && p(hmDevice) && t(hmDevice)) {
            return true;
        }
        return false;
    }

    @l3.d
    public final List<HmDevice> e(@l3.d List<HmDevice> list, @l3.e HmDevice hmDevice) {
        F.p(list, "<this>");
        if (hmDevice == null) {
            return list;
        }
        if (list.contains(hmDevice)) {
            return list;
        }
        list.add(hmDevice);
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = kotlin.collections.D.Y5(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(@l3.d androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r2, @l3.d com.harman.sdk.device.HmDevice r3) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.F.p(r2, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.F.p(r3, r0)
            boolean r0 = r1.j(r2, r3)
            if (r0 == 0) goto L11
            return
        L11:
            java.lang.Object r0 = r2.f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L1f
            java.util.List r0 = kotlin.collections.C2107u.Y5(r0)
            if (r0 != 0) goto L24
        L1f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L24:
            r0.add(r3)
            r2.r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.auracast.o.f(androidx.lifecycle.P, com.harman.sdk.device.HmDevice):void");
    }

    public final int g(int i4) {
        if (i4 < 0) {
            return 0;
        }
        if (i4 > 32) {
            return 32;
        }
        return i4;
    }

    public final boolean h(@l3.e EnumPanelStyle enumPanelStyle, @l3.d EnumPanelStyle style) {
        F.p(style, "style");
        return enumPanelStyle == null || enumPanelStyle != style;
    }

    public final int i(@l3.d HmDevice dev1, @l3.d HmDevice dev2) {
        F.p(dev1, "dev1");
        F.p(dev2, "dev2");
        if (dev1.x() < dev2.x()) {
            return -1;
        }
        if (dev1.x() > dev2.x()) {
            return 1;
        }
        return 0;
    }

    public final boolean j(@l3.d LiveData<List<HmDevice>> liveData, @l3.d HmDevice device) {
        F.p(liveData, "<this>");
        F.p(device, "device");
        List<HmDevice> f4 = liveData.f();
        if (f4 == null || f4.isEmpty()) {
            return false;
        }
        Iterator<T> it = f4.iterator();
        while (it.hasNext()) {
            if (com.harman.jbl.partybox.ui.party.b.f44881a.o((HmDevice) it.next(), device)) {
                return true;
            }
        }
        return false;
    }

    public final int l(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        if (i4 >= 100) {
            return 32;
        }
        return (int) ((i4 / 100) * 32);
    }

    @l3.d
    public final Comparator<HmDevice> m() {
        return f44858e;
    }

    @l3.d
    public final Comparator<HmDevice> n() {
        return f44859f;
    }

    public final boolean o(@l3.e HmDevice hmDevice) {
        if (hmDevice != null) {
            return D.f45020a.l(hmDevice);
        }
        return false;
    }

    public final boolean p(@l3.d HmDevice hmDevice) {
        AuracastStatus auracastStatus;
        F.p(hmDevice, "<this>");
        AuracastStatus auracastStatus2 = AuracastStatus.AURACAST_MODE;
        AuracastInfo d4 = hmDevice.d();
        if (d4 != null) {
            auracastStatus = d4.c();
        } else {
            auracastStatus = null;
        }
        if (auracastStatus2 == auracastStatus) {
            return true;
        }
        return false;
    }

    public final boolean q(int i4) {
        return i4 == 2;
    }

    public final boolean r(@l3.d HmDevice hmDevice) {
        AuracastForbiddenStatus auracastForbiddenStatus;
        F.p(hmDevice, "<this>");
        AuracastForbiddenStatus auracastForbiddenStatus2 = AuracastForbiddenStatus.STATUS_FORBIDDEN;
        AuracastInfo d4 = hmDevice.d();
        if (d4 != null) {
            auracastForbiddenStatus = d4.a();
        } else {
            auracastForbiddenStatus = null;
        }
        if (auracastForbiddenStatus2 == auracastForbiddenStatus) {
            return true;
        }
        return false;
    }

    public final boolean s(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        if (DeviceRole.MASTER == hmDevice.J()) {
            return true;
        }
        return false;
    }

    public final boolean t(@l3.d HmDevice hmDevice) {
        F.p(hmDevice, "<this>");
        if (DeviceRole.SLAVE == hmDevice.J()) {
            return true;
        }
        return false;
    }

    public final boolean u(@l3.d HmDevice hmDevice) {
        SpotifyQuickAccess spotifyQuickAccess;
        F.p(hmDevice, "<this>");
        SpotifyQuickAccess spotifyQuickAccess2 = SpotifyQuickAccess.TRIGGERED;
        AuracastInfo d4 = hmDevice.d();
        if (d4 != null) {
            spotifyQuickAccess = d4.e();
        } else {
            spotifyQuickAccess = null;
        }
        if (spotifyQuickAccess2 == spotifyQuickAccess) {
            return true;
        }
        return false;
    }

    public final boolean v(@l3.d HmDevice hmDevice) {
        AuracastSupport auracastSupport;
        F.p(hmDevice, "<this>");
        AuracastSupport auracastSupport2 = AuracastSupport.SUPPORT;
        AuracastInfo d4 = hmDevice.d();
        if (d4 != null) {
            auracastSupport = d4.b();
        } else {
            auracastSupport = null;
        }
        if (auracastSupport2 == auracastSupport) {
            return true;
        }
        return false;
    }

    @l3.d
    public final String w(@l3.d List<? extends HmDevice> list) {
        F.p(list, "<this>");
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            sb.append("index[" + i4 + "]");
            sb.append(com.harman.jbl.partybox.ui.party.b.f44881a.t((HmDevice) obj));
            sb.append("\n");
            i4 = i5;
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = kotlin.collections.D.Y5(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(@l3.d androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r2, @l3.d com.harman.sdk.device.HmDevice r3) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.F.p(r2, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.F.p(r3, r0)
            boolean r0 = r1.j(r2, r3)
            if (r0 != 0) goto L11
            return
        L11:
            java.lang.Object r0 = r2.f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L26
            java.util.List r0 = kotlin.collections.C2107u.Y5(r0)
            if (r0 != 0) goto L20
            goto L26
        L20:
            r0.remove(r3)
            r2.r(r0)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.auracast.o.y(androidx.lifecycle.P, com.harman.sdk.device.HmDevice):void");
    }

    public final int z(int i4) {
        if (i4 <= 0) {
            return 0;
        }
        if (i4 >= 32) {
            return 100;
        }
        return (int) ((i4 / 32) * 100);
    }
}
