package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1783d {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Matrix> f32617a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<RectF> f32618b = new ThreadLocal<>();

    public static void a(@N ViewGroup viewGroup, @N View view, @N Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        c(viewGroup, view, rect);
    }

    private static void b(ViewParent viewParent, @N View view, @N Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    public static void c(@N ViewGroup viewGroup, @N View view, @N Rect rect) {
        ThreadLocal<Matrix> threadLocal = f32617a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f32618b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
