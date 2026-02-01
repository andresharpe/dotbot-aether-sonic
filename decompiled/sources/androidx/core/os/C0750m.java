package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.P;
import androidx.annotation.S;
import androidx.annotation.W;
import androidx.annotation.a0;
import androidx.core.os.C0738a;
import androidx.core.text.C0757e;
import java.util.Locale;

/* renamed from: androidx.core.os.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750m {

    /* renamed from: b, reason: collision with root package name */
    private static final C0750m f12743b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0752o f12744a;

    @W(21)
    /* renamed from: androidx.core.os.m$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f12745a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private a() {
        }

        @InterfaceC0577u
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f12745a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @InterfaceC0577u
        static boolean c(@androidx.annotation.N Locale locale, @androidx.annotation.N Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String c4 = C0757e.c(locale);
            if (c4.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return c4.equals(C0757e.c(locale2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(24)
    /* renamed from: androidx.core.os.m$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @InterfaceC0577u
        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @InterfaceC0577u
        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private C0750m(InterfaceC0752o interfaceC0752o) {
        this.f12744a = interfaceC0752o;
    }

    @androidx.annotation.N
    public static C0750m a(@androidx.annotation.N Locale... localeArr) {
        return o(b.a(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @androidx.annotation.N
    public static C0750m c(@P String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i4 = 0; i4 < length; i4++) {
                localeArr[i4] = a.a(split[i4]);
            }
            return a(localeArr);
        }
        return g();
    }

    @androidx.annotation.N
    @a0(min = 1)
    public static C0750m e() {
        return o(b.b());
    }

    @androidx.annotation.N
    @a0(min = 1)
    public static C0750m f() {
        return o(b.c());
    }

    @androidx.annotation.N
    public static C0750m g() {
        return f12743b;
    }

    @S(markerClass = {C0738a.InterfaceC0093a.class})
    @W(21)
    public static boolean k(@androidx.annotation.N Locale locale, @androidx.annotation.N Locale locale2) {
        boolean matchesLanguageAndScript;
        if (C0738a.k()) {
            matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
            return matchesLanguageAndScript;
        }
        return a.c(locale, locale2);
    }

    @androidx.annotation.N
    @W(24)
    public static C0750m o(@androidx.annotation.N LocaleList localeList) {
        return new C0750m(new p(localeList));
    }

    @W(24)
    @Deprecated
    public static C0750m p(Object obj) {
        return o((LocaleList) obj);
    }

    @P
    public Locale d(int i4) {
        return this.f12744a.get(i4);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C0750m) && this.f12744a.equals(((C0750m) obj).f12744a)) {
            return true;
        }
        return false;
    }

    @P
    public Locale h(@androidx.annotation.N String[] strArr) {
        return this.f12744a.d(strArr);
    }

    public int hashCode() {
        return this.f12744a.hashCode();
    }

    @androidx.annotation.F(from = -1)
    public int i(@P Locale locale) {
        return this.f12744a.a(locale);
    }

    public boolean j() {
        return this.f12744a.isEmpty();
    }

    @androidx.annotation.F(from = 0)
    public int l() {
        return this.f12744a.size();
    }

    @androidx.annotation.N
    public String m() {
        return this.f12744a.b();
    }

    @P
    public Object n() {
        return this.f12744a.c();
    }

    @androidx.annotation.N
    public String toString() {
        return this.f12744a.toString();
    }
}
