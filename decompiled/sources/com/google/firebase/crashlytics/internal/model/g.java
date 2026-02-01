package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import w1.InterfaceC2431a;

/* loaded from: classes2.dex */
final class g extends CrashlyticsReport.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f35439a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35440b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35441c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f35442d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35443e;

    /* renamed from: f, reason: collision with root package name */
    private final CrashlyticsReport.f.a f35444f;

    /* renamed from: g, reason: collision with root package name */
    private final CrashlyticsReport.f.AbstractC0328f f35445g;

    /* renamed from: h, reason: collision with root package name */
    private final CrashlyticsReport.f.e f35446h;

    /* renamed from: i, reason: collision with root package name */
    private final CrashlyticsReport.f.c f35447i;

    /* renamed from: j, reason: collision with root package name */
    private final A<CrashlyticsReport.f.d> f35448j;

    /* renamed from: k, reason: collision with root package name */
    private final int f35449k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.b {

        /* renamed from: a, reason: collision with root package name */
        private String f35450a;

        /* renamed from: b, reason: collision with root package name */
        private String f35451b;

        /* renamed from: c, reason: collision with root package name */
        private Long f35452c;

        /* renamed from: d, reason: collision with root package name */
        private Long f35453d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f35454e;

        /* renamed from: f, reason: collision with root package name */
        private CrashlyticsReport.f.a f35455f;

        /* renamed from: g, reason: collision with root package name */
        private CrashlyticsReport.f.AbstractC0328f f35456g;

        /* renamed from: h, reason: collision with root package name */
        private CrashlyticsReport.f.e f35457h;

        /* renamed from: i, reason: collision with root package name */
        private CrashlyticsReport.f.c f35458i;

        /* renamed from: j, reason: collision with root package name */
        private A<CrashlyticsReport.f.d> f35459j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f35460k;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f a() {
            String str = "";
            if (this.f35450a == null) {
                str = " generator";
            }
            if (this.f35451b == null) {
                str = str + " identifier";
            }
            if (this.f35452c == null) {
                str = str + " startedAt";
            }
            if (this.f35454e == null) {
                str = str + " crashed";
            }
            if (this.f35455f == null) {
                str = str + " app";
            }
            if (this.f35460k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new g(this.f35450a, this.f35451b, this.f35452c.longValue(), this.f35453d, this.f35454e.booleanValue(), this.f35455f, this.f35456g, this.f35457h, this.f35458i, this.f35459j, this.f35460k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b b(CrashlyticsReport.f.a aVar) {
            if (aVar != null) {
                this.f35455f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b c(boolean z3) {
            this.f35454e = Boolean.valueOf(z3);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b d(CrashlyticsReport.f.c cVar) {
            this.f35458i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b e(Long l4) {
            this.f35453d = l4;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b f(A<CrashlyticsReport.f.d> a4) {
            this.f35459j = a4;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b g(String str) {
            if (str != null) {
                this.f35450a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b h(int i4) {
            this.f35460k = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b i(String str) {
            if (str != null) {
                this.f35451b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b k(CrashlyticsReport.f.e eVar) {
            this.f35457h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b l(long j4) {
            this.f35452c = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.b
        public CrashlyticsReport.f.b m(CrashlyticsReport.f.AbstractC0328f abstractC0328f) {
            this.f35456g = abstractC0328f;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(CrashlyticsReport.f fVar) {
            this.f35450a = fVar.f();
            this.f35451b = fVar.h();
            this.f35452c = Long.valueOf(fVar.k());
            this.f35453d = fVar.d();
            this.f35454e = Boolean.valueOf(fVar.m());
            this.f35455f = fVar.b();
            this.f35456g = fVar.l();
            this.f35457h = fVar.j();
            this.f35458i = fVar.c();
            this.f35459j = fVar.e();
            this.f35460k = Integer.valueOf(fVar.g());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @N
    public CrashlyticsReport.f.a b() {
        return this.f35444f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public CrashlyticsReport.f.c c() {
        return this.f35447i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public Long d() {
        return this.f35442d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public A<CrashlyticsReport.f.d> e() {
        return this.f35448j;
    }

    public boolean equals(Object obj) {
        Long l4;
        CrashlyticsReport.f.AbstractC0328f abstractC0328f;
        CrashlyticsReport.f.e eVar;
        CrashlyticsReport.f.c cVar;
        A<CrashlyticsReport.f.d> a4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f)) {
            return false;
        }
        CrashlyticsReport.f fVar = (CrashlyticsReport.f) obj;
        if (this.f35439a.equals(fVar.f()) && this.f35440b.equals(fVar.h()) && this.f35441c == fVar.k() && ((l4 = this.f35442d) != null ? l4.equals(fVar.d()) : fVar.d() == null) && this.f35443e == fVar.m() && this.f35444f.equals(fVar.b()) && ((abstractC0328f = this.f35445g) != null ? abstractC0328f.equals(fVar.l()) : fVar.l() == null) && ((eVar = this.f35446h) != null ? eVar.equals(fVar.j()) : fVar.j() == null) && ((cVar = this.f35447i) != null ? cVar.equals(fVar.c()) : fVar.c() == null) && ((a4 = this.f35448j) != null ? a4.equals(fVar.e()) : fVar.e() == null) && this.f35449k == fVar.g()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @N
    public String f() {
        return this.f35439a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public int g() {
        return this.f35449k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @N
    @InterfaceC2431a.b
    public String h() {
        return this.f35440b;
    }

    public int hashCode() {
        int hashCode;
        int i4;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f35439a.hashCode() ^ 1000003) * 1000003) ^ this.f35440b.hashCode()) * 1000003;
        long j4 = this.f35441c;
        int i5 = (hashCode5 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        Long l4 = this.f35442d;
        int i6 = 0;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        int i7 = (i5 ^ hashCode) * 1000003;
        if (this.f35443e) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode6 = (((i7 ^ i4) * 1000003) ^ this.f35444f.hashCode()) * 1000003;
        CrashlyticsReport.f.AbstractC0328f abstractC0328f = this.f35445g;
        if (abstractC0328f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC0328f.hashCode();
        }
        int i8 = (hashCode6 ^ hashCode2) * 1000003;
        CrashlyticsReport.f.e eVar = this.f35446h;
        if (eVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = eVar.hashCode();
        }
        int i9 = (i8 ^ hashCode3) * 1000003;
        CrashlyticsReport.f.c cVar = this.f35447i;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i10 = (i9 ^ hashCode4) * 1000003;
        A<CrashlyticsReport.f.d> a4 = this.f35448j;
        if (a4 != null) {
            i6 = a4.hashCode();
        }
        return ((i10 ^ i6) * 1000003) ^ this.f35449k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public CrashlyticsReport.f.e j() {
        return this.f35446h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public long k() {
        return this.f35441c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    @P
    public CrashlyticsReport.f.AbstractC0328f l() {
        return this.f35445g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public boolean m() {
        return this.f35443e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f
    public CrashlyticsReport.f.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f35439a + ", identifier=" + this.f35440b + ", startedAt=" + this.f35441c + ", endedAt=" + this.f35442d + ", crashed=" + this.f35443e + ", app=" + this.f35444f + ", user=" + this.f35445g + ", os=" + this.f35446h + ", device=" + this.f35447i + ", events=" + this.f35448j + ", generatorType=" + this.f35449k + "}";
    }

    private g(String str, String str2, long j4, @P Long l4, boolean z3, CrashlyticsReport.f.a aVar, @P CrashlyticsReport.f.AbstractC0328f abstractC0328f, @P CrashlyticsReport.f.e eVar, @P CrashlyticsReport.f.c cVar, @P A<CrashlyticsReport.f.d> a4, int i4) {
        this.f35439a = str;
        this.f35440b = str2;
        this.f35441c = j4;
        this.f35442d = l4;
        this.f35443e = z3;
        this.f35444f = aVar;
        this.f35445g = abstractC0328f;
        this.f35446h = eVar;
        this.f35447i = cVar;
        this.f35448j = a4;
        this.f35449k = i4;
    }
}
