package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static w f14431a;

    /* loaded from: classes.dex */
    static class a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) throws IllegalArgumentException {
            if (!f(b5) && (((b4 << 28) + (b5 + com.harman.sdk.utils.k.f48602N0)) >> 30) == 0 && !f(b6) && !f(b7)) {
                int k4 = ((b4 & 7) << 18) | (k(b5) << 12) | (k(b6) << 6) | k(b7);
                cArr[i4] = e(k4);
                cArr[i4 + 1] = j(k4);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void b(byte b4, char[] cArr, int i4) {
            cArr[i4] = (char) b4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void c(byte b4, byte b5, byte b6, char[] cArr, int i4) throws IllegalArgumentException {
            if (!f(b5) && ((b4 != -32 || b5 >= -96) && ((b4 != -19 || b5 < -96) && !f(b6)))) {
                cArr[i4] = (char) (((b4 & 15) << 12) | (k(b5) << 6) | k(b6));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void d(byte b4, byte b5, char[] cArr, int i4) throws IllegalArgumentException {
            if (b4 >= -62) {
                if (!f(b5)) {
                    cArr[i4] = (char) (((b4 & com.harman.sdk.utils.k.f48669h0) << 6) | k(b5));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        private static char e(int i4) {
            return (char) ((i4 >>> 10) + 55232);
        }

        private static boolean f(byte b4) {
            return b4 > -65;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean g(byte b4) {
            return b4 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean h(byte b4) {
            return b4 < -16;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean i(byte b4) {
            return b4 < -32;
        }

        private static char j(int i4) {
            return (char) ((i4 & 1023) + 56320);
        }

        private static int k(byte b4) {
            return b4 & 63;
        }
    }

    /* loaded from: classes.dex */
    static class b extends IllegalArgumentException {
        b(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    public static w d() {
        if (f14431a == null) {
            f14431a = new A();
        }
        return f14431a;
    }

    public static void e(w wVar) {
        f14431a = wVar;
    }

    public abstract String a(ByteBuffer byteBuffer, int i4, int i5);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
