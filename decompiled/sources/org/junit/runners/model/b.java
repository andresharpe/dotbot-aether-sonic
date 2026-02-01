package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class b extends c<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Field f55836a;

    public b(Field field) {
        if (field != null) {
            this.f55836a = field;
            if (h()) {
                try {
                    field.setAccessible(true);
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            }
            return;
        }
        throw new NullPointerException("FrameworkField cannot be created without an underlying field.");
    }

    @Override // org.junit.runners.model.a
    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.f55836a.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.c
    public Class<?> b() {
        return this.f55836a.getDeclaringClass();
    }

    @Override // org.junit.runners.model.c
    protected int c() {
        return this.f55836a.getModifiers();
    }

    @Override // org.junit.runners.model.c
    public String d() {
        return m().getName();
    }

    @Override // org.junit.runners.model.c
    public Class<?> e() {
        return this.f55836a.getType();
    }

    @Override // org.junit.runners.model.c
    boolean g() {
        return false;
    }

    @Override // org.junit.runners.model.a
    public Annotation[] i() {
        return this.f55836a.getAnnotations();
    }

    public Object l(Object obj) throws IllegalArgumentException, IllegalAccessException {
        return this.f55836a.get(obj);
    }

    public Field m() {
        return this.f55836a;
    }

    @Override // org.junit.runners.model.c
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public boolean j(b bVar) {
        return bVar.d().equals(d());
    }

    public String toString() {
        return this.f55836a.toString();
    }
}
