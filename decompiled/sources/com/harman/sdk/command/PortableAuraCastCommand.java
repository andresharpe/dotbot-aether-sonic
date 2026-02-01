package com.harman.sdk.command;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import java.util.Arrays;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/harman/sdk/command/PortableAuraCastCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", "hashCode", "()I", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "L", "B", "linkMode", "d", "()Z", "isChangeCommand", "<init>", "(B)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PortableAuraCastCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    private byte f47660L;

    public PortableAuraCastCommand(byte b4) {
        this.f47660L = b4;
        p(k.f48702p1);
        v().add(Byte.valueOf(k.f48706q1));
        j(new byte[]{this.f47660L});
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
        if (obj == null || !F.g(PortableAuraCastCommand.class, obj.getClass())) {
            return false;
        }
        PortableAuraCastCommand portableAuraCastCommand = (PortableAuraCastCommand) obj;
        if (g() == portableAuraCastCommand.g() && k() == portableAuraCastCommand.k() && l() == portableAuraCastCommand.l() && Arrays.equals(n(), portableAuraCastCommand.n())) {
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
        byte[] n4;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        if (receivedCommand.k() == 107 && (n4 = receivedCommand.n()) != null && n4.length == 1) {
            v().remove(Byte.valueOf(k.f48706q1));
            DeviceRole.a aVar = DeviceRole.Companion;
            byte[] n5 = receivedCommand.n();
            F.m(n5);
            device.J0(aVar.a(n5[0]));
            AuracastInfo d4 = device.d();
            if (d4 == null) {
                d4 = new AuracastInfo();
            }
            byte b4 = this.f47660L;
            if (b4 == 2) {
                d4.h(AuracastStatus.AURACAST_MODE);
            } else if (b4 == 0) {
                d4.h(AuracastStatus.NORMAL_MODE);
            }
            device.Y(d4);
            baseMessage.d(MessageID.AURACAST_STATUS);
            baseMessage.e(Byte.valueOf(this.f47660L));
        }
        return baseMessage;
    }
}
