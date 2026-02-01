package kotlin.ranges;

/* loaded from: classes2.dex */
final class d implements f<Double> {

    /* renamed from: E, reason: collision with root package name */
    private final double f52457E;

    /* renamed from: F, reason: collision with root package name */
    private final double f52458F;

    public d(double d4, double d5) {
        this.f52457E = d4;
        this.f52458F = d5;
    }

    public boolean a(double d4) {
        if (d4 >= this.f52457E && d4 <= this.f52458F) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean d(Double d4, Double d5) {
        return g(d4.doubleValue(), d5.doubleValue());
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double k() {
        return Double.valueOf(this.f52458F);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f52457E != dVar.f52457E || this.f52458F != dVar.f52458F) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double c() {
        return Double.valueOf(this.f52457E);
    }

    public boolean g(double d4, double d5) {
        return d4 <= d5;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f52457E) * 31) + Double.hashCode(this.f52458F);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public boolean isEmpty() {
        if (this.f52457E > this.f52458F) {
            return true;
        }
        return false;
    }

    @l3.d
    public String toString() {
        return this.f52457E + ".." + this.f52458F;
    }
}
