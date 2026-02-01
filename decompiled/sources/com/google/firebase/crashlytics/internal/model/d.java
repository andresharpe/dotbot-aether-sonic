package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class d extends CrashlyticsReport.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f35427a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35428b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f35429a;

        /* renamed from: b, reason: collision with root package name */
        private String f35430b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
        public CrashlyticsReport.d a() {
            String str = "";
            if (this.f35429a == null) {
                str = " key";
            }
            if (this.f35430b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new d(this.f35429a, this.f35430b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
        public CrashlyticsReport.d.a b(String str) {
            if (str != null) {
                this.f35429a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
        public CrashlyticsReport.d.a c(String str) {
            if (str != null) {
                this.f35430b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    @N
    public String b() {
        return this.f35427a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    @N
    public String c() {
        return this.f35428b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d)) {
            return false;
        }
        CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
        if (this.f35427a.equals(dVar.b()) && this.f35428b.equals(dVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f35427a.hashCode() ^ 1000003) * 1000003) ^ this.f35428b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f35427a + ", value=" + this.f35428b + "}";
    }

    private d(String str, String str2) {
        this.f35427a = str;
        this.f35428b = str2;
    }
}
