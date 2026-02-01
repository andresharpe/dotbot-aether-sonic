package com.google.android.material.radiobutton;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.d;
import com.google.android.material.color.s;

/* loaded from: classes2.dex */
public class a extends AppCompatRadioButton {

    /* renamed from: K, reason: collision with root package name */
    private static final int f33000K = a.n.Lh;

    /* renamed from: L, reason: collision with root package name */
    private static final int[][] f33001L = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: I, reason: collision with root package name */
    @P
    private ColorStateList f33002I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f33003J;

    public a(@N Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f33002I == null) {
            int d4 = s.d(this, a.c.f1848L2);
            int d5 = s.d(this, a.c.f1904Z2);
            int d6 = s.d(this, a.c.f1979o3);
            int[][] iArr = f33001L;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = s.m(d6, d4, 1.0f);
            iArr2[1] = s.m(d6, d5, 0.54f);
            iArr2[2] = s.m(d6, d5, 0.38f);
            iArr2[3] = s.m(d6, d5, 0.38f);
            this.f33002I = new ColorStateList(iArr, iArr2);
        }
        return this.f33002I;
    }

    public boolean a() {
        return this.f33003J;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33003J && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f33003J = z3;
        if (z3) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, null);
        }
    }

    public a(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.od);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@androidx.annotation.N android.content.Context r8, @androidx.annotation.P android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.radiobutton.a.f33000K
            android.content.Context r8 = d1.C2044a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = T0.a.o.tm
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r10 = T0.a.o.um
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L2a
            int r10 = T0.a.o.um
            android.content.res.ColorStateList r8 = com.google.android.material.resources.c.a(r8, r9, r10)
            androidx.core.widget.d.d(r7, r8)
        L2a:
            int r8 = T0.a.o.vm
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f33003J = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
