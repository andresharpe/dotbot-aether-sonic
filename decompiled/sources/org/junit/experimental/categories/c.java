package org.junit.experimental.categories;

import java.util.ArrayList;
import java.util.List;
import org.junit.runner.FilterFactory;

/* loaded from: classes2.dex */
abstract class c implements FilterFactory {
    private List<Class<?>> c(String str) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            arrayList.add(org.junit.internal.b.b(str2, getClass()));
        }
        return arrayList;
    }

    @Override // org.junit.runner.FilterFactory
    public org.junit.runner.manipulation.b a(org.junit.runner.d dVar) throws FilterFactory.FilterNotCreatedException {
        try {
            return b(c(dVar.a()));
        } catch (ClassNotFoundException e4) {
            throw new FilterFactory.FilterNotCreatedException(e4);
        }
    }

    protected abstract org.junit.runner.manipulation.b b(List<Class<?>> list);
}
