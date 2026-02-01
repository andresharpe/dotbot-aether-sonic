package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13126a = false;

    /* renamed from: b, reason: collision with root package name */
    private static Method f13127b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13128c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Field f13129d;

    /* loaded from: classes.dex */
    public interface a {
        boolean u(@androidx.annotation.N KeyEvent keyEvent);
    }

    private E() {
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f13126a) {
            try {
                f13127b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f13126a = true;
        }
        Method method = f13127b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0823k0.z(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener f4 = f(dialog);
        if (f4 != null && f4.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0823k0.z(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    public static boolean d(@androidx.annotation.N View view, @androidx.annotation.N KeyEvent keyEvent) {
        return C0823k0.A(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static boolean e(@androidx.annotation.N a aVar, @androidx.annotation.P View view, @androidx.annotation.P Window.Callback callback, @androidx.annotation.N KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.u(keyEvent);
        }
        if (callback instanceof Activity) {
            return b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C0823k0.z(view, keyEvent)) && !aVar.u(keyEvent)) {
            return false;
        }
        return true;
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f13128c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f13129d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f13128c = true;
        }
        Field field = f13129d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
