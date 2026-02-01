package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class o extends u {

    /* loaded from: classes.dex */
    public static final class a extends b {
        public a f(int i4, int i5, ByteBuffer byteBuffer) {
            b(i4, i5, byteBuffer);
            return this;
        }

        public o g(int i4) {
            return h(new o(), i4);
        }

        public o h(o oVar, int i4) {
            return oVar.v(u.c(a(i4), this.f14369d), this.f14369d);
        }
    }

    public static void A(i iVar, int i4) {
        iVar.k(0, i4, 0);
    }

    public static int B(i iVar, int[] iArr) {
        iVar.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.n(iArr[length]);
        }
        return iVar.E();
    }

    public static int C(i iVar, int i4, int i5, int i6) {
        iVar.g0(3);
        z(iVar, i6);
        y(iVar, i5);
        A(iVar, i4);
        return D(iVar);
    }

    public static int D(i iVar) {
        return iVar.D();
    }

    public static void E(i iVar, int i4) {
        iVar.F(i4);
    }

    public static void F(i iVar, int i4) {
        iVar.J(i4);
    }

    public static o G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new o());
    }

    public static o H(ByteBuffer byteBuffer, o oVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return oVar.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void Q(i iVar, int i4) {
        iVar.h0(4, i4, 4);
    }

    public static void R(i iVar) {
        iVar.g0(3);
    }

    public static void u() {
        g.a();
    }

    public static void y(i iVar, int i4) {
        iVar.o(1, i4, 0);
    }

    public static void z(i iVar, int i4) {
        iVar.o(2, i4, 0);
    }

    public n I(int i4) {
        return J(new n(), i4);
    }

    public n J(n nVar, int i4) {
        int d4 = d(6);
        if (d4 != 0) {
            return nVar.v(b(l(d4) + (i4 * 4)), this.f14425b);
        }
        return null;
    }

    public int K() {
        int d4 = d(6);
        if (d4 != 0) {
            return o(d4);
        }
        return 0;
    }

    public n.a L() {
        return M(new n.a());
    }

    public n.a M(n.a aVar) {
        int d4 = d(6);
        if (d4 != 0) {
            return aVar.f(l(d4), 4, this.f14425b);
        }
        return null;
    }

    public String N() {
        int d4 = d(8);
        if (d4 != 0) {
            return h(d4 + this.f14424a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int d4 = d(4);
        if (d4 != 0) {
            return this.f14425b.getInt(d4 + this.f14424a);
        }
        return 0;
    }

    public o v(int i4, ByteBuffer byteBuffer) {
        w(i4, byteBuffer);
        return this;
    }

    public void w(int i4, ByteBuffer byteBuffer) {
        g(i4, byteBuffer);
    }
}
