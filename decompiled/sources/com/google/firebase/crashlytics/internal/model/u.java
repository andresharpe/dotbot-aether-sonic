package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class u extends CrashlyticsReport.f.e {

    /* renamed from: a, reason: collision with root package name */
    private final int f35580a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35581b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35582c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35583d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.e.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f35584a;

        /* renamed from: b, reason: collision with root package name */
        private String f35585b;

        /* renamed from: c, reason: collision with root package name */
        private String f35586c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f35587d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public CrashlyticsReport.f.e a() {
            String str = "";
            if (this.f35584a == null) {
                str = " platform";
            }
            if (this.f35585b == null) {
                str = str + " version";
            }
            if (this.f35586c == null) {
                str = str + " buildVersion";
            }
            if (this.f35587d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new u(this.f35584a.intValue(), this.f35585b, this.f35586c, this.f35587d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public CrashlyticsReport.f.e.a b(String str) {
            if (str != null) {
                this.f35586c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public CrashlyticsReport.f.e.a c(boolean z3) {
            this.f35587d = Boolean.valueOf(z3);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public CrashlyticsReport.f.e.a d(int i4) {
            this.f35584a = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e.a
        public CrashlyticsReport.f.e.a e(String str) {
            if (str != null) {
                this.f35585b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    @N
    public String b() {
        return this.f35582c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    public int c() {
        return this.f35580a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    @N
    public String d() {
        return this.f35581b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.e
    public boolean e() {
        return this.f35583d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.e)) {
            return false;
        }
        CrashlyticsReport.f.e eVar = (CrashlyticsReport.f.e) obj;
        if (this.f35580a == eVar.c() && this.f35581b.equals(eVar.d()) && this.f35582c.equals(eVar.b()) && this.f35583d == eVar.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = (((((this.f35580a ^ 1000003) * 1000003) ^ this.f35581b.hashCode()) * 1000003) ^ this.f35582c.hashCode()) * 1000003;
        if (this.f35583d) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode ^ i4;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f35580a + ", version=" + this.f35581b + ", buildVersion=" + this.f35582c + ", jailbroken=" + this.f35583d + "}";
    }

    private u(int i4, String str, String str2, boolean z3) {
        this.f35580a = i4;
        this.f35581b = str;
        this.f35582c = str2;
        this.f35583d = z3;
    }
}
