package org.junit;

/* loaded from: classes2.dex */
public class ComparisonFailure extends AssertionError {

    /* renamed from: G, reason: collision with root package name */
    private static final int f55477G = 20;

    /* renamed from: H, reason: collision with root package name */
    private static final long f55478H = 1;

    /* renamed from: E, reason: collision with root package name */
    private String f55479E;

    /* renamed from: F, reason: collision with root package name */
    private String f55480F;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: d, reason: collision with root package name */
        private static final String f55481d = "...";

        /* renamed from: e, reason: collision with root package name */
        private static final String f55482e = "]";

        /* renamed from: f, reason: collision with root package name */
        private static final String f55483f = "[";

        /* renamed from: a, reason: collision with root package name */
        private final int f55484a;

        /* renamed from: b, reason: collision with root package name */
        private final String f55485b;

        /* renamed from: c, reason: collision with root package name */
        private final String f55486c;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            private final String f55487a;

            /* renamed from: b, reason: collision with root package name */
            private final String f55488b;

            private String e(String str) {
                return b.f55483f + str.substring(this.f55487a.length(), str.length() - this.f55488b.length()) + b.f55482e;
            }

            public String a() {
                return e(b.this.f55486c);
            }

            public String b() {
                if (this.f55487a.length() <= b.this.f55484a) {
                    return this.f55487a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(b.f55481d);
                String str = this.f55487a;
                sb.append(str.substring(str.length() - b.this.f55484a));
                return sb.toString();
            }

            public String c() {
                if (this.f55488b.length() <= b.this.f55484a) {
                    return this.f55488b;
                }
                return this.f55488b.substring(0, b.this.f55484a) + b.f55481d;
            }

            public String d() {
                return e(b.this.f55485b);
            }

            private a() {
                String g4 = b.this.g();
                this.f55487a = g4;
                this.f55488b = b.this.h(g4);
            }
        }

        public b(int i4, String str, String str2) {
            this.f55484a = i4;
            this.f55485b = str;
            this.f55486c = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String g() {
            int min = Math.min(this.f55485b.length(), this.f55486c.length());
            for (int i4 = 0; i4 < min; i4++) {
                if (this.f55485b.charAt(i4) != this.f55486c.charAt(i4)) {
                    return this.f55485b.substring(0, i4);
                }
            }
            return this.f55485b.substring(0, min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String h(String str) {
            int min = Math.min(this.f55485b.length() - str.length(), this.f55486c.length() - str.length()) - 1;
            int i4 = 0;
            while (i4 <= min) {
                if (this.f55485b.charAt((r1.length() - 1) - i4) != this.f55486c.charAt((r2.length() - 1) - i4)) {
                    break;
                }
                i4++;
            }
            String str2 = this.f55485b;
            return str2.substring(str2.length() - i4);
        }

        public String f(String str) {
            String str2;
            String str3 = this.f55485b;
            if (str3 != null && (str2 = this.f55486c) != null && !str3.equals(str2)) {
                a aVar = new a();
                String b4 = aVar.b();
                String c4 = aVar.c();
                return c.n0(str, b4 + aVar.d() + c4, b4 + aVar.a() + c4);
            }
            return c.n0(str, this.f55485b, this.f55486c);
        }
    }

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.f55479E = str2;
        this.f55480F = str3;
    }

    public String a() {
        return this.f55480F;
    }

    public String b() {
        return this.f55479E;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new b(20, this.f55479E, this.f55480F).f(super.getMessage());
    }
}
