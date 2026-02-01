package com.google.android.material.transition.platform;

import T0.a;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
public final class p extends r<e> {

    /* renamed from: H, reason: collision with root package name */
    private static final float f34339H = 0.92f;

    /* renamed from: I, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34340I = a.c.Mb;

    /* renamed from: J, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34341J = a.c.Wb;

    public p() {
        super(o(), p());
    }

    private static e o() {
        return new e();
    }

    private static w p() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(f34339H);
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
    @InterfaceC0563f
    int g(boolean z3) {
        return f34340I;
    }

    @Override // com.google.android.material.transition.platform.r
    @InterfaceC0563f
    int h(boolean z3) {
        return f34341J;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.platform.w, com.google.android.material.transition.platform.e] */
    @Override // com.google.android.material.transition.platform.r
    @N
    public /* bridge */ /* synthetic */ e i() {
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
