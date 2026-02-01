package com.harman.jbl.partylight.lib.partystage.command;

import com.blankj.utilcode.util.J;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.collections.X;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class g extends i<h> {
    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public boolean a() {
        return true;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i
    public short h() {
        return (short) 7682;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i
    @l3.e
    public Map<String, Object> i() {
        Map<String, Object> k4;
        k4 = X.k(C2122h0.a("type", "Stick Number"));
        return k4;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i
    @l3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public h j(@l3.d String json) {
        boolean z3;
        Number number;
        F.p(json, "json");
        Map map = (Map) J.h(json, Map.class);
        F.m(map);
        if (F.g(map.get("error_code"), com.harman.jbl.partybox.ui.effectlab.a.f43472q)) {
            Object obj = map.get("value");
            if (obj instanceof Number) {
                number = (Number) obj;
            } else {
                number = null;
            }
            if (number != null) {
                z3 = true;
                return new h(z3);
            }
        }
        z3 = false;
        return new h(z3);
    }
}
