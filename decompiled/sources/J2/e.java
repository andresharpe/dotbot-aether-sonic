package j2;

import com.harman.jbl.cd_biz_comm.wireless_tech.k;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.core.PLGroup;
import java.util.List;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final List<PLGroup.Type> f51051a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@l3.d List<? extends PLGroup.Type> supportTypes) {
        F.p(supportTypes, "supportTypes");
        this.f51051a = supportTypes;
    }

    private final boolean b(PLGroup.Type type) {
        return this.f51051a.contains(type);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.k
    @l3.e
    public ModuleDevice a(@l3.d ModuleDevice dev) {
        F.p(dev, "dev");
        if (!(dev instanceof PartyLightDevice)) {
            return dev;
        }
        if (b(com.harman.jbl.partylight.lib.core.c.a((PartyLightDevice) dev))) {
            return dev;
        }
        return null;
    }
}
