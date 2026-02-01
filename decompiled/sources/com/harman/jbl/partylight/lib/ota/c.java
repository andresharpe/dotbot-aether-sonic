package com.harman.jbl.partylight.lib.ota;

import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f47254a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f47255b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f47256c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final PartyLightDevice f47257d;

    /* renamed from: e, reason: collision with root package name */
    private int f47258e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private BleUpdateStatus f47259f;

    public c(int i4, @l3.d String devName, @l3.d String newVersion, @l3.d PartyLightDevice device, int i5, @l3.d BleUpdateStatus status) {
        F.p(devName, "devName");
        F.p(newVersion, "newVersion");
        F.p(device, "device");
        F.p(status, "status");
        this.f47254a = i4;
        this.f47255b = devName;
        this.f47256c = newVersion;
        this.f47257d = device;
        this.f47258e = i5;
        this.f47259f = status;
    }

    public static /* synthetic */ c h(c cVar, int i4, String str, String str2, PartyLightDevice partyLightDevice, int i5, BleUpdateStatus bleUpdateStatus, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = cVar.f47254a;
        }
        if ((i6 & 2) != 0) {
            str = cVar.f47255b;
        }
        String str3 = str;
        if ((i6 & 4) != 0) {
            str2 = cVar.f47256c;
        }
        String str4 = str2;
        if ((i6 & 8) != 0) {
            partyLightDevice = cVar.f47257d;
        }
        PartyLightDevice partyLightDevice2 = partyLightDevice;
        if ((i6 & 16) != 0) {
            i5 = cVar.f47258e;
        }
        int i7 = i5;
        if ((i6 & 32) != 0) {
            bleUpdateStatus = cVar.f47259f;
        }
        return cVar.g(i4, str3, str4, partyLightDevice2, i7, bleUpdateStatus);
    }

    public final int a() {
        return this.f47254a;
    }

    @l3.d
    public final String b() {
        return this.f47255b;
    }

    @l3.d
    public final String c() {
        return this.f47256c;
    }

    @l3.d
    public final PartyLightDevice d() {
        return this.f47257d;
    }

    public final int e() {
        return this.f47258e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f47254a == cVar.f47254a && F.g(this.f47255b, cVar.f47255b) && F.g(this.f47256c, cVar.f47256c) && F.g(this.f47257d, cVar.f47257d) && this.f47258e == cVar.f47258e && this.f47259f == cVar.f47259f;
    }

    @l3.d
    public final BleUpdateStatus f() {
        return this.f47259f;
    }

    @l3.d
    public final c g(int i4, @l3.d String devName, @l3.d String newVersion, @l3.d PartyLightDevice device, int i5, @l3.d BleUpdateStatus status) {
        F.p(devName, "devName");
        F.p(newVersion, "newVersion");
        F.p(device, "device");
        F.p(status, "status");
        return new c(i4, devName, newVersion, device, i5, status);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f47254a) * 31) + this.f47255b.hashCode()) * 31) + this.f47256c.hashCode()) * 31) + this.f47257d.hashCode()) * 31) + Integer.hashCode(this.f47258e)) * 31) + this.f47259f.hashCode();
    }

    @l3.d
    public final String i() {
        return this.f47255b;
    }

    public final int j() {
        return this.f47254a;
    }

    @l3.d
    public final PartyLightDevice k() {
        return this.f47257d;
    }

    @l3.d
    public final String l() {
        return this.f47256c;
    }

    public final int m() {
        return this.f47258e;
    }

    @l3.d
    public final BleUpdateStatus n() {
        return this.f47259f;
    }

    public final void o(int i4) {
        this.f47258e = i4;
    }

    public final void p(@l3.d BleUpdateStatus bleUpdateStatus) {
        F.p(bleUpdateStatus, "<set-?>");
        this.f47259f = bleUpdateStatus;
    }

    @l3.d
    public String toString() {
        return "BleOtaListItem(devPicRes=" + this.f47254a + ", devName=" + this.f47255b + ", newVersion=" + this.f47256c + ", device=" + this.f47257d + ", otaProgress=" + this.f47258e + ", status=" + this.f47259f + ")";
    }

    public /* synthetic */ c(int i4, String str, String str2, PartyLightDevice partyLightDevice, int i5, BleUpdateStatus bleUpdateStatus, int i6, C2197u c2197u) {
        this((i6 & 1) != 0 ? 0 : i4, str, str2, partyLightDevice, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? BleUpdateStatus.Success : bleUpdateStatus);
    }
}
