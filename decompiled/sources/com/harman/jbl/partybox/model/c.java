package com.harman.jbl.partybox.model;

import androidx.annotation.InterfaceC0578v;
import androidx.annotation.c0;
import com.harman.jbl.partybox.ui.djeffects.model.DjEffectToneId;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final DjEffectToneId f42049a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42050b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42051c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42052d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42053e;

    public c(@l3.d DjEffectToneId toneId, @c0 int i4, @InterfaceC0578v int i5, @InterfaceC0578v int i6, boolean z3) {
        F.p(toneId, "toneId");
        this.f42049a = toneId;
        this.f42050b = i4;
        this.f42051c = i5;
        this.f42052d = i6;
        this.f42053e = z3;
    }

    public static /* synthetic */ c g(c cVar, DjEffectToneId djEffectToneId, int i4, int i5, int i6, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            djEffectToneId = cVar.f42049a;
        }
        if ((i7 & 2) != 0) {
            i4 = cVar.f42050b;
        }
        int i8 = i4;
        if ((i7 & 4) != 0) {
            i5 = cVar.f42051c;
        }
        int i9 = i5;
        if ((i7 & 8) != 0) {
            i6 = cVar.f42052d;
        }
        int i10 = i6;
        if ((i7 & 16) != 0) {
            z3 = cVar.f42053e;
        }
        return cVar.f(djEffectToneId, i8, i9, i10, z3);
    }

    @l3.d
    public final DjEffectToneId a() {
        return this.f42049a;
    }

    public final int b() {
        return this.f42050b;
    }

    public final int c() {
        return this.f42051c;
    }

    public final int d() {
        return this.f42052d;
    }

    public final boolean e() {
        return this.f42053e;
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
        if (!F.g(c.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.model.PartyButton");
        c cVar = (c) obj;
        if (this.f42049a == cVar.f42049a && this.f42050b == cVar.f42050b) {
            return true;
        }
        return false;
    }

    @l3.d
    public final c f(@l3.d DjEffectToneId toneId, @c0 int i4, @InterfaceC0578v int i5, @InterfaceC0578v int i6, boolean z3) {
        F.p(toneId, "toneId");
        return new c(toneId, i4, i5, i6, z3);
    }

    public final int h() {
        return this.f42051c;
    }

    public int hashCode() {
        return (this.f42049a.hashCode() * 31) + this.f42050b;
    }

    public final int i() {
        return this.f42052d;
    }

    public final int j() {
        return this.f42050b;
    }

    public final boolean k() {
        return this.f42053e;
    }

    @l3.d
    public final DjEffectToneId l() {
        return this.f42049a;
    }

    public final void m(boolean z3) {
        this.f42053e = z3;
    }

    @l3.d
    public String toString() {
        return "PartyButton(toneId=" + this.f42049a + ", name=" + this.f42050b + ", background=" + this.f42051c + ", icon=" + this.f42052d + ", selected=" + this.f42053e + ")";
    }

    public /* synthetic */ c(DjEffectToneId djEffectToneId, int i4, int i5, int i6, boolean z3, int i7, C2197u c2197u) {
        this(djEffectToneId, i4, i5, i6, (i7 & 16) != 0 ? false : z3);
    }
}
