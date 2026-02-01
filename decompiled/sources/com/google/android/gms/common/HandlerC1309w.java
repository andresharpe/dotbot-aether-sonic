package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1309w extends com.google.android.gms.internal.base.q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29029a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1236h f29030b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HandlerC1309w(com.google.android.gms.common.C1236h r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f29030b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f29029a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.HandlerC1309w.<init>(com.google.android.gms.common.h, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i4);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int j4 = this.f29030b.j(this.f29029a);
        if (this.f29030b.o(j4)) {
            this.f29030b.C(this.f29029a, j4);
        }
    }
}
