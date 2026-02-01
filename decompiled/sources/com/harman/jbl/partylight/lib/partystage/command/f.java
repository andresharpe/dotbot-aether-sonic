package com.harman.jbl.partylight.lib.partystage.command;

import java.util.ArrayList;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f extends com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e<com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a> {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final StageStatus f47441c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final Integer f47442d;

    public f(@l3.d StageStatus status, @l3.e Integer num) {
        F.p(status, "status");
        this.f47441c = status;
        this.f47442d = num;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] O5;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) 1);
        arrayList.add((byte) 1);
        arrayList.add(Byte.valueOf(this.f47441c.g()));
        Integer num = this.f47442d;
        if (num != null) {
            int intValue = num.intValue();
            arrayList.add((byte) 2);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf((byte) intValue));
        }
        O5 = D.O5(arrayList);
        return O5;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) -85;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) 0;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a.f38062c.a(respContent);
    }

    public /* synthetic */ f(StageStatus stageStatus, Integer num, int i4, C2197u c2197u) {
        this(stageStatus, (i4 & 2) != 0 ? null : num);
    }
}
