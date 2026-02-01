package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import com.google.android.material.transition.platform.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@W(21)
/* loaded from: classes2.dex */
abstract class r<P extends w> extends Visibility {

    /* renamed from: E, reason: collision with root package name */
    private final P f34349E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private w f34350F;

    /* renamed from: G, reason: collision with root package name */
    private final List<w> f34351G = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public r(P p4, @P w wVar) {
        this.f34349E = p4;
        this.f34350F = wVar;
    }

    private static void b(List<Animator> list, @P w wVar, ViewGroup viewGroup, View view, boolean z3) {
        Animator b4;
        if (wVar == null) {
            return;
        }
        if (z3) {
            b4 = wVar.a(viewGroup, view);
        } else {
            b4 = wVar.b(viewGroup, view);
        }
        if (b4 != null) {
            list.add(b4);
        }
    }

    private Animator e(@N ViewGroup viewGroup, @N View view, boolean z3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.f34349E, viewGroup, view, z3);
        b(arrayList, this.f34350F, viewGroup, view, z3);
        Iterator<w> it = this.f34351G.iterator();
        while (it.hasNext()) {
            b(arrayList, it.next(), viewGroup, view, z3);
        }
        k(viewGroup.getContext(), z3);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void k(@N Context context, boolean z3) {
        v.q(this, context, g(z3));
        v.r(this, context, h(z3), f(z3));
    }

    public void a(@N w wVar) {
        this.f34351G.add(wVar);
    }

    public void d() {
        this.f34351G.clear();
    }

    @N
    TimeInterpolator f(boolean z3) {
        return com.google.android.material.animation.a.f31208b;
    }

    @InterfaceC0563f
    int g(boolean z3) {
        return 0;
    }

    @InterfaceC0563f
    int h(boolean z3) {
        return 0;
    }

    @N
    public P i() {
        return this.f34349E;
    }

    @P
    public w j() {
        return this.f34350F;
    }

    public boolean l(@N w wVar) {
        return this.f34351G.remove(wVar);
    }

    public void n(@P w wVar) {
        this.f34350F = wVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return e(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return e(viewGroup, view, false);
    }
}
