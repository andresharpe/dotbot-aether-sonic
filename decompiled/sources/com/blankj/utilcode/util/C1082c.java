package com.blankj.utilcode.util;

import android.util.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f24982c = "ApiUtils";

    /* renamed from: a, reason: collision with root package name */
    private Map<Class, C0217c> f24983a;

    /* renamed from: b, reason: collision with root package name */
    private Map<Class, Class> f24984b;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.blankj.utilcode.util.c$b */
    /* loaded from: classes.dex */
    public @interface b {
        boolean isMock() default false;
    }

    /* renamed from: com.blankj.utilcode.util.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0217c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.blankj.utilcode.util.c$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final C1082c f24985a = new C1082c();

        private d() {
        }
    }

    @androidx.annotation.P
    public static <T extends C0217c> T a(@androidx.annotation.N Class<T> cls) {
        return (T) c().b(cls);
    }

    private <Result> Result b(Class cls) {
        Result result = (Result) ((C0217c) this.f24983a.get(cls));
        if (result != null) {
            return result;
        }
        synchronized (cls) {
            try {
                Result result2 = (Result) ((C0217c) this.f24983a.get(cls));
                if (result2 != null) {
                    return result2;
                }
                Class cls2 = this.f24984b.get(cls);
                if (cls2 != null) {
                    try {
                        Result result3 = (Result) ((C0217c) cls2.newInstance());
                        this.f24983a.put(cls, result3);
                        return result3;
                    } catch (Exception unused) {
                        Log.e(f24982c, "The <" + cls2 + "> has no parameterless constructor.");
                        return null;
                    }
                }
                Log.e(f24982c, "The <" + cls + "> doesn't implement.");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static C1082c c() {
        return d.f24985a;
    }

    private void d() {
    }

    public static void e(@androidx.annotation.P Class<? extends C0217c> cls) {
        if (cls == null) {
            return;
        }
        c().f(cls);
    }

    private void f(Class cls) {
        this.f24984b.put(cls.getSuperclass(), cls);
    }

    @androidx.annotation.N
    public static String g() {
        return c().toString();
    }

    public String toString() {
        return "ApiUtils: " + this.f24984b;
    }

    private C1082c() {
        this.f24983a = new ConcurrentHashMap();
        this.f24984b = new HashMap();
        d();
    }
}
