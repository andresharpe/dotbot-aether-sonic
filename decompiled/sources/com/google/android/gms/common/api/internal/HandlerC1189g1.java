package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1189g1 extends com.google.android.gms.internal.base.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1195i1 f28276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1189g1(C1195i1 c1195i1, Looper looper) {
        super(looper);
        this.f28276a = c1195i1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        C1195i1 c1195i1;
        String str;
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i4);
                Log.e("TransformedResultImpl", sb.toString());
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                str = "Runtime exception on the transformation worker thread: ".concat(valueOf);
            } else {
                str = new String("Runtime exception on the transformation worker thread: ");
            }
            Log.e("TransformedResultImpl", str);
            throw runtimeException;
        }
        com.google.android.gms.common.api.l<?> lVar = (com.google.android.gms.common.api.l) message.obj;
        obj = this.f28276a.f28310e;
        synchronized (obj) {
            try {
                c1195i1 = this.f28276a.f28307b;
                C1195i1 c1195i12 = (C1195i1) C1285y.l(c1195i1);
                if (lVar == null) {
                    c1195i12.m(new Status(13, "Transform returned null"));
                } else if (lVar instanceof W0) {
                    c1195i12.m(((W0) lVar).c());
                } else {
                    c1195i12.l(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
