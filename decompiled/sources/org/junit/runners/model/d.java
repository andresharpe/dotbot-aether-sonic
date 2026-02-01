package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends c<d> {

    /* renamed from: a, reason: collision with root package name */
    private final Method f55837a;

    /* loaded from: classes2.dex */
    class a extends org.junit.internal.runners.model.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f55838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f55839b;

        a(Object obj, Object[] objArr) {
            this.f55838a = obj;
            this.f55839b = objArr;
        }

        @Override // org.junit.internal.runners.model.b
        protected Object b() throws Throwable {
            return d.this.f55837a.invoke(this.f55838a, this.f55839b);
        }
    }

    public d(Method method) {
        if (method != null) {
            this.f55837a = method;
            if (h()) {
                try {
                    method.setAccessible(true);
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            }
            return;
        }
        throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
    }

    private Class<?>[] n() {
        return this.f55837a.getParameterTypes();
    }

    @Override // org.junit.runners.model.a
    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.f55837a.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.c
    public Class<?> b() {
        return this.f55837a.getDeclaringClass();
    }

    @Override // org.junit.runners.model.c
    protected int c() {
        return this.f55837a.getModifiers();
    }

    @Override // org.junit.runners.model.c
    public String d() {
        return this.f55837a.getName();
    }

    @Override // org.junit.runners.model.c
    public Class<?> e() {
        return o();
    }

    public boolean equals(Object obj) {
        if (!d.class.isInstance(obj)) {
            return false;
        }
        return ((d) obj).f55837a.equals(this.f55837a);
    }

    @Override // org.junit.runners.model.c
    boolean g() {
        return this.f55837a.isBridge();
    }

    public int hashCode() {
        return this.f55837a.hashCode();
    }

    @Override // org.junit.runners.model.a
    public Annotation[] i() {
        return this.f55837a.getAnnotations();
    }

    public Method m() {
        return this.f55837a;
    }

    public Class<?> o() {
        return this.f55837a.getReturnType();
    }

    public Object p(Object obj, Object... objArr) throws Throwable {
        return new a(obj, objArr).a();
    }

    @Override // org.junit.runners.model.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean j(d dVar) {
        if (!dVar.d().equals(d()) || dVar.n().length != n().length) {
            return false;
        }
        for (int i4 = 0; i4 < dVar.n().length; i4++) {
            if (!dVar.n()[i4].equals(n()[i4])) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean r(Type type) {
        if (n().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.f55837a.getReturnType())) {
            return true;
        }
        return false;
    }

    public void s(List<Throwable> list) {
        new f(this.f55837a).a(list);
    }

    public void t(boolean z3, List<Throwable> list) {
        String str;
        if (k() != z3) {
            if (z3) {
                str = "should";
            } else {
                str = "should not";
            }
            list.add(new Exception("Method " + this.f55837a.getName() + "() " + str + " be static"));
        }
        if (!h()) {
            list.add(new Exception("Method " + this.f55837a.getName() + "() should be public"));
        }
        if (this.f55837a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.f55837a.getName() + "() should be void"));
        }
    }

    public String toString() {
        return this.f55837a.toString();
    }

    public void u(boolean z3, List<Throwable> list) {
        t(z3, list);
        if (this.f55837a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.f55837a.getName() + " should have no parameters"));
        }
    }
}
