package com.google.android.material.internal;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e0;
import androidx.appcompat.widget.g0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    private static final String f32729b = "Theme.AppCompat";

    /* renamed from: d, reason: collision with root package name */
    private static final String f32731d = "Theme.MaterialComponents";

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f32728a = {a.c.f1934f3};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f32730c = {a.c.f1959k3};

    private w() {
    }

    public static void a(@N Context context) {
        e(context, f32728a, f32729b);
    }

    private static void b(@N Context context, AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.gv, i4, i5);
        boolean z3 = obtainStyledAttributes.getBoolean(a.o.iv, false);
        obtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.c.a8, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@N Context context) {
        e(context, f32730c, f32731d);
    }

    private static void d(@N Context context, AttributeSet attributeSet, @N @e0 int[] iArr, @InterfaceC0563f int i4, @d0 int i5, @P @e0 int... iArr2) {
        boolean z3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.gv, i4, i5);
        boolean z4 = false;
        if (!obtainStyledAttributes.getBoolean(a.o.jv, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z3 = g(context, attributeSet, iArr, i4, i5, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(a.o.hv, -1) != -1) {
                z4 = true;
            }
            z3 = z4;
        }
        obtainStyledAttributes.recycle();
        if (z3) {
        } else {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(@N Context context, @N int[] iArr, String str) {
        if (i(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(@N Context context) {
        return i(context, f32728a);
    }

    private static boolean g(@N Context context, AttributeSet attributeSet, @N @e0 int[] iArr, @InterfaceC0563f int i4, @d0 int i5, @N @e0 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        for (int i6 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i6, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@N Context context) {
        return i(context, f32730c);
    }

    private static boolean i(@N Context context, @N int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!obtainStyledAttributes.hasValue(i4)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @N
    public static TypedArray j(@N Context context, AttributeSet attributeSet, @N @e0 int[] iArr, @InterfaceC0563f int i4, @d0 int i5, @e0 int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
    }

    public static g0 k(@N Context context, AttributeSet attributeSet, @N @e0 int[] iArr, @InterfaceC0563f int i4, @d0 int i5, @e0 int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return g0.G(context, attributeSet, iArr, i4, i5);
    }
}
