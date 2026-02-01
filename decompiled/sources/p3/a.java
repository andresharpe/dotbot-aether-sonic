package p3;

import org.hamcrest.core.c;
import org.hamcrest.d;
import org.hamcrest.k;

/* loaded from: classes2.dex */
public class a {
    @Deprecated
    public static <T> c.a<T> a(k<? super T> kVar) {
        return d.r(kVar);
    }

    @Deprecated
    public static k<String> b(String str) {
        return d.s(str);
    }

    @Deprecated
    public static <T> c.b<T> c(k<? super T> kVar) {
        return d.u(kVar);
    }

    @Deprecated
    public static <T> k<Iterable<T>> d(k<T> kVar) {
        return d.x(kVar);
    }

    @Deprecated
    public static <T> k<Iterable<? super T>> e(T t3) {
        return d.y(t3);
    }

    @Deprecated
    public static <T> k<Iterable<? super T>> f(k<? super T> kVar) {
        return d.z(kVar);
    }

    @Deprecated
    public static <T> k<Iterable<T>> g(T... tArr) {
        return d.A(tArr);
    }

    @Deprecated
    public static <T> k<Iterable<T>> h(k<? super T>... kVarArr) {
        return d.B(kVarArr);
    }

    public static <T extends Exception> k<T> i(k<T> kVar) {
        return org.junit.internal.matchers.a.h(kVar);
    }

    public static <T extends Throwable> k<T> j(k<T> kVar) {
        return org.junit.internal.matchers.a.i(kVar);
    }
}
