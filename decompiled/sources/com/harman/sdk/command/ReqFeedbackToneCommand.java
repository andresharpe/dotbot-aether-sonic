package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/harman/sdk/command/ReqFeedbackToneCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "hashCode", "()I", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "d", "()Z", "isChangeCommand", "<init>", "()V", "L", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ReqFeedbackToneCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    public static final a f47669L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    @d
    private static final String f47670M = "ReqFeedbackToneCommand";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public ReqFeedbackToneCommand() {
        p(k.f48624U1);
        j(null);
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
        if (obj == null || !F.g(ReqFeedbackToneCommand.class, obj.getClass())) {
            return false;
        }
        ReqFeedbackToneCommand reqFeedbackToneCommand = (ReqFeedbackToneCommand) obj;
        if (g() == reqFeedbackToneCommand.g() && k() == reqFeedbackToneCommand.k() && l() == reqFeedbackToneCommand.l()) {
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
        byte[] n4;
        boolean z3;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        f.a(f47670M, "onReceive RET_FEEDBACK_TONE called, receivedCommand = " + receivedCommand);
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        if (-14 == receivedCommand.k() && (n4 = receivedCommand.n()) != null) {
            if (n4.length == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                f.a(f47670M, "onReceive RET_FEEDBACK_TONE called, feedbackToneStatus = " + ((int) n4[0]));
                device.s0(n4[0]);
                baseMessage.e(device);
                baseMessage.d(MessageID.FEEDBACK_TONE_STATUS);
            }
        }
        return baseMessage;
    }
}
