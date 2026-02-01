package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C2122h0;
import kotlin.InterfaceC2205l;
import kotlin.K0;
import kotlin.N;
import kotlin.Pair;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.AbstractC2106t;
import kotlin.collections.C2100o;
import kotlin.collections.C2101p;
import kotlin.collections.C2108v;
import kotlin.collections.C2109w;
import kotlin.collections.P;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.sequences.SequencesKt___SequencesKt;

@U({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* loaded from: classes2.dex */
public class A extends z {

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2106t {

        /* renamed from: E */
        private int f52707E;

        /* renamed from: F */
        final /* synthetic */ CharSequence f52708F;

        a(CharSequence charSequence) {
            this.f52708F = charSequence;
        }

        @Override // kotlin.collections.AbstractC2106t
        public char c() {
            CharSequence charSequence = this.f52708F;
            int i4 = this.f52707E;
            this.f52707E = i4 + 1;
            return charSequence.charAt(i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52707E < this.f52708F.length()) {
                return true;
            }
            return false;
        }
    }

    @U({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: F */
        final /* synthetic */ char[] f52709F;

        /* renamed from: G */
        final /* synthetic */ boolean f52710G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z3) {
            super(2);
            this.f52709F = cArr;
            this.f52710G = z3;
        }

        @l3.e
        public final Pair<Integer, Integer> c(@l3.d CharSequence $receiver, int i4) {
            kotlin.jvm.internal.F.p($receiver, "$this$$receiver");
            int r32 = A.r3($receiver, this.f52709F, i4, this.f52710G);
            if (r32 < 0) {
                return null;
            }
            return C2122h0.a(Integer.valueOf(r32), 1);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> c0(CharSequence charSequence, Integer num) {
            return c(charSequence, num.intValue());
        }
    }

    @U({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: F */
        final /* synthetic */ List<String> f52711F;

        /* renamed from: G */
        final /* synthetic */ boolean f52712G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, boolean z3) {
            super(2);
            this.f52711F = list;
            this.f52712G = z3;
        }

        @l3.e
        public final Pair<Integer, Integer> c(@l3.d CharSequence $receiver, int i4) {
            kotlin.jvm.internal.F.p($receiver, "$this$$receiver");
            Pair b32 = A.b3($receiver, this.f52711F, i4, this.f52712G, false);
            if (b32 != null) {
                return C2122h0.a(b32.e(), Integer.valueOf(((String) b32.f()).length()));
            }
            return null;
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> c0(CharSequence charSequence, Integer num) {
            return c(charSequence, num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<kotlin.ranges.l, String> {

        /* renamed from: F */
        final /* synthetic */ CharSequence f52713F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f52713F = charSequence;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final String C(@l3.d kotlin.ranges.l it) {
            kotlin.jvm.internal.F.p(it, "it");
            return A.h5(this.f52713F, it);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<kotlin.ranges.l, String> {

        /* renamed from: F */
        final /* synthetic */ CharSequence f52714F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.f52714F = charSequence;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c */
        public final String C(@l3.d kotlin.ranges.l it) {
            kotlin.jvm.internal.F.p(it, "it");
            return A.h5(this.f52714F, it);
        }
    }

    public static final int A3(@l3.d CharSequence charSequence, char c4, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c4, i4);
        }
        return F3(charSequence, new char[]{c4}, i4, z3);
    }

    @l3.d
    public static final String A4(@l3.d String str, @l3.d String delimiter, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        int D3;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            return G4(str, 0, D3, replacement).toString();
        }
        return missingDelimiterValue;
    }

    @Y(version = "1.5")
    public static final boolean A5(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        if (kotlin.jvm.internal.F.g(str, L1.a.f1650s3)) {
            return true;
        }
        if (kotlin.jvm.internal.F.g(str, L1.a.t3)) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int B3(@l3.d CharSequence charSequence, @l3.d String string, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(string, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i4);
        }
        return m3(charSequence, string, i4, 0, z3, true);
    }

    public static /* synthetic */ String B4(String str, char c4, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return z4(str, c4, str2, str3);
    }

    @l3.e
    @Y(version = "1.5")
    public static final Boolean B5(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        if (kotlin.jvm.internal.F.g(str, L1.a.f1650s3)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.F.g(str, L1.a.t3)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int C3(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return A3(charSequence, c4, i4, z3);
    }

    public static /* synthetic */ String C4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return A4(str, str2, str3, str4);
    }

    @l3.d
    public static CharSequence C5(@l3.d CharSequence charSequence) {
        int i4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean r4 = C2220b.r(charSequence.charAt(i4));
            if (!z3) {
                if (!r4) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else {
                if (!r4) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static /* synthetic */ int D3(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return B3(charSequence, str, i4, z3);
    }

    @kotlin.internal.f
    private static final String D4(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        return regex.o(charSequence, replacement);
    }

    @l3.d
    public static final CharSequence D5(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        int i4;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean booleanValue = predicate.C(Character.valueOf(charSequence.charAt(i4))).booleanValue();
            if (!z3) {
                if (!booleanValue) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else {
                if (!booleanValue) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static final int E3(@l3.d CharSequence charSequence, @l3.d Collection<String> strings, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(strings, "strings");
        Pair<Integer, String> b32 = b3(charSequence, strings, i4, z3, true);
        if (b32 != null) {
            return b32.e().intValue();
        }
        return -1;
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "replaceFirstCharWithChar")
    @N
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String E4(String str, X2.l<? super Character, Character> transform) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        if (str.length() > 0) {
            char charValue = transform.C(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return charValue + substring;
        }
        return str;
    }

    @l3.d
    public static final CharSequence E5(@l3.d CharSequence charSequence, @l3.d char... chars) {
        int i4;
        boolean n8;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            n8 = C2101p.n8(chars, charSequence.charAt(i4));
            if (!z3) {
                if (!n8) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else {
                if (!n8) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static final int F3(@l3.d CharSequence charSequence, @l3.d char[] chars, int i4, boolean z3) {
        int g32;
        int B3;
        boolean J3;
        char Vs;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        if (z3 || chars.length != 1 || !(charSequence instanceof String)) {
            g32 = g3(charSequence);
            for (B3 = kotlin.ranges.u.B(i4, g32); -1 < B3; B3--) {
                char charAt = charSequence.charAt(B3);
                for (char c4 : chars) {
                    J3 = C2221c.J(c4, charAt, z3);
                    if (J3) {
                        return B3;
                    }
                }
            }
            return -1;
        }
        Vs = C2101p.Vs(chars);
        return ((String) charSequence).lastIndexOf(Vs, i4);
    }

    @K0(markerClass = {kotlin.r.class})
    @W2.i(name = "replaceFirstCharWithCharSequence")
    @N
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String F4(String str, X2.l<? super Character, ? extends CharSequence> transform) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(transform, "transform");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) transform.C(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @kotlin.internal.f
    private static final String F5(String str) {
        CharSequence C5;
        kotlin.jvm.internal.F.p(str, "<this>");
        C5 = C5(str);
        return C5.toString();
    }

    public static /* synthetic */ int G3(CharSequence charSequence, Collection collection, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return E3(charSequence, collection, i4, z3);
    }

    @l3.d
    public static final CharSequence G4(@l3.d CharSequence charSequence, int i4, int i5, @l3.d CharSequence replacement) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        if (i5 >= i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i4);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i5, charSequence.length());
            kotlin.jvm.internal.F.o(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i5 + ") is less than start index (" + i4 + ").");
    }

    @l3.d
    public static final String G5(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        int i4;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean booleanValue = predicate.C(Character.valueOf(str.charAt(i4))).booleanValue();
            if (!z3) {
                if (!booleanValue) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else {
                if (!booleanValue) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    public static /* synthetic */ int H3(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return F3(charSequence, cArr, i4, z3);
    }

    @l3.d
    public static final CharSequence H4(@l3.d CharSequence charSequence, @l3.d kotlin.ranges.l range, @l3.d CharSequence replacement) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        return G4(charSequence, range.c().intValue(), range.k().intValue() + 1, replacement);
    }

    @l3.d
    public static final String H5(@l3.d String str, @l3.d char... chars) {
        int i4;
        boolean n8;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            n8 = C2101p.n8(chars, str.charAt(i4));
            if (!z3) {
                if (!n8) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else {
                if (!n8) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    @l3.d
    public static final kotlin.sequences.m<String> I3(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return X4(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @kotlin.internal.f
    private static final String I4(String str, int i4, int i5, CharSequence replacement) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        return G4(str, i4, i5, replacement).toString();
    }

    @l3.d
    public static final CharSequence I5(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!C2220b.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return "";
    }

    @l3.d
    public static final List<String> J3(@l3.d CharSequence charSequence) {
        List<String> c32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        c32 = SequencesKt___SequencesKt.c3(I3(charSequence));
        return c32;
    }

    @kotlin.internal.f
    private static final String J4(String str, kotlin.ranges.l range, CharSequence replacement) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        return H4(str, range, replacement).toString();
    }

    @l3.d
    public static final CharSequence J5(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i4 = length - 1;
            if (!predicate.C(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i4 >= 0) {
                length = i4;
            } else {
                return "";
            }
        }
    }

    @kotlin.internal.f
    private static final boolean K3(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        return regex.k(charSequence);
    }

    public static final void K4(int i4) {
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i4).toString());
    }

    @l3.d
    public static final CharSequence K5(@l3.d CharSequence charSequence, @l3.d char... chars) {
        boolean n8;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                n8 = C2101p.n8(chars, charSequence.charAt(length));
                if (!n8) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return "";
    }

    @l3.d
    public static final String L2(@l3.d CharSequence charSequence, @l3.d CharSequence other, boolean z3) {
        boolean J3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        int i4 = 0;
        while (i4 < min) {
            J3 = C2221c.J(charSequence.charAt(i4), other.charAt(i4), z3);
            if (!J3) {
                break;
            }
            i4++;
        }
        int i5 = i4 - 1;
        if (h3(charSequence, i5) || h3(other, i5)) {
            i4--;
        }
        return charSequence.subSequence(0, i4).toString();
    }

    @kotlin.internal.f
    private static final String L3(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    @kotlin.internal.f
    private static final List<String> L4(CharSequence charSequence, Regex regex, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        return regex.p(charSequence, i4);
    }

    @kotlin.internal.f
    private static final String L5(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return I5(str).toString();
    }

    public static /* synthetic */ String M2(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return L2(charSequence, charSequence2, z3);
    }

    @l3.d
    public static final CharSequence M3(@l3.d CharSequence charSequence, int i4, char c4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            if (i4 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i4);
            sb.append(charSequence);
            P it = new kotlin.ranges.l(1, i4 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.c();
                sb.append(c4);
            }
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i4 + " is less than zero.");
    }

    @l3.d
    public static final List<String> M4(@l3.d CharSequence charSequence, @l3.d char[] delimiters, boolean z3, int i4) {
        Iterable N3;
        int b02;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(delimiters, "delimiters");
        if (delimiters.length != 1) {
            N3 = SequencesKt___SequencesKt.N(W3(charSequence, delimiters, 0, z3, i4, 2, null));
            b02 = C2109w.b0(N3, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator it = N3.iterator();
            while (it.hasNext()) {
                arrayList.add(h5(charSequence, (kotlin.ranges.l) it.next()));
            }
            return arrayList;
        }
        return O4(charSequence, String.valueOf(delimiters[0]), z3, i4);
    }

    @l3.d
    public static final String M5(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!predicate.C(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @l3.d
    public static final String N2(@l3.d CharSequence charSequence, @l3.d CharSequence other, boolean z3) {
        boolean J3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        int length = charSequence.length();
        int min = Math.min(length, other.length());
        int i4 = 0;
        while (i4 < min) {
            J3 = C2221c.J(charSequence.charAt((length - i4) - 1), other.charAt((r1 - i4) - 1), z3);
            if (!J3) {
                break;
            }
            i4++;
        }
        if (h3(charSequence, (length - i4) - 1) || h3(other, (r1 - i4) - 1)) {
            i4--;
        }
        return charSequence.subSequence(length - i4, length).toString();
    }

    @l3.d
    public static final String N3(@l3.d String str, int i4, char c4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return M3(str, i4, c4).toString();
    }

    @l3.d
    public static final List<String> N4(@l3.d CharSequence charSequence, @l3.d String[] delimiters, boolean z3, int i4) {
        Iterable N3;
        int b02;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return O4(charSequence, str, z3, i4);
            }
        }
        N3 = SequencesKt___SequencesKt.N(X3(charSequence, delimiters, 0, z3, i4, 2, null));
        b02 = C2109w.b0(N3, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = N3.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (kotlin.ranges.l) it.next()));
        }
        return arrayList;
    }

    @l3.d
    public static final String N5(@l3.d String str, @l3.d char... chars) {
        CharSequence charSequence;
        boolean n8;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                n8 = C2101p.n8(chars, str.charAt(length));
                if (!n8) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ String O2(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return N2(charSequence, charSequence2, z3);
    }

    public static /* synthetic */ CharSequence O3(CharSequence charSequence, int i4, char c4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c4 = ' ';
        }
        return M3(charSequence, i4, c4);
    }

    private static final List<String> O4(CharSequence charSequence, String str, boolean z3, int i4) {
        List<String> k4;
        boolean z4;
        K4(i4);
        int i5 = 0;
        int l32 = l3(charSequence, str, 0, z3);
        if (l32 == -1 || i4 == 1) {
            k4 = C2108v.k(charSequence.toString());
            return k4;
        }
        if (i4 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i6 = 10;
        if (z4) {
            i6 = kotlin.ranges.u.B(i4, 10);
        }
        ArrayList arrayList = new ArrayList(i6);
        do {
            arrayList.add(charSequence.subSequence(i5, l32).toString());
            i5 = str.length() + l32;
            if (z4 && arrayList.size() == i4 - 1) {
                break;
            }
            l32 = l3(charSequence, str, i5, z3);
        } while (l32 != -1);
        arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
        return arrayList;
    }

    @l3.d
    public static final CharSequence O5(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!C2220b.r(charSequence.charAt(i4))) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean P2(@l3.d CharSequence charSequence, char c4, boolean z3) {
        int o32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        o32 = o3(charSequence, c4, 0, z3, 2, null);
        if (o32 >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String P3(String str, int i4, char c4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c4 = ' ';
        }
        return N3(str, i4, c4);
    }

    static /* synthetic */ List P4(CharSequence charSequence, Regex regex, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        return regex.p(charSequence, i4);
    }

    @l3.d
    public static final CharSequence P5(@l3.d CharSequence charSequence, @l3.d X2.l<? super Character, Boolean> predicate) {
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

    public static boolean Q2(@l3.d CharSequence charSequence, @l3.d CharSequence other, boolean z3) {
        int p32;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        if (other instanceof String) {
            p32 = p3(charSequence, (String) other, 0, z3, 2, null);
            if (p32 < 0) {
                return false;
            }
        } else if (n3(charSequence, other, 0, charSequence.length(), z3, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    @l3.d
    public static final CharSequence Q3(@l3.d CharSequence charSequence, int i4, char c4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            if (i4 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i4);
            P it = new kotlin.ranges.l(1, i4 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.c();
                sb.append(c4);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i4 + " is less than zero.");
    }

    public static /* synthetic */ List Q4(CharSequence charSequence, char[] cArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return M4(charSequence, cArr, z3, i4);
    }

    @l3.d
    public static final CharSequence Q5(@l3.d CharSequence charSequence, @l3.d char... chars) {
        boolean n8;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            n8 = C2101p.n8(chars, charSequence.charAt(i4));
            if (!n8) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    @kotlin.internal.f
    private static final boolean R2(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        return regex.b(charSequence);
    }

    @l3.d
    public static String R3(@l3.d String str, int i4, char c4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return Q3(str, i4, c4).toString();
    }

    public static /* synthetic */ List R4(CharSequence charSequence, String[] strArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return N4(charSequence, strArr, z3, i4);
    }

    @kotlin.internal.f
    private static final String R5(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return O5(str).toString();
    }

    public static /* synthetic */ boolean S2(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return P2(charSequence, c4, z3);
    }

    public static /* synthetic */ CharSequence S3(CharSequence charSequence, int i4, char c4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c4 = ' ';
        }
        return Q3(charSequence, i4, c4);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.6")
    @kotlin.internal.f
    private static final kotlin.sequences.m<String> S4(CharSequence charSequence, Regex regex, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        return regex.r(charSequence, i4);
    }

    @l3.d
    public static final String S5(@l3.d String str, @l3.d X2.l<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(predicate, "predicate");
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (!predicate.C(Character.valueOf(str.charAt(i4))).booleanValue()) {
                    charSequence = str.subSequence(i4, str.length());
                    break;
                }
                i4++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean T2(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        boolean Q22;
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        Q22 = Q2(charSequence, charSequence2, z3);
        return Q22;
    }

    public static /* synthetic */ String T3(String str, int i4, char c4, int i5, Object obj) {
        String R3;
        if ((i5 & 2) != 0) {
            c4 = ' ';
        }
        R3 = R3(str, i4, c4);
        return R3;
    }

    @l3.d
    public static final kotlin.sequences.m<String> T4(@l3.d CharSequence charSequence, @l3.d char[] delimiters, boolean z3, int i4) {
        kotlin.sequences.m<String> k12;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(delimiters, "delimiters");
        k12 = SequencesKt___SequencesKt.k1(W3(charSequence, delimiters, 0, z3, i4, 2, null), new e(charSequence));
        return k12;
    }

    @l3.d
    public static final String T5(@l3.d String str, @l3.d char... chars) {
        CharSequence charSequence;
        boolean n8;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                n8 = C2101p.n8(chars, str.charAt(i4));
                if (!n8) {
                    charSequence = str.subSequence(i4, str.length());
                    break;
                }
                i4++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static final boolean U2(@l3.e CharSequence charSequence, @l3.e CharSequence charSequence2) {
        boolean J3;
        boolean K12;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            K12 = z.K1((String) charSequence, (String) charSequence2, true);
            return K12;
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            J3 = C2221c.J(charSequence.charAt(i4), charSequence2.charAt(i4), true);
            if (!J3) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<kotlin.ranges.l> U3(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5) {
        K4(i5);
        return new C2224f(charSequence, i4, i5, new b(cArr, z3));
    }

    @l3.d
    public static final kotlin.sequences.m<String> U4(@l3.d CharSequence charSequence, @l3.d String[] delimiters, boolean z3, int i4) {
        kotlin.sequences.m<String> k12;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(delimiters, "delimiters");
        k12 = SequencesKt___SequencesKt.k1(X3(charSequence, delimiters, 0, z3, i4, 2, null), new d(charSequence));
        return k12;
    }

    public static final boolean V2(@l3.e CharSequence charSequence, @l3.e CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.F.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<kotlin.ranges.l> V3(CharSequence charSequence, String[] strArr, int i4, boolean z3, int i5) {
        List t3;
        K4(i5);
        t3 = C2100o.t(strArr);
        return new C2224f(charSequence, i4, i5, new c(t3, z3));
    }

    static /* synthetic */ kotlin.sequences.m V4(CharSequence charSequence, Regex regex, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        return regex.r(charSequence, i4);
    }

    public static final boolean W2(@l3.d CharSequence charSequence, char c4, boolean z3) {
        int g32;
        boolean J3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() > 0) {
            g32 = g3(charSequence);
            J3 = C2221c.J(charSequence.charAt(g32), c4, z3);
            if (J3) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ kotlin.sequences.m W3(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return U3(charSequence, cArr, i4, z3, i5);
    }

    public static /* synthetic */ kotlin.sequences.m W4(CharSequence charSequence, char[] cArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return T4(charSequence, cArr, z3, i4);
    }

    public static final boolean X2(@l3.d CharSequence charSequence, @l3.d CharSequence suffix, boolean z3) {
        boolean J12;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(suffix, "suffix");
        if (!z3 && (charSequence instanceof String) && (suffix instanceof String)) {
            J12 = z.J1((String) charSequence, (String) suffix, false, 2, null);
            return J12;
        }
        return Y3(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z3);
    }

    static /* synthetic */ kotlin.sequences.m X3(CharSequence charSequence, String[] strArr, int i4, boolean z3, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return V3(charSequence, strArr, i4, z3, i5);
    }

    public static /* synthetic */ kotlin.sequences.m X4(CharSequence charSequence, String[] strArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return U4(charSequence, strArr, z3, i4);
    }

    public static /* synthetic */ boolean Y2(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return W2(charSequence, c4, z3);
    }

    public static final boolean Y3(@l3.d CharSequence charSequence, int i4, @l3.d CharSequence other, int i5, int i6, boolean z3) {
        boolean J3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > other.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            J3 = C2221c.J(charSequence.charAt(i4 + i7), other.charAt(i5 + i7), z3);
            if (!J3) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y4(@l3.d CharSequence charSequence, char c4, boolean z3) {
        boolean J3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() > 0) {
            J3 = C2221c.J(charSequence.charAt(0), c4, z3);
            if (!J3) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean Z2(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return X2(charSequence, charSequence2, z3);
    }

    @l3.d
    public static final CharSequence Z3(@l3.d CharSequence charSequence, @l3.d CharSequence prefix) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        if (d5(charSequence, prefix, false, 2, null)) {
            return charSequence.subSequence(prefix.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean Z4(@l3.d CharSequence charSequence, @l3.d CharSequence prefix, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        if (!z3 && (charSequence instanceof String) && (prefix instanceof String)) {
            return z.r2((String) charSequence, (String) prefix, i4, false, 4, null);
        }
        return Y3(charSequence, i4, prefix, 0, prefix.length(), z3);
    }

    @l3.e
    public static final Pair<Integer, String> a3(@l3.d CharSequence charSequence, @l3.d Collection<String> strings, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(strings, "strings");
        return b3(charSequence, strings, i4, z3, false);
    }

    @l3.d
    public static final String a4(@l3.d String str, @l3.d CharSequence prefix) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        if (d5(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final boolean a5(@l3.d CharSequence charSequence, @l3.d CharSequence prefix, boolean z3) {
        boolean s22;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        if (!z3 && (charSequence instanceof String) && (prefix instanceof String)) {
            s22 = z.s2((String) charSequence, (String) prefix, false, 2, null);
            return s22;
        }
        return Y3(charSequence, 0, prefix, 0, prefix.length(), z3);
    }

    public static final Pair<Integer, String> b3(CharSequence charSequence, Collection<String> collection, int i4, boolean z3, boolean z4) {
        int g32;
        int B3;
        kotlin.ranges.j k02;
        Object obj;
        Object obj2;
        boolean b22;
        int u3;
        Object f5;
        if (!z3 && collection.size() == 1) {
            f5 = kotlin.collections.D.f5(collection);
            String str = (String) f5;
            int p32 = !z4 ? p3(charSequence, str, i4, false, 4, null) : D3(charSequence, str, i4, false, 4, null);
            if (p32 < 0) {
                return null;
            }
            return C2122h0.a(Integer.valueOf(p32), str);
        }
        if (!z4) {
            u3 = kotlin.ranges.u.u(i4, 0);
            k02 = new kotlin.ranges.l(u3, charSequence.length());
        } else {
            g32 = g3(charSequence);
            B3 = kotlin.ranges.u.B(i4, g32);
            k02 = kotlin.ranges.u.k0(B3, 0);
        }
        if (charSequence instanceof String) {
            int l4 = k02.l();
            int m4 = k02.m();
            int n4 = k02.n();
            if ((n4 > 0 && l4 <= m4) || (n4 < 0 && m4 <= l4)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            b22 = z.b2(str2, 0, (String) charSequence, l4, str2.length(), z3);
                            if (b22) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return C2122h0.a(Integer.valueOf(l4), str3);
                    }
                    if (l4 == m4) {
                        break;
                    }
                    l4 += n4;
                }
            }
        } else {
            int l5 = k02.l();
            int m5 = k02.m();
            int n5 = k02.n();
            if ((n5 > 0 && l5 <= m5) || (n5 < 0 && m5 <= l5)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (Y3(str4, 0, charSequence, l5, str4.length(), z3)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return C2122h0.a(Integer.valueOf(l5), str5);
                    }
                    if (l5 == m5) {
                        break;
                    }
                    l5 += n5;
                }
            }
        }
        return null;
    }

    @l3.d
    public static final CharSequence b4(@l3.d CharSequence charSequence, int i4, int i5) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i5 >= i4) {
            if (i5 == i4) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(charSequence.length() - (i5 - i4));
            sb.append(charSequence, 0, i4);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(charSequence, i5, charSequence.length());
            kotlin.jvm.internal.F.o(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i5 + ") is less than start index (" + i4 + ").");
    }

    public static /* synthetic */ boolean b5(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return Y4(charSequence, c4, z3);
    }

    public static /* synthetic */ Pair c3(CharSequence charSequence, Collection collection, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return a3(charSequence, collection, i4, z3);
    }

    @l3.d
    public static final CharSequence c4(@l3.d CharSequence charSequence, @l3.d kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        return b4(charSequence, range.c().intValue(), range.k().intValue() + 1);
    }

    public static /* synthetic */ boolean c5(CharSequence charSequence, CharSequence charSequence2, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return Z4(charSequence, charSequence2, i4, z3);
    }

    @l3.e
    public static final Pair<Integer, String> d3(@l3.d CharSequence charSequence, @l3.d Collection<String> strings, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(strings, "strings");
        return b3(charSequence, strings, i4, z3, true);
    }

    @kotlin.internal.f
    private static final String d4(String str, int i4, int i5) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return b4(str, i4, i5).toString();
    }

    public static /* synthetic */ boolean d5(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return a5(charSequence, charSequence2, z3);
    }

    public static /* synthetic */ Pair e3(CharSequence charSequence, Collection collection, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return d3(charSequence, collection, i4, z3);
    }

    @kotlin.internal.f
    private static final String e4(String str, kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        return c4(str, range).toString();
    }

    @l3.d
    public static final CharSequence e5(@l3.d CharSequence charSequence, @l3.d kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        return charSequence.subSequence(range.c().intValue(), range.k().intValue() + 1);
    }

    @l3.d
    public static final kotlin.ranges.l f3(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return new kotlin.ranges.l(0, charSequence.length() - 1);
    }

    @l3.d
    public static final CharSequence f4(@l3.d CharSequence charSequence, @l3.d CharSequence suffix) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(suffix, "suffix");
        if (Z2(charSequence, suffix, false, 2, null)) {
            return charSequence.subSequence(0, charSequence.length() - suffix.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC2205l(message = "Use parameters named startIndex and endIndex.", replaceWith = @V(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @kotlin.internal.f
    private static final CharSequence f5(String str, int i4, int i5) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.subSequence(i4, i5);
    }

    public static int g3(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @l3.d
    public static final String g4(@l3.d String str, @l3.d CharSequence suffix) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(suffix, "suffix");
        if (Z2(str, suffix, false, 2, null)) {
            String substring = str.substring(0, str.length() - suffix.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @kotlin.internal.f
    private static final String g5(CharSequence charSequence, int i4, int i5) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return charSequence.subSequence(i4, i5).toString();
    }

    public static final boolean h3(@l3.d CharSequence charSequence, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (!new kotlin.ranges.l(0, charSequence.length() - 2).q(i4) || !Character.isHighSurrogate(charSequence.charAt(i4)) || !Character.isLowSurrogate(charSequence.charAt(i4 + 1))) {
            return false;
        }
        return true;
    }

    @l3.d
    public static final CharSequence h4(@l3.d CharSequence charSequence, @l3.d CharSequence delimiter) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        return i4(charSequence, delimiter, delimiter);
    }

    @l3.d
    public static final String h5(@l3.d CharSequence charSequence, @l3.d kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        return charSequence.subSequence(range.c().intValue(), range.k().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R i3(C c4, X2.a<? extends R> defaultValue) {
        boolean S12;
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        S12 = z.S1(c4);
        if (S12) {
            return defaultValue.n();
        }
        return c4;
    }

    @l3.d
    public static final CharSequence i4(@l3.d CharSequence charSequence, @l3.d CharSequence prefix, @l3.d CharSequence suffix) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(suffix, "suffix");
        if (charSequence.length() >= prefix.length() + suffix.length() && d5(charSequence, prefix, false, 2, null) && Z2(charSequence, suffix, false, 2, null)) {
            return charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @l3.d
    public static final String i5(@l3.d String str, @l3.d kotlin.ranges.l range) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(range, "range");
        String substring = str.substring(range.c().intValue(), range.k().intValue() + 1);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R j3(C c4, X2.a<? extends R> defaultValue) {
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (c4.length() == 0) {
            return defaultValue.n();
        }
        return c4;
    }

    @l3.d
    public static final String j4(@l3.d String str, @l3.d CharSequence delimiter) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        return k4(str, delimiter, delimiter);
    }

    static /* synthetic */ String j5(CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = charSequence.length();
        }
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return charSequence.subSequence(i4, i5).toString();
    }

    public static final int k3(@l3.d CharSequence charSequence, char c4, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c4, i4);
        }
        return r3(charSequence, new char[]{c4}, i4, z3);
    }

    @l3.d
    public static final String k4(@l3.d String str, @l3.d CharSequence prefix, @l3.d CharSequence suffix) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        kotlin.jvm.internal.F.p(suffix, "suffix");
        if (str.length() >= prefix.length() + suffix.length() && d5(str, prefix, false, 2, null) && Z2(str, suffix, false, 2, null)) {
            String substring = str.substring(prefix.length(), str.length() - suffix.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @l3.d
    public static final String k5(@l3.d String str, char c4, @l3.d String missingDelimiterValue) {
        int o32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c4, 0, false, 6, null);
        if (o32 != -1) {
            String substring = str.substring(o32 + 1, str.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final int l3(@l3.d CharSequence charSequence, @l3.d String string, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(string, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i4);
        }
        return n3(charSequence, string, i4, charSequence.length(), z3, false, 16, null);
    }

    @kotlin.internal.f
    private static final String l4(CharSequence charSequence, Regex regex, X2.l<? super n, ? extends CharSequence> transform) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        kotlin.jvm.internal.F.p(transform, "transform");
        return regex.m(charSequence, transform);
    }

    @l3.d
    public static final String l5(@l3.d String str, @l3.d String delimiter, @l3.d String missingDelimiterValue) {
        int p32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            String substring = str.substring(p32 + delimiter.length(), str.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    private static final int m3(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4) {
        int g32;
        int B3;
        int u3;
        kotlin.ranges.j k02;
        boolean b22;
        int u4;
        int B4;
        if (!z4) {
            u4 = kotlin.ranges.u.u(i4, 0);
            B4 = kotlin.ranges.u.B(i5, charSequence.length());
            k02 = new kotlin.ranges.l(u4, B4);
        } else {
            g32 = g3(charSequence);
            B3 = kotlin.ranges.u.B(i4, g32);
            u3 = kotlin.ranges.u.u(i5, 0);
            k02 = kotlin.ranges.u.k0(B3, u3);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int l4 = k02.l();
            int m4 = k02.m();
            int n4 = k02.n();
            if ((n4 <= 0 || l4 > m4) && (n4 >= 0 || m4 > l4)) {
                return -1;
            }
            while (true) {
                b22 = z.b2((String) charSequence2, 0, (String) charSequence, l4, charSequence2.length(), z3);
                if (b22) {
                    return l4;
                }
                if (l4 != m4) {
                    l4 += n4;
                } else {
                    return -1;
                }
            }
        } else {
            int l5 = k02.l();
            int m5 = k02.m();
            int n5 = k02.n();
            if ((n5 > 0 && l5 <= m5) || (n5 < 0 && m5 <= l5)) {
                while (!Y3(charSequence2, 0, charSequence, l5, charSequence2.length(), z3)) {
                    if (l5 != m5) {
                        l5 += n5;
                    } else {
                        return -1;
                    }
                }
                return l5;
            }
            return -1;
        }
    }

    @kotlin.internal.f
    private static final String m4(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        return regex.n(charSequence, replacement);
    }

    public static /* synthetic */ String m5(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return k5(str, c4, str2);
    }

    static /* synthetic */ int n3(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            z4 = false;
        }
        return m3(charSequence, charSequence2, i4, i5, z3, z4);
    }

    @l3.d
    public static final String n4(@l3.d String str, char c4, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        int o32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c4, 0, false, 6, null);
        if (o32 != -1) {
            return G4(str, o32 + 1, str.length(), replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String n5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return l5(str, str2, str3);
    }

    public static /* synthetic */ int o3(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return k3(charSequence, c4, i4, z3);
    }

    @l3.d
    public static final String o4(@l3.d String str, @l3.d String delimiter, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        int p32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            return G4(str, p32 + delimiter.length(), str.length(), replacement).toString();
        }
        return missingDelimiterValue;
    }

    @l3.d
    public static String o5(@l3.d String str, char c4, @l3.d String missingDelimiterValue) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        int C3 = C3(str, c4, 0, false, 6, null);
        if (C3 != -1) {
            String substring = str.substring(C3 + 1, str.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ int p3(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return l3(charSequence, str, i4, z3);
    }

    public static /* synthetic */ String p4(String str, char c4, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return n4(str, c4, str2, str3);
    }

    @l3.d
    public static final String p5(@l3.d String str, @l3.d String delimiter, @l3.d String missingDelimiterValue) {
        int D3;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            String substring = str.substring(D3 + delimiter.length(), str.length());
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final int q3(@l3.d CharSequence charSequence, @l3.d Collection<String> strings, int i4, boolean z3) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(strings, "strings");
        Pair<Integer, String> b32 = b3(charSequence, strings, i4, z3, false);
        if (b32 != null) {
            return b32.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String q4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return o4(str, str2, str3, str4);
    }

    public static /* synthetic */ String q5(String str, char c4, String str2, int i4, Object obj) {
        String o5;
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        o5 = o5(str, c4, str2);
        return o5;
    }

    public static final int r3(@l3.d CharSequence charSequence, @l3.d char[] chars, int i4, boolean z3) {
        int u3;
        int g32;
        boolean J3;
        char Vs;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(chars, "chars");
        if (z3 || chars.length != 1 || !(charSequence instanceof String)) {
            u3 = kotlin.ranges.u.u(i4, 0);
            g32 = g3(charSequence);
            P it = new kotlin.ranges.l(u3, g32).iterator();
            while (it.hasNext()) {
                int c4 = it.c();
                char charAt = charSequence.charAt(c4);
                for (char c5 : chars) {
                    J3 = C2221c.J(c5, charAt, z3);
                    if (J3) {
                        return c4;
                    }
                }
            }
            return -1;
        }
        Vs = C2101p.Vs(chars);
        return ((String) charSequence).indexOf(Vs, i4);
    }

    @l3.d
    public static final String r4(@l3.d String str, char c4, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        int C3 = C3(str, c4, 0, false, 6, null);
        if (C3 != -1) {
            return G4(str, C3 + 1, str.length(), replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String r5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return p5(str, str2, str3);
    }

    public static /* synthetic */ int s3(CharSequence charSequence, Collection collection, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return q3(charSequence, collection, i4, z3);
    }

    @l3.d
    public static final String s4(@l3.d String str, @l3.d String delimiter, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        int D3;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            return G4(str, D3 + delimiter.length(), str.length(), replacement).toString();
        }
        return missingDelimiterValue;
    }

    @l3.d
    public static final String s5(@l3.d String str, char c4, @l3.d String missingDelimiterValue) {
        int o32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c4, 0, false, 6, null);
        if (o32 != -1) {
            String substring = str.substring(0, o32);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ int t3(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return r3(charSequence, cArr, i4, z3);
    }

    public static /* synthetic */ String t4(String str, char c4, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return r4(str, c4, str2, str3);
    }

    @l3.d
    public static final String t5(@l3.d String str, @l3.d String delimiter, @l3.d String missingDelimiterValue) {
        int p32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            String substring = str.substring(0, p32);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @kotlin.internal.f
    private static final boolean u3(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String u4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return s4(str, str2, str3, str4);
    }

    public static /* synthetic */ String u5(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return s5(str, c4, str2);
    }

    @kotlin.internal.f
    private static final boolean v3(CharSequence charSequence) {
        boolean S12;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        S12 = z.S1(charSequence);
        return !S12;
    }

    @l3.d
    public static final String v4(@l3.d String str, char c4, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        int o32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        o32 = o3(str, c4, 0, false, 6, null);
        if (o32 != -1) {
            return G4(str, 0, o32, replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String v5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return t5(str, str2, str3);
    }

    @kotlin.internal.f
    private static final boolean w3(CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() > 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final String w4(@l3.d String str, @l3.d String delimiter, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        int p32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        p32 = p3(str, delimiter, 0, false, 6, null);
        if (p32 != -1) {
            return G4(str, 0, p32, replacement).toString();
        }
        return missingDelimiterValue;
    }

    @l3.d
    public static final String w5(@l3.d String str, char c4, @l3.d String missingDelimiterValue) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        int C3 = C3(str, c4, 0, false, 6, null);
        if (C3 != -1) {
            String substring = str.substring(0, C3);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @kotlin.internal.f
    private static final boolean x3(CharSequence charSequence) {
        boolean S12;
        if (charSequence != null) {
            S12 = z.S1(charSequence);
            if (!S12) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String x4(String str, char c4, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return v4(str, c4, str2, str3);
    }

    @l3.d
    public static final String x5(@l3.d String str, @l3.d String delimiter, @l3.d String missingDelimiterValue) {
        int D3;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(delimiter, "delimiter");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        D3 = D3(str, delimiter, 0, false, 6, null);
        if (D3 != -1) {
            String substring = str.substring(0, D3);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    @kotlin.internal.f
    private static final boolean y3(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String y4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return w4(str, str2, str3, str4);
    }

    public static /* synthetic */ String y5(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return w5(str, c4, str2);
    }

    @l3.d
    public static final AbstractC2106t z3(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return new a(charSequence);
    }

    @l3.d
    public static final String z4(@l3.d String str, char c4, @l3.d String replacement, @l3.d String missingDelimiterValue) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        kotlin.jvm.internal.F.p(missingDelimiterValue, "missingDelimiterValue");
        int C3 = C3(str, c4, 0, false, 6, null);
        if (C3 != -1) {
            return G4(str, 0, C3, replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String z5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return x5(str, str2, str3);
    }
}
