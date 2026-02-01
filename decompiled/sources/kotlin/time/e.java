package kotlin.time;

import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.K0;
import kotlin.V;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.ranges.u;
import kotlin.text.A;

@K0(markerClass = {k.class})
@W2.g
@Y(version = "1.6")
@U({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* loaded from: classes2.dex */
public final class e implements Comparable<e> {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f52872F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    private static final long f52873G = m(0);

    /* renamed from: H, reason: collision with root package name */
    private static final long f52874H = g.b(g.f52881c);

    /* renamed from: I, reason: collision with root package name */
    private static final long f52875I = g.b(-4611686018427387903L);

    /* renamed from: E, reason: collision with root package name */
    private final long f52876E;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @kotlin.internal.f
        public static /* synthetic */ void A(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void B(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void C(long j4) {
        }

        private final long D(double d4) {
            return g.l0(d4, DurationUnit.MINUTES);
        }

        private final long E(int i4) {
            return g.m0(i4, DurationUnit.MINUTES);
        }

        private final long F(long j4) {
            return g.n0(j4, DurationUnit.MINUTES);
        }

        @kotlin.internal.f
        public static /* synthetic */ void G(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void H(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void I(long j4) {
        }

        private final long K(double d4) {
            return g.l0(d4, DurationUnit.NANOSECONDS);
        }

        private final long L(int i4) {
            return g.m0(i4, DurationUnit.NANOSECONDS);
        }

        private final long M(long j4) {
            return g.n0(j4, DurationUnit.NANOSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void N(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void O(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void P(long j4) {
        }

        private final long Q(double d4) {
            return g.l0(d4, DurationUnit.SECONDS);
        }

        private final long R(int i4) {
            return g.m0(i4, DurationUnit.SECONDS);
        }

        private final long S(long j4) {
            return g.n0(j4, DurationUnit.SECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void T(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void U(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void V(long j4) {
        }

        private final long e(double d4) {
            return g.l0(d4, DurationUnit.DAYS);
        }

        private final long f(int i4) {
            return g.m0(i4, DurationUnit.DAYS);
        }

        private final long g(long j4) {
            return g.n0(j4, DurationUnit.DAYS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void h(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void i(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void j(long j4) {
        }

        private final long k(double d4) {
            return g.l0(d4, DurationUnit.HOURS);
        }

        private final long l(int i4) {
            return g.m0(i4, DurationUnit.HOURS);
        }

        private final long m(long j4) {
            return g.n0(j4, DurationUnit.HOURS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void n(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void o(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void p(long j4) {
        }

        private final long r(double d4) {
            return g.l0(d4, DurationUnit.MICROSECONDS);
        }

        private final long s(int i4) {
            return g.m0(i4, DurationUnit.MICROSECONDS);
        }

        private final long t(long j4) {
            return g.n0(j4, DurationUnit.MICROSECONDS);
        }

        @kotlin.internal.f
        public static /* synthetic */ void u(double d4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void v(int i4) {
        }

        @kotlin.internal.f
        public static /* synthetic */ void w(long j4) {
        }

        private final long x(double d4) {
            return g.l0(d4, DurationUnit.MILLISECONDS);
        }

        private final long y(int i4) {
            return g.m0(i4, DurationUnit.MILLISECONDS);
        }

        private final long z(long j4) {
            return g.n0(j4, DurationUnit.MILLISECONDS);
        }

        public final long J() {
            return e.f52875I;
        }

        public final long W() {
            return e.f52873G;
        }

        @InterfaceC2205l(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long X(double d4) {
            return g.l0(d4, DurationUnit.HOURS);
        }

        @InterfaceC2205l(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long Y(int i4) {
            return g.m0(i4, DurationUnit.HOURS);
        }

        @InterfaceC2205l(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long Z(long j4) {
            return g.n0(j4, DurationUnit.HOURS);
        }

        @k
        public final double a(double d4, @l3.d DurationUnit sourceUnit, @l3.d DurationUnit targetUnit) {
            F.p(sourceUnit, "sourceUnit");
            F.p(targetUnit, "targetUnit");
            return i.a(d4, sourceUnit, targetUnit);
        }

        @InterfaceC2205l(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long a0(double d4) {
            return g.l0(d4, DurationUnit.MICROSECONDS);
        }

        @InterfaceC2205l(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long b(double d4) {
            return g.l0(d4, DurationUnit.DAYS);
        }

        @InterfaceC2205l(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long b0(int i4) {
            return g.m0(i4, DurationUnit.MICROSECONDS);
        }

        @InterfaceC2205l(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long c(int i4) {
            return g.m0(i4, DurationUnit.DAYS);
        }

        @InterfaceC2205l(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long c0(long j4) {
            return g.n0(j4, DurationUnit.MICROSECONDS);
        }

        @InterfaceC2205l(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long d(long j4) {
            return g.n0(j4, DurationUnit.DAYS);
        }

        @InterfaceC2205l(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long d0(double d4) {
            return g.l0(d4, DurationUnit.MILLISECONDS);
        }

        @InterfaceC2205l(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long e0(int i4) {
            return g.m0(i4, DurationUnit.MILLISECONDS);
        }

        @InterfaceC2205l(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long f0(long j4) {
            return g.n0(j4, DurationUnit.MILLISECONDS);
        }

        @InterfaceC2205l(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long g0(double d4) {
            return g.l0(d4, DurationUnit.MINUTES);
        }

        @InterfaceC2205l(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long h0(int i4) {
            return g.m0(i4, DurationUnit.MINUTES);
        }

        @InterfaceC2205l(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long i0(long j4) {
            return g.n0(j4, DurationUnit.MINUTES);
        }

        @InterfaceC2205l(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long j0(double d4) {
            return g.l0(d4, DurationUnit.NANOSECONDS);
        }

        @InterfaceC2205l(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long k0(int i4) {
            return g.m0(i4, DurationUnit.NANOSECONDS);
        }

        @InterfaceC2205l(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long l0(long j4) {
            return g.n0(j4, DurationUnit.NANOSECONDS);
        }

        public final long m0(@l3.d String value) {
            F.p(value, "value");
            try {
                return g.h(value, false);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e4);
            }
        }

        public final long n0(@l3.d String value) {
            F.p(value, "value");
            try {
                return g.h(value, true);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e4);
            }
        }

        @l3.e
        public final e o0(@l3.d String value) {
            F.p(value, "value");
            try {
                return e.j(g.h(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @l3.e
        public final e p0(@l3.d String value) {
            F.p(value, "value");
            try {
                return e.j(g.h(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return e.f52874H;
        }

        @InterfaceC2205l(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long q0(double d4) {
            return g.l0(d4, DurationUnit.SECONDS);
        }

        @InterfaceC2205l(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long r0(int i4) {
            return g.m0(i4, DurationUnit.SECONDS);
        }

        @InterfaceC2205l(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @V(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @k
        @Y(version = "1.5")
        public final /* synthetic */ long s0(long j4) {
            return g.n0(j4, DurationUnit.SECONDS);
        }

        private a() {
        }
    }

    private /* synthetic */ e(long j4) {
        this.f52876E = j4;
    }

    @k
    @InterfaceC2205l(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void B() {
    }

    @k
    @InterfaceC2205l(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void D() {
    }

    @k
    @InterfaceC2205l(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void F() {
    }

    @k
    @InterfaceC2205l(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void H() {
    }

    public static final long J(long j4) {
        return r0(j4, DurationUnit.DAYS);
    }

    public static final long K(long j4) {
        return r0(j4, DurationUnit.HOURS);
    }

    public static final long L(long j4) {
        return r0(j4, DurationUnit.MICROSECONDS);
    }

    public static final long M(long j4) {
        if (b0(j4) && a0(j4)) {
            return Y(j4);
        }
        return r0(j4, DurationUnit.MILLISECONDS);
    }

    public static final long N(long j4) {
        return r0(j4, DurationUnit.MINUTES);
    }

    public static final long O(long j4) {
        long Y3 = Y(j4);
        if (!c0(j4)) {
            if (Y3 > 9223372036854L) {
                return Long.MAX_VALUE;
            }
            if (Y3 < -9223372036854L) {
                return Long.MIN_VALUE;
            }
            return g.f(Y3);
        }
        return Y3;
    }

    public static final long P(long j4) {
        return r0(j4, DurationUnit.SECONDS);
    }

    @kotlin.U
    public static /* synthetic */ void Q() {
    }

    public static final int R(long j4) {
        if (d0(j4)) {
            return 0;
        }
        return (int) (N(j4) % 60);
    }

    @kotlin.U
    public static /* synthetic */ void S() {
    }

    public static final int T(long j4) {
        long Y3;
        if (d0(j4)) {
            return 0;
        }
        if (b0(j4)) {
            Y3 = g.f(Y(j4) % 1000);
        } else {
            Y3 = Y(j4) % com.airbnb.lottie.utils.j.f23298a;
        }
        return (int) Y3;
    }

    @kotlin.U
    public static /* synthetic */ void U() {
    }

    public static final int V(long j4) {
        if (d0(j4)) {
            return 0;
        }
        return (int) (P(j4) % 60);
    }

    private static final DurationUnit W(long j4) {
        if (c0(j4)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    private static final int X(long j4) {
        return ((int) j4) & 1;
    }

    private static final long Y(long j4) {
        return j4 >> 1;
    }

    public static int Z(long j4) {
        return Long.hashCode(j4);
    }

    public static final boolean a0(long j4) {
        return !d0(j4);
    }

    private static final boolean b0(long j4) {
        return (((int) j4) & 1) == 1;
    }

    private static final boolean c0(long j4) {
        return (((int) j4) & 1) == 0;
    }

    public static final boolean d0(long j4) {
        if (j4 != f52874H && j4 != f52875I) {
            return false;
        }
        return true;
    }

    public static final boolean e0(long j4) {
        return j4 < 0;
    }

    public static final boolean f0(long j4) {
        return j4 > 0;
    }

    private static final long g(long j4, long j5, long j6) {
        long K3;
        long g4 = g.g(j6);
        long j7 = j5 + g4;
        if (!new kotlin.ranges.o(-4611686018426L, 4611686018426L).q(j7)) {
            K3 = u.K(j7, -4611686018427387903L, g.f52881c);
            return g.b(K3);
        }
        return g.d(g.f(j7) + (j6 - g.f(g4)));
    }

    public static final long g0(long j4, long j5) {
        return h0(j4, y0(j5));
    }

    public static final long h0(long j4, long j5) {
        if (d0(j4)) {
            if (!a0(j5) && (j5 ^ j4) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j4;
        }
        if (d0(j5)) {
            return j5;
        }
        if ((((int) j4) & 1) == (((int) j5) & 1)) {
            long Y3 = Y(j4) + Y(j5);
            if (c0(j4)) {
                return g.e(Y3);
            }
            return g.c(Y3);
        }
        if (b0(j4)) {
            return g(j4, Y(j4), Y(j5));
        }
        return g(j4, Y(j5), Y(j4));
    }

    private static final void i(long j4, StringBuilder sb, int i4, int i5, int i6, String str, boolean z3) {
        String R3;
        sb.append(i4);
        if (i5 != 0) {
            sb.append('.');
            R3 = A.R3(String.valueOf(i5), i6, '0');
            int i7 = -1;
            int length = R3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (R3.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (!z3 && i9 < 3) {
                sb.append((CharSequence) R3, 0, i9);
                F.o(sb, "append(...)");
            } else {
                sb.append((CharSequence) R3, 0, ((i7 + 3) / 3) * 3);
                F.o(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final long i0(long j4, double d4) {
        int K02;
        K02 = kotlin.math.d.K0(d4);
        if (K02 == d4) {
            return j0(j4, K02);
        }
        DurationUnit W3 = W(j4);
        return g.l0(o0(j4, W3) * d4, W3);
    }

    public static final /* synthetic */ e j(long j4) {
        return new e(j4);
    }

    public static final long j0(long j4, int i4) {
        int V3;
        int U3;
        long L3;
        int V4;
        int U4;
        long L4;
        if (d0(j4)) {
            if (i4 != 0) {
                if (i4 > 0) {
                    return j4;
                }
                return y0(j4);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i4 == 0) {
            return f52873G;
        }
        long Y3 = Y(j4);
        long j5 = i4;
        long j6 = Y3 * j5;
        if (c0(j4)) {
            if (new kotlin.ranges.o(-2147483647L, 2147483647L).q(Y3)) {
                return g.d(j6);
            }
            if (j6 / j5 == Y3) {
                return g.e(j6);
            }
            long g4 = g.g(Y3);
            long j7 = g4 * j5;
            long g5 = g.g((Y3 - g.f(g4)) * j5) + j7;
            if (j7 / j5 != g4 || (g5 ^ j7) < 0) {
                V4 = kotlin.math.d.V(Y3);
                U4 = kotlin.math.d.U(i4);
                if (V4 * U4 > 0) {
                    return f52874H;
                }
                return f52875I;
            }
            L4 = u.L(g5, new kotlin.ranges.o(-4611686018427387903L, g.f52881c));
            return g.b(L4);
        }
        if (j6 / j5 == Y3) {
            L3 = u.L(j6, new kotlin.ranges.o(-4611686018427387903L, g.f52881c));
            return g.b(L3);
        }
        V3 = kotlin.math.d.V(Y3);
        U3 = kotlin.math.d.U(i4);
        if (V3 * U3 > 0) {
            return f52874H;
        }
        return f52875I;
    }

    public static final <T> T k0(long j4, @l3.d X2.p<? super Long, ? super Integer, ? extends T> action) {
        F.p(action, "action");
        return action.c0(Long.valueOf(P(j4)), Integer.valueOf(T(j4)));
    }

    public static int l(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 >= 0 && (((int) j6) & 1) != 0) {
            int i4 = (((int) j4) & 1) - (((int) j5) & 1);
            if (e0(j4)) {
                return -i4;
            }
            return i4;
        }
        return F.u(j4, j5);
    }

    public static final <T> T l0(long j4, @l3.d X2.q<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        F.p(action, "action");
        return action.z(Long.valueOf(N(j4)), Integer.valueOf(V(j4)), Integer.valueOf(T(j4)));
    }

    public static long m(long j4) {
        if (f.d()) {
            if (c0(j4)) {
                if (!new kotlin.ranges.o(-4611686018426999999L, g.f52880b).q(Y(j4))) {
                    throw new AssertionError(Y(j4) + " ns is out of nanoseconds range");
                }
            } else if (new kotlin.ranges.o(-4611686018427387903L, g.f52881c).q(Y(j4))) {
                if (new kotlin.ranges.o(-4611686018426L, 4611686018426L).q(Y(j4))) {
                    throw new AssertionError(Y(j4) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(Y(j4) + " ms is out of milliseconds range");
            }
        }
        return j4;
    }

    public static final <T> T m0(long j4, @l3.d X2.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        F.p(action, "action");
        return action.N(Long.valueOf(K(j4)), Integer.valueOf(R(j4)), Integer.valueOf(V(j4)), Integer.valueOf(T(j4)));
    }

    public static final double n(long j4, long j5) {
        Comparable X3;
        X3 = kotlin.comparisons.h.X(W(j4), W(j5));
        DurationUnit durationUnit = (DurationUnit) X3;
        return o0(j4, durationUnit) / o0(j5, durationUnit);
    }

    public static final <T> T n0(long j4, @l3.d X2.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        F.p(action, "action");
        return action.f0(Long.valueOf(J(j4)), Integer.valueOf(u(j4)), Integer.valueOf(R(j4)), Integer.valueOf(V(j4)), Integer.valueOf(T(j4)));
    }

    public static final long o(long j4, double d4) {
        int K02;
        K02 = kotlin.math.d.K0(d4);
        if (K02 == d4 && K02 != 0) {
            return p(j4, K02);
        }
        DurationUnit W3 = W(j4);
        return g.l0(o0(j4, W3) / d4, W3);
    }

    public static final double o0(long j4, @l3.d DurationUnit unit) {
        F.p(unit, "unit");
        if (j4 == f52874H) {
            return Double.POSITIVE_INFINITY;
        }
        if (j4 == f52875I) {
            return Double.NEGATIVE_INFINITY;
        }
        return i.a(Y(j4), W(j4), unit);
    }

    public static final long p(long j4, int i4) {
        int U3;
        if (i4 == 0) {
            if (f0(j4)) {
                return f52874H;
            }
            if (e0(j4)) {
                return f52875I;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (c0(j4)) {
            return g.d(Y(j4) / i4);
        }
        if (d0(j4)) {
            U3 = kotlin.math.d.U(i4);
            return j0(j4, U3);
        }
        long j5 = i4;
        long Y3 = Y(j4) / j5;
        if (new kotlin.ranges.o(-4611686018426L, 4611686018426L).q(Y3)) {
            return g.d(g.f(Y3) + (g.f(Y(j4) - (Y3 * j5)) / j5));
        }
        return g.b(Y3);
    }

    public static final int p0(long j4, @l3.d DurationUnit unit) {
        long K3;
        F.p(unit, "unit");
        K3 = u.K(r0(j4, unit), -2147483648L, 2147483647L);
        return (int) K3;
    }

    public static boolean q(long j4, Object obj) {
        return (obj instanceof e) && j4 == ((e) obj).z0();
    }

    @l3.d
    public static final String q0(long j4) {
        boolean z3;
        boolean z4;
        StringBuilder sb = new StringBuilder();
        if (e0(j4)) {
            sb.append('-');
        }
        sb.append("PT");
        long s4 = s(j4);
        long K3 = K(s4);
        int R3 = R(s4);
        int V3 = V(s4);
        int T3 = T(s4);
        if (d0(j4)) {
            K3 = 9999999999999L;
        }
        boolean z5 = false;
        if (K3 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (V3 == 0 && T3 == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (R3 != 0 || (z4 && z3)) {
            z5 = true;
        }
        if (z3) {
            sb.append(K3);
            sb.append('H');
        }
        if (z5) {
            sb.append(R3);
            sb.append('M');
        }
        if (z4 || (!z3 && !z5)) {
            i(j4, sb, V3, T3, 9, androidx.exifinterface.media.a.T4, true);
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    public static final boolean r(long j4, long j5) {
        return j4 == j5;
    }

    public static final long r0(long j4, @l3.d DurationUnit unit) {
        F.p(unit, "unit");
        if (j4 == f52874H) {
            return Long.MAX_VALUE;
        }
        if (j4 == f52875I) {
            return Long.MIN_VALUE;
        }
        return i.b(Y(j4), W(j4), unit);
    }

    public static final long s(long j4) {
        if (e0(j4)) {
            return y0(j4);
        }
        return j4;
    }

    @kotlin.U
    public static /* synthetic */ void t() {
    }

    public static final int u(long j4) {
        if (d0(j4)) {
            return 0;
        }
        return (int) (K(j4) % 24);
    }

    @l3.d
    public static String u0(long j4) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == f52874H) {
            return "Infinity";
        }
        if (j4 == f52875I) {
            return "-Infinity";
        }
        boolean e02 = e0(j4);
        StringBuilder sb = new StringBuilder();
        if (e02) {
            sb.append('-');
        }
        long s4 = s(j4);
        long J3 = J(s4);
        int u3 = u(s4);
        int R3 = R(s4);
        int V3 = V(s4);
        int T3 = T(s4);
        int i4 = 0;
        if (J3 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (u3 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (R3 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (V3 == 0 && T3 == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z3) {
            sb.append(J3);
            sb.append('d');
            i4 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(u3);
            sb.append('h');
            i4 = i5;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(R3);
            sb.append('m');
            i4 = i6;
        }
        if (z6) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (V3 == 0 && !z3 && !z4 && !z5) {
                if (T3 >= 1000000) {
                    i(j4, sb, T3 / g.f52879a, T3 % g.f52879a, 6, "ms", false);
                } else if (T3 >= 1000) {
                    i(j4, sb, T3 / 1000, T3 % 1000, 3, "us", false);
                } else {
                    sb.append(T3);
                    sb.append("ns");
                }
            } else {
                i(j4, sb, V3, T3, 9, "s", false);
            }
            i4 = i7;
        }
        if (e02 && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }

    @k
    @InterfaceC2205l(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void v() {
    }

    @l3.d
    public static final String v0(long j4, @l3.d DurationUnit unit, int i4) {
        int B3;
        F.p(unit, "unit");
        if (i4 >= 0) {
            double o02 = o0(j4, unit);
            if (Double.isInfinite(o02)) {
                return String.valueOf(o02);
            }
            StringBuilder sb = new StringBuilder();
            B3 = u.B(i4, 12);
            sb.append(f.b(o02, B3));
            sb.append(j.h(unit));
            return sb.toString();
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i4).toString());
    }

    public static /* synthetic */ String w0(long j4, DurationUnit durationUnit, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return v0(j4, durationUnit, i4);
    }

    @k
    @InterfaceC2205l(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void x() {
    }

    public static final long x0(long j4, @l3.d DurationUnit unit) {
        F.p(unit, "unit");
        DurationUnit W3 = W(j4);
        if (unit.compareTo(W3) > 0 && !d0(j4)) {
            return g.n0(Y(j4) - (Y(j4) % i.b(1L, unit, W3)), W3);
        }
        return j4;
    }

    public static final long y0(long j4) {
        return g.a(-Y(j4), ((int) j4) & 1);
    }

    @k
    @InterfaceC2205l(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @V(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @InterfaceC2207m(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void z() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e eVar) {
        return k(eVar.z0());
    }

    public boolean equals(Object obj) {
        return q(this.f52876E, obj);
    }

    public int hashCode() {
        return Z(this.f52876E);
    }

    public int k(long j4) {
        return l(this.f52876E, j4);
    }

    @l3.d
    public String toString() {
        return u0(this.f52876E);
    }

    public final /* synthetic */ long z0() {
        return this.f52876E;
    }
}
