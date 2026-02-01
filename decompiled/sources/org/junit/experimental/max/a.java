package org.junit.experimental.max;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.k;
import org.junit.internal.runners.b;
import org.junit.internal.runners.d;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.e;
import org.junit.runner.h;
import org.junit.runner.j;
import org.junit.runners.g;
import org.junit.runners.model.InitializationError;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f55509b = "malformed JUnit 3 test class: ";

    /* renamed from: a, reason: collision with root package name */
    private final MaxHistory f55510a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.junit.experimental.max.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0518a extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f55511a;

        /* renamed from: org.junit.experimental.max.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0519a extends g {
            C0519a(Class cls, List list) {
                super((Class<?>) cls, (List<j>) list);
            }
        }

        C0518a(List list) {
            this.f55511a = list;
        }

        @Override // org.junit.runner.h
        public j h() {
            try {
                return new C0519a(null, this.f55511a);
            } catch (InitializationError e4) {
                return new b((Class<?>) null, e4);
            }
        }
    }

    private a(File file) {
        this.f55510a = MaxHistory.b(file);
    }

    private j a(Description description) {
        if (description.toString().equals("TestSuite with 0 tests")) {
            return g.K();
        }
        if (description.toString().startsWith(f55509b)) {
            return new d(new k(f(description)));
        }
        Class<?> r4 = description.r();
        if (r4 != null) {
            String q4 = description.q();
            if (q4 == null) {
                return h.a(r4).h();
            }
            return h.i(r4, q4).h();
        }
        throw new RuntimeException("Can't build a runner from description [" + description + "]");
    }

    private h b(List<Description> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new C0518a(arrayList);
    }

    private List<Description> c(h hVar) {
        ArrayList arrayList = new ArrayList();
        d(null, hVar.h().a(), arrayList);
        return arrayList;
    }

    private void d(Description description, Description description2, List<Description> list) {
        if (description2.n().isEmpty()) {
            if (description2.toString().equals("warning(junit.framework.TestSuite$1)")) {
                list.add(Description.f(f55509b + description, new Annotation[0]));
                return;
            }
            list.add(description2);
            return;
        }
        Iterator<Description> it = description2.n().iterator();
        while (it.hasNext()) {
            d(description2, it.next(), list);
        }
    }

    @Deprecated
    public static a e(String str) {
        return l(new File(str));
    }

    private Class<?> f(Description description) {
        try {
            return Class.forName(description.toString().replace(f55509b, ""));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static a l(File file) {
        return new a(file);
    }

    public Result g(Class<?> cls) {
        return h(h.a(cls));
    }

    public Result h(h hVar) {
        return i(hVar, new e());
    }

    public Result i(h hVar, e eVar) {
        eVar.a(this.f55510a.f());
        return eVar.i(j(hVar).h());
    }

    public h j(h hVar) {
        if (hVar instanceof org.junit.internal.requests.e) {
            return hVar;
        }
        List<Description> c4 = c(hVar);
        Collections.sort(c4, this.f55510a.k());
        return b(c4);
    }

    public List<Description> k(h hVar) {
        return c(j(hVar));
    }
}
