package com.google.firebase.installations;

import androidx.annotation.N;
import com.google.firebase.installations.n;

/* loaded from: classes2.dex */
final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f35982a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35983b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35984c;

    /* loaded from: classes2.dex */
    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private String f35985a;

        /* renamed from: b, reason: collision with root package name */
        private Long f35986b;

        /* renamed from: c, reason: collision with root package name */
        private Long f35987c;

        @Override // com.google.firebase.installations.n.a
        public n a() {
            String str = "";
            if (this.f35985a == null) {
                str = " token";
            }
            if (this.f35986b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f35987c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f35985a, this.f35986b.longValue(), this.f35987c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.n.a
        public n.a b(String str) {
            if (str != null) {
                this.f35985a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.n.a
        public n.a c(long j4) {
            this.f35987c = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.installations.n.a
        public n.a d(long j4) {
            this.f35986b = Long.valueOf(j4);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(n nVar) {
            this.f35985a = nVar.b();
            this.f35986b = Long.valueOf(nVar.d());
            this.f35987c = Long.valueOf(nVar.c());
        }
    }

    @Override // com.google.firebase.installations.n
    @N
    public String b() {
        return this.f35982a;
    }

    @Override // com.google.firebase.installations.n
    @N
    public long c() {
        return this.f35984c;
    }

    @Override // com.google.firebase.installations.n
    @N
    public long d() {
        return this.f35983b;
    }

    @Override // com.google.firebase.installations.n
    public n.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f35982a.equals(nVar.b()) && this.f35983b == nVar.d() && this.f35984c == nVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f35982a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f35983b;
        long j5 = this.f35984c;
        return ((hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f35982a + ", tokenExpirationTimestamp=" + this.f35983b + ", tokenCreationTimestamp=" + this.f35984c + "}";
    }

    private a(String str, long j4, long j5) {
        this.f35982a = str;
        this.f35983b = j4;
        this.f35984c = j5;
    }
}
