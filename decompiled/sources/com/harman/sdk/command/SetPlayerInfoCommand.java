package com.harman.sdk.command;

import androidx.core.app.C0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.MuteStatus;
import com.harman.sdk.utils.PlayerStatus;
import java.util.Arrays;
import java.util.Objects;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;
import l3.e;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/harman/sdk/command/SetPlayerInfoCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "()Z", "isChangeCommand", "", C0.f11537F0, "<init>", "([B)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetPlayerInfoCommand extends BaseCommand {
    public SetPlayerInfoCommand(@d byte[] status) {
        F.p(status, "status");
        p((byte) 67);
        v().add((byte) 0);
        j(status);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand
    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(SetPlayerInfoCommand.class, obj.getClass())) {
            return false;
        }
        SetPlayerInfoCommand setPlayerInfoCommand = (SetPlayerInfoCommand) obj;
        if (g() == setPlayerInfoCommand.g() && k() == setPlayerInfoCommand.k() && l() == setPlayerInfoCommand.l() && Arrays.equals(n(), setPlayerInfoCommand.n())) {
            return true;
        }
        return false;
    }

    @Override // com.harman.sdk.command.BaseCommand
    public int hashCode() {
        return Objects.hash(Byte.valueOf(g()), Byte.valueOf(k()), Integer.valueOf(l()), n());
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        MusicControlSettings e12;
        int a4;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        byte[] n4 = receivedCommand.n();
        BaseMessage baseMessage = new BaseMessage();
        if (receivedCommand.k() == 0 && n4 != null && n4.length > 1 && 67 == n4[0] && n4[1] == 0) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) device;
            A.M0(v());
            byte[] n5 = n();
            if (n5 != null && (e12 = partyBoxDevice.e1()) != null) {
                byte b4 = n5[1];
                a4 = C2220b.a(16);
                String num = Integer.toString(b4, a4);
                F.o(num, "toString(...)");
                switch (num.hashCode()) {
                    case 1661:
                        if (num.equals("41")) {
                            e12.m(PlayerStatus.Companion.a(n5[3]));
                            break;
                        }
                        break;
                    case 1662:
                        if (num.equals("42")) {
                            e12.n(n5[3]);
                            break;
                        }
                        break;
                    case 1663:
                        if (num.equals("43")) {
                            e12.j(MuteStatus.Companion.a(n5[3]));
                            break;
                        }
                        break;
                }
            }
            baseMessage.d(MessageID.PLAYER_INFO);
            baseMessage.e(device);
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }
}
