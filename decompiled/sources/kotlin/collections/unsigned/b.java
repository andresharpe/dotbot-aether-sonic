package kotlin.collections.unsigned;

import W2.i;
import X2.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.D0;
import kotlin.E0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.InterfaceC2218t;
import kotlin.J0;
import kotlin.N;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.C2101p;
import kotlin.collections.P;
import kotlin.internal.f;
import kotlin.jvm.internal.F;
import kotlin.p0;
import kotlin.q0;
import kotlin.t0;
import kotlin.u0;
import kotlin.x0;
import kotlin.y0;

/* loaded from: classes2.dex */
class b {

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2088c<t0> implements RandomAccess {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int[] f51993G;

        a(int[] iArr) {
            this.f51993G = iArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return u0.r(this.f51993G);
        }

        public boolean c(int i4) {
            return u0.l(this.f51993G, i4);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof t0)) {
                return false;
            }
            return c(((t0) obj).l0());
        }

        public int d(int i4) {
            return u0.p(this.f51993G, i4);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return t0.e(d(i4));
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof t0)) {
                return -1;
            }
            return j(((t0) obj).l0());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            return u0.u(this.f51993G);
        }

        public int j(int i4) {
            int Gf;
            Gf = C2101p.Gf(this.f51993G, i4);
            return Gf;
        }

        public int k(int i4) {
            int Kh;
            Kh = C2101p.Kh(this.f51993G, i4);
            return Kh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof t0)) {
                return -1;
            }
            return k(((t0) obj).l0());
        }
    }

    /* renamed from: kotlin.collections.unsigned.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0458b extends AbstractC2088c<x0> implements RandomAccess {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long[] f51994G;

        C0458b(long[] jArr) {
            this.f51994G = jArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return y0.r(this.f51994G);
        }

        public boolean c(long j4) {
            return y0.l(this.f51994G, j4);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof x0)) {
                return false;
            }
            return c(((x0) obj).l0());
        }

        public long d(int i4) {
            return y0.p(this.f51994G, i4);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return x0.e(d(i4));
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof x0)) {
                return -1;
            }
            return j(((x0) obj).l0());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            return y0.u(this.f51994G);
        }

        public int j(long j4) {
            int Hf;
            Hf = C2101p.Hf(this.f51994G, j4);
            return Hf;
        }

        public int k(long j4) {
            int Lh;
            Lh = C2101p.Lh(this.f51994G, j4);
            return Lh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof x0)) {
                return -1;
            }
            return k(((x0) obj).l0());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends AbstractC2088c<p0> implements RandomAccess {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ byte[] f51995G;

        c(byte[] bArr) {
            this.f51995G = bArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return q0.r(this.f51995G);
        }

        public boolean c(byte b4) {
            return q0.l(this.f51995G, b4);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof p0)) {
                return false;
            }
            return c(((p0) obj).j0());
        }

        public byte d(int i4) {
            return q0.p(this.f51995G, i4);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return p0.e(d(i4));
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof p0)) {
                return -1;
            }
            return j(((p0) obj).j0());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            return q0.u(this.f51995G);
        }

        public int j(byte b4) {
            int Cf;
            Cf = C2101p.Cf(this.f51995G, b4);
            return Cf;
        }

        public int k(byte b4) {
            int Gh;
            Gh = C2101p.Gh(this.f51995G, b4);
            return Gh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof p0)) {
                return -1;
            }
            return k(((p0) obj).j0());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends AbstractC2088c<D0> implements RandomAccess {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ short[] f51996G;

        d(short[] sArr) {
            this.f51996G = sArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return E0.r(this.f51996G);
        }

        public boolean c(short s4) {
            return E0.l(this.f51996G, s4);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof D0)) {
                return false;
            }
            return c(((D0) obj).j0());
        }

        public short d(int i4) {
            return E0.p(this.f51996G, i4);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i4) {
            return D0.e(d(i4));
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof D0)) {
                return -1;
            }
            return j(((D0) obj).j0());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            return E0.u(this.f51996G);
        }

        public int j(short s4) {
            int Jf;
            Jf = C2101p.Jf(this.f51996G, s4);
            return Jf;
        }

        public int k(short s4) {
            int Nh;
            Nh = C2101p.Nh(this.f51996G, s4);
            return Nh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof D0)) {
                return -1;
            }
            return k(((D0) obj).j0());
        }
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ D0 A(short[] maxWith, Comparator comparator) {
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.A6(maxWith, comparator);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ x0 B(long[] maxWith, Comparator comparator) {
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.B6(maxWith, comparator);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ t0 C(int[] min) {
        F.p(min, "$this$min");
        return kotlin.collections.unsigned.c.u7(min);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ p0 D(byte[] min) {
        F.p(min, "$this$min");
        return kotlin.collections.unsigned.c.v7(min);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ x0 E(long[] min) {
        F.p(min, "$this$min");
        return kotlin.collections.unsigned.c.w7(min);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ D0 F(short[] min) {
        F.p(min, "$this$min");
        return kotlin.collections.unsigned.c.x7(min);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> p0 G(byte[] minBy, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (q0.u(minBy)) {
            return null;
        }
        byte p4 = q0.p(minBy, 0);
        qe = C2101p.qe(minBy);
        if (qe != 0) {
            R C3 = selector.C(p0.e(p4));
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(minBy, it.c());
                R C4 = selector.C(p0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return p0.e(p4);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> x0 H(long[] minBy, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (y0.u(minBy)) {
            return null;
        }
        long p4 = y0.p(minBy, 0);
        ve = C2101p.ve(minBy);
        if (ve != 0) {
            R C3 = selector.C(x0.e(p4));
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(minBy, it.c());
                R C4 = selector.C(x0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return x0.e(p4);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> t0 I(int[] minBy, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (u0.u(minBy)) {
            return null;
        }
        int p4 = u0.p(minBy, 0);
        ue = C2101p.ue(minBy);
        if (ue != 0) {
            R C3 = selector.C(t0.e(p4));
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(minBy, it.c());
                R C4 = selector.C(t0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return t0.e(p4);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> D0 J(short[] minBy, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(minBy, "$this$minBy");
        F.p(selector, "selector");
        if (E0.u(minBy)) {
            return null;
        }
        short p4 = E0.p(minBy, 0);
        xe = C2101p.xe(minBy);
        if (xe != 0) {
            R C3 = selector.C(D0.e(p4));
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(minBy, it.c());
                R C4 = selector.C(D0.e(p5));
                if (C3.compareTo(C4) > 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return D0.e(p4);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ p0 K(byte[] minWith, Comparator comparator) {
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.C7(minWith, comparator);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ t0 L(int[] minWith, Comparator comparator) {
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.D7(minWith, comparator);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ D0 M(short[] minWith, Comparator comparator) {
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.E7(minWith, comparator);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ x0 N(long[] minWith, Comparator comparator) {
        F.p(minWith, "$this$minWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.F7(minWith, comparator);
    }

    @InterfaceC2218t
    @i(name = "sumOfBigDecimal")
    @N
    @Y(version = "1.4")
    @f
    private static final BigDecimal O(byte[] sumOf, l<? super p0, ? extends BigDecimal> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = q0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(p0.e(q0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigDecimal")
    @N
    @Y(version = "1.4")
    @f
    private static final BigDecimal P(int[] sumOf, l<? super t0, ? extends BigDecimal> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = u0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(t0.e(u0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigDecimal")
    @N
    @Y(version = "1.4")
    @f
    private static final BigDecimal Q(long[] sumOf, l<? super x0, ? extends BigDecimal> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = y0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(x0.e(y0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigDecimal")
    @N
    @Y(version = "1.4")
    @f
    private static final BigDecimal R(short[] sumOf, l<? super D0, ? extends BigDecimal> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = E0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(D0.e(E0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigInteger")
    @N
    @Y(version = "1.4")
    @f
    private static final BigInteger S(byte[] sumOf, l<? super p0, ? extends BigInteger> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = q0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(p0.e(q0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigInteger")
    @N
    @Y(version = "1.4")
    @f
    private static final BigInteger T(int[] sumOf, l<? super t0, ? extends BigInteger> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = u0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(t0.e(u0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigInteger")
    @N
    @Y(version = "1.4")
    @f
    private static final BigInteger U(long[] sumOf, l<? super x0, ? extends BigInteger> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = y0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(x0.e(y0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @InterfaceC2218t
    @i(name = "sumOfBigInteger")
    @N
    @Y(version = "1.4")
    @f
    private static final BigInteger V(short[] sumOf, l<? super D0, ? extends BigInteger> selector) {
        F.p(sumOf, "$this$sumOf");
        F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        F.o(valueOf, "valueOf(...)");
        int r4 = E0.r(sumOf);
        for (int i4 = 0; i4 < r4; i4++) {
            valueOf = valueOf.add(selector.C(D0.e(E0.p(sumOf, i4))));
            F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<t0> a(@l3.d int[] asList) {
        F.p(asList, "$this$asList");
        return new a(asList);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<p0> b(@l3.d byte[] asList) {
        F.p(asList, "$this$asList");
        return new c(asList);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<x0> c(@l3.d long[] asList) {
        F.p(asList, "$this$asList");
        return new C0458b(asList);
    }

    @l3.d
    @InterfaceC2218t
    @Y(version = "1.3")
    public static final List<D0> d(@l3.d short[] asList) {
        F.p(asList, "$this$asList");
        return new d(asList);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int e(@l3.d int[] binarySearch, int i4, int i5, int i6) {
        F.p(binarySearch, "$this$binarySearch");
        AbstractC2088c.f51901E.d(i5, i6, u0.r(binarySearch));
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int c4 = J0.c(binarySearch[i8], i4);
            if (c4 < 0) {
                i5 = i8 + 1;
            } else if (c4 > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i5 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = u0.r(iArr);
        }
        return e(iArr, i4, i5, i6);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int g(@l3.d short[] binarySearch, short s4, int i4, int i5) {
        F.p(binarySearch, "$this$binarySearch");
        AbstractC2088c.f51901E.d(i4, i5, E0.r(binarySearch));
        int i6 = s4 & D0.f51794H;
        int i7 = i5 - 1;
        while (i4 <= i7) {
            int i8 = (i4 + i7) >>> 1;
            int c4 = J0.c(binarySearch[i8], i6);
            if (c4 < 0) {
                i4 = i8 + 1;
            } else if (c4 > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = E0.r(sArr);
        }
        return g(sArr, s4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int i(@l3.d long[] binarySearch, long j4, int i4, int i5) {
        F.p(binarySearch, "$this$binarySearch");
        AbstractC2088c.f51901E.d(i4, i5, y0.r(binarySearch));
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int g4 = J0.g(binarySearch[i7], j4);
            if (g4 < 0) {
                i4 = i7 + 1;
            } else if (g4 > 0) {
                i6 = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = y0.r(jArr);
        }
        return i(jArr, j4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    public static final int k(@l3.d byte[] binarySearch, byte b4, int i4, int i5) {
        F.p(binarySearch, "$this$binarySearch");
        AbstractC2088c.f51901E.d(i4, i5, q0.r(binarySearch));
        int i6 = b4 & 255;
        int i7 = i5 - 1;
        while (i4 <= i7) {
            int i8 = (i4 + i7) >>> 1;
            int c4 = J0.c(binarySearch[i8], i6);
            if (c4 < 0) {
                i4 = i8 + 1;
            } else if (c4 > 0) {
                i7 = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = q0.r(bArr);
        }
        return k(bArr, b4, i4, i5);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final byte m(byte[] elementAt, int i4) {
        F.p(elementAt, "$this$elementAt");
        return q0.p(elementAt, i4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final short n(short[] elementAt, int i4) {
        F.p(elementAt, "$this$elementAt");
        return E0.p(elementAt, i4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final int o(int[] elementAt, int i4) {
        F.p(elementAt, "$this$elementAt");
        return u0.p(elementAt, i4);
    }

    @InterfaceC2218t
    @Y(version = "1.3")
    @f
    private static final long p(long[] elementAt, int i4) {
        F.p(elementAt, "$this$elementAt");
        return y0.p(elementAt, i4);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ t0 q(int[] max) {
        F.p(max, "$this$max");
        return kotlin.collections.unsigned.c.q6(max);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ p0 r(byte[] max) {
        F.p(max, "$this$max");
        return kotlin.collections.unsigned.c.r6(max);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ x0 s(long[] max) {
        F.p(max, "$this$max");
        return kotlin.collections.unsigned.c.s6(max);
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ D0 t(short[] max) {
        F.p(max, "$this$max");
        return kotlin.collections.unsigned.c.t6(max);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> p0 u(byte[] maxBy, l<? super p0, ? extends R> selector) {
        int qe;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (q0.u(maxBy)) {
            return null;
        }
        byte p4 = q0.p(maxBy, 0);
        qe = C2101p.qe(maxBy);
        if (qe != 0) {
            R C3 = selector.C(p0.e(p4));
            P it = new kotlin.ranges.l(1, qe).iterator();
            while (it.hasNext()) {
                byte p5 = q0.p(maxBy, it.c());
                R C4 = selector.C(p0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return p0.e(p4);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> x0 v(long[] maxBy, l<? super x0, ? extends R> selector) {
        int ve;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (y0.u(maxBy)) {
            return null;
        }
        long p4 = y0.p(maxBy, 0);
        ve = C2101p.ve(maxBy);
        if (ve != 0) {
            R C3 = selector.C(x0.e(p4));
            P it = new kotlin.ranges.l(1, ve).iterator();
            while (it.hasNext()) {
                long p5 = y0.p(maxBy, it.c());
                R C4 = selector.C(x0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return x0.e(p4);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> t0 w(int[] maxBy, l<? super t0, ? extends R> selector) {
        int ue;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (u0.u(maxBy)) {
            return null;
        }
        int p4 = u0.p(maxBy, 0);
        ue = C2101p.ue(maxBy);
        if (ue != 0) {
            R C3 = selector.C(t0.e(p4));
            P it = new kotlin.ranges.l(1, ue).iterator();
            while (it.hasNext()) {
                int p5 = u0.p(maxBy, it.c());
                R C4 = selector.C(t0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return t0.e(p4);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    @f
    private static final /* synthetic */ <R extends Comparable<? super R>> D0 x(short[] maxBy, l<? super D0, ? extends R> selector) {
        int xe;
        F.p(maxBy, "$this$maxBy");
        F.p(selector, "selector");
        if (E0.u(maxBy)) {
            return null;
        }
        short p4 = E0.p(maxBy, 0);
        xe = C2101p.xe(maxBy);
        if (xe != 0) {
            R C3 = selector.C(D0.e(p4));
            P it = new kotlin.ranges.l(1, xe).iterator();
            while (it.hasNext()) {
                short p5 = E0.p(maxBy, it.c());
                R C4 = selector.C(D0.e(p5));
                if (C3.compareTo(C4) < 0) {
                    p4 = p5;
                    C3 = C4;
                }
            }
        }
        return D0.e(p4);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ p0 y(byte[] maxWith, Comparator comparator) {
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.y6(maxWith, comparator);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2218t
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @Y(version = "1.3")
    public static final /* synthetic */ t0 z(int[] maxWith, Comparator comparator) {
        F.p(maxWith, "$this$maxWith");
        F.p(comparator, "comparator");
        return kotlin.collections.unsigned.c.z6(maxWith, comparator);
    }
}
