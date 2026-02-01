package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@androidx.annotation.W(21)
/* renamed from: androidx.transition.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0984s implements InterfaceC0983q {

    /* renamed from: F, reason: collision with root package name */
    private static final String f20142F = "GhostViewApi21";

    /* renamed from: G, reason: collision with root package name */
    private static Class<?> f20143G;

    /* renamed from: H, reason: collision with root package name */
    private static boolean f20144H;

    /* renamed from: I, reason: collision with root package name */
    private static Method f20145I;

    /* renamed from: J, reason: collision with root package name */
    private static boolean f20146J;

    /* renamed from: K, reason: collision with root package name */
    private static Method f20147K;

    /* renamed from: L, reason: collision with root package name */
    private static boolean f20148L;

    /* renamed from: E, reason: collision with root package name */
    private final View f20149E;

    private C0984s(@androidx.annotation.N View view) {
        this.f20149E = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0983q b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f20145I;
        if (method != null) {
            try {
                return new C0984s((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (!f20146J) {
            try {
                d();
                Method declaredMethod = f20143G.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f20145I = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i(f20142F, "Failed to retrieve addGhost method", e4);
            }
            f20146J = true;
        }
    }

    private static void d() {
        if (!f20144H) {
            try {
                f20143G = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e4) {
                Log.i(f20142F, "Failed to retrieve GhostView class", e4);
            }
            f20144H = true;
        }
    }

    private static void e() {
        if (!f20148L) {
            try {
                d();
                Method declaredMethod = f20143G.getDeclaredMethod("removeGhost", View.class);
                f20147K = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i(f20142F, "Failed to retrieve removeGhost method", e4);
            }
            f20148L = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view) {
        e();
        Method method = f20147K;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    @Override // androidx.transition.InterfaceC0983q
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.InterfaceC0983q
    public void setVisibility(int i4) {
        this.f20149E.setVisibility(i4);
    }
}
