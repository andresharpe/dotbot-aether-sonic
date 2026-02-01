package junit.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    protected List<h> f51514a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    protected List<h> f51515b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    protected List<i> f51516c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    protected int f51517d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f51518e = false;

    /* loaded from: classes2.dex */
    class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f51519a;

        a(g gVar) {
            this.f51519a = gVar;
        }

        @Override // junit.framework.e
        public void a() throws Throwable {
            this.f51519a.R();
        }
    }

    private synchronized List<i> d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f51516c);
        return arrayList;
    }

    public synchronized void a(f fVar, Throwable th) {
        this.f51515b.add(new h(fVar, th));
        Iterator<i> it = d().iterator();
        while (it.hasNext()) {
            it.next().a(fVar, th);
        }
    }

    public synchronized void b(f fVar, AssertionFailedError assertionFailedError) {
        this.f51514a.add(new h(fVar, assertionFailedError));
        Iterator<i> it = d().iterator();
        while (it.hasNext()) {
            it.next().b(fVar, assertionFailedError);
        }
    }

    public synchronized void c(i iVar) {
        this.f51516c.add(iVar);
    }

    public void e(f fVar) {
        Iterator<i> it = d().iterator();
        while (it.hasNext()) {
            it.next().c(fVar);
        }
    }

    public synchronized int f() {
        return this.f51515b.size();
    }

    public synchronized Enumeration<h> g() {
        return Collections.enumeration(this.f51515b);
    }

    public synchronized int h() {
        return this.f51514a.size();
    }

    public synchronized Enumeration<h> i() {
        return Collections.enumeration(this.f51514a);
    }

    public synchronized void j(i iVar) {
        this.f51516c.remove(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(g gVar) {
        o(gVar);
        m(gVar, new a(gVar));
        e(gVar);
    }

    public synchronized int l() {
        return this.f51517d;
    }

    public void m(f fVar, e eVar) {
        try {
            eVar.a();
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (AssertionFailedError e5) {
            b(fVar, e5);
        } catch (Throwable th) {
            a(fVar, th);
        }
    }

    public synchronized boolean n() {
        return this.f51518e;
    }

    public void o(f fVar) {
        int b4 = fVar.b();
        synchronized (this) {
            this.f51517d += b4;
        }
        Iterator<i> it = d().iterator();
        while (it.hasNext()) {
            it.next().d(fVar);
        }
    }

    public synchronized void p() {
        this.f51518e = true;
    }

    public synchronized boolean q() {
        boolean z3;
        if (h() == 0) {
            if (f() == 0) {
                z3 = true;
            }
        }
        z3 = false;
        return z3;
    }
}
