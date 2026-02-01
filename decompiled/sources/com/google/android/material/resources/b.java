package com.google.android.material.resources;

import T0.a;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {
    @P
    public static TypedValue a(@N Context context, @InterfaceC0563f int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@N Context context, @InterfaceC0563f int i4, boolean z3) {
        TypedValue a4 = a(context, i4);
        if (a4 != null && a4.type == 18) {
            if (a4.data != 0) {
                return true;
            }
            return false;
        }
        return z3;
    }

    public static boolean c(@N Context context, @InterfaceC0563f int i4, @N String str) {
        if (g(context, i4, str) != 0) {
            return true;
        }
        return false;
    }

    @U
    public static int d(@N Context context, @InterfaceC0563f int i4, @InterfaceC0574q int i5) {
        float dimension;
        TypedValue a4 = a(context, i4);
        if (a4 != null && a4.type == 5) {
            dimension = a4.getDimension(context.getResources().getDisplayMetrics());
        } else {
            dimension = context.getResources().getDimension(i5);
        }
        return (int) dimension;
    }

    public static int e(@N Context context, @InterfaceC0563f int i4, int i5) {
        TypedValue a4 = a(context, i4);
        if (a4 != null && a4.type == 16) {
            return a4.data;
        }
        return i5;
    }

    @U
    public static int f(@N Context context) {
        return d(context, a.c.Db, a.f.n8);
    }

    public static int g(@N Context context, @InterfaceC0563f int i4, @N String str) {
        TypedValue a4 = a(context, i4);
        if (a4 != null) {
            return a4.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static int h(@N View view, @InterfaceC0563f int i4) {
        return g(view.getContext(), i4, view.getClass().getCanonicalName());
    }
}
