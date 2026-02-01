package i2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import com.harman.jbl.partylight.lib.biz.AuracastMode;
import com.harman.jbl.partylight.lib.biz.Switch;
import java.util.ArrayList;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c extends e<com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a> {

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final Switch f50741c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final AuracastMode f50742d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private final Switch f50743e;

    public c() {
        this(null, null, null, 7, null);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] O5;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) 0);
        Switch r12 = this.f50741c;
        if (r12 != null) {
            arrayList.add((byte) 69);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf(r12.f()));
        }
        AuracastMode auracastMode = this.f50742d;
        if (auracastMode != null) {
            arrayList.add((byte) 60);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf(auracastMode.f()));
        }
        Switch r13 = this.f50743e;
        if (r13 != null) {
            arrayList.add((byte) 70);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf(r13.f()));
        }
        O5 = D.O5(arrayList);
        return O5;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) 19;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) 0;
    }

    @l3.e
    public final AuracastMode j() {
        return this.f50742d;
    }

    @l3.e
    public final Switch k() {
        return this.f50743e;
    }

    @l3.e
    public final Switch l() {
        return this.f50741c;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a.f38062c.a(respContent);
    }

    public /* synthetic */ c(Switch r22, AuracastMode auracastMode, Switch r4, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : r22, (i4 & 2) != 0 ? null : auracastMode, (i4 & 4) != 0 ? null : r4);
    }

    public c(@l3.e Switch r12, @l3.e AuracastMode auracastMode, @l3.e Switch r32) {
        this.f50741c = r12;
        this.f50742d = auracastMode;
        this.f50743e = r32;
    }
}
