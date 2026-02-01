package kotlin.collections;

/* loaded from: classes2.dex */
public final class M<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f51834a;

    /* renamed from: b, reason: collision with root package name */
    private final T f51835b;

    public M(int i4, T t3) {
        this.f51834a = i4;
        this.f51835b = t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ M d(M m4, int i4, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = m4.f51834a;
        }
        if ((i5 & 2) != 0) {
            obj = m4.f51835b;
        }
        return m4.c(i4, obj);
    }

    public final int a() {
        return this.f51834a;
    }

    public final T b() {
        return this.f51835b;
    }

    @l3.d
    public final M<T> c(int i4, T t3) {
        return new M<>(i4, t3);
    }

    public final int e() {
        return this.f51834a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        return this.f51834a == m4.f51834a && kotlin.jvm.internal.F.g(this.f51835b, m4.f51835b);
    }

    public final T f() {
        return this.f51835b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f51834a) * 31;
        T t3 = this.f51835b;
        return hashCode + (t3 == null ? 0 : t3.hashCode());
    }

    @l3.d
    public String toString() {
        return "IndexedValue(index=" + this.f51834a + ", value=" + this.f51835b + ')';
    }
}
