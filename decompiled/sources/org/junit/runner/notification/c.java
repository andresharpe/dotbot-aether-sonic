package org.junit.runner.notification;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.a;

/* JADX INFO: Access modifiers changed from: package-private */
@a.InterfaceC0533a
/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private final a f55783a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f55784b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar, Object obj) {
        this.f55783a = aVar;
        this.f55784b = obj;
    }

    @Override // org.junit.runner.notification.a
    public void a(Failure failure) {
        synchronized (this.f55784b) {
            this.f55783a.a(failure);
        }
    }

    @Override // org.junit.runner.notification.a
    public void b(Failure failure) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.b(failure);
        }
    }

    @Override // org.junit.runner.notification.a
    public void c(Description description) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.c(description);
        }
    }

    @Override // org.junit.runner.notification.a
    public void d(Description description) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.d(description);
        }
    }

    @Override // org.junit.runner.notification.a
    public void e(Result result) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.e(result);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f55783a.equals(((c) obj).f55783a);
    }

    @Override // org.junit.runner.notification.a
    public void f(Description description) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.f(description);
        }
    }

    @Override // org.junit.runner.notification.a
    public void g(Description description) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.g(description);
        }
    }

    @Override // org.junit.runner.notification.a
    public void h(Description description) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.h(description);
        }
    }

    public int hashCode() {
        return this.f55783a.hashCode();
    }

    @Override // org.junit.runner.notification.a
    public void i(Description description) throws Exception {
        synchronized (this.f55784b) {
            this.f55783a.i(description);
        }
    }

    public String toString() {
        return this.f55783a.toString() + " (with synchronization wrapper)";
    }
}
