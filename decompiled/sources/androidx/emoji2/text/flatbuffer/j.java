package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j {

    /* renamed from: h, reason: collision with root package name */
    public static final int f14396h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14397i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14398j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14399k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14400l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14401m = 7;

    /* renamed from: n, reason: collision with root package name */
    private static final int f14402n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f14403o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f14404p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f14405q = 3;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f14406r = false;

    /* renamed from: a, reason: collision with root package name */
    private final q f14407a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f14408b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Integer> f14409c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f14410d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14411e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14412f;

    /* renamed from: g, reason: collision with root package name */
    private Comparator<b> f14413g;

    /* loaded from: classes.dex */
    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b4;
            byte b5;
            int i4 = bVar.f14420e;
            int i5 = bVar2.f14420e;
            do {
                b4 = j.this.f14407a.get(i4);
                b5 = j.this.f14407a.get(i5);
                if (b4 == 0) {
                    return b4 - b5;
                }
                i4++;
                i5++;
            } while (b4 == b5);
            return b4 - b5;
        }
    }

    public j(int i4) {
        this(new C0882a(i4), 1);
    }

    private void A(String str, long j4) {
        this.f14408b.add(b.w(u(str), j4));
    }

    static int E(long j4) {
        if (j4 <= FlexBuffers.i.a((byte) -1)) {
            return 0;
        }
        if (j4 <= FlexBuffers.i.c((short) -1)) {
            return 1;
        }
        if (j4 <= FlexBuffers.i.b(-1)) {
            return 2;
        }
        return 3;
    }

    private void F(b bVar, int i4) {
        int i5 = bVar.f14416a;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                if (i5 != 26) {
                    J(bVar.f14419d, i4);
                    return;
                }
            } else {
                H(bVar.f14418c, i4);
                return;
            }
        }
        I(bVar.f14419d, i4);
    }

    private b G(int i4, byte[] bArr, int i5, boolean z3) {
        int E3 = E(bArr.length);
        I(bArr.length, b(E3));
        int p4 = this.f14407a.p();
        this.f14407a.t(bArr, 0, bArr.length);
        if (z3) {
            this.f14407a.u((byte) 0);
        }
        return b.f(i4, p4, i5, E3);
    }

    private void H(double d4, int i4) {
        if (i4 == 4) {
            this.f14407a.r((float) d4);
        } else if (i4 == 8) {
            this.f14407a.g(d4);
        }
    }

    private void I(long j4, int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 8) {
                        this.f14407a.v(j4);
                        return;
                    }
                    return;
                }
                this.f14407a.s((int) j4);
                return;
            }
            this.f14407a.h((short) j4);
            return;
        }
        this.f14407a.u((byte) j4);
    }

    private void J(long j4, int i4) {
        I((int) (this.f14407a.p() - j4), i4);
    }

    private b K(int i4, String str) {
        return G(i4, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i4) {
        int i5 = 1 << i4;
        int q4 = b.q(this.f14407a.p(), i5);
        while (true) {
            int i6 = q4 - 1;
            if (q4 != 0) {
                this.f14407a.u((byte) 0);
                q4 = i6;
            } else {
                return i5;
            }
        }
    }

    private b c(int i4, int i5) {
        long j4 = i5;
        int max = Math.max(0, E(j4));
        int i6 = i4;
        while (i6 < this.f14408b.size()) {
            i6++;
            max = Math.max(max, b.i(4, 0, this.f14408b.get(i6).f14420e, this.f14407a.p(), i6));
        }
        int b4 = b(max);
        I(j4, b4);
        int p4 = this.f14407a.p();
        while (i4 < this.f14408b.size()) {
            int i7 = this.f14408b.get(i4).f14420e;
            J(this.f14408b.get(i4).f14420e, b4);
            i4++;
        }
        return new b(-1, FlexBuffers.q(4, 0), max, p4);
    }

    private b d(int i4, int i5, int i6, boolean z3, boolean z4, b bVar) {
        int i7;
        int i8;
        int i9 = i6;
        long j4 = i9;
        int max = Math.max(0, E(j4));
        if (bVar != null) {
            max = Math.max(max, bVar.h(this.f14407a.p(), 0));
            i7 = 3;
        } else {
            i7 = 1;
        }
        int i10 = 4;
        int i11 = max;
        for (int i12 = i5; i12 < this.f14408b.size(); i12++) {
            i11 = Math.max(i11, this.f14408b.get(i12).h(this.f14407a.p(), i12 + i7));
            if (z3 && i12 == i5) {
                i10 = this.f14408b.get(i12).f14416a;
                if (!FlexBuffers.l(i10)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i13 = i5;
        int b4 = b(i11);
        if (bVar != null) {
            J(bVar.f14419d, b4);
            I(1 << bVar.f14417b, b4);
        }
        if (!z4) {
            I(j4, b4);
        }
        int p4 = this.f14407a.p();
        for (int i14 = i13; i14 < this.f14408b.size(); i14++) {
            F(this.f14408b.get(i14), b4);
        }
        if (!z3) {
            while (i13 < this.f14408b.size()) {
                this.f14407a.u(this.f14408b.get(i13).s(i11));
                i13++;
            }
        }
        if (bVar != null) {
            i8 = 9;
        } else if (z3) {
            if (!z4) {
                i9 = 0;
            }
            i8 = FlexBuffers.q(i10, i9);
        } else {
            i8 = 10;
        }
        return new b(i4, i8, i11, p4);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int p4 = this.f14407a.p();
        if ((this.f14411e & 1) != 0) {
            Integer num = this.f14409c.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.f14407a.t(bytes, 0, bytes.length);
                this.f14407a.u((byte) 0);
                this.f14409c.put(str, Integer.valueOf(p4));
                return p4;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f14407a.t(bytes2, 0, bytes2.length);
        this.f14407a.u((byte) 0);
        this.f14409c.put(str, Integer.valueOf(p4));
        return p4;
    }

    private void z(String str, long j4) {
        b w3;
        int u3 = u(str);
        int E3 = E(j4);
        if (E3 == 0) {
            w3 = b.x(u3, (int) j4);
        } else if (E3 == 1) {
            w3 = b.u(u3, (int) j4);
        } else if (E3 == 2) {
            w3 = b.v(u3, (int) j4);
        } else {
            w3 = b.w(u3, j4);
        }
        this.f14408b.add(w3);
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f14408b.size();
    }

    public int D() {
        return this.f14408b.size();
    }

    public int e(String str, int i4) {
        int u3 = u(str);
        ArrayList<b> arrayList = this.f14408b;
        Collections.sort(arrayList.subList(i4, arrayList.size()), this.f14413g);
        b d4 = d(u3, i4, this.f14408b.size() - i4, false, false, c(i4, this.f14408b.size() - i4));
        while (this.f14408b.size() > i4) {
            this.f14408b.remove(r0.size() - 1);
        }
        this.f14408b.add(d4);
        return (int) d4.f14419d;
    }

    public int f(String str, int i4, boolean z3, boolean z4) {
        b d4 = d(u(str), i4, this.f14408b.size() - i4, z3, z4, null);
        while (this.f14408b.size() > i4) {
            this.f14408b.remove(r10.size() - 1);
        }
        this.f14408b.add(d4);
        return (int) d4.f14419d;
    }

    public ByteBuffer g() {
        int b4 = b(this.f14408b.get(0).h(this.f14407a.p(), 0));
        F(this.f14408b.get(0), b4);
        this.f14407a.u(this.f14408b.get(0).r());
        this.f14407a.u((byte) b4);
        this.f14412f = true;
        return ByteBuffer.wrap(this.f14407a.b(), 0, this.f14407a.p());
    }

    public q h() {
        return this.f14407a;
    }

    public int i(String str, byte[] bArr) {
        b G3 = G(u(str), bArr, 25, false);
        this.f14408b.add(G3);
        return (int) G3.f14419d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z3) {
        this.f14408b.add(b.g(u(str), z3));
    }

    public void l(boolean z3) {
        k(null, z3);
    }

    public void m(double d4) {
        o(null, d4);
    }

    public void n(float f4) {
        p(null, f4);
    }

    public void o(String str, double d4) {
        this.f14408b.add(b.k(u(str), d4));
    }

    public void p(String str, float f4) {
        this.f14408b.add(b.j(u(str), f4));
    }

    public void q(int i4) {
        s(null, i4);
    }

    public void r(long j4) {
        t(null, j4);
    }

    public void s(String str, int i4) {
        t(str, i4);
    }

    public void t(String str, long j4) {
        int u3 = u(str);
        if (-128 <= j4 && j4 <= 127) {
            this.f14408b.add(b.o(u3, (int) j4));
            return;
        }
        if (-32768 <= j4 && j4 <= 32767) {
            this.f14408b.add(b.l(u3, (int) j4));
        } else if (-2147483648L <= j4 && j4 <= 2147483647L) {
            this.f14408b.add(b.m(u3, (int) j4));
        } else {
            this.f14408b.add(b.n(u3, j4));
        }
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int u3 = u(str);
        if ((this.f14411e & 2) != 0) {
            Integer num = this.f14410d.get(str2);
            if (num == null) {
                b K3 = K(u3, str2);
                this.f14410d.put(str2, Integer.valueOf((int) K3.f14419d));
                this.f14408b.add(K3);
                return (int) K3.f14419d;
            }
            this.f14408b.add(b.f(u3, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b K4 = K(u3, str2);
        this.f14408b.add(K4);
        return (int) K4.f14419d;
    }

    public void x(int i4) {
        z(null, i4);
    }

    public void y(long j4) {
        z(null, j4);
    }

    public j() {
        this(256);
    }

    @Deprecated
    public j(ByteBuffer byteBuffer, int i4) {
        this(new C0882a(byteBuffer.array()), i4);
    }

    public j(q qVar, int i4) {
        this.f14408b = new ArrayList<>();
        this.f14409c = new HashMap<>();
        this.f14410d = new HashMap<>();
        this.f14412f = false;
        this.f14413g = new a();
        this.f14407a = qVar;
        this.f14411e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f14415f = false;

        /* renamed from: a, reason: collision with root package name */
        final int f14416a;

        /* renamed from: b, reason: collision with root package name */
        final int f14417b;

        /* renamed from: c, reason: collision with root package name */
        final double f14418c;

        /* renamed from: d, reason: collision with root package name */
        long f14419d;

        /* renamed from: e, reason: collision with root package name */
        int f14420e;

        b(int i4, int i5, int i6, long j4) {
            this.f14420e = i4;
            this.f14416a = i5;
            this.f14417b = i6;
            this.f14419d = j4;
            this.f14418c = Double.MIN_VALUE;
        }

        static b f(int i4, int i5, int i6, int i7) {
            return new b(i4, i6, i7, i5);
        }

        static b g(int i4, boolean z3) {
            long j4;
            if (z3) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            return new b(i4, 26, 0, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i4, int i5) {
            return i(this.f14416a, this.f14417b, this.f14419d, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i4, int i5, long j4, int i6, int i7) {
            if (FlexBuffers.j(i4)) {
                return i5;
            }
            for (int i8 = 1; i8 <= 32; i8 *= 2) {
                int E3 = j.E((int) (((q(i6, i8) + i6) + (i7 * i8)) - j4));
                if ((1 << E3) == i8) {
                    return E3;
                }
            }
            return 3;
        }

        static b j(int i4, float f4) {
            return new b(i4, 3, 2, f4);
        }

        static b k(int i4, double d4) {
            return new b(i4, 3, 3, d4);
        }

        static b l(int i4, int i5) {
            return new b(i4, 1, 1, i5);
        }

        static b m(int i4, int i5) {
            return new b(i4, 1, 2, i5);
        }

        static b n(int i4, long j4) {
            return new b(i4, 1, 3, j4);
        }

        static b o(int i4, int i5) {
            return new b(i4, 1, 0, i5);
        }

        private static byte p(int i4, int i5) {
            return (byte) (i4 | (i5 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(int i4, int i5) {
            return ((~i4) + 1) & (i5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte r() {
            return s(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s(int i4) {
            return p(t(i4), this.f14416a);
        }

        private int t(int i4) {
            if (FlexBuffers.j(this.f14416a)) {
                return Math.max(this.f14417b, i4);
            }
            return this.f14417b;
        }

        static b u(int i4, int i5) {
            return new b(i4, 2, 1, i5);
        }

        static b v(int i4, int i5) {
            return new b(i4, 2, 2, i5);
        }

        static b w(int i4, long j4) {
            return new b(i4, 2, 3, j4);
        }

        static b x(int i4, int i5) {
            return new b(i4, 2, 0, i5);
        }

        b(int i4, int i5, int i6, double d4) {
            this.f14420e = i4;
            this.f14416a = i5;
            this.f14417b = i6;
            this.f14418c = d4;
            this.f14419d = Long.MIN_VALUE;
        }
    }

    public j(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
