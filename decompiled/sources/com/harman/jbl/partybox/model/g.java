package com.harman.jbl.partybox.model;

import android.content.Context;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.c0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f42063a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42064b;

    public g(@c0 int i4, @InterfaceC0578v int i5) {
        this.f42063a = i4;
        this.f42064b = i5;
    }

    public static /* synthetic */ g d(g gVar, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = gVar.f42063a;
        }
        if ((i6 & 2) != 0) {
            i5 = gVar.f42064b;
        }
        return gVar.c(i4, i5);
    }

    public final int a() {
        return this.f42063a;
    }

    public final int b() {
        return this.f42064b;
    }

    @l3.d
    public final g c(@c0 int i4, @InterfaceC0578v int i5) {
        return new g(i4, i5);
    }

    public final int e() {
        return this.f42063a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f42063a == gVar.f42063a && this.f42064b == gVar.f42064b;
    }

    public final int f() {
        return this.f42064b;
    }

    @l3.d
    public final String g(@l3.d Context ctx) {
        F.p(ctx, "ctx");
        String string = ctx.getString(this.f42063a);
        F.o(string, "getString(...)");
        return string;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f42063a) * 31) + Integer.hashCode(this.f42064b);
    }

    @l3.d
    public String toString() {
        return "TabPage(pageTitle=" + this.f42063a + ", tabDrawable=" + this.f42064b + ")";
    }
}
