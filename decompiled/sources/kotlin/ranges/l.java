package kotlin.ranges;

import kotlin.InterfaceC2205l;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52473I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final l f52474J = new l(1, 0);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final l a() {
            return l.f52474J;
        }

        private a() {
        }
    }

    public l(int i4, int i5) {
        super(i4, i5, 1);
    }

    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Y(version = "1.9")
    public static /* synthetic */ void s() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Integer num) {
        return q(num.intValue());
    }

    @Override // kotlin.ranges.j
    public boolean equals(@l3.e Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (l() != lVar.l() || m() != lVar.m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    @Override // kotlin.ranges.j, kotlin.ranges.g
    public boolean isEmpty() {
        if (l() > m()) {
            return true;
        }
        return false;
    }

    public boolean q(int i4) {
        if (l() <= i4 && i4 <= m()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer j() {
        if (m() != Integer.MAX_VALUE) {
            return Integer.valueOf(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer k() {
        return Integer.valueOf(m());
    }

    @Override // kotlin.ranges.j
    @l3.d
    public String toString() {
        return l() + ".." + m();
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return Integer.valueOf(l());
    }
}
