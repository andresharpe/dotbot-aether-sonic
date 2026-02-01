package com.google.android.material.transition;

import T0.a;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C;
import androidx.transition.S;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class p extends q<v> {

    /* renamed from: L0, reason: collision with root package name */
    public static final int f34175L0 = 0;

    /* renamed from: M0, reason: collision with root package name */
    public static final int f34176M0 = 1;

    /* renamed from: N0, reason: collision with root package name */
    public static final int f34177N0 = 2;

    /* renamed from: O0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34178O0 = a.c.Mb;

    /* renamed from: P0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f34179P0 = a.c.Wb;

    /* renamed from: J0, reason: collision with root package name */
    private final int f34180J0;

    /* renamed from: K0, reason: collision with root package name */
    private final boolean f34181K0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public p(int i4, boolean z3) {
        super(Z0(i4, z3), a1());
        this.f34180J0 = i4;
        this.f34181K0 = z3;
    }

    private static v Z0(int i4, boolean z3) {
        int i5;
        int i6;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return new r(z3);
                }
                throw new IllegalArgumentException("Invalid axis: " + i4);
            }
            if (z3) {
                i6 = 80;
            } else {
                i6 = 48;
            }
            return new s(i6);
        }
        if (z3) {
            i5 = C.f13102c;
        } else {
            i5 = C.f13101b;
        }
        return new s(i5);
    }

    private static v a1() {
        return new e();
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
        return f34178O0;
    }

    @Override // com.google.android.material.transition.q
    @InterfaceC0563f
    int T0(boolean z3) {
        return f34179P0;
    }

    @Override // com.google.android.material.transition.q
    @N
    public /* bridge */ /* synthetic */ v U0() {
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

    public int b1() {
        return this.f34180J0;
    }

    public boolean c1() {
        return this.f34181K0;
    }
}
