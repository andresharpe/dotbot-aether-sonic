package kotlin;

/* loaded from: classes2.dex */
public final class v0 {
    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final int[] a(int i4, X2.l<? super Integer, t0> init) {
        kotlin.jvm.internal.F.p(init, "init");
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i5] = init.C(Integer.valueOf(i5)).l0();
        }
        return u0.j(iArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final int[] b(int... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return elements;
    }
}
