package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.b;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import java.util.Objects;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/harman/sdk/command/ReqPhoneMacAddressCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "hashCode", "()I", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "d", "()Z", "isChangeCommand", "<init>", "()V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReqPhoneMacAddressCommand extends BaseCommand {
    public ReqPhoneMacAddressCommand() {
        p(k.f48597L1);
        j(b.h());
        v().add((byte) -126);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand
    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(ReqPhoneMacAddressCommand.class, obj.getClass())) {
            return false;
        }
        ReqPhoneMacAddressCommand reqPhoneMacAddressCommand = (ReqPhoneMacAddressCommand) obj;
        if (g() == reqPhoneMacAddressCommand.g() && k() == reqPhoneMacAddressCommand.k() && l() == reqPhoneMacAddressCommand.l()) {
            return true;
        }
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand
    public int hashCode() {
        return Objects.hash(Byte.valueOf(g()), Byte.valueOf(k()), Integer.valueOf(l()));
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        boolean z3;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        if (-126 == receivedCommand.k()) {
            f.a("BLE_LOG", " ReqPhoneMacAddressCommand  onReceive RET_PHONE_MAC_ADDRESS called");
            byte[] n4 = receivedCommand.n();
            if (n4 != null) {
                if (n4.length == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    A.M0(v());
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) device;
                    String g4 = g.g(n4);
                    F.m(g4);
                    partyBoxDevice.t2(g4);
                    f.a("BLE_LOG", " phoneMacAddress is : " + partyBoxDevice.j1());
                    baseMessage.e(device);
                    baseMessage.d(MessageID.PHONE_MAC_ADDRESS_STATUS);
                }
            }
        }
        return baseMessage;
    }
}
