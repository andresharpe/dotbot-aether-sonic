package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.RestrictTo;
import androidx.core.content.C0669d;
import androidx.core.content.pm.Q;
import androidx.core.content.pm.S;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12299a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12300b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12301c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12302d = 8;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.i0
    static final String f12303e = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.i0
    static final String f12304f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: g, reason: collision with root package name */
    private static final int f12305g = 96;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12306h = 48;

    /* renamed from: i, reason: collision with root package name */
    public static final String f12307i = "android.intent.extra.shortcut.ID";

    /* renamed from: j, reason: collision with root package name */
    private static volatile S<?> f12308j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile List<AbstractC0686e> f12309k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final String f12310l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: m, reason: collision with root package name */
    private static final String f12311m = "androidx.core.content.pm.shortcut_listener_impl";

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntentSender f12312a;

        a(IntentSender intentSender) {
            this.f12312a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f12312a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @androidx.annotation.W(25)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        static String a(@androidx.annotation.N List<ShortcutInfo> list) {
            int i4 = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i4) {
                    str = shortcutInfo.getId();
                    i4 = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface c {
    }

    private q0() {
    }

    @androidx.annotation.i0
    static void A(List<AbstractC0686e> list) {
        f12309k = list;
    }

    @androidx.annotation.i0
    static void B(S<Void> s4) {
        f12308j = s4;
    }

    public static boolean C(@androidx.annotation.N Context context, @androidx.annotation.N List<Q> list) {
        boolean updateShortcuts;
        List<Q> w3 = w(list, 1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 29) {
            c(context, w3);
        }
        if (i4 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<Q> it = w3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            updateShortcuts = e0.a(context.getSystemService(T.a())).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        o(context).a(w3);
        Iterator<AbstractC0686e> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().d(list);
        }
        return true;
    }

    public static boolean a(@androidx.annotation.N Context context, @androidx.annotation.N List<Q> list) {
        boolean addDynamicShortcuts;
        List<Q> w3 = w(list, 1);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 29) {
            c(context, w3);
        }
        if (i4 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<Q> it = w3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            addDynamicShortcuts = e0.a(context.getSystemService(T.a())).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        o(context).a(w3);
        Iterator<AbstractC0686e> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
        return true;
    }

    @androidx.annotation.i0
    static boolean b(@androidx.annotation.N Context context, @androidx.annotation.N Q q4) {
        Bitmap decodeStream;
        IconCompat t3;
        IconCompat iconCompat = q4.f12275i;
        if (iconCompat == null) {
            return false;
        }
        int i4 = iconCompat.f12510a;
        if (i4 != 6 && i4 != 4) {
            return true;
        }
        InputStream F3 = iconCompat.F(context);
        if (F3 == null || (decodeStream = BitmapFactory.decodeStream(F3)) == null) {
            return false;
        }
        if (i4 == 6) {
            t3 = IconCompat.q(decodeStream);
        } else {
            t3 = IconCompat.t(decodeStream);
        }
        q4.f12275i = t3;
        return true;
    }

    @androidx.annotation.i0
    static void c(@androidx.annotation.N Context context, @androidx.annotation.N List<Q> list) {
        for (Q q4 : new ArrayList(list)) {
            if (!b(context, q4)) {
                list.remove(q4);
            }
        }
    }

    @androidx.annotation.N
    public static Intent d(@androidx.annotation.N Context context, @androidx.annotation.N Q q4) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = e0.a(context.getSystemService(T.a())).createShortcutResultIntent(q4.H());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return q4.a(intent);
    }

    public static void e(@androidx.annotation.N Context context, @androidx.annotation.N List<String> list, @androidx.annotation.P CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            e0.a(context.getSystemService(T.a())).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        Iterator<AbstractC0686e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void f(@androidx.annotation.N Context context, @androidx.annotation.N List<Q> list) {
        List<Q> w3 = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<Q> it = w3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f12268b);
            }
            e0.a(context.getSystemService(T.a())).enableShortcuts(arrayList);
        }
        o(context).a(w3);
        Iterator<AbstractC0686e> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
    }

    @androidx.annotation.N
    public static List<Q> g(@androidx.annotation.N Context context) {
        List dynamicShortcuts;
        if (Build.VERSION.SDK_INT >= 25) {
            dynamicShortcuts = e0.a(context.getSystemService(T.a())).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new Q.a(context, C0691j.a(it.next())).c());
            }
            return arrayList;
        }
        try {
            return o(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static int h(@androidx.annotation.N Context context, boolean z3) {
        boolean z4;
        int i4;
        float f4;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            i4 = 48;
        } else {
            i4 = f12305g;
        }
        int max = Math.max(1, i4);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z3) {
            f4 = displayMetrics.xdpi;
        } else {
            f4 = displayMetrics.ydpi;
        }
        return (int) (max * (f4 / 160.0f));
    }

    public static int i(@androidx.annotation.N Context context) {
        int iconMaxHeight;
        androidx.core.util.u.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            iconMaxHeight = e0.a(context.getSystemService(T.a())).getIconMaxHeight();
            return iconMaxHeight;
        }
        return h(context, false);
    }

    public static int j(@androidx.annotation.N Context context) {
        int iconMaxWidth;
        androidx.core.util.u.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            iconMaxWidth = e0.a(context.getSystemService(T.a())).getIconMaxWidth();
            return iconMaxWidth;
        }
        return h(context, true);
    }

    public static int k(@androidx.annotation.N Context context) {
        int maxShortcutCountPerActivity;
        androidx.core.util.u.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            maxShortcutCountPerActivity = e0.a(context.getSystemService(T.a())).getMaxShortcutCountPerActivity();
            return maxShortcutCountPerActivity;
        }
        return 5;
    }

    @androidx.annotation.i0
    static List<AbstractC0686e> l() {
        return f12309k;
    }

    private static String m(@androidx.annotation.N List<Q> list) {
        int i4 = -1;
        String str = null;
        for (Q q4 : list) {
            if (q4.v() > i4) {
                str = q4.k();
                i4 = q4.v();
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<androidx.core.content.pm.AbstractC0686e> n(android.content.Context r7) {
        /*
            java.util.List<androidx.core.content.pm.e> r0 = androidx.core.content.pm.q0.f12309k
            if (r0 != 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r7.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.794E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L36
            goto L25
        L36:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L3b
            goto L25
        L3b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L44
            goto L25
        L44:
            java.lang.Class<androidx.core.content.pm.q0> r3 = androidx.core.content.pm.q0.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L25
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r4] = r6     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Exception -> L25
            java.lang.Object[] r3 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L25
            androidx.core.content.pm.e r2 = (androidx.core.content.pm.AbstractC0686e) r2     // Catch: java.lang.Exception -> L25
            r0.add(r2)     // Catch: java.lang.Exception -> L25
            goto L25
        L6b:
            java.util.List<androidx.core.content.pm.e> r7 = androidx.core.content.pm.q0.f12309k
            if (r7 != 0) goto L71
            androidx.core.content.pm.q0.f12309k = r0
        L71:
            java.util.List<androidx.core.content.pm.e> r7 = androidx.core.content.pm.q0.f12309k
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.pm.q0.n(android.content.Context):java.util.List");
    }

    private static S<?> o(Context context) {
        if (f12308j == null) {
            try {
                f12308j = (S) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, q0.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f12308j == null) {
                f12308j = new S.a();
            }
        }
        return f12308j;
    }

    @androidx.annotation.N
    public static List<Q> p(@androidx.annotation.N Context context, int i4) {
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        List shortcuts;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            shortcuts = e0.a(context.getSystemService(T.a())).getShortcuts(i4);
            return Q.c(context, shortcuts);
        }
        if (i5 >= 25) {
            ShortcutManager a4 = e0.a(context.getSystemService(T.a()));
            ArrayList arrayList = new ArrayList();
            if ((i4 & 1) != 0) {
                manifestShortcuts = a4.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i4 & 2) != 0) {
                dynamicShortcuts = a4.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i4 & 4) != 0) {
                pinnedShortcuts = a4.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return Q.c(context, arrayList);
        }
        if ((i4 & 2) != 0) {
            try {
                return o(context).b();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    public static boolean q(@androidx.annotation.N Context context) {
        boolean isRateLimitingActive;
        androidx.core.util.u.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            isRateLimitingActive = e0.a(context.getSystemService(T.a())).isRateLimitingActive();
            return isRateLimitingActive;
        }
        if (p(context, 3).size() == k(context)) {
            return true;
        }
        return false;
    }

    public static boolean r(@androidx.annotation.N Context context) {
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            isRequestPinShortcutSupported = e0.a(context.getSystemService(T.a())).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        }
        if (C0669d.a(context, f12304f) != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent(f12303e), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || f12304f.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(@androidx.annotation.N Context context, @androidx.annotation.N Q q4) {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        androidx.core.util.u.l(context);
        androidx.core.util.u.l(q4);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 31 && q4.E(1)) {
            Iterator<AbstractC0686e> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(q4));
            }
            return true;
        }
        int k4 = k(context);
        if (k4 == 0) {
            return false;
        }
        if (i4 <= 29) {
            b(context, q4);
        }
        if (i4 >= 30) {
            e0.a(context.getSystemService(T.a())).pushDynamicShortcut(q4.H());
        } else if (i4 >= 25) {
            ShortcutManager a4 = e0.a(context.getSystemService(T.a()));
            isRateLimitingActive = a4.isRateLimitingActive();
            if (!isRateLimitingActive) {
                dynamicShortcuts = a4.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= k4) {
                    a4.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
                }
                a4.addDynamicShortcuts(Arrays.asList(q4.H()));
            } else {
                return false;
            }
        }
        S<?> o4 = o(context);
        try {
            List<Q> b4 = o4.b();
            if (b4.size() >= k4) {
                o4.d(Arrays.asList(m(b4)));
            }
            o4.a(Arrays.asList(q4));
            Iterator<AbstractC0686e> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(q4));
            }
            x(context, q4.k());
            return true;
        } catch (Exception unused) {
            Iterator<AbstractC0686e> it3 = n(context).iterator();
            while (it3.hasNext()) {
                it3.next().b(Collections.singletonList(q4));
            }
            x(context, q4.k());
            return false;
        } catch (Throwable th) {
            Iterator<AbstractC0686e> it4 = n(context).iterator();
            while (it4.hasNext()) {
                it4.next().b(Collections.singletonList(q4));
            }
            x(context, q4.k());
            throw th;
        }
    }

    public static void t(@androidx.annotation.N Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            e0.a(context.getSystemService(T.a())).removeAllDynamicShortcuts();
        }
        o(context).c();
        Iterator<AbstractC0686e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void u(@androidx.annotation.N Context context, @androidx.annotation.N List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            e0.a(context.getSystemService(T.a())).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        Iterator<AbstractC0686e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void v(@androidx.annotation.N Context context, @androidx.annotation.N List<String> list) {
        if (Build.VERSION.SDK_INT >= 30) {
            e0.a(context.getSystemService(T.a())).removeLongLivedShortcuts(list);
            o(context).d(list);
            Iterator<AbstractC0686e> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().c(list);
            }
            return;
        }
        u(context, list);
    }

    @androidx.annotation.N
    private static List<Q> w(@androidx.annotation.N List<Q> list, int i4) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (Q q4 : list) {
            if (q4.E(i4)) {
                arrayList.remove(q4);
            }
        }
        return arrayList;
    }

    public static void x(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        androidx.core.util.u.l(context);
        androidx.core.util.u.l(str);
        if (Build.VERSION.SDK_INT >= 25) {
            e0.a(context.getSystemService(T.a())).reportShortcutUsed(str);
        }
        Iterator<AbstractC0686e> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().e(Collections.singletonList(str));
        }
    }

    public static boolean y(@androidx.annotation.N Context context, @androidx.annotation.N Q q4, @androidx.annotation.P IntentSender intentSender) {
        boolean requestPinShortcut;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 31 && q4.E(1)) {
            return false;
        }
        if (i4 >= 26) {
            requestPinShortcut = e0.a(context.getSystemService(T.a())).requestPinShortcut(q4.H(), intentSender);
            return requestPinShortcut;
        }
        if (!r(context)) {
            return false;
        }
        Intent a4 = q4.a(new Intent(f12303e));
        if (intentSender == null) {
            context.sendBroadcast(a4);
            return true;
        }
        context.sendOrderedBroadcast(a4, null, new a(intentSender), null, -1, null, null);
        return true;
    }

    public static boolean z(@androidx.annotation.N Context context, @androidx.annotation.N List<Q> list) {
        boolean dynamicShortcuts;
        androidx.core.util.u.l(context);
        androidx.core.util.u.l(list);
        List<Q> w3 = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w3.size());
            Iterator<Q> it = w3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().H());
            }
            dynamicShortcuts = e0.a(context.getSystemService(T.a())).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        o(context).c();
        o(context).a(w3);
        for (AbstractC0686e abstractC0686e : n(context)) {
            abstractC0686e.a();
            abstractC0686e.b(list);
        }
        return true;
    }
}
