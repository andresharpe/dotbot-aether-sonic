package com.google.firebase.installations;

import androidx.annotation.N;
import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Status f35981E;

    /* loaded from: classes2.dex */
    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@N Status status) {
        this.f35981E = status;
    }

    @N
    public Status a() {
        return this.f35981E;
    }

    public FirebaseInstallationsException(@N String str, @N Status status) {
        super(str);
        this.f35981E = status;
    }

    public FirebaseInstallationsException(@N String str, @N Status status, @N Throwable th) {
        super(str, th);
        this.f35981E = status;
    }
}
