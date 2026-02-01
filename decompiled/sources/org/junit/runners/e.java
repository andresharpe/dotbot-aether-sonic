package org.junit.runners;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.internal.AssumptionViolatedException;
import org.junit.rules.l;
import org.junit.runner.Description;
import org.junit.runner.j;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.f;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.InvalidTestClassError;
import org.junit.runners.model.h;
import org.junit.runners.model.i;

/* loaded from: classes2.dex */
public abstract class e<T> extends j implements org.junit.runner.manipulation.c, org.junit.runner.manipulation.d {

    /* renamed from: e, reason: collision with root package name */
    private static final List<org.junit.validator.e> f55801e = Collections.singletonList(new org.junit.validator.c());

    /* renamed from: b, reason: collision with root package name */
    private final org.junit.runners.model.j f55803b;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f55802a = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile List<T> f55804c = null;

    /* renamed from: d, reason: collision with root package name */
    private volatile h f55805d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements h {
        a() {
        }

        @Override // org.junit.runners.model.h
        public void a(Runnable runnable) {
            runnable.run();
        }

        @Override // org.junit.runners.model.h
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runner.notification.b f55807a;

        b(org.junit.runner.notification.b bVar) {
            this.f55807a = bVar;
        }

        @Override // org.junit.runners.model.i
        public void a() {
            e.this.x(this.f55807a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f55809a;

        c(i iVar) {
            this.f55809a = iVar;
        }

        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            try {
                this.f55809a.a();
            } finally {
                Thread.interrupted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Object f55811E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ org.junit.runner.notification.b f55812F;

        d(Object obj, org.junit.runner.notification.b bVar) {
            this.f55811E = obj;
            this.f55812F = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            e.this.w(this.f55811E, this.f55812F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.junit.runners.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0537e implements Comparator<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runner.manipulation.h f55814a;

        C0537e(org.junit.runner.manipulation.h hVar) {
            this.f55814a = hVar;
        }

        @Override // java.util.Comparator
        public int compare(T t3, T t4) {
            return this.f55814a.compare(e.this.p(t3), e.this.p(t4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(Class<?> cls) throws InitializationError {
        this.f55803b = o(cls);
        C();
    }

    private boolean A() {
        if (a().l(org.junit.h.class) != null) {
            return true;
        }
        return false;
    }

    private boolean B(org.junit.runner.manipulation.b bVar, T t3) {
        return bVar.e(p(t3));
    }

    private void C() throws InitializationError {
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (arrayList.isEmpty()) {
        } else {
            throw new InvalidTestClassError(this.f55803b.n(), arrayList);
        }
    }

    private void D(List<Throwable> list) {
        org.junit.internal.runners.rules.a.f55629d.i(u(), list);
        org.junit.internal.runners.rules.a.f55631f.i(u(), list);
    }

    private i H(i iVar) {
        List<l> l4 = l();
        if (!l4.isEmpty()) {
            return new org.junit.rules.h(iVar, l4, a());
        }
        return iVar;
    }

    private void h(List<Throwable> list) {
        if (u().n() != null) {
            Iterator<org.junit.validator.e> it = f55801e.iterator();
            while (it.hasNext()) {
                list.addAll(it.next().a(u()));
            }
        }
    }

    private boolean i() {
        Iterator<T> it = r().iterator();
        while (it.hasNext()) {
            if (!v(it.next())) {
                return false;
            }
        }
        return true;
    }

    private Comparator<? super T> n(org.junit.runner.manipulation.h hVar) {
        return new C0537e(hVar);
    }

    private List<T> r() {
        if (this.f55804c == null) {
            this.f55802a.lock();
            try {
                if (this.f55804c == null) {
                    this.f55804c = Collections.unmodifiableList(new ArrayList(q()));
                }
            } finally {
                this.f55802a.unlock();
            }
        }
        return this.f55804c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(org.junit.runner.notification.b bVar) {
        h hVar = this.f55805d;
        try {
            Iterator<T> it = r().iterator();
            while (it.hasNext()) {
                hVar.a(new d(it.next(), bVar));
            }
        } finally {
            hVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E(Class<? extends Annotation> cls, boolean z3, List<Throwable> list) {
        Iterator<org.junit.runners.model.d> it = u().m(cls).iterator();
        while (it.hasNext()) {
            it.next().u(z3, list);
        }
    }

    protected i F(i iVar) {
        List<org.junit.runners.model.d> m4 = this.f55803b.m(org.junit.b.class);
        if (!m4.isEmpty()) {
            return new org.junit.internal.runners.statements.e(iVar, m4, null);
        }
        return iVar;
    }

    protected i G(i iVar) {
        List<org.junit.runners.model.d> m4 = this.f55803b.m(org.junit.f.class);
        if (!m4.isEmpty()) {
            return new org.junit.internal.runners.statements.f(iVar, m4, null);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final i I(i iVar) {
        return new c(iVar);
    }

    @Override // org.junit.runner.j, org.junit.runner.b
    public Description a() {
        Description f4;
        Class<?> n4 = u().n();
        if (n4 != null && n4.getName().equals(s())) {
            f4 = Description.d(n4, t());
        } else {
            f4 = Description.f(s(), t());
        }
        Iterator<T> it = r().iterator();
        while (it.hasNext()) {
            f4.a(p(it.next()));
        }
        return f4;
    }

    @Override // org.junit.runner.j
    public void b(org.junit.runner.notification.b bVar) {
        org.junit.internal.runners.model.a aVar = new org.junit.internal.runners.model.a(bVar, a());
        aVar.h();
        try {
            try {
                try {
                    try {
                        k(bVar).a();
                    } catch (StoppedByUserException e4) {
                        throw e4;
                    }
                } catch (Throwable th) {
                    aVar.b(th);
                }
            } catch (AssumptionViolatedException e5) {
                aVar.a(e5);
            }
            aVar.g();
        } catch (Throwable th2) {
            aVar.g();
            throw th2;
        }
    }

    @Override // org.junit.runner.manipulation.d
    public void c(org.junit.runner.manipulation.e eVar) throws InvalidOrderingException {
        if (A()) {
            return;
        }
        this.f55802a.lock();
        try {
            List<T> r4 = r();
            LinkedHashMap linkedHashMap = new LinkedHashMap(r4.size());
            for (T t3 : r4) {
                Description p4 = p(t3);
                List list = (List) linkedHashMap.get(p4);
                if (list == null) {
                    list = new ArrayList(1);
                    linkedHashMap.put(p4, list);
                }
                list.add(t3);
                eVar.a(t3);
            }
            List<Description> b4 = eVar.b(linkedHashMap.keySet());
            ArrayList arrayList = new ArrayList(r4.size());
            Iterator<Description> it = b4.iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) linkedHashMap.get(it.next()));
            }
            this.f55804c = Collections.unmodifiableList(arrayList);
            this.f55802a.unlock();
        } catch (Throwable th) {
            this.f55802a.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.runner.manipulation.c
    public void e(org.junit.runner.manipulation.b bVar) throws NoTestsRemainException {
        this.f55802a.lock();
        try {
            ArrayList arrayList = new ArrayList(r());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (B(bVar, next)) {
                    try {
                        bVar.a(next);
                    } catch (NoTestsRemainException unused) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
            this.f55804c = Collections.unmodifiableList(arrayList);
            if (!this.f55804c.isEmpty()) {
            } else {
                throw new NoTestsRemainException();
            }
        } finally {
            this.f55802a.unlock();
        }
    }

    @Override // org.junit.runner.manipulation.g
    public void f(org.junit.runner.manipulation.h hVar) {
        if (A()) {
            return;
        }
        this.f55802a.lock();
        try {
            Iterator<T> it = r().iterator();
            while (it.hasNext()) {
                hVar.b(it.next());
            }
            ArrayList arrayList = new ArrayList(r());
            Collections.sort(arrayList, n(hVar));
            this.f55804c = Collections.unmodifiableList(arrayList);
            this.f55802a.unlock();
        } catch (Throwable th) {
            this.f55802a.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i j(org.junit.runner.notification.b bVar) {
        return new b(bVar);
    }

    protected i k(org.junit.runner.notification.b bVar) {
        i j4 = j(bVar);
        if (!i()) {
            return I(H(F(G(j4))));
        }
        return j4;
    }

    protected List<l> l() {
        f fVar = new f(null);
        this.f55803b.d(null, org.junit.g.class, l.class, fVar);
        this.f55803b.c(null, org.junit.g.class, l.class, fVar);
        return fVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(List<Throwable> list) {
        E(org.junit.f.class, true, list);
        E(org.junit.b.class, true, list);
        D(list);
        h(list);
    }

    @Deprecated
    protected org.junit.runners.model.j o(Class<?> cls) {
        return new org.junit.runners.model.j(cls);
    }

    protected abstract Description p(T t3);

    protected abstract List<T> q();

    protected String s() {
        return this.f55803b.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Annotation[] t() {
        return this.f55803b.i();
    }

    public final org.junit.runners.model.j u() {
        return this.f55803b;
    }

    protected boolean v(T t3) {
        return false;
    }

    protected abstract void w(T t3, org.junit.runner.notification.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(i iVar, Description description, org.junit.runner.notification.b bVar) {
        org.junit.internal.runners.model.a aVar = new org.junit.internal.runners.model.a(bVar, description);
        aVar.f();
        try {
            try {
                iVar.a();
            } catch (Throwable th) {
                aVar.d();
                throw th;
            }
        } catch (AssumptionViolatedException e4) {
            aVar.a(e4);
            aVar.d();
        } catch (Throwable th2) {
            aVar.b(th2);
            aVar.d();
        }
        aVar.d();
    }

    public void z(h hVar) {
        this.f55805d = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f implements org.junit.runners.model.e<l> {

        /* renamed from: a, reason: collision with root package name */
        final List<f.b> f55816a;

        private f() {
            this.f55816a = new ArrayList();
        }

        @Override // org.junit.runners.model.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(org.junit.runners.model.c<?> cVar, l lVar) {
            Integer num;
            org.junit.g gVar = (org.junit.g) cVar.a(org.junit.g.class);
            List<f.b> list = this.f55816a;
            if (gVar != null) {
                num = Integer.valueOf(gVar.order());
            } else {
                num = null;
            }
            list.add(new f.b(lVar, 1, num));
        }

        public List<l> c() {
            Collections.sort(this.f55816a, org.junit.runners.f.f55817d);
            ArrayList arrayList = new ArrayList(this.f55816a.size());
            Iterator<f.b> it = this.f55816a.iterator();
            while (it.hasNext()) {
                arrayList.add((l) it.next().f55823a);
            }
            return arrayList;
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(org.junit.runners.model.j jVar) throws InitializationError {
        this.f55803b = (org.junit.runners.model.j) org.junit.internal.a.a(jVar);
        C();
    }
}
