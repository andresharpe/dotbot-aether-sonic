package com.google.android.gms.analytics;

import androidx.core.app.C0;
import com.google.android.gms.internal.gtm.zzfc;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class m {
    public static String a(int i4) {
        return n("&cd", i4);
    }

    public static String b(int i4) {
        return n("cd", i4);
    }

    public static String c(int i4) {
        return n("cd", i4);
    }

    public static String d(int i4) {
        return n("&cm", i4);
    }

    public static String e(int i4) {
        return n("cm", i4);
    }

    public static String f(int i4) {
        return n("cm", i4);
    }

    public static String g(int i4) {
        return n("&il", i4);
    }

    public static String h(int i4) {
        return n("il", i4);
    }

    public static String i(int i4) {
        return n("pi", i4);
    }

    public static String j(int i4) {
        return n("&pr", i4);
    }

    public static String k(int i4) {
        return n("pr", i4);
    }

    public static String l(int i4) {
        return n("&promo", i4);
    }

    public static String m(int i4) {
        return n(C0.f11615v0, i4);
    }

    private static String n(String str, int i4) {
        if (i4 <= 0) {
            zzfc.zzb("index out of range for prefix", str);
            return "";
        }
        return str + i4;
    }
}
