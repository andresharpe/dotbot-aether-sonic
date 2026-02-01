package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h extends b {

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    public static final a f38093M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    public static final short f38094N = 19536;

    /* renamed from: O, reason: collision with root package name */
    public static final short f38095O = Short.MIN_VALUE;

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private f f38096L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@l3.d ModuleDevice dev) {
        super(dev);
        F.p(dev, "dev");
    }

    private final void v() {
        c s4;
        f fVar = this.f38096L;
        if (fVar != null && (s4 = s()) != null && fVar.e() == fVar.f().length) {
            try {
                s4.e().F0(new WriteResp<>(s4.f().b(fVar.f()), true, null, null, null, 28, null));
            } catch (Exception unused) {
                s4.e().F0(new WriteResp<>(null, false, WriteResp.Error.PARSE_ERROR, "response parse error", null, 16, null));
            }
            this.f38096L = null;
        }
    }

    private final void w(ByteBuffer byteBuffer) {
        i iVar;
        c s4 = s();
        if (s4 != null) {
            byteBuffer.getShort();
            short s5 = byteBuffer.getShort();
            g<?> f4 = s4.f();
            if (f4 instanceof i) {
                iVar = (i) f4;
            } else {
                iVar = null;
            }
            if (iVar != null && iVar.h() != s5) {
                return;
            }
            byteBuffer.getShort();
            short s6 = byteBuffer.getShort();
            int length = byteBuffer.array().length - 12;
            byte[] bArr = new byte[length];
            byteBuffer.get(bArr, 0, length);
            this.f38096L = new f(s6, bArr);
            v();
            return;
        }
        com.harman.jbl.cd_biz_comm.logger.d.b(b.f38065J.a(), "UltimateCommander no sending command " + byteBuffer);
    }

    private final void x(ByteBuffer byteBuffer) {
    }

    private final void y(ByteBuffer byteBuffer) {
        byte[] g32;
        f fVar = this.f38096L;
        if (fVar != null) {
            byte[] f4 = fVar.f();
            byte[] array = byteBuffer.array();
            F.o(array, "array(...)");
            g32 = C2100o.g3(f4, array);
            fVar.g(g32);
            v();
        }
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b
    @l3.e
    public com.harman.jbl.cd_biz_comm.wireless_tech.g t(@l3.d byte[] data) {
        F.p(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        F.o(copyOf, "copyOf(...)");
        ByteBuffer order = ByteBuffer.wrap(copyOf).order(ByteOrder.LITTLE_ENDIAN);
        short s4 = order.getShort();
        short s5 = order.getShort();
        if (s4 == 19536 && s5 == Short.MIN_VALUE) {
            F.m(order);
            w(order);
            return null;
        }
        if (s4 == 19536) {
            F.m(order);
            x(order);
            return null;
        }
        if (this.f38096L != null) {
            F.m(order);
            y(order);
            return null;
        }
        com.harman.jbl.cd_biz_comm.logger.d.b(b.f38065J.a(), "UltimateCommander onNotify data unknown state");
        return null;
    }
}
