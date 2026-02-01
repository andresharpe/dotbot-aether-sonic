package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
public final class n extends r<s> {

    /* renamed from: I, reason: collision with root package name */
    private static final float f34332I = 0.85f;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f34333H;

    public n(boolean z3) {
        super(o(z3), p());
        this.f34333H = z3;
    }

    private static s o(boolean z3) {
        s sVar = new s(z3);
        sVar.m(f34332I);
        sVar.l(f34332I);
        return sVar;
    }

    private static w p() {
        return new d();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void a(@N w wVar) {
        super.a(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.platform.w, com.google.android.material.transition.platform.s] */
    @Override // com.google.android.material.transition.platform.r
    @N
    public /* bridge */ /* synthetic */ s i() {
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

    public boolean q() {
        return this.f34333H;
    }
}
