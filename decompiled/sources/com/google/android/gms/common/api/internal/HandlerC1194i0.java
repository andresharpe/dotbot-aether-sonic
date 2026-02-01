package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1194i0 extends com.google.android.gms.internal.base.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1200k0 f28305a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1194i0(C1200k0 c1200k0, Looper looper) {
        super(looper);
        this.f28305a = c1200k0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            if (i4 != 2) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i4);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            }
            C1200k0.P(this.f28305a);
            return;
        }
        C1200k0.Q(this.f28305a);
    }
}
