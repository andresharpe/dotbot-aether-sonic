package O1;

import android.bluetooth.le.ScanResult;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final List<d> f1712a;

    public b() {
        List<d> O3;
        O3 = CollectionsKt__CollectionsKt.O(new a(), new e(), new f());
        this.f1712a = O3;
    }

    @Override // O1.d
    @l3.e
    public ModuleDevice a(@l3.d ScanResult scanResult) {
        ModuleDevice moduleDevice;
        F.p(scanResult, "scanResult");
        Iterator<T> it = this.f1712a.iterator();
        while (true) {
            if (it.hasNext()) {
                moduleDevice = ((d) it.next()).a(scanResult);
                if (moduleDevice != null) {
                    break;
                }
            } else {
                moduleDevice = null;
                break;
            }
        }
        if (moduleDevice == null) {
            return null;
        }
        moduleDevice.m(scanResult);
        com.harman.jbl.cd_biz_comm.logger.d.a(c.f1713a, moduleDevice.toString());
        return moduleDevice;
    }
}
