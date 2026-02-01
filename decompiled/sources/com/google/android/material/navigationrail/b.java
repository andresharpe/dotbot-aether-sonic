package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b extends com.google.android.material.navigation.c {

    /* renamed from: n0, reason: collision with root package name */
    @U
    private int f32849n0;

    /* renamed from: o0, reason: collision with root package name */
    private final FrameLayout.LayoutParams f32850o0;

    public b(@N Context context) {
        super(context);
        this.f32849n0 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f32850o0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int v(int i4, int i5, int i6) {
        int max = i5 / Math.max(1, i6);
        int i7 = this.f32849n0;
        if (i7 == -1) {
            i7 = View.MeasureSpec.getSize(i4);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i7, max), 0);
    }

    private int w(View view, int i4, int i5) {
        if (view.getVisibility() != 8) {
            view.measure(i4, i5);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int x(int i4, int i5, int i6, View view) {
        int makeMeasureSpec;
        v(i4, i5, i6);
        if (view == null) {
            makeMeasureSpec = v(i4, i5, i6);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != view) {
                i7 += w(childAt, i4, makeMeasureSpec);
            }
        }
        return i7;
    }

    private int y(int i4, int i5, int i6) {
        int i7;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i7 = w(childAt, i4, v(i4, i5, i6));
            i5 -= i7;
            i6--;
        } else {
            i7 = 0;
        }
        return i7 + x(i4, i5, i6, childAt);
    }

    @Override // com.google.android.material.navigation.c
    @N
    protected com.google.android.material.navigation.a g(@N Context context) {
        return new a(context);
    }

    @U
    public int getItemMinimumHeight() {
        return this.f32849n0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.f32850o0.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int i8 = i6 - i4;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                childAt.layout(0, i9, i8, measuredHeight);
                i9 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int x3;
        int size = View.MeasureSpec.getSize(i5);
        int size2 = getMenu().H().size();
        if (size2 > 1 && l(getLabelVisibilityMode(), size2)) {
            x3 = y(i4, size, size2);
        } else {
            x3 = x(i4, size, size2, null);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i4), i4, 0), View.resolveSizeAndState(x3, i5, 0));
    }

    public void setItemMinimumHeight(@U int i4) {
        if (this.f32849n0 != i4) {
            this.f32849n0 = i4;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMenuGravity(int i4) {
        FrameLayout.LayoutParams layoutParams = this.f32850o0;
        if (layoutParams.gravity != i4) {
            layoutParams.gravity = i4;
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        if ((this.f32850o0.gravity & 112) == 48) {
            return true;
        }
        return false;
    }
}
