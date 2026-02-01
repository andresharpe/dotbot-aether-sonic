package com.google.android.material.navigationrail;

import T0.a;
import android.content.Context;
import android.view.View;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
final class a extends com.google.android.material.navigation.a {
    public a(@N Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.a
    @InterfaceC0574q
    protected int getItemDefaultMarginResId() {
        return a.f.A8;
    }

    @Override // com.google.android.material.navigation.a
    @I
    protected int getItemLayoutResId() {
        return a.k.f2925D0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i5) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i5)), i5, 0));
        }
    }
}
