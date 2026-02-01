package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/harman/sdk/command/MicOTACommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "start", "<init>", "(Z)V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class MicOTACommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47651L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    @d
    private static final String f47652M = "MicOTACommand";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public MicOTACommand(boolean z3) {
        p(k.f48651c2);
        v().add((byte) 0);
        j(new byte[]{z3 ? (byte) 1 : (byte) 0});
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        if (receivedCommand.k() == 0) {
            byte[] n4 = receivedCommand.n();
            f.a(f47652M, "MicOTACommand ,payload: " + g.g(n4));
            if (n4 != null && n4.length > 1 && -60 == n4[0] && n4[1] == 0) {
                A.M0(v());
                baseMessage.d(MessageID.RET_OPTION_MIC_OTA_RESULT);
                baseMessage.e(device);
            } else {
                baseMessage.d(MessageID.UNKNOWN);
            }
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }
}
