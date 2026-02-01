package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f21593a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21594b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21595c;

    /* renamed from: d, reason: collision with root package name */
    private final float f21596d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private Typeface f21597e;

    public b(String str, String str2, String str3, float f4) {
        this.f21593a = str;
        this.f21594b = str2;
        this.f21595c = str3;
        this.f21596d = f4;
    }

    float a() {
        return this.f21596d;
    }

    public String b() {
        return this.f21593a;
    }

    public String c() {
        return this.f21594b;
    }

    public String d() {
        return this.f21595c;
    }

    @P
    public Typeface e() {
        return this.f21597e;
    }

    public void f(@P Typeface typeface) {
        this.f21597e = typeface;
    }
}
