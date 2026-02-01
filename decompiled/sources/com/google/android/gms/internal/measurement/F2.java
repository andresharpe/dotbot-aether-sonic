package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class F2 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = G2.f29333e;
        atomicBoolean.set(true);
    }
}
