package com.harman.sdk.command;

import com.google.firebase.messaging.C1821f;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\t\b\u0012¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/harman/sdk/command/SetLightCmdCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "", C1821f.C0339f.a.f37006R, "Lkotlin/H0;", "y", "(Lcom/harman/sdk/device/HmDevice;[B)V", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "value", "t", "()J", "o", "(J)V", "commandTimeOut", "<init>", "()V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetLightCmdCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47695L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    @d
    private static final String f47696M = "SetLightCmdCommand";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private SetLightCmdCommand() {
    }

    private final void y(HmDevice hmDevice, byte[] bArr) {
        super.p((byte) 51);
        super.v().add((byte) 0);
        super.j(bArr);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void o(long j4) {
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
            A.M0(super.v());
            baseMessage.d(MessageID.RET_SET_LIGHT_RESULT);
            if (n4[1] == 0) {
                z3 = true;
            }
            baseMessage.e(device);
        }
        byte[] n5 = n();
        if (z3) {
            str = "suc";
        } else {
            str = L1.a.f1625n3;
        }
        f.d(f47696M, "onReceive() >>> update light info[" + n5 + "] " + str);
        return baseMessage;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public long t() {
        return 200L;
    }

    public SetLightCmdCommand(@d HmDevice device, @d byte[] data) {
        F.p(device, "device");
        F.p(data, "data");
        y(device, data);
    }
}
