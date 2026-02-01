package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import com.blankj.utilcode.util.J;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.F;
import kotlin.text.C;
import kotlin.text.C2222d;
import kotlin.text.z;

/* loaded from: classes2.dex */
public abstract class i<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f38097a;

    public i() {
        String X8;
        String uuid = UUID.randomUUID().toString();
        F.o(uuid, "toString(...)");
        X8 = C.X8(uuid, 6);
        this.f38097a = X8;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public boolean a() {
        return g.a.b(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public R b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        String str = new String(respContent, C2222d.f52792b);
        com.harman.jbl.cd_biz_comm.logger.d.a(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.t(), "Ultimate receive resp: " + str);
        return j(str);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    public String c() {
        return this.f38097a;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public int d() {
        return g.a.a(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    public String e() {
        return "reqCmd: " + com.harman.jbl.cd_biz_comm.utils.i.h(h(), null, 1, null) + " ; reqParams:" + J.v(i()) + " ; requestId: " + c();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] F12;
        Map<String, Object> i4 = i();
        if (i4 != null) {
            String v3 = J.v(i4);
            F.o(v3, "toJson(...)");
            F12 = z.F1(v3);
            return F12;
        }
        return null;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    public byte[] g() {
        int i4;
        byte[] f4 = f();
        short s4 = 0;
        if (f4 != null) {
            i4 = f4.length;
        } else {
            i4 = 0;
        }
        ByteBuffer order = ByteBuffer.allocate(i4 + 6).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort(h.f38094N);
        order.putShort(h());
        if (f4 != null) {
            s4 = (short) f4.length;
        }
        order.putShort(s4);
        if (f4 != null) {
            order.put(f4);
        }
        byte[] array = order.array();
        F.o(array, "array(...)");
        return array;
    }

    public abstract short h();

    @l3.e
    public abstract Map<String, Object> i();

    public abstract R j(@l3.d String str);
}
