package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class h extends CrashlyticsReport.f.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f35461a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35462b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35463c;

    /* renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.f.a.b f35464d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35465e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35466f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35467g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.a.AbstractC0315a {

        /* renamed from: a, reason: collision with root package name */
        private String f35468a;

        /* renamed from: b, reason: collision with root package name */
        private String f35469b;

        /* renamed from: c, reason: collision with root package name */
        private String f35470c;

        /* renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.f.a.b f35471d;

        /* renamed from: e, reason: collision with root package name */
        private String f35472e;

        /* renamed from: f, reason: collision with root package name */
        private String f35473f;

        /* renamed from: g, reason: collision with root package name */
        private String f35474g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a a() {
            String str = "";
            if (this.f35468a == null) {
                str = " identifier";
            }
            if (this.f35469b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new h(this.f35468a, this.f35469b, this.f35470c, this.f35471d, this.f35472e, this.f35473f, this.f35474g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a b(@P String str) {
            this.f35473f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a c(@P String str) {
            this.f35474g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a d(String str) {
            this.f35470c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a e(String str) {
            if (str != null) {
                this.f35468a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a f(String str) {
            this.f35472e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a g(CrashlyticsReport.f.a.b bVar) {
            this.f35471d = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.AbstractC0315a
        public CrashlyticsReport.f.a.AbstractC0315a h(String str) {
            if (str != null) {
                this.f35469b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(CrashlyticsReport.f.a aVar) {
            this.f35468a = aVar.e();
            this.f35469b = aVar.h();
            this.f35470c = aVar.d();
            this.f35471d = aVar.g();
            this.f35472e = aVar.f();
            this.f35473f = aVar.b();
            this.f35474g = aVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public String b() {
        return this.f35466f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public String c() {
        return this.f35467g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public String d() {
        return this.f35463c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @N
    public String e() {
        return this.f35461a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.f.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.a)) {
            return false;
        }
        CrashlyticsReport.f.a aVar = (CrashlyticsReport.f.a) obj;
        if (this.f35461a.equals(aVar.e()) && this.f35462b.equals(aVar.h()) && ((str = this.f35463c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f35464d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f35465e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f35466f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f35467g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public String f() {
        return this.f35465e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @P
    public CrashlyticsReport.f.a.b g() {
        return this.f35464d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    @N
    public String h() {
        return this.f35462b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f35461a.hashCode() ^ 1000003) * 1000003) ^ this.f35462b.hashCode()) * 1000003;
        String str = this.f35463c;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode5 ^ hashCode) * 1000003;
        CrashlyticsReport.f.a.b bVar = this.f35464d;
        if (bVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bVar.hashCode();
        }
        int i6 = (i5 ^ hashCode2) * 1000003;
        String str2 = this.f35465e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i7 = (i6 ^ hashCode3) * 1000003;
        String str3 = this.f35466f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i8 = (i7 ^ hashCode4) * 1000003;
        String str4 = this.f35467g;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i8 ^ i4;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a
    protected CrashlyticsReport.f.a.AbstractC0315a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{identifier=" + this.f35461a + ", version=" + this.f35462b + ", displayVersion=" + this.f35463c + ", organization=" + this.f35464d + ", installationUuid=" + this.f35465e + ", developmentPlatform=" + this.f35466f + ", developmentPlatformVersion=" + this.f35467g + "}";
    }

    private h(String str, String str2, @P String str3, @P CrashlyticsReport.f.a.b bVar, @P String str4, @P String str5, @P String str6) {
        this.f35461a = str;
        this.f35462b = str2;
        this.f35463c = str3;
        this.f35464d = bVar;
        this.f35465e = str4;
        this.f35466f = str5;
        this.f35467g = str6;
    }
}
