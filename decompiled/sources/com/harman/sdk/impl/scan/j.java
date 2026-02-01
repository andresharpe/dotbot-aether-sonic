package com.harman.sdk.impl.scan;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f48086a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48087b;

    public j(boolean z3, int i4) {
        this.f48086a = z3;
        this.f48087b = i4;
    }

    public static /* synthetic */ j d(j jVar, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z3 = jVar.f48086a;
        }
        if ((i5 & 2) != 0) {
            i4 = jVar.f48087b;
        }
        return jVar.c(z3, i4);
    }

    public final boolean a() {
        return this.f48086a;
    }

    public final int b() {
        return this.f48087b;
    }

    @l3.d
    public final j c(boolean z3, int i4) {
        return new j(z3, i4);
    }

    public final int e() {
        return this.f48087b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f48086a == jVar.f48086a && this.f48087b == jVar.f48087b;
    }

    public final boolean f() {
        return this.f48086a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z3 = this.f48086a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        return (r02 * 31) + Integer.hashCode(this.f48087b);
    }

    @l3.d
    public String toString() {
        return "PartyLightInfo(isLinkToPartyBox=" + this.f48086a + ", stageNumber=" + this.f48087b + ")";
    }
}
