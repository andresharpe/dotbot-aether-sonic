package com.harman.sdk.command;

import com.harman.log.b;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/harman/sdk/command/BaseCommandForLongBytes;", "Lcom/harman/sdk/command/BaseCommand;", "", b.f47574c, "()[B", "", "L", "I", "payloadStartIndex", "buffer", "<init>", "([B)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBaseCommandForLongBytes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandForLongBytes.kt\ncom/harman/sdk/command/BaseCommandForLongBytes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/* loaded from: classes2.dex */
public class BaseCommandForLongBytes extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    private int f47626L;

    public BaseCommandForLongBytes(@d byte[] buffer) {
        F.p(buffer, "buffer");
        this.f47626L = 4;
        if (buffer.length >= 4) {
            p(buffer[1]);
            int length = buffer.length;
            int i4 = this.f47626L;
            int i5 = length - i4;
            byte[] bArr = new byte[i5];
            System.arraycopy(buffer, i4, bArr, 0, i5);
            j(bArr);
        }
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
}
