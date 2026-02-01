package com.google.firebase.remoteconfig;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* renamed from: E, reason: collision with root package name */
    private final long f37357E;

    public FirebaseRemoteConfigFetchThrottledException(long j4) {
        this("Fetch was throttled.", j4);
    }

    public long a() {
        return this.f37357E;
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j4) {
        super(str);
        this.f37357E = j4;
    }
}
