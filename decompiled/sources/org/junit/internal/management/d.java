package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55574a;

    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Method f55575a;

        static {
            Method method;
            try {
                method = org.junit.internal.b.a("java.lang.management.RuntimeMXBean").getMethod("getInputArguments", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                method = null;
            }
            f55575a = method;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Object obj) {
        this.f55574a = obj;
    }

    @Override // org.junit.internal.management.f
    public List<String> a() {
        if (a.f55575a != null) {
            try {
                return (List) a.f55575a.invoke(this.f55574a, new Object[0]);
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Collections.emptyList();
    }
}
