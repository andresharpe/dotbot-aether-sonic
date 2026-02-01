package com.google.firebase.installations.local;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.c;

/* loaded from: classes2.dex */
final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private final String f36044b;

    /* renamed from: c, reason: collision with root package name */
    private final PersistedInstallation.RegistrationStatus f36045c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36046d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36047e;

    /* renamed from: f, reason: collision with root package name */
    private final long f36048f;

    /* renamed from: g, reason: collision with root package name */
    private final long f36049g;

    /* renamed from: h, reason: collision with root package name */
    private final String f36050h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f36051a;

        /* renamed from: b, reason: collision with root package name */
        private PersistedInstallation.RegistrationStatus f36052b;

        /* renamed from: c, reason: collision with root package name */
        private String f36053c;

        /* renamed from: d, reason: collision with root package name */
        private String f36054d;

        /* renamed from: e, reason: collision with root package name */
        private Long f36055e;

        /* renamed from: f, reason: collision with root package name */
        private Long f36056f;

        /* renamed from: g, reason: collision with root package name */
        private String f36057g;

        @Override // com.google.firebase.installations.local.c.a
        public c a() {
            String str = "";
            if (this.f36052b == null) {
                str = " registrationStatus";
            }
            if (this.f36055e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f36056f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f36051a, this.f36052b, this.f36053c, this.f36054d, this.f36055e.longValue(), this.f36056f.longValue(), this.f36057g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a b(@P String str) {
            this.f36053c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a c(long j4) {
            this.f36055e = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a d(String str) {
            this.f36051a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a e(@P String str) {
            this.f36057g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a f(@P String str) {
            this.f36054d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f36052b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.local.c.a
        public c.a h(long j4) {
            this.f36056f = Long.valueOf(j4);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(c cVar) {
            this.f36051a = cVar.d();
            this.f36052b = cVar.g();
            this.f36053c = cVar.b();
            this.f36054d = cVar.f();
            this.f36055e = Long.valueOf(cVar.c());
            this.f36056f = Long.valueOf(cVar.h());
            this.f36057g = cVar.e();
        }
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public String b() {
        return this.f36046d;
    }

    @Override // com.google.firebase.installations.local.c
    public long c() {
        return this.f36048f;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public String d() {
        return this.f36044b;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public String e() {
        return this.f36050h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str3 = this.f36044b;
        if (str3 != null ? str3.equals(cVar.d()) : cVar.d() == null) {
            if (this.f36045c.equals(cVar.g()) && ((str = this.f36046d) != null ? str.equals(cVar.b()) : cVar.b() == null) && ((str2 = this.f36047e) != null ? str2.equals(cVar.f()) : cVar.f() == null) && this.f36048f == cVar.c() && this.f36049g == cVar.h()) {
                String str4 = this.f36050h;
                if (str4 == null) {
                    if (cVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(cVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.c
    @P
    public String f() {
        return this.f36047e;
    }

    @Override // com.google.firebase.installations.local.c
    @N
    public PersistedInstallation.RegistrationStatus g() {
        return this.f36045c;
    }

    @Override // com.google.firebase.installations.local.c
    public long h() {
        return this.f36049g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f36044b;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f36045c.hashCode()) * 1000003;
        String str2 = this.f36046d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f36047e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 ^ hashCode3) * 1000003;
        long j4 = this.f36048f;
        int i7 = (i6 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f36049g;
        int i8 = (i7 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        String str4 = this.f36050h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i8 ^ i4;
    }

    @Override // com.google.firebase.installations.local.c
    public c.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f36044b + ", registrationStatus=" + this.f36045c + ", authToken=" + this.f36046d + ", refreshToken=" + this.f36047e + ", expiresInSecs=" + this.f36048f + ", tokenCreationEpochInSecs=" + this.f36049g + ", fisError=" + this.f36050h + "}";
    }

    private a(@P String str, PersistedInstallation.RegistrationStatus registrationStatus, @P String str2, @P String str3, long j4, long j5, @P String str4) {
        this.f36044b = str;
        this.f36045c = registrationStatus;
        this.f36046d = str2;
        this.f36047e = str3;
        this.f36048f = j4;
        this.f36049g = j5;
        this.f36050h = str4;
    }
}
