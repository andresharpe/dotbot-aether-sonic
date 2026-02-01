package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;

/* loaded from: classes.dex */
final class e extends b {

    /* renamed from: i, reason: collision with root package name */
    private final C1181e.b<Status> f28806i;

    public e(C1181e.b<Status> bVar) {
        this.f28806i = bVar;
    }

    @Override // com.google.android.gms.common.internal.service.b, com.google.android.gms.common.internal.service.l
    public final void H0(int i4) throws RemoteException {
        this.f28806i.b(new Status(i4));
    }
}
