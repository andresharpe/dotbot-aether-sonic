package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0823k0;

/* renamed from: androidx.transition.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0980n extends t0 {

    /* renamed from: G0, reason: collision with root package name */
    private static final String f20111G0 = "android:fade:transitionAlpha";

    /* renamed from: H0, reason: collision with root package name */
    private static final String f20112H0 = "Fade";

    /* renamed from: I0, reason: collision with root package name */
    public static final int f20113I0 = 1;

    /* renamed from: J0, reason: collision with root package name */
    public static final int f20114J0 = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.n$a */
    /* loaded from: classes.dex */
    public class a extends L {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f20115a;

        a(View view) {
            this.f20115a = view;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            f0.h(this.f20115a, 1.0f);
            f0.a(this.f20115a);
            j4.m0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.n$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f20117a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20118b = false;

        b(View view) {
            this.f20117a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.h(this.f20117a, 1.0f);
            if (this.f20118b) {
                this.f20117a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0823k0.L0(this.f20117a) && this.f20117a.getLayerType() == 0) {
                this.f20118b = true;
                this.f20117a.setLayerType(2, null);
            }
        }
    }

    public C0980n(int i4) {
        M0(i4);
    }

    private Animator N0(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        f0.h(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f0.f20008c, f5);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float O0(S s4, float f4) {
        Float f5;
        if (s4 != null && (f5 = (Float) s4.f19959a.get(f20111G0)) != null) {
            return f5.floatValue();
        }
        return f4;
    }

    @Override // androidx.transition.t0
    @androidx.annotation.P
    public Animator I0(ViewGroup viewGroup, View view, S s4, S s5) {
        float f4 = 0.0f;
        float O02 = O0(s4, 0.0f);
        if (O02 != 1.0f) {
            f4 = O02;
        }
        return N0(view, f4, 1.0f);
    }

    @Override // androidx.transition.t0
    @androidx.annotation.P
    public Animator K0(ViewGroup viewGroup, View view, S s4, S s5) {
        f0.e(view);
        return N0(view, O0(s4, 1.0f), 0.0f);
    }

    @Override // androidx.transition.t0, androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        super.p(s4);
        s4.f19959a.put(f20111G0, Float.valueOf(f0.c(s4.f19960b)));
    }

    public C0980n() {
    }

    @SuppressLint({"RestrictedApi"})
    public C0980n(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19840f);
        M0(androidx.core.content.res.n.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, F0()));
        obtainStyledAttributes.recycle();
    }
}
