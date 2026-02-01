package kotlin.time;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.time.d;

@K0(markerClass = {k.class})
@Y(version = "1.9")
/* loaded from: classes2.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f52888a = a.f52889a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f52889a = new a();

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        public static final b f52890b = new b();

        @K0(markerClass = {k.class})
        @W2.g
        @Y(version = "1.9")
        /* loaded from: classes2.dex */
        public static final class a implements d {

            /* renamed from: E, reason: collision with root package name */
            private final long f52891E;

            private /* synthetic */ a(long j4) {
                this.f52891E = j4;
            }

            public static final /* synthetic */ a g(long j4) {
                return new a(j4);
            }

            public static final int i(long j4, long j5) {
                return e.l(r(j4, j5), e.f52872F.W());
            }

            public static int j(long j4, @l3.d d other) {
                F.p(other, "other");
                return g(j4).compareTo(other);
            }

            public static long k(long j4) {
                return j4;
            }

            public static long l(long j4) {
                return o.f52885b.d(j4);
            }

            public static boolean m(long j4, Object obj) {
                return (obj instanceof a) && j4 == ((a) obj).y();
            }

            public static final boolean n(long j4, long j5) {
                return j4 == j5;
            }

            public static boolean o(long j4) {
                return e.e0(l(j4));
            }

            public static boolean p(long j4) {
                return !e.e0(l(j4));
            }

            public static int q(long j4) {
                return Long.hashCode(j4);
            }

            public static final long r(long j4, long j5) {
                return o.f52885b.c(j4, j5);
            }

            public static long t(long j4, long j5) {
                return o.f52885b.b(j4, e.y0(j5));
            }

            public static long u(long j4, @l3.d d other) {
                F.p(other, "other");
                if (other instanceof a) {
                    return r(j4, ((a) other).y());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) x(j4)) + " and " + other);
            }

            public static long w(long j4, long j5) {
                return o.f52885b.b(j4, j5);
            }

            public static String x(long j4) {
                return "ValueTimeMark(reading=" + j4 + ')';
            }

            @Override // kotlin.time.d, kotlin.time.q
            public /* bridge */ /* synthetic */ d a(long j4) {
                return g(s(j4));
            }

            @Override // kotlin.time.q
            public boolean b() {
                return p(this.f52891E);
            }

            @Override // kotlin.time.d, kotlin.time.q
            public /* bridge */ /* synthetic */ d c(long j4) {
                return g(v(j4));
            }

            @Override // kotlin.time.d
            public long d(@l3.d d other) {
                F.p(other, "other");
                return u(this.f52891E, other);
            }

            @Override // kotlin.time.q
            public long e() {
                return l(this.f52891E);
            }

            @Override // kotlin.time.d
            public boolean equals(Object obj) {
                return m(this.f52891E, obj);
            }

            @Override // kotlin.time.q
            public boolean f() {
                return o(this.f52891E);
            }

            @Override // java.lang.Comparable
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public int compareTo(@l3.d d dVar) {
                return d.a.a(this, dVar);
            }

            @Override // kotlin.time.d
            public int hashCode() {
                return q(this.f52891E);
            }

            public long s(long j4) {
                return t(this.f52891E, j4);
            }

            public String toString() {
                return x(this.f52891E);
            }

            public long v(long j4) {
                return w(this.f52891E, j4);
            }

            public final /* synthetic */ long y() {
                return this.f52891E;
            }

            @Override // kotlin.time.q
            public /* bridge */ /* synthetic */ q a(long j4) {
                return g(s(j4));
            }

            @Override // kotlin.time.q
            public /* bridge */ /* synthetic */ q c(long j4) {
                return g(v(j4));
            }
        }

        private b() {
        }

        @Override // kotlin.time.r.c, kotlin.time.r
        public /* bridge */ /* synthetic */ d a() {
            return a.g(b());
        }

        public long b() {
            return o.f52885b.e();
        }

        @l3.d
        public String toString() {
            return o.f52885b.toString();
        }

        @Override // kotlin.time.r
        public /* bridge */ /* synthetic */ q a() {
            return a.g(b());
        }
    }

    @K0(markerClass = {k.class})
    @Y(version = "1.9")
    /* loaded from: classes2.dex */
    public interface c extends r {
        @Override // kotlin.time.r
        @l3.d
        d a();
    }

    @l3.d
    q a();
}
