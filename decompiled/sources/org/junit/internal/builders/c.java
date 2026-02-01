package org.junit.internal.builders;

import org.junit.i;
import org.junit.runner.j;

/* loaded from: classes2.dex */
public class c extends org.junit.runners.model.g {
    @Override // org.junit.runners.model.g
    public j d(Class<?> cls) {
        if (cls.getAnnotation(i.class) != null) {
            return new d(cls);
        }
        return null;
    }
}
