package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class T extends M<short[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final short[] f52308d;

    public T(int i4) {
        super(i4);
        this.f52308d = new short[i4];
    }

    public final void h(short s4) {
        short[] sArr = this.f52308d;
        int b4 = b();
        e(b4 + 1);
        sArr[b4] = s4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d short[] sArr) {
        F.p(sArr, "<this>");
        return sArr.length;
    }

    @l3.d
    public final short[] j() {
        return g(this.f52308d, new short[f()]);
    }
}
