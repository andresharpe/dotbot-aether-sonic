package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private static final float f33565b = 0.5f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.c
    public void d(TabLayout tabLayout, View view, View view2, float f4, @N Drawable drawable) {
        float b4;
        if (f4 >= 0.5f) {
            view = view2;
        }
        RectF a4 = c.a(tabLayout, view);
        if (f4 < 0.5f) {
            b4 = com.google.android.material.animation.a.b(1.0f, 0.0f, 0.0f, 0.5f, f4);
        } else {
            b4 = com.google.android.material.animation.a.b(0.0f, 1.0f, 0.5f, 1.0f, f4);
        }
        drawable.setBounds((int) a4.left, drawable.getBounds().top, (int) a4.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b4 * 255.0f));
    }
}
