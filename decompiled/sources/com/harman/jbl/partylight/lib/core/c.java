package com.harman.jbl.partylight.lib.core;

import com.harman.jbl.cd_biz_comm.utils.h;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.core.PLGroup;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c {
    @l3.d
    public static final PLGroup.Type a(@l3.d PartyLightDevice partyLightDevice) {
        F.p(partyLightDevice, "<this>");
        if (h.c(partyLightDevice.d())) {
            return PLGroup.Type.Beam;
        }
        return PLGroup.Type.Stick;
    }
}
