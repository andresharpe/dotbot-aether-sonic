package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class c extends CrashlyticsReport.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f35411a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35412b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35413c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35414d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35415e;

    /* renamed from: f, reason: collision with root package name */
    private final long f35416f;

    /* renamed from: g, reason: collision with root package name */
    private final long f35417g;

    /* renamed from: h, reason: collision with root package name */
    private final String f35418h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.a.AbstractC0314a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f35419a;

        /* renamed from: b, reason: collision with root package name */
        private String f35420b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f35421c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f35422d;

        /* renamed from: e, reason: collision with root package name */
        private Long f35423e;

        /* renamed from: f, reason: collision with root package name */
        private Long f35424f;

        /* renamed from: g, reason: collision with root package name */
        private Long f35425g;

        /* renamed from: h, reason: collision with root package name */
        private String f35426h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a a() {
            String str = "";
            if (this.f35419a == null) {
                str = " pid";
            }
            if (this.f35420b == null) {
                str = str + " processName";
            }
            if (this.f35421c == null) {
                str = str + " reasonCode";
            }
            if (this.f35422d == null) {
                str = str + " importance";
            }
            if (this.f35423e == null) {
                str = str + " pss";
            }
            if (this.f35424f == null) {
                str = str + " rss";
            }
            if (this.f35425g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f35419a.intValue(), this.f35420b, this.f35421c.intValue(), this.f35422d.intValue(), this.f35423e.longValue(), this.f35424f.longValue(), this.f35425g.longValue(), this.f35426h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a b(int i4) {
            this.f35422d = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a c(int i4) {
            this.f35419a = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a d(String str) {
            if (str != null) {
                this.f35420b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a e(long j4) {
            this.f35423e = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a f(int i4) {
            this.f35421c = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a g(long j4) {
            this.f35424f = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a h(long j4) {
            this.f35425g = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a.AbstractC0314a
        public CrashlyticsReport.a.AbstractC0314a i(@P String str) {
            this.f35426h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public int b() {
        return this.f35414d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public int c() {
        return this.f35411a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public String d() {
        return this.f35412b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public long e() {
        return this.f35415e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.a)) {
            return false;
        }
        CrashlyticsReport.a aVar = (CrashlyticsReport.a) obj;
        if (this.f35411a == aVar.c() && this.f35412b.equals(aVar.d()) && this.f35413c == aVar.f() && this.f35414d == aVar.b() && this.f35415e == aVar.e() && this.f35416f == aVar.g() && this.f35417g == aVar.h()) {
            String str = this.f35418h;
            if (str == null) {
                if (aVar.i() == null) {
                    return true;
                }
            } else if (str.equals(aVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public int f() {
        return this.f35413c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public long g() {
        return this.f35416f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @N
    public long h() {
        return this.f35417g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f35411a ^ 1000003) * 1000003) ^ this.f35412b.hashCode()) * 1000003) ^ this.f35413c) * 1000003) ^ this.f35414d) * 1000003;
        long j4 = this.f35415e;
        int i4 = (hashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f35416f;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f35417g;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str = this.f35418h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i6 ^ hashCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
    @P
    public String i() {
        return this.f35418h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f35411a + ", processName=" + this.f35412b + ", reasonCode=" + this.f35413c + ", importance=" + this.f35414d + ", pss=" + this.f35415e + ", rss=" + this.f35416f + ", timestamp=" + this.f35417g + ", traceFile=" + this.f35418h + "}";
    }

    private c(int i4, String str, int i5, int i6, long j4, long j5, long j6, @P String str2) {
        this.f35411a = i4;
        this.f35412b = str;
        this.f35413c = i5;
        this.f35414d = i6;
        this.f35415e = j4;
        this.f35416f = j5;
        this.f35417g = j6;
        this.f35418h = str2;
    }
}
