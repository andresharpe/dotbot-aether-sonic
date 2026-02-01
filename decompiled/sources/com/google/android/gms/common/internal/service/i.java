package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC1260l;
import com.google.android.gms.common.internal.C1250g;

/* loaded from: classes.dex */
public final class i extends AbstractC1260l<m> {
    public i(Context context, Looper looper, C1250g c1250g, i.b bVar, i.c cVar) {
        super(context, looper, 39, c1250g, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof m) {
            return (m) queryLocalInterface;
        }
        return new m(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final String N() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final String O() {
        return "com.google.android.gms.common.service.START";
    }
}
