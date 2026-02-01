package kotlin.time;

import kotlin.InterfaceC2205l;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.time.d;
import kotlin.time.r;

@k
@InterfaceC2205l(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@Y(version = "1.3")
/* loaded from: classes2.dex */
public abstract class a implements r.c {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final DurationUnit f52860b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0472a implements d {

        /* renamed from: E, reason: collision with root package name */
        private final double f52861E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final a f52862F;

        /* renamed from: G, reason: collision with root package name */
        private final long f52863G;

        public /* synthetic */ C0472a(double d4, a aVar, long j4, C2197u c2197u) {
            this(d4, aVar, j4);
        }

        @Override // kotlin.time.q
        @l3.d
        public d a(long j4) {
            return d.a.d(this, j4);
        }

        @Override // kotlin.time.q
        public boolean b() {
            return d.a.c(this);
        }

        @Override // kotlin.time.d
        public long d(@l3.d d other) {
            F.p(other, "other");
            if (other instanceof C0472a) {
                C0472a c0472a = (C0472a) other;
                if (F.g(this.f52862F, c0472a.f52862F)) {
                    if (e.r(this.f52863G, c0472a.f52863G) && e.d0(this.f52863G)) {
                        return e.f52872F.W();
                    }
                    long g02 = e.g0(this.f52863G, c0472a.f52863G);
                    long l02 = g.l0(this.f52861E - c0472a.f52861E, this.f52862F.b());
                    if (e.r(l02, e.y0(g02))) {
                        return e.f52872F.W();
                    }
                    return e.h0(l02, g02);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.q
        public long e() {
            return e.g0(g.l0(this.f52862F.c() - this.f52861E, this.f52862F.b()), this.f52863G);
        }

        @Override // kotlin.time.d
        public boolean equals(@l3.e Object obj) {
            if ((obj instanceof C0472a) && F.g(this.f52862F, ((C0472a) obj).f52862F) && e.r(d((d) obj), e.f52872F.W())) {
                return true;
            }
            return false;
        }

        @Override // kotlin.time.q
        public boolean f() {
            return d.a.b(this);
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(@l3.d d dVar) {
            return d.a.a(this, dVar);
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return e.Z(e.h0(g.l0(this.f52861E, this.f52862F.b()), this.f52863G));
        }

        @l3.d
        public String toString() {
            return "DoubleTimeMark(" + this.f52861E + j.h(this.f52862F.b()) + " + " + ((Object) e.u0(this.f52863G)) + ", " + this.f52862F + ')';
        }

        private C0472a(double d4, a timeSource, long j4) {
            F.p(timeSource, "timeSource");
            this.f52861E = d4;
            this.f52862F = timeSource;
            this.f52863G = j4;
        }

        @Override // kotlin.time.q
        @l3.d
        public d c(long j4) {
            return new C0472a(this.f52861E, this.f52862F, e.h0(this.f52863G, j4), null);
        }
    }

    public a(@l3.d DurationUnit unit) {
        F.p(unit, "unit");
        this.f52860b = unit;
    }

    @l3.d
    protected final DurationUnit b() {
        return this.f52860b;
    }

    protected abstract double c();

    @Override // kotlin.time.r
    @l3.d
    public d a() {
        return new C0472a(c(), this, e.f52872F.W(), null);
    }
}
