package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import q.C2394a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class j {
    private j() {
    }

    @P
    public static Typeface a(@N Context context, @N Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    @P
    public static Typeface b(@N Configuration configuration, @N Typeface typeface) {
        int i4;
        int i5;
        int weight;
        int i6;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = configuration.fontWeightAdjustment;
            if (i4 != Integer.MAX_VALUE) {
                i5 = configuration.fontWeightAdjustment;
                if (i5 != 0) {
                    weight = typeface.getWeight();
                    i6 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, C2394a.e(weight + i6, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
