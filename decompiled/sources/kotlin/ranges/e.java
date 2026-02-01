package kotlin.ranges;

/* loaded from: classes2.dex */
final class e implements f<Float> {

    /* renamed from: E, reason: collision with root package name */
    private final float f52459E;

    /* renamed from: F, reason: collision with root package name */
    private final float f52460F;

    public e(float f4, float f5) {
        this.f52459E = f4;
        this.f52460F = f5;
    }

    public boolean a(float f4) {
        if (f4 >= this.f52459E && f4 <= this.f52460F) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.f, kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @Override // kotlin.ranges.f
    public /* bridge */ /* synthetic */ boolean d(Float f4, Float f5) {
        return g(f4.floatValue(), f5.floatValue());
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Float k() {
        return Float.valueOf(this.f52460F);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f52459E != eVar.f52459E || this.f52460F != eVar.f52460F) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float c() {
        return Float.valueOf(this.f52459E);
    }

    public boolean g(float f4, float f5) {
        return f4 <= f5;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f52459E) * 31) + Float.hashCode(this.f52460F);
    }

    @Override // kotlin.ranges.f, kotlin.ranges.g
    public boolean isEmpty() {
        if (this.f52459E > this.f52460F) {
            return true;
        }
        return false;
    }

    @l3.d
    public String toString() {
        return this.f52459E + ".." + this.f52460F;
    }
}
