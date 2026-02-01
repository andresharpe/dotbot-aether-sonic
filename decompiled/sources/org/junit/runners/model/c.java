package org.junit.runners.model;

import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.runners.model.c;

/* loaded from: classes2.dex */
public abstract class c<T extends c<T>> implements a {
    public abstract Class<?> b();

    protected abstract int c();

    public abstract String d();

    public abstract Class<?> e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T f(List<T> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            T t3 = list.get(size);
            if (j(t3)) {
                if (t3.g()) {
                    list.remove(size);
                    return t3;
                }
                return null;
            }
        }
        return this;
    }

    abstract boolean g();

    public boolean h() {
        return Modifier.isPublic(c());
    }

    abstract boolean j(T t3);

    public boolean k() {
        return Modifier.isStatic(c());
    }
}
