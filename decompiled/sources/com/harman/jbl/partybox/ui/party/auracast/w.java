package com.harman.jbl.partybox.ui.party.auracast;

import com.harman.jbl.partybox.ui.party.auracast.define.EnumSelectDeviceTip;
import com.harman.sdk.device.HmDevice;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final EnumSelectDeviceTip f44879a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final HmDevice f44880b;

    public w(@l3.d EnumSelectDeviceTip enumSelectDeviceTip, @l3.d HmDevice device) {
        F.p(enumSelectDeviceTip, "enum");
        F.p(device, "device");
        this.f44879a = enumSelectDeviceTip;
        this.f44880b = device;
    }

    public static /* synthetic */ w d(w wVar, EnumSelectDeviceTip enumSelectDeviceTip, HmDevice hmDevice, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            enumSelectDeviceTip = wVar.f44879a;
        }
        if ((i4 & 2) != 0) {
            hmDevice = wVar.f44880b;
        }
        return wVar.c(enumSelectDeviceTip, hmDevice);
    }

    @l3.d
    public final EnumSelectDeviceTip a() {
        return this.f44879a;
    }

    @l3.d
    public final HmDevice b() {
        return this.f44880b;
    }

    @l3.d
    public final w c(@l3.d EnumSelectDeviceTip enumSelectDeviceTip, @l3.d HmDevice device) {
        F.p(enumSelectDeviceTip, "enum");
        F.p(device, "device");
        return new w(enumSelectDeviceTip, device);
    }

    @l3.d
    public final HmDevice e() {
        return this.f44880b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f44879a == wVar.f44879a && F.g(this.f44880b, wVar.f44880b);
    }

    @l3.d
    public final EnumSelectDeviceTip f() {
        return this.f44879a;
    }

    public int hashCode() {
        return (this.f44879a.hashCode() * 31) + this.f44880b.hashCode();
    }

    @l3.d
    public String toString() {
        return "BeanSelectDeviceTip(enum=" + this.f44879a + ", device=" + this.f44880b + ")";
    }
}
