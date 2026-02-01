package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0568k;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6309a = "ViewUtils";

    /* renamed from: b, reason: collision with root package name */
    private static Method f6310b;

    /* renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @InterfaceC0568k(api = 27)
    static final boolean f6311c;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f6311c = z3;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f6310b = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f6310b.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d(f6309a, "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    private q0() {
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f6310b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e4) {
                Log.d(f6309a, "Could not invoke computeFitSystemWindows", e4);
            }
        }
    }

    public static boolean b(View view) {
        if (C0823k0.Z(view) == 1) {
            return true;
        }
        return false;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.d(f6309a, "Could not invoke makeOptionalFitsSystemWindows", e4);
        } catch (NoSuchMethodException unused) {
            Log.d(f6309a, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e5) {
            Log.d(f6309a, "Could not invoke makeOptionalFitsSystemWindows", e5);
        }
    }
}
