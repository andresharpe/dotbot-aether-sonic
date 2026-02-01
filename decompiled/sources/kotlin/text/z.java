package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;
import kotlin.K0;
import kotlin.V;
import kotlin.Y;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.C2100o;
import kotlin.collections.P;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.W;

@U({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,805:1\n1174#2,2:806\n1#3:808\n1726#4,3:809\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:806,2\n600#1:809,3\n*E\n"})
/* loaded from: classes2.dex */
public class z extends y {
    @l3.d
    @InterfaceC2205l(message = "Use replaceFirstChar instead.", replaceWith = @V(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final String A1(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        if (str.length() > 0 && !Character.isLowerCase(str.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            kotlin.jvm.internal.F.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase();
            kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            kotlin.jvm.internal.F.o(substring2, "substring(...)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    public static /* synthetic */ char[] A2(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return y2(str, i4, i5);
    }

    @kotlin.internal.h
    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Use replaceFirstChar instead.", replaceWith = @V(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.4")
    public static final String B1(@l3.d String str, @l3.d Locale locale) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(locale, "locale");
        if (str.length() > 0 && !Character.isLowerCase(str.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            kotlin.jvm.internal.F.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            kotlin.jvm.internal.F.o(substring2, "substring(...)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    static /* synthetic */ char[] B2(String str, char[] destination, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = str.length();
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        str.getChars(i5, i6, destination, i4);
        return destination;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final String C1(@l3.d byte[] bArr) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        return new String(bArr, C2222d.f52792b);
    }

    @InterfaceC2205l(message = "Use lowercase() instead.", replaceWith = @V(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final String C2(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final String D1(@l3.d byte[] bArr, int i4, int i5, boolean z3) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        AbstractC2088c.f51901E.a(i4, i5, bArr.length);
        if (!z3) {
            return new String(bArr, i4, i5 - i4, C2222d.f52792b);
        }
        CharsetDecoder newDecoder = C2222d.f52792b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i4, i5 - i4)).toString();
        kotlin.jvm.internal.F.o(charBuffer, "toString(...)");
        return charBuffer;
    }

    @InterfaceC2205l(message = "Use lowercase() instead.", replaceWith = @V(expression = "lowercase(locale)", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final String D2(String str, Locale locale) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static /* synthetic */ String E1(byte[] bArr, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return D1(bArr, i4, i5, z3);
    }

    @kotlin.internal.f
    private static final Pattern E2(String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i4);
        kotlin.jvm.internal.F.o(compile, "compile(...)");
        return compile;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static byte[] F1(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        byte[] bytes = str.getBytes(C2222d.f52792b);
        kotlin.jvm.internal.F.o(bytes, "getBytes(...)");
        return bytes;
    }

    static /* synthetic */ Pattern F2(String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i4);
        kotlin.jvm.internal.F.o(compile, "compile(...)");
        return compile;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final byte[] G1(@l3.d String str, int i4, int i5, boolean z3) {
        kotlin.jvm.internal.F.p(str, "<this>");
        AbstractC2088c.f51901E.a(i4, i5, str.length());
        if (!z3) {
            String substring = str.substring(i4, i5);
            kotlin.jvm.internal.F.o(substring, "substring(...)");
            Charset charset = C2222d.f52792b;
            kotlin.jvm.internal.F.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.F.o(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder newEncoder = C2222d.f52792b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i4, i5));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.F.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.F.m(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @InterfaceC2205l(message = "Use uppercase() instead.", replaceWith = @V(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final String G2(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ byte[] H1(String str, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        return G1(str, i4, i5, z3);
    }

    @InterfaceC2205l(message = "Use uppercase() instead.", replaceWith = @V(expression = "uppercase(locale)", imports = {}))
    @kotlin.internal.f
    @InterfaceC2207m(warningSince = "1.5")
    private static final String H2(String str, Locale locale) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final boolean I1(@l3.d String str, @l3.d String suffix, boolean z3) {
        boolean b22;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(suffix, "suffix");
        if (z3) {
            b22 = b2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
            return b22;
        }
        return str.endsWith(suffix);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String I2(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ boolean J1(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return I1(str, str2, z3);
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String J2(String str, Locale locale) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static boolean K1(@l3.e String str, @l3.e String str2, boolean z3) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z3) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean L1(String str, String str2, boolean z3, int i4, Object obj) {
        boolean K12;
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        K12 = K1(str, str2, z3);
        return K12;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final String M1(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(args, "args");
        String format = String.format(locale, str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.F.o(format, "format(...)");
        return format;
    }

    @kotlin.internal.f
    private static final String N1(String str, Object... args) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(args, "args");
        String format = String.format(str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.F.o(format, "format(...)");
        return format;
    }

    @kotlin.internal.f
    private static final String O1(W w3, String format, Object... args) {
        kotlin.jvm.internal.F.p(w3, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        kotlin.jvm.internal.F.p(args, "args");
        String format2 = String.format(format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.F.o(format2, "format(...)");
        return format2;
    }

    @Y(version = "1.4")
    @kotlin.internal.f
    private static final String P1(W w3, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.F.p(w3, "<this>");
        kotlin.jvm.internal.F.p(format, "format");
        kotlin.jvm.internal.F.p(args, "args");
        String format2 = String.format(locale, format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.F.o(format2, "format(...)");
        return format2;
    }

    @l3.d
    public static final Comparator<String> Q1(@l3.d W w3) {
        kotlin.jvm.internal.F.p(w3, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.F.o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @kotlin.internal.f
    private static final String R1(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String intern = str.intern();
        kotlin.jvm.internal.F.o(intern, "intern(...)");
        return intern;
    }

    public static boolean S1(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable f32 = A.f3(charSequence);
            if (!(f32 instanceof Collection) || !((Collection) f32).isEmpty()) {
                Iterator it = f32.iterator();
                while (it.hasNext()) {
                    if (!C2220b.r(charSequence.charAt(((P) it).c()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String T1(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.5")
    @kotlin.internal.f
    private static final String U1(String str, Locale locale) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.F.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @kotlin.internal.f
    private static final int V1(String str, char c4, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.indexOf(c4, i4);
    }

    @kotlin.internal.f
    private static final int W1(String str, String str2, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(str2, "str");
        return str.indexOf(str2, i4);
    }

    @kotlin.internal.f
    private static final int X1(String str, char c4, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.lastIndexOf(c4, i4);
    }

    @kotlin.internal.f
    private static final int Y1(String str, String str2, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(str2, "str");
        return str.lastIndexOf(str2, i4);
    }

    @kotlin.internal.f
    private static final int Z1(String str, int i4, int i5) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.offsetByCodePoints(i4, i5);
    }

    public static final boolean a2(@l3.d CharSequence charSequence, int i4, @l3.d CharSequence other, int i5, int i6, boolean z3) {
        boolean b22;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        if ((charSequence instanceof String) && (other instanceof String)) {
            b22 = b2((String) charSequence, i4, (String) other, i5, i6, z3);
            return b22;
        }
        return A.Y3(charSequence, i4, other, i5, i6, z3);
    }

    public static boolean b2(@l3.d String str, int i4, @l3.d String other, int i5, int i6, boolean z3) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        if (!z3) {
            return str.regionMatches(i4, other, i5, i6);
        }
        return str.regionMatches(z3, i4, other, i5, i6);
    }

    public static /* synthetic */ boolean c2(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z3, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z3 = false;
        }
        return a2(charSequence, i4, charSequence2, i5, i6, z3);
    }

    @kotlin.internal.f
    private static final String d1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.F.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    public static /* synthetic */ boolean d2(String str, int i4, String str2, int i5, int i6, boolean z3, int i7, Object obj) {
        boolean b22;
        if ((i7 & 16) != 0) {
            z3 = false;
        }
        b22 = b2(str, i4, str2, i5, i6, z3);
        return b22;
    }

    @kotlin.internal.f
    private static final String e1(StringBuilder stringBuilder) {
        kotlin.jvm.internal.F.p(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @l3.d
    public static String e2(@l3.d CharSequence charSequence, int i4) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                return "";
            }
            if (i4 != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i4);
                    P it = new kotlin.ranges.l(1, i4).iterator();
                    while (it.hasNext()) {
                        it.c();
                        sb.append(charSequence);
                    }
                    String sb2 = sb.toString();
                    kotlin.jvm.internal.F.m(sb2);
                    return sb2;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    cArr[i5] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i4 + '.').toString());
    }

    @kotlin.internal.f
    private static final String f1(byte[] bytes) {
        kotlin.jvm.internal.F.p(bytes, "bytes");
        return new String(bytes, C2222d.f52792b);
    }

    @l3.d
    public static final String f2(@l3.d String str, char c4, char c5, boolean z3) {
        boolean J3;
        kotlin.jvm.internal.F.p(str, "<this>");
        if (!z3) {
            String replace = str.replace(c4, c5);
            kotlin.jvm.internal.F.o(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            J3 = C2221c.J(charAt, c4, z3);
            if (J3) {
                charAt = c5;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @kotlin.internal.f
    private static final String g1(byte[] bytes, int i4, int i5) {
        kotlin.jvm.internal.F.p(bytes, "bytes");
        return new String(bytes, i4, i5, C2222d.f52792b);
    }

    @l3.d
    public static final String g2(@l3.d String str, @l3.d String oldValue, @l3.d String newValue, boolean z3) {
        int u3;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(oldValue, "oldValue");
        kotlin.jvm.internal.F.p(newValue, "newValue");
        int i4 = 0;
        int l32 = A.l3(str, oldValue, 0, z3);
        if (l32 < 0) {
            return str;
        }
        int length = oldValue.length();
        u3 = kotlin.ranges.u.u(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i4, l32);
                sb.append(newValue);
                i4 = l32 + length;
                if (l32 >= str.length()) {
                    break;
                }
                l32 = A.l3(str, oldValue, l32 + u3, z3);
            } while (l32 > 0);
            sb.append((CharSequence) str, i4, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    @kotlin.internal.f
    private static final String h1(byte[] bytes, int i4, int i5, Charset charset) {
        kotlin.jvm.internal.F.p(bytes, "bytes");
        kotlin.jvm.internal.F.p(charset, "charset");
        return new String(bytes, i4, i5, charset);
    }

    public static /* synthetic */ String h2(String str, char c4, char c5, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return f2(str, c4, c5, z3);
    }

    @kotlin.internal.f
    private static final String i1(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.F.p(bytes, "bytes");
        kotlin.jvm.internal.F.p(charset, "charset");
        return new String(bytes, charset);
    }

    public static /* synthetic */ String i2(String str, String str2, String str3, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return g2(str, str2, str3, z3);
    }

    @kotlin.internal.f
    private static final String j1(char[] chars) {
        kotlin.jvm.internal.F.p(chars, "chars");
        return new String(chars);
    }

    @l3.d
    public static final String j2(@l3.d String str, char c4, char c5, boolean z3) {
        int o32;
        kotlin.jvm.internal.F.p(str, "<this>");
        o32 = A.o3(str, c4, 0, z3, 2, null);
        if (o32 >= 0) {
            return A.G4(str, o32, o32 + 1, String.valueOf(c5)).toString();
        }
        return str;
    }

    @kotlin.internal.f
    private static final String k1(char[] chars, int i4, int i5) {
        kotlin.jvm.internal.F.p(chars, "chars");
        return new String(chars, i4, i5);
    }

    @l3.d
    public static final String k2(@l3.d String str, @l3.d String oldValue, @l3.d String newValue, boolean z3) {
        int p32;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(oldValue, "oldValue");
        kotlin.jvm.internal.F.p(newValue, "newValue");
        p32 = A.p3(str, oldValue, 0, z3, 2, null);
        if (p32 >= 0) {
            return A.G4(str, p32, oldValue.length() + p32, newValue).toString();
        }
        return str;
    }

    @kotlin.internal.f
    private static final String l1(int[] codePoints, int i4, int i5) {
        kotlin.jvm.internal.F.p(codePoints, "codePoints");
        return new String(codePoints, i4, i5);
    }

    public static /* synthetic */ String l2(String str, char c4, char c5, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return j2(str, c4, c5, z3);
    }

    @l3.d
    @InterfaceC2205l(message = "Use replaceFirstChar instead.", replaceWith = @V(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @InterfaceC2207m(warningSince = "1.5")
    public static final String m1(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.F.o(locale, "getDefault(...)");
        return n1(str, locale);
    }

    public static /* synthetic */ String m2(String str, String str2, String str3, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return k2(str, str2, str3, z3);
    }

    @kotlin.internal.h
    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Use replaceFirstChar instead.", replaceWith = @V(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @InterfaceC2207m(warningSince = "1.5")
    @Y(version = "1.4")
    public static final String n1(@l3.d String str, @l3.d Locale locale) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    kotlin.jvm.internal.F.o(substring, "substring(...)");
                    kotlin.jvm.internal.F.n(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    kotlin.jvm.internal.F.o(upperCase, "toUpperCase(...)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                kotlin.jvm.internal.F.o(substring2, "substring(...)");
                sb.append(substring2);
                String sb2 = sb.toString();
                kotlin.jvm.internal.F.o(sb2, "toString(...)");
                return sb2;
            }
            return str;
        }
        return str;
    }

    @l3.d
    public static final List<String> n2(@l3.d CharSequence charSequence, @l3.d Pattern regex, int i4) {
        List<String> t3;
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        kotlin.jvm.internal.F.p(regex, "regex");
        A.K4(i4);
        if (i4 == 0) {
            i4 = -1;
        }
        String[] split = regex.split(charSequence, i4);
        kotlin.jvm.internal.F.o(split, "split(...)");
        t3 = C2100o.t(split);
        return t3;
    }

    @kotlin.internal.f
    private static final int o1(String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.codePointAt(i4);
    }

    public static /* synthetic */ List o2(CharSequence charSequence, Pattern pattern, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return n2(charSequence, pattern, i4);
    }

    @kotlin.internal.f
    private static final int p1(String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.codePointBefore(i4);
    }

    public static final boolean p2(@l3.d String str, @l3.d String prefix, int i4, boolean z3) {
        boolean b22;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        if (z3) {
            b22 = b2(str, i4, prefix, 0, prefix.length(), z3);
            return b22;
        }
        return str.startsWith(prefix, i4);
    }

    @kotlin.internal.f
    private static final int q1(String str, int i4, int i5) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return str.codePointCount(i4, i5);
    }

    public static final boolean q2(@l3.d String str, @l3.d String prefix, boolean z3) {
        boolean b22;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(prefix, "prefix");
        if (z3) {
            b22 = b2(str, 0, prefix, 0, prefix.length(), z3);
            return b22;
        }
        return str.startsWith(prefix);
    }

    public static final int r1(@l3.d String str, @l3.d String other, boolean z3) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        if (z3) {
            return str.compareToIgnoreCase(other);
        }
        return str.compareTo(other);
    }

    public static /* synthetic */ boolean r2(String str, String str2, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return p2(str, str2, i4, z3);
    }

    public static /* synthetic */ int s1(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return r1(str, str2, z3);
    }

    public static /* synthetic */ boolean s2(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return q2(str, str2, z3);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final String t1(@l3.d char[] cArr) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        return new String(cArr);
    }

    @kotlin.internal.f
    private static final String t2(String str, int i4) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String substring = str.substring(i4);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        return substring;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final String u1(@l3.d char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.F.p(cArr, "<this>");
        AbstractC2088c.f51901E.a(i4, i5, cArr.length);
        return new String(cArr, i4, i5 - i4);
    }

    @kotlin.internal.f
    private static final String u2(String str, int i4, int i5) {
        kotlin.jvm.internal.F.p(str, "<this>");
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.F.o(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String v1(char[] cArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = cArr.length;
        }
        return u1(cArr, i4, i5);
    }

    @kotlin.internal.f
    private static final byte[] v2(String str, Charset charset) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.F.o(bytes, "getBytes(...)");
        return bytes;
    }

    @Y(version = "1.5")
    public static boolean w1(@l3.e CharSequence charSequence, @l3.e CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return A.V2(charSequence, charSequence2);
    }

    static /* synthetic */ byte[] w2(String str, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = C2222d.f52792b;
        }
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.F.o(bytes, "getBytes(...)");
        return bytes;
    }

    @Y(version = "1.5")
    public static final boolean x1(@l3.e CharSequence charSequence, @l3.e CharSequence charSequence2, boolean z3) {
        boolean w12;
        if (!z3) {
            w12 = w1(charSequence, charSequence2);
            return w12;
        }
        return A.U2(charSequence, charSequence2);
    }

    @kotlin.internal.f
    private static final char[] x2(String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.F.o(charArray, "toCharArray(...)");
        return charArray;
    }

    @kotlin.internal.f
    private static final boolean y1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final char[] y2(@l3.d String str, int i4, int i5) {
        kotlin.jvm.internal.F.p(str, "<this>");
        AbstractC2088c.f51901E.a(i4, i5, str.length());
        char[] cArr = new char[i5 - i4];
        str.getChars(i4, i5, cArr, 0);
        return cArr;
    }

    @kotlin.internal.f
    private static final boolean z1(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    @kotlin.internal.f
    private static final char[] z2(String str, char[] destination, int i4, int i5, int i6) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        str.getChars(i5, i6, destination, i4);
        return destination;
    }
}
