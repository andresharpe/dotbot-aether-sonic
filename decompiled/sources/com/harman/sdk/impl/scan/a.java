package com.harman.sdk.impl.scan;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f48040a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f48041b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final Integer f48042c;

    public a(boolean z3, boolean z4, @l3.e Integer num) {
        this.f48040a = z3;
        this.f48041b = z4;
        this.f48042c = num;
    }

    public static /* synthetic */ a e(a aVar, boolean z3, boolean z4, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = aVar.f48040a;
        }
        if ((i4 & 2) != 0) {
            z4 = aVar.f48041b;
        }
        if ((i4 & 4) != 0) {
            num = aVar.f48042c;
        }
        return aVar.d(z3, z4, num);
    }

    public final boolean a() {
        return this.f48040a;
    }

    public final boolean b() {
        return this.f48041b;
    }

    @l3.e
    public final Integer c() {
        return this.f48042c;
    }

    @l3.d
    public final a d(boolean z3, boolean z4, @l3.e Integer num) {
        return new a(z3, z4, num);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48040a == aVar.f48040a && this.f48041b == aVar.f48041b && F.g(this.f48042c, aVar.f48042c);
    }

    @l3.e
    public final Integer f() {
        return this.f48042c;
    }

    public final boolean g() {
        return this.f48040a;
    }

    public final boolean h() {
        return this.f48041b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z3 = this.f48040a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        boolean z4 = this.f48041b;
        int i5 = (i4 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        Integer num = this.f48042c;
        return i5 + (num == null ? 0 : num.hashCode());
    }

    @l3.d
    public String toString() {
        return "BatteryInfo(batteryMissing=" + this.f48040a + ", isCharging=" + this.f48041b + ", batteryLevel=" + this.f48042c + ")";
    }
}
