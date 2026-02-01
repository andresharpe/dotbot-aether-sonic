package kotlin.text;

import kotlin.D0;
import kotlin.InterfaceC2218t;
import kotlin.Y;
import kotlin.p0;
import kotlin.q0;
import kotlin.t0;
import kotlin.x0;

/* loaded from: classes2.dex */
public final class G {
    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final byte a(String str, C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return p0.l(C2226h.h(str, format));
    }

    static /* synthetic */ byte b(String str, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return p0.l(C2226h.h(str, format));
    }

    @kotlin.r
    @InterfaceC2218t
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final byte[] c(String str, C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return q0.j(C2226h.l(str, format));
    }

    static /* synthetic */ byte[] d(String str, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return q0.j(C2226h.l(str, format));
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final int e(String str, C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return t0.l(C2226h.p(str, format));
    }

    static /* synthetic */ int f(String str, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return t0.l(C2226h.p(str, format));
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final long g(String str, C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return x0.l(C2226h.t(str, format));
    }

    static /* synthetic */ long h(String str, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return x0.l(C2226h.t(str, format));
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final short i(String str, C2227i format) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return D0.l(C2226h.z(str, format));
    }

    static /* synthetic */ short j(String str, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        return D0.l(C2226h.z(str, format));
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final String k(int i4, C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.E(i4, format);
    }

    static /* synthetic */ String l(int i4, C2227i format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.E(i4, format);
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final String m(long j4, C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.F(j4, format);
    }

    static /* synthetic */ String n(long j4, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.F(j4, format);
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final String o(byte b4, C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.D(b4, format);
    }

    static /* synthetic */ String p(byte b4, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.D(b4, format);
    }

    @kotlin.r
    @InterfaceC2218t
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final String q(byte[] toHexString, int i4, int i5, C2227i format) {
        kotlin.jvm.internal.F.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.H(toHexString, i4, i5, format);
    }

    static /* synthetic */ String r(byte[] toHexString, int i4, int i5, C2227i format, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = q0.r(toHexString);
        }
        if ((i6 & 4) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.H(toHexString, i4, i5, format);
    }

    @kotlin.r
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final String s(short s4, C2227i format) {
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.G(s4, format);
    }

    static /* synthetic */ String t(short s4, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.G(s4, format);
    }

    @kotlin.r
    @InterfaceC2218t
    @Y(version = "1.9")
    @kotlin.internal.f
    private static final String u(byte[] toHexString, C2227i format) {
        kotlin.jvm.internal.F.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.I(toHexString, format);
    }

    static /* synthetic */ String v(byte[] toHexString, C2227i format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = C2227i.f52814d.a();
        }
        kotlin.jvm.internal.F.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.F.p(format, "format");
        return C2226h.I(toHexString, format);
    }
}
