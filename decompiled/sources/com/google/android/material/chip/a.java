package com.google.android.material.chip;

import T0.a;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0565h;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.k0;
import androidx.annotation.r;
import androidx.core.graphics.C0734z;
import androidx.core.graphics.drawable.d;
import androidx.core.graphics.drawable.k;
import androidx.core.text.C0753a;
import androidx.core.view.C0823k0;
import com.google.android.material.animation.h;
import com.google.android.material.color.s;
import com.google.android.material.internal.E;
import com.google.android.material.internal.t;
import com.google.android.material.internal.w;
import com.google.android.material.resources.c;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.j;
import e.C2046a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlinx.coroutines.scheduling.q;
import o.InterfaceMenuC2377a;

/* loaded from: classes2.dex */
public class a extends j implements k, Drawable.Callback, t.b {

    /* renamed from: s1, reason: collision with root package name */
    private static final boolean f31825s1 = false;

    /* renamed from: u1, reason: collision with root package name */
    private static final String f31827u1 = "http://schemas.android.com/apk/res-auto";

    /* renamed from: v1, reason: collision with root package name */
    private static final int f31828v1 = 24;

    /* renamed from: A0, reason: collision with root package name */
    @P
    private CharSequence f31830A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f31831B0;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f31832C0;

    /* renamed from: D0, reason: collision with root package name */
    @P
    private Drawable f31833D0;

    /* renamed from: E0, reason: collision with root package name */
    @P
    private ColorStateList f31834E0;

    /* renamed from: F0, reason: collision with root package name */
    @P
    private h f31835F0;

    /* renamed from: G0, reason: collision with root package name */
    @P
    private h f31836G0;

    /* renamed from: H0, reason: collision with root package name */
    private float f31837H0;

    /* renamed from: I0, reason: collision with root package name */
    private float f31838I0;

    /* renamed from: J0, reason: collision with root package name */
    private float f31839J0;

    /* renamed from: K0, reason: collision with root package name */
    private float f31840K0;

    /* renamed from: L0, reason: collision with root package name */
    private float f31841L0;

    /* renamed from: M0, reason: collision with root package name */
    private float f31842M0;

    /* renamed from: N0, reason: collision with root package name */
    private float f31843N0;

    /* renamed from: O0, reason: collision with root package name */
    private float f31844O0;

    /* renamed from: P0, reason: collision with root package name */
    @N
    private final Context f31845P0;

    /* renamed from: Q0, reason: collision with root package name */
    private final Paint f31846Q0;

    /* renamed from: R0, reason: collision with root package name */
    @P
    private final Paint f31847R0;

    /* renamed from: S0, reason: collision with root package name */
    private final Paint.FontMetrics f31848S0;

    /* renamed from: T0, reason: collision with root package name */
    private final RectF f31849T0;

    /* renamed from: U0, reason: collision with root package name */
    private final PointF f31850U0;

    /* renamed from: V0, reason: collision with root package name */
    private final Path f31851V0;

    /* renamed from: W0, reason: collision with root package name */
    @N
    private final t f31852W0;

    /* renamed from: X0, reason: collision with root package name */
    @InterfaceC0569l
    private int f31853X0;

    /* renamed from: Y0, reason: collision with root package name */
    @InterfaceC0569l
    private int f31854Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @InterfaceC0569l
    private int f31855Z0;

    /* renamed from: a1, reason: collision with root package name */
    @InterfaceC0569l
    private int f31856a1;

    /* renamed from: b1, reason: collision with root package name */
    @InterfaceC0569l
    private int f31857b1;

    /* renamed from: c1, reason: collision with root package name */
    @InterfaceC0569l
    private int f31858c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f31859d1;

    /* renamed from: e1, reason: collision with root package name */
    @InterfaceC0569l
    private int f31860e1;

    /* renamed from: f1, reason: collision with root package name */
    private int f31861f1;

    /* renamed from: g1, reason: collision with root package name */
    @P
    private ColorFilter f31862g1;

    /* renamed from: h1, reason: collision with root package name */
    @P
    private PorterDuffColorFilter f31863h1;

    /* renamed from: i0, reason: collision with root package name */
    @P
    private ColorStateList f31864i0;

    /* renamed from: i1, reason: collision with root package name */
    @P
    private ColorStateList f31865i1;

    /* renamed from: j0, reason: collision with root package name */
    @P
    private ColorStateList f31866j0;

    /* renamed from: j1, reason: collision with root package name */
    @P
    private PorterDuff.Mode f31867j1;

    /* renamed from: k0, reason: collision with root package name */
    private float f31868k0;

    /* renamed from: k1, reason: collision with root package name */
    private int[] f31869k1;

    /* renamed from: l0, reason: collision with root package name */
    private float f31870l0;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f31871l1;

    /* renamed from: m0, reason: collision with root package name */
    @P
    private ColorStateList f31872m0;

    /* renamed from: m1, reason: collision with root package name */
    @P
    private ColorStateList f31873m1;

    /* renamed from: n0, reason: collision with root package name */
    private float f31874n0;

    /* renamed from: n1, reason: collision with root package name */
    @N
    private WeakReference<InterfaceC0280a> f31875n1;

    /* renamed from: o0, reason: collision with root package name */
    @P
    private ColorStateList f31876o0;

    /* renamed from: o1, reason: collision with root package name */
    private TextUtils.TruncateAt f31877o1;

    /* renamed from: p0, reason: collision with root package name */
    @P
    private CharSequence f31878p0;

