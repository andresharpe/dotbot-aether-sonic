package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* loaded from: classes2.dex */
public class T {

    /* renamed from: d, reason: collision with root package name */
    static final int f35016d = 64;

    /* renamed from: e, reason: collision with root package name */
    static final int f35017e = 1024;

    /* renamed from: f, reason: collision with root package name */
    static final int f35018f = 8192;

    /* renamed from: a, reason: collision with root package name */
    private String f35019a = null;

    /* renamed from: b, reason: collision with root package name */
    private final A f35020b = new A(64, 1024);

    /* renamed from: c, reason: collision with root package name */
    private final A f35021c = new A(64, 8192);

    @androidx.annotation.N
    public Map<String, String> a() {
        return this.f35020b.a();
    }

    public Map<String, String> b() {
        return this.f35021c.a();
    }

    @androidx.annotation.P
    public String c() {
        return this.f35019a;
    }

    public void d(String str, String str2) {
        this.f35020b.d(str, str2);
    }

    public void e(Map<String, String> map) {
        this.f35020b.e(map);
    }

    public void f(String str, String str2) {
        this.f35021c.d(str, str2);
    }

    public void g(String str) {
        this.f35019a = this.f35020b.b(str);
    }
}
