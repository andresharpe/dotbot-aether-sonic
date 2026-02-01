package com.harman.sdk.command;

import androidx.core.app.C0;
import com.harman.log.b;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AuracastInfo;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

@E(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/harman/sdk/command/V5AuraCastCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", b.f47574c, "()[B", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "Lcom/harman/sdk/utils/AuracastStatus;", "L", "Lcom/harman/sdk/utils/AuracastStatus;", C0.f11537F0, "", "M", "J", "t", "()J", "o", "(J)V", "commandTimeOut", "", "value", "g", "()B", "m", "(B)V", "identifier", "", "d", "()Z", "isChangeCommand", "<init>", "(Lcom/harman/sdk/utils/AuracastStatus;)V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class V5AuraCastCommand extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47719N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @d
    private static final String f47720O = "V5AuraCastCommand.Command";

    /* renamed from: L, reason: collision with root package name */
    @d
    private AuracastStatus f47721L;

    /* renamed from: M, reason: collision with root package name */
    private long f47722M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public V5AuraCastCommand(@d AuracastStatus status) {
        F.p(status, "status");
        this.f47721L = status;
        this.f47722M = 2000L;
        p((byte) 0);
        v().clear();
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public byte[] b() {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer order = allocate.order(byteOrder);
        order.putShort((short) 8196);
        order.putShort((short) 1);
        order.put(new byte[]{(byte) this.f47721L.j()});
        f.a(f47720O, "payload>>> " + g.g(order.array()));
        ByteBuffer order2 = ByteBuffer.allocate(13).order(byteOrder);
        order2.putShort(BaseCommandV5.f47629P);
        order2.putShort((short) 2);
        order2.put((byte) 1);
        order2.put((byte) 0);
        order2.putShort((short) 5);
        order2.put(order.array());
        f.a(f47720O, "buffer>>> " + g.g(order2.array()));
        byte[] array = order2.array();
        F.o(array, "array(...)");
        return array;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public byte g() {
        return (byte) -35;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void m(byte b4) {
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void o(long j4) {
        this.f47722M = j4;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        String str;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        f.d(f47720O, "onReceive() >>> Device.MAC[" + device.n() + "] BLE[" + device.g() + "] receivedCommand = " + receivedCommand);
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.UNKNOWN);
        boolean z3 = false;
        if (receivedCommand instanceof BaseCommandV5) {
            baseMessage.d(MessageID.AURACAST_STATUS);
            if (((BaseCommandV5) receivedCommand).y() == 0) {
                AuracastInfo d4 = device.d();
                if (d4 == null) {
                    d4 = new AuracastInfo();
                }
                d4.h(this.f47721L);
                device.Y(d4);
                z3 = true;
            }
            baseMessage.e(device);
        }
        if (z3) {
            str = "Suc";
        } else {
            str = "Fail";
        }
        f.d(f47720O, "onReceive() >>> set V5 Auracast " + str + " for Device.MAC[" + device.n() + "] BLE[" + device.g() + "]");
        return baseMessage;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public long t() {
        return this.f47722M;
    }
}
