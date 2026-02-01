package s3;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final c f57654a = new c();

    private c() {
    }

    private final SharedPreferences d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("common_lib_config", 0);
        F.o(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final boolean a(@d Context context, @d String key, boolean z3) {
        F.p(context, "context");
        F.p(key, "key");
        return d(context).getBoolean(key, z3);
    }

    public final int b(@d Context context, @d String key, int i4) {
        F.p(context, "context");
        F.p(key, "key");
        return d(context).getInt(key, i4);
    }

    public final long c(@d Context context, @d String key, long j4) {
        F.p(context, "context");
        F.p(key, "key");
        return d(context).getLong(key, j4);
    }

    @d
    public final String e(@d Context context, @e String str, @d String defaultValue) {
        F.p(context, "context");
        F.p(defaultValue, "defaultValue");
        String string = d(context).getString(str, defaultValue);
        if (string != null) {
            return string;
        }
        return defaultValue;
    }

    public final void f(@d Context context, @d String key, boolean z3) {
        F.p(context, "context");
        F.p(key, "key");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putBoolean(key, z3);
        edit.apply();
    }

    public final void g(@d Context context, @e String str, int i4) {
        F.p(context, "context");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putInt(str, i4);
        edit.apply();
    }

    public final void h(@d Context context, @e String str, long j4) {
        F.p(context, "context");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putLong(str, j4);
        edit.apply();
    }

    public final void i(@d Context context, @e String str, @e String str2) {
        F.p(context, "context");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
