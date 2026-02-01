package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class n extends u {

    /* loaded from: classes.dex */
    public static final class a extends b {
        public a f(int i4, int i5, ByteBuffer byteBuffer) {
            b(i4, i5, byteBuffer);
            return this;
        }

        public n g(int i4) {
            return h(new n(), i4);
        }

        public n h(n nVar, int i4) {
            return nVar.v(u.c(a(i4), this.f14369d), this.f14369d);
        }
    }

    public static void A(i iVar, boolean z3) {
        iVar.b(1, z3, false);
    }

    public static void B(i iVar, short s4) {
        iVar.p(5, s4, 0);
    }

    public static void C(i iVar, int i4) {
        iVar.k(0, i4, 0);
    }

    public static void D(i iVar, short s4) {
        iVar.p(2, s4, 0);
    }

    public static void E(i iVar, short s4) {
        iVar.p(4, s4, 0);
    }

    public static int M(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.j(iArr[length]);
        }
        return iVar.E();
    }

    public static int N(i iVar, int i4, boolean z3, short s4, short s5, short s6, short s7, int i5) {
        iVar.g0(7);
        y(iVar, i5);
        C(iVar, i4);
        B(iVar, s7);
        E(iVar, s6);
        z(iVar, s5);
        D(iVar, s4);
        A(iVar, z3);
        return P(iVar);
    }

    public static int P(i iVar) {
        return iVar.D();
    }

    public static n Q(ByteBuffer byteBuffer) {
        return R(byteBuffer, new n());
    }

    public static n R(ByteBuffer byteBuffer, n nVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return nVar.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void V(i iVar, int i4) {
        iVar.h0(4, i4, 4);
    }

    public static void W(i iVar) {
        iVar.g0(7);
    }

    public static void u() {
        g.a();
    }

    public static void y(i iVar, int i4) {
        iVar.o(6, i4, 0);
    }

    public static void z(i iVar, short s4) {
        iVar.p(3, s4, 0);
    }

    public int F(int i4) {
        int d4 = d(16);
        if (d4 != 0) {
            return this.f14425b.getInt(l(d4) + (i4 * 4));
        }
        return 0;
    }

    public ByteBuffer G() {
        return m(16, 4);
    }

    public ByteBuffer H(ByteBuffer byteBuffer) {
        return n(byteBuffer, 16, 4);
    }

    public int I() {
        int d4 = d(16);
        if (d4 != 0) {
            return o(d4);
        }
        return 0;
    }

    public l J() {
        return K(new l());
    }

    public l K(l lVar) {
        int d4 = d(16);
        if (d4 != 0) {
            return lVar.f(l(d4), this.f14425b);
        }
        return null;
    }

    public short L() {
        int d4 = d(10);
        if (d4 != 0) {
            return this.f14425b.getShort(d4 + this.f14424a);
        }
        return (short) 0;
    }

    public boolean O() {
        int d4 = d(6);
        if (d4 == 0 || this.f14425b.get(d4 + this.f14424a) == 0) {
            return false;
        }
        return true;
    }

    public short S() {
        int d4 = d(14);
        if (d4 != 0) {
            return this.f14425b.getShort(d4 + this.f14424a);
        }
        return (short) 0;
    }

    public int T() {
        int d4 = d(4);
        if (d4 != 0) {
            return this.f14425b.getInt(d4 + this.f14424a);
        }
        return 0;
    }

    public short U() {
        int d4 = d(8);
        if (d4 != 0) {
            return this.f14425b.getShort(d4 + this.f14424a);
        }
        return (short) 0;
    }

    public short X() {
        int d4 = d(12);
        if (d4 != 0) {
            return this.f14425b.getShort(d4 + this.f14424a);
        }
        return (short) 0;
    }

    public n v(int i4, ByteBuffer byteBuffer) {
        w(i4, byteBuffer);
        return this;
    }

    public void w(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
    }
}
