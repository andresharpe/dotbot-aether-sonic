package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.Failure;

@Deprecated
/* loaded from: classes2.dex */
public class e extends org.junit.runner.j implements org.junit.runner.manipulation.c, org.junit.runner.manipulation.g {

    /* renamed from: a, reason: collision with root package name */
    private final List<Method> f55607a = k();

    /* renamed from: b, reason: collision with root package name */
    private i f55608b;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ org.junit.runner.notification.b f55609E;

        a(org.junit.runner.notification.b bVar) {
            this.f55609E = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f55609E);
        }
    }

    /* loaded from: classes2.dex */
    class b implements Comparator<Method> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runner.manipulation.h f55611a;

        b(org.junit.runner.manipulation.h hVar) {
            this.f55611a = hVar;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Method method, Method method2) {
            return this.f55611a.compare(e.this.m(method), e.this.m(method2));
        }
    }

    public e(Class<?> cls) throws InitializationError {
        this.f55608b = new i(cls);
        r();
    }

    private void o(org.junit.runner.notification.b bVar, Description description, Throwable th) {
        bVar.l(description);
        bVar.f(new Failure(description, th));
        bVar.h(description);
    }

    @Override // org.junit.runner.j, org.junit.runner.b
    public Description a() {
        Description f4 = Description.f(i(), g());
        Iterator<Method> it = this.f55607a.iterator();
        while (it.hasNext()) {
            f4.a(m(it.next()));
        }
        return f4;
    }

    @Override // org.junit.runner.j
    public void b(org.junit.runner.notification.b bVar) {
        new org.junit.internal.runners.a(bVar, this.f55608b, a(), new a(bVar)).d();
    }

    @Override // org.junit.runner.manipulation.c
    public void e(org.junit.runner.manipulation.b bVar) throws NoTestsRemainException {
        Iterator<Method> it = this.f55607a.iterator();
        while (it.hasNext()) {
            if (!bVar.e(m(it.next()))) {
                it.remove();
            }
        }
        if (!this.f55607a.isEmpty()) {
        } else {
            throw new NoTestsRemainException();
        }
    }

    @Override // org.junit.runner.manipulation.g
    public void f(org.junit.runner.manipulation.h hVar) {
        Collections.sort(this.f55607a, new b(hVar));
    }

    protected Annotation[] g() {
        return this.f55608b.e().getAnnotations();
    }

    protected Object h() throws Exception {
        return j().d().newInstance(new Object[0]);
    }

    protected String i() {
        return j().f();
    }

    protected i j() {
        return this.f55608b;
    }

    protected List<Method> k() {
        return this.f55608b.h();
    }

    protected void l(Method method, org.junit.runner.notification.b bVar) {
        Description m4 = m(method);
        try {
            new f(h(), s(method), bVar, m4).b();
        } catch (InvocationTargetException e4) {
            o(bVar, m4, e4.getCause());
        } catch (Exception e5) {
            o(bVar, m4, e5);
        }
    }

    protected Description m(Method method) {
        return Description.h(j().e(), q(method), p(method));
    }

    protected void n(org.junit.runner.notification.b bVar) {
        Iterator<Method> it = this.f55607a.iterator();
        while (it.hasNext()) {
            l(it.next(), bVar);
        }
    }

    protected Annotation[] p(Method method) {
        return method.getAnnotations();
    }

    protected String q(Method method) {
        return method.getName();
    }

    protected void r() throws InitializationError {
        g gVar = new g(this.f55608b);
        gVar.c();
        gVar.a();
    }

    protected j s(Method method) {
        return new j(method, this.f55608b);
    }
}
