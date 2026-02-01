package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/harman/sdk/command/ReqDevInfoCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "d", "()Z", "isChangeCommand", "<init>", "()V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReqDevInfoCommand extends BaseCommand {
    public ReqDevInfoCommand() {
        p((byte) 17);
        v().add((byte) 18);
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
        f.a("ReqDevInfoCommand", "BLE_LOG ,onReceive : " + receivedCommand);
        BaseMessage baseMessage = new BaseMessage();
        byte[] n4 = receivedCommand.n();
        if (n4 != null) {
            if (n4.length > 2 && 18 == receivedCommand.k()) {
                u().f(device, receivedCommand, this);
                v().clear();
                baseMessage.e(Integer.valueOf(device.m()));
                baseMessage.d(MessageID.DEVICE_INFO);
                f.a("ReqDevInfoCommand", "BLE_LOG ,setMessageId : DEVICE_INFO");
            } else {
                baseMessage.d(MessageID.UNKNOWN);
            }
        }
        return baseMessage;
    }
}
