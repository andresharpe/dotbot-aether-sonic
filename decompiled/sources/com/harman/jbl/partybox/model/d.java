package com.harman.jbl.partybox.model;

import com.google.gson.annotations.SerializedName;
import com.harman.sdk.message.AdvancedPresetEQPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("displayName")
    @l3.e
    private String f42054a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("categoryId")
    @l3.d
    private String f42055b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("params")
    @l3.d
    private ArrayList<AdvancedPresetEQPayload.Parameter> f42056c;

    public d() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d e(d dVar, String str, String str2, ArrayList arrayList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dVar.f42054a;
        }
        if ((i4 & 2) != 0) {
            str2 = dVar.f42055b;
        }
        if ((i4 & 4) != 0) {
            arrayList = dVar.f42056c;
        }
        return dVar.d(str, str2, arrayList);
    }

    @l3.e
    public final String a() {
        return this.f42054a;
    }

    @l3.d
    public final String b() {
        return this.f42055b;
    }

    @l3.d
    public final ArrayList<AdvancedPresetEQPayload.Parameter> c() {
        return this.f42056c;
    }

    @l3.d
    public final d d(@l3.e String str, @l3.d String categoryId, @l3.d ArrayList<AdvancedPresetEQPayload.Parameter> params) {
        F.p(categoryId, "categoryId");
        F.p(params, "params");
        return new d(str, categoryId, params);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return F.g(this.f42054a, dVar.f42054a) && F.g(this.f42055b, dVar.f42055b) && F.g(this.f42056c, dVar.f42056c);
    }

    @l3.d
    public final String f() {
        return this.f42055b;
    }

    @l3.e
    public final String g() {
        return this.f42054a;
    }

    @l3.d
    public final ArrayList<AdvancedPresetEQPayload.Parameter> h() {
        return this.f42056c;
    }

    public int hashCode() {
        String str = this.f42054a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f42055b.hashCode()) * 31) + this.f42056c.hashCode();
    }

    public final void i(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f42055b = str;
    }

    public final void j(@l3.e String str) {
        this.f42054a = str;
    }

    public final void k(@l3.d ArrayList<AdvancedPresetEQPayload.Parameter> arrayList) {
        F.p(arrayList, "<set-?>");
        this.f42056c = arrayList;
    }

    @l3.d
    public String toString() {
        return "PresetEQValueModel(displayName=" + this.f42054a + ", categoryId=" + this.f42055b + ", params=" + this.f42056c + ")";
    }

    public d(@l3.e String str, @l3.d String categoryId, @l3.d ArrayList<AdvancedPresetEQPayload.Parameter> params) {
        F.p(categoryId, "categoryId");
        F.p(params, "params");
        this.f42054a = str;
        this.f42055b = categoryId;
        this.f42056c = params;
    }

    public /* synthetic */ d(String str, String str2, ArrayList arrayList, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? "SIGNATURE" : str2, (i4 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
