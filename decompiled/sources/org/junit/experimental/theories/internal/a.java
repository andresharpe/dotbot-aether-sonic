package org.junit.experimental.theories.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public class a extends org.junit.experimental.theories.e {

    /* renamed from: a, reason: collision with root package name */
    private final j f55539a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends PotentialAssignment {

        /* renamed from: a, reason: collision with root package name */
        private final org.junit.runners.model.d f55540a;

        @Override // org.junit.experimental.theories.PotentialAssignment
        public String b() throws PotentialAssignment.CouldNotGenerateValueException {
            return this.f55540a.d();
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public Object c() throws PotentialAssignment.CouldNotGenerateValueException {
            boolean z3 = false;
            try {
                return this.f55540a.p(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (Throwable th) {
                org.junit.experimental.theories.a aVar = (org.junit.experimental.theories.a) this.f55540a.a(org.junit.experimental.theories.a.class);
                if (aVar == null || !a.o(aVar.ignoredExceptions(), th)) {
                    z3 = true;
                }
                org.junit.d.i(z3);
                throw new PotentialAssignment.CouldNotGenerateValueException(th);
            }
        }

        private b(org.junit.runners.model.d dVar) {
            this.f55540a = dVar;
        }
    }

    public a(j jVar) {
        this.f55539a = jVar;
    }

    private void c(org.junit.experimental.theories.d dVar, String str, List<PotentialAssignment> list, Object obj) {
        for (int i4 = 0; i4 < Array.getLength(obj); i4++) {
            Object obj2 = Array.get(obj, i4);
            if (dVar.c(obj2)) {
                list.add(PotentialAssignment.a(str + "[" + i4 + "]", obj2));
            }
        }
    }

    private void d(Class<?> cls, org.junit.experimental.theories.d dVar, String str, List<PotentialAssignment> list, Object obj) {
        if (cls.isArray()) {
            c(dVar, str, list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            e(dVar, str, list, (Iterable) obj);
        }
    }

    private void e(org.junit.experimental.theories.d dVar, String str, List<PotentialAssignment> list, Iterable<?> iterable) {
        int i4 = 0;
        for (Object obj : iterable) {
            if (dVar.c(obj)) {
                list.add(PotentialAssignment.a(str + "[" + i4 + "]", obj));
            }
            i4++;
        }
    }

    private void f(org.junit.experimental.theories.d dVar, List<PotentialAssignment> list) {
        for (Field field : j(dVar)) {
            d(field.getType(), dVar, field.getName(), list, n(field));
        }
    }

    private void g(org.junit.experimental.theories.d dVar, List<PotentialAssignment> list) throws Throwable {
        for (org.junit.runners.model.d dVar2 : k(dVar)) {
            Class<?> o4 = dVar2.o();
            if ((o4.isArray() && dVar.d(o4.getComponentType())) || Iterable.class.isAssignableFrom(o4)) {
                try {
                    d(o4, dVar, dVar2.d(), list, dVar2.p(null, new Object[0]));
                } catch (Throwable th) {
                    org.junit.experimental.theories.b bVar = (org.junit.experimental.theories.b) dVar2.a(org.junit.experimental.theories.b.class);
                    if (bVar != null && o(bVar.ignoredExceptions(), th)) {
                        return;
                    } else {
                        throw th;
                    }
                }
            }
        }
    }

    private void h(org.junit.experimental.theories.d dVar, List<PotentialAssignment> list) {
        for (Field field : l(dVar)) {
            Object n4 = n(field);
            if (dVar.c(n4)) {
                list.add(PotentialAssignment.a(field.getName(), n4));
            }
        }
    }

    private void i(org.junit.experimental.theories.d dVar, List<PotentialAssignment> list) {
        for (org.junit.runners.model.d dVar2 : m(dVar)) {
            if (dVar.b(dVar2.e())) {
                list.add(new b(dVar2));
            }
        }
    }

    private Object n(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        } catch (IllegalArgumentException unused2) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(Class<?>[] clsArr, Object obj) {
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.junit.experimental.theories.e
    public List<PotentialAssignment> a(org.junit.experimental.theories.d dVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        h(dVar, arrayList);
        f(dVar, arrayList);
        i(dVar, arrayList);
        g(dVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<Field> j(org.junit.experimental.theories.d dVar) {
        List<org.junit.runners.model.b> h4 = this.f55539a.h(org.junit.experimental.theories.b.class);
        ArrayList arrayList = new ArrayList();
        Iterator<org.junit.runners.model.b> it = h4.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<org.junit.runners.model.d> k(org.junit.experimental.theories.d dVar) {
        return this.f55539a.m(org.junit.experimental.theories.b.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<Field> l(org.junit.experimental.theories.d dVar) {
        List<org.junit.runners.model.b> h4 = this.f55539a.h(org.junit.experimental.theories.a.class);
        ArrayList arrayList = new ArrayList();
        Iterator<org.junit.runners.model.b> it = h4.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<org.junit.runners.model.d> m(org.junit.experimental.theories.d dVar) {
        return this.f55539a.m(org.junit.experimental.theories.a.class);
    }
}
