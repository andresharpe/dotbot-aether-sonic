package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0558a;
import androidx.core.app.C0623e;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.E0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078a {
    private C1078a() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.P
    public static Drawable A(@androidx.annotation.N Activity activity) {
        return B(activity.getComponentName());
    }

    public static void A0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.P Bundle bundle2) {
        t0(activity, bundle, str, str2, bundle2);
    }

    private static boolean A1(Intent intent, Fragment fragment, int i4, @androidx.annotation.P Bundle bundle) {
        if (!W(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (fragment.getActivity() == null) {
            Log.e("ActivityUtils", "Fragment " + fragment + " not attached to Activity");
            return false;
        }
        if (bundle != null) {
            fragment.startActivityForResult(intent, i4, bundle);
            return true;
        }
        fragment.startActivityForResult(intent, i4);
        return true;
    }

    @androidx.annotation.P
    public static Drawable B(@androidx.annotation.N ComponentName componentName) {
        try {
            return E0.a().getPackageManager().getActivityIcon(componentName);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static void B0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, View... viewArr) {
        t0(activity, bundle, str, str2, L(activity, viewArr));
    }

    private static boolean B1(Fragment fragment, Bundle bundle, String str, String str2, int i4, @androidx.annotation.P Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return A1(intent, fragment, i4, bundle2);
    }

    @androidx.annotation.P
    public static Drawable C(@androidx.annotation.N Class<? extends Activity> cls) {
        return B(new ComponentName(E0.a(), cls));
    }

    public static void C0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Class<? extends Activity> cls) {
        Context Q3 = Q();
        t0(Q3, bundle, Q3.getPackageName(), cls.getName(), null);
    }

    public static void C1() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        O0(intent);
    }

    public static List<Activity> D() {
        return H0.J();
    }

    public static void D0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Class<? extends Activity> cls, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Context Q3 = Q();
        t0(Q3, bundle, Q3.getPackageName(), cls.getName(), M(Q3, i4, i5));
    }

    public static void D1() {
        E1(E0.a().getPackageName());
    }

    @androidx.annotation.P
    public static Drawable E(@androidx.annotation.N Activity activity) {
        return F(activity.getComponentName());
    }

    public static void E0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Class<? extends Activity> cls, @androidx.annotation.P Bundle bundle2) {
        Context Q3 = Q();
        t0(Q3, bundle, Q3.getPackageName(), cls.getName(), bundle2);
    }

    public static void E1(@androidx.annotation.N String str) {
        String I3 = I(str);
        if (TextUtils.isEmpty(I3)) {
            return;
        }
        L0(str, I3);
    }

    @androidx.annotation.P
    public static Drawable F(@androidx.annotation.N ComponentName componentName) {
        try {
            return E0.a().getPackageManager().getActivityLogo(componentName);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static void F0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N String str, @androidx.annotation.N String str2) {
        t0(Q(), bundle, str, str2, null);
    }

    @androidx.annotation.P
    public static Drawable G(@androidx.annotation.N Class<? extends Activity> cls) {
        return F(new ComponentName(E0.a(), cls));
    }

    public static void G0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N String str, @androidx.annotation.N String str2, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Context Q3 = Q();
        t0(Q3, bundle, str, str2, M(Q3, i4, i5));
    }

    public static String H() {
        return I(E0.a().getPackageName());
    }

    public static void H0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.P Bundle bundle2) {
        t0(Q(), bundle, str, str2, bundle2);
    }

    public static String I(@androidx.annotation.N String str) {
        if (H0.D0(str)) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = E0.a().getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            return "";
        }
        return queryIntentActivities.get(0).activityInfo.name;
    }

    public static void I0(@androidx.annotation.N Class<? extends Activity> cls) {
        Context Q3 = Q();
        t0(Q3, null, Q3.getPackageName(), cls.getName(), null);
    }

    public static List<String> J() {
        return K(E0.a().getPackageName());
    }

    public static void J0(@androidx.annotation.N Class<? extends Activity> cls, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Context Q3 = Q();
        t0(Q3, null, Q3.getPackageName(), cls.getName(), M(Q3, i4, i5));
    }

    public static List<String> K(@androidx.annotation.N String str) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = E0.a().getPackageManager().queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        if (size == 0) {
            return arrayList;
        }
        for (int i4 = 0; i4 < size; i4++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i4);
            if (resolveInfo.activityInfo.processName.equals(str)) {
                arrayList.add(resolveInfo.activityInfo.name);
            }
        }
        return arrayList;
    }

    public static void K0(@androidx.annotation.N Class<? extends Activity> cls, @androidx.annotation.P Bundle bundle) {
        Context Q3 = Q();
        t0(Q3, null, Q3.getPackageName(), cls.getName(), bundle);
    }

    private static Bundle L(Activity activity, View[] viewArr) {
        int length;
        if (viewArr == null || (length = viewArr.length) <= 0) {
            return null;
        }
        androidx.core.util.q[] qVarArr = new androidx.core.util.q[length];
        for (int i4 = 0; i4 < length; i4++) {
            View view = viewArr[i4];
            qVarArr[i4] = androidx.core.util.q.a(view, view.getTransitionName());
        }
        return C0623e.g(activity, qVarArr).l();
    }

    public static void L0(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        t0(Q(), null, str, str2, null);
    }

    private static Bundle M(Context context, int i4, int i5) {
        return C0623e.d(context, i4, i5).l();
    }

    public static void M0(@androidx.annotation.N String str, @androidx.annotation.N String str2, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Context Q3 = Q();
        t0(Q3, null, str, str2, M(Q3, i4, i5));
    }

    private static Bundle N(Fragment fragment, int i4, int i5) {
        ActivityC0889g activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return C0623e.d(activity, i4, i5).l();
    }

    public static void N0(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.P Bundle bundle) {
        t0(Q(), null, str, str2, bundle);
    }

    private static Bundle O(Fragment fragment, View[] viewArr) {
        ActivityC0889g activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return L(activity, viewArr);
    }

    public static boolean O0(@androidx.annotation.N Intent intent) {
        return Q0(intent, Q(), null);
    }

    public static Activity P() {
        return H0.h0();
    }

    public static boolean P0(@androidx.annotation.N Intent intent, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Context Q3 = Q();
        return Q0(intent, Q3, M(Q3, i4, i5));
    }

    private static Context Q() {
        if (H0.r0()) {
            Activity P3 = P();
            if (P3 == null) {
                return E0.a();
            }
            return P3;
        }
        return E0.a();
    }

    private static boolean Q0(Intent intent, Context context, Bundle bundle) {
        if (!W(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            context.startActivity(intent, bundle);
            return true;
        }
        context.startActivity(intent);
        return true;
    }

    public static boolean R(Activity activity) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static boolean R0(@androidx.annotation.N Intent intent, @androidx.annotation.P Bundle bundle) {
        return Q0(intent, Q(), bundle);
    }

    public static boolean S(Context context) {
        return R(x(context));
    }

    public static void S0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, int i4) {
        z1(intent, activity, i4, null);
    }

    public static boolean T(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        PackageManager packageManager = E0.a().getPackageManager();
        if (packageManager.resolveActivity(intent, 0) == null || intent.resolveActivity(packageManager) == null || packageManager.queryIntentActivities(intent, 0).size() == 0) {
            return false;
        }
        return true;
    }

    public static void T0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        z1(intent, activity, i4, M(activity, i5, i6));
    }

    public static boolean U(@androidx.annotation.N Activity activity) {
        Iterator<Activity> it = H0.J().iterator();
        while (it.hasNext()) {
            if (it.next().equals(activity)) {
                return true;
            }
        }
        return false;
    }

    public static void U0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        z1(intent, activity, i4, bundle);
    }

    public static boolean V(@androidx.annotation.N Class<? extends Activity> cls) {
        Iterator<Activity> it = H0.J().iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }

    public static void V0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, int i4, View... viewArr) {
        z1(intent, activity, i4, L(activity, viewArr));
    }

    private static boolean W(Intent intent) {
        return true;
    }

    public static void W0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4) {
        y1(activity, null, activity.getPackageName(), cls.getName(), i4, null);
    }

    public static void X(@androidx.annotation.P Activity activity) {
        H0.R0(activity);
    }

    public static void X0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        y1(activity, null, activity.getPackageName(), cls.getName(), i4, M(activity, i5, i6));
    }

    public static void Y(@androidx.annotation.P Activity activity, @androidx.annotation.P E0.a aVar) {
        H0.S0(activity, aVar);
    }

    public static void Y0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4, @androidx.annotation.P Bundle bundle) {
        y1(activity, null, activity.getPackageName(), cls.getName(), i4, bundle);
    }

    public static void Z(@androidx.annotation.P E0.a aVar) {
        H0.T0(aVar);
    }

    public static void Z0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4, View... viewArr) {
        y1(activity, null, activity.getPackageName(), cls.getName(), i4, L(activity, viewArr));
    }

    public static void a(@androidx.annotation.P Activity activity, @androidx.annotation.P E0.a aVar) {
        H0.a(activity, aVar);
    }

    public static void a0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent[] intentArr) {
        f0(intentArr, activity, null);
    }

    public static void a1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4) {
        y1(activity, bundle, activity.getPackageName(), cls.getName(), i4, null);
    }

    public static void b(@androidx.annotation.P E0.a aVar) {
        H0.b(aVar);
    }

    public static void b0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent[] intentArr, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        f0(intentArr, activity, M(activity, i4, i5));
    }

    public static void b1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        y1(activity, bundle, activity.getPackageName(), cls.getName(), i4, M(activity, i5, i6));
    }

    public static void c(@androidx.annotation.N Activity activity) {
        e(activity, false);
    }

    public static void c0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent[] intentArr, @androidx.annotation.P Bundle bundle) {
        f0(intentArr, activity, bundle);
    }

    public static void c1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4, @androidx.annotation.P Bundle bundle2) {
        y1(activity, bundle, activity.getPackageName(), cls.getName(), i4, bundle2);
    }

    public static void d(@androidx.annotation.N Activity activity, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        activity.finish();
        activity.overridePendingTransition(i4, i5);
    }

    public static void d0(@androidx.annotation.N Intent[] intentArr) {
        f0(intentArr, Q(), null);
    }

    public static void d1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, int i4, View... viewArr) {
        y1(activity, bundle, activity.getPackageName(), cls.getName(), i4, L(activity, viewArr));
    }

    public static void e(@androidx.annotation.N Activity activity, boolean z3) {
        activity.finish();
        if (!z3) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public static void e0(@androidx.annotation.N Intent[] intentArr, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Context Q3 = Q();
        f0(intentArr, Q3, M(Q3, i4, i5));
    }

    public static void e1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4) {
        y1(activity, bundle, str, str2, i4, null);
    }

    public static void f(@androidx.annotation.N Class<? extends Activity> cls) {
        h(cls, false);
    }

    private static void f0(Intent[] intentArr, Context context, @androidx.annotation.P Bundle bundle) {
        if (!(context instanceof Activity)) {
            for (Intent intent : intentArr) {
                intent.addFlags(268435456);
            }
        }
        if (bundle != null) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
    }

    public static void f1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        y1(activity, bundle, str, str2, i4, M(activity, i5, i6));
    }

    public static void g(@androidx.annotation.N Class<? extends Activity> cls, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        for (Activity activity : H0.J()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                activity.overridePendingTransition(i4, i5);
            }
        }
    }

    public static void g0(@androidx.annotation.N Intent[] intentArr, @androidx.annotation.P Bundle bundle) {
        f0(intentArr, Q(), bundle);
    }

    public static void g1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, @androidx.annotation.P Bundle bundle2) {
        y1(activity, bundle, str, str2, i4, bundle2);
    }

    public static void h(@androidx.annotation.N Class<? extends Activity> cls, boolean z3) {
        for (Activity activity : H0.J()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                if (!z3) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    public static void h0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent) {
        Q0(intent, activity, null);
    }

    public static void h1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, View... viewArr) {
        y1(activity, bundle, str, str2, i4, L(activity, viewArr));
    }

    public static void i() {
        k(false);
    }

    public static void i0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        Q0(intent, activity, M(activity, i4, i5));
    }

    public static void i1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4) {
        B1(fragment, bundle, E0.a().getPackageName(), cls.getName(), i4, null);
    }

    public static void j(@InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        for (Activity activity : H0.J()) {
            activity.finish();
            activity.overridePendingTransition(i4, i5);
        }
    }

    public static void j0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, @androidx.annotation.P Bundle bundle) {
        Q0(intent, activity, bundle);
    }

    public static void j1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        B1(fragment, bundle, E0.a().getPackageName(), cls.getName(), i4, N(fragment, i5, i6));
    }

    public static void k(boolean z3) {
        for (Activity activity : H0.J()) {
            activity.finish();
            if (!z3) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    public static void k0(@androidx.annotation.N Activity activity, @androidx.annotation.N Intent intent, View... viewArr) {
        Q0(intent, activity, L(activity, viewArr));
    }

    public static void k1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4, @androidx.annotation.P Bundle bundle2) {
        B1(fragment, bundle, E0.a().getPackageName(), cls.getName(), i4, bundle2);
    }

    public static void l() {
        n(false);
    }

    public static void l0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls) {
        t0(activity, null, activity.getPackageName(), cls.getName(), null);
    }

    public static void l1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4, View... viewArr) {
        B1(fragment, bundle, E0.a().getPackageName(), cls.getName(), i4, O(fragment, viewArr));
    }

    public static void m(@InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        List<Activity> J3 = H0.J();
        for (int i6 = 1; i6 < J3.size(); i6++) {
            d(J3.get(i6), i4, i5);
        }
    }

    public static void m0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        t0(activity, null, activity.getPackageName(), cls.getName(), M(activity, i4, i5));
    }

    public static void m1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4) {
        B1(fragment, bundle, str, str2, i4, null);
    }

    public static void n(boolean z3) {
        List<Activity> J3 = H0.J();
        for (int i4 = 1; i4 < J3.size(); i4++) {
            e(J3.get(i4), z3);
        }
    }

    public static void n0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, @androidx.annotation.P Bundle bundle) {
        t0(activity, null, activity.getPackageName(), cls.getName(), bundle);
    }

    public static void n1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        B1(fragment, bundle, str, str2, i4, N(fragment, i5, i6));
    }

    public static void o(@androidx.annotation.N Class<? extends Activity> cls) {
        q(cls, false);
    }

    public static void o0(@androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, View... viewArr) {
        t0(activity, null, activity.getPackageName(), cls.getName(), L(activity, viewArr));
    }

    public static void o1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, @androidx.annotation.P Bundle bundle2) {
        B1(fragment, bundle, str, str2, i4, bundle2);
    }

    public static void p(@androidx.annotation.N Class<? extends Activity> cls, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        for (Activity activity : H0.J()) {
            if (!activity.getClass().equals(cls)) {
                d(activity, i4, i5);
            }
        }
    }

    public static void p0(@androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2) {
        t0(activity, null, str, str2, null);
    }

    public static void p1(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Fragment fragment, @androidx.annotation.N String str, @androidx.annotation.N String str2, int i4, View... viewArr) {
        B1(fragment, bundle, str, str2, i4, O(fragment, viewArr));
    }

    public static void q(@androidx.annotation.N Class<? extends Activity> cls, boolean z3) {
        for (Activity activity : H0.J()) {
            if (!activity.getClass().equals(cls)) {
                e(activity, z3);
            }
        }
    }

    public static void q0(@androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        t0(activity, null, str, str2, M(activity, i4, i5));
    }

    public static void q1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Intent intent, int i4) {
        A1(intent, fragment, i4, null);
    }

    public static boolean r(@androidx.annotation.N Activity activity, boolean z3) {
        return t(activity, z3, false);
    }

    public static void r0(@androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.P Bundle bundle) {
        t0(activity, null, str, str2, bundle);
    }

    public static void r1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Intent intent, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        A1(intent, fragment, i4, N(fragment, i5, i6));
    }

    public static boolean s(@androidx.annotation.N Activity activity, boolean z3, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        for (Activity activity2 : H0.J()) {
            if (activity2.equals(activity)) {
                if (z3) {
                    d(activity2, i4, i5);
                    return true;
                }
                return true;
            }
            d(activity2, i4, i5);
        }
        return false;
    }

    public static void s0(@androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, View... viewArr) {
        t0(activity, null, str, str2, L(activity, viewArr));
    }

    public static void s1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Intent intent, int i4, @androidx.annotation.P Bundle bundle) {
        A1(intent, fragment, i4, bundle);
    }

    public static boolean t(@androidx.annotation.N Activity activity, boolean z3, boolean z4) {
        for (Activity activity2 : H0.J()) {
            if (activity2.equals(activity)) {
                if (z3) {
                    e(activity2, z4);
                    return true;
                }
                return true;
            }
            e(activity2, z4);
        }
        return false;
    }

    private static void t0(Context context, Bundle bundle, String str, String str2, @androidx.annotation.P Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        Q0(intent, context, bundle2);
    }

    public static void t1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Intent intent, int i4, View... viewArr) {
        A1(intent, fragment, i4, O(fragment, viewArr));
    }

    public static boolean u(@androidx.annotation.N Class<? extends Activity> cls, boolean z3) {
        return w(cls, z3, false);
    }

    public static void u0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls) {
        t0(activity, bundle, activity.getPackageName(), cls.getName(), null);
    }

    public static void u1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4) {
        B1(fragment, null, E0.a().getPackageName(), cls.getName(), i4, null);
    }

    public static boolean v(@androidx.annotation.N Class<? extends Activity> cls, boolean z3, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        for (Activity activity : H0.J()) {
            if (activity.getClass().equals(cls)) {
                if (z3) {
                    d(activity, i4, i5);
                    return true;
                }
                return true;
            }
            d(activity, i4, i5);
        }
        return false;
    }

    public static void v0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        t0(activity, bundle, activity.getPackageName(), cls.getName(), M(activity, i4, i5));
    }

    public static void v1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4, @InterfaceC0558a int i5, @InterfaceC0558a int i6) {
        B1(fragment, null, E0.a().getPackageName(), cls.getName(), i4, N(fragment, i5, i6));
    }

    public static boolean w(@androidx.annotation.N Class<? extends Activity> cls, boolean z3, boolean z4) {
        for (Activity activity : H0.J()) {
            if (activity.getClass().equals(cls)) {
                if (z3) {
                    e(activity, z4);
                    return true;
                }
                return true;
            }
            e(activity, z4);
        }
        return false;
    }

    public static void w0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, @androidx.annotation.P Bundle bundle2) {
        t0(activity, bundle, activity.getPackageName(), cls.getName(), bundle2);
    }

    public static void w1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4, @androidx.annotation.P Bundle bundle) {
        B1(fragment, null, E0.a().getPackageName(), cls.getName(), i4, bundle);
    }

    @androidx.annotation.P
    public static Activity x(@androidx.annotation.P Context context) {
        if (context == null) {
            return null;
        }
        Activity y3 = y(context);
        if (!R(y3)) {
            return null;
        }
        return y3;
    }

    public static void x0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N Class<? extends Activity> cls, View... viewArr) {
        t0(activity, bundle, activity.getPackageName(), cls.getName(), L(activity, viewArr));
    }

    public static void x1(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Class<? extends Activity> cls, int i4, View... viewArr) {
        B1(fragment, null, E0.a().getPackageName(), cls.getName(), i4, O(fragment, viewArr));
    }

    @androidx.annotation.P
    private static Activity y(@androidx.annotation.P Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Activity z3 = z(context);
            if (z3 != null) {
                return z3;
            }
            arrayList.add(context);
            context = ((ContextWrapper) context).getBaseContext();
            if (context == null || arrayList.contains(context)) {
                break;
            }
        }
        return null;
    }

    public static void y0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2) {
        t0(activity, bundle, str, str2, null);
    }

    private static boolean y1(Activity activity, Bundle bundle, String str, String str2, int i4, @androidx.annotation.P Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return z1(intent, activity, i4, bundle2);
    }

    @androidx.annotation.P
    private static Activity z(@androidx.annotation.P Context context) {
        if (context != null && context.getClass().getName().equals("com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                declaredField.setAccessible(true);
                return (Activity) ((WeakReference) declaredField.get(context)).get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void z0(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Activity activity, @androidx.annotation.N String str, @androidx.annotation.N String str2, @InterfaceC0558a int i4, @InterfaceC0558a int i5) {
        t0(activity, bundle, str, str2, M(activity, i4, i5));
    }

    private static boolean z1(Intent intent, Activity activity, int i4, @androidx.annotation.P Bundle bundle) {
        if (!W(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (bundle != null) {
            activity.startActivityForResult(intent, i4, bundle);
            return true;
        }
        activity.startActivityForResult(intent, i4);
        return true;
    }
}
