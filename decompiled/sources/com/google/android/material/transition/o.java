package com.google.android.material.transition;

import T0.a;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.transition.S;

/* loaded from: classes2.dex */
public final class o extends q<e> {

    /* renamed from: J0, reason: collision with root package name */
    private static final float f34172J0 = 0.92f;

    /* renamed from: K0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34173K0 = a.c.Mb;

    /* renamed from: L0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34174L0 = a.c.Wb;

    public o() {
        super(Z0(), a1());
    }

    private static e Z0() {
        return new e();
    }

    private static v a1() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(f34172J0);
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
    @InterfaceC0563f
    int S0(boolean z3) {
        return f34173K0;
    }

    @Override // com.google.android.material.transition.q
    @InterfaceC0563f
    int T0(boolean z3) {
        return f34174L0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.e, com.google.android.material.transition.v] */
    @Override // com.google.android.material.transition.q
    @N
    public /* bridge */ /* synthetic */ e U0() {
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
