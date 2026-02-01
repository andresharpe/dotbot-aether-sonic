package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class q extends Handler {
    public q() {
    }

    public q(Looper looper) {
        super(looper);
    }

    public q(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
