package com.google.android.material.card;

import T0.a;
import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.annotation.r;
import androidx.core.graphics.drawable.d;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import com.google.android.material.color.s;
import com.google.android.material.resources.c;
import com.google.android.material.shape.e;
import com.google.android.material.shape.f;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.o;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: u, reason: collision with root package name */
    private static final int f31746u = -1;

    /* renamed from: v, reason: collision with root package name */
    private static final double f31747v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: w, reason: collision with root package name */
    private static final float f31748w = 1.5f;

    /* renamed from: x, reason: collision with root package name */
    private static final int f31749x = 2;

    /* renamed from: y, reason: collision with root package name */
    private static final Drawable f31750y;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final com.google.android.material.card.a f31751a;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final j f31753c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final j f31754d;

    /* renamed from: e, reason: collision with root package name */
    @r
    private int f31755e;

    /* renamed from: f, reason: collision with root package name */
    @r
    private int f31756f;

    /* renamed from: g, reason: collision with root package name */
    private int f31757g;

    /* renamed from: h, reason: collision with root package name */
    @r
    private int f31758h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private Drawable f31759i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private Drawable f31760j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private ColorStateList f31761k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private ColorStateList f31762l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private o f31763m;

    /* renamed from: n, reason: collision with root package name */
    @P
    private ColorStateList f31764n;

    /* renamed from: o, reason: collision with root package name */
    @P
    private Drawable f31765o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private LayerDrawable f31766p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private j f31767q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private j f31768r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f31770t;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Rect f31752b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    private boolean f31769s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends InsetDrawable {
        a(Drawable drawable, int i4, int i5, int i6, int i7) {
            super(drawable, i4, i5, i6, i7);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f31750y = colorDrawable;
    }

    public b(@N com.google.android.material.card.a aVar, AttributeSet attributeSet, int i4, @d0 int i5) {
        this.f31751a = aVar;
        j jVar = new j(aVar.getContext(), attributeSet, i4, i5);
        this.f31753c = jVar;
        jVar.Z(aVar.getContext());
        jVar.v0(-12303292);
        o.b v3 = jVar.getShapeAppearanceModel().v();
        TypedArray obtainStyledAttributes = aVar.getContext().obtainStyledAttributes(attributeSet, a.o.i5, i4, a.n.j4);
        if (obtainStyledAttributes.hasValue(a.o.m5)) {
            v3.o(obtainStyledAttributes.getDimension(a.o.m5, 0.0f));
        }
        this.f31754d = new j();
        V(v3.m());
        obtainStyledAttributes.recycle();
    }

    @N
    private Drawable B(Drawable drawable) {
        int i4;
        int i5;
        if (this.f31751a.getUseCompatPadding()) {
            i5 = (int) Math.ceil(d());
            i4 = (int) Math.ceil(c());
        } else {
            i4 = 0;
            i5 = 0;
        }
        return new a(drawable, i4, i5, i4, i5);
    }

    private boolean E() {
        if ((this.f31757g & 80) == 80) {
            return true;
        }
        return false;
    }

    private boolean F() {
        if ((this.f31757g & C.f13102c) == 8388613) {
            return true;
        }
        return false;
    }

    private boolean Z() {
        if (this.f31751a.getPreventCornerOverlap() && !e()) {
            return true;
        }
        return false;
    }

    private float a() {
        return Math.max(Math.max(b(this.f31763m.q(), this.f31753c.S()), b(this.f31763m.s(), this.f31753c.T())), Math.max(b(this.f31763m.k(), this.f31753c.u()), b(this.f31763m.i(), this.f31753c.t())));
    }

    private boolean a0() {
        if (this.f31751a.getPreventCornerOverlap() && e() && this.f31751a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    private float b(e eVar, float f4) {
        if (eVar instanceof n) {
            return (float) ((1.0d - f31747v) * f4);
        }
        if (eVar instanceof f) {
            return f4 / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        float f4;
        float maxCardElevation = this.f31751a.getMaxCardElevation();
        if (a0()) {
            f4 = a();
        } else {
            f4 = 0.0f;
        }
        return maxCardElevation + f4;
    }

    private float d() {
        float f4;
        float maxCardElevation = this.f31751a.getMaxCardElevation() * f31748w;
        if (a0()) {
            f4 = a();
        } else {
            f4 = 0.0f;
        }
        return maxCardElevation + f4;
    }

    private boolean e() {
        return this.f31753c.e0();
    }

    private void e0(Drawable drawable) {
        if (this.f31751a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f31751a.getForeground()).setDrawable(drawable);
        } else {
            this.f31751a.setForeground(B(drawable));
        }
    }

    @N
    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        j h4 = h();
        this.f31767q = h4;
        h4.o0(this.f31761k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f31767q);
        return stateListDrawable;
    }

    @N
    private Drawable g() {
        if (com.google.android.material.ripple.b.f33040a) {
            this.f31768r = h();
            return new RippleDrawable(this.f31761k, null, this.f31768r);
        }
        return f();
    }

    private void g0() {
        Drawable drawable;
        if (com.google.android.material.ripple.b.f33040a && (drawable = this.f31765o) != null) {
            ((RippleDrawable) drawable).setColor(this.f31761k);
            return;
        }
        j jVar = this.f31767q;
        if (jVar != null) {
            jVar.o0(this.f31761k);
        }
    }

    @N
    private j h() {
        return new j(this.f31763m);
    }

    @N
    private Drawable r() {
        if (this.f31765o == null) {
            this.f31765o = g();
        }
        if (this.f31766p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f31765o, this.f31754d, this.f31760j});
            this.f31766p = layerDrawable;
            layerDrawable.setId(2, a.h.f2805o3);
        }
        return this.f31766p;
    }

    private float t() {
        if (this.f31751a.getPreventCornerOverlap() && this.f31751a.getUseCompatPadding()) {
            return (float) ((1.0d - f31747v) * this.f31751a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public Rect A() {
        return this.f31752b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C() {
        return this.f31769s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        return this.f31770t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(@N TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a4 = c.a(this.f31751a.getContext(), typedArray, a.o.hm);
        this.f31764n = a4;
        if (a4 == null) {
            this.f31764n = ColorStateList.valueOf(-1);
        }
        this.f31758h = typedArray.getDimensionPixelSize(a.o.im, 0);
        boolean z3 = typedArray.getBoolean(a.o.Wl, false);
        this.f31770t = z3;
        this.f31751a.setLongClickable(z3);
        this.f31762l = c.a(this.f31751a.getContext(), typedArray, a.o.cm);
        N(c.e(this.f31751a.getContext(), typedArray, a.o.Yl));
        Q(typedArray.getDimensionPixelSize(a.o.bm, 0));
        P(typedArray.getDimensionPixelSize(a.o.am, 0));
        this.f31757g = typedArray.getInteger(a.o.Zl, 8388661);
        ColorStateList a5 = c.a(this.f31751a.getContext(), typedArray, a.o.dm);
        this.f31761k = a5;
        if (a5 == null) {
            this.f31761k = ColorStateList.valueOf(s.d(this.f31751a, a.c.f1852M2));
        }
        K(c.a(this.f31751a.getContext(), typedArray, a.o.Xl));
        g0();
        d0();
        h0();
        this.f31751a.setBackgroundInternal(B(this.f31753c));
        if (this.f31751a.isClickable()) {
            drawable = r();
        } else {
            drawable = this.f31754d;
        }
        this.f31759i = drawable;
        this.f31751a.setForeground(B(drawable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f31766p != null) {
            if (this.f31751a.getUseCompatPadding()) {
                i6 = (int) Math.ceil(d() * 2.0f);
                i7 = (int) Math.ceil(c() * 2.0f);
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (F()) {
                i8 = ((i4 - this.f31755e) - this.f31756f) - i7;
            } else {
                i8 = this.f31755e;
            }
            if (E()) {
                i9 = this.f31755e;
            } else {
                i9 = ((i5 - this.f31755e) - this.f31756f) - i6;
            }
            int i14 = i9;
            if (F()) {
                i10 = this.f31755e;
            } else {
                i10 = ((i4 - this.f31755e) - this.f31756f) - i7;
            }
            if (E()) {
                i11 = ((i5 - this.f31755e) - this.f31756f) - i6;
            } else {
                i11 = this.f31755e;
            }
            int i15 = i11;
            if (C0823k0.Z(this.f31751a) == 1) {
                i13 = i10;
                i12 = i8;
            } else {
                i12 = i10;
                i13 = i8;
            }
            this.f31766p.setLayerInset(2, i13, i15, i12, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z3) {
        this.f31769s = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.f31753c.o0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(@P ColorStateList colorStateList) {
        j jVar = this.f31754d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.o0(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(boolean z3) {
        this.f31770t = z3;
    }

    public void M(boolean z3) {
        int i4;
        Drawable drawable = this.f31760j;
        if (drawable != null) {
            if (z3) {
                i4 = 255;
            } else {
                i4 = 0;
            }
            drawable.setAlpha(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(@P Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = d.r(drawable).mutate();
            this.f31760j = mutate;
            d.o(mutate, this.f31762l);
            M(this.f31751a.isChecked());
        } else {
            this.f31760j = f31750y;
        }
        LayerDrawable layerDrawable = this.f31766p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(a.h.f2805o3, this.f31760j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i4) {
        this.f31757g = i4;
        H(this.f31751a.getMeasuredWidth(), this.f31751a.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(@r int i4) {
        this.f31755e = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(@r int i4) {
        this.f31756f = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(@P ColorStateList colorStateList) {
        this.f31762l = colorStateList;
        Drawable drawable = this.f31760j;
        if (drawable != null) {
            d.o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(float f4) {
        V(this.f31763m.w(f4));
        this.f31759i.invalidateSelf();
        if (a0() || Z()) {
            c0();
        }
        if (a0()) {
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f31753c.p0(f4);
        j jVar = this.f31754d;
        if (jVar != null) {
            jVar.p0(f4);
        }
        j jVar2 = this.f31768r;
        if (jVar2 != null) {
            jVar2.p0(f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(@P ColorStateList colorStateList) {
        this.f31761k = colorStateList;
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(@N o oVar) {
        this.f31763m = oVar;
        this.f31753c.setShapeAppearanceModel(oVar);
        this.f31753c.u0(!r0.e0());
        j jVar = this.f31754d;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        j jVar2 = this.f31768r;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        j jVar3 = this.f31767q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(ColorStateList colorStateList) {
        if (this.f31764n == colorStateList) {
            return;
        }
        this.f31764n = colorStateList;
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(@r int i4) {
        if (i4 == this.f31758h) {
            return;
        }
        this.f31758h = i4;
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i4, int i5, int i6, int i7) {
        this.f31752b.set(i4, i5, i6, i7);
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0() {
        Drawable drawable;
        Drawable drawable2 = this.f31759i;
        if (this.f31751a.isClickable()) {
            drawable = r();
        } else {
            drawable = this.f31754d;
        }
        this.f31759i = drawable;
        if (drawable2 != drawable) {
            e0(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0() {
        float a4;
        if (!Z() && !a0()) {
            a4 = 0.0f;
        } else {
            a4 = a();
        }
        int t3 = (int) (a4 - t());
        com.google.android.material.card.a aVar = this.f31751a;
        Rect rect = this.f31752b;
        aVar.m(rect.left + t3, rect.top + t3, rect.right + t3, rect.bottom + t3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0() {
        this.f31753c.n0(this.f31751a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        if (!C()) {
            this.f31751a.setBackgroundInternal(B(this.f31753c));
        }
        this.f31751a.setForeground(B(this.f31759i));
    }

    void h0() {
        this.f31754d.E0(this.f31758h, this.f31764n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(api = 23)
    public void i() {
        Drawable drawable = this.f31765o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i4 = bounds.bottom;
            this.f31765o.setBounds(bounds.left, bounds.top, bounds.right, i4 - 1);
            this.f31765o.setBounds(bounds.left, bounds.top, bounds.right, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public j j() {
        return this.f31753c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList k() {
        return this.f31753c.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f31754d.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public Drawable m() {
        return this.f31760j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f31757g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r
    public int o() {
        return this.f31755e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r
    public int p() {
        return this.f31756f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList q() {
        return this.f31762l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f31753c.S();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0580x(from = 0.0d, to = 1.0d)
    public float u() {
        return this.f31753c.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList v() {
        return this.f31761k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o w() {
        return this.f31763m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0569l
    public int x() {
        ColorStateList colorStateList = this.f31764n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList y() {
        return this.f31764n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r
    public int z() {
        return this.f31758h;
    }
}
