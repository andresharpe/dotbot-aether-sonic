package com.harman.jbl.partybox.firmware;

import N0.a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("pid")
    @l3.e
    private final String f40542a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName(a.C0015a.f1688b)
    @l3.e
    private final String f40543b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("firmware")
    @l3.e
    private final b f40544c;

    public e() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ e e(e eVar, String str, String str2, b bVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = eVar.f40542a;
        }
        if ((i4 & 2) != 0) {
            str2 = eVar.f40543b;
        }
        if ((i4 & 4) != 0) {
            bVar = eVar.f40544c;
        }
        return eVar.d(str, str2, bVar);
    }

    @l3.e
    public final String a() {
        return this.f40542a;
    }

    @l3.e
    public final String b() {
        return this.f40543b;
    }

    @l3.e
    public final b c() {
        return this.f40544c;
    }

    @l3.d
    public final e d(@l3.e String str, @l3.e String str2, @l3.e b bVar) {
        return new e(str, str2, bVar);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return F.g(this.f40542a, eVar.f40542a) && F.g(this.f40543b, eVar.f40543b) && F.g(this.f40544c, eVar.f40544c);
    }

    @l3.e
    public final String f() {
        return this.f40543b;
    }

    @l3.e
    public final b g() {
        return this.f40544c;
    }

    @l3.e
    public final String h() {
        return this.f40542a;
    }

    public int hashCode() {
        String str = this.f40542a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40543b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.f40544c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final void i(@l3.d String jsonString) {
        F.p(jsonString, "jsonString");
        b bVar = this.f40544c;
        if (bVar != null) {
            bVar.n(jsonString);
        }
    }

    @l3.d
    public String toString() {
        String str = "pid[" + this.f40542a + "]\ndeviceName[" + this.f40543b + "]\nfirmware[\n" + this.f40544c + "]\n";
        F.o(str, "toString(...)");
        return str;
    }

    public e(@l3.e String str, @l3.e String str2, @l3.e b bVar) {
        this.f40542a = str;
        this.f40543b = str2;
        this.f40544c = bVar;
    }

    public /* synthetic */ e(String str, String str2, b bVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : bVar);
    }
}
