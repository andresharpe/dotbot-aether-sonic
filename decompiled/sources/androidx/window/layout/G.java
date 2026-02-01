package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class G implements D {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final G f20824b = new G();

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final String f20825c;

    static {
        String simpleName = G.class.getSimpleName();
        kotlin.jvm.internal.F.o(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f20825c = simpleName;
    }

    private G() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    @W(28)
    private final DisplayCutout j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (E.a(obj)) {
                return F.a(obj);
            }
        } catch (ClassNotFoundException e4) {
            Log.w(f20825c, e4);
        } catch (IllegalAccessException e5) {
            Log.w(f20825c, e5);
        } catch (InstantiationException e6) {
            Log.w(f20825c, e6);
        } catch (NoSuchFieldException e7) {
            Log.w(f20825c, e7);
        } catch (NoSuchMethodException e8) {
            Log.w(f20825c, e8);
        } catch (InvocationTargetException e9) {
            Log.w(f20825c, e9);
        }
        return null;
    }

    private final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.D
    @l3.d
    public C c(@l3.d Activity activity) {
        Rect rect;
        kotlin.jvm.internal.F.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = C0996e.f20847a.b(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.F.o(display, "display");
            Point l4 = l(display);
            rect = new Rect(0, 0, l4.x, l4.y);
        }
        return new C(rect);
    }

    @Override // androidx.window.layout.D
    @l3.d
    public C e(@l3.d Activity activity) {
        Rect g4;
        kotlin.jvm.internal.F.p(activity, "activity");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            g4 = C0996e.f20847a.a(activity);
        } else if (i4 >= 29) {
            g4 = i(activity);
        } else if (i4 >= 28) {
            g4 = h(activity);
        } else {
            g4 = g(activity);
        }
        return new C(g4);
    }

    @l3.d
    @W(14)
    public final Rect f(@l3.d Activity activity) {
        int i4;
        kotlin.jvm.internal.F.p(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.F.o(defaultDisplay, "defaultDisplay");
        Point l4 = l(defaultDisplay);
        Rect rect = new Rect();
        int i5 = l4.x;
        if (i5 != 0 && (i4 = l4.y) != 0) {
            rect.right = i5;
            rect.bottom = i4;
        } else {
            defaultDisplay.getRectSize(rect);
        }
        return rect;
    }

    @l3.d
    @W(24)
    public final Rect g(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C0992a.f20846a.a(activity)) {
            kotlin.jvm.internal.F.o(defaultDisplay, "defaultDisplay");
            Point l4 = l(defaultDisplay);
            int k4 = k(activity);
            int i4 = rect.bottom;
            if (i4 + k4 == l4.y) {
                rect.bottom = i4 + k4;
            } else {
                int i5 = rect.right;
                if (i5 + k4 == l4.x) {
                    rect.right = i5 + k4;
                }
            }
        }
        return rect;
    }

    @l3.d
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @W(28)
    public final Rect h(@l3.d Activity activity) {
        DisplayCutout j4;
        kotlin.jvm.internal.F.p(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C0992a.f20846a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (IllegalAccessException e4) {
            Log.w(f20825c, e4);
            m(activity, rect);
        } catch (NoSuchFieldException e5) {
            Log.w(f20825c, e5);
            m(activity, rect);
        } catch (NoSuchMethodException e6) {
            Log.w(f20825c, e6);
            m(activity, rect);
        } catch (InvocationTargetException e7) {
            Log.w(f20825c, e7);
            m(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C0997f c0997f = C0997f.f20848a;
        kotlin.jvm.internal.F.o(currentDisplay, "currentDisplay");
        c0997f.a(currentDisplay, point);
        C0992a c0992a = C0992a.f20846a;
        if (!c0992a.a(activity)) {
            int k4 = k(activity);
            int i4 = rect.bottom;
            if (i4 + k4 == point.y) {
                rect.bottom = i4 + k4;
            } else {
                int i5 = rect.right;
                if (i5 + k4 == point.x) {
                    rect.right = i5 + k4;
                } else if (rect.left == k4) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c0992a.a(activity) && (j4 = j(currentDisplay)) != null) {
            int i6 = rect.left;
            k kVar = k.f20849a;
            if (i6 == kVar.b(j4)) {
                rect.left = 0;
            }
            if (point.x - rect.right == kVar.c(j4)) {
                rect.right += kVar.c(j4);
            }
            if (rect.top == kVar.d(j4)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == kVar.a(j4)) {
                rect.bottom += kVar.a(j4);
            }
        }
        return rect;
    }

    @l3.d
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @W(ConstraintLayout.b.a.f9571D)
    public final Rect i(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e4) {
            Log.w(f20825c, e4);
            return h(activity);
        } catch (NoSuchFieldException e5) {
            Log.w(f20825c, e5);
            return h(activity);
        } catch (NoSuchMethodException e6) {
            Log.w(f20825c, e6);
            return h(activity);
        } catch (InvocationTargetException e7) {
            Log.w(f20825c, e7);
            return h(activity);
        }
    }

    @i0
    @l3.d
    @W(14)
    public final Point l(@l3.d Display display) {
        kotlin.jvm.internal.F.p(display, "display");
        Point point = new Point();
        C0997f.f20848a.a(display, point);
        return point;
    }
}
