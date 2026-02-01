package p2;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.F;
import l3.e;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2392c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C2392c f55873a = new C2392c();

    private C2392c() {
    }

    private final SharedPreferences d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_lib_config", 0);
        F.o(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final boolean a(@l3.d Context context, @l3.d String key, boolean z3) {
        F.p(context, "context");
        F.p(key, "key");
        return d(context).getBoolean(key, z3);
    }

    public final int b(@l3.d Context context, @l3.d String key, int i4) {
        F.p(context, "context");
        F.p(key, "key");
        return d(context).getInt(key, i4);
    }

    public final long c(@l3.d Context context, @l3.d String key, long j4) {
        F.p(context, "context");
        F.p(key, "key");
        return d(context).getLong(key, j4);
    }

    @l3.d
    public final String e(@l3.d Context context, @e String str, @l3.d String defaultValue) {
        F.p(context, "context");
        F.p(defaultValue, "defaultValue");
        String string = d(context).getString(str, defaultValue);
        if (string != null) {
            return string;
        }
        return defaultValue;
    }

    public final void f(@l3.d Context context, @l3.d String key, boolean z3) {
        F.p(context, "context");
        F.p(key, "key");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putBoolean(key, z3);
        edit.apply();
    }

    public final void g(@l3.d Context context, @l3.d String key, int i4) {
        F.p(context, "context");
        F.p(key, "key");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putInt(key, i4);
        edit.apply();
    }

    public final void h(@l3.d Context context, @e String str, long j4) {
        F.p(context, "context");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putLong(str, j4);
        edit.apply();
    }

    public final void i(@l3.d Context context, @e String str, @e String str2) {
        F.p(context, "context");
        SharedPreferences.Editor edit = d(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
