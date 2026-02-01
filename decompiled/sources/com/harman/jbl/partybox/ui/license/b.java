package com.harman.jbl.partybox.ui.license;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import l3.d;

/* loaded from: classes2.dex */
public final class b extends j0 {

    /* renamed from: H, reason: collision with root package name */
    private boolean f43933H = true;

    /* renamed from: I, reason: collision with root package name */
    private boolean f43934I = true;

    /* renamed from: J, reason: collision with root package name */
    @d
    private final P<Boolean> f43935J;

    /* renamed from: K, reason: collision with root package name */
    @d
    private final LiveData<Boolean> f43936K;

    public b() {
        P<Boolean> p4 = new P<>();
        this.f43935J = p4;
        this.f43936K = p4;
    }

    private final void y() {
        boolean z3;
        P<Boolean> p4 = this.f43935J;
        if (this.f43933H && this.f43934I) {
            z3 = true;
        } else {
            z3 = false;
        }
        p4.r(Boolean.valueOf(z3));
    }

    @d
    public final LiveData<Boolean> u() {
        return this.f43936K;
    }

    public final void v() {
        com.harman.jbl.partybox.persistence.a.f42065a.a();
    }

    public final void w(boolean z3) {
        this.f43933H = z3;
        y();
    }

    public final void x(boolean z3) {
        this.f43934I = z3;
        y();
    }
}
