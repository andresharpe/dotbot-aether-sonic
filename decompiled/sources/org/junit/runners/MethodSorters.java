package org.junit.runners;

import java.lang.reflect.Method;
import java.util.Comparator;

/* loaded from: classes2.dex */
public enum MethodSorters {
    NAME_ASCENDING(org.junit.internal.g.f55562b),
    JVM(null),
    DEFAULT(org.junit.internal.g.f55561a);

    private final Comparator<Method> comparator;

    MethodSorters(Comparator comparator) {
        this.comparator = comparator;
    }

    public Comparator<Method> b() {
        return this.comparator;
    }
}
