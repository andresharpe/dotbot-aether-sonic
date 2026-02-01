package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1290k;
import com.google.android.gms.common.internal.AbstractC1246e;

/* renamed from: com.google.android.gms.measurement.internal.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1697p1 extends AbstractC1246e {
    public C1697p1(Context context, Looper looper, AbstractC1246e.a aVar, AbstractC1246e.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC1661j1) {
            return (InterfaceC1661j1) queryLocalInterface;
        }
        return new C1649h1(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @androidx.annotation.N
    public final String N() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    @androidx.annotation.N
    protected final String O() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e, com.google.android.gms.common.api.C1164a.f
    public final int s() {
        return C1290k.f28840a;
    }
}
