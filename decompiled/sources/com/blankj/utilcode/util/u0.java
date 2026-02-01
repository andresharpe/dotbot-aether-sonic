package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class u0 {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ b f25184E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f25185F;

        a(b bVar, View view) {
            this.f25184E = bVar;
            this.f25185F = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f25184E;
            if (bVar != null) {
                bVar.a(this.f25185F);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(View view);
    }

    private u0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float a(float f4, int i4) {
        float f5;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return 0.0f;
                            }
                            f4 *= displayMetrics.xdpi;
                            f5 = 0.03937008f;
                        } else {
                            f5 = displayMetrics.xdpi;
                        }
                    } else {
                        f4 *= displayMetrics.xdpi;
                        f5 = 0.013888889f;
                    }
                } else {
                    f5 = displayMetrics.scaledDensity;
                }
            } else {
                f5 = displayMetrics.density;
            }
            return f4 * f5;
        }
        return f4;
    }

    public static int b(float f4) {
        return (int) ((f4 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void c(View view, b bVar) {
        view.post(new a(bVar, view));
    }

    public static int d(View view) {
        return f(view)[1];
    }

    public static int e(View view) {
        return f(view)[0];
    }

    public static int[] f(View view) {
        int makeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i4 = layoutParams.height;
        if (i4 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int g(float f4) {
        return (int) ((f4 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int h(float f4) {
        return (int) ((f4 / Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int i(float f4) {
        return (int) ((f4 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
