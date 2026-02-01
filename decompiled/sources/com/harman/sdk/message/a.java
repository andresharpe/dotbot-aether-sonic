package com.harman.sdk.message;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f48337a;

    /* renamed from: b, reason: collision with root package name */
    @e
    private final BatteryInfo f48338b;

    /* renamed from: c, reason: collision with root package name */
    private final int f48339c;

    /* renamed from: d, reason: collision with root package name */
    private int f48340d;

    /* renamed from: e, reason: collision with root package name */
    private int f48341e;

    public a() {
        this(0, null, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ a g(a aVar, int i4, BatteryInfo batteryInfo, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = aVar.f48337a;
        }
        if ((i8 & 2) != 0) {
            batteryInfo = aVar.f48338b;
        }
        BatteryInfo batteryInfo2 = batteryInfo;
        if ((i8 & 4) != 0) {
            i5 = aVar.f48339c;
        }
        int i9 = i5;
        if ((i8 & 8) != 0) {
            i6 = aVar.f48340d;
        }
        int i10 = i6;
        if ((i8 & 16) != 0) {
            i7 = aVar.f48341e;
        }
        return aVar.f(i4, batteryInfo2, i9, i10, i7);
    }

    public final int a() {
        return this.f48337a;
    }

    @e
    public final BatteryInfo b() {
        return this.f48338b;
    }

    public final int c() {
        return this.f48339c;
    }

    public final int d() {
        return this.f48340d;
    }

    public final int e() {
        return this.f48341e;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48337a == aVar.f48337a && F.g(this.f48338b, aVar.f48338b) && this.f48339c == aVar.f48339c && this.f48340d == aVar.f48340d && this.f48341e == aVar.f48341e;
    }

    @d
    public final a f(int i4, @e BatteryInfo batteryInfo, int i5, int i6, int i7) {
        return new a(i4, batteryInfo, i5, i6, i7);
    }

    @e
    public final BatteryInfo h() {
        return this.f48338b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f48337a) * 31;
        BatteryInfo batteryInfo = this.f48338b;
        return ((((((hashCode + (batteryInfo == null ? 0 : batteryInfo.hashCode())) * 31) + Integer.hashCode(this.f48339c)) * 31) + Integer.hashCode(this.f48340d)) * 31) + Integer.hashCode(this.f48341e);
    }

    public final int i() {
        return this.f48340d;
    }

    public final int j() {
        return this.f48339c;
    }

    public final int k() {
        return this.f48337a;
    }

    public final int l() {
        return this.f48341e;
    }

    public final void m(int i4) {
        this.f48340d = i4;
    }

    public final void n(int i4) {
        this.f48341e = i4;
    }

    @d
    public String toString() {
        return "MicInfo(micIndex=" + this.f48337a + ", micBatteryInfo=" + this.f48338b + ", micGenVersion=" + this.f48339c + ", micColorId=" + this.f48340d + ", micVolume=" + this.f48341e + ")";
    }

    public a(int i4, @e BatteryInfo batteryInfo, int i5, int i6, int i7) {
        this.f48337a = i4;
        this.f48338b = batteryInfo;
        this.f48339c = i5;
        this.f48340d = i6;
        this.f48341e = i7;
    }

    public /* synthetic */ a(int i4, BatteryInfo batteryInfo, int i5, int i6, int i7, int i8, C2197u c2197u) {
        this((i8 & 1) != 0 ? 0 : i4, (i8 & 2) != 0 ? null : batteryInfo, (i8 & 4) != 0 ? 0 : i5, (i8 & 8) != 0 ? 0 : i6, (i8 & 16) != 0 ? 0 : i7);
    }
}