    /* renamed from: p1, reason: collision with root package name */
    private boolean f31879p1;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f31880q0;

    /* renamed from: q1, reason: collision with root package name */
    private int f31881q1;

    /* renamed from: r0, reason: collision with root package name */
    @P
    private Drawable f31882r0;

    /* renamed from: r1, reason: collision with root package name */
    private boolean f31883r1;

    /* renamed from: s0, reason: collision with root package name */
    @P
    private ColorStateList f31884s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f31885t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f31886u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f31887v0;

    /* renamed from: w0, reason: collision with root package name */
    @P
    private Drawable f31888w0;

    /* renamed from: x0, reason: collision with root package name */
    @P
    private Drawable f31889x0;

    /* renamed from: y0, reason: collision with root package name */
    @P
    private ColorStateList f31890y0;

    /* renamed from: z0, reason: collision with root package name */
    private float f31891z0;

    /* renamed from: t1, reason: collision with root package name */
    private static final int[] f31826t1 = {R.attr.state_enabled};

    /* renamed from: w1, reason: collision with root package name */
    private static final ShapeDrawable f31829w1 = new ShapeDrawable(new OvalShape());

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0280a {
        void a();
    }

    private a(@N Context context, AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        super(context, attributeSet, i4, i5);
        this.f31870l0 = -1.0f;
        this.f31846Q0 = new Paint(1);
        this.f31848S0 = new Paint.FontMetrics();
        this.f31849T0 = new RectF();
        this.f31850U0 = new PointF();
        this.f31851V0 = new Path();
        this.f31861f1 = 255;
        this.f31867j1 = PorterDuff.Mode.SRC_IN;
        this.f31875n1 = new WeakReference<>(null);
        Z(context);
        this.f31845P0 = context;
        t tVar = new t(this);
        this.f31852W0 = tVar;
        this.f31878p0 = "";
        tVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f31847R0 = null;
        int[] iArr = f31826t1;
        setState(iArr);
        f3(iArr);
        this.f31879p1 = true;
        if (b.f33040a) {
            f31829w1.setTint(-1);
        }
    }

