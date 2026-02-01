package com.harman.jbl.partylight.lib;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f46568a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f46569b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f46570c;

    public e(@l3.d String id, @l3.d String sn, @l3.d String pid) {
        F.p(id, "id");
        F.p(sn, "sn");
        F.p(pid, "pid");
        this.f46568a = id;
        this.f46569b = sn;
        this.f46570c = pid;
    }

    public static /* synthetic */ e e(e eVar, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = eVar.f46568a;
        }
        if ((i4 & 2) != 0) {
            str2 = eVar.f46569b;
        }
        if ((i4 & 4) != 0) {
            str3 = eVar.f46570c;
        }
        return eVar.d(str, str2, str3);
    }

    @l3.d
    public final String a() {
        return this.f46568a;
    }

    @l3.d
    public final String b() {
        return this.f46569b;
    }

    @l3.d
    public final String c() {
        return this.f46570c;
    }

    @l3.d
    public final e d(@l3.d String id, @l3.d String sn, @l3.d String pid) {
        F.p(id, "id");
        F.p(sn, "sn");
        F.p(pid, "pid");
        return new e(id, sn, pid);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return F.g(this.f46568a, eVar.f46568a) && F.g(this.f46569b, eVar.f46569b) && F.g(this.f46570c, eVar.f46570c);
    }

    @l3.d
    public final String f() {
        return this.f46568a;
    }

    @l3.d
    public final String g() {
        return this.f46570c;
    }

    @l3.d
    public final String h() {
        return this.f46569b;
    }

    public int hashCode() {
        return (((this.f46568a.hashCode() * 31) + this.f46569b.hashCode()) * 31) + this.f46570c.hashCode();
    }

    @l3.d
    public String toString() {
        return "PLDevInfo(id=" + this.f46568a + ", sn=" + this.f46569b + ", pid=" + this.f46570c + ")";
    }
}
