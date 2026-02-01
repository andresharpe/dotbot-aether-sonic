package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class E extends M<int[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final int[] f52273d;

    public E(int i4) {
        super(i4);
        this.f52273d = new int[i4];
    }

    public final void h(int i4) {
        int[] iArr = this.f52273d;
        int b4 = b();
        e(b4 + 1);
        iArr[b4] = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d int[] iArr) {
        F.p(iArr, "<this>");
        return iArr.length;
    }

    @l3.d
    public final int[] j() {
        return g(this.f52273d, new int[f()]);
    }
}
