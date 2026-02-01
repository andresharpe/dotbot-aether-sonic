package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.util.Locale;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final Locale f12871a = new Locale("", "");

    /* renamed from: b, reason: collision with root package name */
    private static final String f12872b = "Arab";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12873c = "Hebr";

    @W(17)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private G() {
    }

    private static int a(@N Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        if (directionality != 1 && directionality != 2) {
            return 0;
        }
        return 1;
    }

    public static int b(@P Locale locale) {
        return a.a(locale);
    }

    @N
    public static String c(@N String str) {
        return TextUtils.htmlEncode(str);
    }
}
