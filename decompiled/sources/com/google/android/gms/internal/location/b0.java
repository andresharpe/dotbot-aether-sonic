package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.InterfaceC1556b;

/* loaded from: classes.dex */
public final class b0 implements InterfaceC1556b {
    @Override // com.google.android.gms.location.InterfaceC1556b
    public final com.google.android.gms.common.api.l<Status> a(com.google.android.gms.common.api.i iVar, PendingIntent pendingIntent) {
        return iVar.m(new Z(this, iVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.InterfaceC1556b
    public final com.google.android.gms.common.api.l<Status> b(com.google.android.gms.common.api.i iVar, long j4, PendingIntent pendingIntent) {
        return iVar.m(new Y(this, iVar, j4, pendingIntent));
    }
}
