package com.harman.jbl.partybox.ui.help.ui;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("pid")
    @l3.e
    private final String f43832a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("pName")
    @l3.e
    private final String f43833b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private String f43834c;

    public h(@l3.e String str, @l3.e String str2, @l3.e String str3) {
        this.f43832a = str;
        this.f43833b = str2;
        this.f43834c = str3;
    }

    public static /* synthetic */ h e(h hVar, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = hVar.f43832a;
        }
        if ((i4 & 2) != 0) {
            str2 = hVar.f43833b;
        }
        if ((i4 & 4) != 0) {
            str3 = hVar.f43834c;
        }
        return hVar.d(str, str2, str3);
    }

    @l3.e
    public final String a() {
        return this.f43832a;
    }

    @l3.e
    public final String b() {
        return this.f43833b;
    }

    @l3.e
    public final String c() {
        return this.f43834c;
    }

    @l3.d
    public final h d(@l3.e String str, @l3.e String str2, @l3.e String str3) {
        return new h(str, str2, str3);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return F.g(this.f43832a, hVar.f43832a) && F.g(this.f43833b, hVar.f43833b) && F.g(this.f43834c, hVar.f43834c);
    }

    @l3.e
    public final String f() {
        return this.f43833b;
    }

    @l3.e
    public final String g() {
        return this.f43832a;
    }

    @l3.e
    public final String h() {
        return this.f43834c;
    }

    public int hashCode() {
        String str = this.f43832a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f43833b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43834c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void i(@l3.e String str) {
        this.f43834c = str;
    }

    @l3.d
    public String toString() {
        String str = "pid[" + this.f43832a + "]pName[" + this.f43833b + "]qsgLink[" + this.f43834c + "]";
        F.o(str, "toString(...)");
        return str;
    }
}
