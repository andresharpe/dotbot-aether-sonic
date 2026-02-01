package org.junit.runners.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runner.Description;
import org.junit.runner.manipulation.InvalidOrderingException;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<?>> f55842a = new HashSet();

    private void b(org.junit.runner.j jVar) throws InvalidOrderingException {
        Description a4 = jVar.a();
        org.junit.runner.f fVar = (org.junit.runner.f) a4.l(org.junit.runner.f.class);
        if (fVar != null) {
            org.junit.runner.manipulation.f.c(fVar.value(), a4).b(jVar);
        }
    }

    private List<org.junit.runner.j> g(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            org.junit.runner.j h4 = h(cls);
            if (h4 != null) {
                arrayList.add(h4);
            }
        }
        return arrayList;
    }

    Class<?> a(Class<?> cls) throws InitializationError {
        if (this.f55842a.add(cls)) {
            return cls;
        }
        throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    void c(Class<?> cls) {
        this.f55842a.remove(cls);
    }

    public abstract org.junit.runner.j d(Class<?> cls) throws Throwable;

    public List<org.junit.runner.j> e(Class<?> cls, List<Class<?>> list) throws InitializationError {
        return f(cls, (Class[]) list.toArray(new Class[0]));
    }

    public List<org.junit.runner.j> f(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        a(cls);
        try {
            return g(clsArr);
        } finally {
            c(cls);
        }
    }

    public org.junit.runner.j h(Class<?> cls) {
        try {
            org.junit.runner.j d4 = d(cls);
            if (d4 != null) {
                b(d4);
            }
            return d4;
        } catch (Throwable th) {
            return new org.junit.internal.runners.b(cls, th);
        }
    }
}
