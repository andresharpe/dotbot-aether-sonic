package org.junit.runners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.j;
import org.junit.rules.l;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public class b extends e<org.junit.runners.model.d> {

    /* renamed from: g, reason: collision with root package name */
    private static org.junit.validator.e f55785g = new org.junit.validator.d();

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<f> f55786h = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentMap<org.junit.runners.model.d, Description> f55787f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.d f55788a;

        a(org.junit.runners.model.d dVar) {
            this.f55788a = dVar;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            b.this.T(this.f55788a).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.junit.runners.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0535b extends org.junit.internal.runners.model.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.d f55790a;

        C0535b(org.junit.runners.model.d dVar) {
            this.f55790a = dVar;
        }

        @Override // org.junit.internal.runners.model.b
        protected Object b() throws Throwable {
            return b.this.M(this.f55790a);
        }
    }

    public b(Class<?> cls) throws InitializationError {
        super(cls);
        this.f55787f = new ConcurrentHashMap();
    }

    private Class<? extends Throwable> O(Test test) {
        if (test != null && test.expected() != Test.None.class) {
            return test.expected();
        }
        return null;
    }

    private long Q(Test test) {
        if (test == null) {
            return 0L;
        }
        return test.timeout();
    }

    private boolean R() {
        if (u().n().getConstructors().length == 1) {
            return true;
        }
        return false;
    }

    private void c0(List<Throwable> list) {
        org.junit.internal.runners.rules.a.f55632g.i(u(), list);
    }

    private void f0(List<Throwable> list) {
        if (u().n() != null) {
            list.addAll(f55785g.a(u()));
        }
    }

    private i l0(org.junit.runners.model.d dVar, Object obj, i iVar) {
        f fVar = new f();
        f55786h.set(fVar);
        try {
            List<l> P3 = P(obj);
            for (org.junit.rules.f fVar2 : W(obj)) {
                if ((fVar2 instanceof l) && P3.contains(fVar2)) {
                }
                fVar.a(fVar2);
            }
            Iterator<l> it = P3.iterator();
            while (it.hasNext()) {
                fVar.b(it.next());
            }
            f55786h.remove();
            return fVar.c(dVar, p(dVar), obj, iVar);
        } catch (Throwable th) {
            f55786h.remove();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<org.junit.runners.model.d> K() {
        return u().m(Test.class);
    }

    protected Object L() throws Exception {
        return u().p().newInstance(new Object[0]);
    }

    protected Object M(org.junit.runners.model.d dVar) throws Exception {
        return L();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public Description p(org.junit.runners.model.d dVar) {
        Description description = this.f55787f.get(dVar);
        if (description == null) {
            Description h4 = Description.h(u().n(), Y(dVar), dVar.i());
            this.f55787f.putIfAbsent(dVar, h4);
            return h4;
        }
        return description;
    }

    protected List<l> P(Object obj) {
        c cVar = new c(null);
        u().d(obj, j.class, l.class, cVar);
        u().c(obj, j.class, l.class, cVar);
        return cVar.f55792a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public boolean v(org.junit.runners.model.d dVar) {
        if (dVar.a(org.junit.i.class) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i T(org.junit.runners.model.d dVar) {
        try {
            Object a4 = new C0535b(dVar).a();
            return I(l0(dVar, a4, i0(dVar, a4, j0(dVar, a4, k0(dVar, a4, V(dVar, a4, U(dVar, a4)))))));
        } catch (Throwable th) {
            return new org.junit.internal.runners.statements.b(th);
        }
    }

    protected i U(org.junit.runners.model.d dVar, Object obj) {
        return new org.junit.internal.runners.statements.d(dVar, obj);
    }

    protected i V(org.junit.runners.model.d dVar, Object obj, i iVar) {
        Class<? extends Throwable> O3 = O((Test) dVar.a(Test.class));
        if (O3 != null) {
            return new org.junit.internal.runners.statements.a(iVar, O3);
        }
        return iVar;
    }

    protected List<org.junit.rules.f> W(Object obj) {
        c cVar = new c(null);
        u().d(obj, j.class, org.junit.rules.f.class, cVar);
        u().c(obj, j.class, org.junit.rules.f.class, cVar);
        return cVar.f55792a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void w(org.junit.runners.model.d dVar, org.junit.runner.notification.b bVar) {
        Description p4 = p(dVar);
        if (v(dVar)) {
            bVar.i(p4);
        } else {
            y(new a(dVar), p4, bVar);
        }
    }

    protected String Y(org.junit.runners.model.d dVar) {
        return dVar.d();
    }

    protected void Z(List<Throwable> list) {
        e0(list);
        h0(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a0(List<Throwable> list) {
        org.junit.internal.runners.rules.a.f55630e.i(u(), list);
    }

    @Deprecated
    protected void b0(List<Throwable> list) {
        E(org.junit.a.class, false, list);
        E(org.junit.e.class, false, list);
        g0(list);
        if (K().isEmpty()) {
            list.add(new Exception("No runnable methods"));
        }
    }

    protected void d0(List<Throwable> list) {
        if (u().s()) {
            list.add(new Exception("The inner class " + u().o() + " is not static."));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e0(List<Throwable> list) {
        if (!R()) {
            list.add(new Exception("Test class should have exactly one public constructor"));
        }
    }

    protected void g0(List<Throwable> list) {
        E(Test.class, false, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h0(List<Throwable> list) {
        if (!u().s() && R() && u().p().getParameterTypes().length != 0) {
            list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
        }
    }

    protected i i0(org.junit.runners.model.d dVar, Object obj, i iVar) {
        List<org.junit.runners.model.d> m4 = u().m(org.junit.a.class);
        if (!m4.isEmpty()) {
            return new org.junit.internal.runners.statements.e(iVar, m4, obj);
        }
        return iVar;
    }

    protected i j0(org.junit.runners.model.d dVar, Object obj, i iVar) {
        List<org.junit.runners.model.d> m4 = u().m(org.junit.e.class);
        if (!m4.isEmpty()) {
            return new org.junit.internal.runners.statements.f(iVar, m4, obj);
        }
        return iVar;
    }

    @Deprecated
    protected i k0(org.junit.runners.model.d dVar, Object obj, i iVar) {
        long Q3 = Q((Test) dVar.a(Test.class));
        if (Q3 <= 0) {
            return iVar;
        }
        return org.junit.internal.runners.statements.c.c().f(Q3, TimeUnit.MILLISECONDS).d(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.e
    public void m(List<Throwable> list) {
        super.m(list);
        f0(list);
        d0(list);
        Z(list);
        b0(list);
        a0(list);
        c0(list);
    }

    @Override // org.junit.runners.e
    protected List<org.junit.runners.model.d> q() {
        return K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c<T> implements org.junit.runners.model.e<T> {

        /* renamed from: a, reason: collision with root package name */
        final List<T> f55792a;

        private c() {
            this.f55792a = new ArrayList();
        }

        @Override // org.junit.runners.model.e
        public void a(org.junit.runners.model.c<?> cVar, T t3) {
            f fVar;
            j jVar = (j) cVar.a(j.class);
            if (jVar != null && (fVar = (f) b.f55786h.get()) != null) {
                fVar.f(t3, jVar.order());
            }
            this.f55792a.add(t3);
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(org.junit.runners.model.j jVar) throws InitializationError {
        super(jVar);
        this.f55787f = new ConcurrentHashMap();
    }
}
