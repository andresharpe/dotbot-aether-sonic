package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class v extends CrashlyticsReport.f.AbstractC0328f {

    /* renamed from: a, reason: collision with root package name */
    private final String f35588a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.AbstractC0328f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f35589a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.AbstractC0328f.a
        public CrashlyticsReport.f.AbstractC0328f a() {
            String str = "";
            if (this.f35589a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new v(this.f35589a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.AbstractC0328f.a
        public CrashlyticsReport.f.AbstractC0328f.a b(String str) {
            if (str != null) {
                this.f35589a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.AbstractC0328f
    @N
    public String b() {
        return this.f35588a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.f.AbstractC0328f) {
            return this.f35588a.equals(((CrashlyticsReport.f.AbstractC0328f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f35588a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f35588a + "}";
    }

    private v(String str) {
        this.f35588a = str;
    }
}
