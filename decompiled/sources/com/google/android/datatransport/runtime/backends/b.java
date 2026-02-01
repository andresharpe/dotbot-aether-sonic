package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends BackendResponse {

    /* renamed from: a, reason: collision with root package name */
    private final BackendResponse.Status f27363a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(BackendResponse.Status status, long j4) {
        if (status != null) {
            this.f27363a = status;
            this.f27364b = j4;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long b() {
        return this.f27364b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status c() {
        return this.f27363a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (this.f27363a.equals(backendResponse.c()) && this.f27364b == backendResponse.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f27363a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f27364b;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f27363a + ", nextRequestWaitMillis=" + this.f27364b + "}";
    }
}
