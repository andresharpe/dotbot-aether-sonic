package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.InvalidTestClassError;

/* loaded from: classes2.dex */
public class b extends org.junit.runner.j {

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f55602a;

    /* renamed from: b, reason: collision with root package name */
    private final String f55603b;

    public b(Class<?> cls, Throwable th) {
        this(th, (Class<?>[]) new Class[]{cls});
    }

    private Description g() {
        return Description.j(this.f55603b, "initializationError", new Annotation[0]);
    }

    private List<Throwable> h(Throwable th) {
        if (th instanceof InvocationTargetException) {
            return h(th.getCause());
        }
        if (th instanceof InvalidTestClassError) {
            return Collections.singletonList(th);
        }
        if (th instanceof org.junit.runners.model.InitializationError) {
            return ((org.junit.runners.model.InitializationError) th).a();
        }
        if (th instanceof InitializationError) {
            return ((InitializationError) th).a();
        }
        return Collections.singletonList(th);
    }

    private String i(Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls : clsArr) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(cls.getName());
        }
        return sb.toString();
    }

    private void j(Throwable th, org.junit.runner.notification.b bVar) {
        Description g4 = g();
        bVar.l(g4);
        bVar.f(new Failure(g4, th));
        bVar.h(g4);
    }

    @Override // org.junit.runner.j, org.junit.runner.b
    public Description a() {
        Description f4 = Description.f(this.f55603b, new Annotation[0]);
        for (Throwable th : this.f55602a) {
            f4.a(g());
        }
        return f4;
    }

    @Override // org.junit.runner.j
    public void b(org.junit.runner.notification.b bVar) {
        Iterator<Throwable> it = this.f55602a.iterator();
        while (it.hasNext()) {
            j(it.next(), bVar);
        }
    }

    public b(Throwable th, Class<?>... clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            for (Class<?> cls : clsArr) {
                if (cls == null) {
                    throw new NullPointerException("Test class cannot be null");
                }
            }
            this.f55603b = i(clsArr);
            this.f55602a = h(th);
            return;
        }
        throw new NullPointerException("Test classes cannot be null or empty");
    }
}
