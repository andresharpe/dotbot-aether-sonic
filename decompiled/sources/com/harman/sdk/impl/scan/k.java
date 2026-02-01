package com.harman.sdk.impl.scan;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f48088a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f48089b;

    public k(boolean z3, boolean z4) {
        this.f48088a = z3;
        this.f48089b = z4;
    }

    public static /* synthetic */ k d(k kVar, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = kVar.f48088a;
        }
        if ((i4 & 2) != 0) {
            z4 = kVar.f48089b;
        }
        return kVar.c(z3, z4);
    }

    public final boolean a() {
        return this.f48088a;
    }

    public final boolean b() {
        return this.f48089b;
    }

    @l3.d
    public final k c(boolean z3, boolean z4) {
        return new k(z3, z4);
    }

    public final boolean e() {
        return this.f48089b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f48088a == kVar.f48088a && this.f48089b == kVar.f48089b;
    }

    public final boolean f() {
        return this.f48088a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z3 = this.f48088a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        boolean z4 = this.f48089b;
        return i4 + (z4 ? 1 : z4 ? 1 : 0);
    }

    @l3.d
    public String toString() {
        return "PartyMethodInfo(isAuracastSupport=" + this.f48088a + ", isAuracastLongLastingStereoSupport=" + this.f48089b + ")";
    }
}
