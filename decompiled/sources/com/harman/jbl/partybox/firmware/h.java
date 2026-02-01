package com.harman.jbl.partybox.firmware;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    @l3.e
    private final String f40552a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("points")
    @l3.e
    private final List<String> f40553b;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h d(h hVar, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = hVar.f40552a;
        }
        if ((i4 & 2) != 0) {
            list = hVar.f40553b;
        }
        return hVar.c(str, list);
    }

    @l3.e
    public final String a() {
        return this.f40552a;
    }

    @l3.e
    public final List<String> b() {
        return this.f40553b;
    }

    @l3.d
    public final h c(@l3.e String str, @l3.e List<String> list) {
        return new h(str, list);
    }

    @l3.e
    public final List<String> e() {
        return this.f40553b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return F.g(this.f40552a, hVar.f40552a) && F.g(this.f40553b, hVar.f40553b);
    }

    @l3.e
    public final String f() {
        return this.f40552a;
    }

    public int hashCode() {
        String str = this.f40552a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f40553b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @l3.d
    public String toString() {
        return "WhatsNew(title=" + this.f40552a + ", points=" + this.f40553b + ")";
    }

    public h(@l3.e String str, @l3.e List<String> list) {
        this.f40552a = str;
        this.f40553b = list;
    }

    public /* synthetic */ h(String str, List list, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : list);
    }
}
