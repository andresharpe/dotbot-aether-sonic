package kotlin;

/* loaded from: classes2.dex */
public final class r0 {
    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final byte[] a(int i4, X2.l<? super Integer, p0> init) {
        kotlin.jvm.internal.F.p(init, "init");
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = init.C(Integer.valueOf(i5)).j0();
        }
        return q0.j(bArr);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final byte[] b(byte... elements) {
        kotlin.jvm.internal.F.p(elements, "elements");
        return elements;
    }
}
