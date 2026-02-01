package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.a;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<org.junit.runner.notification.a> f55761a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f55762b = false;

    /* loaded from: classes2.dex */
    class a extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Description f55763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Description description) {
            super(b.this);
            this.f55763c = description;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.f(this.f55763c);
        }
    }

    /* renamed from: org.junit.runner.notification.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0534b extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Result f55765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0534b(Result result) {
            super(b.this);
            this.f55765c = result;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.e(this.f55765c);
        }
    }

    /* loaded from: classes2.dex */
    class c extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Description f55767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Description description) {
            super(b.this);
            this.f55767c = description;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.i(this.f55767c);
        }
    }

    /* loaded from: classes2.dex */
    class d extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Description f55769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Description description) {
            super(b.this);
            this.f55769c = description;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.h(this.f55769c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Description f55771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Description description) {
            super(b.this);
            this.f55771c = description;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.g(this.f55771c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f55773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, List list2) {
            super(list);
            this.f55773c = list2;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            Iterator it = this.f55773c.iterator();
            while (it.hasNext()) {
                aVar.b((Failure) it.next());
            }
        }
    }

    /* loaded from: classes2.dex */
    class g extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Failure f55775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Failure failure) {
            super(b.this);
            this.f55775c = failure;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.a(this.f55775c);
        }
    }

    /* loaded from: classes2.dex */
    class h extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Description f55777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Description description) {
            super(b.this);
            this.f55777c = description;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.d(this.f55777c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Description f55779c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Description description) {
            super(b.this);
            this.f55779c = description;
        }

        @Override // org.junit.runner.notification.b.j
        protected void a(org.junit.runner.notification.a aVar) throws Exception {
            aVar.c(this.f55779c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class j {

        /* renamed from: a, reason: collision with root package name */
        private final List<org.junit.runner.notification.a> f55781a;

        j(b bVar) {
            this(bVar.f55761a);
        }

        protected abstract void a(org.junit.runner.notification.a aVar) throws Exception;

        void b() {
            int size = this.f55781a.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (org.junit.runner.notification.a aVar : this.f55781a) {
                try {
                    a(aVar);
                    arrayList.add(aVar);
                } catch (Exception e4) {
                    arrayList2.add(new Failure(Description.f55709M, e4));
                }
            }
            b.this.g(arrayList, arrayList2);
        }

        j(List<org.junit.runner.notification.a> list) {
            this.f55781a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(List<org.junit.runner.notification.a> list, List<Failure> list2) {
        if (!list2.isEmpty()) {
            new f(list, list2).b();
        }
    }

    public void c(org.junit.runner.notification.a aVar) {
        if (aVar != null) {
            this.f55761a.add(0, q(aVar));
            return;
        }
        throw new NullPointerException("Cannot add a null listener");
    }

    public void d(org.junit.runner.notification.a aVar) {
        if (aVar != null) {
            this.f55761a.add(q(aVar));
            return;
        }
        throw new NullPointerException("Cannot add a null listener");
    }

    public void e(Failure failure) {
        new g(failure).b();
    }

    public void f(Failure failure) {
        g(this.f55761a, Arrays.asList(failure));
    }

    public void h(Description description) {
        new i(description).b();
    }

    public void i(Description description) {
        new h(description).b();
    }

    public void j(Result result) {
        new C0534b(result).b();
    }

    public void k(Description description) {
        new a(description).b();
    }

    public void l(Description description) throws StoppedByUserException {
        if (!this.f55762b) {
            new e(description).b();
            return;
        }
        throw new StoppedByUserException();
    }

    public void m(Description description) {
        new d(description).b();
    }

    public void n(Description description) {
        new c(description).b();
    }

    public void o() {
        this.f55762b = true;
    }

    public void p(org.junit.runner.notification.a aVar) {
        if (aVar != null) {
            this.f55761a.remove(q(aVar));
            return;
        }
        throw new NullPointerException("Cannot remove a null listener");
    }

    org.junit.runner.notification.a q(org.junit.runner.notification.a aVar) {
        if (!aVar.getClass().isAnnotationPresent(a.InterfaceC0533a.class)) {
            return new org.junit.runner.notification.c(aVar, this);
        }
        return aVar;
    }
}
