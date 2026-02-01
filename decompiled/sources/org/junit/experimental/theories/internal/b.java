package org.junit.experimental.theories.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.f;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<PotentialAssignment> f55541a;

    /* renamed from: b, reason: collision with root package name */
    private final List<org.junit.experimental.theories.d> f55542b;

    /* renamed from: c, reason: collision with root package name */
    private final j f55543c;

    private b(List<PotentialAssignment> list, List<org.junit.experimental.theories.d> list2, j jVar) {
        this.f55542b = list2;
        this.f55541a = list;
        this.f55543c = jVar;
    }

    public static b a(Method method, j jVar) {
        List<org.junit.experimental.theories.d> o4 = org.junit.experimental.theories.d.o(jVar.p());
        o4.addAll(org.junit.experimental.theories.d.m(method));
        return new b(new ArrayList(), o4, jVar);
    }

    private org.junit.experimental.theories.e c(Class<? extends org.junit.experimental.theories.e> cls) throws Exception {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(j.class)) {
                return (org.junit.experimental.theories.e) constructor.newInstance(this.f55543c);
            }
        }
        return cls.newInstance();
    }

    private List<PotentialAssignment> d(org.junit.experimental.theories.d dVar) {
        Class<?> i4 = dVar.i();
        if (i4.isEnum()) {
            return new d(i4).a(dVar);
        }
        if (!i4.equals(Boolean.class) && !i4.equals(Boolean.TYPE)) {
            return Collections.emptyList();
        }
        return new c().a(dVar);
    }

    private int i() {
        return org.junit.experimental.theories.d.o(this.f55543c.p()).size();
    }

    private org.junit.experimental.theories.e k(org.junit.experimental.theories.d dVar) throws Exception {
        f fVar = (f) dVar.e(f.class);
        if (fVar != null) {
            return c(fVar.value());
        }
        return new a(this.f55543c);
    }

    public b b(PotentialAssignment potentialAssignment) {
        ArrayList arrayList = new ArrayList(this.f55541a);
        arrayList.add(potentialAssignment);
        List<org.junit.experimental.theories.d> list = this.f55542b;
        return new b(arrayList, list.subList(1, list.size()), this.f55543c);
    }

    public Object[] e(int i4, int i5) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] objArr = new Object[i5 - i4];
        for (int i6 = i4; i6 < i5; i6++) {
            objArr[i6 - i4] = this.f55541a.get(i6).c();
        }
        return objArr;
    }

    public Object[] f() throws PotentialAssignment.CouldNotGenerateValueException {
        return e(0, this.f55541a.size());
    }

    public Object[] g(boolean z3) throws PotentialAssignment.CouldNotGenerateValueException {
        int size = this.f55541a.size();
        Object[] objArr = new Object[size];
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = this.f55541a.get(i4).b();
        }
        return objArr;
    }

    public Object[] h() throws PotentialAssignment.CouldNotGenerateValueException {
        return e(0, i());
    }

    public Object[] j() throws PotentialAssignment.CouldNotGenerateValueException {
        return e(i(), this.f55541a.size());
    }

    public boolean l() {
        return this.f55542b.isEmpty();
    }

    public org.junit.experimental.theories.d m() {
        return this.f55542b.get(0);
    }

    public List<PotentialAssignment> n() throws Throwable {
        org.junit.experimental.theories.d m4 = m();
        List<PotentialAssignment> a4 = k(m4).a(m4);
        if (a4.isEmpty()) {
            return d(m4);
        }
        return a4;
    }
}
