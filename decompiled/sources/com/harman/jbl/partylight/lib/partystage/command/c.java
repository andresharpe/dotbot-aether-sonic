package com.harman.jbl.partylight.lib.partystage.command;

import java.util.ArrayList;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class c extends com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final Integer f47438c;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] O5;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) 0);
        Integer num = this.f47438c;
        if (num != null) {
            int intValue = num.intValue();
            arrayList.add((byte) 72);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf((byte) intValue));
        }
        O5 = D.O5(arrayList);
        return O5;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) 51;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) 0;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return Boolean.valueOf(com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a.f38062c.a(respContent).f());
    }

    public c(@l3.e Integer num) {
        this.f47438c = num;
    }

    public /* synthetic */ c(Integer num, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : num);
    }
}
