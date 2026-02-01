package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes2.dex */
final class L2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M2 f29381a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(M2 m22, Handler handler) {
        super(null);
        this.f29381a = m22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        this.f29381a.e();
    }
}
