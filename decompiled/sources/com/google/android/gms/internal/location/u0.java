package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.location.AbstractC1586q;
import com.google.android.gms.location.C1589s;
import com.google.android.gms.location.InterfaceC1570i;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class u0 implements InterfaceC1570i {
    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> a(com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return iVar.m(new p0(this, iVar, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final Location b(com.google.android.gms.common.api.i iVar) {
        String str;
        A g4 = C1589s.g(iVar);
        Context q4 = iVar.q();
        try {
            if (Build.VERSION.SDK_INT >= 30 && q4 != null) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(q4, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return g4.Q0(str);
            }
            return g4.Q0(str);
        } catch (Exception unused2) {
            return null;
        }
        str = null;
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> c(com.google.android.gms.common.api.i iVar, AbstractC1586q abstractC1586q) {
        return iVar.m(new i0(this, iVar, abstractC1586q));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> d(com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, AbstractC1586q abstractC1586q, Looper looper) {
        return iVar.m(new o0(this, iVar, locationRequest, abstractC1586q, looper));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> e(com.google.android.gms.common.api.i iVar, PendingIntent pendingIntent) {
        return iVar.m(new r0(this, iVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> f(com.google.android.gms.common.api.i iVar, com.google.android.gms.location.r rVar) {
        return iVar.m(new q0(this, iVar, rVar));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> g(com.google.android.gms.common.api.i iVar, boolean z3) {
        return iVar.m(new j0(this, iVar, z3));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> h(com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, com.google.android.gms.location.r rVar) {
        C1285y.m(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return iVar.m(new m0(this, iVar, locationRequest, rVar));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> i(com.google.android.gms.common.api.i iVar, LocationRequest locationRequest, com.google.android.gms.location.r rVar, Looper looper) {
        return iVar.m(new n0(this, iVar, locationRequest, rVar, looper));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final LocationAvailability j(com.google.android.gms.common.api.i iVar) {
        try {
            return C1589s.g(iVar).v0();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> k(com.google.android.gms.common.api.i iVar, Location location) {
        return iVar.m(new k0(this, iVar, location));
    }

    @Override // com.google.android.gms.location.InterfaceC1570i
    public final com.google.android.gms.common.api.l<Status> l(com.google.android.gms.common.api.i iVar) {
        return iVar.m(new l0(this, iVar));
    }
}
