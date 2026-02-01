package com.spotify.sdk.android.auth;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public interface a {
        void a(AuthorizationResponse authorizationResponse);

        void onCancel();

        void onError(Throwable th);
    }

    boolean a(Activity activity, d dVar);

    void b(a aVar);

    void stop();
}
