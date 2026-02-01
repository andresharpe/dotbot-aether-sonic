package com.harman.jbl.partybox.ui.help.ui;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final EnumGridLayoutType f43829a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final h f43830b;

    public f(@l3.d EnumGridLayoutType type, @l3.e h hVar) {
        F.p(type, "type");
        this.f43829a = type;
        this.f43830b = hVar;
    }

    public static /* synthetic */ f d(f fVar, EnumGridLayoutType enumGridLayoutType, h hVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            enumGridLayoutType = fVar.f43829a;
        }
        if ((i4 & 2) != 0) {
            hVar = fVar.f43830b;
        }
        return fVar.c(enumGridLayoutType, hVar);
    }

    @l3.d
    public final EnumGridLayoutType a() {
        return this.f43829a;
    }

    @l3.e
    public final h b() {
        return this.f43830b;
    }

    @l3.d
    public final f c(@l3.d EnumGridLayoutType type, @l3.e h hVar) {
        F.p(type, "type");
        return new f(type, hVar);
    }

    @l3.e
    public final h e() {
        return this.f43830b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f43829a == fVar.f43829a && F.g(this.f43830b, fVar.f43830b);
    }

    @l3.d
    public final EnumGridLayoutType f() {
        return this.f43829a;
    }

    public int hashCode() {
        int hashCode = this.f43829a.hashCode() * 31;
        h hVar = this.f43830b;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    @l3.d
    public String toString() {
        String str = "type[" + this.f43829a + "]data[" + this.f43830b + "]";
        F.o(str, "toString(...)");
        return str;
    }

    public /* synthetic */ f(EnumGridLayoutType enumGridLayoutType, h hVar, int i4, C2197u c2197u) {
        this(enumGridLayoutType, (i4 & 2) != 0 ? null : hVar);
    }
}
