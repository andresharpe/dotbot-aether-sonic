package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class e extends CrashlyticsReport.e {

    /* renamed from: a, reason: collision with root package name */
    private final A<CrashlyticsReport.e.b> f35431a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35432b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.e.a {

        /* renamed from: a, reason: collision with root package name */
        private A<CrashlyticsReport.e.b> f35433a;

        /* renamed from: b, reason: collision with root package name */
        private String f35434b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.a
        public CrashlyticsReport.e a() {
            String str = "";
            if (this.f35433a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new e(this.f35433a, this.f35434b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.a
        public CrashlyticsReport.e.a b(A<CrashlyticsReport.e.b> a4) {
            if (a4 != null) {
                this.f35433a = a4;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.a
        public CrashlyticsReport.e.a c(String str) {
            this.f35434b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(CrashlyticsReport.e eVar) {
            this.f35433a = eVar.b();
            this.f35434b = eVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e
    @N
    public A<CrashlyticsReport.e.b> b() {
        return this.f35431a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e
    @P
    public String c() {
        return this.f35432b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e
    CrashlyticsReport.e.a d() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.e)) {
            return false;
        }
        CrashlyticsReport.e eVar = (CrashlyticsReport.e) obj;
        if (this.f35431a.equals(eVar.b())) {
            String str = this.f35432b;
            if (str == null) {
                if (eVar.c() == null) {
                    return true;
                }
            } else if (str.equals(eVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f35431a.hashCode() ^ 1000003) * 1000003;
        String str = this.f35432b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f35431a + ", orgId=" + this.f35432b + "}";
    }

    private e(A<CrashlyticsReport.e.b> a4, @P String str) {
        this.f35431a = a4;
        this.f35432b = str;
    }
}
