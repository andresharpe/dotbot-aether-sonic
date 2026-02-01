package kotlin.ranges;

import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.x0;

@K0(markerClass = {InterfaceC2218t.class})
@Y(version = "1.5")
/* loaded from: classes2.dex */
public final class A extends y implements g<x0>, r<x0> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52445I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final A f52446J = new A(-1, 0, null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final A a() {
            return A.f52446J;
        }

        private a() {
        }
    }

    public /* synthetic */ A(long j4, long j5, C2197u c2197u) {
        this(j4, j5);
    }

    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Y(version = "1.9")
    public static /* synthetic */ void r() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(x0 x0Var) {
        return p(x0Var.l0());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ x0 c() {
        return x0.e(t());
    }

    @Override // kotlin.ranges.y
    public boolean equals(@l3.e Object obj) {
        if (obj instanceof A) {
            if (!isEmpty() || !((A) obj).isEmpty()) {
                A a4 = (A) obj;
                if (l() != a4.l() || m() != a4.m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) x0.l(l() ^ x0.l(l() >>> 32))) * 31) + ((int) x0.l(m() ^ x0.l(m() >>> 32)));
    }

    @Override // kotlin.ranges.y, kotlin.ranges.g
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(l() ^ Long.MIN_VALUE, m() ^ Long.MIN_VALUE);
        if (compare > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ x0 j() {
        return x0.e(q());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ x0 k() {
        return x0.e(s());
    }

    public boolean p(long j4) {
        int compare;
        int compare2;
        compare = Long.compare(l() ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j4 ^ Long.MIN_VALUE, m() ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public long q() {
        if (m() != -1) {
            return x0.l(m() + x0.l(1 & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public long s() {
        return m();
    }

    public long t() {
        return l();
    }

    @Override // kotlin.ranges.y
    @l3.d
    public String toString() {
        return ((Object) x0.g0(l())) + ".." + ((Object) x0.g0(m()));
    }

    private A(long j4, long j5) {
        super(j4, j5, 1L, null);
    }
}
