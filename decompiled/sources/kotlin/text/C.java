package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C2122h0;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.N;
import kotlin.Pair;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.C2108v;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.M;
import kotlin.collections.P;
import kotlin.collections.X;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.m0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.t0;
import kotlin.x0;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2486:1\n126#1,2:2487\n214#1,5:2489\n502#1,5:2495\n502#1,5:2500\n462#1:2505\n1183#1,2:2506\n463#1,2:2508\n1185#1:2510\n465#1:2511\n462#1:2512\n1183#1,2:2513\n463#1,2:2515\n1185#1:2517\n465#1:2518\n1183#1,3:2519\n492#1,2:2522\n492#1,2:2524\n750#1,4:2526\n719#1,4:2530\n735#1,4:2534\n782#1,4:2538\n882#1,5:2542\n923#1,3:2547\n926#1,3:2557\n941#1,3:2560\n944#1,3:2570\n1041#1,3:2587\n1011#1,4:2590\n1000#1:2594\n1183#1,2:2595\n1185#1:2598\n1001#1:2599\n1183#1,3:2600\n1032#1:2603\n1174#1:2604\n1175#1:2606\n1033#1:2607\n1174#1,2:2608\n1183#1,3:2610\n1982#1,2:2613\n1984#1,6:2616\n2006#1,2:2622\n2008#1,6:2625\n2431#1,6:2631\n2461#1,7:2637\n1#2:2494\n1#2:2597\n1#2:2605\n1#2:2615\n1#2:2624\n372#3,7:2550\n372#3,7:2563\n372#3,7:2573\n372#3,7:2580\n*S KotlinDebug\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n52#1:2487,2\n62#1:2489,5\n420#1:2495,5\n429#1:2500,5\n440#1:2505\n440#1:2506,2\n440#1:2508,2\n440#1:2510\n440#1:2511\n451#1:2512\n451#1:2513,2\n451#1:2515,2\n451#1:2517\n451#1:2518\n462#1:2519,3\n474#1:2522,2\n483#1:2524,2\n677#1:2526,4\n692#1:2530,4\n706#1:2534,4\n769#1:2538,4\n842#1:2542,5\n898#1:2547,3\n898#1:2557,3\n911#1:2560,3\n911#1:2570,3\n970#1:2587,3\n980#1:2590,4\n990#1:2594\n990#1:2595,2\n990#1:2598\n990#1:2599\n1000#1:2600,3\n1024#1:2603\n1024#1:2604\n1024#1:2606\n1024#1:2607\n1032#1:2608,2\n1786#1:2610,3\n2077#1:2613,2\n2077#1:2616,6\n2095#1:2622,2\n2095#1:2625,6\n2420#1:2631,6\n2448#1:2637,7\n990#1:2597\n1024#1:2605\n2077#1:2615\n2095#1:2624\n898#1:2550,7\n911#1:2563,7\n925#1:2573,7\n943#1:2580,7\n*E\n"})
/* loaded from: classes2.dex */
public class C extends B {

    @U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,70:1\n2475#2:71\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a implements Iterable<Character>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ CharSequence f52715E;

        public a(CharSequence charSequence) {
            this.f52715E = charSequence;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<Character> iterator() {
            return A.z3(this.f52715E);
        }
    }

    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,680:1\n2483#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b implements kotlin.sequences.m<Character> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f52716a;

