package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2202z extends M<float[]> {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final float[] f52393d;

    public C2202z(int i4) {
        super(i4);
        this.f52393d = new float[i4];
    }

    public final void h(float f4) {
        float[] fArr = this.f52393d;
        int b4 = b();
        e(b4 + 1);
        fArr[b4] = f4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@l3.d float[] fArr) {
        F.p(fArr, "<this>");
        return fArr.length;
    }

    @l3.d
    public final float[] j() {
        return g(this.f52393d, new float[f()]);
    }
}
