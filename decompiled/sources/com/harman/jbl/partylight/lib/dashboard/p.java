package com.harman.jbl.partylight.lib.dashboard;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerAuracastMode;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerRole;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p {
    @l3.e
    public static final SpeakerDevice a() {
        Object obj;
        Iterator<T> it = com.harman.jbl.cd_biz_comm.wireless_tech.j.f38190F.r().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                SpeakerDevice speakerDevice = (SpeakerDevice) obj;
                if (speakerDevice.q() && speakerDevice.p() == SpeakerRole.MASTER && speakerDevice.o() == SpeakerAuracastMode.ON) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (SpeakerDevice) obj;
    }
}
