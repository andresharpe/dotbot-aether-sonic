package kotlin.text;

import kotlin.H0;
import kotlin.U;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;

@kotlin.r
@Y(version = "1.9")
/* renamed from: kotlin.text.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2227i {

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final c f52814d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final C2227i f52815e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final C2227i f52816f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f52817a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final b f52818b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final d f52819c;

    /* renamed from: kotlin.text.i$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f52820a = C2227i.f52814d.a().e();

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private b.a f52821b;

        /* renamed from: c, reason: collision with root package name */
        @l3.e
        private d.a f52822c;

        @U
        public a() {
        }

        @kotlin.internal.f
        private final void b(X2.l<? super b.a, H0> builderAction) {
            kotlin.jvm.internal.F.p(builderAction, "builderAction");
            builderAction.C(c());
        }

        @kotlin.internal.f
        private final void f(X2.l<? super d.a, H0> builderAction) {
            kotlin.jvm.internal.F.p(builderAction, "builderAction");
            builderAction.C(d());
        }

        @l3.d
        @U
        public final C2227i a() {
            b a4;
            d a5;
            boolean z3 = this.f52820a;
            b.a aVar = this.f52821b;
            if (aVar == null || (a4 = aVar.a()) == null) {
                a4 = b.f52823g.a();
            }
            d.a aVar2 = this.f52822c;
            if (aVar2 == null || (a5 = aVar2.a()) == null) {
                a5 = d.f52837d.a();
            }
            return new C2227i(z3, a4, a5);
        }

        @l3.d
        public final b.a c() {
            if (this.f52821b == null) {
                this.f52821b = new b.a();
            }
            b.a aVar = this.f52821b;
            kotlin.jvm.internal.F.m(aVar);
            return aVar;
        }

        @l3.d
        public final d.a d() {
            if (this.f52822c == null) {
                this.f52822c = new d.a();
            }
            d.a aVar = this.f52822c;
            kotlin.jvm.internal.F.m(aVar);
            return aVar;
        }

        public final boolean e() {
            return this.f52820a;
        }

        public final void g(boolean z3) {
            this.f52820a = z3;
        }
    }

    /* renamed from: kotlin.text.i$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        @l3.d
        public static final C0471b f52823g = new C0471b(null);

        /* renamed from: h, reason: collision with root package name */
        @l3.d
        private static final b f52824h = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a, reason: collision with root package name */
        private final int f52825a;

        /* renamed from: b, reason: collision with root package name */
        private final int f52826b;

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private final String f52827c;

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        private final String f52828d;

        /* renamed from: e, reason: collision with root package name */
        @l3.d
        private final String f52829e;

        /* renamed from: f, reason: collision with root package name */
        @l3.d
        private final String f52830f;

        /* renamed from: kotlin.text.i$b$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f52831a;

            /* renamed from: b, reason: collision with root package name */
            private int f52832b;

            /* renamed from: c, reason: collision with root package name */
            @l3.d
            private String f52833c;

            /* renamed from: d, reason: collision with root package name */
            @l3.d
            private String f52834d;

            /* renamed from: e, reason: collision with root package name */
            @l3.d
            private String f52835e;

            /* renamed from: f, reason: collision with root package name */
            @l3.d
            private String f52836f;

            public a() {
                C0471b c0471b = b.f52823g;
                this.f52831a = c0471b.a().g();
                this.f52832b = c0471b.a().f();
                this.f52833c = c0471b.a().h();
                this.f52834d = c0471b.a().d();
                this.f52835e = c0471b.a().c();
                this.f52836f = c0471b.a().e();
            }

            @l3.d
            public final b a() {
                return new b(this.f52831a, this.f52832b, this.f52833c, this.f52834d, this.f52835e, this.f52836f);
            }

            @l3.d
            public final String b() {
                return this.f52835e;
            }

            @l3.d
            public final String c() {
                return this.f52834d;
            }

            @l3.d
            public final String d() {
                return this.f52836f;
            }

            public final int e() {
                return this.f52832b;
            }

            public final int f() {
                return this.f52831a;
            }

            @l3.d
            public final String g() {
                return this.f52833c;
            }

            public final void h(@l3.d String value) {
                boolean S22;
                boolean S23;
                kotlin.jvm.internal.F.p(value, "value");
                S22 = A.S2(value, '\n', false, 2, null);
                if (!S22) {
                    S23 = A.S2(value, '\r', false, 2, null);
                    if (!S23) {
                        this.f52835e = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            public final void i(@l3.d String value) {
                boolean S22;
                boolean S23;
                kotlin.jvm.internal.F.p(value, "value");
                S22 = A.S2(value, '\n', false, 2, null);
                if (!S22) {
                    S23 = A.S2(value, '\r', false, 2, null);
                    if (!S23) {
                        this.f52834d = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            public final void j(@l3.d String value) {
                boolean S22;
                boolean S23;
                kotlin.jvm.internal.F.p(value, "value");
                S22 = A.S2(value, '\n', false, 2, null);
                if (!S22) {
                    S23 = A.S2(value, '\r', false, 2, null);
                    if (!S23) {
                        this.f52836f = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            public final void k(int i4) {
                if (i4 > 0) {
                    this.f52832b = i4;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i4);
            }

            public final void l(int i4) {
                if (i4 > 0) {
                    this.f52831a = i4;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i4);
            }

            public final void m(@l3.d String str) {
                kotlin.jvm.internal.F.p(str, "<set-?>");
                this.f52833c = str;
            }
        }

        /* renamed from: kotlin.text.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0471b {
            public /* synthetic */ C0471b(C2197u c2197u) {
                this();
            }

            @l3.d
            public final b a() {
                return b.f52824h;
            }

            private C0471b() {
            }
        }

        public b(int i4, int i5, @l3.d String groupSeparator, @l3.d String byteSeparator, @l3.d String bytePrefix, @l3.d String byteSuffix) {
            kotlin.jvm.internal.F.p(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.F.p(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.F.p(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.F.p(byteSuffix, "byteSuffix");
            this.f52825a = i4;
            this.f52826b = i5;
            this.f52827c = groupSeparator;
            this.f52828d = byteSeparator;
            this.f52829e = bytePrefix;
            this.f52830f = byteSuffix;
        }

        @l3.d
        public final StringBuilder b(@l3.d StringBuilder sb, @l3.d String indent) {
            kotlin.jvm.internal.F.p(sb, "sb");
            kotlin.jvm.internal.F.p(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.f52825a);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.f52826b);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.f52827c);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append("\",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.f52828d);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append("\",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.f52829e);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append("\",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.f52830f);
            sb.append("\"");
            return sb;
        }

        @l3.d
        public final String c() {
            return this.f52829e;
        }

        @l3.d
        public final String d() {
            return this.f52828d;
        }

        @l3.d
        public final String e() {
            return this.f52830f;
        }

        public final int f() {
            return this.f52826b;
        }

        public final int g() {
            return this.f52825a;
        }

        @l3.d
        public final String h() {
            return this.f52827c;
        }

        @l3.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            StringBuilder b4 = b(sb, "    ");
            b4.append('\n');
            kotlin.jvm.internal.F.o(b4, "append(...)");
            sb.append(")");
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "toString(...)");
            return sb2;
        }
    }

    /* renamed from: kotlin.text.i$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C2197u c2197u) {
            this();
        }

        @l3.d
        public final C2227i a() {
            return C2227i.f52815e;
        }

        @l3.d
        public final C2227i b() {
            return C2227i.f52816f;
        }

        private c() {
        }
    }

    /* renamed from: kotlin.text.i$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        public static final b f52837d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        @l3.d
        private static final d f52838e = new d("", "", false);

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final String f52839a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final String f52840b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f52841c;

        /* renamed from: kotlin.text.i$d$a */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @l3.d
            private String f52842a;

            /* renamed from: b, reason: collision with root package name */
            @l3.d
            private String f52843b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f52844c;

            public a() {
                b bVar = d.f52837d;
                this.f52842a = bVar.a().c();
                this.f52843b = bVar.a().e();
                this.f52844c = bVar.a().d();
            }

            @l3.d
            public final d a() {
                return new d(this.f52842a, this.f52843b, this.f52844c);
            }

            @l3.d
            public final String b() {
                return this.f52842a;
            }

            public final boolean c() {
                return this.f52844c;
            }

            @l3.d
            public final String d() {
                return this.f52843b;
            }

            public final void e(@l3.d String value) {
                boolean S22;
                boolean S23;
                kotlin.jvm.internal.F.p(value, "value");
                S22 = A.S2(value, '\n', false, 2, null);
                if (!S22) {
                    S23 = A.S2(value, '\r', false, 2, null);
                    if (!S23) {
                        this.f52842a = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            public final void f(boolean z3) {
                this.f52844c = z3;
            }

            public final void g(@l3.d String value) {
                boolean S22;
                boolean S23;
                kotlin.jvm.internal.F.p(value, "value");
                S22 = A.S2(value, '\n', false, 2, null);
                if (!S22) {
                    S23 = A.S2(value, '\r', false, 2, null);
                    if (!S23) {
                        this.f52843b = value;
                        return;
                    }
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }
        }

        /* renamed from: kotlin.text.i$d$b */
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(C2197u c2197u) {
                this();
            }

            @l3.d
            public final d a() {
                return d.f52838e;
            }

            private b() {
            }
        }

        public d(@l3.d String prefix, @l3.d String suffix, boolean z3) {
            kotlin.jvm.internal.F.p(prefix, "prefix");
            kotlin.jvm.internal.F.p(suffix, "suffix");
            this.f52839a = prefix;
            this.f52840b = suffix;
            this.f52841c = z3;
        }

        @l3.d
        public final StringBuilder b(@l3.d StringBuilder sb, @l3.d String indent) {
            kotlin.jvm.internal.F.p(sb, "sb");
            kotlin.jvm.internal.F.p(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.f52839a);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append("\",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.f52840b);
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append("\",");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f52841c);
            return sb;
        }

        @l3.d
        public final String c() {
            return this.f52839a;
        }

        public final boolean d() {
            return this.f52841c;
        }

        @l3.d
        public final String e() {
            return this.f52840b;
        }

        @l3.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            kotlin.jvm.internal.F.o(sb, "append(...)");
            sb.append('\n');
            kotlin.jvm.internal.F.o(sb, "append(...)");
            StringBuilder b4 = b(sb, "    ");
            b4.append('\n');
            kotlin.jvm.internal.F.o(b4, "append(...)");
            sb.append(")");
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "toString(...)");
            return sb2;
        }
    }

    static {
        b.C0471b c0471b = b.f52823g;
        b a4 = c0471b.a();
        d.b bVar = d.f52837d;
        f52815e = new C2227i(false, a4, bVar.a());
        f52816f = new C2227i(true, c0471b.a(), bVar.a());
    }

    public C2227i(boolean z3, @l3.d b bytes, @l3.d d number) {
        kotlin.jvm.internal.F.p(bytes, "bytes");
        kotlin.jvm.internal.F.p(number, "number");
        this.f52817a = z3;
        this.f52818b = bytes;
        this.f52819c = number;
    }

    @l3.d
    public final b c() {
        return this.f52818b;
    }

    @l3.d
    public final d d() {
        return this.f52819c;
    }

    public final boolean e() {
        return this.f52817a;
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append("    upperCase = ");
        sb.append(this.f52817a);
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append(",");
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append("    bytes = BytesHexFormat(");
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        StringBuilder b4 = this.f52818b.b(sb, "        ");
        b4.append('\n');
        kotlin.jvm.internal.F.o(b4, "append(...)");
        sb.append("    ),");
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append("    number = NumberHexFormat(");
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        StringBuilder b5 = this.f52819c.b(sb, "        ");
        b5.append('\n');
        kotlin.jvm.internal.F.o(b5, "append(...)");
        sb.append("    )");
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append('\n');
        kotlin.jvm.internal.F.o(sb, "append(...)");
        sb.append(")");
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "toString(...)");
        return sb2;
    }
}
