package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class m extends CrashlyticsReport.f.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final A<CrashlyticsReport.f.d.a.b.e> f35515a;

    /* renamed from: b, reason: collision with root package name */
    private final CrashlyticsReport.f.d.a.b.c f35516b;

    /* renamed from: c, reason: collision with root package name */
    private final CrashlyticsReport.a f35517c;

    /* renamed from: d, reason: collision with root package name */
    private final CrashlyticsReport.f.d.a.b.AbstractC0322d f35518d;

    /* renamed from: e, reason: collision with root package name */
    private final A<CrashlyticsReport.f.d.a.b.AbstractC0318a> f35519e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.d.a.b.AbstractC0320b {

        /* renamed from: a, reason: collision with root package name */
        private A<CrashlyticsReport.f.d.a.b.e> f35520a;

        /* renamed from: b, reason: collision with root package name */
        private CrashlyticsReport.f.d.a.b.c f35521b;

        /* renamed from: c, reason: collision with root package name */
        private CrashlyticsReport.a f35522c;

        /* renamed from: d, reason: collision with root package name */
        private CrashlyticsReport.f.d.a.b.AbstractC0322d f35523d;

        /* renamed from: e, reason: collision with root package name */
        private A<CrashlyticsReport.f.d.a.b.AbstractC0318a> f35524e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0320b
        public CrashlyticsReport.f.d.a.b a() {
            String str = "";
            if (this.f35523d == null) {
                str = " signal";
            }
            if (this.f35524e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new m(this.f35520a, this.f35521b, this.f35522c, this.f35523d, this.f35524e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0320b
        public CrashlyticsReport.f.d.a.b.AbstractC0320b b(CrashlyticsReport.a aVar) {
            this.f35522c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0320b
        public CrashlyticsReport.f.d.a.b.AbstractC0320b c(A<CrashlyticsReport.f.d.a.b.AbstractC0318a> a4) {
            if (a4 != null) {
                this.f35524e = a4;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0320b
        public CrashlyticsReport.f.d.a.b.AbstractC0320b d(CrashlyticsReport.f.d.a.b.c cVar) {
            this.f35521b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0320b
        public CrashlyticsReport.f.d.a.b.AbstractC0320b e(CrashlyticsReport.f.d.a.b.AbstractC0322d abstractC0322d) {
            if (abstractC0322d != null) {
                this.f35523d = abstractC0322d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b.AbstractC0320b
        public CrashlyticsReport.f.d.a.b.AbstractC0320b f(A<CrashlyticsReport.f.d.a.b.e> a4) {
            this.f35520a = a4;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @P
    public CrashlyticsReport.a b() {
        return this.f35517c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @N
    public A<CrashlyticsReport.f.d.a.b.AbstractC0318a> c() {
        return this.f35519e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @P
    public CrashlyticsReport.f.d.a.b.c d() {
        return this.f35516b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @N
    public CrashlyticsReport.f.d.a.b.AbstractC0322d e() {
        return this.f35518d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.d.a.b)) {
            return false;
        }
        CrashlyticsReport.f.d.a.b bVar = (CrashlyticsReport.f.d.a.b) obj;
        A<CrashlyticsReport.f.d.a.b.e> a4 = this.f35515a;
        if (a4 != null ? a4.equals(bVar.f()) : bVar.f() == null) {
            CrashlyticsReport.f.d.a.b.c cVar = this.f35516b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                CrashlyticsReport.a aVar = this.f35517c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f35518d.equals(bVar.e()) && this.f35519e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.d.a.b
    @P
    public A<CrashlyticsReport.f.d.a.b.e> f() {
        return this.f35515a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        A<CrashlyticsReport.f.d.a.b.e> a4 = this.f35515a;
        int i4 = 0;
        if (a4 == null) {
            hashCode = 0;
        } else {
            hashCode = a4.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        CrashlyticsReport.f.d.a.b.c cVar = this.f35516b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i6 = (i5 ^ hashCode2) * 1000003;
        CrashlyticsReport.a aVar = this.f35517c;
        if (aVar != null) {
            i4 = aVar.hashCode();
        }
        return ((((i6 ^ i4) * 1000003) ^ this.f35518d.hashCode()) * 1000003) ^ this.f35519e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f35515a + ", exception=" + this.f35516b + ", appExitInfo=" + this.f35517c + ", signal=" + this.f35518d + ", binaries=" + this.f35519e + "}";
    }

    private m(@P A<CrashlyticsReport.f.d.a.b.e> a4, @P CrashlyticsReport.f.d.a.b.c cVar, @P CrashlyticsReport.a aVar, CrashlyticsReport.f.d.a.b.AbstractC0322d abstractC0322d, A<CrashlyticsReport.f.d.a.b.AbstractC0318a> a5) {
        this.f35515a = a4;
        this.f35516b = cVar;
        this.f35517c = aVar;
        this.f35518d = abstractC0322d;
        this.f35519e = a5;
    }
}
