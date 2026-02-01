package i2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import h2.C2063b;
import kotlin.jvm.internal.F;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2069a extends e<C2063b> {
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
        return (byte) 17;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) 18;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2063b b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return C2063b.f50735f.a(respContent);
    }
}
