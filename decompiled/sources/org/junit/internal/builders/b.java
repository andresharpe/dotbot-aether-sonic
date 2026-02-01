package org.junit.internal.builders;

import java.lang.reflect.Modifier;
import org.junit.runner.i;
import org.junit.runner.j;
import org.junit.runners.model.InitializationError;

/* loaded from: classes2.dex */
public class b extends org.junit.runners.model.g {

    /* renamed from: c, reason: collision with root package name */
    private static final String f55555c = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";

    /* renamed from: b, reason: collision with root package name */
    private final org.junit.runners.model.g f55556b;

    public b(org.junit.runners.model.g gVar) {
        this.f55556b = gVar;
    }

    private Class<?> j(Class<?> cls) {
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            return cls.getEnclosingClass();
        }
        return null;
    }

    @Override // org.junit.runners.model.g
    public j d(Class<?> cls) throws Exception {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            i iVar = (i) cls2.getAnnotation(i.class);
            if (iVar != null) {
                return i(iVar.value(), cls);
            }
            cls2 = j(cls2);
        }
        return null;
    }

    public j i(Class<? extends j> cls, Class<?> cls2) throws Exception {
        try {
            return cls.getConstructor(Class.class).newInstance(cls2);
        } catch (NoSuchMethodException unused) {
            try {
                return cls.getConstructor(Class.class, org.junit.runners.model.g.class).newInstance(cls2, this.f55556b);
            } catch (NoSuchMethodException unused2) {
                String simpleName = cls.getSimpleName();
                throw new InitializationError(String.format(f55555c, simpleName, simpleName));
            }
        }
    }
}
