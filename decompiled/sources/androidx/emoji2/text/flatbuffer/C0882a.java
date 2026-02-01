package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* renamed from: androidx.emoji2.text.flatbuffer.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0882a implements q {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f14364a;

    /* renamed from: b, reason: collision with root package name */
    private int f14365b;

    public C0882a() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int a() {
        return this.f14365b;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] b() {
        return this.f14364a;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void c(int i4, byte[] bArr, int i5, int i6) {
        m((i6 - i5) + i4);
        System.arraycopy(bArr, i5, this.f14364a, i4, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void d(int i4, double d4) {
        m(i4 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d4);
        int i5 = (int) doubleToRawLongBits;
        byte[] bArr = this.f14364a;
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
        int i6 = (int) (doubleToRawLongBits >> 32);
        bArr[i4 + 4] = (byte) (i6 & 255);
        bArr[i4 + 5] = (byte) ((i6 >> 8) & 255);
        bArr[i4 + 6] = (byte) ((i6 >> 16) & 255);
        bArr[i4 + 7] = (byte) ((i6 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void e(int i4, int i5) {
        m(i4 + 4);
        byte[] bArr = this.f14364a;
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean f(int i4) {
        if (this.f14364a[i4] != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(double d4) {
        d(this.f14365b, d4);
        this.f14365b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i4) {
        return this.f14364a[i4];
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i4) {
        return Double.longBitsToDouble(getLong(i4));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i4) {
        return Float.intBitsToFloat(getInt(i4));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i4) {
        byte[] bArr = this.f14364a;
        return (bArr[i4] & 255) | (bArr[i4 + 3] << 24) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i4) {
        byte[] bArr = this.f14364a;
        int i5 = i4 + 6;
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i5] & 255) << 48) | (bArr[i4 + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i4) {
        byte[] bArr = this.f14364a;
        return (short) ((bArr[i4] & 255) | (bArr[i4 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void h(short s4) {
        k(this.f14365b, s4);
        this.f14365b += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void i(int i4, float f4) {
        m(i4 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f4);
        byte[] bArr = this.f14364a;
        bArr[i4] = (byte) (floatToRawIntBits & 255);
        bArr[i4 + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i4 + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i4 + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String j(int i4, int i5) {
        return A.g(this.f14364a, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void k(int i4, short s4) {
        m(i4 + 2);
        byte[] bArr = this.f14364a;
        bArr[i4] = (byte) (s4 & 255);
        bArr[i4 + 1] = (byte) ((s4 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void l(boolean z3) {
        q(this.f14365b, z3);
        this.f14365b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean m(int i4) {
        byte[] bArr = this.f14364a;
        if (bArr.length > i4) {
            return true;
        }
        int length = bArr.length;
        this.f14364a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void n(int i4, byte b4) {
        m(i4 + 1);
        this.f14364a[i4] = b4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void o(int i4, long j4) {
        m(i4 + 8);
        int i5 = (int) j4;
        byte[] bArr = this.f14364a;
        bArr[i4] = (byte) (i5 & 255);
        bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
        int i6 = (int) (j4 >> 32);
        bArr[i4 + 4] = (byte) (i6 & 255);
        bArr[i4 + 5] = (byte) ((i6 >> 8) & 255);
        bArr[i4 + 6] = (byte) ((i6 >> 16) & 255);
        bArr[i4 + 7] = (byte) ((i6 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int p() {
        return this.f14365b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void q(int i4, boolean z3) {
        n(i4, z3 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void r(float f4) {
        i(this.f14365b, f4);
        this.f14365b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void s(int i4) {
        e(this.f14365b, i4);
        this.f14365b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void t(byte[] bArr, int i4, int i5) {
        c(this.f14365b, bArr, i4, i5);
        this.f14365b += i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void u(byte b4) {
        n(this.f14365b, b4);
        this.f14365b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void v(long j4) {
        o(this.f14365b, j4);
        this.f14365b += 8;
    }

    public C0882a(int i4) {
        this(new byte[i4]);
    }

    public C0882a(byte[] bArr) {
        this.f14364a = bArr;
        this.f14365b = 0;
    }

    public C0882a(byte[] bArr, int i4) {
        this.f14364a = bArr;
        this.f14365b = i4;
    }
}
