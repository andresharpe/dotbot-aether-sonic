package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    private float f34352a;

    /* renamed from: b, reason: collision with root package name */
    private float f34353b;

    /* renamed from: c, reason: collision with root package name */
    private float f34354c;

    /* renamed from: d, reason: collision with root package name */
    private float f34355d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34356e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34357f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f34358a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f34359b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f34360c;

        a(View view, float f4, float f5) {
            this.f34358a = view;
            this.f34359b = f4;
            this.f34360c = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34358a.setScaleX(this.f34359b);
            this.f34358a.setScaleY(this.f34360c);
        }
    }

    public s() {
        this(true);
    }

    private static Animator c(View view, float f4, float f5) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f4, scaleX * f5), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f4 * scaleY, f5 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.w
    @P
    public Animator a(@N ViewGroup viewGroup, @N View view) {
        if (this.f34356e) {
            return c(view, this.f34354c, this.f34355d);
        }
        return c(view, this.f34353b, this.f34352a);
    }

    @Override // com.google.android.material.transition.platform.w
    @P
    public Animator b(@N ViewGroup viewGroup, @N View view) {
        if (!this.f34357f) {
            return null;
        }
        if (this.f34356e) {
            return c(view, this.f34352a, this.f34353b);
        }
        return c(view, this.f34355d, this.f34354c);
    }

    public float d() {
        return this.f34355d;
    }

    public float e() {
        return this.f34354c;
    }

    public float f() {
        return this.f34353b;
    }

    public float g() {
        return this.f34352a;
    }

    public boolean h() {
        return this.f34356e;
    }

    public boolean i() {
        return this.f34357f;
    }

    public void j(boolean z3) {
        this.f34356e = z3;
    }

    public void k(float f4) {
        this.f34355d = f4;
    }

    public void l(float f4) {
        this.f34354c = f4;
    }

    public void m(float f4) {
        this.f34353b = f4;
    }

    public void n(float f4) {
        this.f34352a = f4;
    }

    public void o(boolean z3) {
        this.f34357f = z3;
    }

    public s(boolean z3) {
        this.f34352a = 1.0f;
        this.f34353b = 1.1f;
        this.f34354c = 0.8f;
        this.f34355d = 1.0f;
        this.f34357f = true;
        this.f34356e = z3;
    }
}
