package com.google.android.datatransport.cct.internal;

/* loaded from: classes.dex */
final class h extends m {

    /* renamed from: b, reason: collision with root package name */
    private final long f27318b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j4) {
        this.f27318b = j4;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    public long c() {
        return this.f27318b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m) && this.f27318b == ((m) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f27318b;
        return ((int) (j4 ^ (j4 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f27318b + "}";
    }
}
