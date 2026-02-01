package org.junit;

import java.util.Arrays;
import org.hamcrest.k;

/* loaded from: classes2.dex */
public class d {
    @Deprecated
    public d() {
    }

    public static void a(String str, boolean z3) {
        h(str, !z3);
    }

    public static void b(boolean z3) {
        f(Boolean.valueOf(z3), org.hamcrest.d.E(Boolean.FALSE));
    }

    public static void c(String str, Throwable th) {
        g(str, th, org.hamcrest.d.L());
    }

    public static void d(Throwable th) {
        f(th, org.hamcrest.d.L());
    }

    public static void e(Object... objArr) {
        f(objArr, org.hamcrest.d.J());
        f(Arrays.asList(objArr), org.hamcrest.d.x(org.hamcrest.d.J()));
    }

    public static <T> void f(T t3, k<T> kVar) {
        if (kVar.c(t3)) {
        } else {
            throw new AssumptionViolatedException(t3, kVar);
        }
    }

    public static <T> void g(String str, T t3, k<T> kVar) {
        if (kVar.c(t3)) {
        } else {
            throw new AssumptionViolatedException(str, t3, kVar);
        }
    }

    public static void h(String str, boolean z3) {
        if (z3) {
        } else {
            throw new AssumptionViolatedException(str);
        }
    }

    public static void i(boolean z3) {
        f(Boolean.valueOf(z3), org.hamcrest.d.E(Boolean.TRUE));
    }
}
