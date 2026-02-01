package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;
import com.google.android.material.internal.E;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @r(unit = 0)
    private static final int f33566a = 24;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF a(TabLayout tabLayout, @P View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.D() && (view instanceof TabLayout.n)) {
            return b((TabLayout.n) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static RectF b(@N TabLayout.n nVar, @r(unit = 0) int i4) {
        int contentWidth = nVar.getContentWidth();
        int contentHeight = nVar.getContentHeight();
        int e4 = (int) E.e(nVar.getContext(), i4);
        if (contentWidth < e4) {
            contentWidth = e4;
        }
        int left = (nVar.getLeft() + nVar.getRight()) / 2;
        int top = (nVar.getTop() + nVar.getBottom()) / 2;
        int i5 = contentWidth / 2;
        return new RectF(left - i5, top - (contentHeight / 2), i5 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(TabLayout tabLayout, View view, @N Drawable drawable) {
        RectF a4 = a(tabLayout, view);
        drawable.setBounds((int) a4.left, drawable.getBounds().top, (int) a4.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TabLayout tabLayout, View view, View view2, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @N Drawable drawable) {
        RectF a4 = a(tabLayout, view);
        RectF a5 = a(tabLayout, view2);
        drawable.setBounds(com.google.android.material.animation.a.c((int) a4.left, (int) a5.left, f4), drawable.getBounds().top, com.google.android.material.animation.a.c((int) a4.right, (int) a5.right, f4), drawable.getBounds().bottom);
    }
}
