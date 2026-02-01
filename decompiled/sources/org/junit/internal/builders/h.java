package org.junit.internal.builders;

import org.junit.runner.j;

/* loaded from: classes2.dex */
public class h extends org.junit.runners.model.g {
    @Override // org.junit.runners.model.g
    public j d(Class<?> cls) throws Throwable {
        if (i(cls)) {
            return new org.junit.internal.runners.h(cls);
        }
        return null;
    }

    public boolean i(Class<?> cls) {
        try {
            cls.getMethod(junit.runner.a.f51524b, new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }
}
