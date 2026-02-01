package n2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import com.harman.jbl.partylight.lib.ota.DfuStatus;
import java.nio.ByteBuffer;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d extends e<DfuStatus> {

    /* renamed from: c, reason: collision with root package name */
    private final int f55286c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final byte[] f55287d;

    public d(int i4, @l3.d byte[] dfuData) {
        F.p(dfuData, "dfuData");
        this.f55286c = i4;
        this.f55287d = dfuData;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public int d() {
        return 60000;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] g32;
        byte[] array = ByteBuffer.allocate(4).putInt(this.f55286c).array();
        F.o(array, "array(...)");
        g32 = C2100o.g3(array, this.f55287d);
        return g32;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) 38;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return j2.b.f51046p;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public DfuStatus b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return DfuStatus.f47249c.a(respContent);
    }
}
