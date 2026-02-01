package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2192o extends M<byte[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final byte[] f52353d;

    public C2192o(int i4) {
        super(i4);
        this.f52353d = new byte[i4];
    }

    public final void h(byte b4) {
        byte[] bArr = this.f52353d;
        int b5 = b();
        e(b5 + 1);
        bArr[b5] = b4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d byte[] bArr) {
        F.p(bArr, "<this>");
        return bArr.length;
    }

    @l3.d
    public final byte[] j() {
        return g(this.f52353d, new byte[f()]);
    }
}