        public b(CharSequence charSequence) {
            this.f52716a = charSequence;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Character> iterator() {
            return A.z3(this.f52716a);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<CharSequence, String> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f52717F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d CharSequence it) {
            kotlin.jvm.internal.F.p(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K] */
    @U({"SMAP\n_Strings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Strings.kt\nkotlin/text/StringsKt___StringsKt$groupingBy$1\n*L\n1#1,2486:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class d<K> implements kotlin.collections.I<Character, K> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f52718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<Character, K> f52719b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(CharSequence charSequence, X2.l<? super Character, ? extends K> lVar) {
            this.f52718a = charSequence;
            this.f52719b = lVar;
        }

        @Override // kotlin.collections.I
        public /* bridge */ /* synthetic */ Object a(Character ch) {
            return c(ch.charValue());
        }

        @Override // kotlin.collections.I
        @l3.d
        public Iterator<Character> b() {
            return A.z3(this.f52718a);
        }

        public K c(char c4) {
            return this.f52719b.C(Character.valueOf(c4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<CharSequence, String> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f52720F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d CharSequence it) {
            kotlin.jvm.internal.F.p(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<CharSequence, String> {

        /* renamed from: F, reason: collision with root package name */
        public static final f f52721F = new f();

        f() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d CharSequence it) {
            kotlin.jvm.internal.F.p(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes2.dex */
    public static final class g<R> extends Lambda implements X2.l<Integer, R> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f52722F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ CharSequence f52723G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ X2.l<CharSequence, R> f52724H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(int i4, CharSequence charSequence, X2.l<? super CharSequence, ? extends R> lVar) {
            super(1);
            this.f52722F = i4;
            this.f52723G = charSequence;
            this.f52724H = lVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ Object C(Integer num) {
            return c(num.intValue());
        }

        public final R c(int i4) {
            int i5 = this.f52722F + i4;
            if (i5 < 0 || i5 > this.f52723G.length()) {
                i5 = this.f52723G.length();
            }
            return this.f52724H.C(this.f52723G.subSequence(i4, i5));
        }
    }

    /* loaded from: classes2.dex */
    static final class h extends Lambda implements X2.a<Iterator<? extends Character>> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ CharSequence f52725F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CharSequence charSequence) {
            super(0);
            this.f52725F = charSequence;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Iterator<Character> n() {
            return A.z3(this.f52725F);
        }
    }

    @l3.d
    public static String A6(@l3.d String str, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(str, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(str.length() - i4, 0);
            return V8(str, u3);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<R> A7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            R C3 = transform.C(Character.valueOf(charSequence.charAt(i4)));
            if (C3 != null) {
                arrayList.add(C3);
            }
        }
        return arrayList;
    }

    @l3.d
    @Y(version = "1.4")
    public static final <R> List<R> A8(@l3.d CharSequence charSequence, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    public static final CharSequence B6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (g32 = A.g3(charSequence); -1 < g32; g32--) {
            if (!predicate.C(Character.valueOf(charSequence.charAt(g32))).booleanValue()) {
                return charSequence.subSequence(0, g32 + 1);
            }
        }
        return "";
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C B7(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            R C3 = transform.C(Character.valueOf(charSequence.charAt(i4)));
            if (C3 != null) {
                destination.add(C3);
            }
        }
        return destination;
    }

    @l3.d
    @Y(version = "1.4")
    public static final List<Character> B8(@l3.d CharSequence charSequence, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i4 = 1; i4 < length; i4++) {
            charAt = operation.c0(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i4))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @l3.d
    public static final String C6(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        int g32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (g32 = A.g3(str); -1 < g32; g32--) {
            if (!predicate.C(Character.valueOf(str.charAt(g32))).booleanValue()) {
                String substring = str.substring(0, g32 + 1);
                kotlin.jvm.internal.F.o(substring, "substring(...)");
                return substring;
            }
        }
        return "";
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C C7(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            destination.add(transform.C(Character.valueOf(charSequence.charAt(i4))));
        }
        return destination;
    }

    @l3.d
    @Y(version = "1.4")
    public static final List<Character> C8(@l3.d CharSequence charSequence, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        List<Character> H3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i4 = 1; i4 < length; i4++) {
            charAt = operation.z(Integer.valueOf(i4), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i4))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @l3.d
    public static final CharSequence D6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    @l3.e
    @Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Character D7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R C3 = selector.C(Character.valueOf(charAt));
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            R C4 = selector.C(Character.valueOf(charAt2));
            if (C3.compareTo(C4) < 0) {
                charAt = charAt2;
                C3 = C4;
            }
        }
        return Character.valueOf(charAt);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <R> List<R> D8(@l3.d CharSequence charSequence, R r4, @l3.d X2.p<? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            r4 = operation.c0(r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @l3.d
    public static final String E6(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.C(Character.valueOf(str.charAt(i4))).booleanValue()) {
                String substring = str.substring(i4);
                kotlin.jvm.internal.F.o(substring, "substring(...)");
                return substring;
            }
        }
        return "";
    }

    @W2.i(name = "maxByOrThrow")
    @Y(version = "1.7")
    public static final <R extends Comparable<? super R>> char E7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            if (g32 == 0) {
                return charAt;
            }
            R C3 = selector.C(Character.valueOf(charAt));
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                char charAt2 = charSequence.charAt(it.c());
                R C4 = selector.C(Character.valueOf(charAt2));
                if (C3.compareTo(C4) < 0) {
                    charAt = charAt2;
                    C3 = C4;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <R> List<R> E8(@l3.d CharSequence charSequence, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            r4 = operation.z(Integer.valueOf(i4), r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @kotlin.internal.f
    private static final char F6(CharSequence charSequence, int i4, X2.l<? super Integer, Character> defaultValue) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            g32 = A.g3(charSequence);
            if (i4 <= g32) {
                return charSequence.charAt(i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).charValue();
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final double F7(CharSequence charSequence, X2.l<? super Character, Double> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            double doubleValue = selector.C(Character.valueOf(charSequence.charAt(0))).doubleValue();
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final char F8(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @kotlin.internal.f
    private static final Character G6(CharSequence charSequence, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return j7(charSequence, i4);
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final float G7(CharSequence charSequence, X2.l<? super Character, Float> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            float floatValue = selector.C(Character.valueOf(charSequence.charAt(0))).floatValue();
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final char G8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Character ch = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                if (!z3) {
                    ch = Character.valueOf(charAt);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z3) {
            kotlin.jvm.internal.F.n(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @l3.d
    public static final CharSequence H6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R H7(CharSequence charSequence, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            R C3 = selector.C(Character.valueOf(charSequence.charAt(0)));
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Character.valueOf(charSequence.charAt(it.c())));
                if (C3.compareTo(C4) < 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.e
    public static final Character H8(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @l3.d
    public static final String I6(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R I7(CharSequence charSequence, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R C3 = selector.C(Character.valueOf(charSequence.charAt(0)));
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Character.valueOf(charSequence.charAt(it.c())));
            if (C3.compareTo(C4) < 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.e
    public static final Character I8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        Character ch = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                if (z3) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return ch;
    }

    @l3.d
    public static final CharSequence J6(@l3.d CharSequence charSequence, @l3.d X2.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            char charAt = charSequence.charAt(i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i4++;
            i5 = i6;
        }
        return sb;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Double J7(CharSequence charSequence, X2.l<? super Character, Double> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = selector.C(Character.valueOf(charSequence.charAt(0))).doubleValue();
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    public static final CharSequence J8(@l3.d CharSequence charSequence, @l3.d Iterable<Integer> indices) {
        int b02;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        b02 = C2109w.b0(indices, 10);
        if (b02 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(b02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    @l3.d
    public static final String K6(@l3.d String str, @l3.d X2.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i4++;
            i5 = i6;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Float K7(CharSequence charSequence, X2.l<? super Character, Float> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = selector.C(Character.valueOf(charSequence.charAt(0))).floatValue();
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.d
    public static final CharSequence K8(@l3.d CharSequence charSequence, @l3.d kotlin.ranges.l indices) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            return "";
        }
        return A.e5(charSequence, indices);
    }

    @l3.d
    public static final <C extends Appendable> C L6(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            char charAt = charSequence.charAt(i4);
            int i6 = i5 + 1;
            if (predicate.c0(Integer.valueOf(i5), Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R L7(CharSequence charSequence, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            Object obj = (R) selector.C(Character.valueOf(charSequence.charAt(0)));
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Character.valueOf(charSequence.charAt(it.c())));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @kotlin.internal.f
    private static final String L8(String str, Iterable<Integer> indices) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        return J8(str, indices).toString();
    }

    @l3.d
    public static final CharSequence M6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!predicate.C(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R M7(CharSequence charSequence, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) selector.C(Character.valueOf(charSequence.charAt(0)));
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Character.valueOf(charSequence.charAt(it.c())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @l3.d
    public static final String M8(@l3.d String str, @l3.d kotlin.ranges.l indices) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(indices, "indices");
        if (indices.isEmpty()) {
            return "";
        }
        return A.i5(str, indices);
    }

    @l3.d
    public static final String N6(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (!predicate.C(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @l3.e
    @Y(version = "1.4")
    public static final Character N7(@l3.d CharSequence charSequence) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            if (kotlin.jvm.internal.F.t(charAt, charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final int N8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            i4 += selector.C(Character.valueOf(charSequence.charAt(i5))).intValue();
        }
        return i4;
    }

    @l3.d
    public static final <C extends Appendable> C O6(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!predicate.C(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @W2.i(name = "maxOrThrow")
    @Y(version = "1.7")
    public static final char O7(@l3.d CharSequence charSequence) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                char charAt2 = charSequence.charAt(it.c());
                if (kotlin.jvm.internal.F.t(charAt, charAt2) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @InterfaceC2205l(message = "Use sumOf instead.", replaceWith = @V(expression = "this.sumOf(selector)", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final double O8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            d4 += selector.C(Character.valueOf(charSequence.charAt(i4))).doubleValue();
        }
        return d4;
    }

    @l3.d
    public static final <C extends Appendable> C P6(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @l3.e
    @Y(version = "1.4")
    public static final Character P7(@l3.d CharSequence charSequence, @l3.d Comparator<? super Character> comparator) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @W2.i(name = "sumOfDouble")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final double P8(CharSequence charSequence, X2.l<? super Character, Double> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        double d4 = com.google.firebase.remoteconfig.l.f37524n;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            d4 += selector.C(Character.valueOf(charSequence.charAt(i4))).doubleValue();
        }
        return d4;
    }

    @kotlin.internal.f
    private static final Character Q6(CharSequence charSequence, X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @W2.i(name = "maxWithOrThrow")
    @Y(version = "1.7")
    public static final char Q7(@l3.d CharSequence charSequence, @l3.d Comparator<? super Character> comparator) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                char charAt2 = charSequence.charAt(it.c());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @W2.i(name = "sumOfInt")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final int Q8(CharSequence charSequence, X2.l<? super Character, Integer> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            i4 += selector.C(Character.valueOf(charSequence.charAt(i5))).intValue();
        }
        return i4;
    }

    @kotlin.internal.f
    private static final Character R6(CharSequence charSequence, X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char charAt = charSequence.charAt(length);
                if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                    return Character.valueOf(charAt);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return null;
    }

    @l3.e
    @Y(version = "1.4")
    public static final <R extends Comparable<? super R>> Character R7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        if (g32 == 0) {
            return Character.valueOf(charAt);
        }
        R C3 = selector.C(Character.valueOf(charAt));
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            R C4 = selector.C(Character.valueOf(charAt2));
            if (C3.compareTo(C4) > 0) {
                charAt = charAt2;
                C3 = C4;
            }
        }
        return Character.valueOf(charAt);
    }

    @W2.i(name = "sumOfLong")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final long R8(CharSequence charSequence, X2.l<? super Character, Long> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long j4 = 0;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            j4 += selector.C(Character.valueOf(charSequence.charAt(i4))).longValue();
        }
        return j4;
    }

    public static final char S6(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @W2.i(name = "minByOrThrow")
    @Y(version = "1.7")
    public static final <R extends Comparable<? super R>> char S7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            if (g32 == 0) {
                return charAt;
            }
            R C3 = selector.C(Character.valueOf(charAt));
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                char charAt2 = charSequence.charAt(it.c());
                R C4 = selector.C(Character.valueOf(charAt2));
                if (C3.compareTo(C4) > 0) {
                    charAt = charAt2;
                    C3 = C4;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfUInt")
    @N
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final int S8(CharSequence charSequence, X2.l<? super Character, t0> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        int l4 = t0.l(0);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            l4 = t0.l(l4 + selector.C(Character.valueOf(charSequence.charAt(i4))).l0());
        }
        return l4;
    }

    public static final char T6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final double T7(CharSequence charSequence, X2.l<? super Character, Double> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            double doubleValue = selector.C(Character.valueOf(charSequence.charAt(0))).doubleValue();
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @K0(markerClass = {InterfaceC2218t.class})
    @W2.i(name = "sumOfULong")
    @N
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final long T8(CharSequence charSequence, X2.l<? super Character, x0> selector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        long l4 = x0.l(0L);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            l4 = x0.l(l4 + selector.C(Character.valueOf(charSequence.charAt(i4))).l0());
        }
        return l4;
    }

    @Y(version = "1.5")
    @kotlin.internal.f
    private static final <R> R U6(CharSequence charSequence, X2.l<? super Character, ? extends R> transform) {
        R r4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        while (true) {
            if (i4 < charSequence.length()) {
                r4 = transform.C(Character.valueOf(charSequence.charAt(i4)));
                if (r4 != null) {
                    break;
                }
                i4++;
            } else {
                r4 = null;
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final float U7(CharSequence charSequence, X2.l<? super Character, Float> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            float floatValue = selector.C(Character.valueOf(charSequence.charAt(0))).floatValue();
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final CharSequence U8(@l3.d CharSequence charSequence, int i4) {
        int B3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            B3 = kotlin.ranges.u.B(i4, charSequence.length());
            return charSequence.subSequence(0, B3);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @Y(version = "1.5")
    @kotlin.internal.f
    private static final <R> R V6(CharSequence charSequence, X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            R C3 = transform.C(Character.valueOf(charSequence.charAt(i4)));
            if (C3 != null) {
                return C3;
            }
        }
        return null;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R V7(CharSequence charSequence, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            R C3 = selector.C(Character.valueOf(charSequence.charAt(0)));
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                R C4 = selector.C(Character.valueOf(charSequence.charAt(it.c())));
                if (C3.compareTo(C4) > 0) {
                    C3 = C4;
                }
            }
            return C3;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final String V8(@l3.d String str, int i4) {
        int B3;
        kotlin.jvm.internal.F.p(str, "<this>");
        if (i4 >= 0) {
            B3 = kotlin.ranges.u.B(i4, str.length());
            String substring = str.substring(0, B3);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.e
    public static final Character W6(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R extends Comparable<? super R>> R W7(CharSequence charSequence, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R C3 = selector.C(Character.valueOf(charSequence.charAt(0)));
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            R C4 = selector.C(Character.valueOf(charSequence.charAt(it.c())));
            if (C3.compareTo(C4) > 0) {
                C3 = C4;
            }
        }
        return C3;
    }

    @l3.d
    public static final CharSequence W8(@l3.d CharSequence charSequence, int i4) {
        int B3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            int length = charSequence.length();
            B3 = kotlin.ranges.u.B(i4, length);
            return charSequence.subSequence(length - B3, length);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.e
    public static final Character X6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Double X7(CharSequence charSequence, X2.l<? super Character, Double> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = selector.C(Character.valueOf(charSequence.charAt(0))).doubleValue();
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @l3.d
    public static String X8(@l3.d String str, int i4) {
        int B3;
        kotlin.jvm.internal.F.p(str, "<this>");
        if (i4 >= 0) {
            int length = str.length();
            B3 = kotlin.ranges.u.B(i4, length);
            String substring = str.substring(length - B3);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<R> Y6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            kotlin.collections.A.q0(arrayList, transform.C(Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Float Y7(CharSequence charSequence, X2.l<? super Character, Float> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = selector.C(Character.valueOf(charSequence.charAt(0))).floatValue();
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.C(Character.valueOf(charSequence.charAt(it.c()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @l3.d
    public static final CharSequence Y8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (g32 = A.g3(charSequence); -1 < g32; g32--) {
            if (!predicate.C(Character.valueOf(charSequence.charAt(g32))).booleanValue()) {
                return charSequence.subSequence(g32 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @W2.i(name = "flatMapIndexedIterable")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> List<R> Z6(CharSequence charSequence, X2.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            kotlin.collections.A.q0(arrayList, transform.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R Z7(CharSequence charSequence, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() != 0) {
            Object obj = (R) selector.C(Character.valueOf(charSequence.charAt(0)));
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                Object obj2 = (R) selector.C(Character.valueOf(charSequence.charAt(it.c())));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final String Z8(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        int g32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (g32 = A.g3(str); -1 < g32; g32--) {
            if (!predicate.C(Character.valueOf(str.charAt(g32))).booleanValue()) {
                String substring = str.substring(g32 + 1);
                kotlin.jvm.internal.F.o(substring, "substring(...)");
                return substring;
            }
        }
        return str;
    }

    @W2.i(name = "flatMapIndexedIterableTo")
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R, C extends Collection<? super R>> C a7(CharSequence charSequence, C destination, X2.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            kotlin.collections.A.q0(destination, transform.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final <R> R a8(CharSequence charSequence, Comparator<? super R> comparator, X2.l<? super Character, ? extends R> selector) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        kotlin.jvm.internal.F.p(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) selector.C(Character.valueOf(charSequence.charAt(0)));
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.C(Character.valueOf(charSequence.charAt(it.c())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @l3.d
    public static final CharSequence a9(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return charSequence.subSequence(0, i4);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C b7(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.l<? super Character, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            kotlin.collections.A.q0(destination, transform.C(Character.valueOf(charSequence.charAt(i4))));
        }
        return destination;
    }

    @l3.e
    @Y(version = "1.4")
    public static final Character b8(@l3.d CharSequence charSequence) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            if (kotlin.jvm.internal.F.t(charAt, charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @l3.d
    public static final String b9(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!predicate.C(Character.valueOf(str.charAt(i4))).booleanValue()) {
                String substring = str.substring(0, i4);
                kotlin.jvm.internal.F.o(substring, "substring(...)");
                return substring;
            }
        }
        return str;
    }

    public static final <R> R c7(@l3.d CharSequence charSequence, R r4, @l3.d X2.p<? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            r4 = operation.c0(r4, Character.valueOf(charSequence.charAt(i4)));
        }
        return r4;
    }

    @W2.i(name = "minOrThrow")
    @Y(version = "1.7")
    public static final char c8(@l3.d CharSequence charSequence) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                char charAt2 = charSequence.charAt(it.c());
                if (kotlin.jvm.internal.F.t(charAt, charAt2) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final <C extends Collection<? super Character>> C c9(@l3.d CharSequence charSequence, @l3.d C destination) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            destination.add(Character.valueOf(charSequence.charAt(i4)));
        }
        return destination;
    }

    public static final <R> R d7(@l3.d CharSequence charSequence, R r4, @l3.d X2.q<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            r4 = operation.z(Integer.valueOf(i5), r4, Character.valueOf(charSequence.charAt(i4)));
            i4++;
            i5++;
        }
        return r4;
    }

    @l3.e
    @Y(version = "1.4")
    public static final Character d8(@l3.d CharSequence charSequence, @l3.d Comparator<? super Character> comparator) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.c());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @l3.d
    public static final HashSet<Character> d9(@l3.d CharSequence charSequence) {
        int B3;
        int j4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        B3 = kotlin.ranges.u.B(charSequence.length(), 128);
        j4 = X.j(B3);
        return (HashSet) c9(charSequence, new HashSet(j4));
    }

    public static final boolean e6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <R> R e7(@l3.d CharSequence charSequence, R r4, @l3.d X2.p<? super Character, ? super R, ? extends R> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (g32 = A.g3(charSequence); g32 >= 0; g32--) {
            r4 = operation.c0(Character.valueOf(charSequence.charAt(g32)), r4);
        }
        return r4;
    }

    @W2.i(name = "minWithOrThrow")
    @Y(version = "1.7")
    public static final char e8(@l3.d CharSequence charSequence, @l3.d Comparator<? super Character> comparator) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(comparator, "comparator");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                char charAt2 = charSequence.charAt(it.c());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @l3.d
    public static final List<Character> e9(@l3.d CharSequence charSequence) {
        List<Character> H3;
        List<Character> k4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (length == 1) {
            k4 = C2108v.k(Character.valueOf(charSequence.charAt(0)));
            return k4;
        }
        return f9(charSequence);
    }

    public static final boolean f6(@l3.d CharSequence charSequence) {
        boolean z3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }

    public static final <R> R f7(@l3.d CharSequence charSequence, R r4, @l3.d X2.q<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        for (g32 = A.g3(charSequence); g32 >= 0; g32--) {
            r4 = operation.z(Integer.valueOf(g32), Character.valueOf(charSequence.charAt(g32)), r4);
        }
        return r4;
    }

    public static final boolean f8(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final List<Character> f9(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return (List) c9(charSequence, new ArrayList(charSequence.length()));
    }

    public static final boolean g6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void g7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, H0> action) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            action.C(Character.valueOf(charSequence.charAt(i4)));
        }
    }

    public static final boolean g8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @l3.d
    public static final Set<Character> g9(@l3.d CharSequence charSequence) {
        Set<Character> k4;
        Set<Character> f4;
        int B3;
        int j4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            k4 = j0.k();
            return k4;
        }
        if (length != 1) {
            B3 = kotlin.ranges.u.B(charSequence.length(), 128);
            j4 = X.j(B3);
            return (Set) c9(charSequence, new LinkedHashSet(j4));
        }
        f4 = i0.f(Character.valueOf(charSequence.charAt(0)));
        return f4;
    }

    @l3.d
    public static final Iterable<Character> h6(@l3.d CharSequence charSequence) {
        List H3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if ((charSequence instanceof String) && charSequence.length() == 0) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return new a(charSequence);
    }

    public static final void h7(@l3.d CharSequence charSequence, @l3.d X2.p<? super Integer, ? super Character, H0> action) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            action.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4)));
            i4++;
            i5++;
        }
    }

    @l3.d
    @Y(version = "1.1")
    public static final <S extends CharSequence> S h8(@l3.d S s4, @l3.d X2.l<? super Character, H0> action) {
        kotlin.jvm.internal.F.p(s4, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        for (int i4 = 0; i4 < s4.length(); i4++) {
            action.C(Character.valueOf(s4.charAt(i4)));
        }
        return s4;
    }

    @l3.d
    @Y(version = "1.2")
    public static final List<String> h9(@l3.d CharSequence charSequence, int i4, int i5, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return i9(charSequence, i4, i5, z3, e.f52720F);
    }

    @l3.d
    public static final kotlin.sequences.m<Character> i6(@l3.d CharSequence charSequence) {
        kotlin.sequences.m<Character> g4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if ((charSequence instanceof String) && charSequence.length() == 0) {
            g4 = kotlin.sequences.s.g();
            return g4;
        }
        return new b(charSequence);
    }

    @kotlin.internal.f
    private static final char i7(CharSequence charSequence, int i4, X2.l<? super Integer, Character> defaultValue) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (i4 >= 0) {
            g32 = A.g3(charSequence);
            if (i4 <= g32) {
                return charSequence.charAt(i4);
            }
        }
        return defaultValue.C(Integer.valueOf(i4)).charValue();
    }

    @l3.d
    @Y(version = "1.4")
    public static final <S extends CharSequence> S i8(@l3.d S s4, @l3.d X2.p<? super Integer, ? super Character, H0> action) {
        kotlin.jvm.internal.F.p(s4, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        int i4 = 0;
        int i5 = 0;
        while (i4 < s4.length()) {
            action.c0(Integer.valueOf(i5), Character.valueOf(s4.charAt(i4)));
            i4++;
            i5++;
        }
        return s4;
    }

    @l3.d
    @Y(version = "1.2")
    public static final <R> List<R> i9(@l3.d CharSequence charSequence, int i4, int i5, boolean z3, @l3.d X2.l<? super CharSequence, ? extends R> transform) {
        int i6;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        m0.a(i4, i5);
        int length = charSequence.length();
        int i7 = length / i5;
        int i8 = 0;
        if (length % i5 == 0) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        ArrayList arrayList = new ArrayList(i7 + i6);
        while (i8 >= 0 && i8 < length) {
            int i9 = i8 + i4;
            if (i9 < 0 || i9 > length) {
                if (!z3) {
                    break;
                }
                i9 = length;
            }
            arrayList.add(transform.C(charSequence.subSequence(i8, i9)));
            i8 += i5;
        }
        return arrayList;
    }

    @l3.d
    public static final <K, V> Map<K, V> j6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        j4 = X.j(charSequence.length());
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            Pair<? extends K, ? extends V> C3 = transform.C(Character.valueOf(charSequence.charAt(i4)));
            linkedHashMap.put(C3.e(), C3.f());
        }
        return linkedHashMap;
    }

    @l3.e
    public static final Character j7(@l3.d CharSequence charSequence, int i4) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            g32 = A.g3(charSequence);
            if (i4 <= g32) {
                return Character.valueOf(charSequence.charAt(i4));
            }
        }
        return null;
    }

    @l3.d
    public static final Pair<CharSequence, CharSequence> j8(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    public static /* synthetic */ List j9(CharSequence charSequence, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return h9(charSequence, i4, i5, z3);
    }

    @l3.d
    public static final <K> Map<K, Character> k6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        j4 = X.j(charSequence.length());
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            linkedHashMap.put(keySelector.C(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <K> Map<K, List<Character>> k7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K C3 = keySelector.C(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(C3, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final Pair<String, String> k8(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb.toString();
        kotlin.jvm.internal.F.o(sb3, "toString(...)");
        String sb4 = sb2.toString();
        kotlin.jvm.internal.F.o(sb4, "toString(...)");
        return new Pair<>(sb3, sb4);
    }

    public static /* synthetic */ List k9(CharSequence charSequence, int i4, int i5, boolean z3, X2.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return i9(charSequence, i4, i5, z3, lVar);
    }

    @l3.d
    public static final <K, V> Map<K, V> l6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        j4 = X.j(charSequence.length());
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            linkedHashMap.put(keySelector.C(Character.valueOf(charAt)), valueTransform.C(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @l3.d
    public static final <K, V> Map<K, List<V>> l7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K C3 = keySelector.C(Character.valueOf(charAt));
            List<V> list = linkedHashMap.get(C3);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(C3, list);
            }
            list.add(valueTransform.C(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @Y(version = "1.3")
    @kotlin.internal.f
    private static final char l8(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return m8(charSequence, Random.f52425E);
    }

    @l3.d
    @Y(version = "1.2")
    public static final kotlin.sequences.m<String> l9(@l3.d CharSequence charSequence, int i4, int i5, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return m9(charSequence, i4, i5, z3, f.f52721F);
    }

    @l3.d
    public static final <K, M extends Map<? super K, ? super Character>> M m6(@l3.d CharSequence charSequence, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            destination.put(keySelector.C(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return destination;
    }

    @l3.d
    public static final <K, M extends Map<? super K, List<Character>>> M m7(@l3.d CharSequence charSequence, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K C3 = keySelector.C(Character.valueOf(charAt));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return destination;
    }

    @Y(version = "1.3")
    public static final char m8(@l3.d CharSequence charSequence, @l3.d Random random) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.m(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @l3.d
    @Y(version = "1.2")
    public static final <R> kotlin.sequences.m<R> m9(@l3.d CharSequence charSequence, int i4, int i5, boolean z3, @l3.d X2.l<? super CharSequence, ? extends R> transform) {
        kotlin.ranges.l W12;
        kotlin.ranges.j B12;
        kotlin.sequences.m A12;
        kotlin.sequences.m<R> k12;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        m0.a(i4, i5);
        if (!z3) {
            W12 = kotlin.ranges.u.W1(0, (charSequence.length() - i4) + 1);
        } else {
            W12 = A.f3(charSequence);
        }
        B12 = kotlin.ranges.u.B1(W12, i5);
        A12 = kotlin.collections.D.A1(B12);
        k12 = SequencesKt___SequencesKt.k1(A12, new g(i4, charSequence, transform));
        return k12;
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M n6(@l3.d CharSequence charSequence, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            destination.put(keySelector.C(Character.valueOf(charAt)), valueTransform.C(Character.valueOf(charAt)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <K, V, M extends Map<? super K, List<V>>> M n7(@l3.d CharSequence charSequence, @l3.d M destination, @l3.d X2.l<? super Character, ? extends K> keySelector, @l3.d X2.l<? super Character, ? extends V> valueTransform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        kotlin.jvm.internal.F.p(valueTransform, "valueTransform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            K C3 = keySelector.C(Character.valueOf(charAt));
            Object obj = destination.get(C3);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(C3, obj);
            }
            ((List) obj).add(valueTransform.C(Character.valueOf(charAt)));
        }
        return destination;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    @kotlin.internal.f
    private static final Character n8(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return o8(charSequence, Random.f52425E);
    }

    public static /* synthetic */ kotlin.sequences.m n9(CharSequence charSequence, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return l9(charSequence, i4, i5, z3);
    }

    @l3.d
    public static final <K, V, M extends Map<? super K, ? super V>> M o6(@l3.d CharSequence charSequence, @l3.d M destination, @l3.d X2.l<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            Pair<? extends K, ? extends V> C3 = transform.C(Character.valueOf(charSequence.charAt(i4)));
            destination.put(C3.e(), C3.f());
        }
        return destination;
    }

    @l3.d
    @Y(version = "1.1")
    public static final <K> kotlin.collections.I<Character, K> o7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends K> keySelector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(keySelector, "keySelector");
        return new d(charSequence, keySelector);
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final Character o8(@l3.d CharSequence charSequence, @l3.d Random random) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.m(charSequence.length())));
    }

    public static /* synthetic */ kotlin.sequences.m o9(CharSequence charSequence, int i4, int i5, boolean z3, X2.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return m9(charSequence, i4, i5, z3, lVar);
    }

    @l3.d
    @Y(version = "1.3")
    public static final <V> Map<Character, V> p6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends V> valueSelector) {
        int B3;
        int j4;
        int u3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        B3 = kotlin.ranges.u.B(charSequence.length(), 128);
        j4 = X.j(B3);
        u3 = kotlin.ranges.u.u(j4, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u3);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            linkedHashMap.put(Character.valueOf(charAt), valueSelector.C(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final int p7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue()) {
                return i4;
            }
        }
        return -1;
    }

    public static final char p8(@l3.d CharSequence charSequence, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                charAt = operation.c0(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.c()))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @l3.d
    public static final Iterable<M<Character>> p9(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return new kotlin.collections.N(new h(charSequence));
    }

    @l3.d
    @Y(version = "1.3")
    public static final <V, M extends Map<? super Character, ? super V>> M q6(@l3.d CharSequence charSequence, @l3.d M destination, @l3.d X2.l<? super Character, ? extends V> valueSelector) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(valueSelector, "valueSelector");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            destination.put(Character.valueOf(charAt), valueSelector.C(Character.valueOf(charAt)));
        }
        return destination;
    }

    public static final int q7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (predicate.C(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }

    public static final char q8(@l3.d CharSequence charSequence, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            g32 = A.g3(charSequence);
            P it = new kotlin.ranges.l(1, g32).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                charAt = operation.z(Integer.valueOf(c4), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(c4))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @l3.d
    public static final List<Pair<Character, Character>> q9(@l3.d CharSequence charSequence, @l3.d CharSequence other) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(C2122h0.a(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(other.charAt(i4))));
        }
        return arrayList;
    }

    @l3.d
    @Y(version = "1.2")
    public static List<String> r6(@l3.d CharSequence charSequence, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return h9(charSequence, i4, i4, true);
    }

    public static char r7(@l3.d CharSequence charSequence) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            g32 = A.g3(charSequence);
            return charSequence.charAt(g32);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @l3.e
    @Y(version = "1.4")
    public static final Character r8(@l3.d CharSequence charSequence, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            int c4 = it.c();
            charAt = operation.z(Integer.valueOf(c4), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(c4))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @l3.d
    public static final <V> List<V> r9(@l3.d CharSequence charSequence, @l3.d CharSequence other, @l3.d X2.p<? super Character, ? super Character, ? extends V> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        kotlin.jvm.internal.F.p(transform, "transform");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(transform.c0(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(other.charAt(i4))));
        }
        return arrayList;
    }

    @l3.d
    @Y(version = "1.2")
    public static final <R> List<R> s6(@l3.d CharSequence charSequence, int i4, @l3.d X2.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        return i9(charSequence, i4, i4, true, transform);
    }

    public static final char s7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                char charAt = charSequence.charAt(length);
                if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                    return charAt;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final Character s8(@l3.d CharSequence charSequence, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        g32 = A.g3(charSequence);
        P it = new kotlin.ranges.l(1, g32).iterator();
        while (it.hasNext()) {
            charAt = operation.c0(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.c()))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @l3.d
    @Y(version = "1.2")
    public static final List<Pair<Character, Character>> s9(@l3.d CharSequence charSequence) {
        List<Pair<Character, Character>> H3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(length);
        int i4 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            i4++;
            arrayList.add(C2122h0.a(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    @l3.d
    @Y(version = "1.2")
    public static final kotlin.sequences.m<String> t6(@l3.d CharSequence charSequence, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return u6(charSequence, i4, c.f52717F);
    }

    @l3.e
    public static final Character t7(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char t8(@l3.d CharSequence charSequence, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        g32 = A.g3(charSequence);
        if (g32 >= 0) {
            char charAt = charSequence.charAt(g32);
            for (int i4 = g32 - 1; i4 >= 0; i4--) {
                charAt = operation.c0(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @l3.d
    @Y(version = "1.2")
    public static final <R> List<R> t9(@l3.d CharSequence charSequence, @l3.d X2.p<? super Character, ? super Character, ? extends R> transform) {
        List<R> H3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        ArrayList arrayList = new ArrayList(length);
        int i4 = 0;
        while (i4 < length) {
            Character valueOf = Character.valueOf(charSequence.charAt(i4));
            i4++;
            arrayList.add(transform.c0(valueOf, Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    @l3.d
    @Y(version = "1.2")
    public static final <R> kotlin.sequences.m<R> u6(@l3.d CharSequence charSequence, int i4, @l3.d X2.l<? super CharSequence, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        return m9(charSequence, i4, i4, true, transform);
    }

    @l3.e
    public static final Character u7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i4 = length - 1;
            char charAt = charSequence.charAt(length);
            if (predicate.C(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return null;
            }
        }
    }

    public static final char u8(@l3.d CharSequence charSequence, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        g32 = A.g3(charSequence);
        if (g32 >= 0) {
            char charAt = charSequence.charAt(g32);
            for (int i4 = g32 - 1; i4 >= 0; i4--) {
                charAt = operation.z(Integer.valueOf(i4), Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @kotlin.internal.f
    private static final int v6(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return charSequence.length();
    }

    @l3.d
    public static final <R> List<R> v7(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            arrayList.add(transform.C(Character.valueOf(charSequence.charAt(i4))));
        }
        return arrayList;
    }

    @l3.e
    @Y(version = "1.4")
    public static final Character v8(@l3.d CharSequence charSequence, @l3.d X2.q<? super Integer, ? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        g32 = A.g3(charSequence);
        if (g32 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(g32);
        for (int i4 = g32 - 1; i4 >= 0; i4--) {
            charAt = operation.z(Integer.valueOf(i4), Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final int w6(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (predicate.C(Character.valueOf(charSequence.charAt(i5))).booleanValue()) {
                i4++;
            }
        }
        return i4;
    }

    @l3.d
    public static final <R> List<R> w7(@l3.d CharSequence charSequence, @l3.d X2.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            arrayList.add(transform.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return arrayList;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final Character w8(@l3.d CharSequence charSequence, @l3.d X2.p<? super Character, ? super Character, Character> operation) {
        int g32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        g32 = A.g3(charSequence);
        if (g32 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(g32);
        for (int i4 = g32 - 1; i4 >= 0; i4--) {
            charAt = operation.c0(Character.valueOf(charSequence.charAt(i4)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @l3.d
    public static final CharSequence x6(@l3.d CharSequence charSequence, int i4) {
        int B3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            B3 = kotlin.ranges.u.B(i4, charSequence.length());
            return charSequence.subSequence(B3, charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R> List<R> x7(@l3.d CharSequence charSequence, @l3.d X2.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            int i6 = i5 + 1;
            R c02 = transform.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4)));
            if (c02 != null) {
                arrayList.add(c02);
            }
            i4++;
            i5 = i6;
        }
        return arrayList;
    }

    @l3.d
    public static final CharSequence x8(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        kotlin.jvm.internal.F.o(reverse, "reverse(...)");
        return reverse;
    }

    @l3.d
    public static String y6(@l3.d String str, int i4) {
        int B3;
        kotlin.jvm.internal.F.p(str, "<this>");
        if (i4 >= 0) {
            B3 = kotlin.ranges.u.B(i4, str.length());
            String substring = str.substring(B3);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C y7(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            int i6 = i5 + 1;
            R c02 = transform.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4)));
            if (c02 != null) {
                destination.add(c02);
            }
            i4++;
            i5 = i6;
        }
        return destination;
    }

    @kotlin.internal.f
    private static final String y8(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return x8(str).toString();
    }

    @l3.d
    public static final CharSequence z6(@l3.d CharSequence charSequence, int i4) {
        int u3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            u3 = kotlin.ranges.u.u(charSequence.length() - i4, 0);
            return U8(charSequence, u3);
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    @l3.d
    public static final <R, C extends Collection<? super R>> C z7(@l3.d CharSequence charSequence, @l3.d C destination, @l3.d X2.p<? super Integer, ? super Character, ? extends R> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            destination.add(transform.c0(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i4))));
            i4++;
            i5++;
        }
        return destination;
    }

    @l3.d
    @Y(version = "1.4")
    public static final <R> List<R> z8(@l3.d CharSequence charSequence, R r4, @l3.d X2.p<? super R, ? super Character, ? extends R> operation) {
        List<R> k4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        if (charSequence.length() == 0) {
            k4 = C2108v.k(r4);
            return k4;
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            r4 = operation.c0(r4, Character.valueOf(charSequence.charAt(i4)));
            arrayList.add(r4);
        }
        return arrayList;
    }
}
