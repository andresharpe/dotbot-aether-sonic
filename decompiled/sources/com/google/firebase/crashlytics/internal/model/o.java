package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class o extends CrashlyticsReport.f.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f35533a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35534b;

    /* renamed from: c, reason: collision with root package name */
    private final A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> f35535c;

    /* renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.f.d.a.b.c f35536d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35537e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.b.c.AbstractC0321a {

        /* renamed from: a, reason: collision with root package name */
        private String f35538a;

        /* renamed from: b, reason: collision with root package name */
        private String f35539b;

        /* renamed from: c, reason: collision with root package name */
        private A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> f35540c;

        /* renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.f.d.a.b.c f35541d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f35542e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC0321a
        public CrashlyticsReport.f.d.a.b.c a() {
            String str = "";
            if (this.f35538a == null) {
                str = " type";
            }
            if (this.f35540c == null) {
                str = str + " frames";
            }
            if (this.f35542e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new o(this.f35538a, this.f35539b, this.f35540c, this.f35541d, this.f35542e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC0321a
        public CrashlyticsReport.f.d.a.b.c.AbstractC0321a b(CrashlyticsReport.f.d.a.b.c cVar) {
            this.f35541d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC0321a
        public CrashlyticsReport.f.d.a.b.c.AbstractC0321a c(A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> a4) {
            if (a4 != null) {
                this.f35540c = a4;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC0321a
        public CrashlyticsReport.f.d.a.b.c.AbstractC0321a d(int i4) {
            this.f35542e = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC0321a
        public CrashlyticsReport.f.d.a.b.c.AbstractC0321a e(String str) {
            this.f35539b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c.AbstractC0321a
        public CrashlyticsReport.f.d.a.b.c.AbstractC0321a f(String str) {
            if (str != null) {
                this.f35538a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @P
    public CrashlyticsReport.f.d.a.b.c b() {
        return this.f35536d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @N
    public A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> c() {
        return this.f35535c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    public int d() {
        return this.f35537e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @P
    public String e() {
        return this.f35534b;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b.c)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b.c cVar2 = (CrashlyticsReport.f.d.a.b.c) obj;
        if (this.f35533a.equals(cVar2.f()) && ((str = this.f35534b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f35535c.equals(cVar2.c()) && ((cVar = this.f35536d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f35537e == cVar2.d()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.c
    @N
    public String f() {
        return this.f35533a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f35533a.hashCode() ^ 1000003) * 1000003;
        String str = this.f35534b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f35535c.hashCode()) * 1000003;
        CrashlyticsReport.f.d.a.b.c cVar = this.f35536d;
        if (cVar != null) {
            i4 = cVar.hashCode();
        }
        return ((hashCode3 ^ i4) * 1000003) ^ this.f35537e;
    }

    public String toString() {
        return "Exception{type=" + this.f35533a + ", reason=" + this.f35534b + ", frames=" + this.f35535c + ", causedBy=" + this.f35536d + ", overflowCount=" + this.f35537e + "}";
    }

    private o(String str, @P String str2, A<CrashlyticsReport.f.d.a.b.e.AbstractC0325b> a4, @P CrashlyticsReport.f.d.a.b.c cVar, int i4) {
        this.f35533a = str;
        this.f35534b = str2;
        this.f35535c = a4;
        this.f35536d = cVar;
        this.f35537e = i4;
    }
}