    private float G1() {
        Drawable drawable;
        if (this.f31859d1) {
            drawable = this.f31833D0;
        } else {
            drawable = this.f31882r0;
        }
        float f4 = this.f31885t0;
        if (f4 <= 0.0f && drawable != null) {
            f4 = (float) Math.ceil(E.e(this.f31845P0, 24));
            if (drawable.getIntrinsicHeight() <= f4) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f4;
    }

    private float H1() {
        Drawable drawable;
        if (this.f31859d1) {
            drawable = this.f31833D0;
        } else {
            drawable = this.f31882r0;
        }
        float f4 = this.f31885t0;
        if (f4 <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f4;
    }

    private boolean L3() {
        if (this.f31832C0 && this.f31833D0 != null && this.f31859d1) {
            return true;
        }
        return false;
    }

    private boolean M3() {
        if (this.f31880q0 && this.f31882r0 != null) {
            return true;
        }
        return false;
    }

    private boolean N3() {
        if (this.f31887v0 && this.f31888w0 != null) {
            return true;
        }
        return false;
    }

    private void O3(@P Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void P0(@P Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        d.m(drawable, d.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f31888w0) {
            if (drawable.isStateful()) {
                drawable.setState(D1());
            }
            d.o(drawable, this.f31890y0);
            return;
        }
        Drawable drawable2 = this.f31882r0;
        if (drawable == drawable2 && this.f31886u0) {
            d.o(drawable2, this.f31884s0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void P3() {
        ColorStateList colorStateList;
        if (this.f31871l1) {
            colorStateList = b.d(this.f31876o0);
        } else {
            colorStateList = null;
        }
        this.f31873m1 = colorStateList;
    }

    private void Q0(@N Rect rect, @N RectF rectF) {
        rectF.setEmpty();
        if (M3() || L3()) {
            float f4 = this.f31837H0 + this.f31838I0;
            float H12 = H1();
            if (d.f(this) == 0) {
                float f5 = rect.left + f4;
                rectF.left = f5;
                rectF.right = f5 + H12;
            } else {
                float f6 = rect.right - f4;
                rectF.right = f6;
                rectF.left = f6 - H12;
            }
            float G12 = G1();
            float exactCenterY = rect.exactCenterY() - (G12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + G12;
        }
    }

    @TargetApi(21)
    private void Q3() {
        this.f31889x0 = new RippleDrawable(b.d(N1()), this.f31888w0, f31829w1);
    }

    private void S0(@N Rect rect, @N RectF rectF) {
        rectF.set(rect);
        if (N3()) {
            float f4 = this.f31844O0 + this.f31843N0 + this.f31891z0 + this.f31842M0 + this.f31841L0;
            if (d.f(this) == 0) {
                rectF.right = rect.right - f4;
            } else {
                rectF.left = rect.left + f4;
            }
        }
    }

    private void T0(@N Rect rect, @N RectF rectF) {
        rectF.setEmpty();
        if (N3()) {
            float f4 = this.f31844O0 + this.f31843N0;
            if (d.f(this) == 0) {
                float f5 = rect.right - f4;
                rectF.right = f5;
                rectF.left = f5 - this.f31891z0;
            } else {
                float f6 = rect.left + f4;
                rectF.left = f6;
                rectF.right = f6 + this.f31891z0;
            }
            float exactCenterY = rect.exactCenterY();
            float f7 = this.f31891z0;
            float f8 = exactCenterY - (f7 / 2.0f);
            rectF.top = f8;
            rectF.bottom = f8 + f7;
        }
    }

    @P
    private ColorFilter T1() {
        ColorFilter colorFilter = this.f31862g1;
        if (colorFilter == null) {
            return this.f31863h1;
        }
        return colorFilter;
    }

    private void T2(@P ColorStateList colorStateList) {
        if (this.f31864i0 != colorStateList) {
            this.f31864i0 = colorStateList;
            onStateChange(getState());
        }
    }

    private void U0(@N Rect rect, @N RectF rectF) {
        rectF.setEmpty();
        if (N3()) {
            float f4 = this.f31844O0 + this.f31843N0 + this.f31891z0 + this.f31842M0 + this.f31841L0;
            if (d.f(this) == 0) {
                float f5 = rect.right;
                rectF.right = f5;
                rectF.left = f5 - f4;
            } else {
                int i4 = rect.left;
                rectF.left = i4;
                rectF.right = i4 + f4;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean V1(@P int[] iArr, @InterfaceC0563f int i4) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    private void W0(@N Rect rect, @N RectF rectF) {
        rectF.setEmpty();
        if (this.f31878p0 != null) {
            float R02 = this.f31837H0 + R0() + this.f31840K0;
            float V02 = this.f31844O0 + V0() + this.f31841L0;
            if (d.f(this) == 0) {
                rectF.left = rect.left + R02;
                rectF.right = rect.right - V02;
            } else {
                rectF.left = rect.left + V02;
                rectF.right = rect.right - R02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float X0() {
        this.f31852W0.e().getFontMetrics(this.f31848S0);
        Paint.FontMetrics fontMetrics = this.f31848S0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean Z0() {
        if (this.f31832C0 && this.f31833D0 != null && this.f31831B0) {
            return true;
        }
        return false;
    }

    @N
    public static a a1(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        a aVar = new a(context, attributeSet, i4, i5);
        aVar.i2(attributeSet, i4, i5);
        return aVar;
    }

    @N
    public static a b1(@N Context context, @k0 int i4) {
        AttributeSet a4 = Y0.a.a(context, i4, "chip");
        int styleAttribute = a4.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = a.n.Dh;
        }
        return a1(context, a4, a.c.f1908a2, styleAttribute);
    }

    private void c1(@N Canvas canvas, @N Rect rect) {
        if (L3()) {
            Q0(rect, this.f31849T0);
            RectF rectF = this.f31849T0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f31833D0.setBounds(0, 0, (int) this.f31849T0.width(), (int) this.f31849T0.height());
            this.f31833D0.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    private void d1(@N Canvas canvas, @N Rect rect) {
        if (!this.f31883r1) {
            this.f31846Q0.setColor(this.f31854Y0);
            this.f31846Q0.setStyle(Paint.Style.FILL);
            this.f31846Q0.setColorFilter(T1());
            this.f31849T0.set(rect);
            canvas.drawRoundRect(this.f31849T0, o1(), o1(), this.f31846Q0);
        }
    }

    private void e1(@N Canvas canvas, @N Rect rect) {
        if (M3()) {
            Q0(rect, this.f31849T0);
            RectF rectF = this.f31849T0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f31882r0.setBounds(0, 0, (int) this.f31849T0.width(), (int) this.f31849T0.height());
            this.f31882r0.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    private void f1(@N Canvas canvas, @N Rect rect) {
        if (this.f31874n0 > 0.0f && !this.f31883r1) {
            this.f31846Q0.setColor(this.f31856a1);
            this.f31846Q0.setStyle(Paint.Style.STROKE);
            if (!this.f31883r1) {
                this.f31846Q0.setColorFilter(T1());
            }
            RectF rectF = this.f31849T0;
            float f4 = rect.left;
            float f5 = this.f31874n0;
            rectF.set(f4 + (f5 / 2.0f), rect.top + (f5 / 2.0f), rect.right - (f5 / 2.0f), rect.bottom - (f5 / 2.0f));
            float f6 = this.f31870l0 - (this.f31874n0 / 2.0f);
            canvas.drawRoundRect(this.f31849T0, f6, f6, this.f31846Q0);
        }
    }

    private static boolean f2(@P ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    private void g1(@N Canvas canvas, @N Rect rect) {
        if (!this.f31883r1) {
            this.f31846Q0.setColor(this.f31853X0);
            this.f31846Q0.setStyle(Paint.Style.FILL);
            this.f31849T0.set(rect);
            canvas.drawRoundRect(this.f31849T0, o1(), o1(), this.f31846Q0);
        }
    }

    private static boolean g2(@P Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    private void h1(@N Canvas canvas, @N Rect rect) {
        if (N3()) {
            T0(rect, this.f31849T0);
            RectF rectF = this.f31849T0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f31888w0.setBounds(0, 0, (int) this.f31849T0.width(), (int) this.f31849T0.height());
            if (b.f33040a) {
                this.f31889x0.setBounds(this.f31888w0.getBounds());
                this.f31889x0.jumpToCurrentState();
                this.f31889x0.draw(canvas);
            } else {
                this.f31888w0.draw(canvas);
            }
            canvas.translate(-f4, -f5);
        }
    }

    private static boolean h2(@P com.google.android.material.resources.d dVar) {
        if (dVar != null && dVar.i() != null && dVar.i().isStateful()) {
            return true;
        }
        return false;
    }

    private void i1(@N Canvas canvas, @N Rect rect) {
        this.f31846Q0.setColor(this.f31857b1);
        this.f31846Q0.setStyle(Paint.Style.FILL);
        this.f31849T0.set(rect);
        if (!this.f31883r1) {
            canvas.drawRoundRect(this.f31849T0, o1(), o1(), this.f31846Q0);
        } else {
            h(new RectF(rect), this.f31851V0);
            super.q(canvas, this.f31846Q0, this.f31851V0, v());
        }
    }

    private void i2(@P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        TypedArray j4 = w.j(this.f31845P0, attributeSet, a.o.w5, i4, i5, new int[0]);
        this.f31883r1 = j4.hasValue(a.o.i6);
        T2(c.a(this.f31845P0, j4, a.o.V5));
        v2(c.a(this.f31845P0, j4, a.o.I5));
        L2(j4.getDimension(a.o.Q5, 0.0f));
        if (j4.hasValue(a.o.J5)) {
            x2(j4.getDimension(a.o.J5, 0.0f));
        }
        P2(c.a(this.f31845P0, j4, a.o.T5));
        R2(j4.getDimension(a.o.U5, 0.0f));
        t3(c.a(this.f31845P0, j4, a.o.h6));
        y3(j4.getText(a.o.C5));
        com.google.android.material.resources.d g4 = c.g(this.f31845P0, j4, a.o.x5);
        g4.l(j4.getDimension(a.o.y5, g4.j()));
        z3(g4);
        int i6 = j4.getInt(a.o.A5, 0);
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    l3(TextUtils.TruncateAt.END);
                }
            } else {
                l3(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            l3(TextUtils.TruncateAt.START);
        }
        K2(j4.getBoolean(a.o.P5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f31827u1, "chipIconEnabled") != null && attributeSet.getAttributeValue(f31827u1, "chipIconVisible") == null) {
            K2(j4.getBoolean(a.o.M5, false));
        }
        B2(c.e(this.f31845P0, j4, a.o.L5));
        if (j4.hasValue(a.o.O5)) {
            H2(c.a(this.f31845P0, j4, a.o.O5));
        }
        F2(j4.getDimension(a.o.N5, -1.0f));
        j3(j4.getBoolean(a.o.c6, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f31827u1, "closeIconEnabled") != null && attributeSet.getAttributeValue(f31827u1, "closeIconVisible") == null) {
            j3(j4.getBoolean(a.o.X5, false));
        }
        U2(c.e(this.f31845P0, j4, a.o.W5));
        g3(c.a(this.f31845P0, j4, a.o.b6));
        b3(j4.getDimension(a.o.Z5, 0.0f));
        l2(j4.getBoolean(a.o.D5, false));
        u2(j4.getBoolean(a.o.H5, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f31827u1, "checkedIconEnabled") != null && attributeSet.getAttributeValue(f31827u1, "checkedIconVisible") == null) {
            u2(j4.getBoolean(a.o.F5, false));
        }
        n2(c.e(this.f31845P0, j4, a.o.E5));
        if (j4.hasValue(a.o.G5)) {
            r2(c.a(this.f31845P0, j4, a.o.G5));
        }
        w3(h.c(this.f31845P0, j4, a.o.k6));
        m3(h.c(this.f31845P0, j4, a.o.e6));
        N2(j4.getDimension(a.o.S5, 0.0f));
        q3(j4.getDimension(a.o.g6, 0.0f));
        o3(j4.getDimension(a.o.f6, 0.0f));
        H3(j4.getDimension(a.o.m6, 0.0f));
        D3(j4.getDimension(a.o.l6, 0.0f));
        d3(j4.getDimension(a.o.a6, 0.0f));
        Y2(j4.getDimension(a.o.Y5, 0.0f));
        z2(j4.getDimension(a.o.K5, 0.0f));
        s3(j4.getDimensionPixelSize(a.o.B5, Integer.MAX_VALUE));
        j4.recycle();
    }

    private void j1(@N Canvas canvas, @N Rect rect) {
        Paint paint = this.f31847R0;
        if (paint != null) {
            paint.setColor(C0734z.B(C0823k0.f13589t, q.f54649c));
            canvas.drawRect(rect, this.f31847R0);
            if (M3() || L3()) {
                Q0(rect, this.f31849T0);
                canvas.drawRect(this.f31849T0, this.f31847R0);
            }
            if (this.f31878p0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f31847R0);
            }
            if (N3()) {
                T0(rect, this.f31849T0);
                canvas.drawRect(this.f31849T0, this.f31847R0);
            }
            this.f31847R0.setColor(C0734z.B(InterfaceMenuC2377a.f55290c, q.f54649c));
            S0(rect, this.f31849T0);
            canvas.drawRect(this.f31849T0, this.f31847R0);
            this.f31847R0.setColor(C0734z.B(-16711936, q.f54649c));
            U0(rect, this.f31849T0);
            canvas.drawRect(this.f31849T0, this.f31847R0);
        }
    }

    private void k1(@N Canvas canvas, @N Rect rect) {
        boolean z3;
        if (this.f31878p0 != null) {
            Paint.Align Y02 = Y0(rect, this.f31850U0);
            W0(rect, this.f31849T0);
            if (this.f31852W0.d() != null) {
                this.f31852W0.e().drawableState = getState();
                this.f31852W0.k(this.f31845P0);
            }
            this.f31852W0.e().setTextAlign(Y02);
            int i4 = 0;
            if (Math.round(this.f31852W0.f(P1().toString())) > Math.round(this.f31849T0.width())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = canvas.save();
                canvas.clipRect(this.f31849T0);
            }
            CharSequence charSequence = this.f31878p0;
            if (z3 && this.f31877o1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f31852W0.e(), this.f31849T0.width(), this.f31877o1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f31850U0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f31852W0.e());
            if (z3) {
                canvas.restoreToCount(i4);
            }
        }
    }

    private boolean k2(@N int[] iArr, @N int[] iArr2) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        int i9;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f31864i0;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(iArr, this.f31853X0);
        } else {
            i4 = 0;
        }
        int l4 = l(i4);
        boolean z7 = true;
        if (this.f31853X0 != l4) {
            this.f31853X0 = l4;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f31866j0;
        if (colorStateList2 != null) {
            i5 = colorStateList2.getColorForState(iArr, this.f31854Y0);
        } else {
            i5 = 0;
        }
        int l5 = l(i5);
        if (this.f31854Y0 != l5) {
            this.f31854Y0 = l5;
            onStateChange = true;
        }
        int l6 = s.l(l4, l5);
        if (this.f31855Z0 != l6) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (y() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 | z4) {
            this.f31855Z0 = l6;
            o0(ColorStateList.valueOf(l6));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f31872m0;
        if (colorStateList3 != null) {
            i6 = colorStateList3.getColorForState(iArr, this.f31856a1);
        } else {
            i6 = 0;
        }
        if (this.f31856a1 != i6) {
            this.f31856a1 = i6;
            onStateChange = true;
        }
        if (this.f31873m1 != null && b.e(iArr)) {
            i7 = this.f31873m1.getColorForState(iArr, this.f31857b1);
        } else {
            i7 = 0;
        }
        if (this.f31857b1 != i7) {
            this.f31857b1 = i7;
            if (this.f31871l1) {
                onStateChange = true;
            }
        }
        if (this.f31852W0.d() != null && this.f31852W0.d().i() != null) {
            i8 = this.f31852W0.d().i().getColorForState(iArr, this.f31858c1);
        } else {
            i8 = 0;
        }
        if (this.f31858c1 != i8) {
            this.f31858c1 = i8;
            onStateChange = true;
        }
        if (V1(getState(), R.attr.state_checked) && this.f31831B0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f31859d1 != z5 && this.f31833D0 != null) {
            float R02 = R0();
            this.f31859d1 = z5;
            if (R02 != R0()) {
                onStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                onStateChange = true;
            }
        } else {
            z6 = false;
        }
        ColorStateList colorStateList4 = this.f31865i1;
        if (colorStateList4 != null) {
            i9 = colorStateList4.getColorForState(iArr, this.f31860e1);
        } else {
            i9 = 0;
        }
        if (this.f31860e1 != i9) {
            this.f31860e1 = i9;
            this.f31863h1 = Y0.a.c(this, this.f31865i1, this.f31867j1);
        } else {
            z7 = onStateChange;
        }
        if (g2(this.f31882r0)) {
            z7 |= this.f31882r0.setState(iArr);
        }
        if (g2(this.f31833D0)) {
            z7 |= this.f31833D0.setState(iArr);
        }
        if (g2(this.f31888w0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z7 |= this.f31888w0.setState(iArr3);
        }
        if (b.f33040a && g2(this.f31889x0)) {
            z7 |= this.f31889x0.setState(iArr2);
        }
        if (z7) {
            invalidateSelf();
        }
        if (z6) {
            j2();
        }
        return z7;
    }

    public float A1() {
        return this.f31843N0;
    }

    public void A2(@InterfaceC0574q int i4) {
        z2(this.f31845P0.getResources().getDimension(i4));
    }

    public void A3(@d0 int i4) {
        z3(new com.google.android.material.resources.d(this.f31845P0, i4));
    }

    public float B1() {
        return this.f31891z0;
    }

    public void B2(@P Drawable drawable) {
        Drawable drawable2;
        Drawable q12 = q1();
        if (q12 != drawable) {
            float R02 = R0();
            if (drawable != null) {
                drawable2 = d.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f31882r0 = drawable2;
            float R03 = R0();
            O3(q12);
            if (M3()) {
                P0(this.f31882r0);
            }
            invalidateSelf();
            if (R02 != R03) {
                j2();
            }
        }
    }

    public void B3(@InterfaceC0569l int i4) {
        C3(ColorStateList.valueOf(i4));
    }

    public float C1() {
        return this.f31842M0;
    }

    @Deprecated
    public void C2(boolean z3) {
        K2(z3);
    }

    public void C3(@P ColorStateList colorStateList) {
        com.google.android.material.resources.d Q12 = Q1();
        if (Q12 != null) {
            Q12.k(colorStateList);
            invalidateSelf();
        }
    }

    @N
    public int[] D1() {
        return this.f31869k1;
    }

    @Deprecated
    public void D2(@InterfaceC0565h int i4) {
        J2(i4);
    }

    public void D3(float f4) {
        if (this.f31841L0 != f4) {
            this.f31841L0 = f4;
            invalidateSelf();
            j2();
        }
    }

    @P
    public ColorStateList E1() {
        return this.f31890y0;
    }

    public void E2(@InterfaceC0578v int i4) {
        B2(C2046a.b(this.f31845P0, i4));
    }

    public void E3(@InterfaceC0574q int i4) {
        D3(this.f31845P0.getResources().getDimension(i4));
    }

    public void F1(@N RectF rectF) {
        U0(getBounds(), rectF);
    }

    public void F2(float f4) {
        if (this.f31885t0 != f4) {
            float R02 = R0();
            this.f31885t0 = f4;
            float R03 = R0();
            invalidateSelf();
            if (R02 != R03) {
                j2();
            }
        }
    }

    public void F3(@c0 int i4) {
        y3(this.f31845P0.getResources().getString(i4));
    }

    public void G2(@InterfaceC0574q int i4) {
        F2(this.f31845P0.getResources().getDimension(i4));
    }

    public void G3(@r float f4) {
        com.google.android.material.resources.d Q12 = Q1();
        if (Q12 != null) {
            Q12.l(f4);
            this.f31852W0.e().setTextSize(f4);
            a();
        }
    }

    public void H2(@P ColorStateList colorStateList) {
        this.f31886u0 = true;
        if (this.f31884s0 != colorStateList) {
            this.f31884s0 = colorStateList;
            if (M3()) {
                d.o(this.f31882r0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H3(float f4) {
        if (this.f31840K0 != f4) {
            this.f31840K0 = f4;
            invalidateSelf();
            j2();
        }
    }

    public TextUtils.TruncateAt I1() {
        return this.f31877o1;
    }

    public void I2(@InterfaceC0571n int i4) {
        H2(C2046a.a(this.f31845P0, i4));
    }

    public void I3(@InterfaceC0574q int i4) {
        H3(this.f31845P0.getResources().getDimension(i4));
    }

    @P
    public h J1() {
        return this.f31836G0;
    }

    public void J2(@InterfaceC0565h int i4) {
        K2(this.f31845P0.getResources().getBoolean(i4));
    }

    public void J3(boolean z3) {
        if (this.f31871l1 != z3) {
            this.f31871l1 = z3;
            P3();
            onStateChange(getState());
        }
    }

    public float K1() {
        return this.f31839J0;
    }

    public void K2(boolean z3) {
        if (this.f31880q0 != z3) {
            boolean M3 = M3();
            this.f31880q0 = z3;
            boolean M32 = M3();
            if (M3 != M32) {
                if (M32) {
                    P0(this.f31882r0);
                } else {
                    O3(this.f31882r0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K3() {
        return this.f31879p1;
    }

    public float L1() {
        return this.f31838I0;
    }

    public void L2(float f4) {
        if (this.f31868k0 != f4) {
            this.f31868k0 = f4;
            invalidateSelf();
            j2();
        }
    }

    @U
    public int M1() {
        return this.f31881q1;
    }

    public void M2(@InterfaceC0574q int i4) {
        L2(this.f31845P0.getResources().getDimension(i4));
    }

    @P
    public ColorStateList N1() {
        return this.f31876o0;
    }

    public void N2(float f4) {
        if (this.f31837H0 != f4) {
            this.f31837H0 = f4;
            invalidateSelf();
            j2();
        }
    }

    @P
    public h O1() {
        return this.f31835F0;
    }

    public void O2(@InterfaceC0574q int i4) {
        N2(this.f31845P0.getResources().getDimension(i4));
    }

    @P
    public CharSequence P1() {
        return this.f31878p0;
    }

    public void P2(@P ColorStateList colorStateList) {
        if (this.f31872m0 != colorStateList) {
            this.f31872m0 = colorStateList;
            if (this.f31883r1) {
                F0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @P
    public com.google.android.material.resources.d Q1() {
        return this.f31852W0.d();
    }

    public void Q2(@InterfaceC0571n int i4) {
        P2(C2046a.a(this.f31845P0, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float R0() {
        if (!M3() && !L3()) {
            return 0.0f;
        }
        return this.f31838I0 + H1() + this.f31839J0;
    }

    public float R1() {
        return this.f31841L0;
    }

    public void R2(float f4) {
        if (this.f31874n0 != f4) {
            this.f31874n0 = f4;
            this.f31846Q0.setStrokeWidth(f4);
            if (this.f31883r1) {
                super.I0(f4);
            }
            invalidateSelf();
        }
    }

    public float S1() {
        return this.f31840K0;
    }

    public void S2(@InterfaceC0574q int i4) {
        R2(this.f31845P0.getResources().getDimension(i4));
    }

    public boolean U1() {
        return this.f31871l1;
    }

    public void U2(@P Drawable drawable) {
        Drawable drawable2;
        Drawable y12 = y1();
        if (y12 != drawable) {
            float V02 = V0();
            if (drawable != null) {
                drawable2 = d.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f31888w0 = drawable2;
            if (b.f33040a) {
                Q3();
            }
            float V03 = V0();
            O3(y12);
            if (N3()) {
                P0(this.f31888w0);
            }
            invalidateSelf();
            if (V02 != V03) {
                j2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float V0() {
        if (N3()) {
            return this.f31842M0 + this.f31891z0 + this.f31843N0;
        }
        return 0.0f;
    }

    public void V2(@P CharSequence charSequence) {
        if (this.f31830A0 != charSequence) {
            this.f31830A0 = C0753a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean W1() {
        return this.f31831B0;
    }

    @Deprecated
    public void W2(boolean z3) {
        j3(z3);
    }

    @Deprecated
    public boolean X1() {
        return Y1();
    }

    @Deprecated
    public void X2(@InterfaceC0565h int i4) {
        i3(i4);
    }

    @N
    Paint.Align Y0(@N Rect rect, @N PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f31878p0 != null) {
            float R02 = this.f31837H0 + R0() + this.f31840K0;
            if (d.f(this) == 0) {
                pointF.x = rect.left + R02;
            } else {
                pointF.x = rect.right - R02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - X0();
        }
        return align;
    }

    public boolean Y1() {
        return this.f31832C0;
    }

    public void Y2(float f4) {
        if (this.f31843N0 != f4) {
            this.f31843N0 = f4;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    @Deprecated
    public boolean Z1() {
        return a2();
    }

    public void Z2(@InterfaceC0574q int i4) {
        Y2(this.f31845P0.getResources().getDimension(i4));
    }

    @Override // com.google.android.material.internal.t.b
    public void a() {
        j2();
        invalidateSelf();
    }

    public boolean a2() {
        return this.f31880q0;
    }

    public void a3(@InterfaceC0578v int i4) {
        U2(C2046a.b(this.f31845P0, i4));
    }

    @Deprecated
    public boolean b2() {
        return d2();
    }

    public void b3(float f4) {
        if (this.f31891z0 != f4) {
            this.f31891z0 = f4;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    public boolean c2() {
        return g2(this.f31888w0);
    }

    public void c3(@InterfaceC0574q int i4) {
        b3(this.f31845P0.getResources().getDimension(i4));
    }

    public boolean d2() {
        return this.f31887v0;
    }

    public void d3(float f4) {
        if (this.f31842M0 != f4) {
            this.f31842M0 = f4;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        int i4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i5 = this.f31861f1;
            if (i5 < 255) {
                i4 = U0.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i5);
            } else {
                i4 = 0;
            }
            g1(canvas, bounds);
            d1(canvas, bounds);
            if (this.f31883r1) {
                super.draw(canvas);
            }
            f1(canvas, bounds);
            i1(canvas, bounds);
            e1(canvas, bounds);
            c1(canvas, bounds);
            if (this.f31879p1) {
                k1(canvas, bounds);
            }
            h1(canvas, bounds);
            j1(canvas, bounds);
            if (this.f31861f1 < 255) {
                canvas.restoreToCount(i4);
            }
        }
    }

    boolean e2() {
        return this.f31883r1;
    }

    public void e3(@InterfaceC0574q int i4) {
        d3(this.f31845P0.getResources().getDimension(i4));
    }

    public boolean f3(@N int[] iArr) {
        if (!Arrays.equals(this.f31869k1, iArr)) {
            this.f31869k1 = iArr;
            if (N3()) {
                return k2(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public void g3(@P ColorStateList colorStateList) {
        if (this.f31890y0 != colorStateList) {
            this.f31890y0 = colorStateList;
            if (N3()) {
                d.o(this.f31888w0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31861f1;
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public ColorFilter getColorFilter() {
        return this.f31862g1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f31868k0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f31837H0 + R0() + this.f31840K0 + this.f31852W0.f(P1().toString()) + this.f31841L0 + V0() + this.f31844O0), this.f31881q1);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@N Outline outline) {
        if (this.f31883r1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f31870l0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f31870l0);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@InterfaceC0571n int i4) {
        g3(C2046a.a(this.f31845P0, i4));
    }

    public void i3(@InterfaceC0565h int i4) {
        j3(this.f31845P0.getResources().getBoolean(i4));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@N Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!f2(this.f31864i0) && !f2(this.f31866j0) && !f2(this.f31872m0) && ((!this.f31871l1 || !f2(this.f31873m1)) && !h2(this.f31852W0.d()) && !Z0() && !g2(this.f31882r0) && !g2(this.f31833D0) && !f2(this.f31865i1))) {
            return false;
        }
        return true;
    }

    protected void j2() {
        InterfaceC0280a interfaceC0280a = this.f31875n1.get();
        if (interfaceC0280a != null) {
            interfaceC0280a.a();
        }
    }

    public void j3(boolean z3) {
        if (this.f31887v0 != z3) {
            boolean N3 = N3();
            this.f31887v0 = z3;
            boolean N32 = N3();
            if (N3 != N32) {
                if (N32) {
                    P0(this.f31888w0);
                } else {
                    O3(this.f31888w0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public void k3(@P InterfaceC0280a interfaceC0280a) {
        this.f31875n1 = new WeakReference<>(interfaceC0280a);
    }

    @P
    public Drawable l1() {
        return this.f31833D0;
    }

    public void l2(boolean z3) {
        if (this.f31831B0 != z3) {
            this.f31831B0 = z3;
            float R02 = R0();
            if (!z3 && this.f31859d1) {
                this.f31859d1 = false;
            }
            float R03 = R0();
            invalidateSelf();
            if (R02 != R03) {
                j2();
            }
        }
    }

    public void l3(@P TextUtils.TruncateAt truncateAt) {
        this.f31877o1 = truncateAt;
    }

    @P
    public ColorStateList m1() {
        return this.f31834E0;
    }

    public void m2(@InterfaceC0565h int i4) {
        l2(this.f31845P0.getResources().getBoolean(i4));
    }

    public void m3(@P h hVar) {
        this.f31836G0 = hVar;
    }

    @P
    public ColorStateList n1() {
        return this.f31866j0;
    }

    public void n2(@P Drawable drawable) {
        if (this.f31833D0 != drawable) {
            float R02 = R0();
            this.f31833D0 = drawable;
            float R03 = R0();
            O3(this.f31833D0);
            P0(this.f31833D0);
            invalidateSelf();
            if (R02 != R03) {
                j2();
            }
        }
    }

    public void n3(@InterfaceC0559b int i4) {
        m3(h.d(this.f31845P0, i4));
    }

    public float o1() {
        if (this.f31883r1) {
            return S();
        }
        return this.f31870l0;
    }

    @Deprecated
    public void o2(boolean z3) {
        u2(z3);
    }

    public void o3(float f4) {
        if (this.f31839J0 != f4) {
            float R02 = R0();
            this.f31839J0 = f4;
            float R03 = R0();
            invalidateSelf();
            if (R02 != R03) {
                j2();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (M3()) {
            onLayoutDirectionChanged |= d.m(this.f31882r0, i4);
        }
        if (L3()) {
            onLayoutDirectionChanged |= d.m(this.f31833D0, i4);
        }
        if (N3()) {
            onLayoutDirectionChanged |= d.m(this.f31888w0, i4);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (M3()) {
            onLevelChange |= this.f31882r0.setLevel(i4);
        }
        if (L3()) {
            onLevelChange |= this.f31833D0.setLevel(i4);
        }
        if (N3()) {
            onLevelChange |= this.f31888w0.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, com.google.android.material.internal.t.b
    public boolean onStateChange(@N int[] iArr) {
        if (this.f31883r1) {
            super.onStateChange(iArr);
        }
        return k2(iArr, D1());
    }

    public float p1() {
        return this.f31844O0;
    }

    @Deprecated
    public void p2(@InterfaceC0565h int i4) {
        u2(this.f31845P0.getResources().getBoolean(i4));
    }

    public void p3(@InterfaceC0574q int i4) {
        o3(this.f31845P0.getResources().getDimension(i4));
    }

    @P
    public Drawable q1() {
        Drawable drawable = this.f31882r0;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    public void q2(@InterfaceC0578v int i4) {
        n2(C2046a.b(this.f31845P0, i4));
    }

    public void q3(float f4) {
        if (this.f31838I0 != f4) {
            float R02 = R0();
            this.f31838I0 = f4;
            float R03 = R0();
            invalidateSelf();
            if (R02 != R03) {
                j2();
            }
        }
    }

    public float r1() {
        return this.f31885t0;
    }

    public void r2(@P ColorStateList colorStateList) {
        if (this.f31834E0 != colorStateList) {
            this.f31834E0 = colorStateList;
            if (Z0()) {
                d.o(this.f31833D0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r3(@InterfaceC0574q int i4) {
        q3(this.f31845P0.getResources().getDimension(i4));
    }

    @P
    public ColorStateList s1() {
        return this.f31884s0;
    }

    public void s2(@InterfaceC0571n int i4) {
        r2(C2046a.a(this.f31845P0, i4));
    }

    public void s3(@U int i4) {
        this.f31881q1 = i4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f31861f1 != i4) {
            this.f31861f1 = i4;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        if (this.f31862g1 != colorFilter) {
            this.f31862g1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(@P ColorStateList colorStateList) {
        if (this.f31865i1 != colorStateList) {
            this.f31865i1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@N PorterDuff.Mode mode) {
        if (this.f31867j1 != mode) {
            this.f31867j1 = mode;
            this.f31863h1 = Y0.a.c(this, this.f31865i1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (M3()) {
            visible |= this.f31882r0.setVisible(z3, z4);
        }
        if (L3()) {
            visible |= this.f31833D0.setVisible(z3, z4);
        }
        if (N3()) {
            visible |= this.f31888w0.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.f31868k0;
    }

    public void t2(@InterfaceC0565h int i4) {
        u2(this.f31845P0.getResources().getBoolean(i4));
    }

    public void t3(@P ColorStateList colorStateList) {
        if (this.f31876o0 != colorStateList) {
            this.f31876o0 = colorStateList;
            P3();
            onStateChange(getState());
        }
    }

    public float u1() {
        return this.f31837H0;
    }

    public void u2(boolean z3) {
        if (this.f31832C0 != z3) {
            boolean L3 = L3();
            this.f31832C0 = z3;
            boolean L32 = L3();
            if (L3 != L32) {
                if (L32) {
                    P0(this.f31833D0);
                } else {
                    O3(this.f31833D0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public void u3(@InterfaceC0571n int i4) {
        t3(C2046a.a(this.f31845P0, i4));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @P
    public ColorStateList v1() {
        return this.f31872m0;
    }

    public void v2(@P ColorStateList colorStateList) {
        if (this.f31866j0 != colorStateList) {
            this.f31866j0 = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v3(boolean z3) {
        this.f31879p1 = z3;
    }

    public float w1() {
        return this.f31874n0;
    }

    public void w2(@InterfaceC0571n int i4) {
        v2(C2046a.a(this.f31845P0, i4));
    }

    public void w3(@P h hVar) {
        this.f31835F0 = hVar;
    }

    public void x1(@N RectF rectF) {
        S0(getBounds(), rectF);
    }

    @Deprecated
    public void x2(float f4) {
        if (this.f31870l0 != f4) {
            this.f31870l0 = f4;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f4));
        }
    }

    public void x3(@InterfaceC0559b int i4) {
        w3(h.d(this.f31845P0, i4));
    }

    @P
    public Drawable y1() {
        Drawable drawable = this.f31888w0;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void y2(@InterfaceC0574q int i4) {
        x2(this.f31845P0.getResources().getDimension(i4));
    }

    public void y3(@P CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f31878p0, charSequence)) {
            this.f31878p0 = charSequence;
            this.f31852W0.j(true);
            invalidateSelf();
            j2();
        }
    }

    @P
    public CharSequence z1() {
        return this.f31830A0;
    }

    public void z2(float f4) {
        if (this.f31844O0 != f4) {
            this.f31844O0 = f4;
            invalidateSelf();
            j2();
        }
    }

    public void z3(@P com.google.android.material.resources.d dVar) {
        this.f31852W0.i(dVar, this.f31845P0);
    }
}
