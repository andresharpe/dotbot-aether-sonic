package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public class h extends d {
    public h(Class<?> cls) throws Throwable {
        super(m(cls));
    }

    public static junit.framework.f m(Class<?> cls) throws Throwable {
        try {
            Method method = cls.getMethod(junit.runner.a.f51524b, new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                return (junit.framework.f) method.invoke(null, new Object[0]);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
