package com.google.firebase.heartbeatinfo;

/* loaded from: classes2.dex */
final class b extends t {

    /* renamed from: E, reason: collision with root package name */
    private final String f35960E;

    /* renamed from: F, reason: collision with root package name */
    private final long f35961F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, long j4) {
        if (str != null) {
            this.f35960E = str;
            this.f35961F = j4;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f35960E.equals(tVar.g()) && this.f35961F == tVar.f()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.t
    public long f() {
        return this.f35961F;
    }

    @Override // com.google.firebase.heartbeatinfo.t
    public String g() {
        return this.f35960E;
    }

    public int hashCode() {
        int hashCode = (this.f35960E.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f35961F;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f35960E + ", millis=" + this.f35961F + "}";
    }
}
