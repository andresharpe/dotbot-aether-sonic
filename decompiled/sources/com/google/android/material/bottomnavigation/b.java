package com.google.android.material.bottomnavigation;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.core.view.C0823k0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b extends com.google.android.material.navigation.c {

    /* renamed from: n0, reason: collision with root package name */
    private final int f31538n0;

    /* renamed from: o0, reason: collision with root package name */
    private final int f31539o0;

    /* renamed from: p0, reason: collision with root package name */
    private final int f31540p0;

    /* renamed from: q0, reason: collision with root package name */
    private final int f31541q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f31542r0;

    /* renamed from: s0, reason: collision with root package name */
    private int[] f31543s0;

    public b(@N Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f31538n0 = resources.getDimensionPixelSize(a.f.f2347W0);
        this.f31539o0 = resources.getDimensionPixelSize(a.f.f2351X0);
        this.f31540p0 = resources.getDimensionPixelSize(a.f.f2323Q0);
        this.f31541q0 = resources.getDimensionPixelSize(a.f.f2327R0);
        this.f31543s0 = new int[5];
    }

    @Override // com.google.android.material.navigation.c
    @N
    protected com.google.android.material.navigation.a g(@N Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                if (C0823k0.Z(this) == 1) {
                    int i12 = i8 - i10;
                    childAt.layout(i12 - childAt.getMeasuredWidth(), 0, i12, i9);
                } else {
                    childAt.layout(i10, 0, childAt.getMeasuredWidth() + i10, i9);
                }
                i10 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        g menu = getMenu();
        int size = View.MeasureSpec.getSize(i4);
        int size2 = menu.H().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i5);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i9 = 1;
        if (l(getLabelVisibilityMode(), size2) && u()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i10 = this.f31541q0;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f31540p0, Integer.MIN_VALUE), makeMeasureSpec);
                i10 = Math.max(i10, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            int i11 = size2 - i6;
            int min = Math.min(size - (this.f31539o0 * i11), Math.min(i10, this.f31540p0));
            int i12 = size - min;
            if (i11 == 0) {
                i7 = 1;
            } else {
                i7 = i11;
            }
            int min2 = Math.min(i12 / i7, this.f31538n0);
            int i13 = i12 - (i11 * min2);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    int[] iArr = this.f31543s0;
                    if (i14 == getSelectedItemPosition()) {
                        i8 = min;
                    } else {
                        i8 = min2;
                    }
                    iArr[i14] = i8;
                    if (i13 > 0) {
                        int[] iArr2 = this.f31543s0;
                        iArr2[i14] = iArr2[i14] + 1;
                        i13--;
                    }
                } else {
                    this.f31543s0[i14] = 0;
                }
            }
        } else {
            if (size2 != 0) {
                i9 = size2;
            }
            int min3 = Math.min(size / i9, this.f31540p0);
            int i15 = size - (size2 * min3);
            for (int i16 = 0; i16 < childCount; i16++) {
                if (getChildAt(i16).getVisibility() != 8) {
                    int[] iArr3 = this.f31543s0;
                    iArr3[i16] = min3;
                    if (i15 > 0) {
                        iArr3[i16] = min3 + 1;
                        i15--;
                    }
                } else {
                    this.f31543s0[i16] = 0;
                }
            }
        }
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f31543s0[i18], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i17 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i17, View.MeasureSpec.makeMeasureSpec(i17, 1073741824), 0), View.resolveSizeAndState(size3, i5, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        this.f31542r0 = z3;
    }

    public boolean u() {
        return this.f31542r0;
    }
}
