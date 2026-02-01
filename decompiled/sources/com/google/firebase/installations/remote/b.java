package com.google.firebase.installations.remote;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes2.dex */
final class b extends TokenResult {

    /* renamed from: a, reason: collision with root package name */
    private final String f36293a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36294b;

    /* renamed from: c, reason: collision with root package name */
    private final TokenResult.ResponseCode f36295c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.remote.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0337b extends TokenResult.a {

        /* renamed from: a, reason: collision with root package name */
        private String f36296a;

        /* renamed from: b, reason: collision with root package name */
        private Long f36297b;

        /* renamed from: c, reason: collision with root package name */
        private TokenResult.ResponseCode f36298c;

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult a() {
            String str = "";
            if (this.f36297b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f36296a, this.f36297b.longValue(), this.f36298c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a b(TokenResult.ResponseCode responseCode) {
            this.f36298c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a c(String str) {
            this.f36296a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a d(long j4) {
            this.f36297b = Long.valueOf(j4);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0337b() {
        }

        private C0337b(TokenResult tokenResult) {
            this.f36296a = tokenResult.c();
            this.f36297b = Long.valueOf(tokenResult.d());
            this.f36298c = tokenResult.b();
        }
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @P
    public TokenResult.ResponseCode b() {
        return this.f36295c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @P
    public String c() {
        return this.f36293a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @N
    public long d() {
        return this.f36294b;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.a e() {
        return new C0337b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f36293a;
        if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
            if (this.f36294b == tokenResult.d()) {
                TokenResult.ResponseCode responseCode = this.f36295c;
                if (responseCode == null) {
                    if (tokenResult.b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f36293a;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j4 = this.f36294b;
        int i5 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f36295c;
        if (responseCode != null) {
            i4 = responseCode.hashCode();
        }
        return i5 ^ i4;
    }

    public String toString() {
        return "TokenResult{token=" + this.f36293a + ", tokenExpirationTimestamp=" + this.f36294b + ", responseCode=" + this.f36295c + "}";
    }

    private b(@P String str, long j4, @P TokenResult.ResponseCode responseCode) {
        this.f36293a = str;
        this.f36294b = j4;
        this.f36295c = responseCode;
    }
}
