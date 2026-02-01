package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class J extends M<long[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final long[] f52282d;

    public J(int i4) {
        super(i4);
        this.f52282d = new long[i4];
    }

    public final void h(long j4) {
        long[] jArr = this.f52282d;
        int b4 = b();
        e(b4 + 1);
        jArr[b4] = j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d long[] jArr) {
        F.p(jArr, "<this>");
        return jArr.length;
    }

    @l3.d
    public final long[] j() {
        return g(this.f52282d, new long[f()]);
    }
}
