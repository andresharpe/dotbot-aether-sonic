package com.harman.jbl.cd_biz_comm.utils;

import com.harman.jbl.partylight.lib.core.PBDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: A, reason: collision with root package name */
    public static final String f37886A = "Linked_Speaker_ID";

    /* renamed from: B, reason: collision with root package name */
    public static final String f37887B = "KEY_STAGE_NUMBER";

    /* renamed from: C, reason: collision with root package name */
    public static final String f37888C = "Aurocast_Support";

    /* renamed from: D, reason: collision with root package name */
    public static final String f37889D = "Aurocast_Status";

    /* renamed from: E, reason: collision with root package name */
    public static final String f37890E = "Aurocast_Linked";

    /* renamed from: F, reason: collision with root package name */
    public static final String f37891F = "Aurocast_Spotify_Quick_Access_Trig";

    /* renamed from: G, reason: collision with root package name */
    public static final String f37892G = "Tws_Stereo_Group_ID";

    /* renamed from: H, reason: collision with root package name */
    public static final String f37893H = "Serial_Number";

    /* renamed from: I, reason: collision with root package name */
    public static final String f37894I = "Firmware_Version";

    /* renamed from: J, reason: collision with root package name */
    public static final String f37895J = "Mac_Address";

    /* renamed from: K, reason: collision with root package name */
    public static final String f37896K = "AC_Cable_Without_Battery";

    /* renamed from: L, reason: collision with root package name */
    private static final List<PBDevice> f37897L = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public static final String f37898a = "2156";

    /* renamed from: b, reason: collision with root package name */
    public static final String f37899b = "2120";

    /* renamed from: c, reason: collision with root package name */
    public static final String f37900c = "20dd";

    /* renamed from: d, reason: collision with root package name */
    public static final String f37901d = "20e2";

    /* renamed from: e, reason: collision with root package name */
    public static final String f37902e = "2095";

    /* renamed from: f, reason: collision with root package name */
    public static final String f37903f = "2108";

    /* renamed from: g, reason: collision with root package name */
    public static final String f37904g = "2109";

    /* renamed from: h, reason: collision with root package name */
    public static final String f37905h = "2118";

    /* renamed from: i, reason: collision with root package name */
    public static final String f37906i = "212e";

    /* renamed from: j, reason: collision with root package name */
    public static final String f37907j = "215b";

    /* renamed from: k, reason: collision with root package name */
    public static final String f37908k = "Product_ID";

    /* renamed from: l, reason: collision with root package name */
    public static final String f37909l = "Model_ID";

    /* renamed from: m, reason: collision with root package name */
    public static final String f37910m = "Mute";

    /* renamed from: n, reason: collision with root package name */
    public static final String f37911n = "Charging";

    /* renamed from: o, reason: collision with root package name */
    public static final String f37912o = "Volume";

    /* renamed from: p, reason: collision with root package name */
    public static final String f37913p = "PartyConnect_Mode";

    /* renamed from: q, reason: collision with root package name */
    public static final String f37914q = "BLE_Standby_Info";

    /* renamed from: r, reason: collision with root package name */
    public static final String f37915r = "BT_Connection_Info";

    /* renamed from: s, reason: collision with root package name */
    public static final String f37916s = "Second_Crc";

    /* renamed from: t, reason: collision with root package name */
    public static final String f37917t = "Role";

    /* renamed from: u, reason: collision with root package name */
    public static final String f37918u = "Crc";

    /* renamed from: v, reason: collision with root package name */
    public static final String f37919v = "Device_Name";

    /* renamed from: w, reason: collision with root package name */
    public static final String f37920w = "Connect_Able";

    /* renamed from: x, reason: collision with root package name */
    public static final String f37921x = "Device_Battery";

    /* renamed from: y, reason: collision with root package name */
    public static final String f37922y = "KEY_DEVICE_BT_MAC";

    /* renamed from: z, reason: collision with root package name */
    public static final String f37923z = "Mic_Connection_Info";

    @l3.d
    public static String a() {
        List<PBDevice> list = f37897L;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("PartyBox Ultimate");
            for (PBDevice pBDevice : list) {
                sb.append(", ");
                sb.append(pBDevice.f());
            }
            return sb.toString();
        }
        return "";
    }

    public static boolean b(@l3.d String str) {
        List<PBDevice> list = f37897L;
        if (!list.isEmpty()) {
            Iterator<PBDevice> it = list.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean c(@l3.d String str) {
        return f37903f.equalsIgnoreCase(str);
    }

    public static boolean d(@l3.d String str) {
        if (!f37903f.equalsIgnoreCase(str) && !f37904g.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static boolean e(@l3.d String str) {
        return f37904g.equalsIgnoreCase(str);
    }

    public static void f(@l3.d List<PBDevice> list) {
        List<PBDevice> list2 = f37897L;
        list2.clear();
        list2.addAll(list);
    }
}
