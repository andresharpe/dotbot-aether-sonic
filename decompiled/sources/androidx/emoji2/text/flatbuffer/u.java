package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    protected int f14424a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f14425b;

    /* renamed from: c, reason: collision with root package name */
    private int f14426c;

    /* renamed from: d, reason: collision with root package name */
    private int f14427d;

    /* renamed from: e, reason: collision with root package name */
    w f14428e = w.d();

    /* loaded from: classes.dex */
    class a implements Comparator<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f14429a;

        a(ByteBuffer byteBuffer) {
            this.f14429a = byteBuffer;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return u.this.s(num, num2, this.f14429a);
        }
    }

    protected static boolean a(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i4 = 0; i4 < 4; i4++) {
                if (str.charAt(i4) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i4))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int c(int i4, ByteBuffer byteBuffer) {
        return i4 + byteBuffer.getInt(i4);
    }

    protected static int e(int i4, int i5, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i5;
        return byteBuffer.getShort((i4 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String i(int i4, ByteBuffer byteBuffer, w wVar) {
        int i5 = i4 + byteBuffer.getInt(i4);
        return wVar.a(byteBuffer, i5 + 4, byteBuffer.getInt(i5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static u k(u uVar, int i4, ByteBuffer byteBuffer) {
        uVar.g(c(i4, byteBuffer), byteBuffer);
        return uVar;
    }

    protected static int p(int i4, int i5, ByteBuffer byteBuffer) {
        int i6 = i4 + byteBuffer.getInt(i4);
        int i7 = i5 + byteBuffer.getInt(i5);
        int i8 = byteBuffer.getInt(i6);
        int i9 = byteBuffer.getInt(i7);
        int i10 = i6 + 4;
        int i11 = i7 + 4;
        int min = Math.min(i8, i9);
        for (int i12 = 0; i12 < min; i12++) {
            int i13 = i12 + i10;
            int i14 = i12 + i11;
            if (byteBuffer.get(i13) != byteBuffer.get(i14)) {
                return byteBuffer.get(i13) - byteBuffer.get(i14);
            }
        }
        return i8 - i9;
    }

    protected static int q(int i4, byte[] bArr, ByteBuffer byteBuffer) {
        int i5 = i4 + byteBuffer.getInt(i4);
        int i6 = byteBuffer.getInt(i5);
        int length = bArr.length;
        int i7 = i5 + 4;
        int min = Math.min(i6, length);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = i8 + i7;
            if (byteBuffer.get(i9) != bArr[i8]) {
                return byteBuffer.get(i9) - bArr[i8];
            }
        }
        return i6 - length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i4) {
        return i4 + this.f14425b.getInt(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i4) {
        if (i4 < this.f14427d) {
            return this.f14425b.getShort(this.f14426c + i4);
        }
        return 0;
    }

    public void f() {
        g(0, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(int i4, ByteBuffer byteBuffer) {
        this.f14425b = byteBuffer;
        if (byteBuffer != null) {
            this.f14424a = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.f14426c = i5;
            this.f14427d = this.f14425b.getShort(i5);
            return;
        }
        this.f14424a = 0;
        this.f14426c = 0;
        this.f14427d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String h(int i4) {
        return i(i4, this.f14425b, this.f14428e);
    }

    protected u j(u uVar, int i4) {
        return k(uVar, i4, this.f14425b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(int i4) {
        int i5 = i4 + this.f14424a;
        return i5 + this.f14425b.getInt(i5) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer m(int i4, int i5) {
        int d4 = d(i4);
        if (d4 == 0) {
            return null;
        }
        ByteBuffer order = this.f14425b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int l4 = l(d4);
        order.position(l4);
        order.limit(l4 + (o(d4) * i5));
        return order;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ByteBuffer n(ByteBuffer byteBuffer, int i4, int i5) {
        int d4 = d(i4);
        if (d4 == 0) {
            return null;
        }
        int l4 = l(d4);
        byteBuffer.rewind();
        byteBuffer.limit((o(d4) * i5) + l4);
        byteBuffer.position(l4);
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int o(int i4) {
        int i5 = i4 + this.f14424a;
        return this.f14425b.getInt(i5 + this.f14425b.getInt(i5));
    }

    public ByteBuffer r() {
        return this.f14425b;
    }

    protected int s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        Arrays.sort(numArr, new a(byteBuffer));
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
    }
}
