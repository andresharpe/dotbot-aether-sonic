package com.google.firebase.remoteconfig;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: E, reason: collision with root package name */
    private final int f37358E;

    public FirebaseRemoteConfigServerException(int i4, @N String str) {
        super(str);
        this.f37358E = i4;
    }

    public int a() {
        return this.f37358E;
    }

    public FirebaseRemoteConfigServerException(int i4, @N String str, @P Throwable th) {
        super(str, th);
        this.f37358E = i4;
    }
}
