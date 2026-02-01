package com.google.android.material.switchmaterial;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.s;
import com.google.android.material.internal.E;

/* loaded from: classes2.dex */
public class a extends SwitchCompat {

    /* renamed from: N0, reason: collision with root package name */
    private static final int f33446N0 = a.n.Mh;

    /* renamed from: O0, reason: collision with root package name */
    private static final int[][] f33447O0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: J0, reason: collision with root package name */
    @N
    private final Z0.a f33448J0;

    /* renamed from: K0, reason: collision with root package name */
    @P
    private ColorStateList f33449K0;

    /* renamed from: L0, reason: collision with root package name */
    @P
    private ColorStateList f33450L0;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f33451M0;

    public a(@N Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f33449K0 == null) {
            int d4 = s.d(this, a.c.f1979o3);
            int d5 = s.d(this, a.c.f1848L2);
            float dimension = getResources().getDimension(a.f.m9);
            if (this.f33448J0.l()) {
                dimension += E.j(this);
            }
            int e4 = this.f33448J0.e(d4, dimension);
            int[][] iArr = f33447O0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = s.m(d4, d5, 1.0f);
            iArr2[1] = e4;
            iArr2[2] = s.m(d4, d5, 0.38f);
            iArr2[3] = e4;
            this.f33449K0 = new ColorStateList(iArr, iArr2);
        }
        return this.f33449K0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f33450L0 == null) {
            int[][] iArr = f33447O0;
            int[] iArr2 = new int[iArr.length];
            int d4 = s.d(this, a.c.f1979o3);
            int d5 = s.d(this, a.c.f1848L2);
            int d6 = s.d(this, a.c.f1904Z2);
            iArr2[0] = s.m(d4, d5, 0.54f);
            iArr2[1] = s.m(d4, d6, 0.32f);
            iArr2[2] = s.m(d4, d5, 0.12f);
            iArr2[3] = s.m(d4, d6, 0.12f);
            this.f33450L0 = new ColorStateList(iArr, iArr2);
        }
        return this.f33450L0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33451M0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f33451M0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public boolean s() {
        return this.f33451M0;
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f33451M0 = z3;
        if (z3) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public a(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.bf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@androidx.annotation.N android.content.Context r7, @androidx.annotation.P android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.a.f33446N0
            android.content.Context r7 = d1.C2044a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            Z0.a r7 = new Z0.a
            r7.<init>(r0)
            r6.f33448J0 = r7
            int[] r2 = T0.a.o.Ps
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r9 = T0.a.o.Qs
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f33451M0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
