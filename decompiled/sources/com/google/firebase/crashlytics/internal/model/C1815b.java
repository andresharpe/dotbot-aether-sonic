package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1815b extends CrashlyticsReport {

    /* renamed from: c, reason: collision with root package name */
    private final String f35395c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35396d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35397e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35398f;

    /* renamed from: g, reason: collision with root package name */
    private final String f35399g;

    /* renamed from: h, reason: collision with root package name */
    private final String f35400h;

    /* renamed from: i, reason: collision with root package name */
    private final CrashlyticsReport.f f35401i;

    /* renamed from: j, reason: collision with root package name */
    private final CrashlyticsReport.e f35402j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0330b extends CrashlyticsReport.c {

        /* renamed from: a, reason: collision with root package name */
        private String f35403a;

        /* renamed from: b, reason: collision with root package name */
        private String f35404b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f35405c;

        /* renamed from: d, reason: collision with root package name */
        private String f35406d;

        /* renamed from: e, reason: collision with root package name */
        private String f35407e;

        /* renamed from: f, reason: collision with root package name */
        private String f35408f;

        /* renamed from: g, reason: collision with root package name */
        private CrashlyticsReport.f f35409g;

        /* renamed from: h, reason: collision with root package name */
        private CrashlyticsReport.e f35410h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport a() {
            String str = "";
            if (this.f35403a == null) {
                str = " sdkVersion";
            }
            if (this.f35404b == null) {
                str = str + " gmpAppId";
            }
            if (this.f35405c == null) {
                str = str + " platform";
            }
            if (this.f35406d == null) {
                str = str + " installationUuid";
            }
            if (this.f35407e == null) {
                str = str + " buildVersion";
            }
            if (this.f35408f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C1815b(this.f35403a, this.f35404b, this.f35405c.intValue(), this.f35406d, this.f35407e, this.f35408f, this.f35409g, this.f35410h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c b(String str) {
            if (str != null) {
                this.f35407e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c c(String str) {
            if (str != null) {
                this.f35408f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c d(String str) {
            if (str != null) {
                this.f35404b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c e(String str) {
            if (str != null) {
                this.f35406d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c f(CrashlyticsReport.e eVar) {
            this.f35410h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c g(int i4) {
            this.f35405c = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c h(String str) {
            if (str != null) {
                this.f35403a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
        public CrashlyticsReport.c i(CrashlyticsReport.f fVar) {
            this.f35409g = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0330b() {
        }

        private C0330b(CrashlyticsReport crashlyticsReport) {
            this.f35403a = crashlyticsReport.i();
            this.f35404b = crashlyticsReport.e();
            this.f35405c = Integer.valueOf(crashlyticsReport.h());
            this.f35406d = crashlyticsReport.f();
            this.f35407e = crashlyticsReport.c();
            this.f35408f = crashlyticsReport.d();
            this.f35409g = crashlyticsReport.j();
            this.f35410h = crashlyticsReport.g();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public String c() {
        return this.f35399g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public String d() {
        return this.f35400h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public String e() {
        return this.f35396d;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.f fVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f35395c.equals(crashlyticsReport.i()) && this.f35396d.equals(crashlyticsReport.e()) && this.f35397e == crashlyticsReport.h() && this.f35398f.equals(crashlyticsReport.f()) && this.f35399g.equals(crashlyticsReport.c()) && this.f35400h.equals(crashlyticsReport.d()) && ((fVar = this.f35401i) != null ? fVar.equals(crashlyticsReport.j()) : crashlyticsReport.j() == null)) {
            CrashlyticsReport.e eVar = this.f35402j;
            if (eVar == null) {
                if (crashlyticsReport.g() == null) {
                    return true;
                }
            } else if (eVar.equals(crashlyticsReport.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public String f() {
        return this.f35398f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @P
    public CrashlyticsReport.e g() {
        return this.f35402j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int h() {
        return this.f35397e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((this.f35395c.hashCode() ^ 1000003) * 1000003) ^ this.f35396d.hashCode()) * 1000003) ^ this.f35397e) * 1000003) ^ this.f35398f.hashCode()) * 1000003) ^ this.f35399g.hashCode()) * 1000003) ^ this.f35400h.hashCode()) * 1000003;
        CrashlyticsReport.f fVar = this.f35401i;
        int i4 = 0;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i5 = (hashCode2 ^ hashCode) * 1000003;
        CrashlyticsReport.e eVar = this.f35402j;
        if (eVar != null) {
            i4 = eVar.hashCode();
        }
        return i5 ^ i4;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @N
    public String i() {
        return this.f35395c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @P
    public CrashlyticsReport.f j() {
        return this.f35401i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    protected CrashlyticsReport.c l() {
        return new C0330b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f35395c + ", gmpAppId=" + this.f35396d + ", platform=" + this.f35397e + ", installationUuid=" + this.f35398f + ", buildVersion=" + this.f35399g + ", displayVersion=" + this.f35400h + ", session=" + this.f35401i + ", ndkPayload=" + this.f35402j + "}";
    }

    private C1815b(String str, String str2, int i4, String str3, String str4, String str5, @P CrashlyticsReport.f fVar, @P CrashlyticsReport.e eVar) {
        this.f35395c = str;
        this.f35396d = str2;
        this.f35397e = i4;
        this.f35398f = str3;
        this.f35399g = str4;
        this.f35400h = str5;
        this.f35401i = fVar;
        this.f35402j = eVar;
    }
}
