package com.google.firebase.installations.remote;

import androidx.annotation.P;
import com.google.firebase.installations.remote.InstallationResponse;

/* loaded from: classes2.dex */
final class a extends InstallationResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f36283a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36284b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36285c;

    /* renamed from: d, reason: collision with root package name */
    private final TokenResult f36286d;

    /* renamed from: e, reason: collision with root package name */
    private final InstallationResponse.ResponseCode f36287e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends InstallationResponse.a {

        /* renamed from: a, reason: collision with root package name */
        private String f36288a;

        /* renamed from: b, reason: collision with root package name */
        private String f36289b;

        /* renamed from: c, reason: collision with root package name */
        private String f36290c;

        /* renamed from: d, reason: collision with root package name */
        private TokenResult f36291d;

        /* renamed from: e, reason: collision with root package name */
        private InstallationResponse.ResponseCode f36292e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.a
        public InstallationResponse a() {
            return new a(this.f36288a, this.f36289b, this.f36290c, this.f36291d, this.f36292e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.a
        public InstallationResponse.a b(TokenResult tokenResult) {
            this.f36291d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.a
        public InstallationResponse.a c(String str) {
            this.f36289b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.a
        public InstallationResponse.a d(String str) {
            this.f36290c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.a
        public InstallationResponse.a e(InstallationResponse.ResponseCode responseCode) {
            this.f36292e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.a
        public InstallationResponse.a f(String str) {
            this.f36288a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(InstallationResponse installationResponse) {
            this.f36288a = installationResponse.f();
            this.f36289b = installationResponse.c();
            this.f36290c = installationResponse.d();
            this.f36291d = installationResponse.b();
            this.f36292e = installationResponse.e();
        }
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public TokenResult b() {
        return this.f36286d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public String c() {
        return this.f36284b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public String d() {
        return this.f36285c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public InstallationResponse.ResponseCode e() {
        return this.f36287e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f36283a;
        if (str != null ? str.equals(installationResponse.f()) : installationResponse.f() == null) {
            String str2 = this.f36284b;
            if (str2 != null ? str2.equals(installationResponse.c()) : installationResponse.c() == null) {
                String str3 = this.f36285c;
                if (str3 != null ? str3.equals(installationResponse.d()) : installationResponse.d() == null) {
                    TokenResult tokenResult = this.f36286d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.b()) : installationResponse.b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f36287e;
                        if (responseCode == null) {
                            if (installationResponse.e() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public String f() {
        return this.f36283a;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f36283a;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f36284b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 ^ hashCode2) * 1000003;
        String str3 = this.f36285c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i7 = (i6 ^ hashCode3) * 1000003;
        TokenResult tokenResult = this.f36286d;
        if (tokenResult == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tokenResult.hashCode();
        }
        int i8 = (i7 ^ hashCode4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f36287e;
        if (responseCode != null) {
            i4 = responseCode.hashCode();
        }
        return i8 ^ i4;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f36283a + ", fid=" + this.f36284b + ", refreshToken=" + this.f36285c + ", authToken=" + this.f36286d + ", responseCode=" + this.f36287e + "}";
    }

    private a(@P String str, @P String str2, @P String str3, @P TokenResult tokenResult, @P InstallationResponse.ResponseCode responseCode) {
        this.f36283a = str;
        this.f36284b = str2;
        this.f36285c = str3;
        this.f36286d = tokenResult;
        this.f36287e = responseCode;
    }
}
