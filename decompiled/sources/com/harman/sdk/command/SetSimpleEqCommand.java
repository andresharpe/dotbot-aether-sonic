package com.harman.sdk.command;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.SimpleEQSettings;
import com.harman.sdk.utils.MessageID;
import java.util.Iterator;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;

@E(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/harman/sdk/command/SetSimpleEqCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "Lcom/harman/sdk/message/SimpleEQSettings;", "L", "Lcom/harman/sdk/message/SimpleEQSettings;", "y", "()Lcom/harman/sdk/message/SimpleEQSettings;", "z", "(Lcom/harman/sdk/message/SimpleEQSettings;)V", "eq", "", "d", "()Z", "isChangeCommand", "", "deviceIdToken", "<init>", "(Lcom/harman/sdk/message/SimpleEQSettings;B)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSetSimpleEqCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetSimpleEqCommand.kt\ncom/harman/sdk/command/SetSimpleEqCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1855#2,2:71\n*S KotlinDebug\n*F\n+ 1 SetSimpleEqCommand.kt\ncom/harman/sdk/command/SetSimpleEqCommand\n*L\n63#1:71,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SetSimpleEqCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    private SimpleEQSettings f47698L;

    public SetSimpleEqCommand(@d SimpleEQSettings eq, byte b4) {
        F.p(eq, "eq");
        this.f47698L = eq;
        p((byte) -109);
        int i4 = 3;
        byte[] bArr = new byte[this.f47698L.b().size() + 3];
        bArr[0] = b4;
        bArr[1] = this.f47698L.a();
        bArr[2] = this.f47698L.d();
        Iterator<T> it = this.f47698L.b().iterator();
        while (it.hasNext()) {
            bArr[i4] = ((SimpleEQSettings.Parameter) it.next()).b();
            i4++;
        }
        j(bArr);
        v().add((byte) 0);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        byte[] n4 = receivedCommand.n();
        BaseMessage baseMessage = new BaseMessage();
        if (n4 != null && n4.length > 1 && -109 == n4[0] && n4[1] == 0 && receivedCommand.k() == 0) {
            v().clear();
            baseMessage.e(device.K());
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }

    @d
    public final SimpleEQSettings y() {
        return this.f47698L;
    }

    public final void z(@d SimpleEQSettings simpleEQSettings) {
        F.p(simpleEQSettings, "<set-?>");
        this.f47698L = simpleEQSettings;
    }
}
