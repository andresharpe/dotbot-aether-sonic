package com.harman.jbl.partylight.lib.dashboard;

import com.harman.jbl.partylight.lib.biz.AuracastMode;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final AuracastMode f46401a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final String f46402b;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ r d(r rVar, AuracastMode auracastMode, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            auracastMode = rVar.f46401a;
        }
        if ((i4 & 2) != 0) {
            str = rVar.f46402b;
        }
        return rVar.c(auracastMode, str);
    }

    @l3.d
    public final AuracastMode a() {
        return this.f46401a;
    }

    @l3.e
    public final String b() {
        return this.f46402b;
    }

    @l3.d
    public final r c(@l3.d AuracastMode acMode, @l3.e String str) {
        F.p(acMode, "acMode");
        return new r(acMode, str);
    }

    @l3.d
    public final AuracastMode e() {
        return this.f46401a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f46401a == rVar.f46401a && F.g(this.f46402b, rVar.f46402b);
    }

    @l3.e
    public final String f() {
        return this.f46402b;
    }

    public int hashCode() {
        int hashCode = this.f46401a.hashCode() * 31;
        String str = this.f46402b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @l3.d
    public String toString() {
        return "SyncState(acMode=" + this.f46401a + ", linkedSpeakerId=" + this.f46402b + ")";
    }

    public r(@l3.d AuracastMode acMode, @l3.e String str) {
        F.p(acMode, "acMode");
        this.f46401a = acMode;
        this.f46402b = str;
    }

    public /* synthetic */ r(AuracastMode auracastMode, String str, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? AuracastMode.OFF : auracastMode, (i4 & 2) != 0 ? null : str);
    }
}
