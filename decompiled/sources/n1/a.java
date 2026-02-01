package N1;

import W2.n;
import android.content.SharedPreferences;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f1702a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f1703b;

    private a() {
    }

    @n
    @e
    public static final String f(@e String str, @e String str2) {
        return f1702a.e().getString(str, str2);
    }

    @n
    public static final void k(@e String str, @e String str2) {
        SharedPreferences.Editor edit = f1702a.e().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final boolean a(@e String str, boolean z3) {
        return e().getBoolean(str, z3);
    }

    public final float b(@e String str, float f4) {
        return e().getFloat(str, f4);
    }

    public final int c(@e String str, int i4) {
        return e().getInt(str, i4);
    }

    public final long d(@e String str, long j4) {
        return e().getLong(str, j4);
    }

    @d
    public final SharedPreferences e() {
        SharedPreferences sharedPreferences = f1703b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        F.S("preferences");
        return null;
    }

    public final void g(@e String str, boolean z3) {
        SharedPreferences.Editor edit = e().edit();
        edit.putBoolean(str, z3);
        edit.apply();
    }

    public final void h(@e String str, float f4) {
        SharedPreferences.Editor edit = e().edit();
        edit.putFloat(str, f4);
        edit.apply();
    }

    public final void i(@e String str, int i4) {
        SharedPreferences.Editor edit = e().edit();
        edit.putInt(str, i4);
        edit.apply();
    }

    public final void j(@e String str, long j4) {
        SharedPreferences.Editor edit = e().edit();
        edit.putLong(str, j4);
        edit.apply();
    }

    public final void l(@e String str) {
        SharedPreferences.Editor edit = e().edit();
        edit.remove(str);
        edit.apply();
    }

    public final void m(@d SharedPreferences pref) {
        F.p(pref, "pref");
        n(pref);
    }

    public final void n(@d SharedPreferences sharedPreferences) {
        F.p(sharedPreferences, "<set-?>");
        f1703b = sharedPreferences;
    }
}
