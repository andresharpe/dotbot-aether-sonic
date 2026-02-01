package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class r extends CrashlyticsReport.f.d.a.b.e.AbstractC0325b {

    /* renamed from: a, reason: collision with root package name */
    private final long f35555a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35556b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35557c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35558d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35559e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a {

        /* renamed from: a, reason: collision with root package name */
        private Long f35560a;

        /* renamed from: b, reason: collision with root package name */
        private String f35561b;

        /* renamed from: c, reason: collision with root package name */
        private String f35562c;

        /* renamed from: d, reason: collision with root package name */
        private Long f35563d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f35564e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0325b a() {
            String str = "";
            if (this.f35560a == null) {
                str = " pc";
            }
            if (this.f35561b == null) {
                str = str + " symbol";
            }
            if (this.f35563d == null) {
                str = str + " offset";
            }
            if (this.f35564e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new r(this.f35560a.longValue(), this.f35561b, this.f35562c, this.f35563d.longValue(), this.f35564e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a b(String str) {
            this.f35562c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a c(int i4) {
            this.f35564e = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a d(long j4) {
            this.f35563d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a e(long j4) {
            this.f35560a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a
        public CrashlyticsReport.f.d.a.b.e.AbstractC0325b.AbstractC0326a f(String str) {
            if (str != null) {
                this.f35561b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b
    @P
    public String b() {
        return this.f35557c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b
    public int c() {
        return this.f35559e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b
    public long d() {
        return this.f35558d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b
    public long e() {
        return this.f35555a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.e.AbstractC0325b)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.e.AbstractC0325b abstractC0325b = (CrashlyticsReport.f.d.a.b.e.AbstractC0325b) obj;
        if (this.f35555a == abstractC0325b.e() && this.f35556b.equals(abstractC0325b.f()) && ((str = this.f35557c) != null ? str.equals(abstractC0325b.b()) : abstractC0325b.b() == null) && this.f35558d == abstractC0325b.d() && this.f35559e == abstractC0325b.c()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.e.AbstractC0325b
    @N
    public String f() {
        return this.f35556b;
    }

    public int hashCode() {
        int hashCode;
        long j4 = this.f35555a;
        int hashCode2 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f35556b.hashCode()) * 1000003;
        String str = this.f35557c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode2 ^ hashCode) * 1000003;
        long j5 = this.f35558d;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f35559e;
    }

    public String toString() {
        return "Frame{pc=" + this.f35555a + ", symbol=" + this.f35556b + ", file=" + this.f35557c + ", offset=" + this.f35558d + ", importance=" + this.f35559e + "}";
    }

    private r(long j4, String str, @P String str2, long j5, int i4) {
        this.f35555a = j4;
        this.f35556b = str;
        this.f35557c = str2;
        this.f35558d = j5;
        this.f35559e = i4;
    }
}
