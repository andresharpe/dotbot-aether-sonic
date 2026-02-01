package com.harman.jbl.partylight.lib.partystage.command;

import com.harman.jbl.cd_biz_comm.utils.i;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class a extends com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e<h> {
    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public boolean a() {
        return true;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        return null;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) -95;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) -94;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public h b(@l3.d byte[] respContent) {
        List Ny;
        byte[] O5;
        Object B22;
        boolean z3;
        F.p(respContent, "respContent");
        com.harman.jbl.cd_biz_comm.logger.d.a(com.harman.jbl.partylight.lib.core.e.f46287c, "enter ReqDevFeatureInfo parseResp respContent = " + i.f(respContent));
        try {
            h hVar = new h(false, 1, null);
            Ny = C2101p.Ny(respContent);
            Iterator it = Ny.iterator();
            while (it.hasNext()) {
                byte byteValue = ((Number) it.next()).byteValue();
                byte byteValue2 = ((Number) it.next()).byteValue();
                List b4 = i.b(it, byteValue2);
                O5 = D.O5(b4);
                com.harman.jbl.cd_biz_comm.logger.d.a(com.harman.jbl.partylight.lib.core.e.f46287c, "featureId = " + ((int) byteValue) + ", length = " + ((int) byteValue2) + ", valueBytes = " + i.f(O5));
                if (byteValue == -90) {
                    B22 = D.B2(b4);
                    if (((Number) B22).byteValue() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    hVar = hVar.b(z3);
                }
            }
            com.harman.jbl.cd_biz_comm.logger.d.a(com.harman.jbl.partylight.lib.core.e.f46287c, "SpeakerFeatureInfo parse result = " + hVar);
            return hVar;
        } catch (Exception e4) {
            com.harman.jbl.cd_biz_comm.logger.d.b(com.harman.jbl.partylight.lib.core.e.f46287c, "SpeakerFeatureInfo parse fail " + e4);
            return new h(false, 1, null);
        }
    }
}
