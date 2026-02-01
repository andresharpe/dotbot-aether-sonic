package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.H0;

/* renamed from: androidx.core.graphics.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717h {
    public static final void a(@l3.d Canvas canvas, float f4, float f5, float f6, float f7, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(f4, f5, f6, f7);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void b(@l3.d Canvas canvas, int i4, int i5, int i6, int i7, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(i4, i5, i6, i7);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void c(@l3.d Canvas canvas, @l3.d Path clipPath, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(clipPath, "clipPath");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.clipPath(clipPath);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void d(@l3.d Canvas canvas, @l3.d Rect clipRect, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(clipRect, "clipRect");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void e(@l3.d Canvas canvas, @l3.d RectF clipRect, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(clipRect, "clipRect");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void f(@l3.d Canvas canvas, @l3.d Matrix matrix, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(matrix, "matrix");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, X2.l block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            matrix = new Matrix();
        }
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(matrix, "matrix");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void h(@l3.d Canvas canvas, float f4, float f5, float f6, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.rotate(f4, f5, f6);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f4, float f5, float f6, X2.l block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.rotate(f4, f5, f6);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void j(@l3.d Canvas canvas, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void k(@l3.d Canvas canvas, float f4, float f5, float f6, float f7, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.scale(f4, f5, f6, f7);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f4, float f5, float f6, float f7, X2.l block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        if ((i4 & 8) != 0) {
            f7 = 0.0f;
        }
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.scale(f4, f5, f6, f7);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void m(@l3.d Canvas canvas, float f4, float f5, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.skew(f4, f5);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f4, float f5, X2.l block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.skew(f4, f5);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final void o(@l3.d Canvas canvas, float f4, float f5, @l3.d X2.l<? super Canvas, H0> block) {
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.translate(f4, f5);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f4, float f5, X2.l block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        kotlin.jvm.internal.F.p(canvas, "<this>");
        kotlin.jvm.internal.F.p(block, "block");
        int save = canvas.save();
        canvas.translate(f4, f5);
        try {
            block.C(canvas);
        } finally {
            kotlin.jvm.internal.C.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.C.c(1);
        }
    }
}
