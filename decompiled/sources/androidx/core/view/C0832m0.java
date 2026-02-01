package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.InterfaceC0577u;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13610a = "ViewConfigCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f13611b;

    @androidx.annotation.W(26)
    /* renamed from: androidx.core.view.m0$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @InterfaceC0577u
        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @androidx.annotation.W(28)
    /* renamed from: androidx.core.view.m0$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @InterfaceC0577u
        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f13611b = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i(f13610a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private C0832m0() {
    }

    private static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f13611b) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(f13610a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float b(@androidx.annotation.N ViewConfiguration viewConfiguration, @androidx.annotation.N Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(viewConfiguration);
        }
        return a(viewConfiguration, context);
    }

    public static int c(@androidx.annotation.N ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    @Deprecated
    public static int d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float e(@androidx.annotation.N ViewConfiguration viewConfiguration, @androidx.annotation.N Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(viewConfiguration);
        }
        return a(viewConfiguration, context);
    }

    @Deprecated
    public static boolean f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean g(@androidx.annotation.N ViewConfiguration viewConfiguration, @androidx.annotation.N Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (identifier != 0 && resources.getBoolean(identifier)) {
            return true;
        }
        return false;
    }
}
