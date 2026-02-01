package com.harman.jbl.cd_biz_comm.wireless_tech;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final ModuleDevice f38054a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b f38055b;

    public a(@l3.d ModuleDevice dev, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b commander) {
        F.p(dev, "dev");
        F.p(commander, "commander");
        this.f38054a = dev;
        this.f38055b = commander;
    }

    public static /* synthetic */ a d(a aVar, ModuleDevice moduleDevice, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b bVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            moduleDevice = aVar.f38054a;
        }
        if ((i4 & 2) != 0) {
            bVar = aVar.f38055b;
        }
        return aVar.c(moduleDevice, bVar);
    }

    @l3.d
    public final ModuleDevice a() {
        return this.f38054a;
    }

    @l3.d
    public final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b b() {
        return this.f38055b;
    }

    @l3.d
    public final a c(@l3.d ModuleDevice dev, @l3.d com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b commander) {
        F.p(dev, "dev");
        F.p(commander, "commander");
        return new a(dev, commander);
    }

    @l3.d
    public final com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.b e() {
        return this.f38055b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return F.g(this.f38054a, aVar.f38054a) && F.g(this.f38055b, aVar.f38055b);
    }

    @l3.d
    public final ModuleDevice f() {
        return this.f38054a;
    }

    public int hashCode() {
        return (this.f38054a.hashCode() * 31) + this.f38055b.hashCode();
    }

    @l3.d
    public String toString() {
        return "ConnectedModel(dev=" + this.f38054a + ", commander=" + this.f38055b + ")";
    }
}
