package com.harman.jbl.partybox.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("eqList")
    @l3.d
    private List<a> f42048a = new ArrayList();

    @l3.d
    public final List<a> a() {
        return this.f42048a;
    }

    public final void b(@l3.d List<a> list) {
        F.p(list, "<set-?>");
        this.f42048a = list;
    }

    @l3.d
    public String toString() {
        return "SupportedEQList(eqList=" + this.f42048a + ")";
    }
}
