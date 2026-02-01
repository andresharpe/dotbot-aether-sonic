package com.google.android.material.transition.platform;

import T0.a;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.view.C;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@W(21)
/* loaded from: classes2.dex */
public final class q extends r<w> {

    /* renamed from: J, reason: collision with root package name */
    public static final int f34342J = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final int f34343K = 1;

    /* renamed from: L, reason: collision with root package name */
    public static final int f34344L = 2;

    /* renamed from: M, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34345M = a.c.Mb;

    /* renamed from: N, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34346N = a.c.Wb;

    /* renamed from: H, reason: collision with root package name */
    private final int f34347H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f34348I;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public q(int i4, boolean z3) {
        super(o(i4, z3), p());
        this.f34347H = i4;
        this.f34348I = z3;
    }

    private static w o(int i4, boolean z3) {
        int i5;
        int i6;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return new s(z3);
                }
                throw new IllegalArgumentException("Invalid axis: " + i4);
            }
            if (z3) {
                i6 = 80;
            } else {
                i6 = 48;
            }
            return new t(i6);
        }
        if (z3) {
            i5 = C.f13102c;
        } else {
            i5 = C.f13101b;
        }
        return new t(i5);
    }

    private static w p() {
        return new e();
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
        return f34345M;
    }

    @Override // com.google.android.material.transition.platform.r
    @InterfaceC0563f
    int h(boolean z3) {
        return f34346N;
    }

    @Override // com.google.android.material.transition.platform.r
    @N
    public /* bridge */ /* synthetic */ w i() {
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

    public int q() {
        return this.f34347H;
    }

    public boolean r() {
        return this.f34348I;
    }
}
