package com.harman.sdk.command;

import com.harman.log.b;
import com.harman.log.f;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import kotlin.E;
import l3.d;
import l3.e;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/harman/sdk/command/ReqAdvancedEQCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", b.f47574c, "()[B", "", "L", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "TAG", "<init>", "()V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ReqAdvancedEQCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    private final String f47665L = "ReqAdvancedEQCommand";

    public ReqAdvancedEQCommand() {
        p(k.f48615R1);
        j(new byte[0]);
        f.a("ReqAdvancedEQCommand", "payload: " + g.g(n()));
        v().add(Byte.valueOf(k.f48618S1));
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @e
    public byte[] b() {
        byte[] bArr = {g(), k(), (byte) ((l() >> 8) & 255), (byte) l()};
        byte[] n4 = n();
        if (n4 != null) {
            byte[] bArr2 = new byte[n4.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            System.arraycopy(n4, 0, bArr2, 4, n4.length);
            return bArr2;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x021e A[LOOP:1: B:42:0x0213->B:44:0x021e, LOOP_END] */
    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.harman.sdk.message.BaseMessage q(@l3.d com.harman.sdk.device.HmDevice r17, @l3.d com.harman.sdk.a r18) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.command.ReqAdvancedEQCommand.q(com.harman.sdk.device.HmDevice, com.harman.sdk.a):com.harman.sdk.message.BaseMessage");
    }

    @d
    public final String y() {
        return this.f47665L;
    }
}
