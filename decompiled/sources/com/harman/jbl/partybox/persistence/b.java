package com.harman.jbl.partybox.persistence;

import W2.n;
import android.content.SharedPreferences;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final b f42078a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f42079b;

    private b() {
    }

    @n
    @e
    public static final String g(@e String str, @e String str2) {
        return f42078a.f().getString(str, str2);
    }

    @n
    public static final void l(@e String str, @e String str2) {
        SharedPreferences.Editor edit = f42078a.f().edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final void a() {
        SharedPreferences.Editor edit = f().edit();
        edit.remove("auto_ota_test");
        edit.apply();
    }

    public final boolean b(@e String str, boolean z3) {
        return f().getBoolean(str, z3);
    }

    public final float c(@e String str, float f4) {
        return f().getFloat(str, f4);
    }

    public final int d(@e String str, int i4) {
        return f().getInt(str, i4);
    }

    public final long e(@e String str, long j4) {
        return f().getLong(str, j4);
    }

    @d
    public final SharedPreferences f() {
        SharedPreferences sharedPreferences = f42079b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        F.S("preferences");
        return null;
    }

    public final void h(@e String str, boolean z3) {
        SharedPreferences.Editor edit = f().edit();
        edit.putBoolean(str, z3);
        edit.apply();
    }

    public final void i(@e String str, float f4) {
        SharedPreferences.Editor edit = f().edit();
        edit.putFloat(str, f4);
        edit.apply();
    }

    public final void j(@e String str, int i4) {
        SharedPreferences.Editor edit = f().edit();
        edit.putInt(str, i4);
        edit.apply();
    }

    public final void k(@e String str, long j4) {
        SharedPreferences.Editor edit = f().edit();
        edit.putLong(str, j4);
        edit.apply();
    }

    public final void m(@e String str) {
        SharedPreferences.Editor edit = f().edit();
        edit.remove(str);
        edit.apply();
    }

    public final void n(@d SharedPreferences pref) {
        F.p(pref, "pref");
        o(pref);
    }

    public final void o(@d SharedPreferences sharedPreferences) {
        F.p(sharedPreferences, "<set-?>");
        f42079b = sharedPreferences;
    }
}
