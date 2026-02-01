package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class Y implements i.b, i.c {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C1173b0 f28220i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Y(C1173b0 c1173b0, X x3) {
        this.f28220i = c1173b0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1211q
    public final void A(@androidx.annotation.N C1231c c1231c) {
        Lock lock;
        Lock lock2;
        boolean q4;
        Lock lock3;
        lock = this.f28220i.f28233b;
        lock.lock();
        try {
            q4 = this.f28220i.q(c1231c);
            if (q4) {
                this.f28220i.i();
                this.f28220i.n();
            } else {
                this.f28220i.l(c1231c);
            }
            lock3 = this.f28220i.f28233b;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f28220i.f28233b;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void G(@androidx.annotation.P Bundle bundle) {
        C1250g c1250g;
        com.google.android.gms.signin.f fVar;
        c1250g = this.f28220i.f28249r;
        fVar = this.f28220i.f28242k;
        ((com.google.android.gms.signin.f) C1285y.l(fVar)).r(new W(this.f28220i));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1184f
    public final void v(int i4) {
    }
}
