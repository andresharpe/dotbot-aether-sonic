package i2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import kotlin.jvm.internal.F;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2070b extends e<LightInfo> {
    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        return null;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) 49;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) 50;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LightInfo b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return LightInfo.f46228i.a(respContent);
    }
}
