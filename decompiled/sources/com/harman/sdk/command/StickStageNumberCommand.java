package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\t\b\u0012¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/harman/sdk/command/StickStageNumberCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "", "num", "Lkotlin/H0;", "y", "(Lcom/harman/sdk/device/HmDevice;I)V", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "toString", "()Ljava/lang/String;", "", "z", "()Z", "L", "Z", "result", "<init>", "()V", "M", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StickStageNumberCommand extends BaseCommand {

    /* renamed from: M, reason: collision with root package name */
    @d
    public static final a f47713M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    @d
    private static final String f47714N = "StickStageNumber.Command";

    /* renamed from: L, reason: collision with root package name */
    private boolean f47715L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private StickStageNumberCommand() {
    }

    private final void y(HmDevice hmDevice, int i4) {
        super.p((byte) 51);
        super.v().add((byte) 0);
        super.j(new byte[]{(byte) hmDevice.m(), 72, 1, (byte) i4});
        f.d(f47714N, "init() >>> MAC[" + hmDevice.n() + "] payload[" + g.g(n()) + "]");
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
        if (receivedCommand.k() == 0 && (n4 = receivedCommand.n()) != null && n4.length > 1 && 51 == n4[0]) {
            baseMessage.d(MessageID.SET_STAGE_NUM_ACK);
            if (n4[1] == 0) {
                z3 = true;
            }
            A.M0(super.v());
            this.f47715L = z3;
            baseMessage.e(this);
        }
        if (z3) {
            str = "Suc";
        } else {
            str = "Fail";
        }
        f.d(f47714N, "onReceive() >>> send stage number to partybox " + str + " for Device.MAC[" + device.n() + "] BLE[" + device.g() + "]");
        return baseMessage;
    }

    @Override // com.harman.sdk.command.BaseCommand
    @d
    public String toString() {
        String str;
        if (this.f47715L) {
            str = "Suc";
        } else {
            str = "Fail";
        }
        return "StickStageNumberCommand{result=send stage number to partybox " + str + "}";
    }

    public final boolean z() {
        return this.f47715L;
    }

    public StickStageNumberCommand(@d HmDevice device, int i4) {
        F.p(device, "device");
        y(device, i4);
    }
}
