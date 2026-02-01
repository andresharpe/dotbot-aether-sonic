package com.google.android.material.bottomappbar;

import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.g;
import com.google.android.material.shape.q;

/* loaded from: classes2.dex */
public class a extends g implements Cloneable {

    /* renamed from: K, reason: collision with root package name */
    private static final int f31527K = 90;

    /* renamed from: L, reason: collision with root package name */
    private static final int f31528L = 180;

    /* renamed from: M, reason: collision with root package name */
    private static final int f31529M = 270;

    /* renamed from: N, reason: collision with root package name */
    private static final int f31530N = 180;

    /* renamed from: O, reason: collision with root package name */
    private static final float f31531O = 1.75f;

    /* renamed from: E, reason: collision with root package name */
    private float f31532E;

    /* renamed from: F, reason: collision with root package name */
    private float f31533F;

    /* renamed from: G, reason: collision with root package name */
    private float f31534G;

    /* renamed from: H, reason: collision with root package name */
    private float f31535H;

    /* renamed from: I, reason: collision with root package name */
    private float f31536I;

    /* renamed from: J, reason: collision with root package name */
    private float f31537J = -1.0f;

    public a(float f4, float f5, float f6) {
        this.f31533F = f4;
        this.f31532E = f5;
        k(f6);
        this.f31536I = 0.0f;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f4, float f5, float f6, @N q qVar) {
        boolean z3;
        float f7;
        float f8;
        float f9 = this.f31534G;
        if (f9 == 0.0f) {
            qVar.n(f4, 0.0f);
            return;
        }
        float f10 = ((this.f31533F * 2.0f) + f9) / 2.0f;
        float f11 = f6 * this.f31532E;
        float f12 = f5 + this.f31536I;
        float f13 = (this.f31535H * f6) + ((1.0f - f6) * f10);
        if (f13 / f10 >= 1.0f) {
            qVar.n(f4, 0.0f);
            return;
        }
        float f14 = this.f31537J;
        float f15 = f14 * f6;
        if (f14 != -1.0f && Math.abs((f14 * 2.0f) - f9) >= 0.1f) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z4 = z3;
        if (!z4) {
            f8 = f31531O;
            f7 = 0.0f;
        } else {
            f7 = f13;
            f8 = 0.0f;
        }
        float f16 = f10 + f11;
        float f17 = f7 + f11;
        float sqrt = (float) Math.sqrt((f16 * f16) - (f17 * f17));
        float f18 = f12 - sqrt;
        float f19 = f12 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f17));
        float f20 = (90.0f - degrees) + f8;
        qVar.n(f18, 0.0f);
        float f21 = f11 * 2.0f;
        qVar.a(f18 - f11, 0.0f, f18 + f11, f21, 270.0f, degrees);
        if (z4) {
            qVar.a(f12 - f10, (-f10) - f7, f12 + f10, f10 - f7, 180.0f - f20, (f20 * 2.0f) - 180.0f);
        } else {
            float f22 = this.f31533F;
            float f23 = f15 * 2.0f;
            float f24 = f12 - f10;
            qVar.a(f24, -(f15 + f22), f24 + f22 + f23, f22 + f15, 180.0f - f20, ((f20 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f12 + f10;
            float f26 = this.f31533F;
            qVar.n(f25 - ((f26 / 2.0f) + f15), f26 + f15);
            float f27 = this.f31533F;
            qVar.a(f25 - (f23 + f27), -(f15 + f27), f25, f27 + f15, 90.0f, f20 - 90.0f);
        }
        qVar.a(f19 - f11, 0.0f, f19 + f11, f21, 270.0f - degrees, degrees);
        qVar.n(f4, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f31535H;
    }

    public float f() {
        return this.f31537J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f31533F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f31532E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float i() {
        return this.f31534G;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float j() {
        return this.f31536I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(@InterfaceC0580x(from = 0.0d) float f4) {
        if (f4 >= 0.0f) {
            this.f31535H = f4;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void l(float f4) {
        this.f31537J = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(float f4) {
        this.f31533F = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(float f4) {
        this.f31532E = f4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void p(float f4) {
        this.f31534G = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(float f4) {
        this.f31536I = f4;
    }
}
