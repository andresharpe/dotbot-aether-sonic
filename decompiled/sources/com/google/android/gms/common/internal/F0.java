package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.InterfaceC0564g;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.internal.AbstractC1246e;

/* loaded from: classes.dex */
public final class F0 extends AbstractC1269p0 {

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.P
    public final IBinder f28621g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e f28622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC0564g
    public F0(AbstractC1246e abstractC1246e, @androidx.annotation.P int i4, @androidx.annotation.P IBinder iBinder, Bundle bundle) {
        super(abstractC1246e, i4, bundle);
        this.f28622h = abstractC1246e;
        this.f28621g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1269p0
    protected final void f(C1231c c1231c) {
        if (this.f28622h.f28717x != null) {
            this.f28622h.f28717x.A(c1231c);
        }
        this.f28622h.U(c1231c);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1269p0
    protected final boolean g() {
        AbstractC1246e.a aVar;
        AbstractC1246e.a aVar2;
        try {
            IBinder iBinder = this.f28621g;
            C1285y.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f28622h.N().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f28622h.N() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface A3 = this.f28622h.A(this.f28621g);
            if (A3 != null && (AbstractC1246e.o0(this.f28622h, 2, 4, A3) || AbstractC1246e.o0(this.f28622h, 3, 4, A3))) {
                this.f28622h.f28692B = null;
                Bundle F3 = this.f28622h.F();
                AbstractC1246e abstractC1246e = this.f28622h;
                aVar = abstractC1246e.f28716w;
                if (aVar != null) {
                    aVar2 = abstractC1246e.f28716w;
                    aVar2.G(F3);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
