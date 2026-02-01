package androidx.core.graphics;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class F {
    @l3.d
    public static final Matrix a(float f4, float f5, float f6) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f4, f5, f6);
        return matrix;
    }

    public static /* synthetic */ Matrix b(float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        return a(f4, f5, f6);
    }

    @l3.d
    public static final Matrix c(float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f5);
        return matrix;
    }

    public static /* synthetic */ Matrix d(float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1.0f;
        }
        return c(f4, f5);
    }

    @l3.d
    public static final Matrix e(@l3.d Matrix matrix, @l3.d Matrix m4) {
        kotlin.jvm.internal.F.p(matrix, "<this>");
        kotlin.jvm.internal.F.p(m4, "m");
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preConcat(m4);
        return matrix2;
    }

    @l3.d
    public static final Matrix f(float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f4, f5);
        return matrix;
    }

    public static /* synthetic */ Matrix g(float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        return f(f4, f5);
    }

    @l3.d
    public static final float[] h(@l3.d Matrix matrix) {
        kotlin.jvm.internal.F.p(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
