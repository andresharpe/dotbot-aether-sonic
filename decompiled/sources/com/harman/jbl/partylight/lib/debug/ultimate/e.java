package com.harman.jbl.partylight.lib.debug.ultimate;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final SpeakerDevice f46566a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46567b;

    public e(@l3.d SpeakerDevice dev, boolean z3) {
        F.p(dev, "dev");
        this.f46566a = dev;
        this.f46567b = z3;
    }

    public static /* synthetic */ e d(e eVar, SpeakerDevice speakerDevice, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            speakerDevice = eVar.f46566a;
        }
        if ((i4 & 2) != 0) {
            z3 = eVar.f46567b;
        }
        return eVar.c(speakerDevice, z3);
    }

    @l3.d
    public final SpeakerDevice a() {
        return this.f46566a;
    }

    public final boolean b() {
        return this.f46567b;
    }

    @l3.d
    public final e c(@l3.d SpeakerDevice dev, boolean z3) {
        F.p(dev, "dev");
        return new e(dev, z3);
    }

    @l3.d
    public final SpeakerDevice e() {
        return this.f46566a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return F.g(this.f46566a, eVar.f46566a) && this.f46567b == eVar.f46567b;
    }

    public final boolean f() {
        return this.f46567b;
    }

    public final void g(boolean z3) {
        this.f46567b = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f46566a.hashCode() * 31;
        boolean z3 = this.f46567b;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    @l3.d
    public String toString() {
        return "Item(dev=" + this.f46566a + ", isConnected=" + this.f46567b + ")";
    }

    public /* synthetic */ e(SpeakerDevice speakerDevice, boolean z3, int i4, C2197u c2197u) {
        this(speakerDevice, (i4 & 2) != 0 ? false : z3);
    }
}
