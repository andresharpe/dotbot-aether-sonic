package com.google.android.material.button;

import T0.a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.InterfaceC0568k;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.r;
import androidx.core.graphics.drawable.d;
import androidx.core.view.C0823k0;
import com.google.android.material.color.s;
import com.google.android.material.internal.E;
import com.google.android.material.resources.c;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: t, reason: collision with root package name */
    @InterfaceC0568k(api = 21)
    private static final boolean f31710t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f31711u = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f31712a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private o f31713b;

    /* renamed from: c, reason: collision with root package name */
    private int f31714c;

    /* renamed from: d, reason: collision with root package name */
    private int f31715d;

    /* renamed from: e, reason: collision with root package name */
    private int f31716e;

    /* renamed from: f, reason: collision with root package name */
    private int f31717f;

    /* renamed from: g, reason: collision with root package name */
    private int f31718g;

    /* renamed from: h, reason: collision with root package name */
    private int f31719h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private PorterDuff.Mode f31720i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private ColorStateList f31721j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private ColorStateList f31722k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private ColorStateList f31723l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private Drawable f31724m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f31725n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f31726o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f31727p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f31728q;

    /* renamed from: r, reason: collision with root package name */
    private LayerDrawable f31729r;

    /* renamed from: s, reason: collision with root package name */
    private int f31730s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, @N o oVar) {
        this.f31712a = materialButton;
        this.f31713b = oVar;
    }

    private void E(@r int i4, @r int i5) {
        int k02 = C0823k0.k0(this.f31712a);
        int paddingTop = this.f31712a.getPaddingTop();
        int j02 = C0823k0.j0(this.f31712a);
        int paddingBottom = this.f31712a.getPaddingBottom();
        int i6 = this.f31716e;
        int i7 = this.f31717f;
        this.f31717f = i5;
        this.f31716e = i4;
        if (!this.f31726o) {
            F();
        }
        C0823k0.d2(this.f31712a, k02, (paddingTop + i4) - i6, j02, (paddingBottom + i5) - i7);
    }

    private void F() {
        this.f31712a.setInternalBackground(a());
        j f4 = f();
        if (f4 != null) {
            f4.n0(this.f31730s);
        }
    }

    private void G(@N o oVar) {
        if (f31711u && !this.f31726o) {
            int k02 = C0823k0.k0(this.f31712a);
            int paddingTop = this.f31712a.getPaddingTop();
            int j02 = C0823k0.j0(this.f31712a);
            int paddingBottom = this.f31712a.getPaddingBottom();
            F();
            C0823k0.d2(this.f31712a, k02, paddingTop, j02, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(oVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(oVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(oVar);
        }
    }

    private void I() {
        int i4;
        j f4 = f();
        j n4 = n();
        if (f4 != null) {
            f4.E0(this.f31719h, this.f31722k);
            if (n4 != null) {
                float f5 = this.f31719h;
                if (this.f31725n) {
                    i4 = s.d(this.f31712a, a.c.f1979o3);
                } else {
                    i4 = 0;
                }
                n4.D0(f5, i4);
            }
        }
    }

    @N
    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f31714c, this.f31716e, this.f31715d, this.f31717f);
    }

    private Drawable a() {
        int i4;
        j jVar = new j(this.f31713b);
        jVar.Z(this.f31712a.getContext());
        d.o(jVar, this.f31721j);
        PorterDuff.Mode mode = this.f31720i;
        if (mode != null) {
            d.p(jVar, mode);
        }
        jVar.E0(this.f31719h, this.f31722k);
        j jVar2 = new j(this.f31713b);
        jVar2.setTint(0);
        float f4 = this.f31719h;
        if (this.f31725n) {
            i4 = s.d(this.f31712a, a.c.f1979o3);
        } else {
            i4 = 0;
        }
        jVar2.D0(f4, i4);
        if (f31710t) {
            j jVar3 = new j(this.f31713b);
            this.f31724m = jVar3;
            d.n(jVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.d(this.f31723l), J(new LayerDrawable(new Drawable[]{jVar2, jVar})), this.f31724m);
            this.f31729r = rippleDrawable;
            return rippleDrawable;
        }
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f31713b);
        this.f31724m = aVar;
        d.o(aVar, b.d(this.f31723l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar, this.f31724m});
        this.f31729r = layerDrawable;
        return J(layerDrawable);
    }

    @P
    private j g(boolean z3) {
        LayerDrawable layerDrawable = this.f31729r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f31710t) {
                return (j) ((LayerDrawable) ((InsetDrawable) this.f31729r.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
            }
            return (j) this.f31729r.getDrawable(!z3 ? 1 : 0);
        }
        return null;
    }

    @P
    private j n() {
        return g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(@P ColorStateList colorStateList) {
        if (this.f31722k != colorStateList) {
            this.f31722k = colorStateList;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i4) {
        if (this.f31719h != i4) {
            this.f31719h = i4;
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(@P ColorStateList colorStateList) {
        if (this.f31721j != colorStateList) {
            this.f31721j = colorStateList;
            if (f() != null) {
                d.o(f(), this.f31721j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(@P PorterDuff.Mode mode) {
        if (this.f31720i != mode) {
            this.f31720i = mode;
            if (f() != null && this.f31720i != null) {
                d.p(f(), this.f31720i);
            }
        }
    }

    void H(int i4, int i5) {
        Drawable drawable = this.f31724m;
        if (drawable != null) {
            drawable.setBounds(this.f31714c, this.f31716e, i5 - this.f31715d, i4 - this.f31717f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f31718g;
    }

    public int c() {
        return this.f31717f;
    }

    public int d() {
        return this.f31716e;
    }

    @P
    public com.google.android.material.shape.s e() {
        LayerDrawable layerDrawable = this.f31729r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f31729r.getNumberOfLayers() > 2) {
                return (com.google.android.material.shape.s) this.f31729r.getDrawable(2);
            }
            return (com.google.android.material.shape.s) this.f31729r.getDrawable(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public j f() {
        return g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList h() {
        return this.f31723l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public o i() {
        return this.f31713b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ColorStateList j() {
        return this.f31722k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f31719h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f31721j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f31720i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f31726o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f31728q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(@N TypedArray typedArray) {
        this.f31714c = typedArray.getDimensionPixelOffset(a.o.bl, 0);
        this.f31715d = typedArray.getDimensionPixelOffset(a.o.cl, 0);
        this.f31716e = typedArray.getDimensionPixelOffset(a.o.dl, 0);
        this.f31717f = typedArray.getDimensionPixelOffset(a.o.el, 0);
        if (typedArray.hasValue(a.o.il)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(a.o.il, -1);
            this.f31718g = dimensionPixelSize;
            y(this.f31713b.w(dimensionPixelSize));
            this.f31727p = true;
        }
        this.f31719h = typedArray.getDimensionPixelSize(a.o.ul, 0);
        this.f31720i = E.l(typedArray.getInt(a.o.hl, -1), PorterDuff.Mode.SRC_IN);
        this.f31721j = c.a(this.f31712a.getContext(), typedArray, a.o.gl);
        this.f31722k = c.a(this.f31712a.getContext(), typedArray, a.o.tl);
        this.f31723l = c.a(this.f31712a.getContext(), typedArray, a.o.ql);
        this.f31728q = typedArray.getBoolean(a.o.fl, false);
        this.f31730s = typedArray.getDimensionPixelSize(a.o.jl, 0);
        int k02 = C0823k0.k0(this.f31712a);
        int paddingTop = this.f31712a.getPaddingTop();
        int j02 = C0823k0.j0(this.f31712a);
        int paddingBottom = this.f31712a.getPaddingBottom();
        if (typedArray.hasValue(a.o.al)) {
            s();
        } else {
            F();
        }
        C0823k0.d2(this.f31712a, k02 + this.f31714c, paddingTop + this.f31716e, j02 + this.f31715d, paddingBottom + this.f31717f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i4) {
        if (f() != null) {
            f().setTint(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        this.f31726o = true;
        this.f31712a.setSupportBackgroundTintList(this.f31721j);
        this.f31712a.setSupportBackgroundTintMode(this.f31720i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(boolean z3) {
        this.f31728q = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i4) {
        if (!this.f31727p || this.f31718g != i4) {
            this.f31718g = i4;
            this.f31727p = true;
            y(this.f31713b.w(i4));
        }
    }

    public void v(@r int i4) {
        E(this.f31716e, i4);
    }

    public void w(@r int i4) {
        E(i4, this.f31717f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(@P ColorStateList colorStateList) {
        if (this.f31723l != colorStateList) {
            this.f31723l = colorStateList;
            boolean z3 = f31710t;
            if (z3 && (this.f31712a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f31712a.getBackground()).setColor(b.d(colorStateList));
            } else if (!z3 && (this.f31712a.getBackground() instanceof com.google.android.material.ripple.a)) {
                ((com.google.android.material.ripple.a) this.f31712a.getBackground()).setTintList(b.d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(@N o oVar) {
        this.f31713b = oVar;
        G(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(boolean z3) {
        this.f31725n = z3;
        I();
    }
}
