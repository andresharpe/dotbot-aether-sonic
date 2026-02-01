package com.harman.sdk.command;

import androidx.core.app.C0;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;
import l3.e;

@E(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\t\b\u0012¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/harman/sdk/command/AuracastCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/utils/AuracastStatus;", C0.f11537F0, "Lkotlin/H0;", "y", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/utils/AuracastStatus;)V", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "L", "Lcom/harman/sdk/utils/AuracastStatus;", "<init>", "()V", "M", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuracastCommand extends BaseCommand {

    /* renamed from: M, reason: collision with root package name */
    @d
    public static final a f47616M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    @d
    private static final String f47617N = "Auracast.Command";

    /* renamed from: L, reason: collision with root package name */
    @e
    private AuracastStatus f47618L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private AuracastCommand() {
    }

    private final void y(HmDevice hmDevice, AuracastStatus auracastStatus) {
        int a4;
        super.p((byte) 19);
        super.v().add((byte) 0);
        a4 = C2220b.a(16);
        super.j(new byte[]{0, (byte) Integer.parseInt(k.f48586I, a4), 1, (byte) auracastStatus.j()});
        this.f47618L = auracastStatus;
        f.d(f47617N, "init() >>> MAC[" + hmDevice.n() + "] payload[" + g.g(n()) + "]");
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        String str;
        byte[] n4;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        boolean z3 = false;
        if (receivedCommand.k() == 0 && (n4 = receivedCommand.n()) != null && n4.length > 1 && 19 == n4[0]) {
            baseMessage.d(MessageID.AURACAST_STATUS);
            if (n4[1] == 0) {
                z3 = true;
            }
            A.M0(super.v());
            AuracastStatus auracastStatus = this.f47618L;
            if (auracastStatus != null) {
                AuracastInfo d4 = device.d();
                if (d4 == null) {
                    d4 = new AuracastInfo();
                }
                d4.h(auracastStatus);
                device.Y(d4);
            }
            baseMessage.e(device);
        }
        AuracastStatus auracastStatus2 = this.f47618L;
        if (z3) {
            str = "Suc";
        } else {
            str = "Fail";
        }
        f.d(f47617N, "onReceive() >>> update status[" + auracastStatus2 + "] " + str + " for Device.MAC[" + device.n() + "] BLE[" + device.g() + "]");
        return baseMessage;
    }

    public AuracastCommand(@d HmDevice device, @d AuracastStatus status) {
        F.p(device, "device");
        F.p(status, "status");
        y(device, status);
    }
}
