package n2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import kotlin.jvm.internal.F;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2375a extends e<Boolean> {
    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public int d() {
        return 60000;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        return null;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) 42;
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
}
