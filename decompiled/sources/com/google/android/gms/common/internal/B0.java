package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.AbstractC1246e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class B0 extends com.google.android.gms.internal.common.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e f28600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC1246e abstractC1246e, Looper looper) {
        super(looper);
        this.f28600a = abstractC1246e;
    }

    private static final void a(Message message) {
        C0 c02 = (C0) message.obj;
        c02.b();
        c02.e();
    }

    private static final boolean b(Message message) {
        int i4 = message.what;
        if (i4 == 2 || i4 == 1 || i4 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC1246e.a aVar;
        AbstractC1246e.a aVar2;
        C1231c c1231c;
        C1231c c1231c2;
        C1231c c1231c3;
        C1231c c1231c4;
        boolean z3;
        if (this.f28600a.f28695E.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i4 = message.what;
        if ((i4 != 1 && i4 != 7 && ((i4 != 4 || this.f28600a.B()) && message.what != 5)) || this.f28600a.e()) {
            int i5 = message.what;
            PendingIntent pendingIntent = null;
            if (i5 == 4) {
                this.f28600a.f28692B = new C1231c(message.arg2);
                if (AbstractC1246e.p0(this.f28600a)) {
                    AbstractC1246e abstractC1246e = this.f28600a;
                    z3 = abstractC1246e.f28693C;
                    if (!z3) {
                        abstractC1246e.q0(3, null);
                        return;
                    }
                }
                AbstractC1246e abstractC1246e2 = this.f28600a;
                c1231c3 = abstractC1246e2.f28692B;
                if (c1231c3 != null) {
                    c1231c4 = abstractC1246e2.f28692B;
                } else {
                    c1231c4 = new C1231c(8);
                }
                this.f28600a.f28711r.a(c1231c4);
                this.f28600a.U(c1231c4);
                return;
            }
            if (i5 == 5) {
                AbstractC1246e abstractC1246e3 = this.f28600a;
                c1231c = abstractC1246e3.f28692B;
                if (c1231c != null) {
                    c1231c2 = abstractC1246e3.f28692B;
                } else {
                    c1231c2 = new C1231c(8);
                }
                this.f28600a.f28711r.a(c1231c2);
                this.f28600a.U(c1231c2);
                return;
            }
            if (i5 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C1231c c1231c5 = new C1231c(message.arg2, pendingIntent);
                this.f28600a.f28711r.a(c1231c5);
                this.f28600a.U(c1231c5);
                return;
            }
            if (i5 == 6) {
                this.f28600a.q0(5, null);
                AbstractC1246e abstractC1246e4 = this.f28600a;
                aVar = abstractC1246e4.f28716w;
                if (aVar != null) {
                    aVar2 = abstractC1246e4.f28716w;
                    aVar2.v(message.arg2);
                }
                this.f28600a.V(message.arg2);
                AbstractC1246e.o0(this.f28600a, 5, 1, null);
                return;
            }
            if (i5 == 2 && !this.f28600a.a()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((C0) message.obj).c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        a(message);
    }
}
