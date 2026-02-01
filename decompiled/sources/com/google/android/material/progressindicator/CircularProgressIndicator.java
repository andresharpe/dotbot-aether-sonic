package com.google.android.material.progressindicator;

import T0.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class CircularProgressIndicator extends b<f> {

    /* renamed from: f0, reason: collision with root package name */
    public static final int f32860f0 = a.n.Fh;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f32861g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f32862h0 = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public CircularProgressIndicator(@N Context context) {
        this(context, null);
    }

    private void u() {
        setIndeterminateDrawable(k.x(getContext(), (f) this.f32874E));
        setProgressDrawable(g.A(getContext(), (f) this.f32874E));
    }

    public int getIndicatorDirection() {
        return ((f) this.f32874E).f32928i;
    }

    @U
    public int getIndicatorInset() {
        return ((f) this.f32874E).f32927h;
    }

    @U
    public int getIndicatorSize() {
        return ((f) this.f32874E).f32926g;
    }

    public void setIndicatorDirection(int i4) {
        ((f) this.f32874E).f32928i = i4;
        invalidate();
    }

    public void setIndicatorInset(@U int i4) {
        S s4 = this.f32874E;
        if (((f) s4).f32927h != i4) {
            ((f) s4).f32927h = i4;
            invalidate();
        }
    }

    public void setIndicatorSize(@U int i4) {
        int max = Math.max(i4, getTrackThickness() * 2);
        S s4 = this.f32874E;
        if (((f) s4).f32926g != max) {
            ((f) s4).f32926g = max;
            ((f) s4).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackThickness(int i4) {
        super.setTrackThickness(i4);
        ((f) this.f32874E).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public f i(@N Context context, @N AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public CircularProgressIndicator(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1943h2);
    }

    public CircularProgressIndicator(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        super(context, attributeSet, i4, f32860f0);
        u();
    }
}
