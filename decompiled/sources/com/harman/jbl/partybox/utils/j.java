package com.harman.jbl.partybox.utils;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public class j {
    public static int a(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(1000L);
        ofFloat.start();
    }

    public static int c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int d(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int e(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
