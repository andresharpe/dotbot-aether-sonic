package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import java.util.ArrayList;
import java.util.Map;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;
import l3.e;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/harman/sdk/command/LightInfoReqCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LightInfoReqCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47646L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    @d
    private static final String f47647M = "LightInfoReqCommand";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private final Color c(String str) {
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

        private final String[] d(String str) {
            int a4;
            String[] strArr = new String[2];
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
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return strArr;
        }

        public final void a(@d PartyBoxDevice deviceModel, @e String str) {
            int a4;
            F.p(deviceModel, "deviceModel");
            f.a(LightInfoReqCommand.f47647M, "parseAndGetInActivePatterns device = " + deviceModel.n() + ", cmd = " + str);
            PartyBoxLightShowSettings h12 = deviceModel.h1();
            if (h12 == null) {
                h12 = new PartyBoxLightShowSettings();
            }
            ArrayList arrayList = new ArrayList();
            if (str != null && !F.g(str, "null") && str.length() > 0) {
                int length = str.length() / 2;
                for (int i4 = 0; i4 < length; i4++) {
                    String substring = str.substring(0, 2);
                    F.o(substring, "substring(...)");
                    a4 = C2220b.a(16);
                    LightPattern a5 = LightPattern.Companion.a(Integer.parseInt(substring, a4));
                    if (a5 != LightPattern.OFF && a5 != LightPattern.CUSTOM && a5 != LightPattern.UNKNOWN) {
                        arrayList.add(a5);
                    }
                    str = str.substring(2);
                    F.o(str, "substring(...)");
                }
            }
            h12.t(arrayList);
            deviceModel.r2(h12);
        }

        public final void b(@d PartyBoxDevice deviceModel, @d String cmd) {
            PartyBoxLightShowSettings h12;
            int a4;
            int a5;
            int a6;
            int a7;
            int a8;
            int a9;
            int a10;
            int a11;
            int a12;
            int a13;
            int a14;
            int a15;
            F.p(deviceModel, "deviceModel");
            F.p(cmd, "cmd");
            if (deviceModel.h1() == null) {
                h12 = new PartyBoxLightShowSettings();
            } else {
                h12 = deviceModel.h1();
                F.m(h12);
            }
            while (cmd.length() > 0 && !F.g(cmd, "null")) {
                boolean z3 = false;
                String substring = cmd.substring(0, 2);
                F.o(substring, "substring(...)");
                String[] d4 = d(cmd);
                String valueOf = String.valueOf(d4[1]);
                String valueOf2 = String.valueOf(d4[0]);
                int hashCode = substring.hashCode();
                if (hashCode != 1668) {
                    if (hashCode != 1709) {
                        if (hashCode != 1824) {
                            switch (hashCode) {
                                case 1630:
                                    if (!substring.equals(k.f48727x)) {
                                        break;
                                    } else {
                                        a6 = C2220b.a(16);
                                        int parseInt = Integer.parseInt(valueOf2, a6);
                                        h12.o(LightPattern.Companion.a(parseInt));
                                        if (!deviceModel.E1(deviceModel)) {
                                            Map<LightElements, Boolean> i4 = h12.i();
                                            LightElements lightElements = LightElements.LIGHT_EIGHT;
                                            if (parseInt != 0) {
                                                z3 = true;
                                            }
                                            i4.put(lightElements, Boolean.valueOf(z3));
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                case 1631:
                                    if (!substring.equals(k.f48730y)) {
                                        break;
                                    } else {
                                        h12.q(c(valueOf2));
                                        break;
                                    }
                                case 1632:
                                    if (!substring.equals(k.f48733z)) {
                                        break;
                                    } else {
                                        Map<LightElements, Boolean> i5 = h12.i();
                                        LightElements lightElements2 = LightElements.LIGHT_STROBE;
                                        a7 = C2220b.a(16);
                                        if (Integer.parseInt(valueOf2, a7) == 1) {
                                            z3 = true;
                                        }
                                        i5.put(lightElements2, Boolean.valueOf(z3));
                                        break;
                                    }
                                default:
                                    switch (hashCode) {
                                        case 1635:
                                            if (!substring.equals(k.f48568C)) {
                                                break;
                                            } else {
                                                ColorMode.a aVar = ColorMode.Companion;
                                                a8 = C2220b.a(16);
                                                h12.r(aVar.a(Integer.parseInt(valueOf2, a8)));
                                                break;
                                            }
                                        case 1636:
                                            substring.equals(k.f48571D);
                                            break;
                                        case 1637:
                                            if (!substring.equals(k.f48574E)) {
                                                break;
                                            } else {
                                                Map<LightElements, Boolean> i6 = h12.i();
                                                LightElements lightElements3 = LightElements.LIGHT_EIGHT;
                                                a9 = C2220b.a(16);
                                                if (Integer.parseInt(valueOf2, a9) == 1) {
                                                    z3 = true;
                                                }
                                                i6.put(lightElements3, Boolean.valueOf(z3));
                                                break;
                                            }
                                        case 1638:
                                            if (!substring.equals(k.f48577F)) {
                                                break;
                                            } else {
                                                Map<LightElements, Boolean> i7 = h12.i();
                                                LightElements lightElements4 = LightElements.LIGHT_SIDE_RING;
                                                a10 = C2220b.a(16);
                                                if (Integer.parseInt(valueOf2, a10) == 1) {
                                                    z3 = true;
                                                }
                                                i7.put(lightElements4, Boolean.valueOf(z3));
                                                break;
                                            }
                                        default:
                                            switch (hashCode) {
                                                case 1660:
                                                    if (!substring.equals(k.f48592K)) {
                                                        break;
                                                    } else {
                                                        Map<LightElements, Boolean> i8 = h12.i();
                                                        LightElements lightElements5 = LightElements.LIGHT_STRIPE;
                                                        a11 = C2220b.a(16);
                                                        if (Integer.parseInt(valueOf2, a11) == 1) {
                                                            z3 = true;
                                                        }
                                                        i8.put(lightElements5, Boolean.valueOf(z3));
                                                        break;
                                                    }
                                                case 1661:
                                                    if (!substring.equals("41")) {
                                                        break;
                                                    } else {
                                                        Map<LightElements, Boolean> i9 = h12.i();
                                                        LightElements lightElements6 = LightElements.LIGHT_STAR;
                                                        a12 = C2220b.a(16);
                                                        if (Integer.parseInt(valueOf2, a12) == 1) {
                                                            z3 = true;
                                                        }
                                                        i9.put(lightElements6, Boolean.valueOf(z3));
                                                        break;
                                                    }
                                                case 1662:
                                                    if (!substring.equals("42")) {
                                                        break;
                                                    } else {
                                                        Map<LightElements, Boolean> i10 = h12.i();
                                                        LightElements lightElements7 = LightElements.LIGHT_STROBE_UP;
                                                        a13 = C2220b.a(16);
                                                        if (Integer.parseInt(valueOf2, a13) == 1) {
                                                            z3 = true;
                                                        }
                                                        i10.put(lightElements7, Boolean.valueOf(z3));
                                                        break;
                                                    }
                                                case 1663:
                                                    if (!substring.equals("43")) {
                                                        break;
                                                    } else {
                                                        Map<LightElements, Boolean> i11 = h12.i();
                                                        LightElements lightElements8 = LightElements.LIGHT_STROBE_DOWN;
                                                        a14 = C2220b.a(16);
                                                        if (Integer.parseInt(valueOf2, a14) == 1) {
                                                            z3 = true;
                                                        }
                                                        i11.put(lightElements8, Boolean.valueOf(z3));
                                                        break;
                                                    }
                                                case 1664:
                                                    if (!substring.equals("44")) {
                                                        break;
                                                    } else {
                                                        Map<LightElements, Boolean> i12 = h12.i();
                                                        LightElements lightElements9 = LightElements.LIGHT_EDGE;
                                                        a15 = C2220b.a(16);
                                                        if (Integer.parseInt(valueOf2, a15) == 1) {
                                                            z3 = true;
                                                        }
                                                        i12.put(lightElements9, Boolean.valueOf(z3));
                                                        break;
                                                    }
                                            }
                                    }
                            }
                        } else if (substring.equals("99")) {
                            Map<LightElements, Boolean> i13 = h12.i();
                            LightElements lightElements10 = LightElements.MAIN_SWITCH;
                            a5 = C2220b.a(16);
                            if (Integer.parseInt(valueOf2, a5) == 1) {
                                z3 = true;
                            }
                            i13.put(lightElements10, Boolean.valueOf(z3));
                        }
                    } else if (substring.equals("4a")) {
                        h12.B(valueOf2);
                    }
                } else if (substring.equals("48")) {
                    a4 = C2220b.a(16);
                    h12.A(Integer.parseInt(valueOf2, a4));
                }
                cmd = valueOf;
            }
            deviceModel.r2(h12);
        }

        private a() {
        }
    }

    public LightInfoReqCommand() {
        p((byte) 49);
        j(null);
        v().add((byte) 50);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        byte[] n4;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        byte[] n5 = receivedCommand.n();
        if (n5 != null && n5.length >= 2 && 50 == receivedCommand.k() && (n4 = receivedCommand.n()) != null) {
            String g4 = g.g(n4);
            F.o(g4, "encodeHexStr(...)");
            String substring = g4.substring(2);
            F.o(substring, "substring(...)");
            v().clear();
            if (device instanceof PartyBoxDevice) {
                f47646L.b((PartyBoxDevice) device, substring);
            }
            baseMessage.e(device);
            baseMessage.d(MessageID.LIGHT_STATUS);
        }
        return baseMessage;
    }
}
