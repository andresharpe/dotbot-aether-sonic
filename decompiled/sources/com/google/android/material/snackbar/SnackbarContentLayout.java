package com.google.android.material.snackbar;

import T0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import com.google.android.material.color.s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: E, reason: collision with root package name */
    private TextView f33430E;

    /* renamed from: F, reason: collision with root package name */
    private Button f33431F;

    /* renamed from: G, reason: collision with root package name */
    private int f33432G;

    public SnackbarContentLayout(@N Context context) {
        this(context, null);
    }

    private static void d(@N View view, int i4, int i5) {
        if (C0823k0.Y0(view)) {
            C0823k0.d2(view, C0823k0.k0(view), i4, C0823k0.j0(view), i5);
        } else {
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i5);
        }
    }

    private boolean e(int i4, int i5, int i6) {
        boolean z3;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f33430E.getPaddingTop() == i5 && this.f33430E.getPaddingBottom() == i6) {
            return z3;
        }
        d(this.f33430E, i5, i6);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i4, int i5) {
        this.f33430E.setAlpha(0.0f);
        long j4 = i5;
        long j5 = i4;
        this.f33430E.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.f33431F.getVisibility() == 0) {
            this.f33431F.setAlpha(0.0f);
            this.f33431F.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i4, int i5) {
        this.f33430E.setAlpha(1.0f);
        long j4 = i5;
        long j5 = i4;
        this.f33430E.animate().alpha(0.0f).setDuration(j4).setStartDelay(j5).start();
        if (this.f33431F.getVisibility() == 0) {
            this.f33431F.setAlpha(1.0f);
            this.f33431F.animate().alpha(0.0f).setDuration(j4).setStartDelay(j5).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f4) {
        if (f4 != 1.0f) {
            this.f33431F.setTextColor(s.m(s.d(this, a.c.f1979o3), this.f33431F.getCurrentTextColor(), f4));
        }
    }

    public Button getActionView() {
        return this.f33431F;
    }

    public TextView getMessageView() {
        return this.f33430E;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33430E = (TextView) findViewById(a.h.R4);
        this.f33431F = (Button) findViewById(a.h.Q4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        boolean z3;
        super.onMeasure(i4, i5);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(a.f.f2276E1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(a.f.f2272D1);
        if (this.f33430E.getLayout().getLineCount() > 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && this.f33432G > 0 && this.f33431F.getMeasuredWidth() > this.f33432G) {
            if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f33432G = i4;
    }

    public SnackbarContentLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
