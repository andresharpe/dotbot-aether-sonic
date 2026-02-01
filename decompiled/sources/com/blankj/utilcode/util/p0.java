package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, p0> f25103b = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f25104a;

    private p0(String str) {
        this.f25104a = E0.a().getSharedPreferences(str, 0);
    }

    public static p0 i() {
        return l("", 0);
    }

    public static p0 j(int i4) {
        return l("", i4);
    }

    public static p0 k(String str) {
        return l(str, 0);
    }

    public static p0 l(String str, int i4) {
        if (u(str)) {
            str = "spUtils";
        }
        Map<String, p0> map = f25103b;
        p0 p0Var = map.get(str);
        if (p0Var == null) {
            synchronized (p0.class) {
                try {
                    p0Var = map.get(str);
                    if (p0Var == null) {
                        p0Var = new p0(str, i4);
                        map.put(str, p0Var);
                    }
                } finally {
                }
            }
        }
        return p0Var;
    }

    private static boolean u(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public void A(@androidx.annotation.N String str, long j4, boolean z3) {
        if (z3) {
            this.f25104a.edit().putLong(str, j4).commit();
        } else {
            this.f25104a.edit().putLong(str, j4).apply();
        }
    }

    public void B(@androidx.annotation.N String str, String str2) {
        C(str, str2, false);
    }

    public void C(@androidx.annotation.N String str, String str2, boolean z3) {
        if (z3) {
            this.f25104a.edit().putString(str, str2).commit();
        } else {
            this.f25104a.edit().putString(str, str2).apply();
        }
    }

    public void D(@androidx.annotation.N String str, Set<String> set) {
        E(str, set, false);
    }

    public void E(@androidx.annotation.N String str, Set<String> set, boolean z3) {
        if (z3) {
            this.f25104a.edit().putStringSet(str, set).commit();
        } else {
            this.f25104a.edit().putStringSet(str, set).apply();
        }
    }

    public void F(@androidx.annotation.N String str, boolean z3) {
        G(str, z3, false);
    }

    public void G(@androidx.annotation.N String str, boolean z3, boolean z4) {
        if (z4) {
            this.f25104a.edit().putBoolean(str, z3).commit();
        } else {
            this.f25104a.edit().putBoolean(str, z3).apply();
        }
    }

    public void H(@androidx.annotation.N String str) {
        I(str, false);
    }

    public void I(@androidx.annotation.N String str, boolean z3) {
        if (z3) {
            this.f25104a.edit().remove(str).commit();
        } else {
            this.f25104a.edit().remove(str).apply();
        }
    }

    public void a() {
        b(false);
    }

    public void b(boolean z3) {
        if (z3) {
            this.f25104a.edit().clear().commit();
        } else {
            this.f25104a.edit().clear().apply();
        }
    }

    public boolean c(@androidx.annotation.N String str) {
        return this.f25104a.contains(str);
    }

    public Map<String, ?> d() {
        return this.f25104a.getAll();
    }

    public boolean e(@androidx.annotation.N String str) {
        return f(str, false);
    }

    public boolean f(@androidx.annotation.N String str, boolean z3) {
        return this.f25104a.getBoolean(str, z3);
    }

    public float g(@androidx.annotation.N String str) {
        return h(str, -1.0f);
    }

    public float h(@androidx.annotation.N String str, float f4) {
        return this.f25104a.getFloat(str, f4);
    }

    public int m(@androidx.annotation.N String str) {
        return n(str, -1);
    }

    public int n(@androidx.annotation.N String str, int i4) {
        return this.f25104a.getInt(str, i4);
    }

    public long o(@androidx.annotation.N String str) {
        return p(str, -1L);
    }

    public long p(@androidx.annotation.N String str, long j4) {
        return this.f25104a.getLong(str, j4);
    }

    public String q(@androidx.annotation.N String str) {
        return r(str, "");
    }

    public String r(@androidx.annotation.N String str, String str2) {
        return this.f25104a.getString(str, str2);
    }

    public Set<String> s(@androidx.annotation.N String str) {
        return t(str, Collections.emptySet());
    }

    public Set<String> t(@androidx.annotation.N String str, Set<String> set) {
        return this.f25104a.getStringSet(str, set);
    }

    public void v(@androidx.annotation.N String str, float f4) {
        w(str, f4, false);
    }

    public void w(@androidx.annotation.N String str, float f4, boolean z3) {
        if (z3) {
            this.f25104a.edit().putFloat(str, f4).commit();
        } else {
            this.f25104a.edit().putFloat(str, f4).apply();
        }
    }

    public void x(@androidx.annotation.N String str, int i4) {
        y(str, i4, false);
    }

    public void y(@androidx.annotation.N String str, int i4, boolean z3) {
        if (z3) {
            this.f25104a.edit().putInt(str, i4).commit();
        } else {
            this.f25104a.edit().putInt(str, i4).apply();
        }
    }

    public void z(@androidx.annotation.N String str, long j4) {
        A(str, j4, false);
    }

    private p0(String str, int i4) {
        this.f25104a = E0.a().getSharedPreferences(str, i4);
    }
}
