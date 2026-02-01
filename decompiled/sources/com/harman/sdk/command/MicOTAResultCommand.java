package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import kotlin.E;
import kotlin.collections.A;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2222d;
import l3.d;

@E(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0014\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/harman/sdk/command/MicOTAResultCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "toString", "()Ljava/lang/String;", "L", "Ljava/lang/String;", "y", androidx.exifinterface.media.a.Y4, "(Ljava/lang/String;)V", "message", "", "M", "B", "z", "()B", "(B)V", "result", "<init>", "()V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMicOTAResultCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicOTAResultCommand.kt\ncom/harman/sdk/command/MicOTAResultCommand\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 MicOTAResultCommand.kt\ncom/harman/sdk/command/MicOTAResultCommand\n*L\n43#1:65,2\n*E\n"})
/* loaded from: classes2.dex */
public class MicOTAResultCommand extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47653N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    public static final byte f47654O = 0;

    /* renamed from: P, reason: collision with root package name */
    public static final byte f47655P = 1;

    /* renamed from: Q, reason: collision with root package name */
    public static final byte f47656Q = 2;

    /* renamed from: R, reason: collision with root package name */
    @d
    private static final String f47657R = "MicOTAResultCommand";

    /* renamed from: L, reason: collision with root package name */
    @d
    private String f47658L = "UnKnown";

    /* renamed from: M, reason: collision with root package name */
    private byte f47659M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public MicOTAResultCommand() {
        p(k.f48651c2);
        v().add(Byte.valueOf(k.f48655d2));
    }

    public final void A(@d String str) {
        F.p(str, "<set-?>");
        this.f47658L = str;
    }

    public final void B(byte b4) {
        this.f47659M = b4;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        byte[] f12;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        BaseMessage baseMessage = new BaseMessage();
        if (-59 == receivedCommand.k()) {
            byte[] n4 = receivedCommand.n();
            f.a(f47657R, "MicOTAResultCommand ,payload: " + g.g(n4));
            if (n4 != null && n4.length > 1) {
                this.f47659M = n4[0];
                f12 = C2100o.f1(n4, 1, n4.length);
                this.f47658L = new String(f12, C2222d.f52792b);
                A.M0(v());
                baseMessage.d(MessageID.RET_MIC_OTA_RESULT);
                baseMessage.e(this);
                byte b4 = this.f47659M;
                f.a(f47657R, "MicOTAResultCommand ,result: " + ((int) b4) + ", message = " + this.f47658L + ", msgContent = " + baseMessage.a());
            } else {
                baseMessage.d(MessageID.UNKNOWN);
            }
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }

    @Override // com.harman.sdk.command.BaseCommand
    @d
    public String toString() {
        return "MicOTAResultCommand{identifier=" + g.g(new byte[]{g()}) + ", command=" + g.g(new byte[]{k()}) + ", payloadLen=" + l() + ", payload=" + g.g(n()) + ", responseCommands=" + g.j((Byte[]) v().toArray(new Byte[0])) + ", message=" + this.f47658L + ", result=" + ((int) this.f47659M) + "}";
    }

    @d
    public final String y() {
        return this.f47658L;
    }

    public final byte z() {
        return this.f47659M;
    }
}
