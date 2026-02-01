package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import kotlin.jvm.internal.F;
import kotlinx.coroutines.InterfaceC2350z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f38110a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.clj.fastble.data.b f38111b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final InterfaceC2350z<i> f38112c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38113d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final c f38114e;

    public e(@l3.d String uuid, @l3.d com.clj.fastble.data.b bd, @l3.d InterfaceC2350z<i> completer, int i4, @l3.d c config) {
        F.p(uuid, "uuid");
        F.p(bd, "bd");
        F.p(completer, "completer");
        F.p(config, "config");
        this.f38110a = uuid;
        this.f38111b = bd;
        this.f38112c = completer;
        this.f38113d = i4;
        this.f38114e = config;
    }

    public static /* synthetic */ e g(e eVar, String str, com.clj.fastble.data.b bVar, InterfaceC2350z interfaceC2350z, int i4, c cVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = eVar.f38110a;
        }
        if ((i5 & 2) != 0) {
            bVar = eVar.f38111b;
        }
        com.clj.fastble.data.b bVar2 = bVar;
        if ((i5 & 4) != 0) {
            interfaceC2350z = eVar.f38112c;
        }
        InterfaceC2350z interfaceC2350z2 = interfaceC2350z;
        if ((i5 & 8) != 0) {
            i4 = eVar.f38113d;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            cVar = eVar.f38114e;
        }
        return eVar.f(str, bVar2, interfaceC2350z2, i6, cVar);
    }

    @l3.d
    public final String a() {
        return this.f38110a;
    }

    @l3.d
    public final com.clj.fastble.data.b b() {
        return this.f38111b;
    }

    @l3.d
    public final InterfaceC2350z<i> c() {
        return this.f38112c;
    }

    public final int d() {
        return this.f38113d;
    }

    @l3.d
    public final c e() {
        return this.f38114e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return F.g(this.f38110a, eVar.f38110a) && F.g(this.f38111b, eVar.f38111b) && F.g(this.f38112c, eVar.f38112c) && this.f38113d == eVar.f38113d && F.g(this.f38114e, eVar.f38114e);
    }

    @l3.d
    public final e f(@l3.d String uuid, @l3.d com.clj.fastble.data.b bd, @l3.d InterfaceC2350z<i> completer, int i4, @l3.d c config) {
        F.p(uuid, "uuid");
        F.p(bd, "bd");
        F.p(completer, "completer");
        F.p(config, "config");
        return new e(uuid, bd, completer, i4, config);
    }

    @l3.d
    public final com.clj.fastble.data.b h() {
        return this.f38111b;
    }

    public int hashCode() {
        return (((((((this.f38110a.hashCode() * 31) + this.f38111b.hashCode()) * 31) + this.f38112c.hashCode()) * 31) + Integer.hashCode(this.f38113d)) * 31) + this.f38114e.hashCode();
    }

    @l3.d
    public final InterfaceC2350z<i> i() {
        return this.f38112c;
    }

    @l3.d
    public final c j() {
        return this.f38114e;
    }

    public final int k() {
        return this.f38113d;
    }

    @l3.d
    public final String l() {
        return this.f38110a;
    }

    @l3.d
    public String toString() {
        return "ConnectingModel(uuid=" + this.f38110a + ", bd=" + this.f38111b + ", completer=" + this.f38112c + ", retryIndex=" + this.f38113d + ", config=" + this.f38114e + ")";
    }
}
