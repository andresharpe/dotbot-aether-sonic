package com.google.android.material.ripple;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.core.graphics.C0734z;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f33040a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f33041b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f33042c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f33043d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f33044e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f33045f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f33046g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f33047h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f33048i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f33049j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f33050k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    @i0
    static final String f33051l = b.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    @i0
    static final String f33052m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    private b() {
    }

    @N
    public static ColorStateList a(@P ColorStateList colorStateList) {
        if (f33040a) {
            return new ColorStateList(new int[][]{f33049j, StateSet.NOTHING}, new int[]{c(colorStateList, f33045f), c(colorStateList, f33041b)});
        }
        int[] iArr = f33045f;
        int[] iArr2 = f33046g;
        int[] iArr3 = f33047h;
        int[] iArr4 = f33048i;
        int[] iArr5 = f33041b;
        int[] iArr6 = f33042c;
        int[] iArr7 = f33043d;
        int[] iArr8 = f33044e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f33049j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @InterfaceC0569l
    @TargetApi(21)
    private static int b(@InterfaceC0569l int i4) {
        return C0734z.B(i4, Math.min(Color.alpha(i4) * 2, 255));
    }

    @InterfaceC0569l
    private static int c(@P ColorStateList colorStateList, int[] iArr) {
        int i4;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i4 = 0;
        }
        if (f33040a) {
            return b(i4);
        }
        return i4;
    }

    @N
    public static ColorStateList d(@P ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f33050k, 0)) != 0) {
                Log.w(f33051l, f33052m);
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e(@N int[] iArr) {
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 : iArr) {
            if (i4 == 16842910) {
                z3 = true;
            } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                z4 = true;
            }
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }
}
