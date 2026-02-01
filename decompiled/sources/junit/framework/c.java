package junit.framework;

import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;

/* loaded from: classes2.dex */
public class c implements f, org.junit.runner.manipulation.c, org.junit.runner.manipulation.d, org.junit.runner.b {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f51507a;

    /* renamed from: b, reason: collision with root package name */
    private final org.junit.runner.j f51508b;

    /* renamed from: c, reason: collision with root package name */
    private final JUnit4TestAdapterCache f51509c;

    public c(Class<?> cls) {
        this(cls, JUnit4TestAdapterCache.i());
    }

    private boolean i(Description description) {
        if (description.l(org.junit.i.class) != null) {
            return true;
        }
        return false;
    }

    private Description j(Description description) {
        if (i(description)) {
            return Description.f55708L;
        }
        Description b4 = description.b();
        Iterator<Description> it = description.n().iterator();
        while (it.hasNext()) {
            Description j4 = j(it.next());
            if (!j4.s()) {
                b4.a(j4);
            }
        }
        return b4;
    }

    @Override // org.junit.runner.b
    public Description a() {
        return j(this.f51508b.a());
    }

    @Override // junit.framework.f
    public int b() {
        return this.f51508b.d();
    }

    @Override // org.junit.runner.manipulation.d
    public void c(org.junit.runner.manipulation.e eVar) throws InvalidOrderingException {
        eVar.a(this.f51508b);
    }

    @Override // junit.framework.f
    public void d(j jVar) {
        this.f51508b.b(this.f51509c.j(jVar, this));
    }

    @Override // org.junit.runner.manipulation.c
    public void e(org.junit.runner.manipulation.b bVar) throws NoTestsRemainException {
        bVar.a(this.f51508b);
    }

    @Override // org.junit.runner.manipulation.g
    public void f(org.junit.runner.manipulation.h hVar) {
        hVar.b(this.f51508b);
    }

    public Class<?> g() {
        return this.f51507a;
    }

    public List<f> h() {
        return this.f51509c.e(a());
    }

    public String toString() {
        return this.f51507a.getName();
    }

    public c(Class<?> cls, JUnit4TestAdapterCache jUnit4TestAdapterCache) {
        this.f51509c = jUnit4TestAdapterCache;
        this.f51507a = cls;
        this.f51508b = org.junit.runner.h.b(cls).h();
    }
}
