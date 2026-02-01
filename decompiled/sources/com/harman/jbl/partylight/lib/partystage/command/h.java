package com.harman.jbl.partylight.lib.partystage.command;

import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f47443a;

    public h() {
        this(false, 1, null);
    }

    public static /* synthetic */ h c(h hVar, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = hVar.f47443a;
        }
        return hVar.b(z3);
    }

    public final boolean a() {
        return this.f47443a;
    }

    @l3.d
    public final h b(boolean z3) {
        return new h(z3);
    }

    public final boolean d() {
        return this.f47443a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f47443a == ((h) obj).f47443a;
    }

    public int hashCode() {
        boolean z3 = this.f47443a;
        if (z3) {
            return 1;
        }
        return z3 ? 1 : 0;
    }

    @l3.d
    public String toString() {
        return "SpeakerFeatureInfo(isSupportStage=" + this.f47443a + ")";
    }

    public h(boolean z3) {
        this.f47443a = z3;
    }

    public /* synthetic */ h(boolean z3, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? false : z3);
    }
}
