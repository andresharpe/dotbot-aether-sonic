package U1;

import W2.n;
import android.text.TextUtils;
import com.blankj.utilcode.util.C1106p;
import com.harman.jbl.partybox.model.GroupInfo;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.A;
import kotlin.text.C;
import kotlin.text.C2220b;
import kotlin.text.C2222d;
import kotlin.text.z;
import l3.d;
import l3.e;

@U({"SMAP\nOfflineDeviceHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineDeviceHandler.kt\ncom/harman/jbl/partybox/offline/OfflineDeviceHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1#2:198\n1#2:213\n1549#3:199\n1620#3,3:200\n1603#3,9:203\n1855#3:212\n1856#3:214\n1612#3:215\n1549#3:216\n1620#3,3:217\n*S KotlinDebug\n*F\n+ 1 OfflineDeviceHandler.kt\ncom/harman/jbl/partybox/offline/OfflineDeviceHandler\n*L\n134#1:213\n86#1:199\n86#1:200,3\n134#1:203,9\n134#1:212\n134#1:214\n134#1:215\n148#1:216\n148#1:217,3\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f3752a = new a();

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final String f3753b = "OfflineDeviceHandler";

    /* renamed from: c, reason: collision with root package name */
    @d
    private static final String f3754c = "device_mac_list";

    /* renamed from: d, reason: collision with root package name */
    @d
    private static final String f3755d = "group_id_list";

    /* renamed from: e, reason: collision with root package name */
    @d
    private static final String f3756e = "group_id_prev";

    private a() {
    }

    @n
    public static final void a(@d HmDevice device) {
        List R4;
        List Y5;
        F.p(device, "device");
        String u3 = C1106p.k().u(f3754c);
        if (u3 != null && u3.length() != 0) {
            F.m(u3);
            R4 = A.R4(u3, new String[]{","}, false, 0, 6, null);
            Y5 = D.Y5(R4);
            if (!Y5.contains(device.n())) {
                Y5.add(device.n());
                C1106p.k().E(f3754c, (String) Y5.stream().collect(Collectors.joining(",")));
            }
        } else {
            C1106p.k().E(f3754c, device.n());
        }
        C1106p.k().C(device.n(), device);
    }

    @n
    public static final void b(@d GroupInfo groupInfo) {
        byte[] c4;
        List R4;
        List Y5;
        F.p(groupInfo, "groupInfo");
        try {
            c4 = f3752a.d(groupInfo.p());
        } catch (Exception unused) {
            c4 = f3752a.c(groupInfo.p(), 8);
        }
        String g4 = g.g(c4);
        F.o(g4, "encodeHexStr(...)");
        String substring = g4.substring(0, 2);
        F.o(substring, "substring(...)");
        Locale ROOT = Locale.ROOT;
        F.o(ROOT, "ROOT");
        String upperCase = substring.toUpperCase(ROOT);
        F.o(upperCase, "toUpperCase(...)");
        groupInfo.v(upperCase);
        String u3 = C1106p.k().u(f3755d);
        if (u3 != null && u3.length() != 0) {
            F.m(u3);
            R4 = A.R4(u3, new String[]{","}, false, 0, 6, null);
            Y5 = D.Y5(R4);
            if (!Y5.contains(groupInfo.p())) {
                Y5.add(groupInfo.p());
                C1106p.k().E(f3755d, (String) Y5.stream().collect(Collectors.joining(",")));
            }
        } else {
            C1106p.k().E(f3755d, groupInfo.p());
        }
        C1106p.k().C(f3756e + groupInfo.p(), groupInfo);
        f.a(f3753b, "OfflineDeviceHandler groupInfo:" + f3756e + groupInfo.p() + "->" + groupInfo);
    }

    private final byte[] c(String str, int i4) {
        boolean S12;
        S12 = z.S1(str);
        if (S12) {
            return new byte[0];
        }
        if (i4 <= 0) {
            byte[] bytes = str.getBytes(C2222d.f52792b);
            F.o(bytes, "getBytes(...)");
            return bytes;
        }
        if (str.length() > i4) {
            str = str.substring(0, i4);
            F.o(str, "substring(...)");
        }
        byte[] bytes2 = str.getBytes(C2222d.f52792b);
        F.o(bytes2, "getBytes(...)");
        return bytes2;
    }

    private final byte[] d(String str) {
        List<String> r6;
        int b02;
        byte[] O5;
        int a4;
        if (str.length() % 2 == 0) {
            r6 = C.r6(str, 2);
            b02 = C2109w.b0(r6, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (String str2 : r6) {
                a4 = C2220b.a(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, a4)));
            }
            O5 = D.O5(arrayList);
            return O5;
        }
        throw new IllegalStateException("Must have an even length".toString());
    }

    @n
    @e
    public static final HmDevice e(@d String deviceMAC) {
        F.p(deviceMAC, "deviceMAC");
        f.a(f3753b, "getDevice deviceMAC = " + deviceMAC);
        try {
            Object s4 = C1106p.k().s(deviceMAC);
            if (s4 == null) {
                return null;
            }
            return (HmDevice) s4;
        } catch (Throwable th) {
            th.printStackTrace();
            f.a(f3753b, "getDevice removeDevice = " + deviceMAC);
            k(deviceMAC);
            return null;
        }
    }

    @n
    @d
    public static final List<HmDevice> f() {
        int b02;
        List V5;
        List s22;
        List<HmDevice> Y5;
        List<String> g4 = g();
        if (g4 != null && !g4.isEmpty()) {
            b02 = C2109w.b0(g4, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = g4.iterator();
            while (it.hasNext()) {
                arrayList.add(e((String) it.next()));
            }
            V5 = D.V5(arrayList);
            s22 = D.s2(V5);
            Y5 = D.Y5(s22);
            return Y5;
        }
        return new ArrayList();
    }

    @n
    @e
    public static final List<String> g() {
        List R4;
        List<String> Y5;
        String u3 = C1106p.k().u(f3754c);
        if (u3 != null && u3.length() != 0) {
            F.m(u3);
            R4 = A.R4(u3, new String[]{","}, false, 0, 6, null);
            Y5 = D.Y5(R4);
            return Y5;
        }
        return new ArrayList();
    }

    @n
    @e
    public static final List<String> h() {
        List R4;
        List<String> Y5;
        String u3 = C1106p.k().u(f3755d);
        if (u3 != null && u3.length() != 0) {
            F.m(u3);
            R4 = A.R4(u3, new String[]{","}, false, 0, 6, null);
            Y5 = D.Y5(R4);
            return Y5;
        }
        return new ArrayList();
    }

    @n
    @e
    public static final GroupInfo i(@d String groupId) {
        byte[] c4;
        F.p(groupId, "groupId");
        if (groupId.length() == 0) {
            return null;
        }
        try {
            c4 = f3752a.d(groupId);
        } catch (Exception unused) {
            c4 = f3752a.c(groupId, 8);
        }
        String g4 = g.g(c4);
        F.o(g4, "encodeHexStr(...)");
        String substring = g4.substring(0, 2);
        F.o(substring, "substring(...)");
        Locale ROOT = Locale.ROOT;
        F.o(ROOT, "ROOT");
        String upperCase = substring.toUpperCase(ROOT);
        F.o(upperCase, "toUpperCase(...)");
        Object s4 = C1106p.k().s(f3756e + upperCase);
        f.a(f3753b, "OfflineDeviceHandler getGroupInfo:" + f3756e + upperCase + "->" + s4);
        if (s4 == null) {
            return null;
        }
        return (GroupInfo) s4;
    }

    @n
    @d
    public static final List<GroupInfo> j() {
        List<GroupInfo> Y5;
        List<String> h4 = h();
        if (h4 != null && !h4.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = h4.iterator();
            while (it.hasNext()) {
                GroupInfo i4 = i((String) it.next());
                if (i4 != null) {
                    arrayList.add(i4);
                }
            }
            Y5 = D.Y5(arrayList);
            return Y5;
        }
        return new ArrayList();
    }

    @n
    public static final void k(@d String deviceMAC) {
        List<String> g4;
        F.p(deviceMAC, "deviceMAC");
        if (!TextUtils.isEmpty(deviceMAC) && (g4 = g()) != null && !g4.isEmpty()) {
            g4.remove(deviceMAC);
            C1106p.k().E(f3754c, (String) g4.stream().collect(Collectors.joining(",")));
            C1106p.k().M(deviceMAC);
        }
    }

    @n
    public static final void l(@d String groupId) {
        List<String> h4;
        F.p(groupId, "groupId");
        if (!TextUtils.isEmpty(groupId) && (h4 = h()) != null && !h4.isEmpty()) {
            h4.remove(groupId);
            String str = (String) h4.stream().collect(Collectors.joining(","));
            C1106p.k().E(f3755d, str);
            f.a(f3753b, "OfflineDeviceHandler removeGroupInfo:" + f3756e + groupId + "->" + str);
            C1106p k4 = C1106p.k();
            StringBuilder sb = new StringBuilder();
            sb.append(f3756e);
            sb.append(groupId);
            k4.M(sb.toString());
        }
    }

    @n
    public static final void m(@e String str, @e String str2) {
        GroupInfo i4;
        if (str != null && (i4 = i(str)) != null && !F.g(str2, i4.q())) {
            i4.w(str2);
            b(i4);
        }
    }
}
