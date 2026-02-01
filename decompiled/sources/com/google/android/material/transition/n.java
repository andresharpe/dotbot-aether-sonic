package com.google.android.material.transition;

import T0.a;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.transition.S;

/* loaded from: classes2.dex */
public final class n extends q<d> {

    /* renamed from: J0, reason: collision with root package name */
    private static final float f34167J0 = 0.8f;

    /* renamed from: K0, reason: collision with root package name */
    private static final float f34168K0 = 0.3f;

    /* renamed from: L0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34169L0 = a.c.Rb;

    /* renamed from: M0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34170M0 = a.c.Qb;

    /* renamed from: N0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34171N0 = a.c.Vb;

    public n() {
        super(Z0(), a1());
    }

    private static d Z0() {
        d dVar = new d();
        dVar.e(f34168K0);
        return dVar;
    }

    private static v a1() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(f34167J0);
        return rVar;
    }

    @Override // com.google.android.material.transition.q, androidx.transition.t0
    public /* bridge */ /* synthetic */ Animator I0(ViewGroup viewGroup, View view, S s4, S s5) {
        return super.I0(viewGroup, view, s4, s5);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.t0
    public /* bridge */ /* synthetic */ Animator K0(ViewGroup viewGroup, View view, S s4, S s5) {
        return super.K0(viewGroup, view, s4, s5);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void N0(@N v vVar) {
        super.N0(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void P0() {
        super.P0();
    }

    @Override // com.google.android.material.transition.q
    @N
    TimeInterpolator R0(boolean z3) {
        return com.google.android.material.animation.a.f31207a;
    }

    @Override // com.google.android.material.transition.q
    @InterfaceC0563f
    int S0(boolean z3) {
        if (z3) {
            return f34169L0;
        }
        return f34170M0;
    }

    @Override // com.google.android.material.transition.q
    @InterfaceC0563f
    int T0(boolean z3) {
        return f34171N0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.d, com.google.android.material.transition.v] */
    @Override // com.google.android.material.transition.q
    @N
    public /* bridge */ /* synthetic */ d U0() {
        return super.U0();
    }

    @Override // com.google.android.material.transition.q
    @P
    public /* bridge */ /* synthetic */ v V0() {
        return super.V0();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean X0(@N v vVar) {
        return super.X0(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void Y0(@P v vVar) {
        super.Y0(vVar);
    }
}
