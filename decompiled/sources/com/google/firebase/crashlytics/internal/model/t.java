package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class t extends CrashlyticsReport.f.d.AbstractC0327d {

    /* renamed from: a, reason: collision with root package name */
    private final String f35578a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.AbstractC0327d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f35579a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.AbstractC0327d.a
        public CrashlyticsReport.f.d.AbstractC0327d a() {
            String str = "";
            if (this.f35579a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new t(this.f35579a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.AbstractC0327d.a
        public CrashlyticsReport.f.d.AbstractC0327d.a b(String str) {
            if (str != null) {
                this.f35579a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.AbstractC0327d
    @N
    public String b() {
        return this.f35578a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.f.d.AbstractC0327d) {
            return this.f35578a.equals(((CrashlyticsReport.f.d.AbstractC0327d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f35578a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f35578a + "}";
    }

    private t(String str) {
        this.f35578a = str;
    }
}
