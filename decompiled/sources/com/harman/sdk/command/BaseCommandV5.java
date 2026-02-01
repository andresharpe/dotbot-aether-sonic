package com.harman.sdk.command;

import com.harman.log.b;
import com.harman.log.f;
import com.harman.sdk.utils.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\f\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/harman/sdk/command/BaseCommandV5;", "Lcom/harman/sdk/command/BaseCommand;", "", b.f47574c, "()[B", "", "toString", "()Ljava/lang/String;", "", "L", "I", "payloadStartIndex", "M", "y", "()I", "z", "(I)V", "statusCode", "", "value", "g", "()B", "m", "(B)V", "identifier", "buffer", "<init>", "([B)V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBaseCommandV5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandV5.kt\ncom/harman/sdk/command/BaseCommandV5\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,71:1\n37#2,2:72\n*S KotlinDebug\n*F\n+ 1 BaseCommandV5.kt\ncom/harman/sdk/command/BaseCommandV5\n*L\n61#1:72,2\n*E\n"})
/* loaded from: classes2.dex */
public class BaseCommandV5 extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47627N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @d
    private static final String f47628O = "BaseCommandV5";

    /* renamed from: P, reason: collision with root package name */
    public static final short f47629P = -8960;

    /* renamed from: Q, reason: collision with root package name */
    public static final short f47630Q = 2;

    /* renamed from: R, reason: collision with root package name */
    public static final int f47631R = 65535;

    /* renamed from: L, reason: collision with root package name */
    private int f47632L;

    /* renamed from: M, reason: collision with root package name */
    private int f47633M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public BaseCommandV5(@d byte[] buffer) {
        F.p(buffer, "buffer");
        this.f47632L = 4;
        this.f47633M = 65535;
        byte[] copyOf = Arrays.copyOf(buffer, buffer.length);
        F.o(copyOf, "copyOf(...)");
        ByteBuffer order = ByteBuffer.wrap(copyOf).order(ByteOrder.LITTLE_ENDIAN);
        short s4 = order.getShort();
        short s5 = order.getShort();
        f.a(f47628O, "init>>> id = " + ((int) s4) + ", cmd = " + ((int) s5) + ", identifierV5 = -8960, cmdId = 2");
        if (s5 == 2) {
            short s6 = order.getShort();
            short s7 = order.getShort();
            short s8 = order.getShort();
            this.f47633M = s8;
            f.a(f47628O, "init>>> packetCount = " + ((int) s6) + ", payloadLength = " + ((int) s7) + ", statusCode = " + ((int) s8));
            p((byte) 2);
            int length = order.array().length + (-10);
            byte[] bArr = new byte[length];
            order.get(bArr, 0, length);
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

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public byte g() {
        return (byte) -35;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void m(byte b4) {
    }

    @Override // com.harman.sdk.command.BaseCommand
    @d
    public String toString() {
        return "BaseCommandV5{identifier=" + g.g(new byte[]{g()}) + ", command=" + g.g(new byte[]{k()}) + ", payloadLen=" + l() + ", payload=" + g.g(n()) + ", responseCommands=" + g.j((Byte[]) v().toArray(new Byte[0])) + "}";
    }

    public final int y() {
        return this.f47633M;
    }

    public final void z(int i4) {
        this.f47633M = i4;
    }
}
