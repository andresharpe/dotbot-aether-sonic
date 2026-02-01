package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.InterfaceC0569l;

/* renamed from: com.blankj.utilcode.util.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25025a = "TAG_STATUS_BAR";

    /* renamed from: b, reason: collision with root package name */
    private static final String f25026b = "TAG_OFFSET";

    /* renamed from: c, reason: collision with root package name */
    private static final int f25027c = -123;

    private C1098k() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void A(@androidx.annotation.N Activity activity, boolean z3) {
        B(activity.getWindow(), z3);
    }

    public static void B(@androidx.annotation.N Window window, boolean z3) {
        int i4;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(j(id))) {
                if (z3) {
                    i4 = 0;
                } else {
                    i4 = 4;
                }
                childAt.setVisibility(i4);
            }
        }
        if (z3) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    @androidx.annotation.Y("android.permission.EXPAND_STATUS_BAR")
    public static void C(boolean z3) {
        String str;
        if (z3) {
            str = "expandNotificationsPanel";
        } else {
            str = "collapsePanels";
        }
        n(str);
    }

    public static View D(@androidx.annotation.N Activity activity, @InterfaceC0569l int i4) {
        return E(activity, i4, false);
    }

    public static View E(@androidx.annotation.N Activity activity, @InterfaceC0569l int i4, boolean z3) {
        U(activity);
        return c(activity, i4, z3);
    }

    public static View F(@androidx.annotation.N Window window, @InterfaceC0569l int i4) {
        return G(window, i4, false);
    }

    public static View G(@androidx.annotation.N Window window, @InterfaceC0569l int i4, boolean z3) {
        V(window);
        return d(window, i4, z3);
    }

    public static void H(@androidx.annotation.N View view, @InterfaceC0569l int i4) {
        Activity I3 = H0.I(view.getContext());
        if (I3 == null) {
            return;
        }
        U(I3);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = k();
        view.setBackgroundColor(i4);
    }

    public static void I(@androidx.annotation.N androidx.drawerlayout.widget.a aVar, @androidx.annotation.N View view, @InterfaceC0569l int i4) {
        J(aVar, view, i4, false);
    }

    public static void J(@androidx.annotation.N androidx.drawerlayout.widget.a aVar, @androidx.annotation.N View view, @InterfaceC0569l int i4, boolean z3) {
        Activity I3 = H0.I(view.getContext());
        if (I3 == null) {
            return;
        }
        U(I3);
        aVar.setFitsSystemWindows(false);
        H(view, i4);
        int childCount = aVar.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            aVar.getChildAt(i5).setFitsSystemWindows(false);
        }
        if (z3) {
            l(I3);
        } else {
            E(I3, i4, false);
        }
    }

    public static void K(@androidx.annotation.N View view) {
        Activity I3 = H0.I(view.getContext());
        if (I3 == null) {
            return;
        }
        U(I3);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, k()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = k();
        }
    }

    public static void L(@androidx.annotation.N Activity activity, boolean z3) {
        M(activity.getWindow(), z3);
    }

    public static void M(@androidx.annotation.N Window window, boolean z3) {
        int i4;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z3) {
            i4 = systemUiVisibility | 8192;
        } else {
            i4 = systemUiVisibility & (-8193);
        }
        decorView.setSystemUiVisibility(i4);
    }

    public static void N(@androidx.annotation.N Activity activity, boolean z3) {
        O(activity.getWindow(), z3);
    }

    public static void O(@androidx.annotation.N Window window, boolean z3) {
        if (z3) {
            window.clearFlags(1024);
            P(window);
            b(window);
        } else {
            window.addFlags(1024);
            m(window);
            R(window);
        }
    }

    private static void P(@androidx.annotation.N Window window) {
        View findViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(f25025a);
        if (findViewWithTag == null) {
            return;
        }
        findViewWithTag.setVisibility(0);
    }

    public static void Q(@androidx.annotation.N View view) {
        Object tag = view.getTag(f25027c);
        if (tag != null && ((Boolean) tag).booleanValue()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - k(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(f25027c, Boolean.FALSE);
        }
    }

    private static void R(@androidx.annotation.N Window window) {
        View findViewWithTag = window.getDecorView().findViewWithTag(f25026b);
        if (findViewWithTag == null) {
            return;
        }
        Q(findViewWithTag);
    }

    public static void S(@androidx.annotation.N Activity activity) {
        T(activity.getWindow());
    }

    public static void T(@androidx.annotation.N Window window) {
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        window.setNavigationBarColor(0);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
    }

    public static void U(@androidx.annotation.N Activity activity) {
        V(activity.getWindow());
    }

    public static void V(@androidx.annotation.N Window window) {
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.setStatusBarColor(0);
    }

    public static void a(@androidx.annotation.N View view) {
        view.setTag(f25026b);
        Object tag = view.getTag(f25027c);
        if (tag != null && ((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + k(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(f25027c, Boolean.TRUE);
    }

    private static void b(@androidx.annotation.N Window window) {
        View findViewWithTag = window.getDecorView().findViewWithTag(f25026b);
        if (findViewWithTag == null) {
            return;
        }
        a(findViewWithTag);
    }

    private static View c(@androidx.annotation.N Activity activity, int i4, boolean z3) {
        return d(activity.getWindow(), i4, z3);
    }

    private static View d(@androidx.annotation.N Window window, int i4, boolean z3) {
        ViewGroup viewGroup;
        if (z3) {
            viewGroup = (ViewGroup) window.getDecorView();
        } else {
            viewGroup = (ViewGroup) window.findViewById(R.id.content);
        }
        View findViewWithTag = viewGroup.findViewWithTag(f25025a);
        if (findViewWithTag != null) {
            if (findViewWithTag.getVisibility() == 8) {
                findViewWithTag.setVisibility(0);
            }
            findViewWithTag.setBackgroundColor(i4);
            return findViewWithTag;
        }
        View e4 = e(window.getContext(), i4);
        viewGroup.addView(e4);
        return e4;
    }

    private static View e(@androidx.annotation.N Context context, int i4) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, k()));
        view.setBackgroundColor(i4);
        view.setTag(f25025a);
        return view;
    }

    public static int f() {
        TypedValue typedValue = new TypedValue();
        if (E0.a().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, E0.a().getResources().getDisplayMetrics());
        }
        return 0;
    }

    @androidx.annotation.W(21)
    public static int g(@androidx.annotation.N Activity activity) {
        return h(activity.getWindow());
    }

    @androidx.annotation.W(21)
    public static int h(@androidx.annotation.N Window window) {
        return window.getNavigationBarColor();
    }

    public static int i() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static String j(int i4) {
        try {
            return E0.a().getResources().getResourceEntryName(i4);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int k() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    private static void l(@androidx.annotation.N Activity activity) {
        m(activity.getWindow());
    }

    private static void m(@androidx.annotation.N Window window) {
        View findViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(f25025a);
        if (findViewWithTag == null) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    private static void n(String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(E0.a().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static boolean o(@androidx.annotation.N Activity activity) {
        return p(activity.getWindow());
    }

    public static boolean p(@androidx.annotation.N Window window) {
        if (Build.VERSION.SDK_INT < 26 || (window.getDecorView().getSystemUiVisibility() & 16) == 0) {
            return false;
        }
        return true;
    }

    public static boolean q(@androidx.annotation.N Activity activity) {
        return r(activity.getWindow());
    }

    public static boolean r(@androidx.annotation.N Window window) {
        boolean z3;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 < childCount) {
                View childAt = viewGroup.getChildAt(i4);
                int id = childAt.getId();
                if (id != -1 && "navigationBarBackground".equals(j(id)) && childAt.getVisibility() == 0) {
                    z3 = true;
                    break;
                }
                i4++;
            } else {
                z3 = false;
                break;
            }
        }
        if (z3) {
            if (H0.B0() && Build.VERSION.SDK_INT < 29) {
                try {
                    if (Settings.Global.getInt(E0.a().getContentResolver(), "navigationbar_hide_bar_enabled") != 0) {
                        return false;
                    }
                    return true;
                } catch (Exception unused) {
                }
            }
            if ((viewGroup.getSystemUiVisibility() & 2) == 0) {
                z4 = true;
            }
            return z4;
        }
        return z3;
    }

    public static boolean s(@androidx.annotation.N Activity activity) {
        return t(activity.getWindow());
    }

    public static boolean t(@androidx.annotation.N Window window) {
        if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    public static boolean u(@androidx.annotation.N Activity activity) {
        if ((activity.getWindow().getAttributes().flags & 1024) == 0) {
            return true;
        }
        return false;
    }

    public static boolean v() {
        WindowManager windowManager = (WindowManager) E0.a().getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        if (point2.y == point.y && point2.x == point.x) {
            return false;
        }
        return true;
    }

    @androidx.annotation.W(21)
    public static void w(@androidx.annotation.N Activity activity, @InterfaceC0569l int i4) {
        x(activity.getWindow(), i4);
    }

    @androidx.annotation.W(21)
    public static void x(@androidx.annotation.N Window window, @InterfaceC0569l int i4) {
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(i4);
    }

    public static void y(@androidx.annotation.N Activity activity, boolean z3) {
        z(activity.getWindow(), z3);
    }

    public static void z(@androidx.annotation.N Window window, boolean z3) {
        int i4;
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z3) {
                i4 = systemUiVisibility | 16;
            } else {
                i4 = systemUiVisibility & (-17);
            }
            decorView.setSystemUiVisibility(i4);
        }
    }
}
