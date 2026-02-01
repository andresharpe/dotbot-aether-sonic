package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2190m extends M<boolean[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final boolean[] f52347d;

    public C2190m(int i4) {
        super(i4);
        this.f52347d = new boolean[i4];
    }

    public final void h(boolean z3) {
        boolean[] zArr = this.f52347d;
        int b4 = b();
        e(b4 + 1);
        zArr[b4] = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d boolean[] zArr) {
        F.p(zArr, "<this>");
        return zArr.length;
    }

    @l3.d
    public final boolean[] j() {
        return g(this.f52347d, new boolean[f()]);
    }
}
