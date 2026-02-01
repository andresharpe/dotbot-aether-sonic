package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class q extends CrashlyticsReport.f.d.a.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f35549a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35550b;

    /* renamed from: c, reason: collision with root package name */
    private final A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> f35551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.b.e.AbstractC0324a {

        /* renamed from: a, reason: collision with root package name */
        private String f35552a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f35553b;

        /* renamed from: c, reason: collision with root package name */
        private A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> f35554c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0324a
        public CrashlyticsReport.f.d.a.b.e a() {
            String str = "";
            if (this.f35552a == null) {
                str = " name";
            }
            if (this.f35553b == null) {
                str = str + " importance";
            }
            if (this.f35554c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new q(this.f35552a, this.f35553b.intValue(), this.f35554c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0324a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0324a b(A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> a4) {
            if (a4 != null) {
                this.f35554c = a4;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0324a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0324a c(int i4) {
            this.f35553b = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0324a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0324a d(String str) {
            if (str != null) {
                this.f35552a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e
    @N
    public A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> b() {
        return this.f35551c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e
    public int c() {
        return this.f35550b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e
    @N
    public String d() {
        return this.f35549a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.e)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.e eVar = (CrashlyticsReport.f.d.a.b.e) obj;
        if (this.f35549a.equals(eVar.d()) && this.f35550b == eVar.c() && this.f35551c.equals(eVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f35549a.hashCode() ^ 1000003) * 1000003) ^ this.f35550b) * 1000003) ^ this.f35551c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f35549a + ", importance=" + this.f35550b + ", frames=" + this.f35551c + "}";
    }

    private q(String str, int i4, A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> a4) {
        this.f35549a = str;
        this.f35550b = i4;
        this.f35551c = a4;
    }
}
