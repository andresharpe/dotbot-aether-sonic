package com.harman.jbl.cd_biz_comm.wireless_tech;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;

/* loaded from: classes2.dex */
public final class d {
    public static final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b a(ModuleDevice moduleDevice) {
        return c(moduleDevice);
    }

    public static final /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c b(ModuleDevice moduleDevice) {
        return d(moduleDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b c(ModuleDevice moduleDevice) {
        if ((moduleDevice instanceof SpeakerDevice) && ((SpeakerDevice) moduleDevice).r()) {
            return new com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.h(moduleDevice);
        }
        return new com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.d(moduleDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c d(ModuleDevice moduleDevice) {
        if ((moduleDevice instanceof SpeakerDevice) && ((SpeakerDevice) moduleDevice).r()) {
            return new com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c("65786365-6C70-6F69-6E74-2E636F6D0002", "65786365-6C70-6F69-6E74-2E636F6D0002", "65786365-6C70-6F69-6E74-2E636F6D0000", 512);
        }
        return new com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.c("65786365-6C70-6F69-6E74-2E636F6D0001", "65786365-6C70-6F69-6E74-2E636F6D0002", "65786365-6C70-6F69-6E74-2E636F6D0000", 512);
    }
}
