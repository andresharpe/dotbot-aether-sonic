package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class r extends Handler {
    public r() {
    }

    public r(Looper looper) {
        super(looper);
    }

    public r(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
