package com.google.android.material.tooltip;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.core.graphics.C0734z;
import com.google.android.material.color.s;
import com.google.android.material.internal.t;
import com.google.android.material.internal.w;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.g;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import com.google.android.material.shape.l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a extends j implements t.b {

    /* renamed from: i0, reason: collision with root package name */
    @P
    private CharSequence f33970i0;

    /* renamed from: j0, reason: collision with root package name */
    @N
    private final Context f33971j0;

    /* renamed from: k0, reason: collision with root package name */
    @P
    private final Paint.FontMetrics f33972k0;

    /* renamed from: l0, reason: collision with root package name */
    @N
    private final t f33973l0;

    /* renamed from: m0, reason: collision with root package name */
    @N
    private final View.OnLayoutChangeListener f33974m0;

    /* renamed from: n0, reason: collision with root package name */
    @N
    private final Rect f33975n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f33976o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f33977p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f33978q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f33979r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f33980s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f33981t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f33982u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f33983v0;

    /* renamed from: w0, reason: collision with root package name */
    private final float f33984w0;

    /* renamed from: x0, reason: collision with root package name */
    private float f33985x0;

    /* renamed from: y0, reason: collision with root package name */
    private float f33986y0;

    /* renamed from: z0, reason: collision with root package name */
    @d0
    private static final int f33969z0 = a.n.lj;

    /* renamed from: A0, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f33968A0 = a.c.wh;

    /* renamed from: com.google.android.material.tooltip.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnLayoutChangeListenerC0304a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0304a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            a.this.r1(view);
        }
    }

    private a(@N Context context, AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        super(context, attributeSet, i4, i5);
        this.f33972k0 = new Paint.FontMetrics();
        t tVar = new t(this);
        this.f33973l0 = tVar;
        this.f33974m0 = new ViewOnLayoutChangeListenerC0304a();
        this.f33975n0 = new Rect();
        this.f33982u0 = 1.0f;
        this.f33983v0 = 1.0f;
        this.f33984w0 = 0.5f;
        this.f33985x0 = 0.5f;
        this.f33986y0 = 1.0f;
        this.f33971j0 = context;
        tVar.e().density = context.getResources().getDisplayMetrics().density;
        tVar.e().setTextAlign(Paint.Align.CENTER);
    }

    private float Q0() {
        int i4;
        if (((this.f33975n0.right - getBounds().right) - this.f33981t0) - this.f33979r0 < 0) {
            i4 = ((this.f33975n0.right - getBounds().right) - this.f33981t0) - this.f33979r0;
        } else if (((this.f33975n0.left - getBounds().left) - this.f33981t0) + this.f33979r0 > 0) {
            i4 = ((this.f33975n0.left - getBounds().left) - this.f33981t0) + this.f33979r0;
        } else {
            return 0.0f;
        }
        return i4;
    }

    private float R0() {
        this.f33973l0.e().getFontMetrics(this.f33972k0);
        Paint.FontMetrics fontMetrics = this.f33972k0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float S0(@N Rect rect) {
        return rect.centerY() - R0();
    }

    @N
    public static a T0(@N Context context) {
        return V0(context, null, f33968A0, f33969z0);
    }

    @N
    public static a U0(@N Context context, @P AttributeSet attributeSet) {
        return V0(context, attributeSet, f33968A0, f33969z0);
    }

    @N
    public static a V0(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        a aVar = new a(context, attributeSet, i4, i5);
        aVar.g1(attributeSet, i4, i5);
        return aVar;
    }

    private g W0() {
        float f4 = -Q0();
        float width = ((float) (getBounds().width() - (this.f33980s0 * Math.sqrt(2.0d)))) / 2.0f;
        return new l(new i(this.f33980s0), Math.min(Math.max(f4, -width), width));
    }

    private void Y0(@N Canvas canvas) {
        if (this.f33970i0 == null) {
            return;
        }
        int S02 = (int) S0(getBounds());
        if (this.f33973l0.d() != null) {
            this.f33973l0.e().drawableState = getState();
            this.f33973l0.k(this.f33971j0);
            this.f33973l0.e().setAlpha((int) (this.f33986y0 * 255.0f));
        }
        CharSequence charSequence = this.f33970i0;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), S02, this.f33973l0.e());
    }

    private float f1() {
        CharSequence charSequence = this.f33970i0;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f33973l0.f(charSequence.toString());
    }

    private void g1(@P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        TypedArray j4 = w.j(this.f33971j0, attributeSet, a.o.Pv, i4, i5, new int[0]);
        this.f33980s0 = this.f33971j0.getResources().getDimensionPixelSize(a.f.x9);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(W0()).m());
        m1(j4.getText(a.o.Wv));
        d g4 = c.g(this.f33971j0, j4, a.o.Qv);
        if (g4 != null && j4.hasValue(a.o.Rv)) {
            g4.k(c.a(this.f33971j0, j4, a.o.Rv));
        }
        n1(g4);
        o0(ColorStateList.valueOf(j4.getColor(a.o.Xv, s.l(C0734z.B(s.c(this.f33971j0, R.attr.colorBackground, a.class.getCanonicalName()), 229), C0734z.B(s.c(this.f33971j0, a.c.f1868Q2, a.class.getCanonicalName()), 153)))));
        F0(ColorStateList.valueOf(s.c(this.f33971j0, a.c.f1979o3, a.class.getCanonicalName())));
        this.f33976o0 = j4.getDimensionPixelSize(a.o.Sv, 0);
        this.f33977p0 = j4.getDimensionPixelSize(a.o.Uv, 0);
        this.f33978q0 = j4.getDimensionPixelSize(a.o.Vv, 0);
        this.f33979r0 = j4.getDimensionPixelSize(a.o.Tv, 0);
        j4.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(@N View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f33981t0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f33975n0);
    }

    public void X0(@P View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f33974m0);
    }

    public int Z0() {
        return this.f33979r0;
    }

    @Override // com.google.android.material.internal.t.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.f33978q0;
    }

    public int b1() {
        return this.f33977p0;
    }

    @P
    public CharSequence c1() {
        return this.f33970i0;
    }

    @P
    public d d1() {
        return this.f33973l0.d();
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        canvas.save();
        float Q02 = Q0();
        float f4 = (float) (-((this.f33980s0 * Math.sqrt(2.0d)) - this.f33980s0));
        canvas.scale(this.f33982u0, this.f33983v0, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f33985x0));
        canvas.translate(Q02, f4);
        super.draw(canvas);
        Y0(canvas);
        canvas.restore();
    }

    public int e1() {
        return this.f33976o0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f33973l0.e().getTextSize(), this.f33978q0);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f33976o0 * 2) + f1(), this.f33977p0);
    }

    public void h1(@U int i4) {
        this.f33979r0 = i4;
        invalidateSelf();
    }

    public void i1(@U int i4) {
        this.f33978q0 = i4;
        invalidateSelf();
    }

    public void j1(@U int i4) {
        this.f33977p0 = i4;
        invalidateSelf();
    }

    public void k1(@P View view) {
        if (view == null) {
            return;
        }
        r1(view);
        view.addOnLayoutChangeListener(this.f33974m0);
    }

    public void l1(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f33985x0 = 1.2f;
        this.f33982u0 = f4;
        this.f33983v0 = f4;
        this.f33986y0 = com.google.android.material.animation.a.b(0.0f, 1.0f, 0.19f, 1.0f, f4);
        invalidateSelf();
    }

    public void m1(@P CharSequence charSequence) {
        if (!TextUtils.equals(this.f33970i0, charSequence)) {
            this.f33970i0 = charSequence;
            this.f33973l0.j(true);
            invalidateSelf();
        }
    }

    public void n1(@P d dVar) {
        this.f33973l0.i(dVar, this.f33971j0);
    }

    public void o1(@d0 int i4) {
        n1(new d(this.f33971j0, i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(W0()).m());
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable, com.google.android.material.internal.t.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@U int i4) {
        this.f33976o0 = i4;
        invalidateSelf();
    }

    public void q1(@c0 int i4) {
        m1(this.f33971j0.getResources().getString(i4));
    }
}
