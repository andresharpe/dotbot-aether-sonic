package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24807a = -8;

    /* renamed from: b, reason: collision with root package name */
    private static long f24808b;

    /* renamed from: c, reason: collision with root package name */
    private static int f24809c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ResultReceiver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i4, Bundle bundle) {
            if (i4 == 1 || i4 == 3) {
                M.u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Window f24810E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int[] f24811F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ d f24812G;

        b(Window window, int[] iArr, d dVar) {
            this.f24810E = window;
            this.f24811F = iArr;
            this.f24812G = dVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i4 = M.i(this.f24810E);
            if (this.f24811F[0] != i4) {
                this.f24812G.a(i4);
                this.f24811F[0] = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Window f24813E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int[] f24814F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ View f24815G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f24816H;

        c(Window window, int[] iArr, View view, int i4) {
            this.f24813E = window;
            this.f24814F = iArr;
            this.f24815G = view;
            this.f24816H = i4;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int h4 = M.h(this.f24813E);
            if (this.f24814F[0] != h4) {
                View view = this.f24815G;
                view.setPadding(view.getPaddingLeft(), this.f24815G.getPaddingTop(), this.f24815G.getPaddingRight(), this.f24816H + M.i(this.f24813E));
                this.f24814F[0] = h4;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i4);
    }

    private M() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void c() {
        Log.i("KeyboardUtils", "Please refer to the following code.");
    }

    public static void d(@androidx.annotation.N Activity activity) {
        e(activity.getWindow());
    }

    public static void e(@androidx.annotation.N Window window) {
        window.setSoftInputMode(window.getAttributes().softInputMode & (-17));
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        View childAt = frameLayout.getChildAt(0);
        int paddingBottom = childAt.getPaddingBottom();
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new c(window, new int[]{h(window)}, childAt, paddingBottom));
    }

    public static void f(@androidx.annotation.N Activity activity) {
        g(activity.getWindow());
    }

    public static void g(@androidx.annotation.N Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) E0.a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i4 = 0; i4 < 4; i4++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i4]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                    declaredField.set(inputMethodManager, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(Window window) {
        View findViewById = window.findViewById(R.id.content);
        if (findViewById == null) {
            return 0;
        }
        Rect rect = new Rect();
        findViewById.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getContentViewInvisibleHeight: " + (findViewById.getBottom() - rect.bottom));
        int abs = Math.abs(findViewById.getBottom() - rect.bottom);
        if (abs <= H0.e0() + H0.a0()) {
            return 0;
        }
        return abs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(@androidx.annotation.N Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs <= H0.a0() + H0.e0()) {
            f24809c = abs;
            return 0;
        }
        return abs - f24809c;
    }

    public static void j(@androidx.annotation.P Activity activity) {
        if (activity == null) {
            return;
        }
        l(activity.getWindow());
    }

    public static void k(@androidx.annotation.N View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) E0.a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void l(@androidx.annotation.P Window window) {
        if (window == null) {
            return;
        }
        View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            View decorView = window.getDecorView();
            View findViewWithTag = decorView.findViewWithTag("keyboardTagView");
            if (findViewWithTag == null) {
                findViewWithTag = new EditText(window.getContext());
                findViewWithTag.setTag("keyboardTagView");
                ((ViewGroup) decorView).addView(findViewWithTag, 0, 0);
            }
            currentFocus = findViewWithTag;
            currentFocus.requestFocus();
        }
        k(currentFocus);
    }

    public static void m(@androidx.annotation.P Activity activity) {
        if (activity == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - f24808b) > 500 && n(activity)) {
            u();
        }
        f24808b = elapsedRealtime;
    }

    public static boolean n(@androidx.annotation.N Activity activity) {
        if (i(activity.getWindow()) > 0) {
            return true;
        }
        return false;
    }

    public static void o(@androidx.annotation.N Activity activity, @androidx.annotation.N d dVar) {
        p(activity.getWindow(), dVar);
    }

    public static void p(@androidx.annotation.N Window window, @androidx.annotation.N d dVar) {
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        b bVar = new b(window, new int[]{i(window)}, dVar);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        frameLayout.setTag(f24807a, bVar);
    }

    public static void q() {
        InputMethodManager inputMethodManager = (InputMethodManager) E0.a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 1);
    }

    public static void r(@androidx.annotation.P Activity activity) {
        if (activity != null && !n(activity)) {
            u();
        }
    }

    public static void s(@androidx.annotation.N View view) {
        t(view, 0);
    }

    public static void t(@androidx.annotation.N View view, int i4) {
        InputMethodManager inputMethodManager = (InputMethodManager) E0.a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, i4, new a(new Handler()));
        inputMethodManager.toggleSoftInput(2, 1);
    }

    public static void u() {
        InputMethodManager inputMethodManager = (InputMethodManager) E0.a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    public static void v(@androidx.annotation.N Window window) {
        View findViewById = window.findViewById(R.id.content);
        if (findViewById == null) {
            return;
        }
        Object tag = findViewById.getTag(f24807a);
        if (tag instanceof ViewTreeObserver.OnGlobalLayoutListener) {
            findViewById.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) tag);
            findViewById.setTag(f24807a, null);
        }
    }
}
