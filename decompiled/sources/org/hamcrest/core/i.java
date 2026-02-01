package org.hamcrest.core;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class i<T> extends org.hamcrest.b<T> {

    /* renamed from: E, reason: collision with root package name */
    private final Object f55438E;

    public i(T t3) {
        this.f55438E = t3;
    }

    private static boolean e(Object obj, Object obj2) {
        for (int i4 = 0; i4 < Array.getLength(obj); i4++) {
            if (!h(Array.get(obj, i4), Array.get(obj2, i4))) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(Object obj, Object obj2) {
        if (Array.getLength(obj) == Array.getLength(obj2)) {
            return true;
        }
        return false;
    }

    private static boolean g(Object obj, Object obj2) {
        if (f(obj, obj2) && e(obj, obj2)) {
            return true;
        }
        return false;
    }

    private static boolean h(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (obj2 != null && j(obj)) {
            if (!j(obj2) || !g(obj, obj2)) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> i(T t3) {
        return new i(t3);
    }

    private static boolean j(Object obj) {
        return obj.getClass().isArray();
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.e(this.f55438E);
    }

    @Override // org.hamcrest.k
    public boolean c(Object obj) {
        return h(obj, this.f55438E);
    }
}
