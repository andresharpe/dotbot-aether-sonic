package com.harman.jbl.partybox.ui.help.business;

import com.google.gson.annotations.SerializedName;
import com.harman.jbl.partybox.ui.help.ui.h;
import java.util.List;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("productList")
    @e
    private final List<h> f43808a;

    public a(@e List<h> list) {
        this.f43808a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a c(a aVar, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = aVar.f43808a;
        }
        return aVar.b(list);
    }

    @e
    public final List<h> a() {
        return this.f43808a;
    }

    @d
    public final a b(@e List<h> list) {
        return new a(list);
    }

    @e
    public final List<h> d() {
        return this.f43808a;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && F.g(this.f43808a, ((a) obj).f43808a);
    }

    public int hashCode() {
        List<h> list = this.f43808a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @d
    public String toString() {
        return "AddNewProductBean(productList=" + this.f43808a + ")";
    }
}
