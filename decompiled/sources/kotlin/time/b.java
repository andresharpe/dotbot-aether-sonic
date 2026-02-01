package kotlin.time;

import kotlin.A;
import kotlin.C;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.time.d;
import kotlin.time.r;

@K0(markerClass = {k.class})
@Y(version = "1.9")
/* loaded from: classes2.dex */
public abstract class b implements r.c {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final DurationUnit f52864b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final A f52865c;

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a implements d {

        /* renamed from: E, reason: collision with root package name */
        private final long f52866E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final b f52867F;

        /* renamed from: G, reason: collision with root package name */
        private final long f52868G;

        public /* synthetic */ a(long j4, b bVar, long j5, C2197u c2197u) {
            this(j4, bVar, j5);
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
            if (other instanceof a) {
                a aVar = (a) other;
                if (F.g(this.f52867F, aVar.f52867F)) {
                    return e.h0(l.h(this.f52866E, aVar.f52866E, this.f52867F.d()), e.g0(this.f52868G, aVar.f52868G));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.q
        public long e() {
            return e.g0(l.h(this.f52867F.c(), this.f52866E, this.f52867F.d()), this.f52868G);
        }

        @Override // kotlin.time.d
        public boolean equals(@l3.e Object obj) {
            if ((obj instanceof a) && F.g(this.f52867F, ((a) obj).f52867F) && e.r(d((d) obj), e.f52872F.W())) {
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
            return (e.Z(this.f52868G) * 37) + Long.hashCode(this.f52866E);
        }

        @l3.d
        public String toString() {
            return "LongTimeMark(" + this.f52866E + j.h(this.f52867F.d()) + " + " + ((Object) e.u0(this.f52868G)) + ", " + this.f52867F + ')';
        }

        private a(long j4, b timeSource, long j5) {
            F.p(timeSource, "timeSource");
            this.f52866E = j4;
            this.f52867F = timeSource;
            this.f52868G = j5;
        }

        @Override // kotlin.time.q
        @l3.d
        public d c(long j4) {
            int V3;
            DurationUnit d4 = this.f52867F.d();
            if (e.d0(j4)) {
                return new a(l.d(this.f52866E, d4, j4), this.f52867F, e.f52872F.W(), null);
            }
            long x02 = e.x0(j4, d4);
            long h02 = e.h0(e.g0(j4, x02), this.f52868G);
            long d5 = l.d(this.f52866E, d4, x02);
            long x03 = e.x0(h02, d4);
            long d6 = l.d(d5, d4, x03);
            long g02 = e.g0(h02, x03);
            long O3 = e.O(g02);
            if (d6 != 0 && O3 != 0 && (d6 ^ O3) < 0) {
                V3 = kotlin.math.d.V(O3);
                long m02 = g.m0(V3, d4);
                d6 = l.d(d6, d4, m02);
                g02 = e.g0(g02, m02);
            }
            if ((1 | (d6 - 1)) == Long.MAX_VALUE) {
                g02 = e.f52872F.W();
            }
            return new a(d6, this.f52867F, g02, null);
        }
    }

    /* renamed from: kotlin.time.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0473b extends Lambda implements X2.a<Long> {
        C0473b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Long n() {
            return Long.valueOf(b.this.f());
        }
    }

    public b(@l3.d DurationUnit unit) {
        A a4;
        F.p(unit, "unit");
        this.f52864b = unit;
        a4 = C.a(new C0473b());
        this.f52865c = a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long c() {
        return f() - e();
    }

    private final long e() {
        return ((Number) this.f52865c.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final DurationUnit d() {
        return this.f52864b;
    }

    protected abstract long f();

    @Override // kotlin.time.r
    @l3.d
    public d a() {
        return new a(c(), this, e.f52872F.W(), null);
    }
}
