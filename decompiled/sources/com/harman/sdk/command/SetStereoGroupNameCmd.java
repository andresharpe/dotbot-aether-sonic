package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import kotlin.text.C2222d;
import l3.d;
import l3.e;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\t\b\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/harman/sdk/command/SetStereoGroupNameCmd;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "", "groupName", "Lkotlin/H0;", "y", "(Lcom/harman/sdk/device/HmDevice;Ljava/lang/String;)V", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "L", "[B", "bytesGroupName", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "M", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetStereoGroupNameCmd extends BaseCommand {

    /* renamed from: M, reason: collision with root package name */
    @d
    public static final a f47699M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    @d
    private static final String f47700N = "Stereo.GroupNameCmd";

    /* renamed from: O, reason: collision with root package name */
    public static final int f47701O = 16;

    /* renamed from: L, reason: collision with root package name */
    @e
    private byte[] f47702L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private SetStereoGroupNameCmd() {
    }

    private final void y(HmDevice hmDevice, String str) {
        int a4;
        boolean z3;
        super.p((byte) 19);
        super.v().add((byte) 0);
        if (str == null) {
            str = "";
        }
        if (str.length() > 16) {
            str = str.substring(0, 16);
            F.o(str, "substring(...)");
        }
        byte[] bytes = str.getBytes(C2222d.f52792b);
        F.o(bytes, "getBytes(...)");
        this.f47702L = bytes;
        a4 = C2220b.a(16);
        byte[] bArr = {0, (byte) Integer.parseInt(k.f48580G, a4), (byte) bytes.length};
        byte[] bArr2 = new byte[bytes.length + 3];
        System.arraycopy(bArr, 0, bArr2, 0, 3);
        if (bytes.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (true ^ z3) {
            System.arraycopy(bytes, 0, bArr2, 3, bytes.length);
        }
        super.j(bArr2);
        f.d(f47700N, "init() >>> TWS_STEREO_GROUP_NAME sent to MAC[" + hmDevice.n() + "] BLE[" + hmDevice.g() + "]");
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        byte[] n4;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        boolean z3 = false;
        if (receivedCommand.k() == 0 && (n4 = receivedCommand.n()) != null && n4.length > 1 && 19 == n4[0]) {
            baseMessage.d(MessageID.STEREO_GROUP_NAME);
            if (n4[1] == 0) {
                z3 = true;
            }
            super.v().clear();
            byte[] bArr = this.f47702L;
            if (bArr != null) {
                TWSInfo M3 = device.M();
                if (M3 == null) {
                    M3 = new TWSInfo();
                }
                M3.d(new String(bArr, C2222d.f52792b));
                device.M0(M3);
            }
            baseMessage.e(device);
        }
        f.d(f47700N, "onReceive() >>> TWS_STEREO_GROUP_NAME recvd[" + z3 + "]. MAC[" + device.n() + "] BLE[" + device.g() + "]");
        return baseMessage;
    }

    public SetStereoGroupNameCmd(@d HmDevice device, @e String str) {
        F.p(device, "device");
        y(device, str);
    }
}
