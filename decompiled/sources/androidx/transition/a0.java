package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19976a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Method f19977b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f19978c;

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(@androidx.annotation.N ViewGroup viewGroup, int i4) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i4);
            return childDrawingOrder;
        }
        if (!f19978c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f19977b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f19978c = true;
        }
        Method method = f19977b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i4))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X b(@androidx.annotation.N ViewGroup viewGroup) {
        return new W(viewGroup);
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.W(18)
    private static void c(@androidx.annotation.N ViewGroup viewGroup, boolean z3) {
        if (f19976a) {
            try {
                viewGroup.suppressLayout(z3);
            } catch (NoSuchMethodError unused) {
                f19976a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(@androidx.annotation.N ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z3);
        } else {
            c(viewGroup, z3);
        }
    }
}
