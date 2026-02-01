package com.harman.jbl.partybox.ui.musiccontrol;

import com.harman.sdk.command.ReqPlayerInfoCommand;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.UsbStatus;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f44360a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44361b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final DeviceRole f44362c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final PartyConnectStatus f44363d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final UsbStatus f44364e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final MusicControlSettings f44365f;

    public g(int i4, int i5, @l3.d DeviceRole role, @l3.d PartyConnectStatus partyConnectStatus, @l3.d UsbStatus usbInsertedStatus, @l3.d MusicControlSettings musicControlSettings) {
        F.p(role, "role");
        F.p(partyConnectStatus, "partyConnectStatus");
        F.p(usbInsertedStatus, "usbInsertedStatus");
        F.p(musicControlSettings, "musicControlSettings");
        this.f44360a = i4;
        this.f44361b = i5;
        this.f44362c = role;
        this.f44363d = partyConnectStatus;
        this.f44364e = usbInsertedStatus;
        this.f44365f = musicControlSettings;
    }

    public static /* synthetic */ g h(g gVar, int i4, int i5, DeviceRole deviceRole, PartyConnectStatus partyConnectStatus, UsbStatus usbStatus, MusicControlSettings musicControlSettings, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = gVar.f44360a;
        }
        if ((i6 & 2) != 0) {
            i5 = gVar.f44361b;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            deviceRole = gVar.f44362c;
        }
        DeviceRole deviceRole2 = deviceRole;
        if ((i6 & 8) != 0) {
            partyConnectStatus = gVar.f44363d;
        }
        PartyConnectStatus partyConnectStatus2 = partyConnectStatus;
        if ((i6 & 16) != 0) {
            usbStatus = gVar.f44364e;
        }
        UsbStatus usbStatus2 = usbStatus;
        if ((i6 & 32) != 0) {
            musicControlSettings = gVar.f44365f;
        }
        return gVar.g(i4, i7, deviceRole2, partyConnectStatus2, usbStatus2, musicControlSettings);
    }

    public final int a() {
        return this.f44360a;
    }

    public final int b() {
        return this.f44361b;
    }

    @l3.d
    public final DeviceRole c() {
        return this.f44362c;
    }

    @l3.d
    public final PartyConnectStatus d() {
        return this.f44363d;
    }

    @l3.d
    public final UsbStatus e() {
        return this.f44364e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f44360a == gVar.f44360a && this.f44361b == gVar.f44361b && this.f44362c == gVar.f44362c && this.f44363d == gVar.f44363d && this.f44364e == gVar.f44364e && F.g(this.f44365f, gVar.f44365f);
    }

    @l3.d
    public final MusicControlSettings f() {
        return this.f44365f;
    }

    @l3.d
    public final g g(int i4, int i5, @l3.d DeviceRole role, @l3.d PartyConnectStatus partyConnectStatus, @l3.d UsbStatus usbInsertedStatus, @l3.d MusicControlSettings musicControlSettings) {
        F.p(role, "role");
        F.p(partyConnectStatus, "partyConnectStatus");
        F.p(usbInsertedStatus, "usbInsertedStatus");
        F.p(musicControlSettings, "musicControlSettings");
        return new g(i4, i5, role, partyConnectStatus, usbInsertedStatus, musicControlSettings);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f44360a) * 31) + Integer.hashCode(this.f44361b)) * 31) + this.f44362c.hashCode()) * 31) + this.f44363d.hashCode()) * 31) + this.f44364e.hashCode()) * 31) + this.f44365f.hashCode();
    }

    public final int i() {
        return this.f44360a;
    }

    @l3.d
    public final MusicControlSettings j() {
        return this.f44365f;
    }

    @l3.d
    public final PartyConnectStatus k() {
        return this.f44363d;
    }

    @l3.d
    public final DeviceRole l() {
        return this.f44362c;
    }

    public final int m() {
        return this.f44361b;
    }

    @l3.d
    public final UsbStatus n() {
        return this.f44364e;
    }

    public final boolean o() {
        if (this.f44360a == ReqPlayerInfoCommand.f47674L.c()) {
            return true;
        }
        return false;
    }

    @l3.d
    public String toString() {
        String str = "source[" + this.f44360a + "] toneShifter[" + this.f44361b + "] role[" + this.f44362c + "] connectStatus[" + this.f44363d + "] usbStatue[" + this.f44364e + "] music[" + this.f44365f + "] ";
        F.o(str, "toString(...)");
        return str;
    }

    public /* synthetic */ g(int i4, int i5, DeviceRole deviceRole, PartyConnectStatus partyConnectStatus, UsbStatus usbStatus, MusicControlSettings musicControlSettings, int i6, C2197u c2197u) {
        this(i4, (i6 & 2) != 0 ? 0 : i5, deviceRole, partyConnectStatus, usbStatus, musicControlSettings);
    }
}
