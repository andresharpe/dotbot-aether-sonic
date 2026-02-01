package com.google.android.material.checkbox;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.P;
import androidx.appcompat.widget.C0595h;
import androidx.core.widget.d;
import com.google.android.material.color.s;
import com.google.android.material.internal.E;

/* loaded from: classes2.dex */
public class a extends C0595h {

    /* renamed from: L, reason: collision with root package name */
    private static final int f31772L = a.n.Kh;

    /* renamed from: M, reason: collision with root package name */
    private static final int[][] f31773M = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: I, reason: collision with root package name */
    @P
    private ColorStateList f31774I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f31775J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f31776K;

    public a(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f31774I == null) {
            int[][] iArr = f31773M;
            int[] iArr2 = new int[iArr.length];
            int d4 = s.d(this, a.c.f1848L2);
            int d5 = s.d(this, a.c.f1979o3);
            int d6 = s.d(this, a.c.f1904Z2);
            iArr2[0] = s.m(d5, d4, 1.0f);
            iArr2[1] = s.m(d5, d6, 0.54f);
            iArr2[2] = s.m(d5, d6, 0.38f);
            iArr2[3] = s.m(d5, d6, 0.38f);
            this.f31774I = new ColorStateList(iArr, iArr2);
        }
        return this.f31774I;
    }

    public boolean c() {
        return this.f31776K;
    }

    public boolean d() {
        return this.f31775J;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31775J && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a4;
        int i4;
        if (this.f31776K && TextUtils.isEmpty(getText()) && (a4 = d.a(this)) != null) {
            if (E.k(this)) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            int width = ((getWidth() - a4.getIntrinsicWidth()) / 2) * i4;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a4.getBounds();
                androidx.core.graphics.drawable.d.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f31776K = z3;
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f31775J = z3;
        if (z3) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    public a(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1807B1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, @androidx.annotation.P android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.a.f31772L
            android.content.Context r8 = d1.C2044a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = T0.a.o.jm
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r10 = T0.a.o.km
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L2a
            int r10 = T0.a.o.km
            android.content.res.ColorStateList r8 = com.google.android.material.resources.c.a(r8, r9, r10)
            androidx.core.widget.d.d(r7, r8)
        L2a:
            int r8 = T0.a.o.mm
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f31775J = r8
            int r8 = T0.a.o.lm
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f31776K = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
