package junit.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, f> {

    /* renamed from: E, reason: collision with root package name */
    private static final long f51495E = 1;

    /* renamed from: F, reason: collision with root package name */
    private static final JUnit4TestAdapterCache f51496F = new JUnit4TestAdapterCache();

    /* loaded from: classes2.dex */
    class a extends org.junit.runner.notification.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f51497a;

        a(j jVar) {
            this.f51497a = jVar;
        }

        @Override // org.junit.runner.notification.a
        public void b(Failure failure) throws Exception {
            this.f51497a.a(JUnit4TestAdapterCache.this.a(failure.a()), failure.b());
        }

        @Override // org.junit.runner.notification.a
        public void c(Description description) throws Exception {
            this.f51497a.e(JUnit4TestAdapterCache.this.a(description));
        }

        @Override // org.junit.runner.notification.a
        public void g(Description description) throws Exception {
            this.f51497a.o(JUnit4TestAdapterCache.this.a(description));
        }
    }

    public static JUnit4TestAdapterCache i() {
        return f51496F;
    }

    public f a(Description description) {
        if (description.t()) {
            return h(description);
        }
        if (!containsKey(description)) {
            put(description, h(description));
        }
        return get(description);
    }

    public List<f> e(Description description) {
        if (description.u()) {
            return Arrays.asList(a(description));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = description.n().iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    f h(Description description) {
        if (description.u()) {
            return new d(description);
        }
        k kVar = new k(description.p());
        Iterator<Description> it = description.n().iterator();
        while (it.hasNext()) {
            kVar.a(a(it.next()));
        }
        return kVar;
    }

    public org.junit.runner.notification.b j(j jVar, c cVar) {
        org.junit.runner.notification.b bVar = new org.junit.runner.notification.b();
        bVar.d(new a(jVar));
        return bVar;
    }
}
