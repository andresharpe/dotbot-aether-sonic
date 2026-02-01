package com.harman.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.setting.AppConfig;
import com.harman.sdk.setting.AuraCastDeviceItem;
import com.harman.sdk.setting.ProductConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public static final String f48484A = "Mute";

    /* renamed from: B, reason: collision with root package name */
    public static final String f48485B = "Charging";

    /* renamed from: C, reason: collision with root package name */
    public static final String f48486C = "Volume";

    /* renamed from: D, reason: collision with root package name */
    public static final String f48487D = "PartyConnect_Mode";

    /* renamed from: E, reason: collision with root package name */
    public static final String f48488E = "BLE_Standby_Info";

    /* renamed from: F, reason: collision with root package name */
    public static final String f48489F = "BT_Connection_Info";

    /* renamed from: G, reason: collision with root package name */
    public static final String f48490G = "Second_Crc";

    /* renamed from: H, reason: collision with root package name */
    public static final String f48491H = "Role";

    /* renamed from: I, reason: collision with root package name */
    public static final String f48492I = "Crc";

    /* renamed from: J, reason: collision with root package name */
    public static final String f48493J = "Device_Name";

    /* renamed from: K, reason: collision with root package name */
    public static final String f48494K = "Connect_Able";

    /* renamed from: L, reason: collision with root package name */
    public static final String f48495L = "Device_Battery";

    /* renamed from: M, reason: collision with root package name */
    public static final String f48496M = "KEY_DEVICE_BT_MAC";

    /* renamed from: N, reason: collision with root package name */
    public static final String f48497N = "Mic_Connection_Info";

    /* renamed from: O, reason: collision with root package name */
    public static final String f48498O = "KEY_IS_PRO_DEVICE";

    /* renamed from: P, reason: collision with root package name */
    public static final String f48499P = "Service_ID";

    /* renamed from: Q, reason: collision with root package name */
    public static final String f48500Q = "MTK";

    /* renamed from: R, reason: collision with root package name */
    public static final String f48501R = "MTK_One";

    /* renamed from: S, reason: collision with root package name */
    public static final String f48502S = "BES_One";

    /* renamed from: T, reason: collision with root package name */
    public static final String f48503T = "BT_Classic_Address";

    /* renamed from: U, reason: collision with root package name */
    public static final String f48504U = "Aurocast_Support";

    /* renamed from: V, reason: collision with root package name */
    public static final String f48505V = "Aurocast_Status";

    /* renamed from: W, reason: collision with root package name */
    public static final String f48506W = "Aurocast_Has_Button";

    /* renamed from: X, reason: collision with root package name */
    public static final String f48507X = "Aurocast_Spotify_Quick_Access_Trig";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f48508Y = "Auracast_Gatt_Over_BR_EDR";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f48509Z = "Auracast_Hotel_Mode";

    /* renamed from: a, reason: collision with root package name */
    private static final String f48510a = "d";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f48511a0 = "Auracast_Support_Hotel_Mode";

    /* renamed from: b, reason: collision with root package name */
    public static final String f48512b = "adv_format_1";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f48513b0 = "Auracast_Forbidden_JOIN_AURACAST";

    /* renamed from: c, reason: collision with root package name */
    public static final String f48514c = "adv_format_2";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f48515c0 = "Tws_Stereo_Group_ID";

    /* renamed from: d, reason: collision with root package name */
    public static final String f48516d = "adv_format_3";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f48517d0 = "Serial_Number";

    /* renamed from: e, reason: collision with root package name */
    public static final String f48518e = "adv_format_4";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f48519e0 = "Firmware_Version";

    /* renamed from: f, reason: collision with root package name */
    public static final String f48520f = "adv_format_5";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f48521f0 = "Mac_Address";

    /* renamed from: g, reason: collision with root package name */
    public static final String f48522g = "adv_format_6";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f48523g0 = "Work_Mode";

    /* renamed from: h, reason: collision with root package name */
    public static final String f48524h = "adv_format_7";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f48525h0 = "AC_Cable_Without_Battery";

    /* renamed from: i, reason: collision with root package name */
    public static final String f48526i = "adv_format_8";

    /* renamed from: i0, reason: collision with root package name */
    private static ProductConfig f48527i0 = null;

    /* renamed from: j, reason: collision with root package name */
    public static final String f48528j = "adv_format_9";

    /* renamed from: j0, reason: collision with root package name */
    private static D2.a f48529j0 = null;

    /* renamed from: k, reason: collision with root package name */
    public static final String f48530k = "cmd_format_1";

    /* renamed from: l, reason: collision with root package name */
    public static final String f48532l = "cmd_format_2";

    /* renamed from: m, reason: collision with root package name */
    public static final String f48534m = "cmd_format_3";

    /* renamed from: n, reason: collision with root package name */
    public static final String f48536n = "cmd_format_4";

    /* renamed from: o, reason: collision with root package name */
    public static final String f48537o = "VIMICRO";

    /* renamed from: p, reason: collision with root package name */
    public static final String f48538p = "Vimicro_Portable";

    /* renamed from: q, reason: collision with root package name */
    public static final String f48539q = "Vimicro_One";

    /* renamed from: r, reason: collision with root package name */
    public static final String f48540r = "QCC";

    /* renamed from: s, reason: collision with root package name */
    public static final String f48541s = "CSR";

    /* renamed from: t, reason: collision with root package name */
    public static final String f48542t = "MCS";

    /* renamed from: u, reason: collision with root package name */
    public static final String f48543u = "TWS";

    /* renamed from: v, reason: collision with root package name */
    public static final String f48544v = "AIROHA";

    /* renamed from: w, reason: collision with root package name */
    public static final String f48545w = "Content_ID";

    /* renamed from: x, reason: collision with root package name */
    public static final String f48546x = "Vendor_ID";

    /* renamed from: y, reason: collision with root package name */
    public static final String f48547y = "Product_ID";

    /* renamed from: z, reason: collision with root package name */
    public static final String f48548z = "Model_ID";

    /* renamed from: k0, reason: collision with root package name */
    private static AppConfig f48531k0 = new AppConfig();

    /* renamed from: l0, reason: collision with root package name */
    private static final ArrayList<DeviceProtocol> f48533l0 = new ArrayList<>(Arrays.asList(DeviceProtocol.PROTOCOL_SPP, DeviceProtocol.PROTOCOL_BLE, DeviceProtocol.PROTOCOL_GATT_BR_EDR));

    /* renamed from: m0, reason: collision with root package name */
    private static final String[] f48535m0 = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends TypeToken<HashMap<String, String>> {
        a() {
        }
    }

    public static ProductConfig A() {
        return f48527i0;
    }

    public static boolean B(@P String str) {
        String l4 = l(str);
        if (!f48530k.equalsIgnoreCase(l4) && !f48532l.equalsIgnoreCase(l4) && !f48534m.equalsIgnoreCase(l4) && !f48536n.equalsIgnoreCase(l4)) {
            return false;
        }
        return true;
    }

    public static boolean C(HmDevice hmDevice) {
        if (hmDevice != null && f48502S.equalsIgnoreCase(hmDevice.E())) {
            return true;
        }
        return false;
    }

    public static boolean D(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.l();
                }
            }
        }
        return false;
    }

    public static boolean E(@P String str, @P String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                int intValue = Integer.valueOf(str, 16).intValue();
                int intValue2 = Integer.valueOf(str2, 16).intValue();
                if (intValue != 8290 || intValue2 != 8291) {
                    if (intValue == 8291 && intValue2 == 8290) {
                        return true;
                    }
                } else {
                    return true;
                }
            } catch (Throwable th) {
                com.harman.log.f.a(f48510a, th.getMessage());
            }
        }
        return false;
    }

    public static boolean F(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.m();
                }
            }
        }
        return false;
    }

    public static boolean G(@P HmDevice hmDevice) {
        if (hmDevice != null && !TextUtils.isEmpty(hmDevice.q()) && H(hmDevice.q())) {
            return true;
        }
        return false;
    }

    public static boolean H(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.n();
                }
            }
        }
        return false;
    }

    public static boolean I(@P String str) {
        ProductConfig productConfig;
        if (TextUtils.isEmpty(str) || (productConfig = f48527i0) == null || productConfig.a() == null) {
            return false;
        }
        for (ProductConfig.ProductItem productItem : f48527i0.a()) {
            if (str.equalsIgnoreCase(productItem.i())) {
                if (productItem.n() || productItem.s()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean J(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8031) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean K(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8418) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean L(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8029) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean M(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8413) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean N(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8480) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean O(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8033) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean P(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8534) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean Q(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            Iterator<ProductConfig.ProductItem> it = f48527i0.a().iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().i())) {
                    return !r2.s();
                }
            }
        }
        return false;
    }

    public static boolean R(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8290) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean S(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8291) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean T(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8494) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean U(@P String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Integer.valueOf(str, 16).intValue() != 8539) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    public static boolean V(@P String str) {
        if (!f48534m.equalsIgnoreCase(l(str)) && !Q(str)) {
            return false;
        }
        return true;
    }

    public static boolean W(@P String str) {
        int intValue;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            intValue = Integer.valueOf(str, 16).intValue();
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
        }
        if (intValue != 8456 && intValue != 8457) {
            return false;
        }
        return true;
    }

    public static boolean X(HmDevice hmDevice) {
        if (hmDevice != null && Y(hmDevice.q())) {
            return true;
        }
        return false;
    }

    public static boolean Y(String str) {
        return f48532l.equalsIgnoreCase(l(str));
    }

    public static boolean Z(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.p();
                }
            }
        }
        return false;
    }

    public static boolean a(String str) {
        D2.a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f48529j0) != null && aVar.d() != null) {
            Iterator<AuraCastDeviceItem> it = f48529j0.d().iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().q())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a0(HmDevice hmDevice) {
        if (hmDevice != null && b0(hmDevice.q())) {
            return true;
        }
        return false;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String[] strArr = f48535m0;
            sb.append(strArr[(b4 & 240) >> 4]);
            sb.append(strArr[b4 & 15]);
        }
        return sb.toString();
    }

    public static boolean b0(@P String str) {
        return f48530k.equalsIgnoreCase(l(str));
    }

    public static boolean c(String str, String str2) {
        boolean z3;
        HashMap hashMap = (HashMap) new Gson().fromJson(str, new a().getType());
        if (hashMap != null && hashMap.get(str2) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.harman.log.f.a("BLE_LOG", " Device is EverConnected : " + z3);
        return z3;
    }

    public static boolean c0(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.o();
                }
            }
        }
        return false;
    }

    public static boolean d(String str, String str2, PartyBoxDevice partyBoxDevice) {
        if (!c(str, partyBoxDevice.n()) && !e(str2, partyBoxDevice.n())) {
            return false;
        }
        return true;
    }

    public static boolean d0(@N String str) {
        ProductConfig productConfig = f48527i0;
        if (productConfig != null && productConfig.a() != null) {
            Iterator<ProductConfig.ProductItem> it = f48527i0.a().iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean e(String str, String str2) {
        if (str != null && str2 != null) {
            com.harman.log.f.a("BLE_LOG", " savedSecondaryAddress : " + str + " and selectedsecondaryMacAddress : " + str2);
            return str2.equalsIgnoreCase(str);
        }
        return false;
    }

    public static boolean e0(@P String str, @N String str2) {
        int intValue;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            intValue = Integer.valueOf(str, 16).intValue();
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
        }
        if (intValue != 8033) {
            if (intValue != 8413) {
                if (intValue != 8418) {
                    if (intValue != 8472 && intValue != 8480 && intValue != 8494 && intValue != 8534 && intValue != 8539 && intValue != 8290 && intValue != 8291) {
                        return false;
                    }
                } else {
                    if ("1.9.0".compareTo(str2) >= 0) {
                        return false;
                    }
                    return true;
                }
            } else {
                if ("2.0.0".compareTo(str2) >= 0) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static String f(@P String str) {
        D2.a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f48529j0) != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (str.equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return auraCastDeviceItem.p();
                }
            }
        }
        return "";
    }

    public static boolean f0(@N String str) {
        D2.a aVar = f48529j0;
        if (aVar != null && aVar.d() != null) {
            Iterator<AuraCastDeviceItem> it = f48529j0.d().iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().q())) {
                    return true;
                }
            }
        }
        ProductConfig productConfig = f48527i0;
        if (productConfig != null && productConfig.a() != null) {
            Iterator<ProductConfig.ProductItem> it2 = f48527i0.a().iterator();
            while (it2.hasNext()) {
                if (str.equalsIgnoreCase(it2.next().i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean g(HmDevice hmDevice) {
        if (hmDevice != null && h(hmDevice.q())) {
            return true;
        }
        return false;
    }

    public static boolean g0(@P HmDevice hmDevice) {
        if (hmDevice == null || TextUtils.isEmpty(hmDevice.q())) {
            return false;
        }
        if (!Q(hmDevice.q()) && !B(hmDevice.q())) {
            return false;
        }
        return true;
    }

    public static boolean h(@P String str) {
        D2.a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f48529j0) != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (str.equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return "auracast".equalsIgnoreCase(auraCastDeviceItem.p());
                }
            }
        }
        return false;
    }

    public static boolean h0(@N String str) {
        ProductConfig productConfig = f48527i0;
        if (productConfig != null && productConfig.a() != null) {
            Iterator<ProductConfig.ProductItem> it = f48527i0.a().iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.next().i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static String i(String str) {
        D2.a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f48529j0) != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (str.equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return auraCastDeviceItem.k();
                }
            }
        }
        return "";
    }

    public static boolean i0(HmDevice hmDevice) {
        if (hmDevice != null && hmDevice.E().equalsIgnoreCase(f48543u)) {
            return true;
        }
        return false;
    }

    public static AppConfig j() {
        return f48531k0;
    }

    public static boolean j0(@P String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f48536n.equalsIgnoreCase(l(str));
    }

    @P
    public static String k(HmDevice hmDevice) {
        D2.a aVar;
        if (hmDevice != null && !TextUtils.isEmpty(hmDevice.q()) && (aVar = f48529j0) != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (hmDevice.q().equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return auraCastDeviceItem.n();
                }
            }
        }
        return "";
    }

    public static boolean k0(HmDevice hmDevice) {
        if (hmDevice != null && j0(hmDevice.q())) {
            return true;
        }
        return false;
    }

    public static String l(String str) {
        D2.a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f48529j0) != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (str.equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return auraCastDeviceItem.l();
                }
            }
        }
        return "";
    }

    public static boolean l0(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.r();
                }
            }
        }
        return false;
    }

    @P
    public static String m() {
        if (f48529j0 != null) {
            return f48529j0.e() + "partybox/faq/index.html";
        }
        return null;
    }

    public static boolean m0(@P String str) {
        int intValue;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            intValue = Integer.valueOf(str, 16).intValue();
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
        }
        if (intValue != 8290 && intValue != 8291) {
            return false;
        }
        return true;
    }

    @P
    public static String n(HmDevice hmDevice) {
        D2.a aVar;
        if (hmDevice != null && !TextUtils.isEmpty(hmDevice.q()) && (aVar = f48529j0) != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (hmDevice.q().equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return auraCastDeviceItem.o().get(hmDevice.o());
                }
            }
        }
        return "";
    }

    public static boolean n0(@P String str) {
        ProductConfig productConfig;
        if (!TextUtils.isEmpty(str) && (productConfig = f48527i0) != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.s();
                }
            }
        }
        return false;
    }

    @P
    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (ProductConfig.ProductItem productItem : f48527i0.a()) {
            if (str.equalsIgnoreCase(productItem.i())) {
                return productItem.a();
            }
        }
        D2.a aVar = f48529j0;
        if (aVar != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (str.equalsIgnoreCase(auraCastDeviceItem.q())) {
                    try {
                        return auraCastDeviceItem.m().toLowerCase();
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
        return "";
    }

    public static AudioChannel o0(String str) {
        return AudioChannel.e(Integer.parseInt(str));
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (ProductConfig.ProductItem productItem : f48527i0.a()) {
            if (str.equalsIgnoreCase(productItem.i())) {
                return productItem.j();
            }
        }
        D2.a aVar = f48529j0;
        if (aVar != null && aVar.d() != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : f48529j0.d()) {
                if (str.equalsIgnoreCase(auraCastDeviceItem.q())) {
                    return auraCastDeviceItem.r();
                }
            }
        }
        return "";
    }

    public static void p0(AppConfig appConfig) {
        f48531k0 = appConfig;
    }

    @l3.d
    public static String q(String str) {
        com.harman.log.f.a(f48510a, "getProductEqPresetFileName PID: " + str);
        ProductConfig productConfig = f48527i0;
        if (productConfig == null || productConfig.a() == null) {
            return "";
        }
        for (ProductConfig.ProductItem productItem : f48527i0.a()) {
            if (str.equalsIgnoreCase(productItem.i())) {
                if (productItem.b() == null) {
                    return "";
                }
                return productItem.b();
            }
        }
        return "";
    }

    public static void q0(D2.a aVar) {
        f48529j0 = aVar;
    }

    @D
    public static int r(Context context, String str, @P String str2) {
        int identifier;
        if (str2 == null) {
            str2 = "01";
        }
        ProductConfig.ImageItem s4 = s(str, str2);
        if (s4 == null) {
            return 0;
        }
        String c4 = s4.c();
        if (context.getResources().getIdentifier(c4, "drawable", context.getPackageName()) == 0) {
            identifier = context.getResources().getIdentifier(c4, "mipmap", context.getPackageName());
        } else {
            identifier = context.getResources().getIdentifier(c4, "drawable", context.getPackageName());
        }
        return Math.max(identifier, 0);
    }

    public static void r0(ProductConfig productConfig) {
        f48527i0 = productConfig;
    }

    @P
    private static ProductConfig.ImageItem s(String str, String str2) {
        ProductConfig productConfig = f48527i0;
        if (productConfig != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.c().get(str2);
                }
            }
            return null;
        }
        return null;
    }

    public static boolean s0(String str) {
        return I(str);
    }

    @InterfaceC0578v
    public static int t(Context context, String str, @P String str2) {
        int identifier;
        if (str2 == null) {
            str2 = "01";
        }
        ProductConfig.ImageItem s4 = s(str, str2);
        if (s4 == null) {
            return 0;
        }
        String b4 = s4.b();
        if (context.getResources().getIdentifier(b4, "drawable", context.getPackageName()) == 0) {
            identifier = context.getResources().getIdentifier(b4, "mipmap", context.getPackageName());
        } else {
            identifier = context.getResources().getIdentifier(b4, "drawable", context.getPackageName());
        }
        return Math.max(identifier, 0);
    }

    public static boolean t0(@N String str) {
        ProductConfig productConfig = f48527i0;
        if (productConfig != null && productConfig.a() != null) {
            for (ProductConfig.ProductItem productItem : f48527i0.a()) {
                if (str.equalsIgnoreCase(productItem.i())) {
                    return productItem.q();
                }
            }
            return false;
        }
        return false;
    }

    public static ProductConfig.ProductItem u(String str) {
        for (ProductConfig.ProductItem productItem : f48527i0.a()) {
            if (str.equalsIgnoreCase(productItem.i())) {
                return productItem;
            }
        }
        return null;
    }

    public static boolean u0(@N String str) {
        try {
            int intValue = Integer.valueOf(str, 16).intValue();
            if (intValue == 8031 || intValue == 8033 || intValue == 8290 || intValue == 8291) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.harman.log.f.a(f48510a, th.getMessage());
            return false;
        }
    }

    @l3.d
    public static String v(String str) {
        com.harman.log.f.a(f48510a, "getProductModelName PID: " + str);
        ProductConfig productConfig = f48527i0;
        if (productConfig == null || productConfig.a() == null) {
            return "";
        }
        for (ProductConfig.ProductItem productItem : f48527i0.a()) {
            if (str.equalsIgnoreCase(productItem.i())) {
                if (productItem.a() == null) {
                    return "";
                }
                return productItem.a();
            }
        }
        return "";
    }

    public static List<DeviceProtocol> w() {
        return f48533l0;
    }

    public static Map<String, String> x(String str, String str2) {
        HashMap hashMap = new HashMap();
        try {
            String b4 = n.b(str.substring(10, 14));
            if (b4.equalsIgnoreCase("0ecb")) {
                hashMap.put("Vendor_ID", b4);
                hashMap.put("Product_ID", n.b(str.substring(14, 18)));
                hashMap.put("Model_ID", str.substring(18, 20));
                String b5 = b(new byte[]{(byte) Integer.parseInt(str.substring(20, 22), 16)});
                hashMap.put("Mute", Integer.toString(Integer.parseInt(b5.substring(2, 3), 2)));
                hashMap.put("Connectable", Integer.toString(Integer.parseInt(b5.substring(5, 6), 2)));
                hashMap.put("Role", Integer.toString(Integer.parseInt(b5.substring(6, 8), 2)));
                String b6 = b(new byte[]{(byte) Integer.parseInt(str.substring(22, 24), 16)});
                hashMap.put("Device_Battery", Integer.toString(Integer.parseInt(b6.substring(1, 8), 2)));
                hashMap.put("BatteryCharging", Integer.toString(Integer.parseInt(b6.substring(0, 1), 2)));
                hashMap.put("Crc", str.substring(24, 28));
                String b7 = b(new byte[]{(byte) Integer.parseInt(str.substring(28, 30), 16)});
                hashMap.put("Volume", String.valueOf(Integer.parseInt(b7.substring(0, 6), 2)));
                hashMap.put("PartyConnect_Mode", Integer.toString(Integer.parseInt(b7.substring(6, 8), 2)));
                if (str.length() > 30) {
                    String b8 = b(new byte[]{(byte) Integer.parseInt(str.substring(30, 32), 16)});
                    hashMap.put("Ble_Standby_Info", Integer.toString(Integer.parseInt(b8.substring(5, 6), 2)));
                    hashMap.put("BT_Connection_Info", Integer.toString(Integer.parseInt(b8.substring(6, 8), 2)));
                    hashMap.put("Second_Crc", str.substring(32, 36));
                }
                hashMap.put("Device_Name", str2);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return hashMap;
    }

    @InterfaceC0578v
    public static int y(Context context, String str, @P String str2) {
        int identifier;
        if (str2 == null) {
            str2 = "01";
        }
        ProductConfig.ImageItem s4 = s(str, str2);
        if (s4 == null) {
            return 0;
        }
        String e4 = s4.e();
        if (context.getResources().getIdentifier(e4, "drawable", context.getPackageName()) == 0) {
            identifier = context.getResources().getIdentifier(e4, "mipmap", context.getPackageName());
        } else {
            identifier = context.getResources().getIdentifier(e4, "drawable", context.getPackageName());
        }
        return Math.max(identifier, 0);
    }

    @InterfaceC0578v
    public static int z(Context context, String str, @P String str2) {
        int identifier;
        if (str2 == null) {
            str2 = "01";
        }
        ProductConfig.ImageItem s4 = s(str, str2);
        if (s4 == null) {
            return 0;
        }
        String f4 = s4.f();
        if (context.getResources().getIdentifier(f4, "drawable", context.getPackageName()) == 0) {
            identifier = context.getResources().getIdentifier(f4, "mipmap", context.getPackageName());
        } else {
            identifier = context.getResources().getIdentifier(f4, "drawable", context.getPackageName());
        }
        return Math.max(identifier, 0);
    }
}
