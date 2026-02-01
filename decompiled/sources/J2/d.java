package j2;

import com.harman.jbl.cd_biz_comm.utils.h;
import com.harman.jbl.partylight.lib.g;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final d f51050a = new d();

    private d() {
    }

    public final int a(@l3.d String pid) {
        F.p(pid, "pid");
        if (h.c(pid)) {
            return g.i.f47044r;
        }
        if (h.e(pid)) {
            return g.i.f47046t;
        }
        return 0;
    }

    @l3.d
    public final c b(@l3.d String pid) {
        F.p(pid, "pid");
        c cVar = new c(0, 0, null, 7, null);
        if (h.c(pid)) {
            return new c(g.i.f47044r, g.i.f47045s, "https://harman.widen.net/s/lq2xvzdmxq/pa_jbl_partylight-beam_qsg_sop_v9_online");
        }
        if (h.d(pid)) {
            return new c(g.i.f47046t, g.i.f47047u, "https://harman.widen.net/s/7gkdqhgbdg/pa_jbl_partylight-stick_qsg_sop_v12_online");
        }
        return cVar;
    }
}
