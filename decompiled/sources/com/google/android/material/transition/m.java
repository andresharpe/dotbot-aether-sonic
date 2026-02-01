package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.transition.S;

/* loaded from: classes2.dex */
public final class m extends q<r> {

    /* renamed from: K0, reason: collision with root package name */
    private static final float f34165K0 = 0.85f;

    /* renamed from: J0, reason: collision with root package name */
    private final boolean f34166J0;

    public m(boolean z3) {
        super(Z0(z3), a1());
        this.f34166J0 = z3;
    }

    private static r Z0(boolean z3) {
        r rVar = new r(z3);
        rVar.m(f34165K0);
        rVar.l(f34165K0);
        return rVar;
    }

    private static v a1() {
        return new d();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.r, com.google.android.material.transition.v] */
    @Override // com.google.android.material.transition.q
    @N
    public /* bridge */ /* synthetic */ r U0() {
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

    public boolean b1() {
        return this.f34166J0;
    }
}
