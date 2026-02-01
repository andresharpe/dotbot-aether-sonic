package org.junit;

import org.hamcrest.k;
import org.hamcrest.l;
import org.junit.internal.ArrayComparisonFailure;

/* loaded from: classes2.dex */
public class c {
    protected c() {
    }

    public static void A(String str, long j4, long j5) {
        if (j4 != j5) {
            i0(str, Long.valueOf(j4), Long.valueOf(j5));
        }
    }

    public static void B(String str, Object obj, Object obj2) {
        if (e0(obj, obj2)) {
            return;
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (str == null) {
                str = "";
            }
            throw new ComparisonFailure(str, (String) obj, (String) obj2);
        }
        i0(str, obj, obj2);
    }

    @Deprecated
    public static void C(String str, Object[] objArr, Object[] objArr2) {
        g(str, objArr, objArr2);
    }

    @Deprecated
    public static void D(Object[] objArr, Object[] objArr2) {
        p(objArr, objArr2);
    }

    public static void E(String str, boolean z3) {
        a0(str, !z3);
    }

    public static void F(boolean z3) {
        E(null, z3);
    }

    public static void G(double d4, double d5, double d6) {
        K(null, d4, d5, d6);
    }

    public static void H(float f4, float f5, float f6) {
        L(null, f4, f5, f6);
    }

    public static void I(long j4, long j5) {
        M(null, j4, j5);
    }

    public static void J(Object obj, Object obj2) {
        N(null, obj, obj2);
    }

    public static void K(String str, double d4, double d5, double d6) {
        if (!d0(d4, d5, d6)) {
            h0(str, Double.valueOf(d5));
        }
    }

    public static void L(String str, float f4, float f5, float f6) {
        if (!m0(f4, f5, f6)) {
            h0(str, Float.valueOf(f5));
        }
    }

    public static void M(String str, long j4, long j5) {
        if (j4 == j5) {
            h0(str, Long.valueOf(j5));
        }
    }

    public static void N(String str, Object obj, Object obj2) {
        if (e0(obj, obj2)) {
            h0(str, obj2);
        }
    }

    public static void O(Object obj) {
        P(null, obj);
    }

    public static void P(String str, Object obj) {
        boolean z3;
        if (obj != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a0(str, z3);
    }

    public static void Q(Object obj, Object obj2) {
        R(null, obj, obj2);
    }

    public static void R(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            l0(str);
        }
    }

    public static void S(Object obj) {
        T(null, obj);
    }

    public static void T(String str, Object obj) {
        if (obj == null) {
            return;
        }
        j0(str, obj);
    }

    public static void U(Object obj, Object obj2) {
        V(null, obj, obj2);
    }

    public static void V(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        k0(str, obj, obj2);
    }

    @Deprecated
    public static <T> void W(T t3, k<? super T> kVar) {
        X("", t3, kVar);
    }

    @Deprecated
    public static <T> void X(String str, T t3, k<? super T> kVar) {
        l.b(str, t3, kVar);
    }

    public static <T extends Throwable> T Y(Class<T> cls, o3.a aVar) {
        return (T) Z(null, cls, aVar);
    }

    public static <T extends Throwable> T Z(String str, Class<T> cls, o3.a aVar) {
        try {
            aVar.run();
            throw new AssertionError(c0(str) + String.format("expected %s to be thrown, but nothing was thrown", o0(cls)));
        } catch (Throwable th) {
            if (cls.isInstance(th)) {
                return th;
            }
            String o02 = o0(cls);
            Class<?> cls2 = th.getClass();
            String o03 = o0(cls2);
            if (o02.equals(o03)) {
                String str2 = o02 + "@" + Integer.toHexString(System.identityHashCode(cls));
                o03 = o03 + "@" + Integer.toHexString(System.identityHashCode(cls2));
                o02 = str2;
            }
            AssertionError assertionError = new AssertionError(c0(str) + n0("unexpected exception type thrown;", o02, o03));
            assertionError.initCause(th);
            throw assertionError;
        }
    }

    public static void a(String str, byte[] bArr, byte[] bArr2) throws ArrayComparisonFailure {
        q0(str, bArr, bArr2);
    }

    public static void a0(String str, boolean z3) {
        if (!z3) {
            g0(str);
        }
    }

    public static void b(String str, char[] cArr, char[] cArr2) throws ArrayComparisonFailure {
        q0(str, cArr, cArr2);
    }

    public static void b0(boolean z3) {
        a0(null, z3);
    }

    public static void c(String str, double[] dArr, double[] dArr2, double d4) throws ArrayComparisonFailure {
        new org.junit.internal.e(d4).a(str, dArr, dArr2);
    }

