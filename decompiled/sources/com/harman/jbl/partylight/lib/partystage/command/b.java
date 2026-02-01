package com.harman.jbl.partylight.lib.partystage.command;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f47437a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<h> a(@l3.d SpeakerDevice dev) {
            F.p(dev, "dev");
            if (dev.r()) {
                return new g();
            }
            return new com.harman.jbl.partylight.lib.partystage.command.a();
        }

        private a() {
        }
    }
}
