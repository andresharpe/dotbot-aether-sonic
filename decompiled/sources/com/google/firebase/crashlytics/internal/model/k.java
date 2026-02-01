package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class k extends CrashlyticsReport.f.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f35495a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35496b;

    /* renamed from: c, reason: collision with root package name */
    private final CrashlyticsReport.f.d.a f35497c;

    /* renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.f.d.c f35498d;

    /* renamed from: e, reason: collision with root package name */
    private final CrashlyticsReport.f.d.AbstractC0327d f35499e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.b {

        /* renamed from: a, reason: collision with root package name */
        private Long f35500a;

        /* renamed from: b, reason: collision with root package name */
        private String f35501b;

        /* renamed from: c, reason: collision with root package name */
        private CrashlyticsReport.f.d.a f35502c;

        /* renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.f.d.c f35503d;

        /* renamed from: e, reason: collision with root package name */
        private CrashlyticsReport.f.d.AbstractC0327d f35504e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public CrashlyticsReport.f.d a() {
            String str = "";
            if (this.f35500a == null) {
                str = " timestamp";
            }
            if (this.f35501b == null) {
                str = str + " type";
            }
            if (this.f35502c == null) {
                str = str + " app";
            }
            if (this.f35503d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new k(this.f35500a.longValue(), this.f35501b, this.f35502c, this.f35503d, this.f35504e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public CrashlyticsReport.f.d.b b(CrashlyticsReport.f.d.a aVar) {
            if (aVar != null) {
                this.f35502c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public CrashlyticsReport.f.d.b c(CrashlyticsReport.f.d.c cVar) {
            if (cVar != null) {
                this.f35503d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public CrashlyticsReport.f.d.b d(CrashlyticsReport.f.d.AbstractC0327d abstractC0327d) {
            this.f35504e = abstractC0327d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public CrashlyticsReport.f.d.b e(long j4) {
            this.f35500a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.b
        public CrashlyticsReport.f.d.b f(String str) {
            if (str != null) {
                this.f35501b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(CrashlyticsReport.f.d dVar) {
            this.f35500a = Long.valueOf(dVar.e());
            this.f35501b = dVar.f();
            this.f35502c = dVar.b();
            this.f35503d = dVar.c();
            this.f35504e = dVar.d();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @N
    public CrashlyticsReport.f.d.a b() {
        return this.f35497c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @N
    public CrashlyticsReport.f.d.c c() {
        return this.f35498d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @P
    public CrashlyticsReport.f.d.AbstractC0327d d() {
        return this.f35499e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    public long e() {
        return this.f35495a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d)) {
            return false;
        }
        CrashlyticsReport.f.d dVar = (CrashlyticsReport.f.d) obj;
        if (this.f35495a == dVar.e() && this.f35496b.equals(dVar.f()) && this.f35497c.equals(dVar.b()) && this.f35498d.equals(dVar.c())) {
            CrashlyticsReport.f.d.AbstractC0327d abstractC0327d = this.f35499e;
            if (abstractC0327d == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (abstractC0327d.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    @N
    public String f() {
        return this.f35496b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d
    public CrashlyticsReport.f.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j4 = this.f35495a;
        int hashCode2 = (((((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f35496b.hashCode()) * 1000003) ^ this.f35497c.hashCode()) * 1000003) ^ this.f35498d.hashCode()) * 1000003;
        CrashlyticsReport.f.d.AbstractC0327d abstractC0327d = this.f35499e;
        if (abstractC0327d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0327d.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f35495a + ", type=" + this.f35496b + ", app=" + this.f35497c + ", device=" + this.f35498d + ", log=" + this.f35499e + "}";
    }

    private k(long j4, String str, CrashlyticsReport.f.d.a aVar, CrashlyticsReport.f.d.c cVar, @P CrashlyticsReport.f.d.AbstractC0327d abstractC0327d) {
        this.f35495a = j4;
        this.f35496b = str;
        this.f35497c = aVar;
        this.f35498d = cVar;
        this.f35499e = abstractC0327d;
    }
}
