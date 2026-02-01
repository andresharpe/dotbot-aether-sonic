package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import okio.C2385c;
import okio.p;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: K, reason: collision with root package name */
    private static final String[] f21896K = new String[128];

    /* renamed from: E, reason: collision with root package name */
    int f21897E;

    /* renamed from: F, reason: collision with root package name */
    int[] f21898F = new int[32];

    /* renamed from: G, reason: collision with root package name */
    String[] f21899G = new String[32];

    /* renamed from: H, reason: collision with root package name */
    int[] f21900H = new int[32];

    /* renamed from: I, reason: collision with root package name */
    boolean f21901I;

    /* renamed from: J, reason: collision with root package name */
    boolean f21902J;

    /* loaded from: classes.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f21903a;

        /* renamed from: b, reason: collision with root package name */
        final p f21904b;

        private a(String[] strArr, p pVar) {
            this.f21903a = strArr;
            this.f21904b = pVar;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C2385c c2385c = new C2385c();
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    JsonReader.G(c2385c, strArr[i4]);
                    c2385c.readByte();
                    byteStringArr[i4] = c2385c.s0();
                }
                return new a((String[]) strArr.clone(), p.f(byteStringArr));
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f21896K[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f21896K;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(okio.InterfaceC2386d r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.f21896K
            r1 = 34
            r7.O(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.p0(r8, r4, r3)
        L2e:
            r7.g0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.p0(r8, r4, r2)
        L3b:
            r7.O(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.G(okio.d, java.lang.String):void");
    }

    public static JsonReader t(okio.e eVar) {
        return new d(eVar);
    }

    public abstract int A(a aVar) throws IOException;

    public abstract void D() throws IOException;

    public abstract void F() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b H(String str) throws b {
        throw new b(str + " at path " + h());
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void f() throws IOException;

    public final String h() {
        return c.a(this.f21897E, this.f21898F, this.f21899G, this.f21900H);
    }

    public abstract boolean i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract double k() throws IOException;

    public abstract int m() throws IOException;

    public abstract String n() throws IOException;

    public abstract String p() throws IOException;

    public abstract Token v() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(int i4) {
        int i5 = this.f21897E;
        int[] iArr = this.f21898F;
        if (i5 == iArr.length) {
            if (i5 != 256) {
                this.f21898F = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f21899G;
                this.f21899G = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f21900H;
                this.f21900H = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new com.airbnb.lottie.parser.moshi.a("Nesting too deep at " + h());
            }
        }
        int[] iArr3 = this.f21898F;
        int i6 = this.f21897E;
        this.f21897E = i6 + 1;
        iArr3[i6] = i4;
    }
}
