package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C0734z;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6099a = "ThemeUtils";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f6100b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static final int[] f6101c = {-16842910};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f6102d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f6103e = {R.attr.state_activated};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f6104f = {R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f6105g = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f6106h = {R.attr.state_selected};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f6107i = {-16842919, -16842908};

    /* renamed from: j, reason: collision with root package name */
    static final int[] f6108j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f6109k = new int[1];

    private b0() {
    }

    public static void a(@androidx.annotation.N View view, @androidx.annotation.N Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2042a.m.f50039S0);
        try {
            if (!obtainStyledAttributes.hasValue(C2042a.m.f50104g3)) {
                Log.e(f6099a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @androidx.annotation.N
    public static ColorStateList b(int i4, int i5) {
        return new ColorStateList(new int[][]{f6101c, f6108j}, new int[]{i5, i4});
    }

    public static int c(@androidx.annotation.N Context context, int i4) {
        ColorStateList f4 = f(context, i4);
        if (f4 != null && f4.isStateful()) {
            return f4.getColorForState(f6101c, f4.getDefaultColor());
        }
        TypedValue g4 = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, g4, true);
        return e(context, i4, g4.getFloat());
    }

    public static int d(@androidx.annotation.N Context context, int i4) {
        int[] iArr = f6109k;
        iArr[0] = i4;
        g0 F3 = g0.F(context, null, iArr);
        try {
            return F3.c(0, 0);
        } finally {
            F3.I();
        }
    }

    static int e(@androidx.annotation.N Context context, int i4, float f4) {
        return C0734z.B(d(context, i4), Math.round(Color.alpha(r0) * f4));
    }

    @androidx.annotation.P
    public static ColorStateList f(@androidx.annotation.N Context context, int i4) {
        int[] iArr = f6109k;
        iArr[0] = i4;
        g0 F3 = g0.F(context, null, iArr);
        try {
            return F3.d(0);
        } finally {
            F3.I();
        }
    }

    private static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f6100b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
