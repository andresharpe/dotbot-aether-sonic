package com.harman.jbl.partybox.ui.oobe;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;

/* loaded from: classes2.dex */
public final class f extends j0 {

    /* renamed from: H, reason: collision with root package name */
    private boolean f44395H = true;

    /* renamed from: I, reason: collision with root package name */
    private boolean f44396I = true;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f44397J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f44398K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private final c f44399L;

    public f() {
        P<Boolean> p4 = new P<>();
        this.f44397J = p4;
        this.f44398K = p4;
        this.f44399L = new c();
    }

    private final void B() {
        boolean z3;
        P<Boolean> p4 = this.f44397J;
        if (this.f44395H && this.f44396I) {
            z3 = true;
        } else {
            z3 = false;
        }
        p4.r(Boolean.valueOf(z3));
    }

    public final void A(boolean z3) {
        this.f44396I = z3;
        B();
    }

    @l3.d
    public final LiveData<Boolean> u() {
        return this.f44398K;
    }

    @l3.d
    public final b v(int i4) {
        return this.f44399L.a().get(i4);
    }

    @l3.d
    public final c w() {
        return this.f44399L;
    }

    public final int x() {
        return this.f44399L.a().size();
    }

    public final void y() {
        com.harman.jbl.partybox.persistence.a.f42065a.H();
    }

    public final void z(boolean z3) {
        this.f44395H = z3;
        B();
    }
}
