package org.junit.runner;

import org.junit.runner.FilterFactory;

/* loaded from: classes2.dex */
class c {
    c() {
    }

    public static org.junit.runner.manipulation.b a(Class<? extends FilterFactory> cls, d dVar) throws FilterFactory.FilterNotCreatedException {
        return c(cls).a(dVar);
    }

    public static org.junit.runner.manipulation.b b(String str, d dVar) throws FilterFactory.FilterNotCreatedException {
        return d(str).a(dVar);
    }

    static FilterFactory c(Class<? extends FilterFactory> cls) throws FilterFactory.FilterNotCreatedException {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e4) {
            throw new FilterFactory.FilterNotCreatedException(e4);
        }
    }

    static FilterFactory d(String str) throws FilterFactory.FilterNotCreatedException {
        try {
            return c(org.junit.internal.b.a(str).asSubclass(FilterFactory.class));
        } catch (Exception e4) {
            throw new FilterFactory.FilterNotCreatedException(e4);
        }
    }

    public static org.junit.runner.manipulation.b e(h hVar, String str) throws FilterFactory.FilterNotCreatedException {
        String[] strArr;
        Description a4 = hVar.h().a();
        if (str.contains("=")) {
            strArr = str.split("=", 2);
        } else {
            strArr = new String[]{str, ""};
        }
        return b(strArr[0], new d(a4, strArr[1]));
    }
}
