package kotlin.text;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@U({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* loaded from: classes2.dex */
public class s extends r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.l<String, String> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f52857F = new a();

        a() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d String line) {
            kotlin.jvm.internal.F.p(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.l<String, String> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f52858F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f52858F = str;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d String line) {
            kotlin.jvm.internal.F.p(line, "line");
            return this.f52858F + line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<String, String> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f52859F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f52859F = str;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d String it) {
            boolean S12;
            kotlin.jvm.internal.F.p(it, "it");
            S12 = z.S1(it);
            if (S12) {
                if (it.length() < this.f52859F.length()) {
                    return this.f52859F;
                }
                return it;
            }
            return this.f52859F + it;
        }
    }

    private static final X2.l<String, String> g(String str) {
        if (str.length() == 0) {
            return a.f52857F;
        }
        return new b(str);
    }

    private static final int h(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (!C2220b.r(str.charAt(i4))) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 == -1) {
            return str.length();
        }
        return i4;
    }

    @l3.d
    public static final String i(@l3.d String str, @l3.d String indent) {
        kotlin.sequences.m k12;
        String e12;
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(indent, "indent");
        k12 = SequencesKt___SequencesKt.k1(A.I3(str), new c(indent));
        e12 = SequencesKt___SequencesKt.e1(k12, "\n", null, null, 0, null, null, 62, null);
        return e12;
    }

    public static /* synthetic */ String j(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String k(java.util.List<java.lang.String> r11, int r12, X2.l<? super java.lang.String, java.lang.String> r13, X2.l<? super java.lang.String, java.lang.String> r14) {
        /*
            int r0 = kotlin.collections.C2107u.J(r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
            r2 = 0
            r3 = r2
        Lf:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r11.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L31
            r6 = 3
            r7 = 1
            boolean r6 = kotlin.internal.m.a(r7, r6, r2)
            if (r6 == 0) goto L29
            kotlin.collections.C2107u.Z()
            goto L31
        L29:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Index overflow has happened."
            r11.<init>(r12)
            throw r11
        L31:
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L37
            if (r3 != r0) goto L3f
        L37:
            boolean r3 = kotlin.text.q.S1(r4)
            if (r3 == 0) goto L3f
            r4 = 0
            goto L51
        L3f:
            java.lang.Object r3 = r14.C(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L51
            java.lang.Object r3 = r13.C(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L50
            goto L51
        L50:
            r4 = r3
        L51:
            if (r4 == 0) goto L56
            r1.add(r4)
        L56:
            r3 = r5
            goto Lf
        L58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r3 = "\n"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r10 = 0
            java.lang.Appendable r11 = kotlin.collections.C2107u.k3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r11 = (java.lang.StringBuilder) r11
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "toString(...)"
            kotlin.jvm.internal.F.o(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.s.k(java.util.List, int, X2.l, X2.l):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[SYNTHETIC] */
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String l(@l3.d java.lang.String r14, @l3.d java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.F.p(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.F.p(r15, r0)
            java.util.List r0 = kotlin.text.A.J3(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.q.S1(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C2107u.b0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = h(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3f
        L57:
            java.lang.Comparable r1 = kotlin.collections.C2107u.h4(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L65
            int r1 = r1.intValue()
            goto L66
        L65:
            r1 = r2
        L66:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            X2.l r15 = g(r15)
            int r3 = kotlin.collections.C2107u.J(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L85:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L96
            kotlin.collections.C2107u.Z()
        L96:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9c
            if (r2 != r3) goto La4
        L9c:
            boolean r2 = kotlin.text.q.S1(r5)
            if (r2 == 0) goto La4
            r5 = 0
            goto Lb4
        La4:
            java.lang.String r2 = kotlin.text.q.y6(r5, r1)
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r15.C(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb3
            goto Lb4
        Lb3:
            r5 = r2
        Lb4:
            if (r5 == 0) goto Lb9
            r4.add(r5)
        Lb9:
            r2 = r6
            goto L85
        Lbb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.Appendable r14 = kotlin.collections.C2107u.k3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "toString(...)"
            kotlin.jvm.internal.F.o(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.s.l(java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String m(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[SYNTHETIC] */
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String n(@l3.d java.lang.String r21, @l3.d java.lang.String r22, @l3.d java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.s.n(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "";
        }
        if ((i4 & 2) != 0) {
            str3 = "|";
        }
        return n(str, str2, str3);
    }

    @l3.d
    @kotlin.internal.g
    public static String p(@l3.d String str) {
        kotlin.jvm.internal.F.p(str, "<this>");
        return l(str, "");
    }

    @l3.d
    @kotlin.internal.g
    public static final String q(@l3.d String str, @l3.d String marginPrefix) {
        kotlin.jvm.internal.F.p(str, "<this>");
        kotlin.jvm.internal.F.p(marginPrefix, "marginPrefix");
        return n(str, "", marginPrefix);
    }

    public static /* synthetic */ String r(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "|";
        }
        return q(str, str2);
    }
}
