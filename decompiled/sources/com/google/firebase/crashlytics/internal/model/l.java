package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class l extends CrashlyticsReport.f.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final CrashlyticsReport.f.d.a.b f35505a;

    /* renamed from: b, reason: collision with root package name */
    private final A<CrashlyticsReport.d> f35506b;

    /* renamed from: c, reason: collision with root package name */
    private final A<CrashlyticsReport.d> f35507c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f35508d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35509e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.AbstractC0317a {

        /* renamed from: a, reason: collision with root package name */
        private CrashlyticsReport.f.d.a.b f35510a;

        /* renamed from: b, reason: collision with root package name */
        private A<CrashlyticsReport.d> f35511b;

        /* renamed from: c, reason: collision with root package name */
        private A<CrashlyticsReport.d> f35512c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f35513d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f35514e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC0317a
        public CrashlyticsReport.f.d.a a() {
            String str = "";
            if (this.f35510a == null) {
                str = " execution";
            }
            if (this.f35514e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new l(this.f35510a, this.f35511b, this.f35512c, this.f35513d, this.f35514e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC0317a
        public CrashlyticsReport.f.d.a.AbstractC0317a b(@P Boolean bool) {
            this.f35513d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC0317a
        public CrashlyticsReport.f.d.a.AbstractC0317a c(A<CrashlyticsReport.d> a4) {
            this.f35511b = a4;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC0317a
        public CrashlyticsReport.f.d.a.AbstractC0317a d(CrashlyticsReport.f.d.a.b bVar) {
            if (bVar != null) {
                this.f35510a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC0317a
        public CrashlyticsReport.f.d.a.AbstractC0317a e(A<CrashlyticsReport.d> a4) {
            this.f35512c = a4;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.AbstractC0317a
        public CrashlyticsReport.f.d.a.AbstractC0317a f(int i4) {
            this.f35514e = Integer.valueOf(i4);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(CrashlyticsReport.f.d.a aVar) {
            this.f35510a = aVar.d();
            this.f35511b = aVar.c();
            this.f35512c = aVar.e();
            this.f35513d = aVar.b();
            this.f35514e = Integer.valueOf(aVar.f());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @P
    public Boolean b() {
        return this.f35508d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @P
    public A<CrashlyticsReport.d> c() {
        return this.f35506b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @N
    public CrashlyticsReport.f.d.a.b d() {
        return this.f35505a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    @P
    public A<CrashlyticsReport.d> e() {
        return this.f35507c;
    }

    public boolean equals(Object obj) {
        A<CrashlyticsReport.d> a4;
        A<CrashlyticsReport.d> a5;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a)) {
            return false;
        }
        CrashlyticsReport.f.d.a aVar = (CrashlyticsReport.f.d.a) obj;
        if (this.f35505a.equals(aVar.d()) && ((a4 = this.f35506b) != null ? a4.equals(aVar.c()) : aVar.c() == null) && ((a5 = this.f35507c) != null ? a5.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f35508d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f35509e == aVar.f()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    public int f() {
        return this.f35509e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a
    public CrashlyticsReport.f.d.a.AbstractC0317a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f35505a.hashCode() ^ 1000003) * 1000003;
        A<CrashlyticsReport.d> a4 = this.f35506b;
        int i4 = 0;
        if (a4 == null) {
            hashCode = 0;
        } else {
            hashCode = a4.hashCode();
        }
        int i5 = (hashCode3 ^ hashCode) * 1000003;
        A<CrashlyticsReport.d> a5 = this.f35507c;
        if (a5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a5.hashCode();
        }
        int i6 = (i5 ^ hashCode2) * 1000003;
        Boolean bool = this.f35508d;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return ((i6 ^ i4) * 1000003) ^ this.f35509e;
    }

    public String toString() {
        return "Application{execution=" + this.f35505a + ", customAttributes=" + this.f35506b + ", internalKeys=" + this.f35507c + ", background=" + this.f35508d + ", uiOrientation=" + this.f35509e + "}";
    }

    private l(CrashlyticsReport.f.d.a.b bVar, @P A<CrashlyticsReport.d> a4, @P A<CrashlyticsReport.d> a5, @P Boolean bool, int i4) {
        this.f35505a = bVar;
        this.f35506b = a4;
        this.f35507c = a5;
        this.f35508d = bool;
        this.f35509e = i4;
    }
}
