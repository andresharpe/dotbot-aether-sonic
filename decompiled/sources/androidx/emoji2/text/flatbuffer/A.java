package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.w;
import com.harman.sdk.message.BatteryInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class A extends w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends IllegalArgumentException {
        a(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    private static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length && charSequence.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 < length) {
                char charAt = charSequence.charAt(i4);
                if (charAt < 2048) {
                    i5 += (127 - charAt) >>> 31;
                    i4++;
                } else {
                    i5 += k(charSequence, i4);
                    break;
                }
            } else {
                break;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }

    public static String g(byte[] bArr, int i4, int i5) {
        if ((i4 | i5 | ((bArr.length - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b4 = bArr[i4];
                if (!w.a.g(b4)) {
                    break;
                }
                i4++;
                w.a.b(b4, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i4 < i6) {
                int i9 = i4 + 1;
                byte b5 = bArr[i4];
                if (w.a.g(b5)) {
                    int i10 = i8 + 1;
                    w.a.b(b5, cArr, i8);
                    while (i9 < i6) {
                        byte b6 = bArr[i9];
                        if (!w.a.g(b6)) {
                            break;
                        }
                        i9++;
                        w.a.b(b6, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i4 = i9;
                } else if (w.a.i(b5)) {
                    if (i9 < i6) {
                        i4 += 2;
                        w.a.d(b5, bArr[i9], cArr, i8);
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (w.a.h(b5)) {
                    if (i9 < i6 - 1) {
                        int i11 = i4 + 2;
                        i4 += 3;
                        w.a.c(b5, bArr[i9], bArr[i11], cArr, i8);
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i9 < i6 - 2) {
                    byte b7 = bArr[i9];
                    int i12 = i4 + 3;
                    byte b8 = bArr[i4 + 2];
                    i4 += 4;
                    w.a.a(b5, b7, b8, bArr[i12], cArr, i8);
                    i8 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    public static String h(ByteBuffer byteBuffer, int i4, int i5) {
        if ((i4 | i5 | ((byteBuffer.limit() - i4) - i5)) >= 0) {
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b4 = byteBuffer.get(i4);
                if (!w.a.g(b4)) {
                    break;
                }
                i4++;
                w.a.b(b4, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i4 < i6) {
                int i9 = i4 + 1;
                byte b5 = byteBuffer.get(i4);
                if (w.a.g(b5)) {
                    int i10 = i8 + 1;
                    w.a.b(b5, cArr, i8);
                    while (i9 < i6) {
                        byte b6 = byteBuffer.get(i9);
                        if (!w.a.g(b6)) {
                            break;
                        }
                        i9++;
                        w.a.b(b6, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i4 = i9;
                } else if (w.a.i(b5)) {
                    if (i9 < i6) {
                        i4 += 2;
                        w.a.d(b5, byteBuffer.get(i9), cArr, i8);
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (w.a.h(b5)) {
                    if (i9 < i6 - 1) {
                        int i11 = i4 + 2;
                        i4 += 3;
                        w.a.c(b5, byteBuffer.get(i9), byteBuffer.get(i11), cArr, i8);
                        i8++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i9 < i6 - 2) {
                    byte b7 = byteBuffer.get(i9);
                    int i12 = i4 + 3;
                    byte b8 = byteBuffer.get(i4 + 2);
                    i4 += 4;
                    w.a.a(b5, b7, b8, byteBuffer.get(i12), cArr, i8);
                    i8 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i8);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int i(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.A.i(java.lang.CharSequence, byte[], int, int):int");
    }

    private static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i4;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i5 = 0;
        while (i5 < length) {
            try {
                char charAt = charSequence.charAt(i5);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i5, (byte) charAt);
                i5++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i5 == length) {
            byteBuffer.position(position + i5);
            return;
        }
        position += i5;
        while (i5 < length) {
            char charAt2 = charSequence.charAt(i5);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i6 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i6, (byte) ((charAt2 & '?') | 128));
                    position = i6;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i6;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i7 = i5 + 1;
                    if (i7 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i7);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i8 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | BatteryInfo.f48169K));
                                    i4 = position + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i8;
                                    i5 = i7;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                                }
                                try {
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i5 = i7;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i5 = i7;
                                    position = i4;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i5 = i7;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new a(i5, length);
                }
                int i9 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i9, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i5++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int k(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        int i5 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i4) >= 65536) {
                        i4++;
                    } else {
                        throw new a(i4, length);
                    }
                }
            }
            i4++;
        }
        return i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public String a(ByteBuffer byteBuffer, int i4, int i5) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return g(byteBuffer.array(), byteBuffer.arrayOffset() + i4, i5);
        }
        return h(byteBuffer, i4, i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else {
            j(charSequence, byteBuffer);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public int c(CharSequence charSequence) {
        return f(charSequence);
    }
}
