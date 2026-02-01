package com.harman.sdk.command;

import N0.a;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import kotlin.E;
import kotlin.collections.A;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/harman/sdk/command/SetDeviceNameCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lkotlin/H0;", "y", "()V", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "L", "B", "devIndexInBytes", "", "M", "Ljava/lang/String;", a.C0015a.f1688b, "", "d", "()Z", "isChangeCommand", "<init>", "(Lcom/harman/sdk/device/HmDevice;Ljava/lang/String;)V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSetDeviceNameCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetDeviceNameCommand.kt\ncom/harman/sdk/command/SetDeviceNameCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/* loaded from: classes2.dex */
public final class SetDeviceNameCommand extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47691N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @d
    private static final String f47692O = "SetDeviceNameCommand";

    /* renamed from: L, reason: collision with root package name */
    private final byte f47693L;

    /* renamed from: M, reason: collision with root package name */
    @e
    private String f47694M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public SetDeviceNameCommand(@d HmDevice device, @d String name) {
        F.p(device, "device");
        F.p(name, "name");
        p((byte) 19);
        v().add((byte) 0);
        if (com.harman.sdk.utils.d.t0(device.q())) {
            if (name.length() > 16) {
                String substring = name.substring(0, name.length());
                F.o(substring, "substring(...)");
                this.f47694M = substring;
            } else {
                this.f47694M = name;
            }
        } else if (name.length() > 24) {
            String substring2 = name.substring(0, 24);
            F.o(substring2, "substring(...)");
            this.f47694M = substring2;
        } else {
            this.f47694M = name;
        }
        if (name.length() > 24) {
            String substring3 = name.substring(0, 24);
            F.o(substring3, "substring(...)");
            this.f47694M = substring3;
        } else if (name.length() > 16) {
            String substring4 = name.substring(0, name.length());
            F.o(substring4, "substring(...)");
            this.f47694M = substring4;
        } else {
            this.f47694M = name;
        }
        this.f47693L = (byte) device.m();
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y() {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = r8.f47694M
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L1e
            java.lang.String r1 = r8.f47694M
            if (r1 == 0) goto L1a
            java.nio.charset.Charset r2 = kotlin.text.C2222d.f52792b
            byte[] r2 = r1.getBytes(r2)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.F.o(r2, r1)
        L1a:
            if (r2 == 0) goto L1e
            int r1 = r2.length
            goto L1f
        L1e:
            r1 = r3
        L1f:
            byte r4 = r8.f47693L
            r5 = 16
            int r5 = kotlin.text.C2219a.a(r5)
            java.lang.String r6 = "c1"
            int r5 = java.lang.Integer.parseInt(r6, r5)
            byte r5 = (byte) r5
            byte r6 = (byte) r1
            byte[] r7 = new byte[r0]
            r7[r3] = r4
            r4 = 1
            r7[r4] = r5
            r4 = 2
            r7[r4] = r6
            int r4 = r1 + 3
            byte[] r4 = new byte[r4]
            java.lang.System.arraycopy(r7, r3, r4, r3, r0)
            if (r2 == 0) goto L45
            java.lang.System.arraycopy(r2, r3, r4, r0, r1)
        L45:
            r8.j(r4)
            byte[] r0 = r8.n()
            java.lang.String r0 = com.harman.sdk.utils.g.d(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "init() >>> payload["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "SetDeviceNameCommand"
            com.harman.log.f.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.command.SetDeviceNameCommand.y():void");
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
        BaseMessage baseMessage = new BaseMessage();
        boolean z3 = false;
        if (receivedCommand.k() == 0) {
            byte[] n4 = receivedCommand.n();
            if (n4 != null && n4.length > 1 && 19 == n4[0] && n4[1] == 0) {
                A.M0(v());
                String str = this.f47694M;
                if (str == null) {
                    str = "";
                }
                device.m0(str);
                baseMessage.d(MessageID.DEVICE_NAME);
                baseMessage.e(device);
                z3 = true;
            } else {
                baseMessage.d(MessageID.UNKNOWN);
            }
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        f.a(f47692O, "onReceive() >>> rename to [" + this.f47694M + "] payload[" + g.d(receivedCommand.n()) + "] result[" + z3 + "]");
        return baseMessage;
    }
}
