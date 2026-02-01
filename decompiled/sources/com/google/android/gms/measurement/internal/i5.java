package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1362b6;
import com.google.android.gms.internal.measurement.C1477q1;
import com.google.android.gms.internal.measurement.C1493s2;
import com.google.android.gms.internal.measurement.C1532x1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i5 extends h5 {

    /* renamed from: g, reason: collision with root package name */
    private final C1532x1 f30795g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C1611b f30796h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(C1611b c1611b, String str, int i4, C1532x1 c1532x1) {
        super(str, i4);
        this.f30796h = c1611b;
        this.f30795g = c1532x1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.h5
    public final int a() {
        return this.f30795g.A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.h5
    public final boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.h5
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l4, Long l5, C1493s2 c1493s2, boolean z3) {
        Object[] objArr;
        Object obj;
        C1362b6.b();
        boolean z4 = this.f30796h.f31060a.x().z(this.f30779a, C1643g1.f30694W);
        boolean G3 = this.f30795g.G();
        boolean H3 = this.f30795g.H();
        boolean I3 = this.f30795g.I();
        if (G3 || H3 || I3) {
            objArr = true;
        } else {
            objArr = false;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z3 && objArr == false) {
            C1708r1 t3 = this.f30796h.f31060a.b().t();
            Integer valueOf = Integer.valueOf(this.f30780b);
            if (this.f30795g.J()) {
                num = Integer.valueOf(this.f30795g.A());
            }
            t3.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        C1477q1 B3 = this.f30795g.B();
        boolean G4 = B3.G();
        if (c1493s2.Q()) {
            if (!B3.I()) {
                this.f30796h.f31060a.b().u().b("No number filter for long property. property", this.f30796h.f31060a.B().f(c1493s2.F()));
            } else {
                bool = h5.j(h5.h(c1493s2.B(), B3.C()), G4);
            }
        } else if (c1493s2.P()) {
            if (!B3.I()) {
                this.f30796h.f31060a.b().u().b("No number filter for double property. property", this.f30796h.f31060a.B().f(c1493s2.F()));
            } else {
                bool = h5.j(h5.g(c1493s2.A(), B3.C()), G4);
            }
        } else if (c1493s2.S()) {
            if (!B3.K()) {
                if (!B3.I()) {
                    this.f30796h.f31060a.b().u().b("No string or number filter defined. property", this.f30796h.f31060a.B().f(c1493s2.F()));
                } else if (O4.L(c1493s2.G())) {
                    bool = h5.j(h5.i(c1493s2.G(), B3.C()), G4);
                } else {
                    this.f30796h.f31060a.b().u().c("Invalid user property value for Numeric number filter. property, value", this.f30796h.f31060a.B().f(c1493s2.F()), c1493s2.G());
                }
            } else {
                bool = h5.j(h5.f(c1493s2.G(), B3.D(), this.f30796h.f31060a.b()), G4);
            }
        } else {
            this.f30796h.f31060a.b().u().b("User property has no value, property", this.f30796h.f31060a.B().f(c1493s2.F()));
        }
        C1708r1 t4 = this.f30796h.f31060a.b().t();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        t4.b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f30781c = Boolean.TRUE;
        if (I3 && !bool.booleanValue()) {
            return true;
        }
        if (!z3 || this.f30795g.G()) {
            this.f30782d = bool;
        }
        if (bool.booleanValue() && objArr != false && c1493s2.R()) {
            long C3 = c1493s2.C();
            if (l4 != null) {
                C3 = l4.longValue();
            }
            if (z4 && this.f30795g.G() && !this.f30795g.H() && l5 != null) {
                C3 = l5.longValue();
            }
            if (this.f30795g.H()) {
                this.f30784f = Long.valueOf(C3);
            } else {
                this.f30783e = Long.valueOf(C3);
            }
        }
        return true;
    }
}
