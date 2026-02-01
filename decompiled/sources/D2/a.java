package D2;

import com.google.gson.annotations.SerializedName;
import com.harman.sdk.setting.AuraCastDeviceItem;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.A;
import l3.d;
import l3.e;

@U({"SMAP\nCrossAuraCastConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossAuraCastConfig.kt\ncom/harman/sdk/setting/CrossAuraCastConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,53:1\n1855#2:54\n1856#2:57\n215#3,2:55\n*S KotlinDebug\n*F\n+ 1 CrossAuraCastConfig.kt\ncom/harman/sdk/setting/CrossAuraCastConfig\n*L\n14#1:54\n14#1:57\n15#1:55,2\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("auracast_product_list")
    @e
    private final List<AuraCastDeviceItem> f56a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private String f57b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final List<AuraCastDeviceItem> a() {
        return this.f56a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a c(a aVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = aVar.f56a;
        }
        return aVar.b(list);
    }

    @d
    public final a b(@e List<AuraCastDeviceItem> list) {
        return new a(list);
    }

    @e
    public final List<AuraCastDeviceItem> d() {
        boolean T22;
        List<AuraCastDeviceItem> list = this.f56a;
        if (list != null) {
            for (AuraCastDeviceItem auraCastDeviceItem : list) {
                for (Map.Entry<String, String> entry : auraCastDeviceItem.o().entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    T22 = A.T2(value, this.f57b, false, 2, null);
                    if (!T22) {
                        auraCastDeviceItem.o().put(key, this.f57b + value);
                    }
                }
            }
        }
        return this.f56a;
    }

    @d
    public final String e() {
        return this.f57b;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && F.g(this.f56a, ((a) obj).f56a)) {
            return true;
        }
        return false;
    }

    public final void f(@d String str) {
        F.p(str, "<set-?>");
        this.f57b = str;
    }

    public int hashCode() {
        List<AuraCastDeviceItem> list = this.f56a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @d
    public String toString() {
        return "CrossAuraCastConfig(auraCastDeviceItems=" + this.f56a + ", crossAuraCastHost='" + this.f57b + "')";
    }

    public /* synthetic */ a(List list, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? new LinkedList() : list);
    }

    public a(@e List<AuraCastDeviceItem> list) {
        this.f56a = list;
        this.f57b = "";
    }
}
