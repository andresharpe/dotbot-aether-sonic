package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f14379o = false;

    /* renamed from: a, reason: collision with root package name */
    ByteBuffer f14380a;

    /* renamed from: b, reason: collision with root package name */
    int f14381b;

    /* renamed from: c, reason: collision with root package name */
    int f14382c;

    /* renamed from: d, reason: collision with root package name */
    int[] f14383d;

    /* renamed from: e, reason: collision with root package name */
    int f14384e;

    /* renamed from: f, reason: collision with root package name */
    boolean f14385f;

    /* renamed from: g, reason: collision with root package name */
    boolean f14386g;

    /* renamed from: h, reason: collision with root package name */
    int f14387h;

    /* renamed from: i, reason: collision with root package name */
    int[] f14388i;

    /* renamed from: j, reason: collision with root package name */
    int f14389j;

    /* renamed from: k, reason: collision with root package name */
    int f14390k;

    /* renamed from: l, reason: collision with root package name */
    boolean f14391l;

    /* renamed from: m, reason: collision with root package name */
    b f14392m;

    /* renamed from: n, reason: collision with root package name */
    final w f14393n;

    /* loaded from: classes.dex */
    static class a extends InputStream {

        /* renamed from: E, reason: collision with root package name */
        ByteBuffer f14394E;

        public a(ByteBuffer byteBuffer) {
            this.f14394E = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f14394E.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract ByteBuffer a(int i4);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14395a = new c();

        @Override // androidx.emoji2.text.flatbuffer.i.b
        public ByteBuffer a(int i4) {
            return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public i(int i4, b bVar) {
        this(i4, bVar, null, w.d());
    }

    @Deprecated
    private int C() {
        L();
        return this.f14381b;
    }

    static ByteBuffer N(ByteBuffer byteBuffer, b bVar) {
        int i4;
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            if (capacity == 0) {
                i4 = 1;
            } else {
                i4 = capacity << 1;
            }
            byteBuffer.position(0);
            ByteBuffer a4 = bVar.a(i4);
            a4.position(a4.clear().capacity() - capacity);
            a4.put(byteBuffer);
            return a4;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean P(u uVar, int i4) {
        if (uVar.d(i4) != 0) {
            return true;
        }
        return false;
    }

    public int A(int[] iArr) {
        Q();
        h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n(iArr[length]);
        }
        return E();
    }

    public ByteBuffer B() {
        L();
        return this.f14380a;
    }

    public int D() {
        int i4;
        int i5;
        if (this.f14383d != null && this.f14385f) {
            j(0);
            int R3 = R();
            int i6 = this.f14384e - 1;
            while (i6 >= 0 && this.f14383d[i6] == 0) {
                i6--;
            }
            for (int i7 = i6; i7 >= 0; i7--) {
                int i8 = this.f14383d[i7];
                if (i8 != 0) {
                    i5 = R3 - i8;
                } else {
                    i5 = 0;
                }
                q((short) i5);
            }
            q((short) (R3 - this.f14387h));
            q((short) ((i6 + 3) * 2));
            int i9 = 0;
            loop2: while (true) {
                if (i9 < this.f14389j) {
                    int capacity = this.f14380a.capacity() - this.f14388i[i9];
                    int i10 = this.f14381b;
                    short s4 = this.f14380a.getShort(capacity);
                    if (s4 == this.f14380a.getShort(i10)) {
                        for (int i11 = 2; i11 < s4; i11 += 2) {
                            if (this.f14380a.getShort(capacity + i11) != this.f14380a.getShort(i10 + i11)) {
                                break;
                            }
                        }
                        i4 = this.f14388i[i9];
                        break loop2;
                    }
                    i9++;
                } else {
                    i4 = 0;
                    break;
                }
            }
            if (i4 != 0) {
                int capacity2 = this.f14380a.capacity() - R3;
                this.f14381b = capacity2;
                this.f14380a.putInt(capacity2, i4 - R3);
            } else {
                int i12 = this.f14389j;
                int[] iArr = this.f14388i;
                if (i12 == iArr.length) {
                    this.f14388i = Arrays.copyOf(iArr, i12 * 2);
                }
                int[] iArr2 = this.f14388i;
                int i13 = this.f14389j;
                this.f14389j = i13 + 1;
                iArr2[i13] = R();
                ByteBuffer byteBuffer = this.f14380a;
                byteBuffer.putInt(byteBuffer.capacity() - R3, R() - R3);
            }
            this.f14385f = false;
            return R3;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public int E() {
        if (this.f14385f) {
            this.f14385f = false;
            Y(this.f14390k);
            return R();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void F(int i4) {
        I(i4, false);
    }

    public void G(int i4, String str) {
        H(i4, str, false);
    }

    protected void H(int i4, String str, boolean z3) {
        int i5;
        int i6 = this.f14382c;
        if (z3) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        T(i6, i5 + 8);
        if (str.length() == 4) {
            for (int i7 = 3; i7 >= 0; i7--) {
                d((byte) str.charAt(i7));
            }
            I(i4, z3);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    protected void I(int i4, boolean z3) {
        int i5;
        int i6 = this.f14382c;
        if (z3) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        T(i6, i5 + 4);
        n(i4);
        if (z3) {
            j(this.f14380a.capacity() - this.f14381b);
        }
        this.f14380a.position(this.f14381b);
        this.f14386g = true;
    }

    public void J(int i4) {
        I(i4, true);
    }

    public void K(int i4, String str) {
        H(i4, str, true);
    }

    public void L() {
        if (this.f14386g) {
        } else {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public i M(boolean z3) {
        this.f14391l = z3;
        return this;
    }

    public i O(ByteBuffer byteBuffer, b bVar) {
        this.f14392m = bVar;
        this.f14380a = byteBuffer;
        byteBuffer.clear();
        this.f14380a.order(ByteOrder.LITTLE_ENDIAN);
        this.f14382c = 1;
        this.f14381b = this.f14380a.capacity();
        this.f14384e = 0;
        this.f14385f = false;
        this.f14386g = false;
        this.f14387h = 0;
        this.f14389j = 0;
        this.f14390k = 0;
        return this;
    }

    public void Q() {
        if (!this.f14385f) {
        } else {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int R() {
        return this.f14380a.capacity() - this.f14381b;
    }

    public void S(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer = this.f14380a;
            int i6 = this.f14381b - 1;
            this.f14381b = i6;
            byteBuffer.put(i6, (byte) 0);
        }
    }

    public void T(int i4, int i5) {
        if (i4 > this.f14382c) {
            this.f14382c = i4;
        }
        int i6 = ((~((this.f14380a.capacity() - this.f14381b) + i5)) + 1) & (i4 - 1);
        while (this.f14381b < i6 + i4 + i5) {
            int capacity = this.f14380a.capacity();
            ByteBuffer byteBuffer = this.f14380a;
            ByteBuffer N3 = N(byteBuffer, this.f14392m);
            this.f14380a = N3;
            if (byteBuffer != N3) {
                this.f14392m.b(byteBuffer);
            }
            this.f14381b += this.f14380a.capacity() - capacity;
        }
        S(i6);
    }

    public void U(boolean z3) {
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - 1;
        this.f14381b = i4;
        byteBuffer.put(i4, z3 ? (byte) 1 : (byte) 0);
    }

    public void V(byte b4) {
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - 1;
        this.f14381b = i4;
        byteBuffer.put(i4, b4);
    }

    public void W(double d4) {
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - 8;
        this.f14381b = i4;
        byteBuffer.putDouble(i4, d4);
    }

    public void X(float f4) {
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - 4;
        this.f14381b = i4;
        byteBuffer.putFloat(i4, f4);
    }

    public void Y(int i4) {
        ByteBuffer byteBuffer = this.f14380a;
        int i5 = this.f14381b - 4;
        this.f14381b = i5;
        byteBuffer.putInt(i5, i4);
    }

    public void Z(long j4) {
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - 8;
        this.f14381b = i4;
        byteBuffer.putLong(i4, j4);
    }

    public void a(int i4) {
        if (i4 == R()) {
        } else {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void a0(short s4) {
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - 2;
        this.f14381b = i4;
        byteBuffer.putShort(i4, s4);
    }

    public void b(int i4, boolean z3, boolean z4) {
        if (this.f14391l || z3 != z4) {
            c(z3);
            f0(i4);
        }
    }

    public void b0(int i4, int i5) {
        int capacity = this.f14380a.capacity() - i4;
        if (this.f14380a.getShort((capacity - this.f14380a.getInt(capacity)) + i5) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i5 + " must be set");
    }

    public void c(boolean z3) {
        T(1, 0);
        U(z3);
    }

    public byte[] c0() {
        return d0(this.f14381b, this.f14380a.capacity() - this.f14381b);
    }

    public void d(byte b4) {
        T(1, 0);
        V(b4);
    }

    public byte[] d0(int i4, int i5) {
        L();
        byte[] bArr = new byte[i5];
        this.f14380a.position(i4);
        this.f14380a.get(bArr);
        return bArr;
    }

    public void e(int i4, byte b4, int i5) {
        if (this.f14391l || b4 != i5) {
            d(b4);
            f0(i4);
        }
    }

    public InputStream e0() {
        L();
        ByteBuffer duplicate = this.f14380a.duplicate();
        duplicate.position(this.f14381b);
        duplicate.limit(this.f14380a.capacity());
        return new a(duplicate);
    }

    public void f(double d4) {
        T(8, 0);
        W(d4);
    }

    public void f0(int i4) {
        this.f14383d[i4] = R();
    }

    public void g(int i4, double d4, double d5) {
        if (this.f14391l || d4 != d5) {
            f(d4);
            f0(i4);
        }
    }

    public void g0(int i4) {
        Q();
        int[] iArr = this.f14383d;
        if (iArr == null || iArr.length < i4) {
            this.f14383d = new int[i4];
        }
        this.f14384e = i4;
        Arrays.fill(this.f14383d, 0, i4, 0);
        this.f14385f = true;
        this.f14387h = R();
    }

    public void h(float f4) {
        T(4, 0);
        X(f4);
    }

    public void h0(int i4, int i5, int i6) {
        Q();
        this.f14390k = i5;
        int i7 = i4 * i5;
        T(4, i7);
        T(i6, i7);
        this.f14385f = true;
    }

    public void i(int i4, float f4, double d4) {
        if (this.f14391l || f4 != d4) {
            h(f4);
            f0(i4);
        }
    }

    public void j(int i4) {
        T(4, 0);
        Y(i4);
    }

    public void k(int i4, int i5, int i6) {
        if (this.f14391l || i5 != i6) {
            j(i5);
            f0(i4);
        }
    }

    public void l(int i4, long j4, long j5) {
        if (this.f14391l || j4 != j5) {
            m(j4);
            f0(i4);
        }
    }

    public void m(long j4) {
        T(8, 0);
        Z(j4);
    }

    public void n(int i4) {
        T(4, 0);
        Y((R() - i4) + 4);
    }

    public void o(int i4, int i5, int i6) {
        if (this.f14391l || i5 != i6) {
            n(i5);
            f0(i4);
        }
    }

    public void p(int i4, short s4, int i5) {
        if (this.f14391l || s4 != i5) {
            q(s4);
            f0(i4);
        }
    }

    public void q(short s4) {
        T(2, 0);
        a0(s4);
    }

    public void r(int i4, int i5, int i6) {
        if (i5 != i6) {
            a(i5);
            f0(i4);
        }
    }

    public void s() {
        this.f14381b = this.f14380a.capacity();
        this.f14380a.clear();
        this.f14382c = 1;
        while (true) {
            int i4 = this.f14384e;
            if (i4 > 0) {
                int[] iArr = this.f14383d;
                int i5 = i4 - 1;
                this.f14384e = i5;
                iArr[i5] = 0;
            } else {
                this.f14384e = 0;
                this.f14385f = false;
                this.f14386g = false;
                this.f14387h = 0;
                this.f14389j = 0;
                this.f14390k = 0;
                return;
            }
        }
    }

    public int t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f14380a;
        int i4 = this.f14381b - remaining;
        this.f14381b = i4;
        byteBuffer2.position(i4);
        this.f14380a.put(byteBuffer);
        return E();
    }

    public int u(byte[] bArr) {
        int length = bArr.length;
        h0(1, length, 1);
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - length;
        this.f14381b = i4;
        byteBuffer.position(i4);
        this.f14380a.put(bArr);
        return E();
    }

    public int v(byte[] bArr, int i4, int i5) {
        h0(1, i5, 1);
        ByteBuffer byteBuffer = this.f14380a;
        int i6 = this.f14381b - i5;
        this.f14381b = i6;
        byteBuffer.position(i6);
        this.f14380a.put(bArr, i4, i5);
        return E();
    }

    public <T extends u> int w(T t3, int[] iArr) {
        t3.t(iArr, this.f14380a);
        return A(iArr);
    }

    public int x(CharSequence charSequence) {
        int c4 = this.f14393n.c(charSequence);
        d((byte) 0);
        h0(1, c4, 1);
        ByteBuffer byteBuffer = this.f14380a;
        int i4 = this.f14381b - c4;
        this.f14381b = i4;
        byteBuffer.position(i4);
        this.f14393n.b(charSequence, this.f14380a);
        return E();
    }

    public int y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        d((byte) 0);
        h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f14380a;
        int i4 = this.f14381b - remaining;
        this.f14381b = i4;
        byteBuffer2.position(i4);
        this.f14380a.put(byteBuffer);
        return E();
    }

    public ByteBuffer z(int i4, int i5, int i6) {
        int i7 = i4 * i5;
        h0(i4, i5, i6);
        ByteBuffer byteBuffer = this.f14380a;
        int i8 = this.f14381b - i7;
        this.f14381b = i8;
        byteBuffer.position(i8);
        ByteBuffer order = this.f14380a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i7);
        return order;
    }

    public i(int i4, b bVar, ByteBuffer byteBuffer, w wVar) {
        this.f14382c = 1;
        this.f14383d = null;
        this.f14384e = 0;
        this.f14385f = false;
        this.f14386g = false;
        this.f14388i = new int[16];
        this.f14389j = 0;
        this.f14390k = 0;
        this.f14391l = false;
        i4 = i4 <= 0 ? 1 : i4;
        this.f14392m = bVar;
        if (byteBuffer != null) {
            this.f14380a = byteBuffer;
            byteBuffer.clear();
            this.f14380a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f14380a = bVar.a(i4);
        }
        this.f14393n = wVar;
        this.f14381b = this.f14380a.capacity();
    }

    public i(int i4) {
        this(i4, c.f14395a, null, w.d());
    }

    public i() {
        this(1024);
    }

    public i(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, w.d());
    }

    public i(ByteBuffer byteBuffer) {
        this(byteBuffer, new c());
    }
}
