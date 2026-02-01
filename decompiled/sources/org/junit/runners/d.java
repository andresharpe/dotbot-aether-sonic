package org.junit.runners;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.j;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.InvalidTestClassError;

/* loaded from: classes2.dex */
public class d extends org.junit.runners.g {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* loaded from: classes2.dex */
    private static class c extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Description f55793a;

        /* renamed from: b, reason: collision with root package name */
        private final AssumptionViolatedException f55794b;

        c(org.junit.runners.model.j jVar, String str, AssumptionViolatedException assumptionViolatedException) {
            this.f55793a = Description.g(jVar.n(), str + "() assumption violation");
            this.f55794b = assumptionViolatedException;
        }

        @Override // org.junit.runner.j, org.junit.runner.b
        public Description a() {
            return this.f55793a;
        }

        @Override // org.junit.runner.j
        public void b(org.junit.runner.notification.b bVar) {
            bVar.e(new Failure(this.f55793a, this.f55794b));
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.junit.runners.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public @interface InterfaceC0536d {
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface e {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface f {
        String name() default "{index}";
    }

    /* loaded from: classes2.dex */
    private static class g {

        /* renamed from: f, reason: collision with root package name */
        private static final org.junit.runners.parameterized.c f55795f = new org.junit.runners.parameterized.b();

        /* renamed from: a, reason: collision with root package name */
        private final org.junit.runners.model.j f55796a;

        /* renamed from: b, reason: collision with root package name */
        private final org.junit.runners.model.d f55797b;

        /* renamed from: c, reason: collision with root package name */
        private final List<Object> f55798c;

        /* renamed from: d, reason: collision with root package name */
        private final int f55799d;

        /* renamed from: e, reason: collision with root package name */
        private final j f55800e;

        private static List<Object> c(org.junit.runners.model.j jVar, org.junit.runners.model.d dVar) throws Throwable {
            Object p4 = dVar.p(null, new Object[0]);
            if (p4 instanceof List) {
                return (List) p4;
            }
            if (p4 instanceof Collection) {
                return new ArrayList((Collection) p4);
            }
            if (p4 instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) p4).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return arrayList;
            }
            if (p4 instanceof Object[]) {
                return Arrays.asList((Object[]) p4);
            }
            throw l(jVar, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<j> d() throws Exception {
            j jVar = this.f55800e;
            if (jVar != null) {
                return Collections.singletonList(jVar);
            }
            return Collections.unmodifiableList(e(this.f55798c, ((f) this.f55797b.a(f.class)).name(), j()));
        }

        private List<j> e(Iterable<Object> iterable, String str, org.junit.runners.parameterized.c cVar) throws Exception {
            try {
                List<org.junit.runners.parameterized.d> h4 = h(iterable, str);
                ArrayList arrayList = new ArrayList();
                Iterator<org.junit.runners.parameterized.d> it = h4.iterator();
                while (it.hasNext()) {
                    arrayList.add(cVar.a(it.next()));
                }
                return arrayList;
            } catch (ClassCastException unused) {
                throw l(this.f55796a, this.f55797b);
            }
        }

        private org.junit.runners.parameterized.d f(String str, int i4, Object obj) {
            return g(this.f55796a, str, i4, k(obj));
        }

        private org.junit.runners.parameterized.d g(org.junit.runners.model.j jVar, String str, int i4, Object[] objArr) {
            return new org.junit.runners.parameterized.d("[" + MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i4)), objArr) + "]", jVar, Arrays.asList(objArr));
        }

        private List<org.junit.runners.parameterized.d> h(Iterable<Object> iterable, String str) throws Exception {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = iterable.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                arrayList.add(f(str, i4, it.next()));
                i4++;
            }
            return arrayList;
        }

        private static org.junit.runners.model.d i(org.junit.runners.model.j jVar) throws Exception {
            for (org.junit.runners.model.d dVar : jVar.m(f.class)) {
                if (dVar.k() && dVar.h()) {
                    return dVar;
                }
            }
            throw new Exception("No public static parameters method on class " + jVar.o());
        }

        private org.junit.runners.parameterized.c j() throws InstantiationException, IllegalAccessException {
            h hVar = (h) this.f55796a.a(h.class);
            if (hVar == null) {
                return f55795f;
            }
            return hVar.value().newInstance();
        }

        private static Object[] k(Object obj) {
            if (obj instanceof Object[]) {
                return (Object[]) obj;
            }
            return new Object[]{obj};
        }

        private static Exception l(org.junit.runners.model.j jVar, org.junit.runners.model.d dVar) throws Exception {
            return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", jVar.o(), dVar.d()));
        }

        private g(Class<?> cls) throws Throwable {
            List<Object> list;
            c cVar;
            org.junit.runners.model.j jVar = new org.junit.runners.model.j(cls);
            this.f55796a = jVar;
            org.junit.runners.model.d i4 = i(jVar);
            this.f55797b = i4;
            try {
                list = c(jVar, i4);
                cVar = null;
            } catch (AssumptionViolatedException e4) {
                List<Object> emptyList = Collections.emptyList();
                c cVar2 = new c(this.f55796a, this.f55797b.d(), e4);
                list = emptyList;
                cVar = cVar2;
            }
            this.f55798c = list;
            this.f55800e = cVar;
            this.f55799d = list.isEmpty() ? 0 : k(list.get(0)).length;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface h {
        Class<? extends org.junit.runners.parameterized.c> value() default org.junit.runners.parameterized.b.class;
    }

    public d(Class<?> cls) throws Throwable {
        this(cls, new g(cls));
    }

    private void N(Integer num) throws InvalidTestClassError {
        ArrayList arrayList = new ArrayList();
        O(InterfaceC0536d.class, num, arrayList);
        O(b.class, num, arrayList);
        if (arrayList.isEmpty()) {
        } else {
            throw new InvalidTestClassError(u().n(), arrayList);
        }
    }

    private void O(Class<? extends Annotation> cls, Integer num, List<Throwable> list) {
        int length;
        for (org.junit.runners.model.d dVar : u().m(cls)) {
            dVar.t(true, list);
            if (num != null && (length = dVar.m().getParameterTypes().length) != 0 && length != num.intValue()) {
                list.add(new Exception("Method " + dVar.d() + "() should have 0 or " + num + " parameter(s)"));
            }
        }
    }

    private d(Class<?> cls, g gVar) throws Exception {
        super(cls, (List<j>) gVar.d());
        N(Integer.valueOf(gVar.f55799d));
    }
}
