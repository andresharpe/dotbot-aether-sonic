package com.harman.sdk.command;

import androidx.core.app.C0;
import com.harman.log.b;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2222d;
import l3.d;
import org.json.JSONObject;

@E(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/harman/sdk/command/ProAuraCastCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", b.f47574c, "()[B", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "Lcom/harman/sdk/utils/AuracastStatus;", "L", "Lcom/harman/sdk/utils/AuracastStatus;", C0.f11537F0, "", "M", "J", "t", "()J", "o", "(J)V", "commandTimeOut", "", "value", "g", "()B", "m", "(B)V", "identifier", "", "d", "()Z", "isChangeCommand", "<init>", "(Lcom/harman/sdk/utils/AuracastStatus;)V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ProAuraCastCommand extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47661N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @d
    private static final String f47662O = "ProAuraCastCommand.Command";

    /* renamed from: L, reason: collision with root package name */
    @d
    private AuracastStatus f47663L;

    /* renamed from: M, reason: collision with root package name */
    private long f47664M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public ProAuraCastCommand(@d AuracastStatus status) {
        F.p(status, "status");
        this.f47663L = status;
        this.f47664M = 2000L;
        p(k.f48665g0);
        v().clear();
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public byte[] b() {
        byte[] bArr = new byte[6];
        bArr[0] = 80;
        byte b4 = 1;
        bArr[1] = k.f48665g0;
        if (this.f47663L != AuracastStatus.AURACAST_MODE) {
            b4 = 2;
        }
        bArr[2] = b4;
        bArr[3] = k.f48669h0;
        bArr[4] = 0;
        bArr[5] = 0;
        return bArr;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public byte g() {
        return (byte) 80;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void m(byte b4) {
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void o(long j4) {
        this.f47664M = j4;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        String str;
        byte[] n4;
        AuracastStatus auracastStatus;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        boolean z3 = false;
        if ((receivedCommand instanceof BaseCommandWiFi) && (n4 = receivedCommand.n()) != null) {
            baseMessage.d(MessageID.AURACAST_STATUS);
            if (new JSONObject(new String(n4, C2222d.f52792b)).optInt("error_code") == 0) {
                z3 = true;
            }
            if (z3 && (receivedCommand instanceof BaseCommandWiFi)) {
                AuracastInfo d4 = device.d();
                if (d4 == null) {
                    d4 = new AuracastInfo();
                }
                if (((BaseCommandWiFi) receivedCommand).y() == 287) {
                    auracastStatus = AuracastStatus.AURACAST_MODE;
                } else {
                    auracastStatus = AuracastStatus.NORMAL_MODE;
                }
                d4.h(auracastStatus);
                device.Y(d4);
            }
            baseMessage.e(device);
        }
        if (z3) {
            str = "Suc";
        } else {
            str = "Fail";
        }
        f.d(f47662O, "onReceive() >>> set Pro Auracast " + str + " for Device.MAC[" + device.n() + "] BLE[" + device.g() + "]");
        return baseMessage;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public long t() {
        return this.f47664M;
    }
}
