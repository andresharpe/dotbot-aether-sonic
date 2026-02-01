package n2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import com.harman.jbl.partylight.lib.ota.DfuStatus;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nReqDfuStartCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReqDfuStartCommand.kt\ncom/harman/jbl/partylight/lib/ota/command/ReqDfuStartCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1855#2,2:39\n*S KotlinDebug\n*F\n+ 1 ReqDfuStartCommand.kt\ncom/harman/jbl/partylight/lib/ota/command/ReqDfuStartCommand\n*L\n23#1:39,2\n*E\n"})
/* loaded from: classes2.dex */
public final class c extends e<DfuStatus> {

    /* renamed from: c, reason: collision with root package name */
    private final int f55282c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55283d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final List<Integer> f55284e;

    /* renamed from: f, reason: collision with root package name */
    private final int f55285f;

    public c(int i4, int i5, @l3.d List<Integer> versionInts, int i6) {
        F.p(versionInts, "versionInts");
        this.f55282c = i4;
        this.f55283d = i5;
        this.f55284e = versionInts;
        this.f55285f = i6;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public int d() {
        return 60000;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(this.f55282c);
        allocate.putInt(this.f55283d);
        Iterator<T> it = this.f55284e.iterator();
        while (it.hasNext()) {
            allocate.put((byte) ((Number) it.next()).intValue());
        }
        allocate.put((byte) this.f55285f);
        return allocate.array();
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return j2.b.f51040j;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return j2.b.f51046p;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public DfuStatus b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return DfuStatus.f47249c.a(respContent);
    }
}
