package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;

/* loaded from: classes2.dex */
public abstract class m implements l {

    /* loaded from: classes2.dex */
    class a extends org.junit.runners.model.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Description f55690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.i f55691b;

        a(Description description, org.junit.runners.model.i iVar) {
            this.f55690a = description;
            this.f55691b = iVar;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            ArrayList arrayList = new ArrayList();
            m.this.o(this.f55690a, arrayList);
            try {
                try {
                    this.f55691b.a();
                    m.this.q(this.f55690a, arrayList);
                } catch (Throwable th) {
                    m.this.j(this.f55690a, arrayList);
                    throw th;
                }
            } catch (AssumptionViolatedException e4) {
                arrayList.add(e4);
                m.this.m(e4, this.f55690a, arrayList);
                m.this.j(this.f55690a, arrayList);
                MultipleFailureException.a(arrayList);
            } catch (Throwable th2) {
                arrayList.add(th2);
                m.this.h(th2, this.f55690a, arrayList);
                m.this.j(this.f55690a, arrayList);
                MultipleFailureException.a(arrayList);
            }
            m.this.j(this.f55690a, arrayList);
            MultipleFailureException.a(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Throwable th, Description description, List<Throwable> list) {
        try {
            g(th, description);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Description description, List<Throwable> list) {
        try {
            i(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(AssumptionViolatedException assumptionViolatedException, Description description, List<Throwable> list) {
        try {
            if (assumptionViolatedException instanceof org.junit.AssumptionViolatedException) {
                k((org.junit.AssumptionViolatedException) assumptionViolatedException, description);
            } else {
                l(assumptionViolatedException, description);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Description description, List<Throwable> list) {
        try {
            n(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Description description, List<Throwable> list) {
        try {
            p(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        return new a(description, iVar);
    }

    protected void g(Throwable th, Description description) {
    }

    protected void i(Description description) {
    }

    protected void k(org.junit.AssumptionViolatedException assumptionViolatedException, Description description) {
        l(assumptionViolatedException, description);
    }

    @Deprecated
    protected void l(AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    protected void n(Description description) {
    }

    protected void p(Description description) {
    }
}
