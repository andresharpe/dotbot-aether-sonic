package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2194q extends M<char[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final char[] f52365d;

    public C2194q(int i4) {
        super(i4);
        this.f52365d = new char[i4];
    }

    public final void h(char c4) {
        char[] cArr = this.f52365d;
        int b4 = b();
        e(b4 + 1);
        cArr[b4] = c4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d char[] cArr) {
        F.p(cArr, "<this>");
        return cArr.length;
    }

    @l3.d
    public final char[] j() {
        return g(this.f52365d, new char[f()]);
    }
}
