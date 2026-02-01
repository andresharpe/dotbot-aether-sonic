package kotlin.ranges;

/* loaded from: classes2.dex */
final class p implements r<Double> {

    /* renamed from: E, reason: collision with root package name */
    private final double f52485E;

    /* renamed from: F, reason: collision with root package name */
    private final double f52486F;

    public p(double d4, double d5) {
        this.f52485E = d4;
        this.f52486F = d5;
    }

    private final boolean f(double d4, double d5) {
        return d4 <= d5;
    }

    public boolean a(double d4) {
        if (d4 >= this.f52485E && d4 < this.f52486F) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ boolean b(Double d4) {
        return a(d4.doubleValue());
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double j() {
        return Double.valueOf(this.f52486F);
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double c() {
        return Double.valueOf(this.f52485E);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof p) {
            if (!isEmpty() || !((p) obj).isEmpty()) {
                p pVar = (p) obj;
                if (this.f52485E != pVar.f52485E || this.f52486F != pVar.f52486F) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f52485E) * 31) + Double.hashCode(this.f52486F);
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        if (this.f52485E >= this.f52486F) {
            return true;
        }
        return false;
    }

    @l3.d
    public String toString() {
        return this.f52485E + "..<" + this.f52486F;
    }
}
