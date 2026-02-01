package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class p extends CrashlyticsReport.f.d.a.b.AbstractC0322d {

    /* renamed from: a, reason: collision with root package name */
    private final String f35543a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35544b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35545c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a {

        /* renamed from: a, reason: collision with root package name */
        private String f35546a;

        /* renamed from: b, reason: collision with root package name */
        private String f35547b;

        /* renamed from: c, reason: collision with root package name */
        private Long f35548c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a
        public CrashlyticsReport.f.d.a.b.AbstractC0322d a() {
            String str = "";
            if (this.f35546a == null) {
                str = " name";
            }
            if (this.f35547b == null) {
                str = str + " code";
            }
            if (this.f35548c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new p(this.f35546a, this.f35547b, this.f35548c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a
        public CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a b(long j4) {
            this.f35548c = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a
        public CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a c(String str) {
            if (str != null) {
                this.f35547b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a
        public CrashlyticsReport.f.d.a.b.AbstractC0322d.AbstractC0323a d(String str) {
            if (str != null) {
                this.f35546a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d
    @N
    public long b() {
        return this.f35545c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d
    @N
    public String c() {
        return this.f35544b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0322d
    @N
    public String d() {
        return this.f35543a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.AbstractC0322d)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.AbstractC0322d abstractC0322d = (CrashlyticsReport.f.d.a.b.AbstractC0322d) obj;
        if (this.f35543a.equals(abstractC0322d.d()) && this.f35544b.equals(abstractC0322d.c()) && this.f35545c == abstractC0322d.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f35543a.hashCode() ^ 1000003) * 1000003) ^ this.f35544b.hashCode()) * 1000003;
        long j4 = this.f35545c;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f35543a + ", code=" + this.f35544b + ", address=" + this.f35545c + "}";
    }

    private p(String str, String str2, long j4) {
        this.f35543a = str;
        this.f35544b = str2;
        this.f35545c = j4;
    }
}
