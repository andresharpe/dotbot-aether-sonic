package com.harman.jbl.partybox.model;

import N0.a;
import com.google.firebase.messaging.C1821f;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName(a.C0015a.f1688b)
    @l3.e
    private String f42039a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("description")
    @l3.e
    private String f42040b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("isSelected")
    private boolean f42041c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("image")
    @l3.e
    private String f42042d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName("homeImage")
    @l3.e
    private String f42043e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("defaultImage")
    @l3.e
    private String f42044f;

    /* renamed from: g, reason: collision with root package name */
    @SerializedName("selectedImage")
    @l3.e
    private String f42045g;

    /* renamed from: h, reason: collision with root package name */
    @SerializedName("theme2Image")
    @l3.e
    private String f42046h;

    /* renamed from: i, reason: collision with root package name */
    @SerializedName(C1821f.C0339f.a.f37006R)
    @l3.e
    private d f42047i;

    @l3.e
    public final d a() {
        return this.f42047i;
    }

    @l3.e
    public final String b() {
        return this.f42044f;
    }

    @l3.e
    public final String c() {
        return this.f42040b;
    }

    @l3.e
    public final String d() {
        return this.f42043e;
    }

    @l3.e
    public final String e() {
        return this.f42042d;
    }

    public boolean equals(@l3.e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!F.g(a.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.model.EQPresetCategory");
        if (F.g(this.f42039a, ((a) obj).f42039a)) {
            return true;
        }
        return false;
    }

    @l3.e
    public final String f() {
        return this.f42039a;
    }

    @l3.e
    public final String g() {
        return this.f42045g;
    }

    @l3.e
    public final String h() {
        return this.f42046h;
    }

    public int hashCode() {
        String str = this.f42039a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean i() {
        return this.f42041c;
    }

    public final void j(@l3.e d dVar) {
        this.f42047i = dVar;
    }

    public final void k(@l3.e String str) {
        this.f42044f = str;
    }

    public final void l(@l3.e String str) {
        this.f42040b = str;
    }

    public final void m(@l3.e String str) {
        this.f42043e = str;
    }

    public final void n(@l3.e String str) {
        this.f42042d = str;
    }

    public final void o(@l3.e String str) {
        this.f42039a = str;
    }

    public final void p(boolean z3) {
        this.f42041c = z3;
    }

    public final void q(@l3.e String str) {
        this.f42045g = str;
    }

    public final void r(@l3.e String str) {
        this.f42046h = str;
    }

    @l3.d
    public String toString() {
        return "EQPresetCategory(name=" + this.f42039a + ", description=" + this.f42040b + ", isSelected=" + this.f42041c + ", image=" + this.f42042d + ", homeImage=" + this.f42043e + ", defaultImage=" + this.f42044f + ", selectedImage=" + this.f42045g + ", theme2Image=" + this.f42046h + ", data=" + this.f42047i + ")";
    }
}
