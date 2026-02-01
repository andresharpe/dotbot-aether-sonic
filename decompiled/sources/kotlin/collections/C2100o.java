package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;

@kotlin.jvm.internal.U({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n13896#2,14:3043\n13919#2,14:3057\n13942#2,14:3071\n13965#2,14:3085\n13988#2,14:3099\n14011#2,14:3113\n14034#2,14:3127\n14057#2,14:3141\n14080#2,14:3155\n16482#2,14:3169\n16505#2,14:3183\n16528#2,14:3197\n16551#2,14:3211\n16574#2,14:3225\n16597#2,14:3239\n16620#2,14:3253\n16643#2,14:3267\n16666#2,14:3281\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2434#1:3043,14\n2441#1:3057,14\n2448#1:3071,14\n2455#1:3085,14\n2462#1:3099,14\n2469#1:3113,14\n2476#1:3127,14\n2483#1:3141,14\n2490#1:3155,14\n2632#1:3169,14\n2639#1:3183,14\n2646#1:3197,14\n2653#1:3211,14\n2660#1:3225,14\n2667#1:3239,14\n2674#1:3253,14\n2681#1:3267,14\n2688#1:3281,14\n*E\n"})
/* renamed from: kotlin.collections.o */
/* loaded from: classes2.dex */
public class C2100o extends C2099n {

    /* renamed from: kotlin.collections.o$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2088c<Byte> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ byte[] f51956G;

        a(byte[] bArr) {
            this.f51956G = bArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51956G.length;
        }

        public boolean c(byte b4) {
            boolean m8;
            m8 = C2101p.m8(this.f51956G, b4);
            return m8;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            return c(((Number) obj).byteValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Byte get(int i4) {
            return Byte.valueOf(this.f51956G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return j(((Number) obj).byteValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51956G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(byte b4) {
            int Cf;
            Cf = C2101p.Cf(this.f51956G, b4);
            return Cf;
        }

        public int k(byte b4) {
            int Gh;
            Gh = C2101p.Gh(this.f51956G, b4);
            return Gh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return k(((Number) obj).byteValue());
        }
    }

    /* renamed from: kotlin.collections.o$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC2088c<Short> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ short[] f51957G;

        b(short[] sArr) {
            this.f51957G = sArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51957G.length;
        }

        public boolean c(short s4) {
            boolean t8;
            t8 = C2101p.t8(this.f51957G, s4);
            return t8;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            return c(((Number) obj).shortValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Short get(int i4) {
            return Short.valueOf(this.f51957G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return j(((Number) obj).shortValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51957G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(short s4) {
            int Jf;
            Jf = C2101p.Jf(this.f51957G, s4);
            return Jf;
        }

        public int k(short s4) {
            int Nh;
            Nh = C2101p.Nh(this.f51957G, s4);
            return Nh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return k(((Number) obj).shortValue());
        }
    }

    /* renamed from: kotlin.collections.o$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC2088c<Integer> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ int[] f51958G;

        c(int[] iArr) {
            this.f51958G = iArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51958G.length;
        }

        public boolean c(int i4) {
            boolean q8;
            q8 = C2101p.q8(this.f51958G, i4);
            return q8;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return c(((Number) obj).intValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Integer get(int i4) {
            return Integer.valueOf(this.f51958G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return j(((Number) obj).intValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51958G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(int i4) {
            int Gf;
            Gf = C2101p.Gf(this.f51958G, i4);
            return Gf;
        }

        public int k(int i4) {
            int Kh;
            Kh = C2101p.Kh(this.f51958G, i4);
            return Kh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return k(((Number) obj).intValue());
        }
    }

    /* renamed from: kotlin.collections.o$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC2088c<Long> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ long[] f51959G;

        d(long[] jArr) {
            this.f51959G = jArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51959G.length;
        }

        public boolean c(long j4) {
            boolean r8;
            r8 = C2101p.r8(this.f51959G, j4);
            return r8;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return c(((Number) obj).longValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Long get(int i4) {
            return Long.valueOf(this.f51959G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return j(((Number) obj).longValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51959G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(long j4) {
            int Hf;
            Hf = C2101p.Hf(this.f51959G, j4);
            return Hf;
        }

        public int k(long j4) {
            int Lh;
            Lh = C2101p.Lh(this.f51959G, j4);
            return Lh;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return k(((Number) obj).longValue());
        }
    }

    @kotlin.jvm.internal.U({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12524#2,2:3043\n1687#2,6:3045\n1795#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3043,2\n201#1:3045,6\n202#1:3051,6\n*E\n"})
    /* renamed from: kotlin.collections.o$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC2088c<Float> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ float[] f51960G;

        e(float[] fArr) {
            this.f51960G = fArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51960G.length;
        }

        public boolean c(float f4) {
            for (float f5 : this.f51960G) {
                if (Float.floatToIntBits(f5) == Float.floatToIntBits(f4)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Float)) {
                return false;
            }
            return c(((Number) obj).floatValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Float get(int i4) {
            return Float.valueOf(this.f51960G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return j(((Number) obj).floatValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51960G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(float f4) {
            float[] fArr = this.f51960G;
            int length = fArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (Float.floatToIntBits(fArr[i4]) == Float.floatToIntBits(f4)) {
                    return i4;
                }
            }
            return -1;
        }

        public int k(float f4) {
            float[] fArr = this.f51960G;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i4 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f4)) {
                    return length;
                }
                if (i4 < 0) {
                    return -1;
                }
                length = i4;
            }
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return k(((Number) obj).floatValue());
        }
    }

    @kotlin.jvm.internal.U({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12534#2,2:3043\n1699#2,6:3045\n1807#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"})
    /* renamed from: kotlin.collections.o$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC2088c<Double> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ double[] f51961G;

        f(double[] dArr) {
            this.f51961G = dArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51961G.length;
        }

        public boolean c(double d4) {
            for (double d5 : this.f51961G) {
                if (Double.doubleToLongBits(d5) == Double.doubleToLongBits(d4)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            return c(((Number) obj).doubleValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Double get(int i4) {
            return Double.valueOf(this.f51961G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return j(((Number) obj).doubleValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51961G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(double d4) {
            double[] dArr = this.f51961G;
            int length = dArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (Double.doubleToLongBits(dArr[i4]) == Double.doubleToLongBits(d4)) {
                    return i4;
                }
            }
            return -1;
        }

        public int k(double d4) {
            double[] dArr = this.f51961G;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i4 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d4)) {
                    return length;
                }
                if (i4 < 0) {
                    return -1;
                }
                length = i4;
            }
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return k(((Number) obj).doubleValue());
        }
    }

    /* renamed from: kotlin.collections.o$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC2088c<Boolean> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ boolean[] f51962G;

        g(boolean[] zArr) {
            this.f51962G = zArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51962G.length;
        }

        public boolean c(boolean z3) {
            return C2101p.u8(this.f51962G, z3);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return c(((Boolean) obj).booleanValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Boolean get(int i4) {
            return Boolean.valueOf(this.f51962G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return j(((Boolean) obj).booleanValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51962G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(boolean z3) {
            return C2101p.Kf(this.f51962G, z3);
        }

        public int k(boolean z3) {
            return C2101p.Oh(this.f51962G, z3);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return k(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: kotlin.collections.o$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC2088c<Character> implements RandomAccess {

        /* renamed from: G */
        final /* synthetic */ char[] f51963G;

        h(char[] cArr) {
            this.f51963G = cArr;
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return this.f51963G.length;
        }

        public boolean c(char c4) {
            boolean n8;
            n8 = C2101p.n8(this.f51963G, c4);
            return n8;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            return c(((Character) obj).charValue());
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d */
        public Character get(int i4) {
            return Character.valueOf(this.f51963G[i4]);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return j(((Character) obj).charValue());
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            if (this.f51963G.length == 0) {
                return true;
            }
            return false;
        }

        public int j(char c4) {
            return C2101p.Df(this.f51963G, c4);
        }

        public int k(char c4) {
            return C2101p.Hh(this.f51963G, c4);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return k(((Character) obj).charValue());
        }
    }

    public static final int A(@l3.d int[] iArr, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i5, i6, i4);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static long[] A0(@l3.d long[] jArr, @l3.d long[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(jArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final float A1(float[] fArr, int i4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return fArr[i4];
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object A2(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(objArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.il(objArr, comparator);
    }

    @l3.d
    public static short[] A3(@l3.d short[] sArr, short s4) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger A4(short[] sArr, X2.l<? super Short, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (short s4 : sArr) {
            valueOf = valueOf.add(selector.C(Short.valueOf(s4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int B(@l3.d long[] jArr, long j4, int i4, int i5) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i4, i5, j4);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static <T> T[] B0(@l3.d T[] tArr, @l3.d T[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(tArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final int B1(int[] iArr, int i4) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return iArr[i4];
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short B2(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.jl(sArr, comparator);
    }

    @l3.d
    public static short[] B3(@l3.d short[] sArr, @l3.d short[] elements) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger B4(boolean[] zArr, X2.l<? super Boolean, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (boolean z3 : zArr) {
            valueOf = valueOf.add(selector.C(Boolean.valueOf(z3)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final <T> int C(@l3.d T[] tArr, T t3, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i4, i5, t3);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static short[] C0(@l3.d short[] sArr, @l3.d short[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(sArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final long C1(long[] jArr, int i4) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return jArr[i4];
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte C2(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return C2101p.fn(bArr);
    }

    @l3.d
    public static final boolean[] C3(@l3.d boolean[] zArr, @l3.d Collection<Boolean> elements) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @l3.d
    public static final SortedSet<Byte> C4(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return (SortedSet) C2101p.iy(bArr, new TreeSet());
    }

    public static final <T> int D(@l3.d T[] tArr, T t3, @l3.d Comparator<? super T> comparator, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i4, i5, t3, comparator);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final boolean[] D0(@l3.d boolean[] zArr, @l3.d boolean[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(zArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final <T> T D1(T[] tArr, int i4) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return tArr[i4];
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character D2(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return C2101p.gn(cArr);
    }

    @l3.d
    public static final boolean[] D3(@l3.d boolean[] zArr, boolean z3) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z3;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @l3.d
    public static final SortedSet<Character> D4(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return (SortedSet) C2101p.jy(cArr, new TreeSet());
    }

    public static final int E(@l3.d short[] sArr, short s4, int i4, int i5) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i4, i5, s4);
    }

    public static /* synthetic */ byte[] E0(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        byte[] v02;
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        v02 = v0(bArr, bArr2, i4, i5, i6);
        return v02;
    }

    @kotlin.internal.f
    private static final short E1(short[] sArr, int i4) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return sArr[i4];
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable E2(Comparable[] comparableArr) {
        kotlin.jvm.internal.F.p(comparableArr, "<this>");
        return C2101p.hn(comparableArr);
    }

    @l3.d
    public static final boolean[] E3(@l3.d boolean[] zArr, @l3.d boolean[] elements) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @l3.d
    public static final SortedSet<Double> E4(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return (SortedSet) C2101p.ky(dArr, new TreeSet());
    }

    public static /* synthetic */ int F(byte[] bArr, byte b4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return w(bArr, b4, i4, i5);
    }

    public static /* synthetic */ char[] F0(char[] cArr, char[] cArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = cArr.length;
        }
        return w0(cArr, cArr2, i4, i5, i6);
    }

    @kotlin.internal.f
    private static final boolean F1(boolean[] zArr, int i4) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return zArr[i4];
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double F2(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return C2101p.in(dArr);
    }

    @kotlin.internal.f
    private static final <T> T[] F3(T[] tArr, T t3) {
        Object[] w3;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        w3 = w3(tArr, t3);
        return (T[]) w3;
    }

    @l3.d
    public static final SortedSet<Float> F4(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return (SortedSet) C2101p.ly(fArr, new TreeSet());
    }

    public static /* synthetic */ int G(char[] cArr, char c4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = cArr.length;
        }
        return x(cArr, c4, i4, i5);
    }

    public static /* synthetic */ double[] G0(double[] dArr, double[] dArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = dArr.length;
        }
        return x0(dArr, dArr2, i4, i5, i6);
    }

    public static void G1(@l3.d byte[] bArr, byte b4, int i4, int i5) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Arrays.fill(bArr, i4, i5, b4);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double G2(Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return C2101p.jn(dArr);
    }

    public static final void G3(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @l3.d
    public static final SortedSet<Integer> G4(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return (SortedSet) C2101p.my(iArr, new TreeSet());
    }

    public static /* synthetic */ int H(double[] dArr, double d4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = dArr.length;
        }
        return y(dArr, d4, i4, i5);
    }

    public static /* synthetic */ float[] H0(float[] fArr, float[] fArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = fArr.length;
        }
        return y0(fArr, fArr2, i4, i5, i6);
    }

    public static final void H1(@l3.d char[] cArr, char c4, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        Arrays.fill(cArr, i4, i5, c4);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float H2(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return C2101p.kn(fArr);
    }

    public static final void H3(@l3.d byte[] bArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Arrays.sort(bArr, i4, i5);
    }

    @l3.d
    public static final SortedSet<Long> H4(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return (SortedSet) C2101p.ny(jArr, new TreeSet());
    }

    public static /* synthetic */ int I(float[] fArr, float f4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = fArr.length;
        }
        return z(fArr, f4, i4, i5);
    }

    public static /* synthetic */ int[] I0(int[] iArr, int[] iArr2, int i4, int i5, int i6, int i7, Object obj) {
        int[] z02;
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = iArr.length;
        }
        z02 = z0(iArr, iArr2, i4, i5, i6);
        return z02;
    }

    public static final void I1(@l3.d double[] dArr, double d4, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        Arrays.fill(dArr, i4, i5, d4);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float I2(Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return C2101p.ln(fArr);
    }

    public static final void I3(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @l3.d
    public static final <T extends Comparable<? super T>> SortedSet<T> I4(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        return (SortedSet) C2101p.oy(tArr, new TreeSet());
    }

    public static /* synthetic */ int J(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = iArr.length;
        }
        return A(iArr, i4, i5, i6);
    }

    public static /* synthetic */ long[] J0(long[] jArr, long[] jArr2, int i4, int i5, int i6, int i7, Object obj) {
        long[] A02;
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = jArr.length;
        }
        A02 = A0(jArr, jArr2, i4, i5, i6);
        return A02;
    }

    public static final void J1(@l3.d float[] fArr, float f4, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        Arrays.fill(fArr, i4, i5, f4);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer J2(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return C2101p.mn(iArr);
    }

    public static final void J3(@l3.d char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        Arrays.sort(cArr, i4, i5);
    }

    @l3.d
    public static final <T> SortedSet<T> J4(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return (SortedSet) C2101p.oy(tArr, new TreeSet(comparator));
    }

    public static /* synthetic */ int K(long[] jArr, long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = jArr.length;
        }
        return B(jArr, j4, i4, i5);
    }

    public static /* synthetic */ Object[] K0(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7, Object obj) {
        Object[] B02;
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        B02 = B0(objArr, objArr2, i4, i5, i6);
        return B02;
    }

    public static void K1(@l3.d int[] iArr, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        Arrays.fill(iArr, i5, i6, i4);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long K2(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return C2101p.nn(jArr);
    }

    public static final void K3(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @l3.d
    public static final SortedSet<Short> K4(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return (SortedSet) C2101p.py(sArr, new TreeSet());
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = objArr.length;
        }
        return C(objArr, obj, i4, i5);
    }

    public static /* synthetic */ short[] L0(short[] sArr, short[] sArr2, int i4, int i5, int i6, int i7, Object obj) {
        short[] C02;
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = sArr.length;
        }
        C02 = C0(sArr, sArr2, i4, i5, i6);
        return C02;
    }

    public static void L1(@l3.d long[] jArr, long j4, int i4, int i5) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        Arrays.fill(jArr, i4, i5, j4);
    }

    @InterfaceC2205l(message = "Use minOrNull instead.", replaceWith = @kotlin.V(expression = "this.minOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short L2(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return C2101p.on(sArr);
    }

    public static final void L3(@l3.d double[] dArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        Arrays.sort(dArr, i4, i5);
    }

    @l3.d
    public static final SortedSet<Boolean> L4(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return (SortedSet) C2101p.qy(zArr, new TreeSet());
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = objArr.length;
        }
        return D(objArr, obj, comparator, i4, i5);
    }

    public static /* synthetic */ boolean[] M0(boolean[] zArr, boolean[] zArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = zArr.length;
        }
        return D0(zArr, zArr2, i4, i5, i6);
    }

    public static <T> void M1(@l3.d T[] tArr, T t3, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        Arrays.fill(tArr, i4, i5, t3);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean M2(boolean[] zArr, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        int ye = C2101p.ye(zArr);
        if (ye == 0) {
            return Boolean.valueOf(z3);
        }
        R C3 = selector.C(Boolean.valueOf(z3));
        P it = new kotlin.ranges.l(1, ye).iterator();
        while (it.hasNext()) {
            boolean z4 = zArr[it.c()];
            R C4 = selector.C(Boolean.valueOf(z4));
            if (C3.compareTo(C4) > 0) {
                z3 = z4;
                C3 = C4;
            }
        }
        return Boolean.valueOf(z3);
    }

    public static final void M3(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @l3.d
    public static final Boolean[] M4(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            boolArr[i4] = Boolean.valueOf(zArr[i4]);
        }
        return boolArr;
    }

    public static /* synthetic */ int N(short[] sArr, short s4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = sArr.length;
        }
        return E(sArr, s4, i4, i5);
    }

    @kotlin.internal.f
    private static final byte[] N0(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static void N1(@l3.d short[] sArr, short s4, int i4, int i5) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        Arrays.fill(sArr, i4, i5, s4);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte N2(byte[] bArr, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = C2101p.qe(bArr);
        if (qe == 0) {
            return Byte.valueOf(b4);
        }
        R C3 = selector.C(Byte.valueOf(b4));
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            R C4 = selector.C(Byte.valueOf(b5));
            if (C3.compareTo(C4) > 0) {
                b4 = b5;
                C3 = C4;
            }
        }
        return Byte.valueOf(b4);
    }

    public static final void N3(@l3.d float[] fArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        Arrays.sort(fArr, i4, i5);
    }

    @l3.d
    public static final Byte[] N4(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            bArr2[i4] = Byte.valueOf(bArr[i4]);
        }
        return bArr2;
    }

    @kotlin.internal.h
    @W2.i(name = "contentDeepEqualsInline")
    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> boolean O(T[] tArr, T[] other) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return C2099n.g(tArr, other);
        }
        return Arrays.deepEquals(tArr, other);
    }

    @kotlin.internal.f
    private static final byte[] O0(byte[] bArr, int i4) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void O1(@l3.d boolean[] zArr, boolean z3, int i4, int i5) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        Arrays.fill(zArr, i4, i5, z3);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character O2(char[] cArr, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        int re = C2101p.re(cArr);
        if (re == 0) {
            return Character.valueOf(c4);
        }
        R C3 = selector.C(Character.valueOf(c4));
        P it = new kotlin.ranges.l(1, re).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            R C4 = selector.C(Character.valueOf(c5));
            if (C3.compareTo(C4) > 0) {
                c4 = c5;
                C3 = C4;
            }
        }
        return Character.valueOf(c4);
    }

    public static final void O3(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @l3.d
    public static final Character[] O4(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            chArr[i4] = Character.valueOf(cArr[i4]);
        }
        return chArr;
    }

    @W2.i(name = "contentDeepEqualsNullable")
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> boolean P(T[] tArr, T[] tArr2) {
        if (kotlin.internal.m.a(1, 3, 0)) {
            return C2099n.g(tArr, tArr2);
        }
        return Arrays.deepEquals(tArr, tArr2);
    }

    @kotlin.internal.f
    private static final char[] P0(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void P1(byte[] bArr, byte b4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        G1(bArr, b4, i4, i5);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double P2(double[] dArr, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        int se = C2101p.se(dArr);
        if (se == 0) {
            return Double.valueOf(d4);
        }
        R C3 = selector.C(Double.valueOf(d4));
        P it = new kotlin.ranges.l(1, se).iterator();
        while (it.hasNext()) {
            double d5 = dArr[it.c()];
            R C4 = selector.C(Double.valueOf(d5));
            if (C3.compareTo(C4) > 0) {
                d4 = d5;
                C3 = C4;
            }
        }
        return Double.valueOf(d4);
    }

    public static final void P3(@l3.d int[] iArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        Arrays.sort(iArr, i4, i5);
    }

    @l3.d
    public static final Double[] P4(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            dArr2[i4] = Double.valueOf(dArr[i4]);
        }
        return dArr2;
    }

    @kotlin.internal.h
    @W2.i(name = "contentDeepHashCodeInline")
    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> int Q(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return C2098m.b(tArr);
        }
        return Arrays.deepHashCode(tArr);
    }

    @kotlin.internal.f
    private static final char[] Q0(char[] cArr, int i4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void Q1(char[] cArr, char c4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = cArr.length;
        }
        H1(cArr, c4, i4, i5);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float Q2(float[] fArr, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        int te = C2101p.te(fArr);
        if (te == 0) {
            return Float.valueOf(f4);
        }
        R C3 = selector.C(Float.valueOf(f4));
        P it = new kotlin.ranges.l(1, te).iterator();
        while (it.hasNext()) {
            float f5 = fArr[it.c()];
            R C4 = selector.C(Float.valueOf(f5));
            if (C3.compareTo(C4) > 0) {
                f4 = f5;
                C3 = C4;
            }
        }
        return Float.valueOf(f4);
    }

    public static final void Q3(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @l3.d
    public static final Float[] Q4(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            fArr2[i4] = Float.valueOf(fArr[i4]);
        }
        return fArr2;
    }

    @W2.i(name = "contentDeepHashCodeNullable")
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> int R(T[] tArr) {
        if (kotlin.internal.m.a(1, 3, 0)) {
            return C2098m.b(tArr);
        }
        return Arrays.deepHashCode(tArr);
    }

    @kotlin.internal.f
    private static final double[] R0(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void R1(double[] dArr, double d4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = dArr.length;
        }
        I1(dArr, d4, i4, i5);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer R2(int[] iArr, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = C2101p.ue(iArr);
        if (ue == 0) {
            return Integer.valueOf(i4);
        }
        R C3 = selector.C(Integer.valueOf(i4));
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            R C4 = selector.C(Integer.valueOf(i5));
            if (C3.compareTo(C4) > 0) {
                i4 = i5;
                C3 = C4;
            }
        }
        return Integer.valueOf(i4);
    }

    public static final void R3(@l3.d long[] jArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        Arrays.sort(jArr, i4, i5);
    }

    @l3.d
    public static final Integer[] R4(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    @kotlin.internal.h
    @W2.i(name = "contentDeepToStringInline")
    @kotlin.Y(version = "1.1")
    @kotlin.internal.f
    private static final <T> String S(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return C2099n.h(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        kotlin.jvm.internal.F.o(deepToString, "deepToString(...)");
        return deepToString;
    }

    @kotlin.internal.f
    private static final double[] S0(double[] dArr, int i4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void S1(float[] fArr, float f4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = fArr.length;
        }
        J1(fArr, f4, i4, i5);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long S2(long[] jArr, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = C2101p.ve(jArr);
        if (ve == 0) {
            return Long.valueOf(j4);
        }
        R C3 = selector.C(Long.valueOf(j4));
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            R C4 = selector.C(Long.valueOf(j5));
            if (C3.compareTo(C4) > 0) {
                j4 = j5;
                C3 = C4;
            }
        }
        return Long.valueOf(j4);
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> void S3(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        U3(tArr);
    }

    @l3.d
    public static final Long[] S4(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            lArr[i4] = Long.valueOf(jArr[i4]);
        }
        return lArr;
    }

    @W2.i(name = "contentDeepToStringNullable")
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> String T(T[] tArr) {
        if (kotlin.internal.m.a(1, 3, 0)) {
            return C2099n.h(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        kotlin.jvm.internal.F.o(deepToString, "deepToString(...)");
        return deepToString;
    }

    @kotlin.internal.f
    private static final float[] T0(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void T1(int[] iArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = iArr.length;
        }
        K1(iArr, i4, i5, i6);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T T2(T[] tArr, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        int we = C2101p.we(tArr);
        if (we != 0) {
            R C3 = selector.C(t3);
            P it = new kotlin.ranges.l(1, we).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                R C4 = selector.C(t4);
                if (C3.compareTo(C4) > 0) {
                    t3 = t4;
                    C3 = C4;
                }
            }
        }
        return t3;
    }

    @kotlin.Y(version = "1.4")
    public static final <T extends Comparable<? super T>> void T3(@l3.d T[] tArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        Arrays.sort(tArr, i4, i5);
    }

    @l3.d
    public static final Short[] T4(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            shArr[i4] = Short.valueOf(sArr[i4]);
        }
        return shArr;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean U(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @kotlin.internal.f
    private static final float[] U0(float[] fArr, int i4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void U1(long[] jArr, long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = jArr.length;
        }
        L1(jArr, j4, i4, i5);
    }

    @InterfaceC2205l(message = "Use minByOrNull instead.", replaceWith = @kotlin.V(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short U2(short[] sArr, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = C2101p.xe(sArr);
        if (xe == 0) {
            return Short.valueOf(s4);
        }
        R C3 = selector.C(Short.valueOf(s4));
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            R C4 = selector.C(Short.valueOf(s5));
            if (C3.compareTo(C4) > 0) {
                s4 = s5;
                C3 = C4;
            }
        }
        return Short.valueOf(s4);
    }

    public static final <T> void U3(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean V(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @kotlin.internal.f
    private static final int[] V0(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void V1(Object[] objArr, Object obj, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = objArr.length;
        }
        M1(objArr, obj, i4, i5);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean V2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.zn(zArr, comparator);
    }

    public static final <T> void V3(@l3.d T[] tArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        Arrays.sort(tArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean W(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @kotlin.internal.f
    private static final int[] W0(int[] iArr, int i4) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void W1(short[] sArr, short s4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = sArr.length;
        }
        N1(sArr, s4, i4, i5);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte W2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.An(bArr, comparator);
    }

    public static final void W3(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean X(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @kotlin.internal.f
    private static final long[] X0(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static /* synthetic */ void X1(boolean[] zArr, boolean z3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = zArr.length;
        }
        O1(zArr, z3, i4, i5);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character X2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.Bn(cArr, comparator);
    }

    public static final void X3(@l3.d short[] sArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        Arrays.sort(sArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean Y(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @kotlin.internal.f
    private static final long[] Y0(long[] jArr, int i4) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @l3.d
    public static final <R> List<R> Y1(@l3.d Object[] objArr, @l3.d Class<R> klass) {
        kotlin.jvm.internal.F.p(objArr, "<this>");
        kotlin.jvm.internal.F.p(klass, "klass");
        return (List) Z1(objArr, new ArrayList(), klass);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double Y2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.Cn(dArr, comparator);
    }

    public static /* synthetic */ void Y3(byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        H3(bArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean Z(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @kotlin.internal.f
    private static final <T> T[] Z0(T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.F.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @l3.d
    public static final <C extends Collection<? super R>, R> C Z1(@l3.d Object[] objArr, @l3.d C destination, @l3.d Class<R> klass) {
        kotlin.jvm.internal.F.p(objArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float Z2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.Dn(fArr, comparator);
    }

    public static /* synthetic */ void Z3(char[] cArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = cArr.length;
        }
        J3(cArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> boolean a0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @kotlin.internal.f
    private static final <T> T[] a1(T[] tArr, int i4) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i4);
        kotlin.jvm.internal.F.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte a2(byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return C2101p.Hk(bArr);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer a3(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.En(iArr, comparator);
    }

    public static /* synthetic */ void a4(double[] dArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = dArr.length;
        }
        L3(dArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean b0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @kotlin.internal.f
    private static final short[] b1(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character b2(char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return C2101p.Ik(cArr);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long b3(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.Fn(jArr, comparator);
    }

    public static /* synthetic */ void b4(float[] fArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = fArr.length;
        }
        N3(fArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final boolean c0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @kotlin.internal.f
    private static final short[] c1(short[] sArr, int i4) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable c2(Comparable[] comparableArr) {
        kotlin.jvm.internal.F.p(comparableArr, "<this>");
        return C2101p.Jk(comparableArr);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object c3(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(objArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.Gn(objArr, comparator);
    }

    public static /* synthetic */ void c4(int[] iArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = iArr.length;
        }
        P3(iArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int d0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @kotlin.internal.f
    private static final boolean[] d1(boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double d2(double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return C2101p.Kk(dArr);
    }

    @InterfaceC2205l(message = "Use minWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short d3(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.Hn(sArr, comparator);
    }

    public static /* synthetic */ void d4(long[] jArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = jArr.length;
        }
        R3(jArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int e0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @kotlin.internal.f
    private static final boolean[] e1(boolean[] zArr, int i4) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i4);
        kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double e2(Double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return C2101p.Lk(dArr);
    }

    @l3.d
    public static byte[] e3(@l3.d byte[] bArr, byte b4) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void e4(Comparable[] comparableArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = comparableArr.length;
        }
        T3(comparableArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int f0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static byte[] f1(@l3.d byte[] bArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        C2098m.c(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float f2(float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return C2101p.Mk(fArr);
    }

    @l3.d
    public static final byte[] f3(@l3.d byte[] bArr, @l3.d Collection<Byte> elements) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void f4(Object[] objArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = objArr.length;
        }
        V3(objArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int g0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final char[] g1(@l3.d char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        C2098m.c(i5, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @kotlin.Y(version = "1.1")
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float g2(Float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return C2101p.Nk(fArr);
    }

    @l3.d
    public static byte[] g3(@l3.d byte[] bArr, @l3.d byte[] elements) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void g4(short[] sArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = sArr.length;
        }
        X3(sArr, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int h0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final double[] h1(@l3.d double[] dArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        C2098m.c(i5, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer h2(int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return C2101p.Ok(iArr);
    }

    @l3.d
    public static final char[] h3(@l3.d char[] cArr, char c4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    public static final <T> void h4(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int i0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final float[] i1(@l3.d float[] fArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        C2098m.c(i5, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long i2(long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return C2101p.Pk(jArr);
    }

    @l3.d
    public static final char[] i3(@l3.d char[] cArr, @l3.d Collection<Character> elements) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    public static final <T> void i4(@l3.d T[] tArr, @l3.d Comparator<? super T> comparator, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        Arrays.sort(tArr, i4, i5, comparator);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> int j0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static int[] j1(@l3.d int[] iArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        C2098m.c(i5, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short j2(short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return C2101p.Qk(sArr);
    }

    @l3.d
    public static final char[] j3(@l3.d char[] cArr, @l3.d char[] elements) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    public static /* synthetic */ void j4(Object[] objArr, Comparator comparator, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = objArr.length;
        }
        i4(objArr, comparator, i4, i5);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int k0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static long[] k1(@l3.d long[] jArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        C2098m.c(i5, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean k2(boolean[] zArr, X2.l<? super Boolean, ? extends R> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z3 = zArr[0];
        int ye = C2101p.ye(zArr);
        if (ye == 0) {
            return Boolean.valueOf(z3);
        }
        R C3 = selector.C(Boolean.valueOf(z3));
        P it = new kotlin.ranges.l(1, ye).iterator();
        while (it.hasNext()) {
            boolean z4 = zArr[it.c()];
            R C4 = selector.C(Boolean.valueOf(z4));
            if (C3.compareTo(C4) < 0) {
                z3 = z4;
                C3 = C4;
            }
        }
        return Boolean.valueOf(z3);
    }

    @l3.d
    public static final double[] k3(@l3.d double[] dArr, double d4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal k4(byte[] bArr, X2.l<? super Byte, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (byte b4 : bArr) {
            valueOf = valueOf.add(selector.C(Byte.valueOf(b4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final int l0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <T> T[] l1(@l3.d T[] tArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        C2098m.c(i5, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i4, i5);
        kotlin.jvm.internal.F.o(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte l2(byte[] bArr, X2.l<? super Byte, ? extends R> selector) {
        int qe;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b4 = bArr[0];
        qe = C2101p.qe(bArr);
        if (qe == 0) {
            return Byte.valueOf(b4);
        }
        R C3 = selector.C(Byte.valueOf(b4));
        P it = new kotlin.ranges.l(1, qe).iterator();
        while (it.hasNext()) {
            byte b5 = bArr[it.c()];
            R C4 = selector.C(Byte.valueOf(b5));
            if (C3.compareTo(C4) < 0) {
                b4 = b5;
                C3 = C4;
            }
        }
        return Byte.valueOf(b4);
    }

    @l3.d
    public static final double[] l3(@l3.d double[] dArr, @l3.d Collection<Double> elements) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal l4(char[] cArr, X2.l<? super Character, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (char c4 : cArr) {
            valueOf = valueOf.add(selector.C(Character.valueOf(c4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String m0(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static short[] m1(@l3.d short[] sArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        C2098m.c(i5, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m2(char[] cArr, X2.l<? super Character, ? extends R> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c4 = cArr[0];
        int re = C2101p.re(cArr);
        if (re == 0) {
            return Character.valueOf(c4);
        }
        R C3 = selector.C(Character.valueOf(c4));
        P it = new kotlin.ranges.l(1, re).iterator();
        while (it.hasNext()) {
            char c5 = cArr[it.c()];
            R C4 = selector.C(Character.valueOf(c5));
            if (C3.compareTo(C4) < 0) {
                c4 = c5;
                C3 = C4;
            }
        }
        return Character.valueOf(c4);
    }

    @l3.d
    public static final double[] m3(@l3.d double[] dArr, @l3.d double[] elements) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal m4(double[] dArr, X2.l<? super Double, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (double d4 : dArr) {
            valueOf = valueOf.add(selector.C(Double.valueOf(d4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final List<Byte> n(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return new a(bArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String n0(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @l3.d
    @W2.i(name = "copyOfRange")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final boolean[] n1(@l3.d boolean[] zArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        C2098m.c(i5, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i4, i5);
        kotlin.jvm.internal.F.o(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double n2(double[] dArr, X2.l<? super Double, ? extends R> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d4 = dArr[0];
        int se = C2101p.se(dArr);
        if (se == 0) {
            return Double.valueOf(d4);
        }
        R C3 = selector.C(Double.valueOf(d4));
        P it = new kotlin.ranges.l(1, se).iterator();
        while (it.hasNext()) {
            double d5 = dArr[it.c()];
            R C4 = selector.C(Double.valueOf(d5));
            if (C3.compareTo(C4) < 0) {
                d4 = d5;
                C3 = C4;
            }
        }
        return Double.valueOf(d4);
    }

    @l3.d
    public static final float[] n3(@l3.d float[] fArr, float f4) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal n4(float[] fArr, X2.l<? super Float, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (float f4 : fArr) {
            valueOf = valueOf.add(selector.C(Float.valueOf(f4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final List<Character> o(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return new h(cArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String o0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final byte[] o1(byte[] bArr, int i4, int i5) {
        byte[] f12;
        kotlin.jvm.internal.F.p(bArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            f12 = f1(bArr, i4, i5);
            return f12;
        }
        if (i5 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + bArr.length);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float o2(float[] fArr, X2.l<? super Float, ? extends R> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f4 = fArr[0];
        int te = C2101p.te(fArr);
        if (te == 0) {
            return Float.valueOf(f4);
        }
        R C3 = selector.C(Float.valueOf(f4));
        P it = new kotlin.ranges.l(1, te).iterator();
        while (it.hasNext()) {
            float f5 = fArr[it.c()];
            R C4 = selector.C(Float.valueOf(f5));
            if (C3.compareTo(C4) < 0) {
                f4 = f5;
                C3 = C4;
            }
        }
        return Float.valueOf(f4);
    }

    @l3.d
    public static final float[] o3(@l3.d float[] fArr, @l3.d Collection<Float> elements) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal o4(int[] iArr, X2.l<? super Integer, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (int i4 : iArr) {
            valueOf = valueOf.add(selector.C(Integer.valueOf(i4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static List<Double> p(@l3.d double[] dArr) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return new f(dArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String p0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final char[] p1(char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return g1(cArr, i4, i5);
        }
        if (i5 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + cArr.length);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer p2(int[] iArr, X2.l<? super Integer, ? extends R> selector) {
        int ue;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i4 = iArr[0];
        ue = C2101p.ue(iArr);
        if (ue == 0) {
            return Integer.valueOf(i4);
        }
        R C3 = selector.C(Integer.valueOf(i4));
        P it = new kotlin.ranges.l(1, ue).iterator();
        while (it.hasNext()) {
            int i5 = iArr[it.c()];
            R C4 = selector.C(Integer.valueOf(i5));
            if (C3.compareTo(C4) < 0) {
                i4 = i5;
                C3 = C4;
            }
        }
        return Integer.valueOf(i4);
    }

    @l3.d
    public static final float[] p3(@l3.d float[] fArr, @l3.d float[] elements) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal p4(long[] jArr, X2.l<? super Long, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (long j4 : jArr) {
            valueOf = valueOf.add(selector.C(Long.valueOf(j4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final List<Float> q(@l3.d float[] fArr) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return new e(fArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String q0(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final double[] q1(double[] dArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return h1(dArr, i4, i5);
        }
        if (i5 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + dArr.length);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long q2(long[] jArr, X2.l<? super Long, ? extends R> selector) {
        int ve;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j4 = jArr[0];
        ve = C2101p.ve(jArr);
        if (ve == 0) {
            return Long.valueOf(j4);
        }
        R C3 = selector.C(Long.valueOf(j4));
        P it = new kotlin.ranges.l(1, ve).iterator();
        while (it.hasNext()) {
            long j5 = jArr[it.c()];
            R C4 = selector.C(Long.valueOf(j5));
            if (C3.compareTo(C4) < 0) {
                j4 = j5;
                C3 = C4;
            }
        }
        return Long.valueOf(j4);
    }

    @l3.d
    public static int[] q3(@l3.d int[] iArr, int i4) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> BigDecimal q4(T[] tArr, X2.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (T t3 : tArr) {
            valueOf = valueOf.add(selector.C(t3));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static List<Integer> r(@l3.d int[] iArr) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        return new c(iArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String r0(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final float[] r1(float[] fArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return i1(fArr, i4, i5);
        }
        if (i5 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + fArr.length);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T r2(T[] tArr, X2.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t3 = tArr[0];
        int we = C2101p.we(tArr);
        if (we != 0) {
            R C3 = selector.C(t3);
            P it = new kotlin.ranges.l(1, we).iterator();
            while (it.hasNext()) {
                T t4 = tArr[it.c()];
                R C4 = selector.C(t4);
                if (C3.compareTo(C4) < 0) {
                    t3 = t4;
                    C3 = C4;
                }
            }
        }
        return t3;
    }

    @l3.d
    public static final int[] r3(@l3.d int[] iArr, @l3.d Collection<Integer> elements) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal r4(short[] sArr, X2.l<? super Short, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (short s4 : sArr) {
            valueOf = valueOf.add(selector.C(Short.valueOf(s4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static List<Long> s(@l3.d long[] jArr) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        return new d(jArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> String s0(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final int[] s1(int[] iArr, int i4, int i5) {
        int[] j12;
        kotlin.jvm.internal.F.p(iArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            j12 = j1(iArr, i4, i5);
            return j12;
        }
        if (i5 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + iArr.length);
    }

    @InterfaceC2205l(message = "Use maxByOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short s2(short[] sArr, X2.l<? super Short, ? extends R> selector) {
        int xe;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        xe = C2101p.xe(sArr);
        if (xe == 0) {
            return Short.valueOf(s4);
        }
        R C3 = selector.C(Short.valueOf(s4));
        P it = new kotlin.ranges.l(1, xe).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.c()];
            R C4 = selector.C(Short.valueOf(s5));
            if (C3.compareTo(C4) < 0) {
                s4 = s5;
                C3 = C4;
            }
        }
        return Short.valueOf(s4);
    }

    @l3.d
    public static int[] s3(@l3.d int[] iArr, @l3.d int[] elements) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigDecimal")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigDecimal s4(boolean[] zArr, X2.l<? super Boolean, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (boolean z3 : zArr) {
            valueOf = valueOf.add(selector.C(Boolean.valueOf(z3)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static <T> List<T> t(@l3.d T[] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        List<T> a4 = C2104q.a(tArr);
        kotlin.jvm.internal.F.o(a4, "asList(...)");
        return a4;
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String t0(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final long[] t1(long[] jArr, int i4, int i5) {
        long[] k12;
        kotlin.jvm.internal.F.p(jArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            k12 = k1(jArr, i4, i5);
            return k12;
        }
        if (i5 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + jArr.length);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean t2(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.bl(zArr, comparator);
    }

    @l3.d
    public static long[] t3(@l3.d long[] jArr, long j4) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j4;
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger t4(byte[] bArr, X2.l<? super Byte, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (byte b4 : bArr) {
            valueOf = valueOf.add(selector.C(Byte.valueOf(b4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final List<Short> u(@l3.d short[] sArr) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        return new b(sArr);
    }

    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final String u0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        kotlin.jvm.internal.F.o(arrays, "toString(...)");
        return arrays;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final <T> T[] u1(T[] tArr, int i4, int i5) {
        Object[] l12;
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            l12 = l1(tArr, i4, i5);
            return (T[]) l12;
        }
        if (i5 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i4, i5);
            kotlin.jvm.internal.F.m(tArr2);
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + tArr.length);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte u2(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.cl(bArr, comparator);
    }

    @l3.d
    public static final long[] u3(@l3.d long[] jArr, @l3.d Collection<Long> elements) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger u4(char[] cArr, X2.l<? super Character, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (char c4 : cArr) {
            valueOf = valueOf.add(selector.C(Character.valueOf(c4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @l3.d
    public static final List<Boolean> v(@l3.d boolean[] zArr) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        return new g(zArr);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static byte[] v0(@l3.d byte[] bArr, @l3.d byte[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(bArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final short[] v1(short[] sArr, int i4, int i5) {
        short[] m12;
        kotlin.jvm.internal.F.p(sArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            m12 = m1(sArr, i4, i5);
            return m12;
        }
        if (i5 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + sArr.length);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character v2(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.dl(cArr, comparator);
    }

    @l3.d
    public static long[] v3(@l3.d long[] jArr, @l3.d long[] elements) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger v4(double[] dArr, X2.l<? super Double, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (double d4 : dArr) {
            valueOf = valueOf.add(selector.C(Double.valueOf(d4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int w(@l3.d byte[] bArr, byte b4, int i4, int i5) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i4, i5, b4);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final char[] w0(@l3.d char[] cArr, @l3.d char[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(cArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @W2.i(name = "copyOfRangeInline")
    @kotlin.internal.f
    private static final boolean[] w1(boolean[] zArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(zArr, "<this>");
        if (kotlin.internal.m.a(1, 3, 0)) {
            return n1(zArr, i4, i5);
        }
        if (i5 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i4, i5);
            kotlin.jvm.internal.F.m(copyOfRange);
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i5 + ", size: " + zArr.length);
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double w2(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.el(dArr, comparator);
    }

    @l3.d
    public static <T> T[] w3(@l3.d T[] tArr, T t3) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t3;
        kotlin.jvm.internal.F.m(tArr2);
        return tArr2;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger w4(float[] fArr, X2.l<? super Float, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (float f4 : fArr) {
            valueOf = valueOf.add(selector.C(Float.valueOf(f4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int x(@l3.d char[] cArr, char c4, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i4, i5, c4);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final double[] x0(@l3.d double[] dArr, @l3.d double[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(dArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final byte x1(byte[] bArr, int i4) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return bArr[i4];
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float x2(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.fl(fArr, comparator);
    }

    @l3.d
    public static final <T> T[] x3(@l3.d T[] tArr, @l3.d Collection<? extends T> elements) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.F.m(tArr2);
        return tArr2;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger x4(int[] iArr, X2.l<? super Integer, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (int i4 : iArr) {
            valueOf = valueOf.add(selector.C(Integer.valueOf(i4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int y(@l3.d double[] dArr, double d4, int i4, int i5) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i4, i5, d4);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static final float[] y0(@l3.d float[] fArr, @l3.d float[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(fArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final char y1(char[] cArr, int i4) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return cArr[i4];
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer y2(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.gl(iArr, comparator);
    }

    @l3.d
    public static <T> T[] y3(@l3.d T[] tArr, @l3.d T[] elements) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        kotlin.jvm.internal.F.m(tArr2);
        return tArr2;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final BigInteger y4(long[] jArr, X2.l<? super Long, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (long j4 : jArr) {
            valueOf = valueOf.add(selector.C(Long.valueOf(j4)));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    public static final int z(@l3.d float[] fArr, float f4, int i4, int i5) {
        kotlin.jvm.internal.F.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i4, i5, f4);
    }

    @l3.d
    @kotlin.Y(version = "1.3")
    public static int[] z0(@l3.d int[] iArr, @l3.d int[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(iArr, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        System.arraycopy(iArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    @kotlin.internal.f
    private static final double z1(double[] dArr, int i4) {
        kotlin.jvm.internal.F.p(dArr, "<this>");
        return dArr[i4];
    }

    @InterfaceC2205l(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.V(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC2207m(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long z2(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.F.p(jArr, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        return C2101p.hl(jArr, comparator);
    }

    @l3.d
    public static final short[] z3(@l3.d short[] sArr, @l3.d Collection<Short> elements) {
        kotlin.jvm.internal.F.p(sArr, "<this>");
        kotlin.jvm.internal.F.p(elements, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.F.m(copyOf);
        return copyOf;
    }

    @W2.i(name = "sumOfBigInteger")
    @kotlin.N
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    private static final <T> BigInteger z4(T[] tArr, X2.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(...)");
        for (T t3 : tArr) {
            valueOf = valueOf.add(selector.C(t3));
            kotlin.jvm.internal.F.o(valueOf, "add(...)");
        }
        return valueOf;
    }
}
