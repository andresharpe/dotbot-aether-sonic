package com.harman.sdk.command;

import com.harman.log.b;
import com.harman.sdk.utils.k;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\f\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0007\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/harman/sdk/command/BaseCommandWiFi;", "Lcom/harman/sdk/command/BaseCommand;", "", b.f47574c, "()[B", "", "L", "I", "payloadStartIndex", "M", "y", "()I", "z", "(I)V", "commandCode", "", "value", "g", "()B", "m", "(B)V", "identifier", "buffer", "<init>", "([B)V", "N", "a", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BaseCommandWiFi extends BaseCommand {

    /* renamed from: N, reason: collision with root package name */
    @d
    public static final a f47634N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    public static final int f47635O = 20556;

    /* renamed from: P, reason: collision with root package name */
    public static final int f47636P = 128;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f47637Q = 287;

    /* renamed from: R, reason: collision with root package name */
    public static final int f47638R = 543;

    /* renamed from: L, reason: collision with root package name */
    private int f47639L;

    /* renamed from: M, reason: collision with root package name */
    private int f47640M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public BaseCommandWiFi(@d byte[] buffer) {
        F.p(buffer, "buffer");
        this.f47639L = 4;
        this.f47640M = f47638R;
        byte[] copyOf = Arrays.copyOf(buffer, buffer.length);
        F.o(copyOf, "copyOf(...)");
        ByteBuffer wrap = ByteBuffer.wrap(copyOf);
        short s4 = wrap.getShort();
        short s5 = wrap.getShort();
        if (s4 == 20556 && s5 == 128) {
            wrap.getShort();
            short s6 = wrap.getShort();
            this.f47640M = s6;
            if (s6 == 287 || s6 == 543) {
                p(k.f48669h0);
                wrap.getShort();
                wrap.getShort();
                int length = wrap.array().length - 12;
                byte[] bArr = new byte[length];
                wrap.get(bArr, 0, length);
                j(bArr);
            }
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
        return (byte) 80;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public void m(byte b4) {
    }

    public final int y() {
        return this.f47640M;
    }

    public final void z(int i4) {
        this.f47640M = i4;
    }
}
