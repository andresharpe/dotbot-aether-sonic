package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.C0823k0;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0610x extends C0606t {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f6324d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f6325e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f6326f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f6327g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6328h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6329i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0610x(SeekBar seekBar) {
        super(seekBar);
        this.f6326f = null;
        this.f6327g = null;
        this.f6328h = false;
        this.f6329i = false;
        this.f6324d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f6325e;
        if (drawable != null) {
            if (this.f6328h || this.f6329i) {
                Drawable r4 = androidx.core.graphics.drawable.d.r(drawable.mutate());
                this.f6325e = r4;
                if (this.f6328h) {
                    androidx.core.graphics.drawable.d.o(r4, this.f6326f);
                }
                if (this.f6329i) {
                    androidx.core.graphics.drawable.d.p(this.f6325e, this.f6327g);
                }
                if (this.f6325e.isStateful()) {
                    this.f6325e.setState(this.f6324d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0606t
    public void c(AttributeSet attributeSet, int i4) {
        super.c(attributeSet, i4);
        g0 G3 = g0.G(this.f6324d.getContext(), attributeSet, C2042a.m.f50111i0, i4, 0);
        SeekBar seekBar = this.f6324d;
        C0823k0.z1(seekBar, seekBar.getContext(), C2042a.m.f50111i0, attributeSet, G3.B(), i4, 0);
        Drawable i5 = G3.i(C2042a.m.f50116j0);
        if (i5 != null) {
            this.f6324d.setThumb(i5);
        }
        m(G3.h(C2042a.m.f50121k0));
        if (G3.C(C2042a.m.f50131m0)) {
            this.f6327g = L.e(G3.o(C2042a.m.f50131m0, -1), this.f6327g);
            this.f6329i = true;
        }
        if (G3.C(C2042a.m.f50126l0)) {
            this.f6326f = G3.d(C2042a.m.f50126l0);
            this.f6328h = true;
        }
        G3.I();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        int i4;
        if (this.f6325e != null) {
            int max = this.f6324d.getMax();
            int i5 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f6325e.getIntrinsicWidth();
                int intrinsicHeight = this.f6325e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i4 = intrinsicWidth / 2;
                } else {
                    i4 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i5 = intrinsicHeight / 2;
                }
                this.f6325e.setBounds(-i4, -i5, i4, i5);
                float width = ((this.f6324d.getWidth() - this.f6324d.getPaddingLeft()) - this.f6324d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f6324d.getPaddingLeft(), this.f6324d.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f6325e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f6325e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f6324d.getDrawableState())) {
            this.f6324d.invalidateDrawable(drawable);
        }
    }

    @androidx.annotation.P
    Drawable i() {
        return this.f6325e;
    }

    @androidx.annotation.P
    ColorStateList j() {
        return this.f6326f;
    }

    @androidx.annotation.P
    PorterDuff.Mode k() {
        return this.f6327g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        Drawable drawable = this.f6325e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void m(@androidx.annotation.P Drawable drawable) {
        Drawable drawable2 = this.f6325e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6325e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f6324d);
            androidx.core.graphics.drawable.d.m(drawable, C0823k0.Z(this.f6324d));
            if (drawable.isStateful()) {
                drawable.setState(this.f6324d.getDrawableState());
            }
            f();
        }
        this.f6324d.invalidate();
    }

    void n(@androidx.annotation.P ColorStateList colorStateList) {
        this.f6326f = colorStateList;
        this.f6328h = true;
        f();
    }

    void o(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f6327g = mode;
        this.f6329i = true;
        f();
    }
}
