package kotlin.jvm.internal;

import Y2.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC2229v;

/* loaded from: classes2.dex */
public class X {
    public static int A(Object obj) {
        if (obj instanceof B) {
            return ((B) obj).g();
        }
        if (obj instanceof X2.a) {
            return 0;
        }
        if (obj instanceof X2.l) {
            return 1;
        }
        if (obj instanceof X2.p) {
            return 2;
        }
        if (obj instanceof X2.q) {
            return 3;
        }
        if (obj instanceof X2.r) {
            return 4;
        }
        if (obj instanceof X2.s) {
            return 5;
        }
        if (obj instanceof X2.t) {
            return 6;
        }
        if (obj instanceof X2.u) {
            return 7;
        }
        if (obj instanceof X2.v) {
            return 8;
        }
        if (obj instanceof X2.w) {
            return 9;
        }
        if (obj instanceof X2.b) {
            return 10;
        }
        if (obj instanceof X2.c) {
            return 11;
        }
        if (obj instanceof X2.d) {
            return 12;
        }
        if (obj instanceof X2.e) {
            return 13;
        }
        if (obj instanceof X2.f) {
            return 14;
        }
        if (obj instanceof X2.g) {
            return 15;
        }
        if (obj instanceof X2.h) {
            return 16;
        }
        if (obj instanceof X2.i) {
            return 17;
        }
        if (obj instanceof X2.j) {
            return 18;
        }
        if (obj instanceof X2.k) {
            return 19;
        }
        if (obj instanceof X2.m) {
            return 20;
        }
        if (obj instanceof X2.n) {
            return 21;
        }
        if (obj instanceof X2.o) {
            return 22;
        }
        return -1;
    }

    public static boolean B(Object obj, int i4) {
        if ((obj instanceof InterfaceC2229v) && A(obj) == i4) {
            return true;
        }
        return false;
    }

    public static boolean C(Object obj) {
        if ((obj instanceof Collection) && (!(obj instanceof Y2.a) || (obj instanceof Y2.b))) {
            return true;
        }
        return false;
    }

    public static boolean D(Object obj) {
        if ((obj instanceof Iterable) && (!(obj instanceof Y2.a) || (obj instanceof Y2.c))) {
            return true;
        }
        return false;
    }

    public static boolean E(Object obj) {
        if ((obj instanceof Iterator) && (!(obj instanceof Y2.a) || (obj instanceof Y2.d))) {
            return true;
        }
        return false;
    }

    public static boolean F(Object obj) {
        if ((obj instanceof List) && (!(obj instanceof Y2.a) || (obj instanceof Y2.e))) {
            return true;
        }
        return false;
    }

    public static boolean G(Object obj) {
        if ((obj instanceof ListIterator) && (!(obj instanceof Y2.a) || (obj instanceof Y2.f))) {
            return true;
        }
        return false;
    }

    public static boolean H(Object obj) {
        if ((obj instanceof Map) && (!(obj instanceof Y2.a) || (obj instanceof Y2.g))) {
            return true;
        }
        return false;
    }

    public static boolean I(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof Y2.a) || (obj instanceof g.a))) {
            return true;
        }
        return false;
    }

    public static boolean J(Object obj) {
        if ((obj instanceof Set) && (!(obj instanceof Y2.a) || (obj instanceof Y2.h))) {
            return true;
        }
        return false;
    }

    private static <T extends Throwable> T K(T t3) {
        return (T) F.B(t3, X.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        N(name + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.b)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.b)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.c)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.c)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.d)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.d)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.e)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.e)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.f)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.f)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.g)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.g)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof g.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof g.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.h)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof Y2.a) && !(obj instanceof Y2.h)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i4) {
        if (obj != null && !B(obj, i4)) {
            M(obj, "kotlin.jvm.functions.Function" + i4);
        }
        return obj;
    }

    public static Object r(Object obj, int i4, String str) {
        if (obj != null && !B(obj, i4)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e4) {
            throw L(e4);
        }
    }
}
