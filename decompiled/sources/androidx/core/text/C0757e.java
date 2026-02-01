package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.util.Log;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12914a = "ICUCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f12915b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f12916c;

    @W(21)
    /* renamed from: androidx.core.text.e$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    @W(24)
    /* renamed from: androidx.core.text.e$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @InterfaceC0577u
        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @InterfaceC0577u
        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private C0757e() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f12916c;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e4) {
            Log.w(f12914a, e4);
        } catch (InvocationTargetException e5) {
            Log.w(f12914a, e5);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = f12915b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e4) {
            Log.w(f12914a, e4);
        } catch (InvocationTargetException e5) {
            Log.w(f12914a, e5);
        }
        return null;
    }

    @P
    public static String c(@N Locale locale) {
        return b.c(b.a(b.b(locale)));
    }
}
