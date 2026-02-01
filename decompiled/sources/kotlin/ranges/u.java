package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.random.Random;
import kotlin.ranges.C2212a;
import kotlin.ranges.j;
import kotlin.ranges.m;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes2.dex */
public class u extends t {
    public static final float A(float f4, float f5) {
        return f4 > f5 ? f5 : f4;
    }

    @l3.e
    @Y(version = "1.7")
    public static final Integer A0(@l3.d j jVar) {
        F.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.l());
    }

    @l3.d
    public static final C2212a A1(@l3.d C2212a c2212a, int i4) {
        boolean z3;
        F.p(c2212a, "<this>");
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        t.a(z3, Integer.valueOf(i4));
        C2212a.C0469a c0469a = C2212a.f52447H;
        char l4 = c2212a.l();
        char m4 = c2212a.m();
        if (c2212a.n() <= 0) {
            i4 = -i4;
        }
        return c0469a.a(l4, m4, i4);
    }

    public static int B(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    @l3.e
    @Y(version = "1.7")
    public static final Long B0(@l3.d m mVar) {
        F.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.l());
    }

    @l3.d
    public static j B1(@l3.d j jVar, int i4) {
        boolean z3;
        F.p(jVar, "<this>");
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        t.a(z3, Integer.valueOf(i4));
        j.a aVar = j.f52465H;
        int l4 = jVar.l();
        int m4 = jVar.m();
        if (jVar.n() <= 0) {
            i4 = -i4;
        }
        return aVar.a(l4, m4, i4);
    }

    public static long C(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "floatRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean C0(g gVar, byte b4) {
        F.p(gVar, "<this>");
        return gVar.b(Float.valueOf(b4));
    }

    @l3.d
    public static final m C1(@l3.d m mVar, long j4) {
        boolean z3;
        F.p(mVar, "<this>");
        if (j4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        t.a(z3, Long.valueOf(j4));
        m.a aVar = m.f52475H;
        long l4 = mVar.l();
        long m4 = mVar.m();
        if (mVar.n() <= 0) {
            j4 = -j4;
        }
        return aVar.a(l4, m4, j4);
    }

    @l3.d
    public static final <T extends Comparable<? super T>> T D(@l3.d T t3, @l3.d T maximumValue) {
        F.p(t3, "<this>");
        F.p(maximumValue, "maximumValue");
        if (t3.compareTo(maximumValue) > 0) {
            return maximumValue;
        }
        return t3;
    }

    @W2.i(name = "floatRangeContains")
    public static final boolean D0(@l3.d g<Float> gVar, double d4) {
        F.p(gVar, "<this>");
        return gVar.b(Float.valueOf((float) d4));
    }

    @l3.e
    public static final Byte D1(double d4) {
        if (-128.0d <= d4 && d4 <= 127.0d) {
            return Byte.valueOf((byte) d4);
        }
        return null;
    }

    public static final short E(short s4, short s5) {
        return s4 > s5 ? s5 : s4;
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "floatRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean E0(g gVar, int i4) {
        F.p(gVar, "<this>");
        return gVar.b(Float.valueOf(i4));
    }

    @l3.e
    public static final Byte E1(float f4) {
        if (-128.0f <= f4 && f4 <= 127.0f) {
            return Byte.valueOf((byte) f4);
        }
        return null;
    }

    public static final byte F(byte b4, byte b5, byte b6) {
        if (b5 <= b6) {
            if (b4 < b5) {
                return b5;
            }
            if (b4 > b6) {
                return b6;
            }
            return b4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b6) + " is less than minimum " + ((int) b5) + '.');
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "floatRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean F0(g gVar, long j4) {
        F.p(gVar, "<this>");
        return gVar.b(Float.valueOf((float) j4));
    }

    @l3.e
    public static final Byte F1(int i4) {
        if (new l(-128, kotlinx.coroutines.scheduling.q.f54649c).q(i4)) {
            return Byte.valueOf((byte) i4);
        }
        return null;
    }

    public static final double G(double d4, double d5, double d6) {
        if (d5 <= d6) {
            if (d4 < d5) {
                return d5;
            }
            if (d4 > d6) {
                return d6;
            }
            return d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d6 + " is less than minimum " + d5 + '.');
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "floatRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean G0(g gVar, short s4) {
        F.p(gVar, "<this>");
        return gVar.b(Float.valueOf(s4));
    }

    @l3.e
    public static final Byte G1(long j4) {
        if (new o(-128L, 127L).q(j4)) {
            return Byte.valueOf((byte) j4);
        }
        return null;
    }

    public static float H(float f4, float f5, float f6) {
        if (f5 <= f6) {
            if (f4 < f5) {
                return f5;
            }
            if (f4 > f6) {
                return f6;
            }
            return f4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f6 + " is less than minimum " + f5 + '.');
    }

    @W2.i(name = "intRangeContains")
    public static final boolean H0(@l3.d g<Integer> gVar, byte b4) {
        F.p(gVar, "<this>");
        return gVar.b(Integer.valueOf(b4));
    }

    @l3.e
    public static final Byte H1(short s4) {
        if (L0(new l(-128, kotlinx.coroutines.scheduling.q.f54649c), s4)) {
            return Byte.valueOf((byte) s4);
        }
        return null;
    }

    public static int I(int i4, int i5, int i6) {
        if (i5 <= i6) {
            if (i4 < i5) {
                return i5;
            }
            if (i4 > i6) {
                return i6;
            }
            return i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i5 + '.');
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "intRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean I0(g gVar, double d4) {
        F.p(gVar, "<this>");
        Integer I12 = I1(d4);
        if (I12 != null) {
            return gVar.b(I12);
        }
        return false;
    }

    @l3.e
    public static final Integer I1(double d4) {
        if (-2.147483648E9d <= d4 && d4 <= 2.147483647E9d) {
            return Integer.valueOf((int) d4);
        }
        return null;
    }

    public static final int J(int i4, @l3.d g<Integer> range) {
        F.p(range, "range");
        if (range instanceof f) {
            return ((Number) N(Integer.valueOf(i4), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i4 < range.c().intValue()) {
                return range.c().intValue();
            }
            if (i4 > range.k().intValue()) {
                return range.k().intValue();
            }
            return i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "intRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean J0(g gVar, float f4) {
        F.p(gVar, "<this>");
        Integer J12 = J1(f4);
        if (J12 != null) {
            return gVar.b(J12);
        }
        return false;
    }

    @l3.e
    public static final Integer J1(float f4) {
        if (-2.14748365E9f <= f4 && f4 <= 2.14748365E9f) {
            return Integer.valueOf((int) f4);
        }
        return null;
    }

    public static long K(long j4, long j5, long j6) {
        if (j5 <= j6) {
            if (j4 < j5) {
                return j5;
            }
            if (j4 > j6) {
                return j6;
            }
            return j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + '.');
    }

    @W2.i(name = "intRangeContains")
    public static boolean K0(@l3.d g<Integer> gVar, long j4) {
        F.p(gVar, "<this>");
        Integer K12 = K1(j4);
        if (K12 != null) {
            return gVar.b(K12);
        }
        return false;
    }

    @l3.e
    public static final Integer K1(long j4) {
        if (new o(-2147483648L, 2147483647L).q(j4)) {
            return Integer.valueOf((int) j4);
        }
        return null;
    }

    public static long L(long j4, @l3.d g<Long> range) {
        F.p(range, "range");
        if (range instanceof f) {
            return ((Number) N(Long.valueOf(j4), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j4 < range.c().longValue()) {
                return range.c().longValue();
            }
            if (j4 > range.k().longValue()) {
                return range.k().longValue();
            }
            return j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @W2.i(name = "intRangeContains")
    public static final boolean L0(@l3.d g<Integer> gVar, short s4) {
        F.p(gVar, "<this>");
        return gVar.b(Integer.valueOf(s4));
    }

    @l3.e
    public static final Long L1(double d4) {
        if (-9.223372036854776E18d <= d4 && d4 <= 9.223372036854776E18d) {
            return Long.valueOf((long) d4);
        }
        return null;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> T M(@l3.d T t3, @l3.e T t4, @l3.e T t5) {
        F.p(t3, "<this>");
        if (t4 != null && t5 != null) {
            if (t4.compareTo(t5) <= 0) {
                if (t3.compareTo(t4) < 0) {
                    return t4;
                }
                if (t3.compareTo(t5) > 0) {
                    return t5;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t5 + " is less than minimum " + t4 + '.');
            }
        } else {
            if (t4 != null && t3.compareTo(t4) < 0) {
                return t4;
            }
            if (t5 != null && t3.compareTo(t5) > 0) {
                return t5;
            }
        }
        return t3;
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "intRangeContains")
    @Y(version = "1.9")
    public static final boolean M0(@l3.d r<Integer> rVar, byte b4) {
        F.p(rVar, "<this>");
        return rVar.b(Integer.valueOf(b4));
    }

    @l3.e
    public static final Long M1(float f4) {
        if (-9.223372E18f <= f4 && f4 <= 9.223372E18f) {
            return Long.valueOf(f4);
        }
        return null;
    }

    @l3.d
    @Y(version = "1.1")
    public static final <T extends Comparable<? super T>> T N(@l3.d T t3, @l3.d f<T> range) {
        F.p(t3, "<this>");
        F.p(range, "range");
        if (!range.isEmpty()) {
            if (range.d(t3, range.c()) && !range.d(range.c(), t3)) {
                return range.c();
            }
            if (range.d(range.k(), t3) && !range.d(t3, range.k())) {
                return range.k();
            }
            return t3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "intRangeContains")
    @Y(version = "1.9")
    public static final boolean N0(@l3.d r<Integer> rVar, long j4) {
        F.p(rVar, "<this>");
        Integer K12 = K1(j4);
        if (K12 != null) {
            return rVar.b(K12);
        }
        return false;
    }

    @l3.e
    public static final Short N1(double d4) {
        if (-32768.0d <= d4 && d4 <= 32767.0d) {
            return Short.valueOf((short) d4);
        }
        return null;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> T O(@l3.d T t3, @l3.d g<T> range) {
        F.p(t3, "<this>");
        F.p(range, "range");
        if (range instanceof f) {
            return (T) N(t3, (f) range);
        }
        if (!range.isEmpty()) {
            if (t3.compareTo(range.c()) < 0) {
                return range.c();
            }
            if (t3.compareTo(range.k()) > 0) {
                return range.k();
            }
            return t3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "intRangeContains")
    @Y(version = "1.9")
    public static final boolean O0(@l3.d r<Integer> rVar, short s4) {
        F.p(rVar, "<this>");
        return rVar.b(Integer.valueOf(s4));
    }

    @l3.e
    public static final Short O1(float f4) {
        if (-32768.0f <= f4 && f4 <= 32767.0f) {
            return Short.valueOf((short) f4);
        }
        return null;
    }

    public static final short P(short s4, short s5, short s6) {
        if (s5 <= s6) {
            if (s4 < s5) {
                return s5;
            }
            if (s4 > s6) {
                return s6;
            }
            return s4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s6) + " is less than minimum " + ((int) s5) + '.');
    }

    @Y(version = "1.7")
    public static final char P0(@l3.d C2212a c2212a) {
        F.p(c2212a, "<this>");
        if (!c2212a.isEmpty()) {
            return c2212a.m();
        }
        throw new NoSuchElementException("Progression " + c2212a + " is empty.");
    }

    @l3.e
    public static final Short P1(int i4) {
        if (new l(-32768, 32767).q(i4)) {
            return Short.valueOf((short) i4);
        }
        return null;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final boolean Q(C2214c c2214c, Character ch) {
        F.p(c2214c, "<this>");
        if (ch != null && c2214c.q(ch.charValue())) {
            return true;
        }
        return false;
    }

    @Y(version = "1.7")
    public static final int Q0(@l3.d j jVar) {
        F.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.m();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @l3.e
    public static final Short Q1(long j4) {
        if (new o(-32768L, 32767L).q(j4)) {
            return Short.valueOf((short) j4);
        }
        return null;
    }

    @kotlin.internal.f
    private static final boolean R(l lVar, byte b4) {
        F.p(lVar, "<this>");
        return H0(lVar, b4);
    }

    @Y(version = "1.7")
    public static final long R0(@l3.d m mVar) {
        F.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.m();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @l3.d
    public static final C2214c R1(char c4, char c5) {
        if (F.t(c5, 0) <= 0) {
            return C2214c.f52455I.a();
        }
        return new C2214c(c4, (char) (c5 - 1));
    }

    @kotlin.internal.f
    private static final boolean S(l lVar, long j4) {
        boolean K02;
        F.p(lVar, "<this>");
        K02 = K0(lVar, j4);
        return K02;
    }

    @l3.e
    @Y(version = "1.7")
    public static final Character S0(@l3.d C2212a c2212a) {
        F.p(c2212a, "<this>");
        if (c2212a.isEmpty()) {
            return null;
        }
        return Character.valueOf(c2212a.m());
    }

    @l3.d
    public static final l S1(byte b4, byte b5) {
        return new l(b4, b5 - 1);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final boolean T(l lVar, Integer num) {
        F.p(lVar, "<this>");
        if (num != null && lVar.q(num.intValue())) {
            return true;
        }
        return false;
    }

    @l3.e
    @Y(version = "1.7")
    public static final Integer T0(@l3.d j jVar) {
        F.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.m());
    }

    @l3.d
    public static final l T1(byte b4, int i4) {
        if (i4 <= Integer.MIN_VALUE) {
            return l.f52473I.a();
        }
        return new l(b4, i4 - 1);
    }

    @kotlin.internal.f
    private static final boolean U(l lVar, short s4) {
        F.p(lVar, "<this>");
        return L0(lVar, s4);
    }

    @l3.e
    @Y(version = "1.7")
    public static final Long U0(@l3.d m mVar) {
        F.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.m());
    }

    @l3.d
    public static final l U1(byte b4, short s4) {
        return new l(b4, s4 - 1);
    }

    @kotlin.internal.f
    private static final boolean V(o oVar, byte b4) {
        F.p(oVar, "<this>");
        return V0(oVar, b4);
    }

    @W2.i(name = "longRangeContains")
    public static final boolean V0(@l3.d g<Long> gVar, byte b4) {
        F.p(gVar, "<this>");
        return gVar.b(Long.valueOf(b4));
    }

    @l3.d
    public static final l V1(int i4, byte b4) {
        return new l(i4, b4 - 1);
    }

    @kotlin.internal.f
    private static final boolean W(o oVar, int i4) {
        F.p(oVar, "<this>");
        return Y0(oVar, i4);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "longRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean W0(g gVar, double d4) {
        F.p(gVar, "<this>");
        Long L12 = L1(d4);
        if (L12 != null) {
            return gVar.b(L12);
        }
        return false;
    }

    @l3.d
    public static l W1(int i4, int i5) {
        if (i5 <= Integer.MIN_VALUE) {
            return l.f52473I.a();
        }
        return new l(i4, i5 - 1);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final boolean X(o oVar, Long l4) {
        F.p(oVar, "<this>");
        if (l4 != null && oVar.q(l4.longValue())) {
            return true;
        }
        return false;
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "longRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean X0(g gVar, float f4) {
        F.p(gVar, "<this>");
        Long M12 = M1(f4);
        if (M12 != null) {
            return gVar.b(M12);
        }
        return false;
    }

    @l3.d
    public static final l X1(int i4, short s4) {
        return new l(i4, s4 - 1);
    }

    @kotlin.internal.f
    private static final boolean Y(o oVar, short s4) {
        F.p(oVar, "<this>");
        return Z0(oVar, s4);
    }

    @W2.i(name = "longRangeContains")
    public static final boolean Y0(@l3.d g<Long> gVar, int i4) {
        F.p(gVar, "<this>");
        return gVar.b(Long.valueOf(i4));
    }

    @l3.d
    public static final l Y1(short s4, byte b4) {
        return new l(s4, b4 - 1);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "doubleRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean Z(g gVar, byte b4) {
        F.p(gVar, "<this>");
        return gVar.b(Double.valueOf(b4));
    }

    @W2.i(name = "longRangeContains")
    public static final boolean Z0(@l3.d g<Long> gVar, short s4) {
        F.p(gVar, "<this>");
        return gVar.b(Long.valueOf(s4));
    }

    @l3.d
    public static final l Z1(short s4, int i4) {
        if (i4 <= Integer.MIN_VALUE) {
            return l.f52473I.a();
        }
        return new l(s4, i4 - 1);
    }

    @W2.i(name = "doubleRangeContains")
    public static final boolean a0(@l3.d g<Double> gVar, float f4) {
        F.p(gVar, "<this>");
        return gVar.b(Double.valueOf(f4));
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "longRangeContains")
    @Y(version = "1.9")
    public static final boolean a1(@l3.d r<Long> rVar, byte b4) {
        F.p(rVar, "<this>");
        return rVar.b(Long.valueOf(b4));
    }

    @l3.d
    public static final l a2(short s4, short s5) {
        return new l(s4, s5 - 1);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "doubleRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean b0(g gVar, int i4) {
        F.p(gVar, "<this>");
        return gVar.b(Double.valueOf(i4));
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "longRangeContains")
    @Y(version = "1.9")
    public static final boolean b1(@l3.d r<Long> rVar, int i4) {
        F.p(rVar, "<this>");
        return rVar.b(Long.valueOf(i4));
    }

    @l3.d
    public static final o b2(byte b4, long j4) {
        if (j4 <= Long.MIN_VALUE) {
            return o.f52483I.a();
        }
        return new o(b4, j4 - 1);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "doubleRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean c0(g gVar, long j4) {
        F.p(gVar, "<this>");
        return gVar.b(Double.valueOf(j4));
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "longRangeContains")
    @Y(version = "1.9")
    public static final boolean c1(@l3.d r<Long> rVar, short s4) {
        F.p(rVar, "<this>");
        return rVar.b(Long.valueOf(s4));
    }

    @l3.d
    public static final o c2(int i4, long j4) {
        if (j4 <= Long.MIN_VALUE) {
            return o.f52483I.a();
        }
        return new o(i4, j4 - 1);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "doubleRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean d0(g gVar, short s4) {
        F.p(gVar, "<this>");
        return gVar.b(Double.valueOf(s4));
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final char d1(C2214c c2214c) {
        F.p(c2214c, "<this>");
        return e1(c2214c, Random.f52425E);
    }

    @l3.d
    public static final o d2(long j4, byte b4) {
        return new o(j4, b4 - 1);
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "doubleRangeContains")
    @Y(version = "1.9")
    public static final boolean e0(@l3.d r<Double> rVar, float f4) {
        F.p(rVar, "<this>");
        return rVar.b(Double.valueOf(f4));
    }

    @Y(version = "1.3")
    public static final char e1(@l3.d C2214c c2214c, @l3.d Random random) {
        F.p(c2214c, "<this>");
        F.p(random, "random");
        try {
            return (char) random.n(c2214c.l(), c2214c.m() + 1);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @l3.d
    public static final o e2(long j4, int i4) {
        return new o(j4, i4 - 1);
    }

    @l3.d
    public static final C2212a f0(char c4, char c5) {
        return C2212a.f52447H.a(c4, c5, -1);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final int f1(l lVar) {
        int g12;
        F.p(lVar, "<this>");
        g12 = g1(lVar, Random.f52425E);
        return g12;
    }

    @l3.d
    public static final o f2(long j4, long j5) {
        if (j5 <= Long.MIN_VALUE) {
            return o.f52483I.a();
        }
        return new o(j4, j5 - 1);
    }

    @l3.d
    public static final j g0(byte b4, byte b5) {
        return j.f52465H.a(b4, b5, -1);
    }

    @Y(version = "1.3")
    public static int g1(@l3.d l lVar, @l3.d Random random) {
        F.p(lVar, "<this>");
        F.p(random, "random");
        try {
            return kotlin.random.f.h(random, lVar);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @l3.d
    public static final o g2(long j4, short s4) {
        return new o(j4, s4 - 1);
    }

    @l3.d
    public static final j h0(byte b4, int i4) {
        return j.f52465H.a(b4, i4, -1);
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final long h1(o oVar) {
        F.p(oVar, "<this>");
        return i1(oVar, Random.f52425E);
    }

    @l3.d
    public static final o h2(short s4, long j4) {
        if (j4 <= Long.MIN_VALUE) {
            return o.f52483I.a();
        }
        return new o(s4, j4 - 1);
    }

    @l3.d
    public static final j i0(byte b4, short s4) {
        return j.f52465H.a(b4, s4, -1);
    }

    @Y(version = "1.3")
    public static final long i1(@l3.d o oVar, @l3.d Random random) {
        F.p(oVar, "<this>");
        F.p(random, "random");
        try {
            return kotlin.random.f.i(random, oVar);
        } catch (IllegalArgumentException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "byteRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean j(g gVar, double d4) {
        F.p(gVar, "<this>");
        Byte D12 = D1(d4);
        if (D12 != null) {
            return gVar.b(D12);
        }
        return false;
    }

    @l3.d
    public static final j j0(int i4, byte b4) {
        return j.f52465H.a(i4, b4, -1);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Character j1(C2214c c2214c) {
        F.p(c2214c, "<this>");
        return k1(c2214c, Random.f52425E);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "byteRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean k(g gVar, float f4) {
        F.p(gVar, "<this>");
        Byte E12 = E1(f4);
        if (E12 != null) {
            return gVar.b(E12);
        }
        return false;
    }

    @l3.d
    public static j k0(int i4, int i5) {
        return j.f52465H.a(i4, i5, -1);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final Character k1(@l3.d C2214c c2214c, @l3.d Random random) {
        F.p(c2214c, "<this>");
        F.p(random, "random");
        if (c2214c.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.n(c2214c.l(), c2214c.m() + 1));
    }

    @W2.i(name = "byteRangeContains")
    public static final boolean l(@l3.d g<Byte> gVar, int i4) {
        F.p(gVar, "<this>");
        Byte F12 = F1(i4);
        if (F12 != null) {
            return gVar.b(F12);
        }
        return false;
    }

    @l3.d
    public static final j l0(int i4, short s4) {
        return j.f52465H.a(i4, s4, -1);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Integer l1(l lVar) {
        F.p(lVar, "<this>");
        return m1(lVar, Random.f52425E);
    }

    @W2.i(name = "byteRangeContains")
    public static final boolean m(@l3.d g<Byte> gVar, long j4) {
        F.p(gVar, "<this>");
        Byte G12 = G1(j4);
        if (G12 != null) {
            return gVar.b(G12);
        }
        return false;
    }

    @l3.d
    public static final j m0(short s4, byte b4) {
        return j.f52465H.a(s4, b4, -1);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final Integer m1(@l3.d l lVar, @l3.d Random random) {
        F.p(lVar, "<this>");
        F.p(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.f.h(random, lVar));
    }

    @W2.i(name = "byteRangeContains")
    public static final boolean n(@l3.d g<Byte> gVar, short s4) {
        F.p(gVar, "<this>");
        Byte H12 = H1(s4);
        if (H12 != null) {
            return gVar.b(H12);
        }
        return false;
    }

    @l3.d
    public static final j n0(short s4, int i4) {
        return j.f52465H.a(s4, i4, -1);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Long n1(o oVar) {
        F.p(oVar, "<this>");
        return o1(oVar, Random.f52425E);
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "byteRangeContains")
    @Y(version = "1.9")
    public static final boolean o(@l3.d r<Byte> rVar, int i4) {
        F.p(rVar, "<this>");
        Byte F12 = F1(i4);
        if (F12 != null) {
            return rVar.b(F12);
        }
        return false;
    }

    @l3.d
    public static final j o0(short s4, short s5) {
        return j.f52465H.a(s4, s5, -1);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final Long o1(@l3.d o oVar, @l3.d Random random) {
        F.p(oVar, "<this>");
        F.p(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.f.i(random, oVar));
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "byteRangeContains")
    @Y(version = "1.9")
    public static final boolean p(@l3.d r<Byte> rVar, long j4) {
        F.p(rVar, "<this>");
        Byte G12 = G1(j4);
        if (G12 != null) {
            return rVar.b(G12);
        }
        return false;
    }

    @l3.d
    public static final m p0(byte b4, long j4) {
        return m.f52475H.a(b4, j4, -1L);
    }

    @l3.d
    public static final C2212a p1(@l3.d C2212a c2212a) {
        F.p(c2212a, "<this>");
        return C2212a.f52447H.a(c2212a.m(), c2212a.l(), -c2212a.n());
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "byteRangeContains")
    @Y(version = "1.9")
    public static final boolean q(@l3.d r<Byte> rVar, short s4) {
        F.p(rVar, "<this>");
        Byte H12 = H1(s4);
        if (H12 != null) {
            return rVar.b(H12);
        }
        return false;
    }

    @l3.d
    public static final m q0(int i4, long j4) {
        return m.f52475H.a(i4, j4, -1L);
    }

    @l3.d
    public static final j q1(@l3.d j jVar) {
        F.p(jVar, "<this>");
        return j.f52465H.a(jVar.m(), jVar.l(), -jVar.n());
    }

    public static final byte r(byte b4, byte b5) {
        return b4 < b5 ? b5 : b4;
    }

    @l3.d
    public static final m r0(long j4, byte b4) {
        return m.f52475H.a(j4, b4, -1L);
    }

    @l3.d
    public static final m r1(@l3.d m mVar) {
        F.p(mVar, "<this>");
        return m.f52475H.a(mVar.m(), mVar.l(), -mVar.n());
    }

    public static final double s(double d4, double d5) {
        return d4 < d5 ? d5 : d4;
    }

    @l3.d
    public static final m s0(long j4, int i4) {
        return m.f52475H.a(j4, i4, -1L);
    }

    @W2.i(name = "shortRangeContains")
    public static final boolean s1(@l3.d g<Short> gVar, byte b4) {
        F.p(gVar, "<this>");
        return gVar.b(Short.valueOf(b4));
    }

    public static final float t(float f4, float f5) {
        return f4 < f5 ? f5 : f4;
    }

    @l3.d
    public static final m t0(long j4, long j5) {
        return m.f52475H.a(j4, j5, -1L);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "shortRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean t1(g gVar, double d4) {
        F.p(gVar, "<this>");
        Short N12 = N1(d4);
        if (N12 != null) {
            return gVar.b(N12);
        }
        return false;
    }

    public static int u(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }

    @l3.d
    public static final m u0(long j4, short s4) {
        return m.f52475H.a(j4, s4, -1L);
    }

    @InterfaceC2205l(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @W2.i(name = "shortRangeContains")
    @InterfaceC2207m(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean u1(g gVar, float f4) {
        F.p(gVar, "<this>");
        Short O12 = O1(f4);
        if (O12 != null) {
            return gVar.b(O12);
        }
        return false;
    }

    public static long v(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    @l3.d
    public static final m v0(short s4, long j4) {
        return m.f52475H.a(s4, j4, -1L);
    }

    @W2.i(name = "shortRangeContains")
    public static final boolean v1(@l3.d g<Short> gVar, int i4) {
        F.p(gVar, "<this>");
        Short P12 = P1(i4);
        if (P12 != null) {
            return gVar.b(P12);
        }
        return false;
    }

    @l3.d
    public static final <T extends Comparable<? super T>> T w(@l3.d T t3, @l3.d T minimumValue) {
        F.p(t3, "<this>");
        F.p(minimumValue, "minimumValue");
        if (t3.compareTo(minimumValue) < 0) {
            return minimumValue;
        }
        return t3;
    }

    @Y(version = "1.7")
    public static final char w0(@l3.d C2212a c2212a) {
        F.p(c2212a, "<this>");
        if (!c2212a.isEmpty()) {
            return c2212a.l();
        }
        throw new NoSuchElementException("Progression " + c2212a + " is empty.");
    }

    @W2.i(name = "shortRangeContains")
    public static final boolean w1(@l3.d g<Short> gVar, long j4) {
        F.p(gVar, "<this>");
        Short Q12 = Q1(j4);
        if (Q12 != null) {
            return gVar.b(Q12);
        }
        return false;
    }

    public static final short x(short s4, short s5) {
        return s4 < s5 ? s5 : s4;
    }

    @Y(version = "1.7")
    public static final int x0(@l3.d j jVar) {
        F.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.l();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "shortRangeContains")
    @Y(version = "1.9")
    public static final boolean x1(@l3.d r<Short> rVar, byte b4) {
        F.p(rVar, "<this>");
        return rVar.b(Short.valueOf(b4));
    }

    public static final byte y(byte b4, byte b5) {
        return b4 > b5 ? b5 : b4;
    }

    @Y(version = "1.7")
    public static final long y0(@l3.d m mVar) {
        F.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.l();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "shortRangeContains")
    @Y(version = "1.9")
    public static final boolean y1(@l3.d r<Short> rVar, int i4) {
        F.p(rVar, "<this>");
        Short P12 = P1(i4);
        if (P12 != null) {
            return rVar.b(P12);
        }
        return false;
    }

    public static final double z(double d4, double d5) {
        return d4 > d5 ? d5 : d4;
    }

    @l3.e
    @Y(version = "1.7")
    public static final Character z0(@l3.d C2212a c2212a) {
        F.p(c2212a, "<this>");
        if (c2212a.isEmpty()) {
            return null;
        }
        return Character.valueOf(c2212a.l());
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "shortRangeContains")
    @Y(version = "1.9")
    public static final boolean z1(@l3.d r<Short> rVar, long j4) {
        F.p(rVar, "<this>");
        Short Q12 = Q1(j4);
        if (Q12 != null) {
            return rVar.b(Q12);
        }
        return false;
    }
}
