package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0972f {

    /* renamed from: a, reason: collision with root package name */
    private static Method f20003a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f20004b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20005c;

    private C0972f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@androidx.annotation.N Canvas canvas, boolean z3) {
        Method method;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (z3) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i4 != 28) {
            if (!f20005c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f20003a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f20004b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f20005c = true;
            }
            if (z3) {
                try {
                    Method method2 = f20003a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(e4.getCause());
                }
            }
            if (!z3 && (method = f20004b) != null) {
                method.invoke(canvas, new Object[0]);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method doesn't work on Pie!");
    }
}
