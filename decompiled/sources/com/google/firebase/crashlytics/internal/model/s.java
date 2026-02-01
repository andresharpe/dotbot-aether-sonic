package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class s extends CrashlyticsReport.f.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f35565a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35566b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35567c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35568d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35569e;

    /* renamed from: f, reason: collision with root package name */
    private final long f35570f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f35571a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f35572b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f35573c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f35574d;

        /* renamed from: e, reason: collision with root package name */
        private Long f35575e;

        /* renamed from: f, reason: collision with root package name */
        private Long f35576f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c a() {
            String str = "";
            if (this.f35572b == null) {
                str = " batteryVelocity";
            }
            if (this.f35573c == null) {
                str = str + " proximityOn";
            }
            if (this.f35574d == null) {
                str = str + " orientation";
            }
            if (this.f35575e == null) {
                str = str + " ramUsed";
            }
            if (this.f35576f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new s(this.f35571a, this.f35572b.intValue(), this.f35573c.booleanValue(), this.f35574d.intValue(), this.f35575e.longValue(), this.f35576f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c.a b(Double d4) {
            this.f35571a = d4;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c.a c(int i4) {
            this.f35572b = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c.a d(long j4) {
            this.f35576f = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c.a e(int i4) {
            this.f35574d = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c.a f(boolean z3) {
            this.f35573c = Boolean.valueOf(z3);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c.a
        public CrashlyticsReport.f.d.c.a g(long j4) {
            this.f35575e = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    @P
    public Double b() {
        return this.f35565a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public int c() {
        return this.f35566b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public long d() {
        return this.f35570f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public int e() {
        return this.f35568d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.c)) {
            return false;
        }
        CrashlyticsReport.f.d.c cVar = (CrashlyticsReport.f.d.c) obj;
        Double d4 = this.f35565a;
        if (d4 != null ? d4.equals(cVar.b()) : cVar.b() == null) {
            if (this.f35566b == cVar.c() && this.f35567c == cVar.g() && this.f35568d == cVar.e() && this.f35569e == cVar.f() && this.f35570f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public long f() {
        return this.f35569e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.c
    public boolean g() {
        return this.f35567c;
    }

    public int hashCode() {
        int hashCode;
        int i4;
        Double d4 = this.f35565a;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int i5 = (((hashCode ^ 1000003) * 1000003) ^ this.f35566b) * 1000003;
        if (this.f35567c) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i6 = (((i5 ^ i4) * 1000003) ^ this.f35568d) * 1000003;
        long j4 = this.f35569e;
        long j5 = this.f35570f;
        return ((i6 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f35565a + ", batteryVelocity=" + this.f35566b + ", proximityOn=" + this.f35567c + ", orientation=" + this.f35568d + ", ramUsed=" + this.f35569e + ", diskUsed=" + this.f35570f + "}";
    }

    private s(@P Double d4, int i4, boolean z3, int i5, long j4, long j5) {
        this.f35565a = d4;
        this.f35566b = i4;
        this.f35567c = z3;
        this.f35568d = i5;
        this.f35569e = j4;
        this.f35570f = j5;
    }
}
