package kotlin.ranges;

import kotlin.InterfaceC2205l;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class o extends m implements g<Long>, r<Long> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52483I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final o f52484J = new o(1, 0);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final o a() {
            return o.f52484J;
        }

        private a() {
        }
    }

    public o(long j4, long j5) {
        super(j4, j5, 1L);
    }

    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Y(version = "1.9")
    public static /* synthetic */ void s() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Long l4) {
        return q(l4.longValue());
    }

    @Override // kotlin.ranges.m
    public boolean equals(@l3.e Object obj) {
        if (obj instanceof o) {
            if (!isEmpty() || !((o) obj).isEmpty()) {
                o oVar = (o) obj;
                if (l() != oVar.l() || m() != oVar.m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (l() ^ (l() >>> 32))) + (m() ^ (m() >>> 32)));
    }

    @Override // kotlin.ranges.m, kotlin.ranges.g
    public boolean isEmpty() {
        if (l() > m()) {
            return true;
        }
        return false;
    }

    public boolean q(long j4) {
        if (l() <= j4 && j4 <= m()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long j() {
        if (m() != Long.MAX_VALUE) {
            return Long.valueOf(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Long k() {
        return Long.valueOf(m());
    }

    @Override // kotlin.ranges.m
    @l3.d
    public String toString() {
        return l() + ".." + m();
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Long c() {
        return Long.valueOf(l());
    }
}
