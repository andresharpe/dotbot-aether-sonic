package kotlin.ranges;

import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.t0;

@K0(markerClass = {InterfaceC2218t.class})
@Y(version = "1.5")
/* loaded from: classes2.dex */
public final class x extends v implements g<t0>, r<t0> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52497I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final x f52498J;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final x a() {
            return x.f52498J;
        }

        private a() {
        }
    }

    static {
        C2197u c2197u = null;
        f52497I = new a(c2197u);
        f52498J = new x(-1, 0, c2197u);
    }

    public /* synthetic */ x(int i4, int i5, C2197u c2197u) {
        this(i4, i5);
    }

    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Y(version = "1.9")
    public static /* synthetic */ void r() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(t0 t0Var) {
        return p(t0Var.l0());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ t0 c() {
        return t0.e(t());
    }

    @Override // kotlin.ranges.v
    public boolean equals(@l3.e Object obj) {
        if (obj instanceof x) {
            if (!isEmpty() || !((x) obj).isEmpty()) {
                x xVar = (x) obj;
                if (l() != xVar.l() || m() != xVar.m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    @Override // kotlin.ranges.v, kotlin.ranges.g
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(l() ^ Integer.MIN_VALUE, m() ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    public /* bridge */ /* synthetic */ t0 j() {
        return t0.e(q());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ t0 k() {
        return t0.e(s());
    }

    public boolean p(int i4) {
        int compare;
        int compare2;
        compare = Integer.compare(l() ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i4 ^ Integer.MIN_VALUE, m() ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public int q() {
        if (m() != -1) {
            return t0.l(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public int s() {
        return m();
    }

    public int t() {
        return l();
    }

    @Override // kotlin.ranges.v
    @l3.d
    public String toString() {
        return ((Object) t0.g0(l())) + ".." + ((Object) t0.g0(m()));
    }

    private x(int i4, int i5) {
        super(i4, i5, 1, null);
    }
}
