package org.junit.experimental.theories;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.i;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public class g extends org.junit.runners.b {

    /* loaded from: classes2.dex */
    public static class a extends i {

        /* renamed from: b, reason: collision with root package name */
        private final org.junit.runners.model.d f55527b;

        /* renamed from: c, reason: collision with root package name */
        private final j f55528c;

        /* renamed from: a, reason: collision with root package name */
        private int f55526a = 0;

        /* renamed from: d, reason: collision with root package name */
        private List<AssumptionViolatedException> f55529d = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: org.junit.experimental.theories.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0521a extends org.junit.runners.b {

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ org.junit.experimental.theories.internal.b f55530i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: org.junit.experimental.theories.g$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0522a extends i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f55532a;

                C0522a(i iVar) {
                    this.f55532a = iVar;
                }

                @Override // org.junit.runners.model.i
                public void a() throws Throwable {
                    try {
                        this.f55532a.a();
                        a.this.f();
                    } catch (AssumptionViolatedException e4) {
                        a.this.e(e4);
                    } catch (Throwable th) {
                        C0521a c0521a = C0521a.this;
                        a aVar = a.this;
                        aVar.i(th, c0521a.f55530i.g(aVar.h()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0521a(j jVar, org.junit.experimental.theories.internal.b bVar) {
                super(jVar);
                this.f55530i = bVar;
            }

            @Override // org.junit.runners.b
            public Object L() throws Exception {
                Object[] h4 = this.f55530i.h();
                if (!a.this.h()) {
                    org.junit.d.e(h4);
                }
                return u().p().newInstance(h4);
            }

            @Override // org.junit.runners.b
            public i T(org.junit.runners.model.d dVar) {
                return new C0522a(super.T(dVar));
            }

            @Override // org.junit.runners.b
            protected i U(org.junit.runners.model.d dVar, Object obj) {
                return a.this.g(dVar, this.f55530i, obj);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.junit.runners.b, org.junit.runners.e
            public void m(List<Throwable> list) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b extends i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ org.junit.experimental.theories.internal.b f55534a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ org.junit.runners.model.d f55535b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f55536c;

            b(org.junit.experimental.theories.internal.b bVar, org.junit.runners.model.d dVar, Object obj) {
                this.f55534a = bVar;
                this.f55535b = dVar;
                this.f55536c = obj;
            }

            @Override // org.junit.runners.model.i
            public void a() throws Throwable {
                Object[] j4 = this.f55534a.j();
                if (!a.this.h()) {
                    org.junit.d.e(j4);
                }
                this.f55535b.p(this.f55536c, j4);
            }
        }

        public a(org.junit.runners.model.d dVar, j jVar) {
            this.f55527b = dVar;
            this.f55528c = jVar;
        }

        private j d() {
            return this.f55528c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i g(org.junit.runners.model.d dVar, org.junit.experimental.theories.internal.b bVar, Object obj) {
            return new b(bVar, dVar, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            h hVar = (h) this.f55527b.m().getAnnotation(h.class);
            if (hVar == null) {
                return false;
            }
            return hVar.nullsAccepted();
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            boolean z3;
            j(org.junit.experimental.theories.internal.b.a(this.f55527b.m(), d()));
            if (this.f55527b.a(h.class) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f55526a == 0 && z3) {
                org.junit.c.g0("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.f55529d);
            }
        }

        protected void e(AssumptionViolatedException assumptionViolatedException) {
            this.f55529d.add(assumptionViolatedException);
        }

        protected void f() {
            this.f55526a++;
        }

        protected void i(Throwable th, Object... objArr) throws Throwable {
            if (objArr.length == 0) {
                throw th;
            }
            throw new ParameterizedAssertionError(th, this.f55527b.d(), objArr);
        }

        protected void j(org.junit.experimental.theories.internal.b bVar) throws Throwable {
            if (!bVar.l()) {
                l(bVar);
            } else {
                k(bVar);
            }
        }

        protected void k(org.junit.experimental.theories.internal.b bVar) throws Throwable {
            new C0521a(d(), bVar).T(this.f55527b).a();
        }

        protected void l(org.junit.experimental.theories.internal.b bVar) throws Throwable {
            Iterator<PotentialAssignment> it = bVar.n().iterator();
            while (it.hasNext()) {
                j(bVar.b(it.next()));
            }
        }
    }

    public g(Class<?> cls) throws InitializationError {
        super(cls);
    }

    private void m0(List<Throwable> list) {
        for (Field field : u().n().getDeclaredFields()) {
            if (field.getAnnotation(org.junit.experimental.theories.a.class) != null || field.getAnnotation(b.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    private void n0(List<Throwable> list) {
        for (Method method : u().n().getDeclaredMethods()) {
            if (method.getAnnotation(org.junit.experimental.theories.a.class) != null || method.getAnnotation(b.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    private void o0(Class<? extends e> cls, List<Throwable> list) {
        Constructor<?>[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)"));
            return;
        }
        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
        if (parameterTypes.length != 0 && !parameterTypes[0].equals(j.class)) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.b
    public List<org.junit.runners.model.d> K() {
        ArrayList arrayList = new ArrayList(super.K());
        List<org.junit.runners.model.d> m4 = u().m(h.class);
        arrayList.removeAll(m4);
        arrayList.addAll(m4);
        return arrayList;
    }

    @Override // org.junit.runners.b
    public i T(org.junit.runners.model.d dVar) {
        return new a(dVar, u());
    }

    @Override // org.junit.runners.b
    protected void Z(List<Throwable> list) {
        e0(list);
    }

    @Override // org.junit.runners.b
    protected void g0(List<Throwable> list) {
        for (org.junit.runners.model.d dVar : K()) {
            if (dVar.a(h.class) != null) {
                dVar.t(false, list);
                dVar.s(list);
            } else {
                dVar.u(false, list);
            }
            Iterator<d> it = d.m(dVar.m()).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next().e(f.class);
                if (fVar != null) {
                    o0(fVar.value(), list);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runners.b, org.junit.runners.e
    public void m(List<Throwable> list) {
        super.m(list);
        m0(list);
        n0(list);
    }

    protected g(j jVar) throws InitializationError {
        super(jVar);
    }
}
