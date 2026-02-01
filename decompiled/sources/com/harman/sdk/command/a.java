package com.harman.sdk.command;

import android.text.TextUtils;
import com.google.android.material.timepicker.e;
import com.harman.analytics.deviceAws.DeviceAnalytics;
import com.harman.analytics.deviceAws.PlayAnalytics;
import com.harman.analytics.deviceAws.b;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.KaraokeMicEQInfo;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.message.SimpleEQSettings;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.MuteStatus;
import com.harman.sdk.utils.PlayerStatus;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.W;
import kotlin.text.A;
import kotlin.text.C;
import kotlin.text.C2220b;
import kotlin.text.C2222d;
import l3.d;
import org.json.JSONObject;

@U({"SMAP\nCommandProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandProcessor.kt\ncom/harman/sdk/command/CommandProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,831:1\n1#2:832\n1549#3:833\n1620#3,3:834\n1174#4,2:837\n1083#4,2:839\n*S KotlinDebug\n*F\n+ 1 CommandProcessor.kt\ncom/harman/sdk/command/CommandProcessor\n*L\n274#1:833\n274#1:834,3\n424#1:837,2\n546#1:839,2\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final C0427a f47726a = new C0427a(null);

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final String f47727b = "CommandProcessor";

    /* renamed from: com.harman.sdk.command.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0427a {
        public /* synthetic */ C0427a(C2197u c2197u) {
            this();
        }

        private C0427a() {
        }
    }

    private final byte[] a(String str) {
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

    private final String b(String str, boolean z3) {
        int a4;
        int a5;
        StringBuffer stringBuffer = new StringBuffer();
        int i4 = 0;
        while (i4 < str.length()) {
            int i5 = i4 + 2;
            if (i5 <= str.length()) {
                if (z3) {
                    W w3 = W.f52310a;
                    String substring = str.substring(i4, i5);
                    F.o(substring, "substring(...)");
                    a5 = C2220b.a(16);
                    String format = String.format(e.f33925L, Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt(substring, a5))}, 1));
                    F.o(format, "format(...)");
                    stringBuffer.append(format);
                } else {
                    W w4 = W.f52310a;
                    String substring2 = str.substring(i4, i5);
                    F.o(substring2, "substring(...)");
                    a4 = C2220b.a(16);
                    String format2 = String.format(e.f33926M, Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt(substring2, a4))}, 1));
                    F.o(format2, "format(...)");
                    stringBuffer.append(format2);
                }
                stringBuffer.append(".");
            }
            i4 = i5;
        }
        stringBuffer.setLength(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        F.o(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    static /* synthetic */ String c(a aVar, String str, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return aVar.b(str, z3);
    }

    private final int d(String str) {
        Integer num;
        String str2 = str;
        int i4 = 0;
        while (str2.length() > 0) {
            String substring = str2.substring(0, 2);
            F.o(substring, "substring(...)");
            if (F.g(substring, "01")) {
                return i4;
            }
            String[] q4 = q(str2);
            String valueOf = String.valueOf(q4[1]);
            String str3 = q4[2];
            if (str3 != null) {
                num = Integer.valueOf(Integer.parseInt(str3));
            } else {
                num = null;
            }
            if (num != null) {
                i4 += num.intValue();
            }
            str2 = valueOf;
        }
        f.a(f47727b, "getSecondaryDeviceIndex payload = " + str);
        f.a(f47727b, "getSecondaryDeviceIndex targetIndex = " + i4);
        return -1;
    }

    private final void e(HmDevice hmDevice, String str) {
        int a4;
        int a5;
        f.a(f47727b, " parseEQPayload : " + str);
        String substring = str.substring(0, 2);
        F.o(substring, "substring(...)");
        LinkedList<SimpleEQSettings> linkedList = new LinkedList<>();
        f.a(f47727b, " parseEQPayload deviceIdToken : " + substring + " and deviceIndex of device is " + hmDevice.m());
        int m4 = hmDevice.m();
        a4 = C2220b.a(16);
        if (m4 == Integer.parseInt(substring, a4)) {
            SimpleEQSettings simpleEQSettings = new SimpleEQSettings();
            String substring2 = str.substring(2, 4);
            F.o(substring2, "substring(...)");
            a5 = C2220b.a(16);
            simpleEQSettings.e((byte) Integer.parseInt(substring2, a5));
            String substring3 = str.substring(4, 6);
            F.o(substring3, "substring(...)");
            simpleEQSettings.h(Byte.parseByte(substring3));
            LinkedList<SimpleEQSettings.Parameter> linkedList2 = new LinkedList<>();
            String substring4 = str.substring(6, 8);
            F.o(substring4, "substring(...)");
            linkedList2.add(new SimpleEQSettings.Parameter((byte) 1, Byte.parseByte(substring4)));
            String substring5 = str.substring(8, 10);
            F.o(substring5, "substring(...)");
            linkedList2.add(new SimpleEQSettings.Parameter((byte) 2, Byte.parseByte(substring5)));
            String substring6 = str.substring(10, 12);
            F.o(substring6, "substring(...)");
            linkedList2.add(new SimpleEQSettings.Parameter((byte) 3, Byte.parseByte(substring6)));
            simpleEQSettings.f(linkedList2);
            linkedList.add(simpleEQSettings);
            hmDevice.K0(linkedList);
            f.a(f47727b, " parseEQPayload simpleEQSettings is " + simpleEQSettings);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x04d0, code lost:
    
        if (r2.intValue() == 6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04d2, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04dd, code lost:
    
        if (r2.intValue() == 5) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04e8, code lost:
    
        if (r2.intValue() == 4) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04f3, code lost:
    
        if (r2.intValue() == 3) goto L162;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(com.harman.sdk.device.PartyBoxDevice r12, java.lang.String r13, com.harman.sdk.message.BaseMessage r14) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.command.a.g(com.harman.sdk.device.PartyBoxDevice, java.lang.String, com.harman.sdk.message.BaseMessage):void");
    }

    private final void h(PartyBoxDevice partyBoxDevice, String str, BaseMessage baseMessage) {
        int a4;
        String substring = str.substring(0, 2);
        F.o(substring, "substring(...)");
        a4 = C2220b.a(16);
        int parseInt = Integer.parseInt(substring, a4);
        String substring2 = str.substring(2);
        F.o(substring2, "substring(...)");
        if (substring2.length() == 0) {
            f.a(f47727b, "processDeviceInfoRes unprocessedPayload is empty ,just return");
            return;
        }
        f.a(f47727b, "processDeviceInfoRes Device Index = " + parseInt);
        f.a(f47727b, "processDeviceInfoRes firstDevicePayload = " + substring2);
        if (parseInt != 0) {
            if (parseInt == 1) {
                f.a(f47727b, "processDeviceInfoRes secondaryDevicePayload = " + substring2);
                o(partyBoxDevice, substring2);
                return;
            }
            return;
        }
        partyBoxDevice.j0(0);
        g(partyBoxDevice, substring2, baseMessage);
    }

    private final void i(PartyBoxDevice partyBoxDevice, String str) {
        boolean T22;
        if (!F.g(str, partyBoxDevice.s())) {
            T22 = A.T2(str, ".", false, 2, null);
            if (T22) {
                partyBoxDevice.p0(str);
                return;
            }
            if (str.length() >= 6) {
                String substring = str.substring(0, 2);
                F.o(substring, "substring(...)");
                String substring2 = str.substring(2, 4);
                F.o(substring2, "substring(...)");
                String substring3 = str.substring(4, 6);
                F.o(substring3, "substring(...)");
                partyBoxDevice.p0(substring + "." + substring2 + "." + substring3);
            }
        }
    }

    private final void j(PartyBoxDevice partyBoxDevice, String str) {
        boolean T22;
        if (!TextUtils.isEmpty(str)) {
            T22 = A.T2(str, ".", false, 2, null);
            if (!T22) {
                str = b(str, com.harman.sdk.utils.d.F(partyBoxDevice.q()));
            }
            partyBoxDevice.t0(str);
        }
    }

    private final void k(PartyBoxDevice partyBoxDevice, String str) {
        Integer num;
        Integer num2;
        int a4;
        int a5;
        int a6;
        if (str.length() >= 4) {
            KaraokeMicEQInfo Y02 = partyBoxDevice.Y0();
            if (Y02 == null) {
                Y02 = new KaraokeMicEQInfo();
                partyBoxDevice.i2(Y02);
            }
            String substring = str.substring(0, 2);
            F.o(substring, "substring(...)");
            int parseInt = Integer.parseInt(substring);
            String substring2 = str.substring(2, 4);
            F.o(substring2, "substring(...)");
            if (parseInt == 1) {
                a4 = C2220b.a(16);
                Y02.d(Integer.parseInt(substring2, a4));
            } else if (parseInt == 2) {
                a5 = C2220b.a(16);
                Y02.f(Integer.parseInt(substring2, a5));
            } else if (parseInt == 3) {
                a6 = C2220b.a(16);
                Y02.e(Integer.parseInt(substring2, a6));
            }
        }
        KaraokeMicEQInfo Y03 = partyBoxDevice.Y0();
        Integer num3 = null;
        if (Y03 != null) {
            num = Integer.valueOf(Y03.a());
        } else {
            num = null;
        }
        KaraokeMicEQInfo Y04 = partyBoxDevice.Y0();
        if (Y04 != null) {
            num2 = Integer.valueOf(Y04.c());
        } else {
            num2 = null;
        }
        KaraokeMicEQInfo Y05 = partyBoxDevice.Y0();
        if (Y05 != null) {
            num3 = Integer.valueOf(Y05.b());
        }
        f.a(f47727b, "NOTIFY_KARAOKE command processed and Bass: " + num + " and Treble: " + num2 + " and Echo: " + num3);
    }

    private final Color l(String str) {
        int a4;
        int a5;
        int a6;
        String substring = str.substring(0, 2);
        F.o(substring, "substring(...)");
        a4 = C2220b.a(16);
        int parseInt = Integer.parseInt(substring, a4);
        String substring2 = str.substring(2, 4);
        F.o(substring2, "substring(...)");
        a5 = C2220b.a(16);
        int parseInt2 = Integer.parseInt(substring2, a5);
        String substring3 = str.substring(4, 6);
        F.o(substring3, "substring(...)");
        a6 = C2220b.a(16);
        return new Color(parseInt, parseInt2, Integer.parseInt(substring3, a6));
    }

    private final void m(PartyBoxDevice partyBoxDevice, String str) {
        int a4;
        int a5;
        String substring = str.substring(2);
        F.o(substring, "substring(...)");
        if (substring.length() == 0) {
            return;
        }
        MusicControlSettings e12 = partyBoxDevice.e1();
        if (e12 == null) {
            e12 = new MusicControlSettings();
        }
        while (substring.length() > 0) {
            String substring2 = substring.substring(0, 2);
            F.o(substring2, "substring(...)");
            String[] q4 = q(substring);
            String valueOf = String.valueOf(q4[1]);
            String valueOf2 = String.valueOf(q4[0]);
            String str2 = "";
            switch (substring2.hashCode()) {
                case 1661:
                    if (!substring2.equals("41")) {
                        break;
                    } else {
                        e12.m(PlayerStatus.Companion.b(valueOf2));
                        f.a(f47727b, "PlayerInfo: status = " + e12.f());
                        continue;
                    }
                case 1662:
                    if (!substring2.equals("42")) {
                        break;
                    }
                    break;
                case 1663:
                    if (!substring2.equals("43")) {
                        break;
                    } else {
                        e12.j(MuteStatus.Companion.b(valueOf2));
                        f.a(f47727b, "PlayerInfo: mute = " + e12.c());
                        continue;
                    }
                case 1664:
                    if (!substring2.equals("44")) {
                        break;
                    } else {
                        String k4 = g.k(valueOf2);
                        if (k4 != null) {
                            str2 = k4;
                        }
                        e12.l(str2);
                        f.a(f47727b, "PlayerInfo: song name = " + e12.e());
                        continue;
                    }
                case 1665:
                    if (!substring2.equals(k.f48698o1)) {
                        break;
                    } else {
                        String k5 = g.k(valueOf2);
                        if (k5 == null) {
                            k5 = "";
                        }
                        f.a(f47727b, "PlayerInfo: artist name=" + k5);
                        if (F.g(k5, " ")) {
                            e12.h("");
                            continue;
                        } else {
                            e12.h(k5);
                            break;
                        }
                    }
                case 1666:
                    if (!substring2.equals(k.f48682k1)) {
                        break;
                    }
                    break;
                case 1667:
                    if (!substring2.equals(k.f48686l1)) {
                        break;
                    } else {
                        a5 = C2220b.a(16);
                        e12.k(Integer.parseInt(valueOf2, a5));
                        f.a(f47727b, "PlayerInfo: Secondary volume = " + e12.g());
                        continue;
                    }
            }
            a4 = C2220b.a(16);
            e12.n(Integer.parseInt(valueOf2, a4));
            f.a(f47727b, "PlayerInfo: volume = " + e12.g());
            substring = valueOf;
        }
        partyBoxDevice.o2(e12);
    }

    private final void n(PartyBoxDevice partyBoxDevice, String str) {
        int a4;
        int a5;
        String substring = str.substring(0, 2);
        F.o(substring, "substring(...)");
        a4 = C2220b.a(16);
        String b4 = g.b(new byte[]{(byte) Integer.parseInt(substring, a4)});
        F.o(b4, "bytes2BinStr(...)");
        String substring2 = b4.substring(6, 8);
        F.o(substring2, "substring(...)");
        a5 = C2220b.a(2);
        DeviceRole a6 = DeviceRole.Companion.a(Integer.parseInt(substring2, a5));
        if (DeviceRole.UNKNOWN == a6) {
            f.g(f47727b, "processRoleCommand() >>> unknown role. content[" + str + "] roleInfo[" + substring + "]");
            return;
        }
        partyBoxDevice.J0(a6);
        f.a(f47727b, "processRoleCommand() >>> MAC[" + partyBoxDevice.n() + "] content[" + str + "] role[" + partyBoxDevice.J().f() + "]");
    }

    private final void o(PartyBoxDevice partyBoxDevice, String str) {
        if (str != null && str.length() != 0) {
            while (str.length() > 0) {
                String substring = str.substring(0, 2);
                F.o(substring, "substring(...)");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                F.o(lowerCase, "toLowerCase(...)");
                String[] q4 = q(str);
                String valueOf = String.valueOf(q4[1]);
                String valueOf2 = String.valueOf(q4[0]);
                int hashCode = lowerCase.hashCode();
                if (hashCode != 1636) {
                    String str2 = "";
                    if (hashCode != 1660) {
                        if (hashCode != 1661) {
                            switch (hashCode) {
                                case 1630:
                                    if (lowerCase.equals(k.f48727x)) {
                                        f.a(f47727b, "Device Product ID = " + valueOf2);
                                        partyBoxDevice.l1().put("Product_ID", valueOf2);
                                        break;
                                    }
                                    break;
                                case 1631:
                                    if (lowerCase.equals(k.f48730y)) {
                                        f.a(f47727b, "Device Model ID = " + valueOf2);
                                        partyBoxDevice.l1().put("Model_ID", valueOf2);
                                        break;
                                    }
                                    break;
                                case 1632:
                                    if (lowerCase.equals(k.f48733z)) {
                                        BatteryInfo r4 = r(valueOf2);
                                        partyBoxDevice.l1().put("Device_Battery", r4);
                                        f.a(f47727b, "batteryStatus : " + r4);
                                        break;
                                    }
                                    break;
                            }
                            f.a(f47727b, "else ");
                        } else {
                            if (lowerCase.equals("41")) {
                                if (!TextUtils.isEmpty(valueOf2)) {
                                    str2 = b(valueOf2, com.harman.sdk.utils.d.F(partyBoxDevice.q()));
                                }
                                f.a(f47727b, "Firmware version = " + str2);
                                partyBoxDevice.l1().put("Firmware_Version", str2);
                            }
                            f.a(f47727b, "else ");
                        }
                    } else {
                        if (lowerCase.equals(k.f48592K)) {
                            String k4 = g.k(valueOf2);
                            if (k4 != null) {
                                str2 = k4;
                            }
                            f.a(f47727b, "Serial Number = " + str2);
                            partyBoxDevice.l1().put("Serial_Number", str2);
                        }
                        f.a(f47727b, "else ");
                    }
                } else {
                    if (lowerCase.equals(k.f48571D)) {
                        f.a(f47727b, "Mac address = " + valueOf2);
                        if (valueOf2.length() == 12) {
                            StringBuffer stringBuffer = new StringBuffer();
                            int i4 = 0;
                            for (int i5 = 0; i5 < valueOf2.length(); i5++) {
                                char charAt = valueOf2.charAt(i5);
                                if (i4 != 0 && i4 % 2 == 0) {
                                    stringBuffer.append(":");
                                }
                                stringBuffer.append(charAt);
                                i4++;
                            }
                            if (com.harman.sdk.utils.d.H(partyBoxDevice.q())) {
                                String stringBuffer2 = stringBuffer.toString();
                                F.o(stringBuffer2, "toString(...)");
                                String upperCase = stringBuffer2.toUpperCase(Locale.ROOT);
                                F.o(upperCase, "toUpperCase(...)");
                                partyBoxDevice.v2(upperCase);
                            }
                            HashMap<String, Object> l12 = partyBoxDevice.l1();
                            String stringBuffer3 = stringBuffer.toString();
                            F.o(stringBuffer3, "toString(...)");
                            String upperCase2 = stringBuffer3.toUpperCase(Locale.ROOT);
                            F.o(upperCase2, "toUpperCase(...)");
                            l12.put("Mac_Address", upperCase2);
                        }
                    }
                    f.a(f47727b, "else ");
                }
                str = valueOf;
            }
            return;
        }
        f.a(f47727b, "processDeviceInfoRes secondary device payload info empty");
    }

    private final String p(String str) {
        List r6;
        String m32;
        r6 = C.r6(str, 2);
        m32 = D.m3(r6, ":", null, null, 0, null, null, 62, null);
        if (m32 != null && !F.g(m32, "ffffffffffff")) {
            f.a(f47727b, "BLE_LOG Secondary Mac Address Received is " + m32);
        } else {
            f.a(f47727b, "CommandProcessor Secondary Mac Address Received is Null.");
        }
        return m32;
    }

    private final String[] q(String str) {
        int a4;
        String[] strArr = new String[3];
        try {
            String substring = str.substring(2, 4);
            F.o(substring, "substring(...)");
            a4 = C2220b.a(16);
            int parseInt = (Integer.parseInt(substring, a4) * 2) + 4;
            String substring2 = str.substring(4, parseInt);
            F.o(substring2, "substring(...)");
            String substring3 = str.substring(parseInt);
            F.o(substring3, "substring(...)");
            strArr[0] = substring2;
            strArr[1] = substring3;
            strArr[2] = String.valueOf(parseInt);
        } catch (Exception e4) {
            e4.printStackTrace();
            try {
                String substring4 = str.substring(2);
                F.o(substring4, "substring(...)");
                strArr[1] = substring4;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return strArr;
    }

    private final BatteryInfo r(String str) {
        int a4;
        int a5;
        int a6;
        boolean z3 = false;
        a4 = C2220b.a(16);
        int parseInt = Integer.parseInt(str, a4);
        BatteryInfo batteryInfo = new BatteryInfo();
        if (240 == parseInt) {
            batteryInfo.e(true);
        } else {
            batteryInfo.e(false);
            String b4 = g.b(new byte[]{(byte) parseInt});
            F.o(b4, "bytes2BinStr(...)");
            String substring = b4.substring(1, 8);
            F.o(substring, "substring(...)");
            String str2 = com.harman.jbl.partybox.ui.effectlab.a.f43472q + substring;
            a5 = C2220b.a(2);
            batteryInfo.h(Integer.parseInt(str2, a5));
            String substring2 = b4.substring(0, 1);
            F.o(substring2, "substring(...)");
            a6 = C2220b.a(2);
            if (Integer.parseInt(substring2, a6) == 1) {
                z3 = true;
            }
            batteryInfo.g(z3);
        }
        return batteryInfo;
    }

    @d
    public final BaseMessage f(@d HmDevice device, @d com.harman.sdk.a receiveCommand, @l3.e com.harman.sdk.a aVar) {
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        byte[] n4;
        F.p(device, "device");
        F.p(receiveCommand, "receiveCommand");
        String g4 = g.g(receiveCommand.n());
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        f.a(f47727b, " processCommand : " + ((int) receiveCommand.k()));
        if (com.harman.sdk.utils.d.a0(device)) {
            if (receiveCommand.k() == 31) {
                baseMessage.d(MessageID.AURACAST_STATUS);
                if ((receiveCommand instanceof BaseCommandWiFi) && (n4 = receiveCommand.n()) != null && new JSONObject(new String(n4, C2222d.f52792b)).optInt("error_code") == 0) {
                    AuracastInfo d4 = device.d();
                    if (d4 == null) {
                        d4 = new AuracastInfo();
                    }
                    d4.h(((BaseCommandWiFi) receiveCommand).y() == 287 ? AuracastStatus.AURACAST_MODE : AuracastStatus.NORMAL_MODE);
                    device.Y(d4);
                }
                baseMessage.e(device);
            }
            return baseMessage;
        }
        if (!com.harman.sdk.utils.d.X(device) && !com.harman.sdk.utils.d.k0(device)) {
            byte k4 = receiveCommand.k();
            if (k4 == -78) {
                f.a("DEVICE_ANALYTICS_LOG", " " + receiveCommand);
                baseMessage.d(MessageID.ANALYTICS_INFO_DEVICE_DATA);
                String a12 = receiveCommand.a();
                if (a12 != null && a12.length() > 6) {
                    String substring = a12.substring(6);
                    F.o(substring, "substring(...)");
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) device;
                    DeviceAnalytics j4 = new com.harman.analytics.deviceAws.a().j(substring, partyBoxDevice.R0());
                    partyBoxDevice.W1(j4);
                    baseMessage.e(j4);
                }
            } else if (k4 == -76) {
                f.a("PLAY_ANALYTICS_LOG", " " + receiveCommand);
                baseMessage.d(MessageID.ANALYTICS_INFO_PLAY_DATA);
                String a13 = receiveCommand.a();
                if (a13 != null && a13.length() > 8) {
                    String substring2 = a13.substring(8);
                    F.o(substring2, "substring(...)");
                    PartyBoxDevice partyBoxDevice2 = (PartyBoxDevice) device;
                    PlayAnalytics f4 = new b().f(substring2, partyBoxDevice2.k1());
                    partyBoxDevice2.u2(f4);
                    baseMessage.e(f4);
                }
            } else if (k4 != 69) {
                if (k4 == 18) {
                    F.m(g4);
                    h((PartyBoxDevice) device, g4, baseMessage);
                    baseMessage.e(device);
                    baseMessage.d(MessageID.DEVICE_INFO);
                } else {
                    if (k4 == -94) {
                        f.a(f47727b, " RET_DEV_FEATURE_INFO " + device.n() + ",payloadContent:" + g4);
                        return new ReqDevFeatureInfoCommand().q(device, receiveCommand);
                    }
                    if (k4 == -21) {
                        f.a(f47727b, " RET_DEVICE_DELAY_DURATION " + device.n() + ",payloadContent:" + g4);
                        F.m(g4);
                        a11 = C2220b.a(16);
                        device.i0(((long) Integer.parseInt(g4, a11)) * 1000);
                    } else if (k4 == 66) {
                        PartyBoxDevice partyBoxDevice3 = (PartyBoxDevice) device;
                        F.m(g4);
                        m(partyBoxDevice3, g4);
                        f.a(f47727b, "RET_PLAYER_INFO command received " + partyBoxDevice3.e1());
                        baseMessage.e(device);
                        baseMessage.d(MessageID.PLAYER_INFO);
                    } else if (k4 == -123) {
                        f.a(f47727b, "Receive SET_SECONDARY_SPEAKER_ADDRESS cmd =  " + g4);
                        F.m(g4);
                        String p4 = p(g4);
                        f.a(f47727b, "Receive SET_SECONDARY_SPEAKER_ADDRESS =  " + p4);
                        ((PartyBoxDevice) device).v2(p4);
                        baseMessage.e(p4);
                        baseMessage.d(MessageID.SECONDARY_MAC_STATUS);
                    } else if (k4 == 2) {
                        f.a(f47727b, "Receive RET_DEV_BYE_BYE cmd =  " + g4);
                    } else if (k4 != 34) {
                        if (k4 == 22) {
                            f.a(f47727b, " processCommand : ROLE_INFO ");
                            F.m(g4);
                            n((PartyBoxDevice) device, g4);
                            baseMessage.d(MessageID.DEVICE_INFO);
                            baseMessage.e(device);
                        } else if (k4 != 90) {
                            if (k4 == 99) {
                                f.a(f47727b, " RET_BASS_BOOST ");
                                baseMessage.e(device);
                                baseMessage.d(MessageID.BASS_BOOST_STATUS);
                            } else if (k4 == 98) {
                                f.a(f47727b, " RET_BASS_BOOST value");
                                F.m(g4);
                                a10 = C2220b.a(16);
                                ((PartyBoxDevice) device).U1(Integer.parseInt(g4, a10));
                                baseMessage.e(device);
                                baseMessage.d(MessageID.BASS_BOOST_STATUS);
                            } else if (k4 == 98 || k4 == 100) {
                                F.m(g4);
                                a4 = C2220b.a(16);
                                device.q0(Byte.parseByte(g4, a4));
                                baseMessage.d(MessageID.EQ_MODE_STATUS);
                                baseMessage.e(device);
                            } else if (k4 == 102) {
                                F.m(g4);
                                a9 = C2220b.a(16);
                                device.s0(Byte.parseByte(g4, a9));
                                baseMessage.e(device);
                            } else if (k4 == 105) {
                                F.m(g4);
                                a8 = C2220b.a(16);
                                device.v0(Byte.parseByte(g4, a8));
                                baseMessage.e(device);
                                baseMessage.d(MessageID.HFP_STATUS);
                            } else if (k4 != -126) {
                                if (k4 == 120) {
                                    F.m(g4);
                                    a7 = C2220b.a(16);
                                    device.Z(Integer.parseInt(g4, a7));
                                    baseMessage.e(device);
                                } else if (k4 == 75) {
                                    F.m(g4);
                                    i((PartyBoxDevice) device, g4);
                                    baseMessage.e(device);
                                } else if (k4 != 76) {
                                    if (k4 == 116) {
                                        f.a(f47727b, "NOTIFY_KARAOKE command received");
                                        F.m(g4);
                                        k((PartyBoxDevice) device, g4);
                                        baseMessage.d(MessageID.KARAOKE_STATUS);
                                        baseMessage.e(device);
                                    } else if (k4 == 114) {
                                        baseMessage.d(MessageID.KARAOKE_STATUS);
                                    } else if (k4 == 50) {
                                        F.m(g4);
                                        String substring3 = g4.substring(2);
                                        F.o(substring3, "substring(...)");
                                        LightInfoReqCommand.f47646L.b((PartyBoxDevice) device, substring3);
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.LIGHT_STATUS);
                                    } else if (k4 == 52) {
                                        if (g4 != null && g4.length() > 0) {
                                            String substring4 = g4.substring(2);
                                            F.o(substring4, "substring(...)");
                                            LightInfoReqCommand.f47646L.a((PartyBoxDevice) device, substring4);
                                        } else {
                                            PartyBoxDevice partyBoxDevice4 = (PartyBoxDevice) device;
                                            PartyBoxLightShowSettings h12 = partyBoxDevice4.h1();
                                            if (h12 == null) {
                                                h12 = new PartyBoxLightShowSettings();
                                            }
                                            partyBoxDevice4.r2(h12);
                                            PartyBoxLightShowSettings h13 = partyBoxDevice4.h1();
                                            if (h13 != null) {
                                                h13.t(new ArrayList());
                                            }
                                        }
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.LIGHT_ACTIVE_PATTERN_STATUS);
                                    } else if (k4 == -125) {
                                        f.a(f47727b, "REQ_PHONE_MAC_ADDRESS_FROM_DEVICE command received");
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.RET_PHONE_MAC_ADDRESS_STATUS);
                                    } else if (k4 == -109) {
                                        f.a(f47727b, "BLE_LOG RET_SIMPLE_EQ ");
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.EQ_STATUS);
                                    } else if (k4 == -110) {
                                        f.a(f47727b, " RET_SIMPLE_EQ ");
                                        F.m(g4);
                                        e(device, g4);
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.EQ_STATUS);
                                    } else if (k4 == -14) {
                                        F.m(g4);
                                        f.a(f47727b, " RET_FEEDBACK_TONE " + ((int) Byte.parseByte(g4)));
                                        device.s0(Byte.parseByte(g4));
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.FEEDBACK_TONE_STATUS);
                                    } else if (k4 == -62) {
                                        F.m(g4);
                                        a5 = C2220b.a(16);
                                        f.a(f47727b, " RET_MIC_INFO_STATUS： " + Integer.parseInt(g4, a5));
                                        a6 = C2220b.a(16);
                                        ((PartyBoxDevice) device).n2(Integer.parseInt(g4, a6));
                                        baseMessage.e(device);
                                        baseMessage.d(MessageID.RET_MIC_CONNECTION_INFO);
                                    } else {
                                        if (k4 == -61) {
                                            f.a(f47727b, " RET_WIRELESS_MIC_INFO_STATUS： " + g4);
                                            return new ReqMicConnectionInfoCommand().q(device, receiveCommand);
                                        }
                                        if (k4 == Byte.MAX_VALUE) {
                                            baseMessage.d(MessageID.RET_ONE_TOUCH_MUSIC_TRIGGERED);
                                        } else {
                                            if (k4 == -30) {
                                                f.a(f47727b, " RET_ADVANCE_EQ： " + g4);
                                                return new ReqAdvancedEQCommand().q(device, receiveCommand);
                                            }
                                            if (k4 == -59) {
                                                f.a(f47727b, " RET_MIC_UPDATE_RESULT： " + g4);
                                                return new MicOTAResultCommand().q(device, receiveCommand);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return baseMessage;
    }
}
