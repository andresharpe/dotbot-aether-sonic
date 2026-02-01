package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/harman/sdk/command/ReqDevFeatureInfoCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "myDeviceModel", "", "cmd", "Lkotlin/H0;", "y", "(Lcom/harman/sdk/device/HmDevice;Ljava/lang/String;)V", "unprocessedPayload", "", "z", "(Ljava/lang/String;)[Ljava/lang/String;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReqDevFeatureInfoCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47667L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    @d
    public static final String f47668M = "ReqDevFeatureInfoCommand";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public ReqDevFeatureInfoCommand() {
        p((byte) -95);
        v().add((byte) -94);
    }

    private final void y(HmDevice hmDevice, String str) {
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
        while (str.length() > 0) {
            boolean z3 = false;
            String substring = str.substring(0, 2);
            F.o(substring, "substring(...)");
            String[] z4 = z(str);
            String valueOf = String.valueOf(z4[1]);
            String valueOf2 = String.valueOf(z4[0]);
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            int hashCode = substring.hashCode();
            if (hashCode != 3063) {
                if (hashCode != 3064) {
                    if (hashCode != 3086) {
                        switch (hashCode) {
                            case 3056:
                                if (!substring.equals(k.f48625V)) {
                                    break;
                                } else {
                                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: version tokenValue = " + valueOf2);
                                    break;
                                }
                            case 3057:
                                if (!substring.equals(k.f48628W)) {
                                    break;
                                } else {
                                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: TWS Volume Sync token value = " + valueOf2);
                                    a7 = C2220b.a(16);
                                    if (Integer.parseInt(valueOf2, a7) == 1) {
                                        z3 = true;
                                    }
                                    partyBoxDevice.H2(z3);
                                    break;
                                }
                            case 3058:
                                if (!substring.equals(k.f48622U)) {
                                    break;
                                } else {
                                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: User EQ = " + valueOf2);
                                    a8 = C2220b.a(16);
                                    if (Integer.parseInt(valueOf2, a8) == 1) {
                                        z3 = true;
                                    }
                                    partyBoxDevice.I2(z3);
                                    break;
                                }
                            case 3059:
                                if (!substring.equals("a4")) {
                                    break;
                                } else {
                                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Device Analytics = " + valueOf2);
                                    a9 = C2220b.a(16);
                                    if (Integer.parseInt(valueOf2, a9) == 1) {
                                        z3 = true;
                                    }
                                    partyBoxDevice.B2(z3);
                                    break;
                                }
                            case 3060:
                                if (!substring.equals("a5")) {
                                    break;
                                } else {
                                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Feedback Tone = " + valueOf2);
                                    a10 = C2220b.a(16);
                                    if (Integer.parseInt(valueOf2, a10) == 1) {
                                        z3 = true;
                                    }
                                    partyBoxDevice.C2(z3);
                                    break;
                                }
                            case 3061:
                                if (!substring.equals("a6")) {
                                    break;
                                } else {
                                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: PartyLight Stage = " + valueOf2);
                                    a11 = C2220b.a(16);
                                    if (Integer.parseInt(valueOf2, a11) == 1) {
                                        z3 = true;
                                    }
                                    partyBoxDevice.F2(z3);
                                    break;
                                }
                            default:
                                switch (hashCode) {
                                    case 3107:
                                        if (!substring.equals("ad")) {
                                            break;
                                        } else {
                                            f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Support Volume Boost = " + valueOf2);
                                            a12 = C2220b.a(16);
                                            if (Integer.parseInt(valueOf2, a12) == 1) {
                                                z3 = true;
                                            }
                                            partyBoxDevice.J2(z3);
                                            break;
                                        }
                                    case 3108:
                                        if (!substring.equals("ae")) {
                                            break;
                                        } else {
                                            f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Support Lock Top Panel = " + valueOf2);
                                            a13 = C2220b.a(16);
                                            if (Integer.parseInt(valueOf2, a13) == 1) {
                                                z3 = true;
                                            }
                                            partyBoxDevice.E2(z3);
                                            break;
                                        }
                                    case 3109:
                                        if (!substring.equals("af")) {
                                            break;
                                        } else {
                                            f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Support Tone Shifter = " + valueOf2);
                                            a14 = C2220b.a(16);
                                            if (Integer.parseInt(valueOf2, a14) == 1) {
                                                z3 = true;
                                            }
                                            partyBoxDevice.G2(z3);
                                            break;
                                        }
                                }
                        }
                    } else if (substring.equals("b0")) {
                        f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Support LeAudio = " + valueOf2);
                        a6 = C2220b.a(16);
                        if (Integer.parseInt(valueOf2, a6) == 1) {
                            z3 = true;
                        }
                        partyBoxDevice.D2(z3);
                    }
                } else if (substring.equals("a9")) {
                    f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Support Auracast SQ Boradcast = " + valueOf2);
                    a5 = C2220b.a(16);
                    if (Integer.parseInt(valueOf2, a5) == 1) {
                        z3 = true;
                    }
                    partyBoxDevice.z2(z3);
                }
            } else if (substring.equals("a8")) {
                f.a(f47668M, "BLE_LOG Device Feature Info Received Command: Cross TWS = " + valueOf2);
                a4 = C2220b.a(16);
                if (Integer.parseInt(valueOf2, a4) == 1) {
                    z3 = true;
                }
                partyBoxDevice.A2(z3);
            }
            str = valueOf;
        }
    }

    private final String[] z(String str) {
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
        } catch (Exception unused) {
        }
        return strArr;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        if (-94 == receivedCommand.k()) {
            A.M0(v());
            String g4 = g.g(receivedCommand.n());
            f.a("BLE_LOG", " ReqDevFeatureInfoCommand  onReceive  called :" + g4);
            if (g4 != null && g4.length() > 0) {
                ((PartyBoxDevice) device).g2(true);
                y(device, g4);
                baseMessage.d(MessageID.DEVICE_FEATURE_INFO);
            }
        }
        return baseMessage;
    }
}
