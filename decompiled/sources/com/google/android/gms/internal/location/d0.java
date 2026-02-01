package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC1260l;
import com.google.android.gms.common.internal.C1250g;
import com.google.android.gms.location.Z0;

/* loaded from: classes.dex */
public class d0 extends AbstractC1260l<InterfaceC1335n> {

    /* renamed from: Q, reason: collision with root package name */
    private final String f29213Q;

    /* renamed from: R, reason: collision with root package name */
    protected final I<InterfaceC1335n> f29214R;

    public d0(Context context, Looper looper, i.b bVar, i.c cVar, String str, C1250g c1250g) {
        super(context, looper, 23, c1250g, bVar, cVar);
        this.f29214R = new c0(this);
        this.f29213Q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final /* bridge */ /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof InterfaceC1335n) {
            return (InterfaceC1335n) queryLocalInterface;
        }
        return new C1334m(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final C1233e[] D() {
        return Z0.f29964f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    protected final Bundle I() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f29213Q);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1246e
    public final String N() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e
    protected final String O() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1246e, com.google.android.gms.common.api.C1164a.f
    public final int s() {
        return 11717000;
    }
}
