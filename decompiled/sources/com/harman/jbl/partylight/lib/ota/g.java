package com.harman.jbl.partylight.lib.ota;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f47277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47278b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47279c;

    /* renamed from: d, reason: collision with root package name */
    private final int f47280d;

    /* renamed from: e, reason: collision with root package name */
    private final int f47281e;

    public g(@l3.d String versionString, int i4, int i5, int i6, int i7) {
        F.p(versionString, "versionString");
        this.f47277a = versionString;
        this.f47278b = i4;
        this.f47279c = i5;
        this.f47280d = i6;
        this.f47281e = i7;
    }

    public static /* synthetic */ g g(g gVar, String str, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = gVar.f47277a;
        }
        if ((i8 & 2) != 0) {
            i4 = gVar.f47278b;
        }
        int i9 = i4;
        if ((i8 & 4) != 0) {
            i5 = gVar.f47279c;
        }
        int i10 = i5;
        if ((i8 & 8) != 0) {
            i6 = gVar.f47280d;
        }
        int i11 = i6;
        if ((i8 & 16) != 0) {
            i7 = gVar.f47281e;
        }
        return gVar.f(str, i9, i10, i11, i7);
    }

    @l3.d
    public final String a() {
        return this.f47277a;
    }

    public final int b() {
        return this.f47278b;
    }

    public final int c() {
        return this.f47279c;
    }

    public final int d() {
        return this.f47280d;
    }

    public final int e() {
        return this.f47281e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return F.g(this.f47277a, gVar.f47277a) && this.f47278b == gVar.f47278b && this.f47279c == gVar.f47279c && this.f47280d == gVar.f47280d && this.f47281e == gVar.f47281e;
    }

    @l3.d
    public final g f(@l3.d String versionString, int i4, int i5, int i6, int i7) {
        F.p(versionString, "versionString");
        return new g(versionString, i4, i5, i6, i7);
    }

    public final int h() {
        return this.f47281e;
    }

    public int hashCode() {
        return (((((((this.f47277a.hashCode() * 31) + Integer.hashCode(this.f47278b)) * 31) + Integer.hashCode(this.f47279c)) * 31) + Integer.hashCode(this.f47280d)) * 31) + Integer.hashCode(this.f47281e);
    }

    public final int i() {
        return this.f47278b;
    }

    public final int j() {
        return this.f47279c;
    }

    public final int k() {
        return this.f47280d;
    }

    @l3.d
    public final String l() {
        return this.f47277a;
    }

    public final boolean m() {
        if (this.f47278b == 0 && this.f47279c == 0 && this.f47280d == 0) {
            return false;
        }
        return true;
    }

    @l3.d
    public final List<Integer> n() {
        List<Integer> O3;
        O3 = CollectionsKt__CollectionsKt.O(Integer.valueOf(this.f47278b), Integer.valueOf(this.f47279c), Integer.valueOf(this.f47280d));
        return O3;
    }

    @l3.d
    public String toString() {
        return "DfuInfo(versionString=" + this.f47277a + ", major=" + this.f47278b + ", minor=" + this.f47279c + ", revision=" + this.f47280d + ", breakPoint=" + this.f47281e + ")";
    }
}
