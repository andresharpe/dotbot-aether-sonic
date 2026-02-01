package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import w1.InterfaceC2431a;

/* loaded from: classes2.dex */
final class n extends CrashlyticsReport.f.d.a.b.AbstractC0318a {

    /* renamed from: a, reason: collision with root package name */
    private final long f35525a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35526b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35527c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35528d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a {

        /* renamed from: a, reason: collision with root package name */
        private Long f35529a;

        /* renamed from: b, reason: collision with root package name */
        private Long f35530b;

        /* renamed from: c, reason: collision with root package name */
        private String f35531c;

        /* renamed from: d, reason: collision with root package name */
        private String f35532d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a
        public CrashlyticsReport.f.d.a.b.AbstractC0318a a() {
            String str = "";
            if (this.f35529a == null) {
                str = " baseAddress";
            }
            if (this.f35530b == null) {
                str = str + " size";
            }
            if (this.f35531c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new n(this.f35529a.longValue(), this.f35530b.longValue(), this.f35531c, this.f35532d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a
        public CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a b(long j4) {
            this.f35529a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a
        public CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a c(String str) {
            if (str != null) {
                this.f35531c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a
        public CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a d(long j4) {
            this.f35530b = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a
        public CrashlyticsReport.f.d.a.b.AbstractC0318a.AbstractC0319a e(@P String str) {
            this.f35532d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a
    @N
    public long b() {
        return this.f35525a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a
    @N
    public String c() {
        return this.f35527c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a
    public long d() {
        return this.f35526b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0318a
    @P
    @InterfaceC2431a.b
    public String e() {
        return this.f35528d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.AbstractC0318a)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.AbstractC0318a abstractC0318a = (CrashlyticsReport.f.d.a.b.AbstractC0318a) obj;
        if (this.f35525a == abstractC0318a.b() && this.f35526b == abstractC0318a.d() && this.f35527c.equals(abstractC0318a.c())) {
            String str = this.f35528d;
            if (str == null) {
                if (abstractC0318a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0318a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j4 = this.f35525a;
        long j5 = this.f35526b;
        int hashCode2 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f35527c.hashCode()) * 1000003;
        String str = this.f35528d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f35525a + ", size=" + this.f35526b + ", name=" + this.f35527c + ", uuid=" + this.f35528d + "}";
    }

    private n(long j4, long j5, String str, @P String str2) {
        this.f35525a = j4;
        this.f35526b = j5;
        this.f35527c = str;
        this.f35528d = str2;
    }
}
