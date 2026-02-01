package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Y;
import kotlin.jvm.internal.F;

@W2.i(name = "ConsoleKt")
/* loaded from: classes2.dex */
public final class c {
    @kotlin.internal.f
    private static final void a(byte b4) {
        System.out.print(Byte.valueOf(b4));
    }

    @kotlin.internal.f
    private static final void b(char c4) {
        System.out.print(c4);
    }

    @kotlin.internal.f
    private static final void c(double d4) {
        System.out.print(d4);
    }

    @kotlin.internal.f
    private static final void d(float f4) {
        System.out.print(f4);
    }

    @kotlin.internal.f
    private static final void e(int i4) {
        System.out.print(i4);
    }

    @kotlin.internal.f
    private static final void f(long j4) {
        System.out.print(j4);
    }

    @kotlin.internal.f
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @kotlin.internal.f
    private static final void h(short s4) {
        System.out.print(Short.valueOf(s4));
    }

    @kotlin.internal.f
    private static final void i(boolean z3) {
        System.out.print(z3);
    }

    @kotlin.internal.f
    private static final void j(char[] message) {
        F.p(message, "message");
        System.out.print(message);
    }

    @kotlin.internal.f
    private static final void k() {
        System.out.println();
    }

    @kotlin.internal.f
    private static final void l(byte b4) {
        System.out.println(Byte.valueOf(b4));
    }

    @kotlin.internal.f
    private static final void m(char c4) {
        System.out.println(c4);
    }

    @kotlin.internal.f
    private static final void n(double d4) {
        System.out.println(d4);
    }

    @kotlin.internal.f
    private static final void o(float f4) {
        System.out.println(f4);
    }

    @kotlin.internal.f
    private static final void p(int i4) {
        System.out.println(i4);
    }

    @kotlin.internal.f
    private static final void q(long j4) {
        System.out.println(j4);
    }

    @kotlin.internal.f
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @kotlin.internal.f
    private static final void s(short s4) {
        System.out.println(Short.valueOf(s4));
    }

    @kotlin.internal.f
    private static final void t(boolean z3) {
        System.out.println(z3);
    }

    @kotlin.internal.f
    private static final void u(char[] message) {
        F.p(message, "message");
        System.out.println(message);
    }

    @l3.e
    public static final String v() {
        n nVar = n.f52168a;
        InputStream in = System.in;
        F.o(in, "in");
        Charset defaultCharset = Charset.defaultCharset();
        F.o(defaultCharset, "defaultCharset(...)");
        return nVar.d(in, defaultCharset);
    }

    @l3.d
    @Y(version = "1.6")
    public static final String w() {
        String x3 = x();
        if (x3 != null) {
            return x3;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @l3.e
    @Y(version = "1.6")
    public static final String x() {
        return v();
    }
}
