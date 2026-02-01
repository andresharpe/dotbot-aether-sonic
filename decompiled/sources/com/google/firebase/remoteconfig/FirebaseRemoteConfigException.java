package com.google.firebase.remoteconfig;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    public FirebaseRemoteConfigException(@N String str) {
        super(str);
    }

    public FirebaseRemoteConfigException(@N String str, @P Throwable th) {
        super(str, th);
    }
}
