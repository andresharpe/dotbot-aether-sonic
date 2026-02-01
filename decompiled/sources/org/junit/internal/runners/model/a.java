package org.junit.internal.runners.model;

import java.util.Iterator;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final org.junit.runner.notification.b f55627a;

    /* renamed from: b, reason: collision with root package name */
    private final Description f55628b;

    public a(org.junit.runner.notification.b bVar, Description description) {
        this.f55627a = bVar;
        this.f55628b = description;
    }

    private void c(org.junit.runners.model.MultipleFailureException multipleFailureException) {
        Iterator<Throwable> it = multipleFailureException.b().iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public void a(AssumptionViolatedException assumptionViolatedException) {
        this.f55627a.e(new Failure(this.f55628b, assumptionViolatedException));
    }

    public void b(Throwable th) {
        if (th instanceof org.junit.runners.model.MultipleFailureException) {
            c((org.junit.runners.model.MultipleFailureException) th);
        } else {
            this.f55627a.f(new Failure(this.f55628b, th));
        }
    }

    public void d() {
        this.f55627a.h(this.f55628b);
    }

    public void e() {
        this.f55627a.i(this.f55628b);
    }

    public void f() {
        this.f55627a.l(this.f55628b);
    }

    public void g() {
        this.f55627a.m(this.f55628b);
    }

    public void h() {
        this.f55627a.n(this.f55628b);
    }
}
