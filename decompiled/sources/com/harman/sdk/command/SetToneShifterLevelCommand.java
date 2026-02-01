package com.harman.sdk.command;

import androidx.core.app.C0;
import androidx.core.provider.h;
import com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;
import l3.e;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/harman/sdk/command/SetToneShifterLevelCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "L", "Ljava/lang/Integer;", C0.f11537F0, "<init>", "(I)V", "M", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SetToneShifterLevelCommand extends BaseCommand {

    /* renamed from: M, reason: collision with root package name */
    @d
    public static final a f47703M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    @d
    private static final String f47704N = "SetToneShifterLevelCommand";

    /* renamed from: L, reason: collision with root package name */
    @e
    private Integer f47705L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public SetToneShifterLevelCommand(int i4) {
        int a4;
        p((byte) 19);
        byte b4 = 4;
        byte[] bArr = new byte[4];
        bArr[0] = 0;
        a4 = C2220b.a(16);
        bArr[1] = (byte) Integer.parseInt(k.f48616S, a4);
        bArr[2] = 1;
        switch (i4) {
            case -6:
                b4 = -6;
                break;
            case ToneShifterDialog.TONESHIFTER_MIN /* -5 */:
                b4 = -5;
                break;
            case h.d.f12816f /* -4 */:
                b4 = -4;
                break;
            case -3:
                b4 = -3;
                break;
            case -2:
                b4 = -2;
                break;
            case -1:
                b4 = -1;
                break;
            case 0:
            default:
                b4 = 0;
                break;
            case 1:
                b4 = 1;
                break;
            case 2:
                b4 = 2;
                break;
            case 3:
                b4 = 3;
                break;
            case 4:
                break;
            case 5:
                b4 = 5;
                break;
            case 6:
                b4 = 6;
                break;
        }
        bArr[3] = b4;
        super.j(bArr);
        this.f47705L = Integer.valueOf(i4);
        v().add((byte) 0);
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
        if (receivedCommand.k() == 0 && (n4 = receivedCommand.n()) != null && n4.length > 1 && 19 == n4[0]) {
            A.M0(super.v());
            baseMessage.d(MessageID.RET_SET_TONE_SHIFTER_RESULT);
            if (n4[1] == 0) {
                z3 = true;
            }
            Integer num = this.f47705L;
            if (num != null) {
                ((PartyBoxDevice) device).K2(num.intValue());
            }
            baseMessage.e(device);
        }
        Integer num2 = this.f47705L;
        if (z3) {
            str = "suc";
        } else {
            str = L1.a.f1625n3;
        }
        f.d(f47704N, "onReceive() >>> update status[" + num2 + "] " + str);
        return baseMessage;
    }
}
