package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import junit.framework.AssertionFailedError;
import junit.framework.k;
import org.junit.runner.Description;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
public class d extends org.junit.runner.j implements org.junit.runner.manipulation.c, org.junit.runner.manipulation.d {

    /* renamed from: a, reason: collision with root package name */
    private volatile junit.framework.f f55605a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b implements junit.framework.i {

        /* renamed from: a, reason: collision with root package name */
        private final org.junit.runner.notification.b f55606a;

        private Description e(junit.framework.f fVar) {
            if (fVar instanceof org.junit.runner.b) {
                return ((org.junit.runner.b) fVar).a();
            }
            return Description.g(f(fVar), g(fVar));
        }

        private Class<? extends junit.framework.f> f(junit.framework.f fVar) {
            return fVar.getClass();
        }

        private String g(junit.framework.f fVar) {
            if (fVar instanceof junit.framework.g) {
                return ((junit.framework.g) fVar).P();
            }
            return fVar.toString();
        }

        @Override // junit.framework.i
        public void a(junit.framework.f fVar, Throwable th) {
            this.f55606a.f(new Failure(e(fVar), th));
        }

        @Override // junit.framework.i
        public void b(junit.framework.f fVar, AssertionFailedError assertionFailedError) {
            a(fVar, assertionFailedError);
        }

        @Override // junit.framework.i
        public void c(junit.framework.f fVar) {
            this.f55606a.h(e(fVar));
        }

        @Override // junit.framework.i
        public void d(junit.framework.f fVar) {
            this.f55606a.l(e(fVar));
        }

        private b(org.junit.runner.notification.b bVar) {
            this.f55606a = bVar;
        }
    }

    public d(Class<?> cls) {
        this(new k(cls.asSubclass(junit.framework.g.class)));
    }

    private static String h(k kVar) {
        String format;
        int b4 = kVar.b();
        if (b4 == 0) {
            format = "";
        } else {
            format = String.format(" [example: %s]", kVar.n(0));
        }
        return String.format("TestSuite with %s tests%s", Integer.valueOf(b4), format);
    }

    private static Annotation[] i(junit.framework.g gVar) {
        try {
            return gVar.getClass().getMethod(gVar.P(), new Class[0]).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private junit.framework.f j() {
        return this.f55605a;
    }

    private static Description k(junit.framework.f fVar) {
        String h4;
        if (fVar instanceof junit.framework.g) {
            junit.framework.g gVar = (junit.framework.g) fVar;
            return Description.h(gVar.getClass(), gVar.P(), i(gVar));
        }
        if (fVar instanceof k) {
            k kVar = (k) fVar;
            if (kVar.h() == null) {
                h4 = h(kVar);
            } else {
                h4 = kVar.h();
            }
            Description f4 = Description.f(h4, new Annotation[0]);
            int p4 = kVar.p();
            for (int i4 = 0; i4 < p4; i4++) {
                f4.a(k(kVar.n(i4)));
            }
            return f4;
        }
        if (fVar instanceof org.junit.runner.b) {
            return ((org.junit.runner.b) fVar).a();
        }
        if (fVar instanceof junit.extensions.c) {
            return k(((junit.extensions.c) fVar).P());
        }
        return Description.c(fVar.getClass());
    }

    private void l(junit.framework.f fVar) {
        this.f55605a = fVar;
    }

    @Override // org.junit.runner.j, org.junit.runner.b
    public Description a() {
        return k(j());
    }

    @Override // org.junit.runner.j
    public void b(org.junit.runner.notification.b bVar) {
        junit.framework.j jVar = new junit.framework.j();
        jVar.c(g(bVar));
        j().d(jVar);
    }

    @Override // org.junit.runner.manipulation.d
    public void c(org.junit.runner.manipulation.e eVar) throws InvalidOrderingException {
        if (j() instanceof org.junit.runner.manipulation.d) {
            ((org.junit.runner.manipulation.d) j()).c(eVar);
        }
    }

    @Override // org.junit.runner.manipulation.c
    public void e(org.junit.runner.manipulation.b bVar) throws NoTestsRemainException {
        if (j() instanceof org.junit.runner.manipulation.c) {
            ((org.junit.runner.manipulation.c) j()).e(bVar);
            return;
        }
        if (j() instanceof k) {
            k kVar = (k) j();
            k kVar2 = new k(kVar.h());
            int p4 = kVar.p();
            for (int i4 = 0; i4 < p4; i4++) {
                junit.framework.f n4 = kVar.n(i4);
                if (bVar.e(k(n4))) {
                    kVar2.a(n4);
                }
            }
            l(kVar2);
            if (kVar2.p() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // org.junit.runner.manipulation.g
    public void f(org.junit.runner.manipulation.h hVar) {
        if (j() instanceof org.junit.runner.manipulation.g) {
            ((org.junit.runner.manipulation.g) j()).f(hVar);
        }
    }

    public junit.framework.i g(org.junit.runner.notification.b bVar) {
        return new b(bVar);
    }

    public d(junit.framework.f fVar) {
        l(fVar);
    }
}
