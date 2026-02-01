package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38152a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f38153b;

    public i(boolean z3, @l3.d String msg) {
        F.p(msg, "msg");
        this.f38152a = z3;
        this.f38153b = msg;
    }

    public static /* synthetic */ i d(i iVar, boolean z3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = iVar.f38152a;
        }
        if ((i4 & 2) != 0) {
            str = iVar.f38153b;
        }
        return iVar.c(z3, str);
    }

    public final boolean a() {
        return this.f38152a;
    }

    @l3.d
    public final String b() {
        return this.f38153b;
    }

    @l3.d
    public final i c(boolean z3, @l3.d String msg) {
        F.p(msg, "msg");
        return new i(z3, msg);
    }

    @l3.d
    public final String e() {
        return this.f38153b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f38152a == iVar.f38152a && F.g(this.f38153b, iVar.f38153b);
    }

    public final boolean f() {
        return this.f38152a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z3 = this.f38152a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        return (r02 * 31) + this.f38153b.hashCode();
    }

    @l3.d
    public String toString() {
        return "Result(isOk=" + this.f38152a + ", msg=" + this.f38153b + ")";
    }
}
