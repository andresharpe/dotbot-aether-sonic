package com.harman.jbl.partylight.lib.partystage.command;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f47439a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public static /* synthetic */ com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g b(a aVar, SpeakerDevice speakerDevice, Integer num, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                num = null;
            }
            return aVar.a(speakerDevice, num);
        }

        @l3.d
        public final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g<Boolean> a(@l3.d SpeakerDevice dev, @l3.e Integer num) {
            F.p(dev, "dev");
            if (dev.r()) {
                return new e(num);
            }
            return new c(num);
        }

        private a() {
        }
    }
}
