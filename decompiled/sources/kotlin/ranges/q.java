package kotlin.ranges;

/* loaded from: classes2.dex */
final class q implements r<Float> {

    /* renamed from: E, reason: collision with root package name */
    private final float f52487E;

    /* renamed from: F, reason: collision with root package name */
    private final float f52488F;

    public q(float f4, float f5) {
        this.f52487E = f4;
        this.f52488F = f5;
    }

    private final boolean f(float f4, float f5) {
        return f4 <= f5;
    }

    public boolean a(float f4) {
        if (f4 >= this.f52487E && f4 < this.f52488F) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ boolean b(Float f4) {
        return a(f4.floatValue());
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float j() {
        return Float.valueOf(this.f52488F);
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Float c() {
        return Float.valueOf(this.f52487E);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof q) {
            if (!isEmpty() || !((q) obj).isEmpty()) {
                q qVar = (q) obj;
                if (this.f52487E != qVar.f52487E || this.f52488F != qVar.f52488F) {
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
        return (Float.hashCode(this.f52487E) * 31) + Float.hashCode(this.f52488F);
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        if (this.f52487E >= this.f52488F) {
            return true;
        }
        return false;
    }

    @l3.d
    public String toString() {
        return this.f52487E + "..<" + this.f52488F;
    }
}
