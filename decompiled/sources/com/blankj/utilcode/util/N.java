package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.E0;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24837a = "KEY_LOCALE";

    /* renamed from: b, reason: collision with root package name */
    private static final String f24838b = "VALUE_FOLLOW_SYSTEM";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements E0.b<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f24839a;

        a(boolean z3) {
            this.f24839a = z3;
        }

        @Override // com.blankj.utilcode.util.E0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Boolean bool) {
            if (bool.booleanValue()) {
                N.t(this.f24839a);
            } else {
                H0.Q0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Locale f24840E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f24841F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ E0.b f24842G;

        b(Locale locale, int i4, E0.b bVar) {
            this.f24840E = locale;
            this.f24841F = i4;
            this.f24842G = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            N.s(this.f24840E, this.f24841F + 1, this.f24842G);
        }
    }

    private N() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Activity activity) {
        Locale v3;
        String q4 = H0.d0().q(f24837a);
        if (TextUtils.isEmpty(q4)) {
            return;
        }
        if (f24838b.equals(q4)) {
            v3 = l(Resources.getSystem().getConfiguration());
        } else {
            v3 = v(q4);
        }
        if (v3 == null) {
            return;
        }
        y(activity, v3);
        y(E0.a(), v3);
    }

    public static void c(@androidx.annotation.N Locale locale) {
        d(locale, false);
    }

    public static void d(@androidx.annotation.N Locale locale, boolean z3) {
        e(locale, z3);
    }

    private static void e(Locale locale, boolean z3) {
        if (locale == null) {
            H0.d0().C(f24837a, f24838b, true);
        } else {
            H0.d0().C(f24837a, r(locale), true);
        }
        if (locale == null) {
            locale = l(Resources.getSystem().getConfiguration());
        }
        x(locale, new a(z3));
    }

    public static void f() {
        g(false);
    }

    public static void g(boolean z3) {
        e(null, z3);
    }

    public static Context h(Context context) {
        String q4 = H0.d0().q(f24837a);
        if (!TextUtils.isEmpty(q4) && !f24838b.equals(q4)) {
            Locale v3 = v(q4);
            if (v3 == null) {
                return context;
            }
            Configuration configuration = context.getResources().getConfiguration();
            u(configuration, v3);
            return context.createConfigurationContext(configuration);
        }
        return context;
    }

    public static Locale i() {
        return k(E0.a());
    }

    public static Locale j() {
        String q4 = H0.d0().q(f24837a);
        if (!TextUtils.isEmpty(q4) && !f24838b.equals(q4)) {
            return v(q4);
        }
        return null;
    }

    public static Locale k(Context context) {
        return l(context.getResources().getConfiguration());
    }

    private static Locale l(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    public static Locale m() {
        return l(Resources.getSystem().getConfiguration());
    }

    public static boolean n() {
        if (j() != null) {
            return true;
        }
        return false;
    }

    public static boolean o(@androidx.annotation.N Locale locale) {
        Locale j4 = j();
        if (j4 == null) {
            return false;
        }
        return q(locale, j4);
    }

    private static boolean p(String str) {
        int i4 = 0;
        for (char c4 : str.toCharArray()) {
            if (c4 == '$') {
                if (i4 >= 1) {
                    return false;
                }
                i4++;
            }
        }
        if (i4 != 1) {
            return false;
        }
        return true;
    }

    private static boolean q(Locale locale, Locale locale2) {
        if (H0.A(locale2.getLanguage(), locale.getLanguage()) && H0.A(locale2.getCountry(), locale.getCountry())) {
            return true;
        }
        return false;
    }

    private static String r(Locale locale) {
        return locale.getLanguage() + "$" + locale.getCountry();
    }

    static void s(Locale locale, int i4, E0.b<Boolean> bVar) {
        Resources resources = E0.a().getResources();
        Configuration configuration = resources.getConfiguration();
        Locale l4 = l(configuration);
        u(configuration, locale);
        E0.a().getResources().updateConfiguration(configuration, resources.getDisplayMetrics());
        if (bVar == null) {
            return;
        }
        if (q(l4, locale)) {
            bVar.accept(Boolean.TRUE);
        } else if (i4 < 20) {
            H0.W0(new b(locale, i4, bVar), 16L);
        } else {
            Log.e("LanguageUtils", "appLocal didn't update.");
            bVar.accept(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(boolean z3) {
        if (z3) {
            H0.Q0();
            return;
        }
        Iterator<Activity> it = H0.J().iterator();
        while (it.hasNext()) {
            it.next().recreate();
        }
    }

    private static void u(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    private static Locale v(String str) {
        Locale w3 = w(str);
        if (w3 == null) {
            Log.e("LanguageUtils", "The string of " + str + " is not in the correct format.");
            H0.d0().H(f24837a);
        }
        return w3;
    }

    private static Locale w(String str) {
        if (!p(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("$");
            return new Locale(str.substring(0, indexOf), str.substring(indexOf + 1));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void x(@androidx.annotation.N Locale locale, @androidx.annotation.P E0.b<Boolean> bVar) {
        s(locale, 0, bVar);
    }

    private static void y(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        u(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
