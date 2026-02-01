package com.harman.jbl.cd_biz_comm.wireless_tech.bleconn;

import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f38103a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f38104b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f38105c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38106d;

    public c(@l3.d String rxUuid, @l3.d String txUuid, @l3.d String rxTxServiceUuid, int i4) {
        F.p(rxUuid, "rxUuid");
        F.p(txUuid, "txUuid");
        F.p(rxTxServiceUuid, "rxTxServiceUuid");
        this.f38103a = rxUuid;
        this.f38104b = txUuid;
        this.f38105c = rxTxServiceUuid;
        this.f38106d = i4;
    }

    public static /* synthetic */ c f(c cVar, String str, String str2, String str3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = cVar.f38103a;
        }
        if ((i5 & 2) != 0) {
            str2 = cVar.f38104b;
        }
        if ((i5 & 4) != 0) {
            str3 = cVar.f38105c;
        }
        if ((i5 & 8) != 0) {
            i4 = cVar.f38106d;
        }
        return cVar.e(str, str2, str3, i4);
    }

    @l3.d
    public final String a() {
        return this.f38103a;
    }

    @l3.d
    public final String b() {
        return this.f38104b;
    }

    @l3.d
    public final String c() {
        return this.f38105c;
    }

    public final int d() {
        return this.f38106d;
    }

    @l3.d
    public final c e(@l3.d String rxUuid, @l3.d String txUuid, @l3.d String rxTxServiceUuid, int i4) {
        F.p(rxUuid, "rxUuid");
        F.p(txUuid, "txUuid");
        F.p(rxTxServiceUuid, "rxTxServiceUuid");
        return new c(rxUuid, txUuid, rxTxServiceUuid, i4);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return F.g(this.f38103a, cVar.f38103a) && F.g(this.f38104b, cVar.f38104b) && F.g(this.f38105c, cVar.f38105c) && this.f38106d == cVar.f38106d;
    }

    public final int g() {
        return this.f38106d;
    }

    @l3.d
    public final String h() {
        return this.f38105c;
    }

    public int hashCode() {
        return (((((this.f38103a.hashCode() * 31) + this.f38104b.hashCode()) * 31) + this.f38105c.hashCode()) * 31) + Integer.hashCode(this.f38106d);
    }

    @l3.d
    public final String i() {
        return this.f38103a;
    }

    @l3.d
    public final String j() {
        return this.f38104b;
    }

    @l3.d
    public String toString() {
        return "ConnectConfig(rxUuid=" + this.f38103a + ", txUuid=" + this.f38104b + ", rxTxServiceUuid=" + this.f38105c + ", maxMtu=" + this.f38106d + ")";
    }
}
