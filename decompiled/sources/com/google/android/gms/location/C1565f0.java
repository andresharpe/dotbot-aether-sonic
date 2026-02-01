package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C1322a;

/* renamed from: com.google.android.gms.location.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1565f0 extends C1322a implements InterfaceC1571i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1565f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.InterfaceC1571i0
    public final void Z(LocationResult locationResult) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.InterfaceC1571i0
    public final void z0(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }
}
