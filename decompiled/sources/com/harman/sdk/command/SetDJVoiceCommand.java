package com.harman.sdk.command;

import androidx.core.app.C0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/harman/sdk/command/SetDJVoiceCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", C0.f11537F0, "<init>", "([B)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetDJVoiceCommand extends BaseCommand {
    public SetDJVoiceCommand(@d byte[] status) {
        F.p(status, "status");
        p((byte) 86);
        j(status);
        v().add((byte) 0);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        byte[] n4 = receivedCommand.n();
        if (n4 != null && n4.length > 1 && 86 == n4[0] && receivedCommand.k() == 0) {
            v().clear();
            baseMessage.d(MessageID.RET_EFFECT_LAB);
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }
}
