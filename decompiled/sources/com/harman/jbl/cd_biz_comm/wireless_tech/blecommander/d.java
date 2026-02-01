package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.WriteResp;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@l3.d ModuleDevice dev) {
        super(dev);
        F.p(dev, "dev");
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b
    @l3.d
    public com.harman.jbl.cd_biz_comm.wireless_tech.g t(@l3.d byte[] data) {
        byte[] bArr;
        F.p(data, "data");
        boolean z3 = false;
        byte b4 = data[0];
        byte b5 = data[1];
        byte b6 = data[2];
        e eVar = null;
        if (b6 > 0) {
            bArr = C2100o.f1(data, 3, b6 + 3);
        } else {
            bArr = null;
        }
        com.harman.jbl.cd_biz_comm.wireless_tech.g gVar = new com.harman.jbl.cd_biz_comm.wireless_tech.g(data, b5, bArr);
        c s4 = s();
        if (s4 != null) {
            g<?> f4 = s4.f();
            if (f4 instanceof e) {
                eVar = (e) f4;
            }
            if (eVar != null && b5 == eVar.i() && bArr != null) {
                if (bArr.length == 0) {
                    z3 = true;
                }
                if (!z3) {
                    try {
                        s4.e().F0(new WriteResp<>(eVar.b(bArr), true, null, null, gVar, 12, null));
                    } catch (Throwable unused) {
                        com.harman.jbl.cd_biz_comm.logger.d.b(b.f38065J.a(), "response parse error ; " + r().g() + " req = " + com.harman.jbl.cd_biz_comm.utils.i.c(eVar.h()) + " , resp = " + com.harman.jbl.cd_biz_comm.utils.i.f(bArr));
                        s4.e().F0(new WriteResp<>(null, false, WriteResp.Error.PARSE_ERROR, "response parse error", gVar));
                    }
                }
            }
        }
        return gVar;
    }
}
