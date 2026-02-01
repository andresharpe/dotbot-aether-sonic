package com.harman.sdk.command;

import com.google.firebase.messaging.C1821f;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.WirelessMicInfo;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import kotlin.E;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;

@E(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/harman/sdk/command/ReqMicConnectionInfoCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", C1821f.C0339f.a.f37006R, "", "y", "([B)Ljava/lang/String;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "L", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "TAG", "<init>", "()V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ReqMicConnectionInfoCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    private final String f47671L = "ReqMicConnectionInfoCommand";

    public ReqMicConnectionInfoCommand() {
        p((byte) -63);
        j(null);
        f.a("ReqMicConnectionInfoCommand", "payload: " + g.g(n()));
        v().add((byte) -62);
    }

    private final String y(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b4 : bArr) {
            stringBuffer.append(".");
            stringBuffer.append(Byte.valueOf(b4));
        }
        String substring = stringBuffer.substring(1);
        F.o(substring, "substring(...)");
        return substring;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        boolean z3;
        byte[] f12;
        byte[] f13;
        byte[] f14;
        int i4;
        int a4;
        int a5;
        boolean z4;
        int a6;
        int a7;
        boolean z5;
        boolean z6;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        if (-62 == receivedCommand.k()) {
            byte[] n4 = receivedCommand.n();
            f.a(this.f47671L, "0xc2 payload: " + g.g(n4));
            if (n4 != null) {
                if (n4.length == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    v().clear();
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) device;
                    partyBoxDevice.n2(n4[0]);
                    partyBoxDevice.P2(null);
                    baseMessage.d(MessageID.RET_MIC_CONNECTION_INFO);
                }
            }
            return baseMessage;
        }
        if (-61 == receivedCommand.k()) {
            byte[] n5 = receivedCommand.n();
            f.a(this.f47671L, "0xc3 payload: " + g.g(n5));
            if (n5 != null) {
                if (n5.length == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    v().clear();
                    PartyBoxDevice partyBoxDevice2 = (PartyBoxDevice) device;
                    WirelessMicInfo v12 = partyBoxDevice2.v1();
                    if (v12 == null) {
                        v12 = new WirelessMicInfo();
                    }
                    partyBoxDevice2.P2(v12);
                    v12.a();
                    int i5 = 1;
                    while (i5 < n5.length) {
                        byte b4 = n5[i5];
                        if (b4 == 81) {
                            if (i5 + 4 < n5.length && n5[i5 + 1] == 3) {
                                int i6 = i5 + 2;
                                i5 += 5;
                                f12 = C2100o.f1(n5, i6, i5);
                                v12.s(y(f12));
                                f.a(this.f47671L, "0xc3 mic1Version: " + v12.f());
                            }
                            i5++;
                        } else if (b4 == 82) {
                            if (i5 + 4 < n5.length && n5[i5 + 1] == 3) {
                                int i7 = i5 + 2;
                                i5 += 5;
                                f13 = C2100o.f1(n5, i7, i5);
                                v12.x(y(f13));
                                f.a(this.f47671L, "0xc3 mic2Version: " + v12.k());
                            }
                            i5++;
                        } else if (b4 == 83) {
                            if (i5 + 4 < n5.length && n5[i5 + 1] == 3) {
                                int i8 = i5 + 2;
                                i5 += 5;
                                f14 = C2100o.f1(n5, i8, i5);
                                v12.o(y(f14));
                                f.a(this.f47671L, "0xc3 dongleVersion: " + v12.b());
                            }
                            i5++;
                        } else if (b4 == 84) {
                            int i9 = i5 + 2;
                            if (i9 < n5.length && n5[i5 + 1] == 1) {
                                BatteryInfo g4 = v12.g();
                                if (g4 == null) {
                                    g4 = new BatteryInfo();
                                }
                                byte b5 = n5[i9];
                                if (b5 == 240) {
                                    g4.e(true);
                                } else {
                                    String b6 = g.b(new byte[]{b5});
                                    F.o(b6, "bytes2BinStr(...)");
                                    String substring = b6.substring(1, 8);
                                    F.o(substring, "substring(...)");
                                    a6 = C2220b.a(2);
                                    g4.h(Integer.parseInt(substring, a6));
                                    String substring2 = b6.substring(0, 1);
                                    F.o(substring2, "substring(...)");
                                    a7 = C2220b.a(2);
                                    if (1 == Integer.parseInt(substring2, a7)) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    g4.g(z5);
                                }
                                v12.t(g4);
                                f.a(this.f47671L, "0xc3 mic1batteryInfo: " + v12.g());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 85) {
                            int i10 = i5 + 2;
                            if (i10 < n5.length && n5[i5 + 1] == 1) {
                                BatteryInfo l4 = v12.l();
                                if (l4 == null) {
                                    l4 = new BatteryInfo();
                                }
                                byte b7 = n5[i10];
                                if (b7 == 240) {
                                    l4.e(true);
                                } else {
                                    String b8 = g.b(new byte[]{b7});
                                    F.o(b8, "bytes2BinStr(...)");
                                    String substring3 = b8.substring(1, 8);
                                    F.o(substring3, "substring(...)");
                                    a4 = C2220b.a(2);
                                    l4.h(Integer.parseInt(substring3, a4));
                                    String substring4 = b8.substring(0, 1);
                                    F.o(substring4, "substring(...)");
                                    a5 = C2220b.a(2);
                                    if (1 == Integer.parseInt(substring4, a5)) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    l4.g(z4);
                                }
                                v12.y(l4);
                                f.a(this.f47671L, "0xc3 mic2batteryInfo: " + v12.l());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 86) {
                            int i11 = i5 + 2;
                            if (i11 < n5.length && n5[i5 + 1] == 1) {
                                v12.z(n5[i11]);
                                f.a(this.f47671L, "0xc3 micConnectStatus: " + v12.m());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 87) {
                            int i12 = i5 + 2;
                            if (i12 < n5.length && n5[i5 + 1] == 1) {
                                v12.r(n5[i12]);
                                f.a(this.f47671L, "0xc3 mic1GenVersion: " + v12.e());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 88) {
                            int i13 = i5 + 2;
                            if (i13 < n5.length && n5[i5 + 1] == 1) {
                                v12.w(n5[i13]);
                                f.a(this.f47671L, "0xc3 mic2GenVersion: " + v12.j());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 89) {
                            int i14 = i5 + 2;
                            if (i14 < n5.length && n5[i5 + 1] == 1) {
                                v12.p(n5[i14]);
                                f.a(this.f47671L, "0xc3 mic1CanOTA: " + v12.c());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 96) {
                            int i15 = i5 + 2;
                            if (i15 < n5.length && n5[i5 + 1] == 1) {
                                v12.u(n5[i15]);
                                f.a(this.f47671L, "0xc3 mic2CanOTA: " + v12.h());
                                i5 += 3;
                            }
                            i5++;
                        } else if (b4 == 97) {
                            int i16 = i5 + 2;
                            if (i16 < n5.length && n5[i5 + 1] == 1) {
                                v12.q(n5[i16]);
                                f.a(this.f47671L, "0xc3 mic1ColorId: " + v12.d());
                                i5 += 3;
                            }
                            i5++;
                        } else {
                            if (b4 == 98 && (i4 = i5 + 2) < n5.length && n5[i5 + 1] == 1) {
                                v12.v(n5[i4]);
                                f.a(this.f47671L, "0xc3 mic2ColorId: " + v12.i());
                                i5 += 3;
                            }
                            i5++;
                        }
                    }
                    f.a(this.f47671L, "0xc3 wirelessMicInfo: " + v12);
                    baseMessage.d(MessageID.RET_MIC_CONNECTION_INFO);
                }
            }
        }
        return baseMessage;
    }

    @d
    public final String z() {
        return this.f47671L;
    }
}
