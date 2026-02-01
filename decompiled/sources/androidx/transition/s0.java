package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.transition.D;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class s0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f20150b = "ViewUtilsBase";

    /* renamed from: c, reason: collision with root package name */
    private static Method f20151c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f20152d = false;

    /* renamed from: e, reason: collision with root package name */
    private static Field f20153e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f20154f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final int f20155g = 12;

    /* renamed from: a, reason: collision with root package name */
    private float[] f20156a;

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (!f20152d) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f20151c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i(f20150b, "Failed to retrieve setFrame method", e4);
            }
            f20152d = true;
        }
    }

    public void a(@androidx.annotation.N View view) {
        if (view.getVisibility() == 0) {
            view.setTag(D.g.f19205Y0, null);
        }
    }

    public float c(@androidx.annotation.N View view) {
        Float f4 = (Float) view.getTag(D.g.f19205Y0);
        if (f4 != null) {
            return view.getAlpha() / f4.floatValue();
        }
        return view.getAlpha();
    }

    public void d(@androidx.annotation.N View view) {
        if (view.getTag(D.g.f19205Y0) == null) {
            view.setTag(D.g.f19205Y0, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@androidx.annotation.N View view, @androidx.annotation.P Matrix matrix) {
        int i4;
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.f20156a;
            if (fArr == null) {
                fArr = new float[9];
                this.f20156a = fArr;
            }
            matrix.getValues(fArr);
            float f4 = fArr[3];
            float sqrt = (float) Math.sqrt(1.0f - (f4 * f4));
            if (fArr[0] < 0.0f) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            float f5 = sqrt * i4;
            float degrees = (float) Math.toDegrees(Math.atan2(f4, f5));
            float f6 = fArr[0] / f5;
            float f7 = fArr[4] / f5;
            float f8 = fArr[2];
            float f9 = fArr[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(f8);
            view.setTranslationY(f9);
            view.setRotation(degrees);
            view.setScaleX(f6);
            view.setScaleY(f7);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    public void f(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        b();
        Method method = f20151c;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    public void g(@androidx.annotation.N View view, float f4) {
        Float f5 = (Float) view.getTag(D.g.f19205Y0);
        if (f5 != null) {
            view.setAlpha(f5.floatValue() * f4);
        } else {
            view.setAlpha(f4);
        }
    }

    public void h(@androidx.annotation.N View view, int i4) {
        if (!f20154f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f20153e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f20150b, "fetchViewFlagsField: ");
            }
            f20154f = true;
        }
        Field field = f20153e;
        if (field != null) {
            try {
                f20153e.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            i((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void j(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
