package com.harman.jbl.partylight.lib.dashboard;

import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f46398a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f46399b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46400c;

    public q() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ q e(q qVar, boolean z3, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = qVar.f46398a;
        }
        if ((i4 & 2) != 0) {
            z4 = qVar.f46399b;
        }
        if ((i4 & 4) != 0) {
            z5 = qVar.f46400c;
        }
        return qVar.d(z3, z4, z5);
    }

    public final boolean a() {
        return this.f46398a;
    }

    public final boolean b() {
        return this.f46399b;
    }

    public final boolean c() {
        return this.f46400c;
    }

    @l3.d
    public final q d(boolean z3, boolean z4, boolean z5) {
        return new q(z3, z4, z5);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f46398a == qVar.f46398a && this.f46399b == qVar.f46399b && this.f46400c == qVar.f46400c;
    }

    public final boolean f() {
        return this.f46398a;
    }

    public final boolean g() {
        return this.f46399b;
    }

    public final boolean h() {
        return this.f46400c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z3 = this.f46398a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        ?? r22 = this.f46399b;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f46400c;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    @l3.d
    public String toString() {
        return "StickStageState(canDisplay=" + this.f46398a + ", isEnable=" + this.f46399b + ", isStaged=" + this.f46400c + ")";
    }

    public q(boolean z3, boolean z4, boolean z5) {
        this.f46398a = z3;
        this.f46399b = z4;
        this.f46400c = z5;
    }

    public /* synthetic */ q(boolean z3, boolean z4, boolean z5, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? false : z4, (i4 & 4) != 0 ? false : z5);
    }
}
