package org.hamcrest.core;

/* loaded from: classes2.dex */
public class j extends org.hamcrest.h<Object> {

    /* renamed from: E, reason: collision with root package name */
    private final Class<?> f55439E;

    /* renamed from: F, reason: collision with root package name */
    private final Class<?> f55440F;

    public j(Class<?> cls) {
        this.f55439E = cls;
        this.f55440F = h(cls);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> f(Class<T> cls) {
        return new j(cls);
    }

    @org.hamcrest.i
    public static <T> org.hamcrest.k<T> g(Class<?> cls) {
        return new j(cls);
    }

    private static Class<?> h(Class<?> cls) {
        if (Boolean.TYPE.equals(cls)) {
            return Boolean.class;
        }
        if (Byte.TYPE.equals(cls)) {
            return Byte.class;
        }
        if (Character.TYPE.equals(cls)) {
            return Character.class;
        }
        if (Double.TYPE.equals(cls)) {
            return Double.class;
        }
        if (Float.TYPE.equals(cls)) {
            return Float.class;
        }
        if (Integer.TYPE.equals(cls)) {
            return Integer.class;
        }
        if (Long.TYPE.equals(cls)) {
            return Long.class;
        }
        if (Short.TYPE.equals(cls)) {
            return Short.class;
        }
        return cls;
    }

    @Override // org.hamcrest.m
    public void b(org.hamcrest.g gVar) {
        gVar.d("an instance of ").d(this.f55439E.getName());
    }

    @Override // org.hamcrest.h
    protected boolean e(Object obj, org.hamcrest.g gVar) {
        if (obj == null) {
            gVar.d("null");
            return false;
        }
        if (!this.f55440F.isInstance(obj)) {
            gVar.e(obj).d(" is a " + obj.getClass().getName());
            return false;
        }
        return true;
    }
}
