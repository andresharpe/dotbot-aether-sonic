package kotlin;

/* loaded from: classes2.dex */
public final class F0 {
    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final short[] a(int i4, X2.l<? super Integer, D0> init) {
        kotlin.jvm.internal.F.p(init, "init");
        short[] sArr = new short[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            sArr[i5] = init.C(Integer.valueOf(i5)).j0();
        }
        return E0.j(sArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final short[] b(short... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return elements;
    }
}
