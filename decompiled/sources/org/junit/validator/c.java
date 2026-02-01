package org.junit.validator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public final class c implements org.junit.validator.e {

    /* renamed from: a, reason: collision with root package name */
    private static final List<b<?>> f55862a;

    /* loaded from: classes2.dex */
    private static abstract class b<T extends org.junit.runners.model.a> {

        /* renamed from: a, reason: collision with root package name */
        private static final org.junit.validator.b f55863a = new org.junit.validator.b();

        private b() {
        }

        private List<Exception> b(T t3) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : t3.i()) {
                f fVar = (f) annotation.annotationType().getAnnotation(f.class);
                if (fVar != null) {
                    arrayList.addAll(c(f55863a.a(fVar), t3));
                }
            }
            return arrayList;
        }

        abstract Iterable<T> a(j jVar);

        abstract List<Exception> c(org.junit.validator.a aVar, T t3);

        public List<Exception> d(j jVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a(jVar).iterator();
            while (it.hasNext()) {
                arrayList.addAll(b(it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: org.junit.validator.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0539c extends b<j> {
        private C0539c() {
            super();
        }

        @Override // org.junit.validator.c.b
        Iterable<j> a(j jVar) {
            return Collections.singletonList(jVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.junit.validator.c.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Exception> c(org.junit.validator.a aVar, j jVar) {
            return aVar.a(jVar);
        }
    }

    /* loaded from: classes2.dex */
    private static class d extends b<org.junit.runners.model.b> {
        private d() {
            super();
        }

        @Override // org.junit.validator.c.b
        Iterable<org.junit.runners.model.b> a(j jVar) {
            return jVar.g();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.junit.validator.c.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Exception> c(org.junit.validator.a aVar, org.junit.runners.model.b bVar) {
            return aVar.b(bVar);
        }
    }

    /* loaded from: classes2.dex */
    private static class e extends b<org.junit.runners.model.d> {
        private e() {
            super();
        }

        @Override // org.junit.validator.c.b
        Iterable<org.junit.runners.model.d> a(j jVar) {
            return jVar.l();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.junit.validator.c.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Exception> c(org.junit.validator.a aVar, org.junit.runners.model.d dVar) {
            return aVar.c(dVar);
        }
    }

    static {
        f55862a = Arrays.asList(new C0539c(), new e(), new d());
    }

    @Override // org.junit.validator.e
    public List<Exception> a(j jVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<b<?>> it = f55862a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().d(jVar));
        }
        return arrayList;
    }
}
