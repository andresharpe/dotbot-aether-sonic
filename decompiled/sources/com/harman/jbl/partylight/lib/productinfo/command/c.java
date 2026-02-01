package com.harman.jbl.partylight.lib.productinfo.command;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import java.util.ArrayList;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class c extends e<b> {
    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] O5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf(a.TOTAL_POWER_DURATION_MINUTES.f()));
        O5 = D.O5(arrayList);
        return O5;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) -99;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) -98;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b b(@d byte[] respContent) {
        F.p(respContent, "respContent");
        return b.f47529b.a(respContent);
    }
}
