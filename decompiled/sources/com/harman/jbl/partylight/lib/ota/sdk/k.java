package com.harman.jbl.partylight.lib.ota.sdk;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.ota.sdk.j;
import java.util.List;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final j.a f47388a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f47389b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final List<PartyLightDevice> f47390c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final l f47391d;

    public k(@l3.d j.a firmware, @l3.d String firmwarePath, @l3.d List<PartyLightDevice> devices, @l3.d l listener) {
        F.p(firmware, "firmware");
        F.p(firmwarePath, "firmwarePath");
        F.p(devices, "devices");
        F.p(listener, "listener");
        this.f47388a = firmware;
        this.f47389b = firmwarePath;
        this.f47390c = devices;
        this.f47391d = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k f(k kVar, j.a aVar, String str, List list, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = kVar.f47388a;
        }
        if ((i4 & 2) != 0) {
            str = kVar.f47389b;
        }
        if ((i4 & 4) != 0) {
            list = kVar.f47390c;
        }
        if ((i4 & 8) != 0) {
            lVar = kVar.f47391d;
        }
        return kVar.e(aVar, str, list, lVar);
    }

    @l3.d
    public final j.a a() {
        return this.f47388a;
    }

    @l3.d
    public final String b() {
        return this.f47389b;
    }

    @l3.d
    public final List<PartyLightDevice> c() {
        return this.f47390c;
    }

    @l3.d
    public final l d() {
        return this.f47391d;
    }

    @l3.d
    public final k e(@l3.d j.a firmware, @l3.d String firmwarePath, @l3.d List<PartyLightDevice> devices, @l3.d l listener) {
        F.p(firmware, "firmware");
        F.p(firmwarePath, "firmwarePath");
        F.p(devices, "devices");
        F.p(listener, "listener");
        return new k(firmware, firmwarePath, devices, listener);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return F.g(this.f47388a, kVar.f47388a) && F.g(this.f47389b, kVar.f47389b) && F.g(this.f47390c, kVar.f47390c) && F.g(this.f47391d, kVar.f47391d);
    }

    @l3.d
    public final List<PartyLightDevice> g() {
        return this.f47390c;
    }

    @l3.d
    public final j.a h() {
        return this.f47388a;
    }

    public int hashCode() {
        return (((((this.f47388a.hashCode() * 31) + this.f47389b.hashCode()) * 31) + this.f47390c.hashCode()) * 31) + this.f47391d.hashCode();
    }

    @l3.d
    public final String i() {
        return this.f47389b;
    }

    @l3.d
    public final l j() {
        return this.f47391d;
    }

    @l3.d
    public String toString() {
        return "OtaHelperConfig(firmware=" + this.f47388a + ", firmwarePath=" + this.f47389b + ", devices=" + this.f47390c + ", listener=" + this.f47391d + ")";
    }
}
