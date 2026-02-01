package com.harman.jbl.partybox.ui.main;

import com.harman.sdk.message.BatteryInfo;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f44110a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final BatteryInfo f44111b;

    public a(@l3.d String deviceMac, @l3.d BatteryInfo batteryInfo) {
        F.p(deviceMac, "deviceMac");
        F.p(batteryInfo, "batteryInfo");
        this.f44110a = deviceMac;
        this.f44111b = batteryInfo;
    }

    public static /* synthetic */ a d(a aVar, String str, BatteryInfo batteryInfo, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = aVar.f44110a;
        }
        if ((i4 & 2) != 0) {
            batteryInfo = aVar.f44111b;
        }
        return aVar.c(str, batteryInfo);
    }

    @l3.d
    public final String a() {
        return this.f44110a;
    }

    @l3.d
    public final BatteryInfo b() {
        return this.f44111b;
    }

    @l3.d
    public final a c(@l3.d String deviceMac, @l3.d BatteryInfo batteryInfo) {
        F.p(deviceMac, "deviceMac");
        F.p(batteryInfo, "batteryInfo");
        return new a(deviceMac, batteryInfo);
    }

    @l3.d
    public final BatteryInfo e() {
        return this.f44111b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return F.g(this.f44110a, aVar.f44110a) && F.g(this.f44111b, aVar.f44111b);
    }

    @l3.d
    public final String f() {
        return this.f44110a;
    }

    public int hashCode() {
        return (this.f44110a.hashCode() * 31) + this.f44111b.hashCode();
    }

    @l3.d
    public String toString() {
        return "DeviceBatteryInfo(deviceMac=" + this.f44110a + ", batteryInfo=" + this.f44111b + ")";
    }
}