    private static String c0(String str) {
        if (str != null && str.length() != 0) {
            return str + ": ";
        }
        return "";
    }

    public static void d(String str, float[] fArr, float[] fArr2, float f4) throws ArrayComparisonFailure {
        new org.junit.internal.e(f4).a(str, fArr, fArr2);
    }

    private static boolean d0(double d4, double d5, double d6) {
        if (Double.compare(d4, d5) == 0 || Math.abs(d4 - d5) <= d6) {
            return false;
        }
        return true;
    }

    public static void e(String str, int[] iArr, int[] iArr2) throws ArrayComparisonFailure {
        q0(str, iArr, iArr2);
    }

    private static boolean e0(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return r0(obj, obj2);
    }

    public static void f(String str, long[] jArr, long[] jArr2) throws ArrayComparisonFailure {
        q0(str, jArr, jArr2);
    }

    public static void f0() {
        g0(null);
    }

    public static void g(String str, Object[] objArr, Object[] objArr2) throws ArrayComparisonFailure {
        q0(str, objArr, objArr2);
    }

    public static void g0(String str) {
        if (str == null) {
            throw new AssertionError();
        }
        throw new AssertionError(str);
    }

    public static void h(String str, short[] sArr, short[] sArr2) throws ArrayComparisonFailure {
        q0(str, sArr, sArr2);
    }

    private static void h0(String str, Object obj) {
        String str2;
        if (str != null) {
            str2 = str + ". ";
        } else {
            str2 = "Values should be different. ";
        }
        g0(str2 + "Actual: " + obj);
    }

    public static void i(String str, boolean[] zArr, boolean[] zArr2) throws ArrayComparisonFailure {
        q0(str, zArr, zArr2);
    }

    private static void i0(String str, Object obj, Object obj2) {
        g0(n0(str, obj, obj2));
    }

    public static void j(byte[] bArr, byte[] bArr2) {
        a(null, bArr, bArr2);
    }

    private static void j0(String str, Object obj) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        g0(str2 + "expected null, but was:<" + obj + ">");
    }

    public static void k(char[] cArr, char[] cArr2) {
        b(null, cArr, cArr2);
    }

    private static void k0(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        g0(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static void l(double[] dArr, double[] dArr2, double d4) {
        c(null, dArr, dArr2, d4);
    }

    private static void l0(String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        g0(str2 + "expected not same");
    }

    public static void m(float[] fArr, float[] fArr2, float f4) {
        d(null, fArr, fArr2, f4);
    }

    private static boolean m0(float f4, float f5, float f6) {
        if (Float.compare(f4, f5) == 0 || Math.abs(f4 - f5) <= f6) {
            return false;
        }
        return true;
    }

    public static void n(int[] iArr, int[] iArr2) {
        e(null, iArr, iArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n0(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && !"".equals(str)) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (e0(valueOf, valueOf2)) {
            return str2 + "expected: " + p0(obj, valueOf) + " but was: " + p0(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    public static void o(long[] jArr, long[] jArr2) {
        f(null, jArr, jArr2);
    }

    private static String o0(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return cls.getName();
        }
        return canonicalName;
    }

    public static void p(Object[] objArr, Object[] objArr2) {
        g(null, objArr, objArr2);
    }

    private static String p0(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        return name + "<" + str + ">";
    }

    public static void q(short[] sArr, short[] sArr2) {
        h(null, sArr, sArr2);
    }

    private static void q0(String str, Object obj, Object obj2) throws ArrayComparisonFailure {
        new org.junit.internal.d().a(str, obj, obj2);
    }

    public static void r(boolean[] zArr, boolean[] zArr2) {
        i(null, zArr, zArr2);
    }

    private static boolean r0(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Deprecated
    public static void s(double d4, double d5) {
        x(null, d4, d5);
    }

    public static void t(double d4, double d5, double d6) {
        y(null, d4, d5, d6);
    }

    public static void u(float f4, float f5, float f6) {
        z(null, f4, f5, f6);
    }

    public static void v(long j4, long j5) {
        A(null, j4, j5);
    }

    public static void w(Object obj, Object obj2) {
        B(null, obj, obj2);
    }

    @Deprecated
    public static void x(String str, double d4, double d5) {
        g0("Use assertEquals(expected, actual, delta) to compare floating-point numbers");
    }

    public static void y(String str, double d4, double d5, double d6) {
        if (d0(d4, d5, d6)) {
            i0(str, Double.valueOf(d4), Double.valueOf(d5));
        }
    }

    public static void z(String str, float f4, float f5, float f6) {
        if (m0(f4, f5, f6)) {
            i0(str, Float.valueOf(f4), Float.valueOf(f5));
        }
    }
}
