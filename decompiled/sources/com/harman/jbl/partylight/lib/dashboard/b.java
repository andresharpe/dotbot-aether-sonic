package com.harman.jbl.partylight.lib.dashboard;

import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f46322a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46323b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partylight.lib.dashboard.b.<init>():void");
    }

    public static /* synthetic */ b d(b bVar, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = bVar.f46322a;
        }
        if ((i4 & 2) != 0) {
            z4 = bVar.f46323b;
        }
        return bVar.c(z3, z4);
    }

    public final boolean a() {
        return this.f46322a;
    }

    public final boolean b() {
        return this.f46323b;
    }

    @l3.d
    public final b c(boolean z3, boolean z4) {
        return new b(z3, z4);
    }

    public final boolean e() {
        return this.f46322a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f46322a == bVar.f46322a && this.f46323b == bVar.f46323b;
    }

    public final boolean f() {
        return this.f46323b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z3 = this.f46322a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        boolean z4 = this.f46323b;
        return i4 + (z4 ? 1 : z4 ? 1 : 0);
    }

    @l3.d
    public String toString() {
        return "EnableState(canDisplay=" + this.f46322a + ", isEnable=" + this.f46323b + ")";
    }

    public b(boolean z3, boolean z4) {
        this.f46322a = z3;
        this.f46323b = z4;
    }

    public /* synthetic */ b(boolean z3, boolean z4, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? false : z4);
    }
}
