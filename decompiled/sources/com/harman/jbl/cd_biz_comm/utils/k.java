package com.harman.jbl.cd_biz_comm.utils;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;

/* loaded from: classes2.dex */
public class k {
    public static int a(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(float f4) {
        return (int) ((f4 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(1000L);
        ofFloat.start();
    }

    public static int d(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int e(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int f(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int g(float f4) {
        return (int) ((f4 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int h(float f4) {
        return (int) ((f4 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
