package com.google.android.material.divider;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.core.content.C0669d;
import androidx.core.view.C0823k0;
import com.google.android.material.shape.j;

/* loaded from: classes2.dex */
public class a extends View {

    /* renamed from: J, reason: collision with root package name */
    private static final int f32276J = a.n.qi;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final j f32277E;

    /* renamed from: F, reason: collision with root package name */
    private int f32278F;

    /* renamed from: G, reason: collision with root package name */
    @InterfaceC0569l
    private int f32279G;

    /* renamed from: H, reason: collision with root package name */
    private int f32280H;

    /* renamed from: I, reason: collision with root package name */
    private int f32281I;

    public a(@N Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f32279G;
    }

    @U
    public int getDividerInsetEnd() {
        return this.f32281I;
    }

    @U
    public int getDividerInsetStart() {
        return this.f32280H;
    }

    public int getDividerThickness() {
        return this.f32278F;
    }

    @Override // android.view.View
    protected void onDraw(@N Canvas canvas) {
        int i4;
        int width;
        int i5;
        super.onDraw(canvas);
        boolean z3 = true;
        if (C0823k0.Z(this) != 1) {
            z3 = false;
        }
        if (z3) {
            i4 = this.f32281I;
        } else {
            i4 = this.f32280H;
        }
        if (z3) {
            width = getWidth();
            i5 = this.f32280H;
        } else {
            width = getWidth();
            i5 = this.f32281I;
        }
        this.f32277E.setBounds(i4, 0, width - i5, getBottom() - getTop());
        this.f32277E.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i6 = this.f32278F;
            if (i6 > 0 && measuredHeight != i6) {
                measuredHeight = i6;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@InterfaceC0569l int i4) {
        if (this.f32279G != i4) {
            this.f32279G = i4;
            this.f32277E.o0(ColorStateList.valueOf(i4));
            invalidate();
        }
    }

    public void setDividerColorResource(@InterfaceC0571n int i4) {
        setDividerColor(C0669d.f(getContext(), i4));
    }

    public void setDividerInsetEnd(@U int i4) {
        this.f32281I = i4;
    }

    public void setDividerInsetEndResource(@InterfaceC0574q int i4) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerInsetStart(@U int i4) {
        this.f32280H = i4;
    }

    public void setDividerInsetStartResource(@InterfaceC0574q int i4) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerThickness(@U int i4) {
        if (this.f32278F != i4) {
            this.f32278F = i4;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@InterfaceC0574q int i4) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i4));
    }

    public a(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.jb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@androidx.annotation.N android.content.Context r8, @androidx.annotation.P android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.divider.a.f32276J
            android.content.Context r8 = d1.C2044a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.google.android.material.shape.j r0 = new com.google.android.material.shape.j
            r0.<init>()
            r7.f32277E = r0
            int[] r2 = T0.a.o.nm
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r10 = T0.a.o.rm
            android.content.res.Resources r0 = r7.getResources()
            int r1 = T0.a.f.s5
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f32278F = r10
            int r10 = T0.a.o.qm
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f32280H = r10
            int r10 = T0.a.o.pm
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f32281I = r10
            int r10 = T0.a.o.om
            android.content.res.ColorStateList r8 = com.google.android.material.resources.c.a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
