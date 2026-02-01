package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.p;

/* loaded from: classes.dex */
final class c extends p {

    /* renamed from: a, reason: collision with root package name */
    private final q f27385a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27386b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.d<?> f27387c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.f<?, byte[]> f27388d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.c f27389e;

    /* loaded from: classes.dex */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private q f27390a;

        /* renamed from: b, reason: collision with root package name */
        private String f27391b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.d<?> f27392c;

        /* renamed from: d, reason: collision with root package name */
        private com.google.android.datatransport.f<?, byte[]> f27393d;

        /* renamed from: e, reason: collision with root package name */
        private com.google.android.datatransport.c f27394e;

        @Override // com.google.android.datatransport.runtime.p.a
        public p a() {
            String str = "";
            if (this.f27390a == null) {
                str = " transportContext";
            }
            if (this.f27391b == null) {
                str = str + " transportName";
            }
            if (this.f27392c == null) {
                str = str + " event";
            }
            if (this.f27393d == null) {
                str = str + " transformer";
            }
            if (this.f27394e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f27390a, this.f27391b, this.f27392c, this.f27393d, this.f27394e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.p.a
        p.a b(com.google.android.datatransport.c cVar) {
            if (cVar != null) {
                this.f27394e = cVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // com.google.android.datatransport.runtime.p.a
        p.a c(com.google.android.datatransport.d<?> dVar) {
            if (dVar != null) {
                this.f27392c = dVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // com.google.android.datatransport.runtime.p.a
        p.a e(com.google.android.datatransport.f<?, byte[]> fVar) {
            if (fVar != null) {
                this.f27393d = fVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // com.google.android.datatransport.runtime.p.a
        public p.a f(q qVar) {
            if (qVar != null) {
                this.f27390a = qVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // com.google.android.datatransport.runtime.p.a
        public p.a g(String str) {
            if (str != null) {
                this.f27391b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // com.google.android.datatransport.runtime.p
    public com.google.android.datatransport.c b() {
        return this.f27389e;
    }

    @Override // com.google.android.datatransport.runtime.p
    com.google.android.datatransport.d<?> c() {
        return this.f27387c;
    }

    @Override // com.google.android.datatransport.runtime.p
    com.google.android.datatransport.f<?, byte[]> e() {
        return this.f27388d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f27385a.equals(pVar.f()) && this.f27386b.equals(pVar.g()) && this.f27387c.equals(pVar.c()) && this.f27388d.equals(pVar.e()) && this.f27389e.equals(pVar.b())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.p
    public q f() {
        return this.f27385a;
    }

    @Override // com.google.android.datatransport.runtime.p
    public String g() {
        return this.f27386b;
    }

    public int hashCode() {
        return ((((((((this.f27385a.hashCode() ^ 1000003) * 1000003) ^ this.f27386b.hashCode()) * 1000003) ^ this.f27387c.hashCode()) * 1000003) ^ this.f27388d.hashCode()) * 1000003) ^ this.f27389e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f27385a + ", transportName=" + this.f27386b + ", event=" + this.f27387c + ", transformer=" + this.f27388d + ", encoding=" + this.f27389e + "}";
    }

    private c(q qVar, String str, com.google.android.datatransport.d<?> dVar, com.google.android.datatransport.f<?, byte[]> fVar, com.google.android.datatransport.c cVar) {
        this.f27385a = qVar;
        this.f27386b = str;
        this.f27387c = dVar;
        this.f27388d = fVar;
        this.f27389e = cVar;
    }
}
