package org.junit.experimental.theories.internal;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;

/* loaded from: classes2.dex */
public class d extends org.junit.experimental.theories.e {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f55544a;

    public d(Class<?> cls) {
        this.f55544a = cls;
    }

    @Override // org.junit.experimental.theories.e
    public List<PotentialAssignment> a(org.junit.experimental.theories.d dVar) {
        Object[] enumConstants = this.f55544a.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(PotentialAssignment.a(obj.toString(), obj));
        }
        return arrayList;
    }
}
