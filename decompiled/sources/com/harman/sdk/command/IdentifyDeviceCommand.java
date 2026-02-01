package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.EnumIdentifyDevice;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/harman/sdk/command/IdentifyDeviceCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lkotlin/H0;", "z", "(Lcom/harman/sdk/device/HmDevice;)V", "", "y", "()[B", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "Lcom/harman/sdk/utils/EnumIdentifyDevice;", "L", "Lcom/harman/sdk/utils/EnumIdentifyDevice;", "mainIdentify", "M", "coIdentify", "", "d", "()Z", "isChangeCommand", "<init>", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/utils/EnumIdentifyDevice;Lcom/harman/sdk/utils/EnumIdentifyDevice;)V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class IdentifyDeviceCommand extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47642N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @d
    private static final String f47643O = "Party.IdentifyDeviceCommand";

    /* renamed from: L, reason: collision with root package name */
    @e
    private final EnumIdentifyDevice f47644L;

    /* renamed from: M, reason: collision with root package name */
    @e
    private final EnumIdentifyDevice f47645M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public IdentifyDeviceCommand(@d HmDevice device, @e EnumIdentifyDevice enumIdentifyDevice, @e EnumIdentifyDevice enumIdentifyDevice2) {
        F.p(device, "device");
        this.f47644L = enumIdentifyDevice;
        this.f47645M = enumIdentifyDevice2;
        z(device);
    }

    private final byte[] y() {
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        boolean z4;
        EnumIdentifyDevice enumIdentifyDevice = this.f47644L;
        if (enumIdentifyDevice != null) {
            bArr = new byte[]{0, (byte) enumIdentifyDevice.g()};
        } else {
            bArr = new byte[0];
        }
        EnumIdentifyDevice enumIdentifyDevice2 = this.f47645M;
        if (enumIdentifyDevice2 != null) {
            bArr2 = new byte[]{1, (byte) enumIdentifyDevice2.g()};
        } else {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        if (bArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        if (bArr2.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (true ^ z4) {
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        }
        return bArr3;
    }

    private final void z(HmDevice hmDevice) {
        String str;
        super.p(k.f48704q);
        super.v().add((byte) 0);
        super.j(y());
        String n4 = hmDevice.n();
        EnumIdentifyDevice enumIdentifyDevice = this.f47644L;
        String str2 = null;
        if (enumIdentifyDevice != null) {
            str = enumIdentifyDevice.e();
        } else {
            str = null;
        }
        EnumIdentifyDevice enumIdentifyDevice2 = this.f47645M;
        if (enumIdentifyDevice2 != null) {
            str2 = enumIdentifyDevice2.e();
        }
        f.d(f47643O, "init() >>> MAC[" + n4 + "] mainIdentify[" + str + "] coIdentify[" + str2 + "] payload[" + g.g(n()) + "]");
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
        baseMessage.d(MessageID.UNKNOWN);
        boolean z3 = false;
        if (receivedCommand.k() == 0 && (n4 = receivedCommand.n()) != null && n4.length > 1 && -12 == n4[0]) {
            baseMessage.d(MessageID.IDENTIFY_DEVICE);
            if (n4[1] == 0) {
                z3 = true;
            }
            super.v().clear();
            baseMessage.e(device);
        }
        f.d(f47643O, "onReceive() >>> success[" + z3 + "]");
        return baseMessage;
    }
}
