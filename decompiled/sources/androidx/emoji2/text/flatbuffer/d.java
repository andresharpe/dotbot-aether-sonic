package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f14370a;

    public d(ByteBuffer byteBuffer) {
        this.f14370a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int a() {
        return this.f14370a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] b() {
        return this.f14370a.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void c(int i4, byte[] bArr, int i5, int i6) {
        m((i6 - i5) + i4);
        int position = this.f14370a.position();
        this.f14370a.position(i4);
        this.f14370a.put(bArr, i5, i6);
        this.f14370a.position(position);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void d(int i4, double d4) {
        m(i4 + 8);
        this.f14370a.putDouble(i4, d4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void e(int i4, int i5) {
        m(i4 + 4);
        this.f14370a.putInt(i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean f(int i4) {
        if (get(i4) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(double d4) {
        this.f14370a.putDouble(d4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i4) {
        return this.f14370a.get(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i4) {
        return this.f14370a.getDouble(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i4) {
        return this.f14370a.getFloat(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i4) {
        return this.f14370a.getInt(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i4) {
        return this.f14370a.getLong(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i4) {
        return this.f14370a.getShort(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void h(short s4) {
        this.f14370a.putShort(s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void i(int i4, float f4) {
        m(i4 + 4);
        this.f14370a.putFloat(i4, f4);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String j(int i4, int i5) {
        return A.h(this.f14370a, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void k(int i4, short s4) {
        m(i4 + 2);
        this.f14370a.putShort(i4, s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void l(boolean z3) {
        this.f14370a.put(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean m(int i4) {
        if (i4 <= this.f14370a.limit()) {
            return true;
        }
        return false;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void n(int i4, byte b4) {
        m(i4 + 1);
        this.f14370a.put(i4, b4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void o(int i4, long j4) {
        m(i4 + 8);
        this.f14370a.putLong(i4, j4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int p() {
        return this.f14370a.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void q(int i4, boolean z3) {
        n(i4, z3 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void r(float f4) {
        this.f14370a.putFloat(f4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void s(int i4) {
        this.f14370a.putInt(i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void t(byte[] bArr, int i4, int i5) {
        this.f14370a.put(bArr, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void u(byte b4) {
        this.f14370a.put(b4);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void v(long j4) {
        this.f14370a.putLong(j4);
    }
}
