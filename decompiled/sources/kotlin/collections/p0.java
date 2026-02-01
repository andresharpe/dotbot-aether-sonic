package kotlin.collections;

import kotlin.D0;
import kotlin.E0;
import kotlin.InterfaceC2218t;

/* loaded from: classes2.dex */
public final class p0 {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.InterfaceC2218t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int a(long[] r6, int r7, int r8) {
        /*
            int r0 = r7 + r8
            int r0 = r0 / 2
            long r0 = kotlin.y0.p(r6, r0)
        L8:
            if (r7 > r8) goto L39
        La:
            long r2 = kotlin.y0.p(r6, r7)
            int r2 = kotlin.n0.a(r2, r0)
            if (r2 >= 0) goto L17
            int r7 = r7 + 1
            goto La
        L17:
            long r2 = kotlin.y0.p(r6, r8)
            int r2 = kotlin.n0.a(r2, r0)
            if (r2 <= 0) goto L24
            int r8 = r8 + (-1)
            goto L17
        L24:
            if (r7 > r8) goto L8
            long r2 = kotlin.y0.p(r6, r7)
            long r4 = kotlin.y0.p(r6, r8)
            kotlin.y0.w(r6, r7, r4)
            kotlin.y0.w(r6, r8, r2)
            int r7 = r7 + 1
            int r8 = r8 + (-1)
            goto L8
        L39:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.p0.a(long[], int, int):int");
    }

    @InterfaceC2218t
    private static final int b(byte[] bArr, int i4, int i5) {
        int i6;
        byte p4 = kotlin.q0.p(bArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (true) {
                i6 = p4 & 255;
                if (kotlin.jvm.internal.F.t(kotlin.q0.p(bArr, i4) & 255, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (kotlin.jvm.internal.F.t(kotlin.q0.p(bArr, i5) & 255, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                byte p5 = kotlin.q0.p(bArr, i4);
                kotlin.q0.w(bArr, i4, kotlin.q0.p(bArr, i5));
                kotlin.q0.w(bArr, i5, p5);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @InterfaceC2218t
    private static final int c(short[] sArr, int i4, int i5) {
        int i6;
        short p4 = E0.p(sArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (true) {
                int p5 = E0.p(sArr, i4) & D0.f51794H;
                i6 = p4 & D0.f51794H;
                if (kotlin.jvm.internal.F.t(p5, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (kotlin.jvm.internal.F.t(E0.p(sArr, i5) & D0.f51794H, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                short p6 = E0.p(sArr, i4);
                E0.w(sArr, i4, E0.p(sArr, i5));
                E0.w(sArr, i5, p6);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @kotlin.InterfaceC2218t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int d(int[] r3, int r4, int r5) {
        /*
            int r0 = r4 + r5
            int r0 = r0 / 2
            int r0 = kotlin.u0.p(r3, r0)
        L8:
            if (r4 > r5) goto L39
        La:
            int r1 = kotlin.u0.p(r3, r4)
            int r1 = kotlin.o0.a(r1, r0)
            if (r1 >= 0) goto L17
            int r4 = r4 + 1
            goto La
        L17:
            int r1 = kotlin.u0.p(r3, r5)
            int r1 = kotlin.o0.a(r1, r0)
            if (r1 <= 0) goto L24
            int r5 = r5 + (-1)
            goto L17
        L24:
            if (r4 > r5) goto L8
            int r1 = kotlin.u0.p(r3, r4)
            int r2 = kotlin.u0.p(r3, r5)
            kotlin.u0.w(r3, r4, r2)
            kotlin.u0.w(r3, r5, r1)
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L8
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.p0.d(int[], int, int):int");
    }

    @InterfaceC2218t
    private static final void e(long[] jArr, int i4, int i5) {
        int a4 = a(jArr, i4, i5);
        int i6 = a4 - 1;
        if (i4 < i6) {
            e(jArr, i4, i6);
        }
        if (a4 < i5) {
            e(jArr, a4, i5);
        }
    }

    @InterfaceC2218t
    private static final void f(byte[] bArr, int i4, int i5) {
        int b4 = b(bArr, i4, i5);
        int i6 = b4 - 1;
        if (i4 < i6) {
            f(bArr, i4, i6);
        }
        if (b4 < i5) {
            f(bArr, b4, i5);
        }
    }

    @InterfaceC2218t
    private static final void g(short[] sArr, int i4, int i5) {
        int c4 = c(sArr, i4, i5);
        int i6 = c4 - 1;
        if (i4 < i6) {
            g(sArr, i4, i6);
        }
        if (c4 < i5) {
            g(sArr, c4, i5);
        }
    }

    @InterfaceC2218t
    private static final void h(int[] iArr, int i4, int i5) {
        int d4 = d(iArr, i4, i5);
        int i6 = d4 - 1;
        if (i4 < i6) {
            h(iArr, i4, i6);
        }
        if (d4 < i5) {
            h(iArr, d4, i5);
        }
    }

    @InterfaceC2218t
    public static final void i(@l3.d long[] array, int i4, int i5) {
        kotlin.jvm.internal.F.p(array, "array");
        e(array, i4, i5 - 1);
    }

    @InterfaceC2218t
    public static final void j(@l3.d byte[] array, int i4, int i5) {
        kotlin.jvm.internal.F.p(array, "array");
        f(array, i4, i5 - 1);
    }

    @InterfaceC2218t
    public static final void k(@l3.d short[] array, int i4, int i5) {
        kotlin.jvm.internal.F.p(array, "array");
        g(array, i4, i5 - 1);
    }

    @InterfaceC2218t
    public static final void l(@l3.d int[] array, int i4, int i5) {
        kotlin.jvm.internal.F.p(array, "array");
        h(array, i4, i5 - 1);
    }
}
