package kotlin;

/* loaded from: classes2.dex */
public final class z0 {
    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final long[] a(int i4, X2.l<? super Integer, x0> init) {
        kotlin.jvm.internal.F.p(init, "init");
        long[] jArr = new long[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            jArr[i5] = init.C(Integer.valueOf(i5)).l0();
        }
        return y0.j(jArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final long[] b(long... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return elements;
    }
}
