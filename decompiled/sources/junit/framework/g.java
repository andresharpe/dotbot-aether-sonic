package junit.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public abstract class g extends a implements f {

    /* renamed from: a, reason: collision with root package name */
    private String f51511a;

    public g() {
        this.f51511a = null;
    }

    public static void A(Object obj, Object obj2) {
        a.A(obj, obj2);
    }

    public static void B(String str, Object obj, Object obj2) {
        a.B(str, obj, obj2);
    }

    public static void C(Object obj) {
        a.C(obj);
    }

    public static void D(String str, Object obj) {
        a.D(str, obj);
    }

    public static void E(Object obj, Object obj2) {
        a.E(obj, obj2);
    }

    public static void F(String str, Object obj, Object obj2) {
        a.F(str, obj, obj2);
    }

    public static void G(String str, boolean z3) {
        a.G(str, z3);
    }

    public static void H(boolean z3) {
        a.H(z3);
    }

    public static void I() {
        a.I();
    }

    public static void J(String str) {
        a.J(str);
    }

    public static void K(String str, Object obj, Object obj2) {
        a.K(str, obj, obj2);
    }

    public static void L(String str, Object obj, Object obj2) {
        a.L(str, obj, obj2);
    }

    public static void M(String str) {
        a.M(str);
    }

    public static String N(String str, Object obj, Object obj2) {
        return a.N(str, obj, obj2);
    }

    public static void a(byte b4, byte b5) {
        a.a(b4, b5);
    }

    public static void c(char c4, char c5) {
        a.c(c4, c5);
    }

    public static void e(double d4, double d5, double d6) {
        a.e(d4, d5, d6);
    }

    public static void f(float f4, float f5, float f6) {
        a.f(f4, f5, f6);
    }

    public static void g(int i4, int i5) {
        a.g(i4, i5);
    }

    public static void h(long j4, long j5) {
        a.h(j4, j5);
    }

    public static void i(Object obj, Object obj2) {
        a.i(obj, obj2);
    }

    public static void j(String str, byte b4, byte b5) {
        a.j(str, b4, b5);
    }

    public static void k(String str, char c4, char c5) {
        a.k(str, c4, c5);
    }

    public static void l(String str, double d4, double d5, double d6) {
        a.l(str, d4, d5, d6);
    }

    public static void m(String str, float f4, float f5, float f6) {
        a.m(str, f4, f5, f6);
    }

    public static void n(String str, int i4, int i5) {
        a.n(str, i4, i5);
    }

    public static void o(String str, long j4, long j5) {
        a.o(str, j4, j5);
    }

    public static void p(String str, Object obj, Object obj2) {
        a.p(str, obj, obj2);
    }

    public static void q(String str, String str2) {
        a.q(str, str2);
    }

    public static void r(String str, String str2, String str3) {
        a.r(str, str2, str3);
    }

    public static void s(String str, short s4, short s5) {
        a.s(str, s4, s5);
    }

    public static void t(String str, boolean z3, boolean z4) {
        a.t(str, z3, z4);
    }

    public static void u(short s4, short s5) {
        a.u(s4, s5);
    }

    public static void v(boolean z3, boolean z4) {
        a.v(z3, z4);
    }

    public static void w(String str, boolean z3) {
        a.w(str, z3);
    }

    public static void x(boolean z3) {
        a.x(z3);
    }

    public static void y(Object obj) {
        a.y(obj);
    }

    public static void z(String str, Object obj) {
        a.z(str, obj);
    }

    protected j O() {
        return new j();
    }

    public String P() {
        return this.f51511a;
    }

    public j Q() {
        j O3 = O();
        d(O3);
        return O3;
    }

    public void R() throws Throwable {
        U();
        try {
            S();
            try {
                V();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                V();
            } catch (Throwable unused) {
            }
        }
        if (th == null) {
        } else {
            throw th;
        }
    }

    protected void S() throws Throwable {
        z("TestCase.fName cannot be null", this.f51511a);
        Method method = null;
        try {
            method = getClass().getMethod(this.f51511a, null);
        } catch (NoSuchMethodException unused) {
            J("Method \"" + this.f51511a + "\" not found");
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            J("Method \"" + this.f51511a + "\" should be public");
        }
        try {
            method.invoke(this, new Object[0]);
        } catch (IllegalAccessException e4) {
            e4.fillInStackTrace();
            throw e4;
        } catch (InvocationTargetException e5) {
            e5.fillInStackTrace();
            throw e5.getTargetException();
        }
    }

    public void T(String str) {
        this.f51511a = str;
    }

    protected void U() throws Exception {
    }

    protected void V() throws Exception {
    }

    @Override // junit.framework.f
    public int b() {
        return 1;
    }

    @Override // junit.framework.f
    public void d(j jVar) {
        jVar.k(this);
    }

    public String toString() {
        return P() + "(" + getClass().getName() + ")";
    }

    public g(String str) {
        this.f51511a = str;
    }
}
