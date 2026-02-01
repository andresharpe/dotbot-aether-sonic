package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;

@Deprecated
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private org.junit.runner.notification.b f55598a;

    /* renamed from: b, reason: collision with root package name */
    private i f55599b;

    /* renamed from: c, reason: collision with root package name */
    private Description f55600c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f55601d;

    public a(org.junit.runner.notification.b bVar, i iVar, Description description, Runnable runnable) {
        this.f55598a = bVar;
        this.f55599b = iVar;
        this.f55600c = description;
        this.f55601d = runnable;
    }

    private void b() {
        Iterator<Method> it = this.f55599b.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(null, new Object[0]);
            } catch (InvocationTargetException e4) {
                a(e4.getTargetException());
            } catch (Throwable th) {
                a(th);
            }
        }
    }

    private void c() throws c {
        try {
            try {
                Iterator<Method> it = this.f55599b.c().iterator();
                while (it.hasNext()) {
                    it.next().invoke(null, new Object[0]);
                }
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            }
        } catch (AssumptionViolatedException unused) {
            throw new c();
        } catch (Throwable th) {
            a(th);
            throw new c();
        }
    }

    protected void a(Throwable th) {
        this.f55598a.f(new Failure(this.f55600c, th));
    }

    public void d() {
        try {
            c();
            e();
        } catch (c unused) {
        } catch (Throwable th) {
            b();
            throw th;
        }
        b();
    }

    protected void e() {
        this.f55601d.run();
    }
}
