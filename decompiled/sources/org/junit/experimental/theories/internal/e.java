package org.junit.experimental.theories.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public class e extends a {
    public e(j jVar) {
        super(jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.a
    public Collection<Field> j(org.junit.experimental.theories.d dVar) {
        Collection<Field> j4 = super.j(dVar);
        String value = ((org.junit.experimental.theories.c) dVar.g(org.junit.experimental.theories.c.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : j4) {
            if (Arrays.asList(((org.junit.experimental.theories.b) field.getAnnotation(org.junit.experimental.theories.b.class)).value()).contains(value)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.a
    public Collection<org.junit.runners.model.d> k(org.junit.experimental.theories.d dVar) {
        Collection<org.junit.runners.model.d> k4 = super.k(dVar);
        String value = ((org.junit.experimental.theories.c) dVar.g(org.junit.experimental.theories.c.class)).value();
        ArrayList arrayList = new ArrayList();
        for (org.junit.runners.model.d dVar2 : k4) {
            if (Arrays.asList(((org.junit.experimental.theories.b) dVar2.a(org.junit.experimental.theories.b.class)).value()).contains(value)) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.a
    public Collection<Field> l(org.junit.experimental.theories.d dVar) {
        Collection<Field> l4 = super.l(dVar);
        String value = ((org.junit.experimental.theories.c) dVar.g(org.junit.experimental.theories.c.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : l4) {
            if (Arrays.asList(((org.junit.experimental.theories.a) field.getAnnotation(org.junit.experimental.theories.a.class)).value()).contains(value)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.experimental.theories.internal.a
    public Collection<org.junit.runners.model.d> m(org.junit.experimental.theories.d dVar) {
        Collection<org.junit.runners.model.d> m4 = super.m(dVar);
        String value = ((org.junit.experimental.theories.c) dVar.g(org.junit.experimental.theories.c.class)).value();
        ArrayList arrayList = new ArrayList();
        for (org.junit.runners.model.d dVar2 : m4) {
            if (Arrays.asList(((org.junit.experimental.theories.a) dVar2.a(org.junit.experimental.theories.a.class)).value()).contains(value)) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }
}
