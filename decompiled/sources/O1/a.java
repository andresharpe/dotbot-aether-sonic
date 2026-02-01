package O1;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import com.harman.jbl.cd_biz_comm.utils.h;
import com.harman.jbl.cd_biz_comm.utils.j;
import com.harman.jbl.cd_biz_comm.utils.n;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f1711a = com.harman.sdk.impl.scan.e.f48064b;

    private final void b(String str, Map<String, String> map) {
        int a4;
        int a5;
        int a6;
        a4 = C2220b.a(16);
        int parseInt = Integer.parseInt(str, a4);
        if (240 == parseInt) {
            map.put("AC_Cable_Without_Battery", "1");
            return;
        }
        String b4 = j.b(new byte[]{(byte) parseInt});
        F.o(b4, "bytes2BinStr(...)");
        String substring = b4.substring(1, 8);
        F.o(substring, "substring(...)");
        a5 = C2220b.a(2);
        map.put("Device_Battery", String.valueOf(Integer.parseInt(substring, a5)));
        String substring2 = b4.substring(0, 1);
        F.o(substring2, "substring(...)");
        a6 = C2220b.a(2);
        map.put("Charging", String.valueOf(Integer.parseInt(substring2, a6)));
    }

    private final Map<String, String> c(ScanResult scanResult) {
        String str;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ScanRecord scanRecord = scanResult.getScanRecord();
            F.m(scanRecord);
            String g4 = j.g(scanRecord.getManufacturerSpecificData(this.f1711a));
            F.o(g4, "encodeHexStr(...)");
            String substring = g4.substring(0, 4);
            F.o(substring, "substring(...)");
            String b4 = n.b(substring);
            F.o(b4, "changeToLittleEndian(...)");
            if (!h.d(b4)) {
                return null;
            }
            linkedHashMap.put("Product_ID", b4);
            ScanRecord scanRecord2 = scanResult.getScanRecord();
            if (scanRecord2 != null) {
                str = scanRecord2.getDeviceName();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("Device_Name", str);
            String substring2 = g4.substring(4, 6);
            F.o(substring2, "substring(...)");
            linkedHashMap.put("Model_ID", substring2);
            String substring3 = g4.substring(6, 8);
            F.o(substring3, "substring(...)");
            a4 = C2220b.a(16);
            linkedHashMap.put(h.f37887B, String.valueOf(Integer.parseInt(substring3, a4)));
            String substring4 = g4.substring(8, 10);
            F.o(substring4, "substring(...)");
            a5 = C2220b.a(16);
            try {
                String b5 = j.b(new byte[]{(byte) Integer.parseInt(substring4, a5)});
                F.o(b5, "bytes2BinStr(...)");
                String substring5 = b5.substring(5, 6);
                F.o(substring5, "substring(...)");
                a6 = C2220b.a(2);
                int parseInt = Integer.parseInt(substring5, a6);
                linkedHashMap.put("Aurocast_Support", "1");
                String substring6 = b5.substring(7, 8);
                F.o(substring6, "substring(...)");
                a7 = C2220b.a(2);
                linkedHashMap.put("Aurocast_Status", String.valueOf(Integer.parseInt(substring6, a7)));
                String substring7 = b5.substring(6, 7);
                F.o(substring7, "substring(...)");
                a8 = C2220b.a(2);
                linkedHashMap.put(h.f37890E, String.valueOf(Integer.parseInt(substring7, a8)));
                String num = Integer.toString(parseInt);
                F.o(num, "toString(...)");
                linkedHashMap.put("Connect_Able", num);
                String substring8 = g4.substring(10, 16);
                F.o(substring8, "substring(...)");
                String substring9 = substring8.substring(0, 2);
                F.o(substring9, "substring(...)");
                a9 = C2220b.a(16);
                int parseInt2 = Integer.parseInt(substring9, a9);
                String substring10 = substring8.substring(2, 4);
                F.o(substring10, "substring(...)");
                a10 = C2220b.a(16);
                int parseInt3 = Integer.parseInt(substring10, a10);
                String substring11 = substring8.substring(4, 6);
                F.o(substring11, "substring(...)");
                a11 = C2220b.a(16);
                linkedHashMap.put("Firmware_Version", parseInt2 + "." + parseInt3 + "." + Integer.parseInt(substring11, a11));
                String substring12 = g4.substring(16, 18);
                F.o(substring12, "substring(...)");
                b(substring12, linkedHashMap);
                String substring13 = g4.substring(18, 24);
                F.o(substring13, "substring(...)");
                linkedHashMap.put("Serial_Number", substring13);
                String substring14 = g4.substring(24, 28);
                F.o(substring14, "substring(...)");
                linkedHashMap.put(h.f37886A, substring14);
                return linkedHashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // O1.d
    @l3.e
    public ModuleDevice a(@l3.d ScanResult scanResult) {
        int i4;
        F.p(scanResult, "scanResult");
        Map<String, String> c4 = c(scanResult);
        if (c4 != null) {
            PartyLightDevice partyLightDevice = new PartyLightDevice();
            String str = c4.get("Serial_Number");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            partyLightDevice.n(str);
            String str3 = c4.get("Product_ID");
            if (str3 == null) {
                str3 = "";
            }
            partyLightDevice.l(str3);
            String str4 = c4.get("Device_Name");
            if (str4 == null) {
                str4 = "";
            }
            partyLightDevice.k(str4);
            partyLightDevice.j(F.g(c4.get("Connect_Able"), com.harman.jbl.partybox.ui.effectlab.a.f43472q));
            String str5 = c4.get("Serial_Number");
            if (str5 == null) {
                str5 = "";
            }
            partyLightDevice.z(str5);
            String str6 = c4.get(h.f37887B);
            if (str6 == null) {
                str6 = "";
            }
            partyLightDevice.A(str6);
            boolean g4 = F.g(c4.get("AC_Cable_Without_Battery"), "1");
            String str7 = c4.get("Device_Battery");
            if (str7 != null) {
                i4 = Integer.parseInt(str7);
            } else {
                i4 = 0;
            }
            partyLightDevice.w(new com.harman.jbl.cd_biz_comm.wireless_tech.type.a(g4, i4, F.g(c4.get("Charging"), "1")));
            String str8 = c4.get("Firmware_Version");
            if (str8 == null) {
                str8 = "";
            }
            partyLightDevice.x(str8);
            String str9 = c4.get(h.f37886A);
            if (str9 != null) {
                str2 = str9;
            }
            partyLightDevice.y(str2);
            com.harman.jbl.cd_biz_comm.logger.d.a("LightParser", "uuid = " + partyLightDevice.g() + ", pid = " + partyLightDevice.d() + ", deviceName = " + partyLightDevice.c() + ", isConnectable = " + partyLightDevice.h() + ", serialNumber = " + partyLightDevice.r() + ", stageNumber = " + partyLightDevice.s() + ", batteryInfo = " + partyLightDevice.o() + ", linkedSpeakId = " + partyLightDevice.q());
            return partyLightDevice;
        }
        return null;
    }
}
