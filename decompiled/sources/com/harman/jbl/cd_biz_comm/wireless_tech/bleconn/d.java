package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f38107a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.clj.fastble.data.b f38108b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final c f38109c;

    public d(@l3.d String uuid, @l3.d com.clj.fastble.data.b bd, @l3.d c config) {
        F.p(uuid, "uuid");
        F.p(bd, "bd");
        F.p(config, "config");
        this.f38107a = uuid;
        this.f38108b = bd;
        this.f38109c = config;
    }

    public static /* synthetic */ d e(d dVar, String str, com.clj.fastble.data.b bVar, c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dVar.f38107a;
        }
        if ((i4 & 2) != 0) {
            bVar = dVar.f38108b;
        }
        if ((i4 & 4) != 0) {
            cVar = dVar.f38109c;
        }
        return dVar.d(str, bVar, cVar);
    }

    @l3.d
    public final String a() {
        return this.f38107a;
    }

    @l3.d
    public final com.clj.fastble.data.b b() {
        return this.f38108b;
    }

    @l3.d
    public final c c() {
        return this.f38109c;
    }

    @l3.d
    public final d d(@l3.d String uuid, @l3.d com.clj.fastble.data.b bd, @l3.d c config) {
        F.p(uuid, "uuid");
        F.p(bd, "bd");
        F.p(config, "config");
        return new d(uuid, bd, config);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return F.g(this.f38107a, dVar.f38107a) && F.g(this.f38108b, dVar.f38108b) && F.g(this.f38109c, dVar.f38109c);
    }

    @l3.d
    public final com.clj.fastble.data.b f() {
        return this.f38108b;
    }

    @l3.d
    public final c g() {
        return this.f38109c;
    }

    @l3.d
    public final String h() {
        return this.f38107a;
    }

    public int hashCode() {
        return (((this.f38107a.hashCode() * 31) + this.f38108b.hashCode()) * 31) + this.f38109c.hashCode();
    }

    @l3.d
    public String toString() {
        return "ConnectedModel(uuid=" + this.f38107a + ", bd=" + this.f38108b + ", config=" + this.f38109c + ")";
    }
}
