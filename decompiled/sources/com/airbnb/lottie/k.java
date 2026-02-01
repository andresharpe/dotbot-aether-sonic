package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final int f21545a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21546b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21547c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21548d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21549e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private Bitmap f21550f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public k(int i4, int i5, String str, String str2, String str3) {
        this.f21545a = i4;
        this.f21546b = i5;
        this.f21547c = str;
        this.f21548d = str2;
        this.f21549e = str3;
    }

    @P
    public Bitmap a() {
        return this.f21550f;
    }

    public String b() {
        return this.f21549e;
    }

    public String c() {
        return this.f21548d;
    }

    public int d() {
        return this.f21546b;
    }

    public String e() {
        return this.f21547c;
    }

    public int f() {
        return this.f21545a;
    }

    public boolean g() {
        if (this.f21550f == null && (!this.f21548d.startsWith("data:") || this.f21548d.indexOf("base64,") <= 0)) {
            return false;
        }
        return true;
    }

    public void h(@P Bitmap bitmap) {
        this.f21550f = bitmap;
    }
}
