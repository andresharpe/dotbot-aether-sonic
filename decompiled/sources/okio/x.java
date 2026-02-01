package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x extends ByteString {

    /* renamed from: K, reason: collision with root package name */
    final transient byte[][] f55421K;

    /* renamed from: L, reason: collision with root package name */
    final transient int[] f55422L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(C2385c c2385c, int i4) {
        super(null);
        C.b(c2385c.f55330F, 0L, i4);
        v vVar = c2385c.f55329E;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            int i8 = vVar.f55413c;
            int i9 = vVar.f55412b;
            if (i8 != i9) {
                i6 += i8 - i9;
                i7++;
                vVar = vVar.f55416f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f55421K = new byte[i7];
        this.f55422L = new int[i7 * 2];
        v vVar2 = c2385c.f55329E;
        int i10 = 0;
        while (i5 < i4) {
            byte[][] bArr = this.f55421K;
            bArr[i10] = vVar2.f55411a;
            int i11 = vVar2.f55413c;
            int i12 = vVar2.f55412b;
            i5 += i11 - i12;
            if (i5 > i4) {
                i5 = i4;
            }
            int[] iArr = this.f55422L;
            iArr[i10] = i5;
            iArr[bArr.length + i10] = i12;
            vVar2.f55414d = true;
            i10++;
            vVar2 = vVar2.f55416f;
        }
    }

    private int e0(int i4) {
        int binarySearch = Arrays.binarySearch(this.f55422L, 0, this.f55421K.length, i4 + 1);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        return binarySearch;
    }

    private ByteString f0() {
        return new ByteString(Z());
    }

    private Object g0() {
        return f0();
    }

    @Override // okio.ByteString
    public int A(byte[] bArr, int i4) {
        return f0().A(bArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // okio.ByteString
    public byte[] B() {
        return Z();
    }

    @Override // okio.ByteString
    public int F(byte[] bArr, int i4) {
        return f0().F(bArr, i4);
    }

    @Override // okio.ByteString
    public ByteString G() {
        return f0().G();
    }

    @Override // okio.ByteString
    public boolean K(int i4, ByteString byteString, int i5, int i6) {
        int i7;
        if (i4 < 0 || i4 > R() - i6) {
            return false;
        }
        int e02 = e0(i4);
        while (i6 > 0) {
            if (e02 == 0) {
                i7 = 0;
            } else {
                i7 = this.f55422L[e02 - 1];
            }
            int min = Math.min(i6, ((this.f55422L[e02] - i7) + i7) - i4);
            int[] iArr = this.f55422L;
            byte[][] bArr = this.f55421K;
            if (!byteString.L(i5, bArr[e02], (i4 - i7) + iArr[bArr.length + e02], min)) {
                return false;
            }
            i4 += min;
            i5 += min;
            i6 -= min;
            e02++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean L(int i4, byte[] bArr, int i5, int i6) {
        int i7;
        if (i4 < 0 || i4 > R() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int e02 = e0(i4);
        while (i6 > 0) {
            if (e02 == 0) {
                i7 = 0;
            } else {
                i7 = this.f55422L[e02 - 1];
            }
            int min = Math.min(i6, ((this.f55422L[e02] - i7) + i7) - i4);
            int[] iArr = this.f55422L;
            byte[][] bArr2 = this.f55421K;
            if (!C.a(bArr2[e02], (i4 - i7) + iArr[bArr2.length + e02], bArr, i5, min)) {
                return false;
            }
            i4 += min;
            i5 += min;
            i6 -= min;
            e02++;
        }
        return true;
    }

    @Override // okio.ByteString
    public ByteString O() {
        return f0().O();
    }

    @Override // okio.ByteString
    public ByteString P() {
        return f0().P();
    }

    @Override // okio.ByteString
    public int R() {
        return this.f55422L[this.f55421K.length - 1];
    }

    @Override // okio.ByteString
    public String U(Charset charset) {
        return f0().U(charset);
    }

    @Override // okio.ByteString
    public ByteString V(int i4) {
        return f0().V(i4);
    }

    @Override // okio.ByteString
    public ByteString W(int i4, int i5) {
        return f0().W(i4, i5);
    }

    @Override // okio.ByteString
    public ByteString X() {
        return f0().X();
    }

    @Override // okio.ByteString
    public ByteString Y() {
        return f0().Y();
    }

    @Override // okio.ByteString
    public byte[] Z() {
        int[] iArr = this.f55422L;
        byte[][] bArr = this.f55421K;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr2 = this.f55422L;
            int i6 = iArr2[length + i4];
            int i7 = iArr2[i4];
            System.arraycopy(this.f55421K[i4], i6, bArr2, i5, i7 - i5);
            i4++;
            i5 = i7;
        }
        return bArr2;
    }

    @Override // okio.ByteString
    public String a0() {
        return f0().a0();
    }

    @Override // okio.ByteString
    public ByteBuffer b() {
        return ByteBuffer.wrap(Z()).asReadOnlyBuffer();
    }

    @Override // okio.ByteString
    public void b0(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.f55421K.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int[] iArr = this.f55422L;
                int i6 = iArr[length + i4];
                int i7 = iArr[i4];
                outputStream.write(this.f55421K[i4], i6, i7 - i5);
                i4++;
                i5 = i7;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // okio.ByteString
    public void c0(C2385c c2385c) {
        int length = this.f55421K.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr = this.f55422L;
            int i6 = iArr[length + i4];
            int i7 = iArr[i4];
            v vVar = new v(this.f55421K[i4], i6, (i6 + i7) - i5, true, false);
            v vVar2 = c2385c.f55329E;
            if (vVar2 == null) {
                vVar.f55417g = vVar;
                vVar.f55416f = vVar;
                c2385c.f55329E = vVar;
            } else {
                vVar2.f55417g.c(vVar);
            }
            i4++;
            i5 = i7;
        }
        c2385c.f55330F += i5;
    }

    @Override // okio.ByteString
    public String e() {
        return f0().e();
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.R() == R() && K(0, byteString, 0, R())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public String f() {
        return f0().f();
    }

    @Override // okio.ByteString
    public int hashCode() {
        int i4 = this.f55311F;
        if (i4 != 0) {
            return i4;
        }
        int length = this.f55421K.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            byte[] bArr = this.f55421K[i5];
            int[] iArr = this.f55422L;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f55311F = i6;
        return i6;
    }

    @Override // okio.ByteString
    public byte r(int i4) {
        int i5;
        C.b(this.f55422L[this.f55421K.length - 1], i4, 1L);
        int e02 = e0(i4);
        if (e02 == 0) {
            i5 = 0;
        } else {
            i5 = this.f55422L[e02 - 1];
        }
        int[] iArr = this.f55422L;
        byte[][] bArr = this.f55421K;
        return bArr[e02][(i4 - i5) + iArr[bArr.length + e02]];
    }

    @Override // okio.ByteString
    public String s() {
        return f0().s();
    }

    @Override // okio.ByteString
    public String toString() {
        return f0().toString();
    }

    @Override // okio.ByteString
    public ByteString u(ByteString byteString) {
        return f0().u(byteString);
    }

    @Override // okio.ByteString
    public ByteString v(ByteString byteString) {
        return f0().v(byteString);
    }
}
