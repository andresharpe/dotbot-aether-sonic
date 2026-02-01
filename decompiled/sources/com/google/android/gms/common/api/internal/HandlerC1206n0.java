package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1206n0 extends com.google.android.gms.internal.base.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1208o0 f28359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1206n0(C1208o0 c1208o0, Looper looper) {
        super(looper);
        this.f28359a = c1208o0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            if (i4 != 2) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i4);
                Log.w("GACStateManager", sb.toString());
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        ((AbstractC1204m0) message.obj).b(this.f28359a);
    }
}
