package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.sdk.command.BaseCommandWiFi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.H0;
import kotlin.K0;
import kotlin.Y;
import kotlin.collections.C2108v;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;

@kotlin.E(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 @2\u00060\u0001j\u0002`\u0002:\u0002A\u000bB\u0011\b\u0001\u0012\u0006\u0010/\u001a\u00020*¢\u0006\u0004\b:\u0010;B\u0011\b\u0016\u0012\u0006\u00106\u001a\u00020\u001a¢\u0006\u0004\b:\u0010<B\u0019\b\u0016\u0012\u0006\u00106\u001a\u00020\u001a\u0012\u0006\u0010=\u001a\u000201¢\u0006\u0004\b:\u0010>B\u001f\b\u0016\u0012\u0006\u00106\u001a\u00020\u001a\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b:\u0010?J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010\u001dJ%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\f¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00104\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0017\u00109\u001a\b\u0012\u0004\u0012\u000201008F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006B"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "u", "()Ljava/lang/Object;", "", "input", "", "k", "(Ljava/lang/CharSequence;)Z", com.harman.log.b.f47574c, "", "startIndex", "Lkotlin/text/n;", "c", "(Ljava/lang/CharSequence;I)Lkotlin/text/n;", "Lkotlin/sequences/m;", "e", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/m;", "j", "(Ljava/lang/CharSequence;)Lkotlin/text/n;", FirebaseAnalytics.b.f34777X, "i", "l", "(Ljava/lang/CharSequence;I)Z", "", "replacement", "n", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "m", "(Ljava/lang/CharSequence;LX2/l;)Ljava/lang/String;", "o", "limit", "", "p", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "r", "toString", "()Ljava/lang/String;", "Ljava/util/regex/Pattern;", "t", "()Ljava/util/regex/Pattern;", androidx.exifinterface.media.a.U4, "Ljava/util/regex/Pattern;", "nativePattern", "", "Lkotlin/text/RegexOption;", "F", "Ljava/util/Set;", "_options", "h", "pattern", "g", "()Ljava/util/Set;", "options", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "G", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
/* loaded from: classes2.dex */
public final class Regex implements Serializable {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f52771G = new a(null);

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Pattern f52772E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private Set<? extends RegexOption> f52773F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i4) {
            return (i4 & 2) != 0 ? i4 | 64 : i4;
        }

        @l3.d
        public final String c(@l3.d String literal) {
            kotlin.jvm.internal.F.p(literal, "literal");
            String quote = Pattern.quote(literal);
            kotlin.jvm.internal.F.o(quote, "quote(...)");
            return quote;
        }

        @l3.d
        public final String d(@l3.d String literal) {
            kotlin.jvm.internal.F.p(literal, "literal");
            String quoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.F.o(quoteReplacement, "quoteReplacement(...)");
            return quoteReplacement;
        }

        @l3.d
        public final Regex e(@l3.d String literal) {
            kotlin.jvm.internal.F.p(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    private static final class b implements Serializable {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        public static final a f52775G = new a(null);

        /* renamed from: H, reason: collision with root package name */
        private static final long f52776H = 0;

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final String f52777E;

        /* renamed from: F, reason: collision with root package name */
        private final int f52778F;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        public b(@l3.d String pattern, int i4) {
            kotlin.jvm.internal.F.p(pattern, "pattern");
            this.f52777E = pattern;
            this.f52778F = i4;
        }

        private final Object c() {
            Pattern compile = Pattern.compile(this.f52777E, this.f52778F);
            kotlin.jvm.internal.F.o(compile, "compile(...)");
            return new Regex(compile);
        }

        public final int a() {
            return this.f52778F;
        }

        @l3.d
        public final String b() {
            return this.f52777E;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.a<n> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ CharSequence f52780G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f52781H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i4) {
            super(0);
            this.f52780G = charSequence;
            this.f52781H = i4;
        }

        @Override // X2.a
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n n() {
            return Regex.this.c(this.f52780G, this.f52781H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends FunctionReferenceImpl implements X2.l<n, n> {

        /* renamed from: N, reason: collision with root package name */
        public static final d f52782N = new d();

        d() {
            super(1, n.class, L1.a.f1577e0, "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // X2.l
        @l3.e
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final n C(@l3.d n p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return p02.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, BaseCommandWiFi.f47637Q}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    /* loaded from: classes2.dex */
    public static final class e extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super String>, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f52783G;

        /* renamed from: H, reason: collision with root package name */
        int f52784H;

        /* renamed from: I, reason: collision with root package name */
        int f52785I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f52786J;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ CharSequence f52788L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f52789M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence, int i4, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f52788L = charSequence;
            this.f52789M = i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006e -> B:13:0x0071). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.f52785I
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.W.n(r10)
                goto L9d
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                int r1 = r9.f52784H
                java.lang.Object r5 = r9.f52783G
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r9.f52786J
                kotlin.sequences.o r6 = (kotlin.sequences.o) r6
                kotlin.W.n(r10)
                r10 = r5
                goto L71
            L2d:
                kotlin.W.n(r10)
                goto Laf
            L32:
                kotlin.W.n(r10)
                java.lang.Object r10 = r9.f52786J
                kotlin.sequences.o r10 = (kotlin.sequences.o) r10
                kotlin.text.Regex r1 = kotlin.text.Regex.this
                java.util.regex.Pattern r1 = kotlin.text.Regex.a(r1)
                java.lang.CharSequence r5 = r9.f52788L
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r9.f52789M
                if (r5 == r4) goto La0
                boolean r5 = r1.find()
                if (r5 != 0) goto L50
                goto La0
            L50:
                r5 = 0
                r6 = r10
                r10 = r1
                r1 = r5
            L54:
                java.lang.CharSequence r7 = r9.f52788L
                int r8 = r10.start()
                java.lang.CharSequence r5 = r7.subSequence(r5, r8)
                java.lang.String r5 = r5.toString()
                r9.f52786J = r6
                r9.f52783G = r10
                r9.f52784H = r1
                r9.f52785I = r3
                java.lang.Object r5 = r6.b(r5, r9)
                if (r5 != r0) goto L71
                return r0
            L71:
                int r5 = r10.end()
                int r1 = r1 + r4
                int r7 = r9.f52789M
                int r7 = r7 - r4
                if (r1 == r7) goto L81
                boolean r7 = r10.find()
                if (r7 != 0) goto L54
            L81:
                java.lang.CharSequence r10 = r9.f52788L
                int r1 = r10.length()
                java.lang.CharSequence r10 = r10.subSequence(r5, r1)
                java.lang.String r10 = r10.toString()
                r1 = 0
                r9.f52786J = r1
                r9.f52783G = r1
                r9.f52785I = r2
                java.lang.Object r10 = r6.b(r10, r9)
                if (r10 != r0) goto L9d
                return r0
            L9d:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            La0:
                java.lang.CharSequence r1 = r9.f52788L
                java.lang.String r1 = r1.toString()
                r9.f52785I = r4
                java.lang.Object r10 = r10.b(r1, r9)
                if (r10 != r0) goto Laf
                return r0
            Laf:
                kotlin.H0 r10 = kotlin.H0.f51801a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.e.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super String> oVar, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(oVar, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            e eVar = new e(this.f52788L, this.f52789M, cVar);
            eVar.f52786J = obj;
            return eVar;
        }
    }

    @kotlin.U
    public Regex(@l3.d Pattern nativePattern) {
        kotlin.jvm.internal.F.p(nativePattern, "nativePattern");
        this.f52772E = nativePattern;
    }

    public static /* synthetic */ n d(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.c(charSequence, i4);
    }

    public static /* synthetic */ kotlin.sequences.m f(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.e(charSequence, i4);
    }

    public static /* synthetic */ List q(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.p(charSequence, i4);
    }

    public static /* synthetic */ kotlin.sequences.m s(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.r(charSequence, i4);
    }

    private final Object u() {
        String pattern = this.f52772E.pattern();
        kotlin.jvm.internal.F.o(pattern, "pattern(...)");
        return new b(pattern, this.f52772E.flags());
    }

    public final boolean b(@l3.d CharSequence input) {
        kotlin.jvm.internal.F.p(input, "input");
        return this.f52772E.matcher(input).find();
    }

    @l3.e
    public final n c(@l3.d CharSequence input, int i4) {
        kotlin.jvm.internal.F.p(input, "input");
        Matcher matcher = this.f52772E.matcher(input);
        kotlin.jvm.internal.F.o(matcher, "matcher(...)");
        return RegexKt.a(matcher, i4, input);
    }

    @l3.d
    public final kotlin.sequences.m<n> e(@l3.d CharSequence input, int i4) {
        kotlin.sequences.m<n> m4;
        kotlin.jvm.internal.F.p(input, "input");
        if (i4 >= 0 && i4 <= input.length()) {
            m4 = kotlin.sequences.s.m(new c(input, i4), d.f52782N);
            return m4;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i4 + ", input length: " + input.length());
    }

    @l3.d
    public final Set<RegexOption> g() {
        Set set = this.f52773F;
        if (set == null) {
            final int flags = this.f52772E.flags();
            EnumSet allOf = EnumSet.allOf(RegexOption.class);
            kotlin.jvm.internal.F.m(allOf);
            kotlin.collections.A.Q0(allOf, new X2.l<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // X2.l
                @l3.d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean C(RegexOption regexOption) {
                    boolean z3;
                    RegexOption regexOption2 = regexOption;
                    if ((flags & regexOption2.b()) == regexOption2.getValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                }
            });
            Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
            kotlin.jvm.internal.F.o(unmodifiableSet, "unmodifiableSet(...)");
            this.f52773F = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @l3.d
    public final String h() {
        String pattern = this.f52772E.pattern();
        kotlin.jvm.internal.F.o(pattern, "pattern(...)");
        return pattern;
    }

    @l3.e
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.7")
    public final n i(@l3.d CharSequence input, int i4) {
        kotlin.jvm.internal.F.p(input, "input");
        Matcher region = this.f52772E.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i4, input.length());
        if (region.lookingAt()) {
            kotlin.jvm.internal.F.m(region);
            return new o(region, input);
        }
        return null;
    }

    @l3.e
    public final n j(@l3.d CharSequence input) {
        kotlin.jvm.internal.F.p(input, "input");
        Matcher matcher = this.f52772E.matcher(input);
        kotlin.jvm.internal.F.o(matcher, "matcher(...)");
        return RegexKt.b(matcher, input);
    }

    public final boolean k(@l3.d CharSequence input) {
        kotlin.jvm.internal.F.p(input, "input");
        return this.f52772E.matcher(input).matches();
    }

    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.7")
    public final boolean l(@l3.d CharSequence input, int i4) {
        kotlin.jvm.internal.F.p(input, "input");
        return this.f52772E.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i4, input.length()).lookingAt();
    }

    @l3.d
    public final String m(@l3.d CharSequence input, @l3.d X2.l<? super n, ? extends CharSequence> transform) {
        kotlin.jvm.internal.F.p(input, "input");
        kotlin.jvm.internal.F.p(transform, "transform");
        int i4 = 0;
        n d4 = d(this, input, 0, 2, null);
        if (d4 == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i4, d4.d().c().intValue());
            sb.append(transform.C(d4));
            i4 = d4.d().k().intValue() + 1;
            d4 = d4.next();
            if (i4 >= length) {
                break;
            }
        } while (d4 != null);
        if (i4 < length) {
            sb.append(input, i4, length);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }

    @l3.d
    public final String n(@l3.d CharSequence input, @l3.d String replacement) {
        kotlin.jvm.internal.F.p(input, "input");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        String replaceAll = this.f52772E.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.F.o(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @l3.d
    public final String o(@l3.d CharSequence input, @l3.d String replacement) {
        kotlin.jvm.internal.F.p(input, "input");
        kotlin.jvm.internal.F.p(replacement, "replacement");
        String replaceFirst = this.f52772E.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.F.o(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    @l3.d
    public final List<String> p(@l3.d CharSequence input, int i4) {
        List<String> k4;
        kotlin.jvm.internal.F.p(input, "input");
        A.K4(i4);
        Matcher matcher = this.f52772E.matcher(input);
        if (i4 == 1 || !matcher.find()) {
            k4 = C2108v.k(input.toString());
            return k4;
        }
        int i5 = 10;
        if (i4 > 0) {
            i5 = kotlin.ranges.u.B(i4, 10);
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = i4 - 1;
        int i7 = 0;
        do {
            arrayList.add(input.subSequence(i7, matcher.start()).toString());
            i7 = matcher.end();
            if (i6 >= 0 && arrayList.size() == i6) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i7, input.length()).toString());
        return arrayList;
    }

    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.6")
    public final kotlin.sequences.m<String> r(@l3.d CharSequence input, int i4) {
        kotlin.sequences.m<String> b4;
        kotlin.jvm.internal.F.p(input, "input");
        A.K4(i4);
        b4 = kotlin.sequences.q.b(new e(input, i4, null));
        return b4;
    }

    @l3.d
    public final Pattern t() {
        return this.f52772E;
    }

    @l3.d
    public String toString() {
        String pattern = this.f52772E.toString();
        kotlin.jvm.internal.F.o(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@l3.d java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.F.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.F.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@l3.d java.lang.String r2, @l3.d kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.F.p(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.F.p(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.f52771G
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.F.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@l3.d java.lang.String r2, @l3.d java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.F.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.F.p(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.f52771G
            int r3 = kotlin.text.RegexKt.e(r3)
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.F.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
