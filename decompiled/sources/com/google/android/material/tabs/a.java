package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a extends c {
    private static float e(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (float) (1.0d - Math.cos((f4 * 3.141592653589793d) / 2.0d));
    }

    private static float f(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        return (float) Math.sin((f4 * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.c
    public void d(TabLayout tabLayout, View view, View view2, float f4, @N Drawable drawable) {
        float f5;
        float e4;
        RectF a4 = c.a(tabLayout, view);
        RectF a5 = c.a(tabLayout, view2);
        if (a4.left < a5.left) {
            f5 = e(f4);
            e4 = f(f4);
        } else {
            f5 = f(f4);
            e4 = e(f4);
        }
        drawable.setBounds(com.google.android.material.animation.a.c((int) a4.left, (int) a5.left, f5), drawable.getBounds().top, com.google.android.material.animation.a.c((int) a4.right, (int) a5.right, e4), drawable.getBounds().bottom);
    }
}
