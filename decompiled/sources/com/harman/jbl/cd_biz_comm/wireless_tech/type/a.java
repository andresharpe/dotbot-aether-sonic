package com.harman.jbl.cd_biz_comm.wireless_tech.type;

import kotlin.jvm.internal.C2197u;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38225a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38226b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38227c;

    public a() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ a e(a aVar, boolean z3, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z3 = aVar.f38225a;
        }
        if ((i5 & 2) != 0) {
            i4 = aVar.f38226b;
        }
        if ((i5 & 4) != 0) {
            z4 = aVar.f38227c;
        }
        return aVar.d(z3, i4, z4);
    }

    public final boolean a() {
        return this.f38225a;
    }

    public final int b() {
        return this.f38226b;
    }

    public final boolean c() {
        return this.f38227c;
    }

    @l3.d
    public final a d(boolean z3, int i4, boolean z4) {
        return new a(z3, i4, z4);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38225a == aVar.f38225a && this.f38226b == aVar.f38226b && this.f38227c == aVar.f38227c;
    }

    public final int f() {
        return this.f38226b;
    }

    public final boolean g() {
        return this.f38225a;
    }

    public final boolean h() {
        return this.f38227c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z3 = this.f38225a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + Integer.hashCode(this.f38226b)) * 31;
        boolean z4 = this.f38227c;
        return hashCode + (z4 ? 1 : z4 ? 1 : 0);
    }

    @l3.d
    public String toString() {
        return "BatteryInfo(withoutBattery=" + this.f38225a + ", batteryAmount=" + this.f38226b + ", isCharging=" + this.f38227c + ")";
    }

    public a(boolean z3, int i4, boolean z4) {
        this.f38225a = z3;
        this.f38226b = i4;
        this.f38227c = z4;
    }

    public /* synthetic */ a(boolean z3, int i4, boolean z4, int i5, C2197u c2197u) {
        this((i5 & 1) != 0 ? false : z3, (i5 & 2) != 0 ? 0 : i4, (i5 & 4) != 0 ? false : z4);
    }
}
