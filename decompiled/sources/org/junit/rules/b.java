package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.MultipleFailureException;

/* loaded from: classes2.dex */
public class b extends p {

    /* renamed from: a, reason: collision with root package name */
    private List<Throwable> f55663a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f55665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ org.hamcrest.k f55666c;

        a(String str, Object obj, org.hamcrest.k kVar) {
            this.f55664a = str;
            this.f55665b = obj;
            this.f55666c = kVar;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            org.junit.c.X(this.f55664a, this.f55665b, this.f55666c);
            return this.f55665b;
        }
    }

    @Override // org.junit.rules.p
    protected void b() throws Throwable {
        MultipleFailureException.a(this.f55663a);
    }

    public void c(Throwable th) {
        if (th != null) {
            if (th instanceof AssumptionViolatedException) {
                AssertionError assertionError = new AssertionError(th.getMessage());
                assertionError.initCause(th);
                this.f55663a.add(assertionError);
                return;
            }
            this.f55663a.add(th);
            return;
        }
        throw new NullPointerException("Error cannot be null");
    }

    public <T> T d(Callable<T> callable) {
        try {
            return callable.call();
        } catch (AssumptionViolatedException e4) {
            AssertionError assertionError = new AssertionError("Callable threw AssumptionViolatedException");
            assertionError.initCause(e4);
            c(assertionError);
            return null;
        } catch (Throwable th) {
            c(th);
            return null;
        }
    }

    public <T> void e(T t3, org.hamcrest.k<T> kVar) {
        f("", t3, kVar);
    }

    public <T> void f(String str, T t3, org.hamcrest.k<T> kVar) {
        d(new a(str, t3, kVar));
    }

    public void g(Class<? extends Throwable> cls, o3.a aVar) {
        try {
            org.junit.c.Y(cls, aVar);
        } catch (AssertionError e4) {
            c(e4);
        }
    }
}
