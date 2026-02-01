package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.E;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C;
import kotlin.text.C2220b;
import kotlin.text.C2222d;
import kotlin.text.z;
import l3.d;
import l3.e;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001/B\t\b\u0012¢\u0006\u0004\b,\u0010-B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b,\u0010\rJ9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0010*\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/harman/sdk/command/StereoFlowCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/utils/AudioChannel;", "audioChn", "Lcom/harman/sdk/utils/PartyConnectStatus;", "connectStatus", "", "groupID", "groupName", "Lkotlin/H0;", "B", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/utils/AudioChannel;Lcom/harman/sdk/utils/PartyConnectStatus;Ljava/lang/String;Ljava/lang/String;)V", "", "lmt", "", "z", "(Ljava/lang/String;I)[B", "src", "cmd", "bytes", "y", "([BLjava/lang/String;[B)[B", androidx.exifinterface.media.a.Y4, "(Ljava/lang/String;)[B", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "L", "Lcom/harman/sdk/utils/AudioChannel;", "M", "Lcom/harman/sdk/utils/PartyConnectStatus;", "N", "[B", "byteArrayGroupID", "O", "byteArrayGroupName", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "P", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStereoFlowCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoFlowCommand.kt\ncom/harman/sdk/command/StereoFlowCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1#2:169\n1549#3:170\n1620#3,3:171\n*S KotlinDebug\n*F\n+ 1 StereoFlowCommand.kt\ncom/harman/sdk/command/StereoFlowCommand\n*L\n117#1:170\n117#1:171,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoFlowCommand extends BaseCommand {

    /* renamed from: P, reason: collision with root package name */
    @d
    public static final a f47706P = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    public static final int f47707Q = 8;

    /* renamed from: R, reason: collision with root package name */
    @d
    private static final String f47708R = "Party.Stereo.FlowCommand";

    /* renamed from: L, reason: collision with root package name */
    @e
    private AudioChannel f47709L;

    /* renamed from: M, reason: collision with root package name */
    @e
    private PartyConnectStatus f47710M;

    /* renamed from: N, reason: collision with root package name */
    @e
    private byte[] f47711N;

    /* renamed from: O, reason: collision with root package name */
    @e
    private byte[] f47712O;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private StereoFlowCommand() {
    }

    private final byte[] A(String str) {
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

    private final void B(HmDevice hmDevice, AudioChannel audioChannel, PartyConnectStatus partyConnectStatus, String str, String str2) {
        byte[] z3;
        byte[] bArr;
        super.p((byte) 19);
        super.v().add((byte) 0);
        this.f47709L = audioChannel;
        this.f47710M = partyConnectStatus;
        byte[] bArr2 = {0};
        try {
            z3 = A(str);
        } catch (Exception unused) {
            f.b(f47708R, "init() >>> illegal hex groupID[" + str + "], will encode to ASCII code");
            z3 = z(str, 8);
        }
        f.a(f47708R, "init() >>> ori[" + str + "] hex[" + g.g(z3) + "]");
        byte[] y3 = y(y(bArr2, k.f48583H, z3), k.f48577F, new byte[]{(byte) partyConnectStatus.j()});
        if (str.length() > 0 || partyConnectStatus != PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTING) {
            y3 = y(y3, k.f48565B, new byte[]{(byte) audioChannel.i()});
        }
        if (str2 != null) {
            bArr = z(str2, 16);
        } else {
            bArr = null;
        }
        f.a(f47708R, "init() >>> ori[" + str2 + "] hex[" + g.g(bArr) + "]");
        byte[] y4 = y(y3, k.f48580G, bArr);
        super.j(y4);
        f.d(f47708R, "init() >>> STEREO_FLOW sent to MAC[" + hmDevice.n() + "] BLE[" + hmDevice.g() + "] payload[" + g.g(y4) + "]");
    }

    private final byte[] y(byte[] bArr, String str, byte[] bArr2) {
        boolean S12;
        int a4;
        S12 = z.S1(str);
        if (!S12 && bArr2 != null && bArr2.length != 0) {
            byte[] bArr3 = new byte[bArr.length + 2 + bArr2.length];
            int length = bArr.length;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            try {
                a4 = C2220b.a(16);
                bArr3[length] = (byte) Integer.parseInt(str, a4);
                bArr3[length + 1] = (byte) bArr2.length;
                System.arraycopy(bArr2, 0, bArr3, length + 2, bArr2.length);
                return bArr3;
            } catch (Exception unused) {
                f.b(f47708R, "append() >>> illegal Hex cmd[" + str + "] while hexing");
            }
        }
        return bArr;
    }

    private final byte[] z(String str, int i4) {
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

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        PartyBoxDevice partyBoxDevice;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        byte[] n4 = receivedCommand.n();
        boolean z3 = false;
        if (receivedCommand.k() == 0 && n4 != null && n4.length > 1 && 19 == n4[0]) {
            super.v().clear();
            if (n4[1] == 0) {
                z3 = true;
            }
            baseMessage.d(MessageID.STEREO_FLOW);
            AudioChannel audioChannel = this.f47709L;
            if (audioChannel != null) {
                device.e0(audioChannel);
                f.d(f47708R, "onReceive() >>> set chn[" + audioChannel.f() + "]");
            }
            PartyConnectStatus partyConnectStatus = this.f47710M;
            if (partyConnectStatus != null) {
                if (device instanceof PartyBoxDevice) {
                    partyBoxDevice = (PartyBoxDevice) device;
                } else {
                    partyBoxDevice = null;
                }
                if (partyBoxDevice != null) {
                    partyBoxDevice.s2(partyConnectStatus);
                }
                f.d(f47708R, "onReceive() >>> set connect mode[" + partyConnectStatus.f() + "]");
            }
            byte[] bArr = this.f47711N;
            if (bArr != null) {
                TWSInfo M3 = device.M();
                if (M3 == null) {
                    M3 = new TWSInfo();
                }
                M3.c(new String(bArr, C2222d.f52792b));
                f.d(f47708R, "onReceive() >>> set group.id[" + M3.a() + "]");
                device.M0(M3);
            }
            byte[] bArr2 = this.f47712O;
            if (bArr2 != null) {
                TWSInfo M4 = device.M();
                if (M4 == null) {
                    M4 = new TWSInfo();
                }
                M4.d(new String(bArr2, C2222d.f52792b));
                f.d(f47708R, "onReceive() >>> set group.name[" + M4.b() + "]");
                device.M0(M4);
            }
            baseMessage.e(device);
        }
        f.d(f47708R, "onReceive() >>> STEREO_FLOW recvd[" + z3 + "]. MAC[" + device.n() + "] BLE[" + device.g() + "] payload[" + g.g(n4) + "]");
        return baseMessage;
    }

    public StereoFlowCommand(@d HmDevice device, @d AudioChannel audioChn, @d PartyConnectStatus connectStatus, @d String groupID, @e String str) {
        F.p(device, "device");
        F.p(audioChn, "audioChn");
        F.p(connectStatus, "connectStatus");
        F.p(groupID, "groupID");
        B(device, audioChn, connectStatus, groupID, str);
    }
}
