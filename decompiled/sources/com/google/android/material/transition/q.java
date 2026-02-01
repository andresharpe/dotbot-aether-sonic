package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.transition.S;
import androidx.transition.t0;
import com.google.android.material.transition.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
abstract class q<P extends v> extends t0 {

    /* renamed from: G0, reason: collision with root package name */
    private final P f34379G0;

    /* renamed from: H0, reason: collision with root package name */
    @P
    private v f34380H0;

    /* renamed from: I0, reason: collision with root package name */
    private final List<v> f34381I0 = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public q(P p4, @P v vVar) {
        this.f34379G0 = p4;
        this.f34380H0 = vVar;
    }

    private static void O0(List<Animator> list, @P v vVar, ViewGroup viewGroup, View view, boolean z3) {
        Animator b4;
        if (vVar == null) {
            return;
        }
        if (z3) {
            b4 = vVar.a(viewGroup, view);
        } else {
            b4 = vVar.b(viewGroup, view);
        }
        if (b4 != null) {
            list.add(b4);
        }
    }

    private Animator Q0(@N ViewGroup viewGroup, @N View view, boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        O0(arrayList, this.f34379G0, viewGroup, view, z3);
        O0(arrayList, this.f34380H0, viewGroup, view, z3);
        Iterator<v> it = this.f34381I0.iterator();
        while (it.hasNext()) {
            O0(arrayList, it.next(), viewGroup, view, z3);
        }
        W0(viewGroup.getContext(), z3);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void W0(@N Context context, boolean z3) {
        u.q(this, context, S0(z3));
        u.r(this, context, T0(z3), R0(z3));
    }

    @Override // androidx.transition.t0
    public Animator I0(ViewGroup viewGroup, View view, S s4, S s5) {
        return Q0(viewGroup, view, true);
    }

    @Override // androidx.transition.t0
    public Animator K0(ViewGroup viewGroup, View view, S s4, S s5) {
        return Q0(viewGroup, view, false);
    }

    public void N0(@N v vVar) {
        this.f34381I0.add(vVar);
    }

    public void P0() {
        this.f34381I0.clear();
    }

    @N
    TimeInterpolator R0(boolean z3) {
        return com.google.android.material.animation.a.f31208b;
    }

    @InterfaceC0563f
    int S0(boolean z3) {
        return 0;
    }

    @InterfaceC0563f
    int T0(boolean z3) {
        return 0;
    }

    @N
    public P U0() {
        return this.f34379G0;
    }

    @P
    public v V0() {
        return this.f34380H0;
    }

    public boolean X0(@N v vVar) {
        return this.f34381I0.remove(vVar);
    }

    public void Y0(@P v vVar) {
        this.f34380H0 = vVar;
    }
}
