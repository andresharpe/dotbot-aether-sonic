package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.N;

/* loaded from: classes.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@N Status status) {
        super(status);
    }

    @N
    public PendingIntent d() {
        return a().e0();
    }

    public void e(@N Activity activity, int i4) throws IntentSender.SendIntentException {
        a().E0(activity, i4);
    }
}
