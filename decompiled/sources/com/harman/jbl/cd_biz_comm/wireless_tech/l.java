package com.harman.jbl.cd_biz_comm.wireless_tech;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nDevFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevFilter.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/FilterProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1855#2,2:28\n*S KotlinDebug\n*F\n+ 1 DevFilter.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/FilterProcessor\n*L\n17#1:28,2\n*E\n"})
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Set<k> f38207a = new LinkedHashSet();

    public final void a(@l3.d k filter) {
        F.p(filter, "filter");
        this.f38207a.add(filter);
    }

    @l3.e
    public final ModuleDevice b(@l3.d ModuleDevice dev) {
        F.p(dev, "dev");
        Iterator<T> it = this.f38207a.iterator();
        while (it.hasNext()) {
            if (((k) it.next()).a(dev) == null) {
                return null;
            }
        }
        return dev;
    }
}
