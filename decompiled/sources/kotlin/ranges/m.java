package kotlin.ranges;

import kotlin.collections.Q;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public class m implements Iterable<Long>, Y2.a {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f52475H = new a(null);

    /* renamed from: E, reason: collision with root package name */
    private final long f52476E;

    /* renamed from: F, reason: collision with root package name */
    private final long f52477F;

    /* renamed from: G, reason: collision with root package name */
    private final long f52478G;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final m a(long j4, long j5, long j6) {
            return new m(j4, j5, j6);
        }

        private a() {
        }
    }

    public m(long j4, long j5, long j6) {
        if (j6 != 0) {
            if (j6 != Long.MIN_VALUE) {
                this.f52476E = j4;
                this.f52477F = kotlin.internal.n.d(j4, j5, j6);
                this.f52478G = j6;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f52476E != mVar.f52476E || this.f52477F != mVar.f52477F || this.f52478G != mVar.f52478G) {
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
        long j4 = 31;
        long j5 = this.f52476E;
        long j6 = this.f52477F;
        long j7 = j4 * (((j5 ^ (j5 >>> 32)) * j4) + (j6 ^ (j6 >>> 32)));
        long j8 = this.f52478G;
        return (int) (j7 + (j8 ^ (j8 >>> 32)));
    }

    public boolean isEmpty() {
        long j4 = this.f52478G;
        long j5 = this.f52476E;
        long j6 = this.f52477F;
        if (j4 > 0) {
            if (j5 <= j6) {
                return false;
            }
        } else if (j5 >= j6) {
            return false;
        }
        return true;
    }

    public final long l() {
        return this.f52476E;
    }

    public final long m() {
        return this.f52477F;
    }

    public final long n() {
        return this.f52478G;
    }

    @Override // java.lang.Iterable
    @l3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Q iterator() {
        return new n(this.f52476E, this.f52477F, this.f52478G);
    }

    @l3.d
    public String toString() {
        StringBuilder sb;
        long j4;
        if (this.f52478G > 0) {
            sb = new StringBuilder();
            sb.append(this.f52476E);
            sb.append("..");
            sb.append(this.f52477F);
            sb.append(" step ");
            j4 = this.f52478G;
        } else {
            sb = new StringBuilder();
            sb.append(this.f52476E);
            sb.append(" downTo ");
            sb.append(this.f52477F);
            sb.append(" step ");
            j4 = -this.f52478G;
        }
        sb.append(j4);
        return sb.toString();
    }
}
