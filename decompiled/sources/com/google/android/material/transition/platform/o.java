package com.google.android.material.transition.platform;

import T0.a;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
public final class o extends r<d> {

    /* renamed from: H, reason: collision with root package name */
    private static final float f34334H = 0.8f;

    /* renamed from: I, reason: collision with root package name */
    private static final float f34335I = 0.3f;

    /* renamed from: J, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34336J = a.c.Rb;

    /* renamed from: K, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34337K = a.c.Qb;

    /* renamed from: L, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34338L = a.c.Vb;

    public o() {
        super(o(), p());
    }

    private static d o() {
        d dVar = new d();
        dVar.e(f34335I);
        return dVar;
    }

    private static w p() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(f34334H);
        return sVar;
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void a(@N w wVar) {
        super.a(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.material.transition.platform.r
    @N
    TimeInterpolator f(boolean z3) {
        return com.google.android.material.animation.a.f31207a;
    }

    @Override // com.google.android.material.transition.platform.r
    @InterfaceC0563f
    int g(boolean z3) {
        if (z3) {
            return f34336J;
        }
        return f34337K;
    }

    @Override // com.google.android.material.transition.platform.r
    @InterfaceC0563f
    int h(boolean z3) {
        return f34338L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.platform.w, com.google.android.material.transition.platform.d] */
    @Override // com.google.android.material.transition.platform.r
    @N
    public /* bridge */ /* synthetic */ d i() {
        return super.i();
    }

    @Override // com.google.android.material.transition.platform.r
    @P
    public /* bridge */ /* synthetic */ w j() {
        return super.j();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean l(@N w wVar) {
        return super.l(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void n(@P w wVar) {
        super.n(wVar);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
