package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.Test;

@Deprecated
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final Method f55624a;

    /* renamed from: b, reason: collision with root package name */
    private i f55625b;

    public j(Method method, i iVar) {
        this.f55624a = method;
        this.f55625b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Method> b() {
        return this.f55625b.b(org.junit.a.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Method> c() {
        return this.f55625b.b(org.junit.e.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Class<? extends Throwable> d() {
        Test test = (Test) this.f55624a.getAnnotation(Test.class);
        if (test != null && test.expected() != Test.None.class) {
            return test.expected();
        }
        return null;
    }

    public long e() {
        Test test = (Test) this.f55624a.getAnnotation(Test.class);
        if (test == null) {
            return 0L;
        }
        return test.timeout();
    }

    public void f(Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        this.f55624a.invoke(obj, new Object[0]);
    }

    public boolean g() {
        if (this.f55624a.getAnnotation(org.junit.i.class) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(Throwable th) {
        return !d().isAssignableFrom(th.getClass());
    }
}
