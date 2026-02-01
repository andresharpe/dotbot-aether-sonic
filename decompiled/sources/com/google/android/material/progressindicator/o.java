package com.google.android.material.progressindicator;

import T0.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class o extends com.google.android.material.progressindicator.b<p> {

    /* renamed from: f0, reason: collision with root package name */
    public static final int f32990f0 = a.n.Rh;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f32991g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f32992h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f32993i0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f32994j0 = 1;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f32995k0 = 2;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f32996l0 = 3;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public o(@N Context context) {
        this(context, null);
    }

    private void u() {
        setIndeterminateDrawable(k.y(getContext(), (p) this.f32874E));
        setProgressDrawable(g.B(getContext(), (p) this.f32874E));
    }

    public int getIndeterminateAnimationType() {
        return ((p) this.f32874E).f32997g;
    }

    public int getIndicatorDirection() {
        return ((p) this.f32874E).f32998h;
    }

    @Override // android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        S s4 = this.f32874E;
        p pVar = (p) s4;
        boolean z4 = true;
        if (((p) s4).f32998h != 1 && ((C0823k0.Z(this) != 1 || ((p) this.f32874E).f32998h != 2) && (C0823k0.Z(this) != 0 || ((p) this.f32874E).f32998h != 3))) {
            z4 = false;
        }
        pVar.f32999i = z4;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        int paddingLeft = i4 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i5 - (getPaddingTop() + getPaddingBottom());
        k<p> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        g<p> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void p(int i4, boolean z3) {
        S s4 = this.f32874E;
        if (s4 != 0 && ((p) s4).f32997g == 0 && isIndeterminate()) {
            return;
        }
        super.p(i4, z3);
    }

    public void setIndeterminateAnimationType(int i4) {
        if (((p) this.f32874E).f32997g == i4) {
            return;
        }
        if (s() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s4 = this.f32874E;
        ((p) s4).f32997g = i4;
        ((p) s4).e();
        if (i4 == 0) {
            getIndeterminateDrawable().B(new m((p) this.f32874E));
        } else {
            getIndeterminateDrawable().B(new n(getContext(), (p) this.f32874E));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setIndicatorColor(@N int... iArr) {
        super.setIndicatorColor(iArr);
        ((p) this.f32874E).e();
    }

    public void setIndicatorDirection(int i4) {
        S s4 = this.f32874E;
        ((p) s4).f32998h = i4;
        p pVar = (p) s4;
        boolean z3 = true;
        if (i4 != 1 && ((C0823k0.Z(this) != 1 || ((p) this.f32874E).f32998h != 2) && (C0823k0.Z(this) != 0 || i4 != 3))) {
            z3 = false;
        }
        pVar.f32999i = z3;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackCornerRadius(int i4) {
        super.setTrackCornerRadius(i4);
        ((p) this.f32874E).e();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public p i(@N Context context, @N AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    public o(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.fa);
    }

    public o(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        super(context, attributeSet, i4, f32990f0);
        u();
    }
}
