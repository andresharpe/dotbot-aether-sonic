package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.InterfaceC0577u;
import androidx.core.os.C0738a;
import androidx.core.os.C0750m;
import java.util.Locale;

/* renamed from: androidx.core.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656v {

    @androidx.annotation.W(21)
    /* renamed from: androidx.core.app.v$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(24)
    /* renamed from: androidx.core.app.v$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static C0750m a(Configuration configuration) {
            return C0750m.c(configuration.getLocales().toLanguageTags());
        }
    }

    @androidx.annotation.W(33)
    /* renamed from: androidx.core.app.v$c */
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private C0656v() {
    }

    @androidx.annotation.i0
    static C0750m a(Configuration configuration) {
        return b.a(configuration);
    }

    @androidx.annotation.W(33)
    private static Object b(Context context) {
        return context.getSystemService("locale");
    }

    @InterfaceC0561d
    @androidx.annotation.N
    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public static C0750m c(@androidx.annotation.N Context context) {
        C0750m g4 = C0750m.g();
        if (C0738a.k()) {
            Object b4 = b(context);
            if (b4 != null) {
                return C0750m.o(c.a(b4));
            }
            return g4;
        }
        return a(context.getApplicationContext().getResources().getConfiguration());
    }
}
