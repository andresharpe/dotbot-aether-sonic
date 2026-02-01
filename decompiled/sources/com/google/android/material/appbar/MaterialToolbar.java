package com.google.android.material.appbar;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0823k0;
import com.google.android.material.internal.x;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: H0, reason: collision with root package name */
    private static final int f31345H0 = a.n.hj;

    /* renamed from: I0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f31346I0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: C0, reason: collision with root package name */
    @P
    private Integer f31347C0;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f31348D0;

    /* renamed from: E0, reason: collision with root package name */
    private boolean f31349E0;

    /* renamed from: F0, reason: collision with root package name */
    @P
    private ImageView.ScaleType f31350F0;

    /* renamed from: G0, reason: collision with root package name */
    @P
    private Boolean f31351G0;

    public MaterialToolbar(@N Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> a0(@P TextView textView, @P TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i4 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i4 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i4 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void b0(Context context) {
        int i4;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        j jVar = new j();
        if (background != null) {
            i4 = ((ColorDrawable) background).getColor();
        } else {
            i4 = 0;
        }
        jVar.o0(ColorStateList.valueOf(i4));
        jVar.Z(context);
        jVar.n0(C0823k0.R(this));
        C0823k0.I1(this, jVar);
    }

    private void f0(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i4 += max;
            i5 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i4, view.getTop(), i5, view.getBottom());
    }

    private void g0() {
        if (!this.f31348D0 && !this.f31349E0) {
            return;
        }
        TextView i4 = x.i(this);
        TextView g4 = x.g(this);
        if (i4 == null && g4 == null) {
            return;
        }
        Pair<Integer, Integer> a02 = a0(i4, g4);
        if (this.f31348D0 && i4 != null) {
            f0(i4, a02);
        }
        if (this.f31349E0 && g4 != null) {
            f0(g4, a02);
        }
    }

    @P
    private Drawable h0(@P Drawable drawable) {
        if (drawable != null && this.f31347C0 != null) {
            Drawable r4 = androidx.core.graphics.drawable.d.r(drawable.mutate());
            androidx.core.graphics.drawable.d.n(r4, this.f31347C0.intValue());
            return r4;
        }
        return drawable;
    }

    private void i0() {
        ImageView d4 = x.d(this);
        if (d4 != null) {
            Boolean bool = this.f31351G0;
            if (bool != null) {
                d4.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f31350F0;
            if (scaleType != null) {
                d4.setScaleType(scaleType);
            }
        }
    }

    public boolean c0() {
        Boolean bool = this.f31351G0;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean d0() {
        return this.f31349E0;
    }

    public boolean e0() {
        return this.f31348D0;
    }

    @P
    public ImageView.ScaleType getLogoScaleType() {
        return this.f31350F0;
    }

    @P
    @InterfaceC0569l
    public Integer getNavigationIconTint() {
        return this.f31347C0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        g0();
        i0();
    }

    @Override // android.view.View
    @W(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f31351G0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f31351G0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(@N ImageView.ScaleType scaleType) {
        if (this.f31350F0 != scaleType) {
            this.f31350F0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@P Drawable drawable) {
        super.setNavigationIcon(h0(drawable));
    }

    public void setNavigationIconTint(@InterfaceC0569l int i4) {
        this.f31347C0 = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f31349E0 != z3) {
            this.f31349E0 = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f31348D0 != z3) {
            this.f31348D0 = z3;
            requestLayout();
        }
    }

    public MaterialToolbar(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.sh);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.N android.content.Context r8, @androidx.annotation.P android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f31345H0
            android.content.Context r8 = d1.C2044a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = T0.a.o.Km
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r10 = T0.a.o.Nm
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L2b
            int r10 = T0.a.o.Nm
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L2b:
            int r10 = T0.a.o.Pm
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f31348D0 = r10
            int r10 = T0.a.o.Om
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f31349E0 = r10
            int r10 = T0.a.o.Mm
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L4c
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f31346I0
            int r1 = r0.length
            if (r10 >= r1) goto L4c
            r10 = r0[r10]
            r7.f31350F0 = r10
        L4c:
            int r10 = T0.a.o.Lm
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L60
            int r10 = T0.a.o.Lm
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f31351G0 = r10
        L60:
            r9.recycle()
            r7.b0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
