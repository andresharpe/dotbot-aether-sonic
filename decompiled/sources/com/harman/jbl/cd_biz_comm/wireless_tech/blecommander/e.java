package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g;
import java.util.UUID;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.F;
import kotlin.text.C;

/* loaded from: classes2.dex */
public abstract class e<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final byte f38089a = -86;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f38090b;

    public e() {
        String X8;
        String uuid = UUID.randomUUID().toString();
        F.o(uuid, "toString(...)");
        X8 = C.X8(uuid, 6);
        this.f38090b = X8;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public boolean a() {
        return g.a.b(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    public String c() {
        return this.f38090b;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public int d() {
        return g.a.a(this);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    public String e() {
        return "reqCmd: " + com.harman.jbl.cd_biz_comm.utils.i.c(h()) + " ; respCmd: " + com.harman.jbl.cd_biz_comm.utils.i.c(i()) + " ; requestId: " + c();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    public byte[] g() {
        byte b4;
        byte[] g32;
        byte[] bArr = new byte[3];
        boolean z3 = false;
        bArr[0] = this.f38089a;
        bArr[1] = h();
        byte[] f4 = f();
        if (f4 != null) {
            b4 = (byte) f4.length;
        } else {
            b4 = 0;
        }
        bArr[2] = b4;
        byte[] f5 = f();
        if (f5 != null) {
            if (f5.length == 0) {
                z3 = true;
            }
            if (!z3) {
                byte[] f6 = f();
                F.m(f6);
                g32 = C2100o.g3(bArr, f6);
                return g32;
            }
            return bArr;
        }
        return bArr;
    }

    public abstract byte h();

    public abstract byte i();
}
