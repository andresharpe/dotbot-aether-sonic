package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1278u0 extends com.google.android.gms.internal.common.k implements InterfaceC1280v0 {
    public static InterfaceC1280v0 A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof InterfaceC1280v0) {
            return (InterfaceC1280v0) queryLocalInterface;
        }
        return new C1276t0(iBinder);
    }
}
