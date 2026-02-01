package org.junit.internal.builders;

import org.junit.runner.j;

/* loaded from: classes2.dex */
public class e extends org.junit.runners.model.g {
    @Override // org.junit.runners.model.g
    public j d(Class<?> cls) throws Throwable {
        if (i(cls)) {
            return new org.junit.internal.runners.d(cls);
        }
        return null;
    }

    boolean i(Class<?> cls) {
        return junit.framework.g.class.isAssignableFrom(cls);
    }
}
