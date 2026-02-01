package com.blankj.utilcode.util;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class J0 {
    public static void a(View view) {
        ViewGroup viewGroup;
        view.setFocusable(false);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setFocusable(false);
            if (childAt instanceof ViewGroup) {
                a(childAt);
            }
        }
    }

    public static boolean b() {
        if (TextUtils.getLayoutDirectionFromLocale(E0.a().getResources().getConfiguration().getLocales().get(0)) != 1) {
            return false;
        }
        return true;
    }

    public static View c(@androidx.annotation.I int i4) {
        return ((LayoutInflater) E0.a().getSystemService("layout_inflater")).inflate(i4, (ViewGroup) null);
    }

    public static void d(Runnable runnable) {
        H0.V0(runnable);
    }

    public static void e(Runnable runnable, long j4) {
        H0.W0(runnable, j4);
    }

    public static void f(View view, boolean z3) {
        g(view, z3, null);
    }

    public static void g(View view, boolean z3, View... viewArr) {
        if (view == null) {
            return;
        }
        if (viewArr != null) {
            for (View view2 : viewArr) {
                if (view == view2) {
                    return;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                g(viewGroup.getChildAt(i4), z3, viewArr);
            }
        }
        view.setEnabled(z3);
    }
}
