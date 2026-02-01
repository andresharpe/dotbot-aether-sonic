package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.C0745h;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class R0 implements Handler.Callback {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S0 f28647c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ R0(S0 s02, Q0 q02) {
        this.f28647c = s02;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i4 = message.what;
        if (i4 == 0) {
            hashMap = this.f28647c.f28651f;
            synchronized (hashMap) {
                try {
                    N0 n02 = (N0) message.obj;
                    hashMap2 = this.f28647c.f28651f;
                    P0 p02 = (P0) hashMap2.get(n02);
                    if (p02 != null && p02.i()) {
                        if (p02.j()) {
                            p02.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f28647c.f28651f;
                        hashMap3.remove(n02);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 == 1) {
            hashMap4 = this.f28647c.f28651f;
            synchronized (hashMap4) {
                try {
                    N0 n03 = (N0) message.obj;
                    hashMap5 = this.f28647c.f28651f;
                    P0 p03 = (P0) hashMap5.get(n03);
                    if (p03 != null && p03.a() == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(n03), new Exception());
                        ComponentName b4 = p03.b();
                        if (b4 == null) {
                            b4 = n03.b();
                        }
                        if (b4 == null) {
                            String d4 = n03.d();
                            C1285y.l(d4);
                            b4 = new ComponentName(d4, C0745h.f12738b);
                        }
                        p03.onServiceDisconnected(b4);
                    }
                } finally {
                }
            }
            return true;
        }
        return false;
    }
}
