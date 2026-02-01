package kotlin.text;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f52845a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final kotlin.ranges.l f52846b;

    public k(@l3.d String value, @l3.d kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(value, "value");
        kotlin.jvm.internal.F.p(range, "range");
        this.f52845a = value;
        this.f52846b = range;
    }

    public static /* synthetic */ k d(k kVar, String str, kotlin.ranges.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = kVar.f52845a;
        }
        if ((i4 & 2) != 0) {
            lVar = kVar.f52846b;
        }
        return kVar.c(str, lVar);
    }

    @l3.d
    public final String a() {
        return this.f52845a;
    }

    @l3.d
    public final kotlin.ranges.l b() {
        return this.f52846b;
    }

    @l3.d
    public final k c(@l3.d String value, @l3.d kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(value, "value");
        kotlin.jvm.internal.F.p(range, "range");
        return new k(value, range);
    }

    @l3.d
    public final kotlin.ranges.l e() {
        return this.f52846b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.F.g(this.f52845a, kVar.f52845a) && kotlin.jvm.internal.F.g(this.f52846b, kVar.f52846b);
    }

    @l3.d
    public final String f() {
        return this.f52845a;
    }

    public int hashCode() {
        return (this.f52845a.hashCode() * 31) + this.f52846b.hashCode();
    }

    @l3.d
    public String toString() {
        return "MatchGroup(value=" + this.f52845a + ", range=" + this.f52846b + ')';
    }
}
