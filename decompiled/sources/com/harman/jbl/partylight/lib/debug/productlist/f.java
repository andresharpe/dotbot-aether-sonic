package com.harman.jbl.partylight.lib.debug.productlist;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final PartyLightDevice f46535a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46536b;

    public f(@l3.d PartyLightDevice dev, boolean z3) {
        F.p(dev, "dev");
        this.f46535a = dev;
        this.f46536b = z3;
    }

    public static /* synthetic */ f d(f fVar, PartyLightDevice partyLightDevice, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            partyLightDevice = fVar.f46535a;
        }
        if ((i4 & 2) != 0) {
            z3 = fVar.f46536b;
        }
        return fVar.c(partyLightDevice, z3);
    }

    @l3.d
    public final PartyLightDevice a() {
        return this.f46535a;
    }

    public final boolean b() {
        return this.f46536b;
    }

    @l3.d
    public final f c(@l3.d PartyLightDevice dev, boolean z3) {
        F.p(dev, "dev");
        return new f(dev, z3);
    }

    @l3.d
    public final PartyLightDevice e() {
        return this.f46535a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return F.g(this.f46535a, fVar.f46535a) && this.f46536b == fVar.f46536b;
    }

    public final boolean f() {
        return this.f46536b;
    }

    public final void g(boolean z3) {
        this.f46536b = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f46535a.hashCode() * 31;
        boolean z3 = this.f46536b;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    @l3.d
    public String toString() {
        return "Item(dev=" + this.f46535a + ", isConnected=" + this.f46536b + ")";
    }

    public /* synthetic */ f(PartyLightDevice partyLightDevice, boolean z3, int i4, C2197u c2197u) {
        this(partyLightDevice, (i4 & 2) != 0 ? false : z3);
    }
}
