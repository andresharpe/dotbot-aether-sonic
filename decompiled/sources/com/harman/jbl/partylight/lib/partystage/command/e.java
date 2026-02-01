package com.harman.jbl.partylight.lib.partystage.command;

import com.blankj.utilcode.util.J;
import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i;
import java.util.Map;
import kotlin.C2122h0;
import kotlin.Pair;
import kotlin.collections.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class e extends i<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final Integer f47440b;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i
    public short h() {
        return (short) 7681;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i
    @l3.e
    public Map<String, Object> i() {
        Map<String, Object> W3;
        Pair[] pairArr = new Pair[2];
        int i4 = 0;
        pairArr[0] = C2122h0.a("type", "Stick Number");
        Integer num = this.f47440b;
        if (num != null) {
            i4 = num.intValue();
        }
        pairArr[1] = C2122h0.a("value", Integer.valueOf(i4));
        W3 = Y.W(pairArr);
        return W3;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.i
    @l3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean j(@l3.d String json) {
        F.p(json, "json");
        Map map = (Map) J.h(json, Map.class);
        F.m(map);
        return Boolean.valueOf(F.g(map.get("error_code"), com.harman.jbl.partybox.ui.effectlab.a.f43472q));
    }

    public e(@l3.e Integer num) {
        this.f47440b = num;
    }

    public /* synthetic */ e(Integer num, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : num);
    }
}
