package com.google.android.material.resources;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e0;
import androidx.appcompat.widget.g0;
import e.C2046a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f33007a = 1.3f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f33008b = 2.0f;

    private c() {
    }

    @P
    public static ColorStateList a(@N Context context, @N TypedArray typedArray, @e0 int i4) {
        int resourceId;
        ColorStateList a4;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (a4 = C2046a.a(context, resourceId)) != null) {
            return a4;
        }
        return typedArray.getColorStateList(i4);
    }

    @P
    public static ColorStateList b(@N Context context, @N g0 g0Var, @e0 int i4) {
        int u3;
        ColorStateList a4;
        if (g0Var.C(i4) && (u3 = g0Var.u(i4, 0)) != 0 && (a4 = C2046a.a(context, u3)) != null) {
            return a4;
        }
        return g0Var.d(i4);
    }

    private static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(@N Context context, @N TypedArray typedArray, @e0 int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i4, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i5);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i4, i5);
    }

    @P
    public static Drawable e(@N Context context, @N TypedArray typedArray, @e0 int i4) {
        int resourceId;
        Drawable b4;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (b4 = C2046a.b(context, resourceId)) != null) {
            return b4;
        }
        return typedArray.getDrawable(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @e0
    public static int f(@N TypedArray typedArray, @e0 int i4, @e0 int i5) {
        if (typedArray.hasValue(i4)) {
            return i4;
        }
        return i5;
    }

    @P
    public static d g(@N Context context, @N TypedArray typedArray, @e0 int i4) {
        int resourceId;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            return new d(context, resourceId);
        }
        return null;
    }

    public static int h(@N Context context, @d0 int i4, int i5) {
        if (i4 == 0) {
            return i5;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.xt);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(a.o.yt, typedValue);
        obtainStyledAttributes.recycle();
        if (!value) {
            return i5;
        }
        if (c(typedValue) == 2) {
            return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean i(@N Context context) {
        if (context.getResources().getConfiguration().fontScale >= f33007a) {
            return true;
        }
        return false;
    }

    public static boolean j(@N Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
