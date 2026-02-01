package com.google.android.material.slider;

import T0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.annotation.r;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import com.google.android.material.internal.C1783d;
import com.google.android.material.internal.D;
import com.google.android.material.internal.E;
import com.google.android.material.internal.w;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import com.google.android.material.slider.c;
import d1.C2044a;
import e.C2046a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q.C2394a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c<S extends c<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {

    /* renamed from: I0, reason: collision with root package name */
    private static final String f33246I0 = "c";

    /* renamed from: J0, reason: collision with root package name */
    private static final String f33247J0 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";

    /* renamed from: K0, reason: collision with root package name */
    private static final String f33248K0 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";

    /* renamed from: L0, reason: collision with root package name */
    private static final String f33249L0 = "valueFrom(%s) must be smaller than valueTo(%s)";

    /* renamed from: M0, reason: collision with root package name */
    private static final String f33250M0 = "valueTo(%s) must be greater than valueFrom(%s)";

    /* renamed from: N0, reason: collision with root package name */
    private static final String f33251N0 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";

    /* renamed from: O0, reason: collision with root package name */
    private static final String f33252O0 = "minSeparation(%s) must be greater or equal to 0";

    /* renamed from: P0, reason: collision with root package name */
    private static final String f33253P0 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";

    /* renamed from: Q0, reason: collision with root package name */
    private static final String f33254Q0 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";

    /* renamed from: R0, reason: collision with root package name */
    private static final String f33255R0 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";

    /* renamed from: S0, reason: collision with root package name */
    private static final int f33256S0 = 200;

    /* renamed from: T0, reason: collision with root package name */
    private static final int f33257T0 = 63;

    /* renamed from: U0, reason: collision with root package name */
    private static final double f33258U0 = 1.0E-4d;

    /* renamed from: V0, reason: collision with root package name */
    static final int f33259V0 = a.n.Di;

    /* renamed from: W0, reason: collision with root package name */
    static final int f33260W0 = 1;

    /* renamed from: X0, reason: collision with root package name */
    static final int f33261X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    private static final long f33262Y0 = 83;

    /* renamed from: Z0, reason: collision with root package name */
    private static final long f33263Z0 = 117;

    /* renamed from: A0, reason: collision with root package name */
    @N
    private ColorStateList f33264A0;

    /* renamed from: B0, reason: collision with root package name */
    @N
    private ColorStateList f33265B0;

    /* renamed from: C0, reason: collision with root package name */
    @N
    private ColorStateList f33266C0;

    /* renamed from: D0, reason: collision with root package name */
    @N
    private final j f33267D0;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Paint f33268E;

    /* renamed from: E0, reason: collision with root package name */
    @P
    private Drawable f33269E0;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final Paint f33270F;

    /* renamed from: F0, reason: collision with root package name */
    @N
    private List<Drawable> f33271F0;

    /* renamed from: G, reason: collision with root package name */
    @N
    private final Paint f33272G;

    /* renamed from: G0, reason: collision with root package name */
    private float f33273G0;

    /* renamed from: H, reason: collision with root package name */
    @N
    private final Paint f33274H;

    /* renamed from: H0, reason: collision with root package name */
    private int f33275H0;

    /* renamed from: I, reason: collision with root package name */
    @N
    private final Paint f33276I;

    /* renamed from: J, reason: collision with root package name */
    @N
    private final Paint f33277J;

    /* renamed from: K, reason: collision with root package name */
    @N
    private final e f33278K;

    /* renamed from: L, reason: collision with root package name */
    private final AccessibilityManager f33279L;

    /* renamed from: M, reason: collision with root package name */
    private c<S, L, T>.d f33280M;

    /* renamed from: N, reason: collision with root package name */
    @N
    private final g f33281N;

    /* renamed from: O, reason: collision with root package name */
    @N
    private final List<com.google.android.material.tooltip.a> f33282O;

    /* renamed from: P, reason: collision with root package name */
    @N
    private final List<L> f33283P;

    /* renamed from: Q, reason: collision with root package name */
    @N
    private final List<T> f33284Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f33285R;

    /* renamed from: S, reason: collision with root package name */
    private ValueAnimator f33286S;

    /* renamed from: T, reason: collision with root package name */
    private ValueAnimator f33287T;

    /* renamed from: U, reason: collision with root package name */
    private final int f33288U;

    /* renamed from: V, reason: collision with root package name */
    private int f33289V;

    /* renamed from: W, reason: collision with root package name */
    private int f33290W;

    /* renamed from: a0, reason: collision with root package name */
    private int f33291a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f33292b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f33293c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f33294d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f33295e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f33296f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f33297g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f33298h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f33299i0;

    /* renamed from: j0, reason: collision with root package name */
    private MotionEvent f33300j0;

    /* renamed from: k0, reason: collision with root package name */
    private com.google.android.material.slider.e f33301k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f33302l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f33303m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f33304n0;

    /* renamed from: o0, reason: collision with root package name */
    private ArrayList<Float> f33305o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f33306p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f33307q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f33308r0;

    /* renamed from: s0, reason: collision with root package name */
    private float[] f33309s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f33310t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f33311u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f33312v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f33313w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f33314x0;

    /* renamed from: y0, reason: collision with root package name */
    @N
    private ColorStateList f33315y0;

    /* renamed from: z0, reason: collision with root package name */
    @N
    private ColorStateList f33316z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AttributeSet f33317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f33318b;

        a(AttributeSet attributeSet, int i4) {
            this.f33317a = attributeSet;
            this.f33318b = i4;
        }

        @Override // com.google.android.material.slider.c.g
        public com.google.android.material.tooltip.a a() {
            TypedArray j4 = w.j(c.this.getContext(), this.f33317a, a.o.wr, this.f33318b, c.f33259V0, new int[0]);
            com.google.android.material.tooltip.a e02 = c.e0(c.this.getContext(), j4);
            j4.recycle();
            return e02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = c.this.f33282O.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.tooltip.a) it.next()).l1(floatValue);
            }
            C0823k0.n1(c.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.slider.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0296c extends AnimatorListenerAdapter {
        C0296c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Iterator it = c.this.f33282O.iterator();
            while (it.hasNext()) {
                E.h(c.this).b((com.google.android.material.tooltip.a) it.next());
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class e extends androidx.customview.widget.a {

        /* renamed from: t, reason: collision with root package name */
        private final c<?, ?, ?> f33324t;

        /* renamed from: u, reason: collision with root package name */
        final Rect f33325u;

        e(c<?, ?, ?> cVar) {
            super(cVar);
            this.f33325u = new Rect();
            this.f33324t = cVar;
        }

        @N
        private String a0(int i4) {
            if (i4 == this.f33324t.getValues().size() - 1) {
                return this.f33324t.getContext().getString(a.m.f3141r0);
            }
            if (i4 == 0) {
                return this.f33324t.getContext().getString(a.m.f3143s0);
            }
            return "";
        }

        @Override // androidx.customview.widget.a
        protected int C(float f4, float f5) {
            for (int i4 = 0; i4 < this.f33324t.getValues().size(); i4++) {
                this.f33324t.t0(i4, this.f33325u);
                if (this.f33325u.contains((int) f4, (int) f5)) {
                    return i4;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.a
        protected void D(List<Integer> list) {
            for (int i4 = 0; i4 < this.f33324t.getValues().size(); i4++) {
                list.add(Integer.valueOf(i4));
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean N(int i4, int i5, Bundle bundle) {
            if (!this.f33324t.isEnabled()) {
                return false;
            }
            if (i5 == 4096 || i5 == 8192) {
                float n4 = this.f33324t.n(20);
                if (i5 == 8192) {
                    n4 = -n4;
                }
                if (this.f33324t.R()) {
                    n4 = -n4;
                }
                if (this.f33324t.r0(i4, C2394a.d(this.f33324t.getValues().get(i4).floatValue() + n4, this.f33324t.getValueFrom(), this.f33324t.getValueTo()))) {
                    this.f33324t.u0();
                    this.f33324t.postInvalidate();
                    G(i4);
                    return true;
                }
                return false;
            }
            if (i5 == 16908349 && bundle != null && bundle.containsKey(M.f13306X)) {
                if (this.f33324t.r0(i4, bundle.getFloat(M.f13306X))) {
                    this.f33324t.u0();
                    this.f33324t.postInvalidate();
                    G(i4);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void R(int i4, M m4) {
            m4.b(M.a.f13360M);
            List<Float> values = this.f33324t.getValues();
            float floatValue = values.get(i4).floatValue();
            float valueFrom = this.f33324t.getValueFrom();
            float valueTo = this.f33324t.getValueTo();
            if (this.f33324t.isEnabled()) {
                if (floatValue > valueFrom) {
                    m4.a(8192);
                }
                if (floatValue < valueTo) {
                    m4.a(4096);
                }
            }
            m4.F1(M.e.e(1, valueFrom, valueTo, floatValue));
            m4.Z0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f33324t.getContentDescription() != null) {
                sb.append(this.f33324t.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(a0(i4));
                sb.append(this.f33324t.F(floatValue));
            }
            m4.d1(sb.toString());
            this.f33324t.t0(i4, this.f33325u);
            m4.U0(this.f33325u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        float f33326E;

        /* renamed from: F, reason: collision with root package name */
        float f33327F;

        /* renamed from: G, reason: collision with root package name */
        ArrayList<Float> f33328G;

        /* renamed from: H, reason: collision with root package name */
        float f33329H;

        /* renamed from: I, reason: collision with root package name */
        boolean f33330I;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(@N Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i4) {
                return new f[i4];
            }
        }

        /* synthetic */ f(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeFloat(this.f33326E);
            parcel.writeFloat(this.f33327F);
            parcel.writeList(this.f33328G);
            parcel.writeFloat(this.f33329H);
            parcel.writeBooleanArray(new boolean[]{this.f33330I});
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        private f(@N Parcel parcel) {
            super(parcel);
            this.f33326E = parcel.readFloat();
            this.f33327F = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f33328G = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f33329H = parcel.readFloat();
            this.f33330I = parcel.createBooleanArray()[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface g {
        com.google.android.material.tooltip.a a();
    }

    public c(@N Context context) {
        this(context, null);
    }

    private void A(@N Canvas canvas, int i4, int i5) {
        for (int i6 = 0; i6 < this.f33305o0.size(); i6++) {
            float floatValue = this.f33305o0.get(i6).floatValue();
            Drawable drawable = this.f33269E0;
            if (drawable != null) {
                z(canvas, i4, i5, floatValue, drawable);
            } else if (i6 < this.f33271F0.size()) {
                z(canvas, i4, i5, floatValue, this.f33271F0.get(i6));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.f33294d0 + (a0(floatValue) * i4), i5, this.f33296f0, this.f33272G);
                }
                z(canvas, i4, i5, floatValue, this.f33267D0);
            }
        }
    }

    private void A0() {
        if (this.f33304n0 > this.f33303m0) {
        } else {
            throw new IllegalStateException(String.format(f33250M0, Float.valueOf(this.f33304n0), Float.valueOf(this.f33303m0)));
        }
    }

    private void B() {
        if (this.f33292b0 == 2) {
            return;
        }
        if (!this.f33285R) {
            this.f33285R = true;
            ValueAnimator r4 = r(true);
            this.f33286S = r4;
            this.f33287T = null;
            r4.start();
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f33282O.iterator();
        for (int i4 = 0; i4 < this.f33305o0.size() && it.hasNext(); i4++) {
            if (i4 != this.f33307q0) {
                l0(it.next(), this.f33305o0.get(i4).floatValue());
            }
        }
        if (it.hasNext()) {
            l0(it.next(), this.f33305o0.get(this.f33307q0).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f33282O.size()), Integer.valueOf(this.f33305o0.size())));
    }

    private void B0() {
        Iterator<Float> it = this.f33305o0.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() >= this.f33303m0 && next.floatValue() <= this.f33304n0) {
                if (this.f33308r0 > 0.0f && !C0(next.floatValue())) {
                    throw new IllegalStateException(String.format(f33248K0, next, Float.valueOf(this.f33303m0), Float.valueOf(this.f33308r0), Float.valueOf(this.f33308r0)));
                }
            } else {
                throw new IllegalStateException(String.format(f33247J0, next, Float.valueOf(this.f33303m0), Float.valueOf(this.f33304n0)));
            }
        }
    }

    private void C() {
        if (this.f33285R) {
            this.f33285R = false;
            ValueAnimator r4 = r(false);
            this.f33287T = r4;
            this.f33286S = null;
            r4.addListener(new C0296c());
            this.f33287T.start();
        }
    }

    private boolean C0(float f4) {
        return Q(f4 - this.f33303m0);
    }

    private void D(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 == 66) {
                        Z(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                Z(Integer.MAX_VALUE);
                return;
            }
            Y(Integer.MIN_VALUE);
            return;
        }
        Y(Integer.MAX_VALUE);
    }

    private float D0(float f4) {
        return (a0(f4) * this.f33311u0) + this.f33294d0;
    }

    private void E0() {
        float f4 = this.f33308r0;
        if (f4 == 0.0f) {
            return;
        }
        if (((int) f4) != f4) {
            Log.w(f33246I0, String.format(f33255R0, "stepSize", Float.valueOf(f4)));
        }
        float f5 = this.f33303m0;
        if (((int) f5) != f5) {
            Log.w(f33246I0, String.format(f33255R0, "valueFrom", Float.valueOf(f5)));
        }
        float f6 = this.f33304n0;
        if (((int) f6) != f6) {
            Log.w(f33246I0, String.format(f33255R0, "valueTo", Float.valueOf(f6)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F(float f4) {
        String str;
        if (M()) {
            return this.f33301k0.a(f4);
        }
        if (((int) f4) == f4) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f4));
    }

    private float[] G() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f33305o0.size() == 1) {
            floatValue2 = this.f33303m0;
        }
        float a02 = a0(floatValue2);
        float a03 = a0(floatValue);
        float[] fArr = new float[2];
        if (R()) {
            fArr[0] = a03;
            fArr[1] = a02;
        } else {
            fArr[0] = a02;
            fArr[1] = a03;
        }
        return fArr;
    }

    private static float H(ValueAnimator valueAnimator, float f4) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f4;
    }

    private float I(int i4, float f4) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.f33275H0 == 0) {
            minSeparation = u(minSeparation);
        }
        if (R()) {
            minSeparation = -minSeparation;
        }
        int i5 = i4 + 1;
        if (i5 >= this.f33305o0.size()) {
            floatValue = this.f33304n0;
        } else {
            floatValue = this.f33305o0.get(i5).floatValue() - minSeparation;
        }
        int i6 = i4 - 1;
        if (i6 < 0) {
            floatValue2 = this.f33303m0;
        } else {
            floatValue2 = this.f33305o0.get(i6).floatValue() + minSeparation;
        }
        return C2394a.d(f4, floatValue2, floatValue);
    }

    @InterfaceC0569l
    private int J(@N ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float K() {
        double q02 = q0(this.f33273G0);
        if (R()) {
            q02 = 1.0d - q02;
        }
        float f4 = this.f33304n0;
        return (float) ((q02 * (f4 - r3)) + this.f33303m0);
    }

    private float L() {
        float f4 = this.f33273G0;
        if (R()) {
            f4 = 1.0f - f4;
        }
        float f5 = this.f33304n0;
        float f6 = this.f33303m0;
        return (f4 * (f5 - f6)) + f6;
    }

    private Drawable N(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        j(newDrawable);
        return newDrawable;
    }

    private void O() {
        this.f33268E.setStrokeWidth(this.f33293c0);
        this.f33270F.setStrokeWidth(this.f33293c0);
        this.f33276I.setStrokeWidth(this.f33293c0 / 2.0f);
        this.f33277J.setStrokeWidth(this.f33293c0 / 2.0f);
    }

    private boolean P() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean Q(float f4) {
        if (Math.abs(Math.round(r0) - new BigDecimal(Float.toString(f4)).divide(new BigDecimal(Float.toString(this.f33308r0)), MathContext.DECIMAL64).doubleValue()) < f33258U0) {
            return true;
        }
        return false;
    }

    private void T(@N Resources resources) {
        this.f33291a0 = resources.getDimensionPixelSize(a.f.f9);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.d9);
        this.f33289V = dimensionPixelOffset;
        this.f33294d0 = dimensionPixelOffset;
        this.f33290W = resources.getDimensionPixelSize(a.f.b9);
        this.f33295e0 = resources.getDimensionPixelOffset(a.f.e9);
        this.f33298h0 = resources.getDimensionPixelSize(a.f.X8);
    }

    private void U() {
        if (this.f33308r0 <= 0.0f) {
            return;
        }
        w0();
        int min = Math.min((int) (((this.f33304n0 - this.f33303m0) / this.f33308r0) + 1.0f), (this.f33311u0 / (this.f33293c0 * 2)) + 1);
        float[] fArr = this.f33309s0;
        if (fArr == null || fArr.length != min * 2) {
            this.f33309s0 = new float[min * 2];
        }
        float f4 = this.f33311u0 / (min - 1);
        for (int i4 = 0; i4 < min * 2; i4 += 2) {
            float[] fArr2 = this.f33309s0;
            fArr2[i4] = this.f33294d0 + ((i4 / 2) * f4);
            fArr2[i4 + 1] = o();
        }
    }

    private void V(@N Canvas canvas, int i4, int i5) {
        if (o0()) {
            int a02 = (int) (this.f33294d0 + (a0(this.f33305o0.get(this.f33307q0).floatValue()) * i4));
            if (Build.VERSION.SDK_INT < 28) {
                int i6 = this.f33297g0;
                canvas.clipRect(a02 - i6, i5 - i6, a02 + i6, i6 + i5, Region.Op.UNION);
            }
            canvas.drawCircle(a02, i5, this.f33297g0, this.f33274H);
        }
    }

    private void W(@N Canvas canvas) {
        if (this.f33310t0 && this.f33308r0 > 0.0f) {
            float[] G3 = G();
            int g02 = g0(this.f33309s0, G3[0]);
            int g03 = g0(this.f33309s0, G3[1]);
            int i4 = g02 * 2;
            canvas.drawPoints(this.f33309s0, 0, i4, this.f33276I);
            int i5 = g03 * 2;
            canvas.drawPoints(this.f33309s0, i4, i5 - i4, this.f33277J);
            float[] fArr = this.f33309s0;
            canvas.drawPoints(fArr, i5, fArr.length - i5, this.f33276I);
        }
    }

    private void X() {
        this.f33294d0 = this.f33289V + Math.max(this.f33296f0 - this.f33290W, 0);
        if (C0823k0.U0(this)) {
            v0(getWidth());
        }
    }

    private boolean Y(int i4) {
        int i5 = this.f33307q0;
        int f4 = (int) C2394a.f(i5 + i4, 0L, this.f33305o0.size() - 1);
        this.f33307q0 = f4;
        if (f4 == i5) {
            return false;
        }
        if (this.f33306p0 != -1) {
            this.f33306p0 = f4;
        }
        u0();
        postInvalidate();
        return true;
    }

    private boolean Z(int i4) {
        if (R()) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = -i4;
            }
        }
        return Y(i4);
    }

    private float a0(float f4) {
        float f5 = this.f33303m0;
        float f6 = (f4 - f5) / (this.f33304n0 - f5);
        if (R()) {
            return 1.0f - f6;
        }
        return f6;
    }

    private Boolean b0(int i4, @N KeyEvent keyEvent) {
        if (i4 != 61) {
            if (i4 != 66) {
                if (i4 != 81) {
                    if (i4 != 69) {
                        if (i4 != 70) {
                            switch (i4) {
                                case 21:
                                    Z(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    Z(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        Y(-1);
                        return Boolean.TRUE;
                    }
                }
                Y(1);
                return Boolean.TRUE;
            }
            this.f33306p0 = this.f33307q0;
            postInvalidate();
            return Boolean.TRUE;
        }
        if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(Y(1));
        }
        if (keyEvent.isShiftPressed()) {
            return Boolean.valueOf(Y(-1));
        }
        return Boolean.FALSE;
    }

    private void c0() {
        Iterator<T> it = this.f33284Q.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void d0() {
        Iterator<T> it = this.f33284Q.iterator();
        while (it.hasNext()) {
            it.next().f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public static com.google.android.material.tooltip.a e0(@N Context context, @N TypedArray typedArray) {
        return com.google.android.material.tooltip.a.V0(context, null, 0, typedArray.getResourceId(a.o.Fr, a.n.lj));
    }

    private static int g0(float[] fArr, float f4) {
        return Math.round(f4 * ((fArr.length / 2) - 1));
    }

    private void h0(Context context, AttributeSet attributeSet, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        TypedArray j4 = w.j(context, attributeSet, a.o.wr, i4, f33259V0, new int[0]);
        this.f33303m0 = j4.getFloat(a.o.Ar, 0.0f);
        this.f33304n0 = j4.getFloat(a.o.Br, 1.0f);
        setValues(Float.valueOf(this.f33303m0));
        this.f33308r0 = j4.getFloat(a.o.zr, 0.0f);
        boolean hasValue = j4.hasValue(a.o.Pr);
        if (hasValue) {
            i5 = a.o.Pr;
        } else {
            i5 = a.o.Rr;
        }
        if (hasValue) {
            i6 = a.o.Pr;
        } else {
            i6 = a.o.Qr;
        }
        ColorStateList a4 = com.google.android.material.resources.c.a(context, j4, i5);
        if (a4 == null) {
            a4 = C2046a.a(context, a.e.P8);
        }
        setTrackInactiveTintList(a4);
        ColorStateList a5 = com.google.android.material.resources.c.a(context, j4, i6);
        if (a5 == null) {
            a5 = C2046a.a(context, a.e.M8);
        }
        setTrackActiveTintList(a5);
        this.f33267D0.o0(com.google.android.material.resources.c.a(context, j4, a.o.Gr));
        if (j4.hasValue(a.o.Jr)) {
            setThumbStrokeColor(com.google.android.material.resources.c.a(context, j4, a.o.Jr));
        }
        setThumbStrokeWidth(j4.getDimension(a.o.Kr, 0.0f));
        ColorStateList a6 = com.google.android.material.resources.c.a(context, j4, a.o.Cr);
        if (a6 == null) {
            a6 = C2046a.a(context, a.e.N8);
        }
        setHaloTintList(a6);
        this.f33310t0 = j4.getBoolean(a.o.Or, true);
        boolean hasValue2 = j4.hasValue(a.o.Lr);
        if (hasValue2) {
            i7 = a.o.Lr;
        } else {
            i7 = a.o.Nr;
        }
        if (hasValue2) {
            i8 = a.o.Lr;
        } else {
            i8 = a.o.Mr;
        }
        ColorStateList a7 = com.google.android.material.resources.c.a(context, j4, i7);
        if (a7 == null) {
            a7 = C2046a.a(context, a.e.O8);
        }
        setTickInactiveTintList(a7);
        ColorStateList a8 = com.google.android.material.resources.c.a(context, j4, i8);
        if (a8 == null) {
            a8 = C2046a.a(context, a.e.L8);
        }
        setTickActiveTintList(a8);
        setThumbRadius(j4.getDimensionPixelSize(a.o.Ir, 0));
        setHaloRadius(j4.getDimensionPixelSize(a.o.Dr, 0));
        setThumbElevation(j4.getDimension(a.o.Hr, 0.0f));
        setTrackHeight(j4.getDimensionPixelSize(a.o.Sr, 0));
        setLabelBehavior(j4.getInt(a.o.Er, 0));
        if (!j4.getBoolean(a.o.xr, true)) {
            setEnabled(false);
        }
        j4.recycle();
    }

    private void j(Drawable drawable) {
        int i4 = this.f33296f0 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i4, i4);
        } else {
            float max = i4 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    private void k(com.google.android.material.tooltip.a aVar) {
        aVar.k1(E.g(this));
    }

    private void k0(int i4) {
        c<S, L, T>.d dVar = this.f33280M;
        if (dVar == null) {
            this.f33280M = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.f33280M.a(i4);
        postDelayed(this.f33280M, 200L);
    }

    private Float l(int i4) {
        float m4;
        if (this.f33313w0) {
            m4 = n(20);
        } else {
            m4 = m();
        }
        if (i4 != 21) {
            if (i4 != 22) {
                if (i4 != 69) {
                    if (i4 != 70 && i4 != 81) {
                        return null;
                    }
                    return Float.valueOf(m4);
                }
                return Float.valueOf(-m4);
            }
            if (R()) {
                m4 = -m4;
            }
            return Float.valueOf(m4);
        }
        if (!R()) {
            m4 = -m4;
        }
        return Float.valueOf(m4);
    }

    private void l0(com.google.android.material.tooltip.a aVar, float f4) {
        aVar.m1(F(f4));
        int a02 = (this.f33294d0 + ((int) (a0(f4) * this.f33311u0))) - (aVar.getIntrinsicWidth() / 2);
        int o4 = o() - (this.f33298h0 + this.f33296f0);
        aVar.setBounds(a02, o4 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + a02, o4);
        Rect rect = new Rect(aVar.getBounds());
        C1783d.c(E.g(this), this, rect);
        aVar.setBounds(rect);
        E.h(this).a(aVar);
    }

    private float m() {
        float f4 = this.f33308r0;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return f4;
    }

    private void m0(@N ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f33305o0.size() == arrayList.size() && this.f33305o0.equals(arrayList)) {
                return;
            }
            this.f33305o0 = arrayList;
            this.f33314x0 = true;
            this.f33307q0 = 0;
            u0();
            s();
            w();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n(int i4) {
        float m4 = m();
        if ((this.f33304n0 - this.f33303m0) / m4 <= i4) {
            return m4;
        }
        return Math.round(r1 / r4) * m4;
    }

    private boolean n0() {
        if (this.f33292b0 == 3) {
            return true;
        }
        return false;
    }

    private int o() {
        int i4 = this.f33295e0;
        int i5 = 0;
        if (this.f33292b0 == 1 || n0()) {
            i5 = this.f33282O.get(0).getIntrinsicHeight();
        }
        return i4 + i5;
    }

    private boolean o0() {
        if (!this.f33312v0 && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    private boolean p0(float f4) {
        return r0(this.f33306p0, f4);
    }

    private double q0(float f4) {
        float f5 = this.f33308r0;
        if (f5 > 0.0f) {
            return Math.round(f4 * r0) / ((int) ((this.f33304n0 - this.f33303m0) / f5));
        }
        return f4;
    }

    private ValueAnimator r(boolean z3) {
        float f4;
        ValueAnimator valueAnimator;
        long j4;
        TimeInterpolator timeInterpolator;
        float f5 = 1.0f;
        if (z3) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        if (z3) {
            valueAnimator = this.f33287T;
        } else {
            valueAnimator = this.f33286S;
        }
        float H3 = H(valueAnimator, f4);
        if (!z3) {
            f5 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(H3, f5);
        if (z3) {
            j4 = f33262Y0;
        } else {
            j4 = f33263Z0;
        }
        ofFloat.setDuration(j4);
        if (z3) {
            timeInterpolator = com.google.android.material.animation.a.f31211e;
        } else {
            timeInterpolator = com.google.android.material.animation.a.f31209c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r0(int i4, float f4) {
        this.f33307q0 = i4;
        if (Math.abs(f4 - this.f33305o0.get(i4).floatValue()) < f33258U0) {
            return false;
        }
        this.f33305o0.set(i4, Float.valueOf(I(i4, f4)));
        v(i4);
        return true;
    }

    private void s() {
        if (this.f33282O.size() > this.f33305o0.size()) {
            List<com.google.android.material.tooltip.a> subList = this.f33282O.subList(this.f33305o0.size(), this.f33282O.size());
            for (com.google.android.material.tooltip.a aVar : subList) {
                if (C0823k0.O0(this)) {
                    t(aVar);
                }
            }
            subList.clear();
        }
        while (this.f33282O.size() < this.f33305o0.size()) {
            com.google.android.material.tooltip.a a4 = this.f33281N.a();
            this.f33282O.add(a4);
            if (C0823k0.O0(this)) {
                k(a4);
            }
        }
        int i4 = 1;
        if (this.f33282O.size() == 1) {
            i4 = 0;
        }
        Iterator<com.google.android.material.tooltip.a> it = this.f33282O.iterator();
        while (it.hasNext()) {
            it.next().I0(i4);
        }
    }

    private boolean s0() {
        return p0(K());
    }

    private void t(com.google.android.material.tooltip.a aVar) {
        D h4 = E.h(this);
        if (h4 != null) {
            h4.b(aVar);
            aVar.X0(E.g(this));
        }
    }

    private float u(float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        float f5 = (f4 - this.f33294d0) / this.f33311u0;
        float f6 = this.f33303m0;
        return (f5 * (f6 - this.f33304n0)) + f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        if (!o0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int a02 = (int) ((a0(this.f33305o0.get(this.f33307q0).floatValue()) * this.f33311u0) + this.f33294d0);
                int o4 = o();
                int i4 = this.f33297g0;
                androidx.core.graphics.drawable.d.l(background, a02 - i4, o4 - i4, a02 + i4, o4 + i4);
            }
        }
    }

    private void v(int i4) {
        Iterator<L> it = this.f33283P.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f33305o0.get(i4).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f33279L;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            k0(i4);
        }
    }

    private void v0(int i4) {
        this.f33311u0 = Math.max(i4 - (this.f33294d0 * 2), 0);
        U();
    }

    private void w() {
        for (L l4 : this.f33283P) {
            Iterator<Float> it = this.f33305o0.iterator();
            while (it.hasNext()) {
                l4.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void w0() {
        if (this.f33314x0) {
            z0();
            A0();
            y0();
            B0();
            x0();
            E0();
            this.f33314x0 = false;
        }
    }

    private void x(@N Canvas canvas, int i4, int i5) {
        float[] G3 = G();
        int i6 = this.f33294d0;
        float f4 = i4;
        float f5 = i5;
        canvas.drawLine(i6 + (G3[0] * f4), f5, i6 + (G3[1] * f4), f5, this.f33270F);
    }

    private void x0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f4 = this.f33308r0;
            if (f4 > 0.0f && minSeparation > 0.0f) {
                if (this.f33275H0 == 1) {
                    if (minSeparation < f4 || !Q(minSeparation)) {
                        throw new IllegalStateException(String.format(f33254Q0, Float.valueOf(minSeparation), Float.valueOf(this.f33308r0), Float.valueOf(this.f33308r0)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format(f33253P0, Float.valueOf(minSeparation), Float.valueOf(this.f33308r0)));
            }
            return;
        }
        throw new IllegalStateException(String.format(f33252O0, Float.valueOf(minSeparation)));
    }

    private void y(@N Canvas canvas, int i4, int i5) {
        float[] G3 = G();
        float f4 = i4;
        float f5 = this.f33294d0 + (G3[1] * f4);
        if (f5 < r1 + i4) {
            float f6 = i5;
            canvas.drawLine(f5, f6, r1 + i4, f6, this.f33268E);
        }
        int i6 = this.f33294d0;
        float f7 = i6 + (G3[0] * f4);
        if (f7 > i6) {
            float f8 = i5;
            canvas.drawLine(i6, f8, f7, f8, this.f33268E);
        }
    }

    private void y0() {
        if (this.f33308r0 > 0.0f && !C0(this.f33304n0)) {
            throw new IllegalStateException(String.format(f33251N0, Float.valueOf(this.f33308r0), Float.valueOf(this.f33303m0), Float.valueOf(this.f33304n0)));
        }
    }

    private void z(@N Canvas canvas, int i4, int i5, float f4, @N Drawable drawable) {
        canvas.save();
        canvas.translate((this.f33294d0 + ((int) (a0(f4) * i4))) - (drawable.getBounds().width() / 2.0f), i5 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void z0() {
        if (this.f33303m0 < this.f33304n0) {
        } else {
            throw new IllegalStateException(String.format(f33249L0, Float.valueOf(this.f33303m0), Float.valueOf(this.f33304n0)));
        }
    }

    @i0
    void E(boolean z3) {
        this.f33312v0 = z3;
    }

    public boolean M() {
        if (this.f33301k0 != null) {
            return true;
        }
        return false;
    }

    final boolean R() {
        if (C0823k0.Z(this) == 1) {
            return true;
        }
        return false;
    }

    public boolean S() {
        return this.f33310t0;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@N MotionEvent motionEvent) {
        if (!this.f33278K.v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@N KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33268E.setColor(J(this.f33266C0));
        this.f33270F.setColor(J(this.f33265B0));
        this.f33276I.setColor(J(this.f33264A0));
        this.f33277J.setColor(J(this.f33316z0));
        for (com.google.android.material.tooltip.a aVar : this.f33282O) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f33267D0.isStateful()) {
            this.f33267D0.setState(getDrawableState());
        }
        this.f33274H.setColor(J(this.f33315y0));
        this.f33274H.setAlpha(63);
    }

    protected boolean f0() {
        boolean z3;
        if (this.f33306p0 != -1) {
            return true;
        }
        float L3 = L();
        float D02 = D0(L3);
        this.f33306p0 = 0;
        float abs = Math.abs(this.f33305o0.get(0).floatValue() - L3);
        for (int i4 = 1; i4 < this.f33305o0.size(); i4++) {
            float abs2 = Math.abs(this.f33305o0.get(i4).floatValue() - L3);
            float D03 = D0(this.f33305o0.get(i4).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!R() ? D03 - D02 < 0.0f : D03 - D02 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f33306p0 = i4;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(D03 - D02) < this.f33288U) {
                        this.f33306p0 = -1;
                        return false;
                    }
                    if (z3) {
                        this.f33306p0 = i4;
                    }
                }
            }
            abs = abs2;
        }
        if (this.f33306p0 != -1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    @N
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @i0
    final int getAccessibilityFocusedVirtualViewId() {
        return this.f33278K.x();
    }

    public int getActiveThumbIndex() {
        return this.f33306p0;
    }

    public int getFocusedThumbIndex() {
        return this.f33307q0;
    }

    @r
    public int getHaloRadius() {
        return this.f33297g0;
    }

    @N
    public ColorStateList getHaloTintList() {
        return this.f33315y0;
    }

    public int getLabelBehavior() {
        return this.f33292b0;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f33308r0;
    }

    public float getThumbElevation() {
        return this.f33267D0.x();
    }

    @r
    public int getThumbRadius() {
        return this.f33296f0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f33267D0.N();
    }

    public float getThumbStrokeWidth() {
        return this.f33267D0.Q();
    }

    @N
    public ColorStateList getThumbTintList() {
        return this.f33267D0.y();
    }

    @N
    public ColorStateList getTickActiveTintList() {
        return this.f33316z0;
    }

    @N
    public ColorStateList getTickInactiveTintList() {
        return this.f33264A0;
    }

    @N
    public ColorStateList getTickTintList() {
        if (this.f33264A0.equals(this.f33316z0)) {
            return this.f33316z0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @N
    public ColorStateList getTrackActiveTintList() {
        return this.f33265B0;
    }

    @r
    public int getTrackHeight() {
        return this.f33293c0;
    }

    @N
    public ColorStateList getTrackInactiveTintList() {
        return this.f33266C0;
    }

    @r
    public int getTrackSidePadding() {
        return this.f33294d0;
    }

    @N
    public ColorStateList getTrackTintList() {
        if (this.f33266C0.equals(this.f33265B0)) {
            return this.f33265B0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @r
    public int getTrackWidth() {
        return this.f33311u0;
    }

    public float getValueFrom() {
        return this.f33303m0;
    }

    public float getValueTo() {
        return this.f33304n0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public List<Float> getValues() {
        return new ArrayList(this.f33305o0);
    }

    public void h(@N L l4) {
        this.f33283P.add(l4);
    }

    public void i(@N T t3) {
        this.f33284Q.add(t3);
    }

    public void i0(@N L l4) {
        this.f33283P.remove(l4);
    }

    public void j0(@N T t3) {
        this.f33284Q.remove(t3);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<com.google.android.material.tooltip.a> it = this.f33282O.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        c<S, L, T>.d dVar = this.f33280M;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f33285R = false;
        Iterator<com.google.android.material.tooltip.a> it = this.f33282O.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@N Canvas canvas) {
        if (this.f33314x0) {
            w0();
            U();
        }
        super.onDraw(canvas);
        int o4 = o();
        y(canvas, this.f33311u0, o4);
        if (((Float) Collections.max(getValues())).floatValue() > this.f33303m0) {
            x(canvas, this.f33311u0, o4);
        }
        W(canvas);
        if ((this.f33302l0 || isFocused() || n0()) && isEnabled()) {
            V(canvas, this.f33311u0, o4);
            if (this.f33306p0 == -1 && !n0()) {
                C();
            } else {
                B();
            }
        } else {
            C();
        }
        A(canvas, this.f33311u0, o4);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z3, int i4, @P Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (!z3) {
            this.f33306p0 = -1;
            this.f33278K.o(this.f33307q0);
        } else {
            D(i4);
            this.f33278K.X(this.f33307q0);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, @N KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i4, keyEvent);
        }
        if (this.f33305o0.size() == 1) {
            this.f33306p0 = 0;
        }
        if (this.f33306p0 == -1) {
            Boolean b02 = b0(i4, keyEvent);
            if (b02 != null) {
                return b02.booleanValue();
            }
            return super.onKeyDown(i4, keyEvent);
        }
        this.f33313w0 |= keyEvent.isLongPress();
        Float l4 = l(i4);
        if (l4 != null) {
            if (p0(this.f33305o0.get(this.f33306p0).floatValue() + l4.floatValue())) {
                u0();
                postInvalidate();
            }
            return true;
        }
        if (i4 != 23) {
            if (i4 != 61) {
                if (i4 != 66) {
                    return super.onKeyDown(i4, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return Y(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return Y(-1);
            }
        }
        this.f33306p0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, @N KeyEvent keyEvent) {
        this.f33313w0 = false;
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6 = this.f33291a0;
        int i7 = 0;
        if (this.f33292b0 == 1 || n0()) {
            i7 = this.f33282O.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(i6 + i7, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f33303m0 = fVar.f33326E;
        this.f33304n0 = fVar.f33327F;
        m0(fVar.f33328G);
        this.f33308r0 = fVar.f33329H;
        if (fVar.f33330I) {
            requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f33326E = this.f33303m0;
        fVar.f33327F = this.f33304n0;
        fVar.f33328G = new ArrayList<>(this.f33305o0);
        fVar.f33329H = this.f33308r0;
        fVar.f33330I = hasFocus();
        return fVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        v0(i4);
        u0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@N MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x3 = motionEvent.getX();
        float f4 = (x3 - this.f33294d0) / this.f33311u0;
        this.f33273G0 = f4;
        float max = Math.max(0.0f, f4);
        this.f33273G0 = max;
        this.f33273G0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f33302l0) {
                        if (P() && Math.abs(x3 - this.f33299i0) < this.f33288U) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        c0();
                    }
                    if (f0()) {
                        this.f33302l0 = true;
                        s0();
                        u0();
                        invalidate();
                    }
                }
            } else {
                this.f33302l0 = false;
                MotionEvent motionEvent2 = this.f33300j0;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f33300j0.getX() - motionEvent.getX()) <= this.f33288U && Math.abs(this.f33300j0.getY() - motionEvent.getY()) <= this.f33288U && f0()) {
                    c0();
                }
                if (this.f33306p0 != -1) {
                    s0();
                    this.f33306p0 = -1;
                    d0();
                }
                invalidate();
            }
        } else {
            this.f33299i0 = x3;
            if (!P()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (f0()) {
                    requestFocus();
                    this.f33302l0 = true;
                    s0();
                    u0();
                    invalidate();
                    c0();
                }
            }
        }
        setPressed(this.f33302l0);
        this.f33300j0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void p() {
        this.f33283P.clear();
    }

    public void q() {
        this.f33284Q.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setActiveThumbIndex(int i4) {
        this.f33306p0 = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@InterfaceC0578v int i4) {
        setCustomThumbDrawable(getResources().getDrawable(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawablesForValues(@N @InterfaceC0578v int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            drawableArr[i4] = getResources().getDrawable(iArr[i4]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        int i4;
        super.setEnabled(z3);
        if (z3) {
            i4 = 0;
        } else {
            i4 = 2;
        }
        setLayerType(i4, null);
    }

    public void setFocusedThumbIndex(int i4) {
        if (i4 >= 0 && i4 < this.f33305o0.size()) {
            this.f33307q0 = i4;
            this.f33278K.X(i4);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(@F(from = 0) @r int i4) {
        if (i4 == this.f33297g0) {
            return;
        }
        this.f33297g0 = i4;
        Drawable background = getBackground();
        if (!o0() && (background instanceof RippleDrawable)) {
            Y0.a.b((RippleDrawable) background, this.f33297g0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@InterfaceC0574q int i4) {
        setHaloRadius(getResources().getDimensionPixelSize(i4));
    }

    public void setHaloTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33315y0)) {
            return;
        }
        this.f33315y0 = colorStateList;
        Drawable background = getBackground();
        if (!o0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f33274H.setColor(J(colorStateList));
        this.f33274H.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i4) {
        if (this.f33292b0 != i4) {
            this.f33292b0 = i4;
            requestLayout();
        }
    }

    public void setLabelFormatter(@P com.google.android.material.slider.e eVar) {
        this.f33301k0 = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSeparationUnit(int i4) {
        this.f33275H0 = i4;
        this.f33314x0 = true;
        postInvalidate();
    }

    public void setStepSize(float f4) {
        if (f4 >= 0.0f) {
            if (this.f33308r0 != f4) {
                this.f33308r0 = f4;
                this.f33314x0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format(f33251N0, Float.valueOf(f4), Float.valueOf(this.f33303m0), Float.valueOf(this.f33304n0)));
    }

    public void setThumbElevation(float f4) {
        this.f33267D0.n0(f4);
    }

    public void setThumbElevationResource(@InterfaceC0574q int i4) {
        setThumbElevation(getResources().getDimension(i4));
    }

    public void setThumbRadius(@F(from = 0) @r int i4) {
        if (i4 == this.f33296f0) {
            return;
        }
        this.f33296f0 = i4;
        X();
        this.f33267D0.setShapeAppearanceModel(o.a().q(0, this.f33296f0).m());
        j jVar = this.f33267D0;
        int i5 = this.f33296f0;
        jVar.setBounds(0, 0, i5 * 2, i5 * 2);
        Drawable drawable = this.f33269E0;
        if (drawable != null) {
            j(drawable);
        }
        Iterator<Drawable> it = this.f33271F0.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        postInvalidate();
    }

    public void setThumbRadiusResource(@InterfaceC0574q int i4) {
        setThumbRadius(getResources().getDimensionPixelSize(i4));
    }

    public void setThumbStrokeColor(@P ColorStateList colorStateList) {
        this.f33267D0.F0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@InterfaceC0571n int i4) {
        if (i4 != 0) {
            setThumbStrokeColor(C2046a.a(getContext(), i4));
        }
    }

    public void setThumbStrokeWidth(float f4) {
        this.f33267D0.I0(f4);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@InterfaceC0574q int i4) {
        if (i4 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i4));
        }
    }

    public void setThumbTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33267D0.y())) {
            return;
        }
        this.f33267D0.o0(colorStateList);
        invalidate();
    }

    public void setTickActiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33316z0)) {
            return;
        }
        this.f33316z0 = colorStateList;
        this.f33277J.setColor(J(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33264A0)) {
            return;
        }
        this.f33264A0 = colorStateList;
        this.f33276I.setColor(J(colorStateList));
        invalidate();
    }

    public void setTickTintList(@N ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z3) {
        if (this.f33310t0 != z3) {
            this.f33310t0 = z3;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33265B0)) {
            return;
        }
        this.f33265B0 = colorStateList;
        this.f33270F.setColor(J(colorStateList));
        invalidate();
    }

    public void setTrackHeight(@F(from = 0) @r int i4) {
        if (this.f33293c0 != i4) {
            this.f33293c0 = i4;
            O();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@N ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33266C0)) {
            return;
        }
        this.f33266C0 = colorStateList;
        this.f33268E.setColor(J(colorStateList));
        invalidate();
    }

    public void setTrackTintList(@N ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f4) {
        this.f33303m0 = f4;
        this.f33314x0 = true;
        postInvalidate();
    }

    public void setValueTo(float f4) {
        this.f33304n0 = f4;
        this.f33314x0 = true;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@N Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        m0(arrayList);
    }

    void t0(int i4, Rect rect) {
        int a02 = this.f33294d0 + ((int) (a0(getValues().get(i4).floatValue()) * this.f33311u0));
        int o4 = o();
        int i5 = this.f33296f0;
        rect.set(a02 - i5, o4 - i5, a02 + i5, o4 + i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        int f33322E;

        private d() {
            this.f33322E = -1;
        }

        void a(int i4) {
            this.f33322E = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f33278K.Y(this.f33322E, 4);
        }

        /* synthetic */ d(c cVar, a aVar) {
            this();
        }
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.ie);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawable(@N Drawable drawable) {
        this.f33269E0 = N(drawable);
        this.f33271F0.clear();
        postInvalidate();
    }

    public c(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(C2044a.c(context, attributeSet, i4, f33259V0), attributeSet, i4);
        this.f33282O = new ArrayList();
        this.f33283P = new ArrayList();
        this.f33284Q = new ArrayList();
        this.f33285R = false;
        this.f33302l0 = false;
        this.f33305o0 = new ArrayList<>();
        this.f33306p0 = -1;
        this.f33307q0 = -1;
        this.f33308r0 = 0.0f;
        this.f33310t0 = true;
        this.f33313w0 = false;
        j jVar = new j();
        this.f33267D0 = jVar;
        this.f33271F0 = Collections.emptyList();
        this.f33275H0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f33268E = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f33270F = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f33272G = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f33274H = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f33276I = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f33277J = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        T(context2.getResources());
        this.f33281N = new a(attributeSet, i4);
        h0(context2, attributeSet, i4);
        setFocusable(true);
        setClickable(true);
        jVar.x0(2);
        this.f33288U = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f33278K = eVar;
        C0823k0.B1(this, eVar);
        this.f33279L = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(@N List<Float> list) {
        m0(new ArrayList<>(list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomThumbDrawablesForValues(@N Drawable... drawableArr) {
        this.f33269E0 = null;
        this.f33271F0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f33271F0.add(N(drawable));
        }
        postInvalidate();
    }
}
