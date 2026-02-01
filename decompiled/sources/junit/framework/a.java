package junit.framework;

@Deprecated
/* loaded from: classes2.dex */
public class a {
    public static void A(Object obj, Object obj2) {
        B(null, obj, obj2);
    }

    public static void B(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            M(str);
        }
    }

    public static void C(Object obj) {
        if (obj != null) {
            D("Expected: <null> but was: " + obj.toString(), obj);
        }
    }

    public static void D(String str, Object obj) {
        boolean z3;
        if (obj == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        G(str, z3);
    }

    public static void E(Object obj, Object obj2) {
        F(null, obj, obj2);
    }

    public static void F(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        L(str, obj, obj2);
    }

    public static void G(String str, boolean z3) {
        if (!z3) {
            J(str);
        }
    }

    public static void H(boolean z3) {
        G(null, z3);
    }

    public static void I() {
        J(null);
    }

    public static void J(String str) {
        if (str == null) {
            throw new AssertionFailedError();
        }
        throw new AssertionFailedError(str);
    }

    public static void K(String str, Object obj, Object obj2) {
        J(N(str, obj, obj2));
    }

    public static void L(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        J(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void M(String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        J(str2 + "expected not same");
    }

    public static String N(String str, Object obj, Object obj2) {
        String str2;
        if (str != null && str.length() > 0) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        return str2 + "expected:<" + obj + "> but was:<" + obj2 + ">";
    }

    public static void a(byte b4, byte b5) {
        j(null, b4, b5);
    }

    public static void c(char c4, char c5) {
        k(null, c4, c5);
    }

    public static void e(double d4, double d5, double d6) {
        l(null, d4, d5, d6);
    }

    public static void f(float f4, float f5, float f6) {
        m(null, f4, f5, f6);
    }

    public static void g(int i4, int i5) {
        n(null, i4, i5);
    }

    public static void h(long j4, long j5) {
        o(null, j4, j5);
    }

    public static void i(Object obj, Object obj2) {
        p(null, obj, obj2);
    }

    public static void j(String str, byte b4, byte b5) {
        p(str, Byte.valueOf(b4), Byte.valueOf(b5));
    }

    public static void k(String str, char c4, char c5) {
        p(str, Character.valueOf(c4), Character.valueOf(c5));
    }

    public static void l(String str, double d4, double d5, double d6) {
        if (Double.compare(d4, d5) != 0 && Math.abs(d4 - d5) > d6) {
            K(str, Double.valueOf(d4), Double.valueOf(d5));
        }
    }

    public static void m(String str, float f4, float f5, float f6) {
        if (Float.compare(f4, f5) != 0 && Math.abs(f4 - f5) > f6) {
            K(str, Float.valueOf(f4), Float.valueOf(f5));
        }
    }

    public static void n(String str, int i4, int i5) {
        p(str, Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static void o(String str, long j4, long j5) {
        p(str, Long.valueOf(j4), Long.valueOf(j5));
    }

    public static void p(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj != null && obj.equals(obj2)) {
            return;
        }
        K(str, obj, obj2);
    }

    public static void q(String str, String str2) {
        r(null, str, str2);
    }

    public static void r(String str, String str2, String str3) {
        if (str2 == null && str3 == null) {
            return;
        }
        if (str2 != null && str2.equals(str3)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        throw new ComparisonFailure(str, str2, str3);
    }

    public static void s(String str, short s4, short s5) {
        p(str, Short.valueOf(s4), Short.valueOf(s5));
    }

    public static void t(String str, boolean z3, boolean z4) {
        p(str, Boolean.valueOf(z3), Boolean.valueOf(z4));
    }

    public static void u(short s4, short s5) {
        s(null, s4, s5);
    }

    public static void v(boolean z3, boolean z4) {
        t(null, z3, z4);
    }

    public static void w(String str, boolean z3) {
        G(str, !z3);
    }

    public static void x(boolean z3) {
        w(null, z3);
    }

    public static void y(Object obj) {
        z(null, obj);
    }

    public static void z(String str, Object obj) {
        boolean z3;
        if (obj != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        G(str, z3);
    }
}
