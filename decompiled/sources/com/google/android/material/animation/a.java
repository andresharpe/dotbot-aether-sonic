package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f31207a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f31208b = new androidx.interpolator.view.animation.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f31209c = new androidx.interpolator.view.animation.a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f31210d = new androidx.interpolator.view.animation.c();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f31211e = new DecelerateInterpolator();

    public static float a(float f4, float f5, float f6) {
        return f4 + (f6 * (f5 - f4));
    }

    public static float b(float f4, float f5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f6, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f7, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f8) {
        if (f8 < f6) {
            return f4;
        }
        if (f8 > f7) {
            return f5;
        }
        return a(f4, f5, (f8 - f6) / (f7 - f6));
    }

    public static int c(int i4, int i5, float f4) {
        return i4 + Math.round(f4 * (i5 - i4));
    }
}
