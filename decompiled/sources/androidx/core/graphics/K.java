package androidx.core.graphics;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f12411a;

    /* renamed from: b, reason: collision with root package name */
    private final float f12412b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f12413c;

    /* renamed from: d, reason: collision with root package name */
    private final float f12414d;

    public K(@androidx.annotation.N PointF pointF, float f4, @androidx.annotation.N PointF pointF2, float f5) {
        this.f12411a = (PointF) androidx.core.util.u.m(pointF, "start == null");
        this.f12412b = f4;
        this.f12413c = (PointF) androidx.core.util.u.m(pointF2, "end == null");
        this.f12414d = f5;
    }

    @androidx.annotation.N
    public PointF a() {
        return this.f12413c;
    }

    public float b() {
        return this.f12414d;
    }

    @androidx.annotation.N
    public PointF c() {
        return this.f12411a;
    }

    public float d() {
        return this.f12412b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k4 = (K) obj;
        if (Float.compare(this.f12412b, k4.f12412b) == 0 && Float.compare(this.f12414d, k4.f12414d) == 0 && this.f12411a.equals(k4.f12411a) && this.f12413c.equals(k4.f12413c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = this.f12411a.hashCode() * 31;
        float f4 = this.f12412b;
        int i5 = 0;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int hashCode2 = (((hashCode + i4) * 31) + this.f12413c.hashCode()) * 31;
        float f5 = this.f12414d;
        if (f5 != 0.0f) {
            i5 = Float.floatToIntBits(f5);
        }
        return hashCode2 + i5;
    }

    public String toString() {
        return "PathSegment{start=" + this.f12411a + ", startFraction=" + this.f12412b + ", end=" + this.f12413c + ", endFraction=" + this.f12414d + '}';
    }
}
