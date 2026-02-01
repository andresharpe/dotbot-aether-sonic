package org.junit.internal.runners.model;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public abstract class b {
    public Object a() throws Throwable {
        try {
            return b();
        } catch (InvocationTargetException e4) {
            throw e4.getTargetException();
        }
    }

    protected abstract Object b() throws Throwable;
}
