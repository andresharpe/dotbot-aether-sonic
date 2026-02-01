package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class i extends CrashlyticsReport.f.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f35475a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.a.b.AbstractC0316a {

        /* renamed from: a, reason: collision with root package name */
        private String f35476a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.b.AbstractC0316a
        public CrashlyticsReport.f.a.b a() {
            String str = "";
            if (this.f35476a == null) {
                str = " clsId";
            }
            if (str.isEmpty()) {
                return new i(this.f35476a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.b.AbstractC0316a
        public CrashlyticsReport.f.a.b.AbstractC0316a b(String str) {
            if (str != null) {
                this.f35476a = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(CrashlyticsReport.f.a.b bVar) {
            this.f35476a = bVar.b();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.b
    @N
    public String b() {
        return this.f35475a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.a.b
    protected CrashlyticsReport.f.a.b.AbstractC0316a c() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.f.a.b) {
            return this.f35475a.equals(((CrashlyticsReport.f.a.b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f35475a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f35475a + "}";
    }

    private i(String str) {
        this.f35475a = str;
    }
}
