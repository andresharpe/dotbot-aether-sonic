package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2199w extends M<double[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final double[] f52383d;

    public C2199w(int i4) {
        super(i4);
        this.f52383d = new double[i4];
    }

    public final void h(double d4) {
        double[] dArr = this.f52383d;
        int b4 = b();
        e(b4 + 1);
        dArr[b4] = d4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d double[] dArr) {
        F.p(dArr, "<this>");
        return dArr.length;
    }

    @l3.d
    public final double[] j() {
        return g(this.f52383d, new double[f()]);
    }
}
