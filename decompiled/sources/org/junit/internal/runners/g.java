package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

@Deprecated
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f55621a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private i f55622b;

    public g(i iVar) {
        this.f55622b = iVar;
    }

    private void f(Class<? extends Annotation> cls, boolean z3) {
        String str;
        for (Method method : this.f55622b.b(cls)) {
            if (Modifier.isStatic(method.getModifiers()) != z3) {
                if (z3) {
                    str = "should";
                } else {
                    str = "should not";
                }
                this.f55621a.add(new Exception("Method " + method.getName() + "() " + str + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                this.f55621a.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                this.f55621a.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                this.f55621a.add(new Exception("Method " + method.getName() + "should have a return type of void"));
            }
            if (method.getParameterTypes().length != 0) {
                this.f55621a.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }

    public void a() throws InitializationError {
        if (this.f55621a.isEmpty()) {
        } else {
            throw new InitializationError(this.f55621a);
        }
    }

    public void b() {
        f(org.junit.a.class, false);
        f(org.junit.e.class, false);
        f(Test.class, false);
        if (this.f55622b.b(Test.class).size() == 0) {
            this.f55621a.add(new Exception("No runnable methods"));
        }
    }

    public List<Throwable> c() {
        d();
        e();
        b();
        return this.f55621a;
    }

    public void d() {
        try {
            this.f55622b.d();
        } catch (Exception e4) {
            this.f55621a.add(new Exception("Test class should have public zero-argument constructor", e4));
        }
    }

    public void e() {
        f(org.junit.f.class, true);
        f(org.junit.b.class, true);
    }
}
