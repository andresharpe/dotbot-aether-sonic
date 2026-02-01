package com.blankj.utilcode.util;

/* renamed from: com.blankj.utilcode.util.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107q {

    /* renamed from: a, reason: collision with root package name */
    private static r f25105a;

    public static void a() {
        b(i());
    }

    public static void b(@androidx.annotation.N r rVar) {
        rVar.a();
    }

    public static <T> T c(@androidx.annotation.N String str) {
        return (T) d(str, i());
    }

    public static <T> T d(@androidx.annotation.N String str, @androidx.annotation.N r rVar) {
        return (T) rVar.b(str);
    }

    public static <T> T e(@androidx.annotation.N String str, T t3) {
        return (T) f(str, t3, i());
    }

    public static <T> T f(@androidx.annotation.N String str, T t3, @androidx.annotation.N r rVar) {
        return (T) rVar.c(str, t3);
    }

    public static int g() {
        return h(i());
    }

    public static int h(@androidx.annotation.N r rVar) {
        return rVar.d();
    }

    private static r i() {
        r rVar = f25105a;
        if (rVar == null) {
            return r.e();
        }
        return rVar;
    }

    public static void j(@androidx.annotation.N String str, Object obj) {
        m(str, obj, i());
    }

    public static void k(@androidx.annotation.N String str, Object obj, int i4) {
        l(str, obj, i4, i());
    }

    public static void l(@androidx.annotation.N String str, Object obj, int i4, @androidx.annotation.N r rVar) {
        rVar.i(str, obj, i4);
    }

    public static void m(@androidx.annotation.N String str, Object obj, @androidx.annotation.N r rVar) {
        rVar.h(str, obj);
    }

    public static Object n(@androidx.annotation.N String str) {
        return o(str, i());
    }

    public static Object o(@androidx.annotation.N String str, @androidx.annotation.N r rVar) {
        return rVar.j(str);
    }

    public static void p(r rVar) {
        f25105a = rVar;
    }
}
