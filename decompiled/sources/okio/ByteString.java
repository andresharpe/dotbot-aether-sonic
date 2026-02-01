package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: I, reason: collision with root package name */
    private static final long f55308I = 1;

    /* renamed from: E, reason: collision with root package name */
    final byte[] f55310E;

    /* renamed from: F, reason: collision with root package name */
    transient int f55311F;

    /* renamed from: G, reason: collision with root package name */
    transient String f55312G;

    /* renamed from: H, reason: collision with root package name */
    static final char[] f55307H = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: J, reason: collision with root package name */
    public static final ByteString f55309J = I(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteString(byte[] bArr) {
        this.f55310E = bArr;
    }

    public static ByteString H(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString I(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString J(byte[] bArr, int i4, int i5) {
        if (bArr != null) {
            C.b(bArr.length, i4, i5);
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            return new ByteString(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString M(InputStream inputStream, int i4) throws IOException {
        if (inputStream != null) {
            if (i4 >= 0) {
                byte[] bArr = new byte[i4];
                int i5 = 0;
                while (i5 < i4) {
                    int read = inputStream.read(bArr, i5, i4 - i5);
                    if (read != -1) {
                        i5 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException("byteCount < 0: " + i4);
        }
        throw new IllegalArgumentException("in == null");
    }

    private void N(ObjectInputStream objectInputStream) throws IOException {
        ByteString M3 = M(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = ByteString.class.getDeclaredField(androidx.exifinterface.media.a.U4);
            declaredField.setAccessible(true);
            declaredField.set(this, M3.f55310E);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void d0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f55310E.length);
        objectOutputStream.write(this.f55310E);
    }

    static int g(String str, int i4) {
        int length = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            if (i6 == i4) {
                return i5;
            }
            int codePointAt = str.codePointAt(i5);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i6++;
            i5 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    public static ByteString j(String str) {
        if (str != null) {
            byte[] a4 = C2384b.a(str);
            if (a4 != null) {
                return new ByteString(a4);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static ByteString k(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = i4 * 2;
                    bArr[i4] = (byte) ((l(str.charAt(i5)) << 4) + l(str.charAt(i5 + 1)));
                }
                return I(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int l(char c4) {
        if (c4 >= '0' && c4 <= '9') {
            return c4 - '0';
        }
        if (c4 >= 'a' && c4 <= 'f') {
            return c4 - 'W';
        }
        if (c4 >= 'A' && c4 <= 'F') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    private ByteString m(String str) {
        try {
            return I(MessageDigest.getInstance(str).digest(this.f55310E));
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }

    public static ByteString n(String str, Charset charset) {
        if (str != null) {
            if (charset != null) {
                return new ByteString(str.getBytes(charset));
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("s == null");
    }

    public static ByteString o(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(C.f55313a));
            byteString.f55312G = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    private ByteString t(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.Z(), str));
            return I(mac.doFinal(this.f55310E));
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }

    public int A(byte[] bArr, int i4) {
        int length = this.f55310E.length - bArr.length;
        for (int max = Math.max(i4, 0); max <= length; max++) {
            if (C.a(this.f55310E, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] B() {
        return this.f55310E;
    }

    public final int C(ByteString byteString) {
        return F(byteString.B(), R());
    }

    public final int D(ByteString byteString, int i4) {
        return F(byteString.B(), i4);
    }

    public final int E(byte[] bArr) {
        return F(bArr, R());
    }

    public int F(byte[] bArr, int i4) {
        for (int min = Math.min(i4, this.f55310E.length - bArr.length); min >= 0; min--) {
            if (C.a(this.f55310E, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public ByteString G() {
        return m("MD5");
    }

    public boolean K(int i4, ByteString byteString, int i5, int i6) {
        return byteString.L(i5, this.f55310E, i4, i6);
    }

    public boolean L(int i4, byte[] bArr, int i5, int i6) {
        if (i4 >= 0) {
            byte[] bArr2 = this.f55310E;
            if (i4 <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && C.a(bArr2, i4, bArr, i5, i6)) {
                return true;
            }
        }
        return false;
    }

    public ByteString O() {
        return m("SHA-1");
    }

    public ByteString P() {
        return m("SHA-256");
    }

    public ByteString Q() {
        return m("SHA-512");
    }

    public int R() {
        return this.f55310E.length;
    }

    public final boolean S(ByteString byteString) {
        return K(0, byteString, 0, byteString.R());
    }

    public final boolean T(byte[] bArr) {
        return L(0, bArr, 0, bArr.length);
    }

    public String U(Charset charset) {
        if (charset != null) {
            return new String(this.f55310E, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public ByteString V(int i4) {
        return W(i4, this.f55310E.length);
    }

    public ByteString W(int i4, int i5) {
        if (i4 >= 0) {
            byte[] bArr = this.f55310E;
            if (i5 <= bArr.length) {
                int i6 = i5 - i4;
                if (i6 >= 0) {
                    if (i4 == 0 && i5 == bArr.length) {
                        return this;
                    }
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, i4, bArr2, 0, i6);
                    return new ByteString(bArr2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException("endIndex > length(" + this.f55310E.length + ")");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public ByteString X() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f55310E;
            if (i4 < bArr.length) {
                byte b4 = bArr[i4];
                if (b4 >= 65 && b4 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i4] = (byte) (b4 + 32);
                    for (int i5 = i4 + 1; i5 < bArr2.length; i5++) {
                        byte b5 = bArr2[i5];
                        if (b5 >= 65 && b5 <= 90) {
                            bArr2[i5] = (byte) (b5 + 32);
                        }
                    }
                    return new ByteString(bArr2);
                }
                i4++;
            } else {
                return this;
            }
        }
    }

    public ByteString Y() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f55310E;
            if (i4 < bArr.length) {
                byte b4 = bArr[i4];
                if (b4 >= 97 && b4 <= 122) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i4] = (byte) (b4 - 32);
                    for (int i5 = i4 + 1; i5 < bArr2.length; i5++) {
                        byte b5 = bArr2[i5];
                        if (b5 >= 97 && b5 <= 122) {
                            bArr2[i5] = (byte) (b5 - 32);
                        }
                    }
                    return new ByteString(bArr2);
                }
                i4++;
            } else {
                return this;
            }
        }
    }

    public byte[] Z() {
        return (byte[]) this.f55310E.clone();
    }

    public String a0() {
        String str = this.f55312G;
        if (str == null) {
            String str2 = new String(this.f55310E, C.f55313a);
            this.f55312G = str2;
            return str2;
        }
        return str;
    }

    public ByteBuffer b() {
        return ByteBuffer.wrap(this.f55310E).asReadOnlyBuffer();
    }

    public void b0(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f55310E);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(C2385c c2385c) {
        byte[] bArr = this.f55310E;
        c2385c.l0(bArr, 0, bArr.length);
    }

    public String e() {
        return C2384b.b(this.f55310E);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int R3 = byteString.R();
            byte[] bArr = this.f55310E;
            if (R3 == bArr.length && byteString.L(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return C2384b.d(this.f55310E);
    }

    public int hashCode() {
        int i4 = this.f55311F;
        if (i4 == 0) {
            int hashCode = Arrays.hashCode(this.f55310E);
            this.f55311F = hashCode;
            return hashCode;
        }
        return i4;
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(ByteString byteString) {
        int R3 = R();
        int R4 = byteString.R();
        int min = Math.min(R3, R4);
        for (int i4 = 0; i4 < min; i4++) {
            int r4 = r(i4) & 255;
            int r5 = byteString.r(i4) & 255;
            if (r4 != r5) {
                if (r4 < r5) {
                    return -1;
                }
                return 1;
            }
        }
        if (R3 == R4) {
            return 0;
        }
        if (R3 < R4) {
            return -1;
        }
        return 1;
    }

    public final boolean p(ByteString byteString) {
        return K(R() - byteString.R(), byteString, 0, byteString.R());
    }

    public final boolean q(byte[] bArr) {
        return L(R() - bArr.length, bArr, 0, bArr.length);
    }

    public byte r(int i4) {
        return this.f55310E[i4];
    }

    public String s() {
        byte[] bArr = this.f55310E;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = f55307H;
            cArr[i4] = cArr2[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.f55310E.length == 0) {
            return "[size=0]";
        }
        String a02 = a0();
        int g4 = g(a02, 64);
        if (g4 == -1) {
            if (this.f55310E.length <= 64) {
                return "[hex=" + s() + "]";
            }
            return "[size=" + this.f55310E.length + " hex=" + W(0, 64).s() + "…]";
        }
        String replace = a02.substring(0, g4).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (g4 < a02.length()) {
            return "[size=" + this.f55310E.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + "]";
    }

    public ByteString u(ByteString byteString) {
        return t("HmacSHA1", byteString);
    }

    public ByteString v(ByteString byteString) {
        return t("HmacSHA256", byteString);
    }

    public ByteString w(ByteString byteString) {
        return t("HmacSHA512", byteString);
    }

    public final int x(ByteString byteString) {
        return A(byteString.B(), 0);
    }

    public final int y(ByteString byteString, int i4) {
        return A(byteString.B(), i4);
    }

    public final int z(byte[] bArr) {
        return A(bArr, 0);
    }
}
