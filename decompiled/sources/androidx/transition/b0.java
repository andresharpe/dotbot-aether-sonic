package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19988a = "ViewGroupUtilsApi14";

    /* renamed from: b, reason: collision with root package name */
    private static final int f19989b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static LayoutTransition f19990c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f19991d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f19992e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f19993f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f19994g;

    /* loaded from: classes.dex */
    class a extends LayoutTransition {
        a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    private b0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void a(LayoutTransition layoutTransition) {
        if (!f19994g) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod(L1.a.f1620m3, new Class[0]);
                f19993f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(f19988a, "Failed to access cancel method by reflection");
            }
            f19994g = true;
        }
        Method method = f19993f;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(f19988a, "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i(f19988a, "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void b(@androidx.annotation.N android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = androidx.transition.b0.f19990c
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            androidx.transition.b0$a r0 = new androidx.transition.b0$a
            r0.<init>()
            androidx.transition.b0.f19990c = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.b0.f19990c
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = androidx.transition.b0.f19990c
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = androidx.transition.b0.f19990c
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = androidx.transition.b0.f19990c
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            a(r6)
        L39:
            android.animation.LayoutTransition r0 = androidx.transition.b0.f19990c
            if (r6 == r0) goto L42
            int r0 = androidx.transition.D.g.f19188S1
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = androidx.transition.b0.f19990c
            r5.setLayoutTransition(r6)
            goto L94
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = androidx.transition.b0.f19992e
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            androidx.transition.b0.f19991d = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            androidx.transition.b0.f19992e = r1
        L66:
            java.lang.reflect.Field r6 = androidx.transition.b0.f19991d
            if (r6 == 0) goto L82
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L77
            if (r6 == 0) goto L7d
            java.lang.reflect.Field r1 = androidx.transition.b0.f19991d     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L7d
        L76:
            r2 = r6
        L77:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
            r6 = r2
        L7d:
            if (r6 == 0) goto L82
            r5.requestLayout()
        L82:
            int r6 = androidx.transition.D.g.f19188S1
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L94
            int r0 = androidx.transition.D.g.f19188S1
            r5.setTag(r0, r3)
            r5.setLayoutTransition(r6)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.b0.b(android.view.ViewGroup, boolean):void");
    }
}
