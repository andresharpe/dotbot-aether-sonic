package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.W;
import androidx.lifecycle.A;
import androidx.lifecycle.E;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Field;

@W(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements A {

    /* renamed from: F, reason: collision with root package name */
    private static final int f4465F = 0;

    /* renamed from: G, reason: collision with root package name */
    private static final int f4466G = 1;

    /* renamed from: H, reason: collision with root package name */
    private static final int f4467H = 2;

    /* renamed from: I, reason: collision with root package name */
    private static int f4468I;

    /* renamed from: J, reason: collision with root package name */
    private static Field f4469J;

    /* renamed from: K, reason: collision with root package name */
    private static Field f4470K;

    /* renamed from: L, reason: collision with root package name */
    private static Field f4471L;

    /* renamed from: E, reason: collision with root package name */
    private Activity f4472E;

    ImmLeaksCleaner(Activity activity) {
        this.f4472E = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    @K
    private static void a() {
        try {
            f4468I = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f4470K = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f4471L = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f4469J = declaredField3;
            declaredField3.setAccessible(true);
            f4468I = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.A
    public void f(@N E e4, @N Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f4468I == 0) {
            a();
        }
        if (f4468I == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f4472E.getSystemService("input_method");
            try {
                Object obj = f4469J.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f4470K.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f4471L.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
