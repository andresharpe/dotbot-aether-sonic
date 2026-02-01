package kotlin.time;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@K0(markerClass = {k.class})
@Y(version = "1.9")
/* loaded from: classes2.dex */
public final class s<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f52892a;

    /* renamed from: b, reason: collision with root package name */
    private final long f52893b;

    public /* synthetic */ s(Object obj, long j4, C2197u c2197u) {
        this(obj, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s d(s sVar, Object obj, long j4, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = sVar.f52892a;
        }
        if ((i4 & 2) != 0) {
            j4 = sVar.f52893b;
        }
        return sVar.c(obj, j4);
    }

    public final T a() {
        return this.f52892a;
    }

    public final long b() {
        return this.f52893b;
    }

    @l3.d
    public final s<T> c(T t3, long j4) {
        return new s<>(t3, j4, null);
    }

    public final long e() {
        return this.f52893b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return F.g(this.f52892a, sVar.f52892a) && e.r(this.f52893b, sVar.f52893b);
    }

    public final T f() {
        return this.f52892a;
    }

    public int hashCode() {
        T t3 = this.f52892a;
        return ((t3 == null ? 0 : t3.hashCode()) * 31) + e.Z(this.f52893b);
    }

    @l3.d
    public String toString() {
        return "TimedValue(value=" + this.f52892a + ", duration=" + ((Object) e.u0(this.f52893b)) + ')';
    }

    private s(T t3, long j4) {
        this.f52892a = t3;
        this.f52893b = j4;
    }
}
