package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.cloudmessaging.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1162e f27915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C1162e c1162e, Looper looper) {
        super(looper);
        this.f27915a = c1162e;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1162e.d(this.f27915a, message);
    }
}
