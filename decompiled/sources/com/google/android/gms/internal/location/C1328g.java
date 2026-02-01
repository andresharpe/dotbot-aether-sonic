package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C1584p;
import com.google.android.gms.location.C1602y0;
import com.google.android.gms.location.InterfaceC1574k;
import com.google.android.gms.location.InterfaceC1578m;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328g implements InterfaceC1578m {
    @Override // com.google.android.gms.location.InterfaceC1578m
    @Deprecated
    public final com.google.android.gms.common.api.l<Status> a(com.google.android.gms.common.api.i iVar, List<InterfaceC1574k> list, PendingIntent pendingIntent) {
        C1584p.a aVar = new C1584p.a();
        aVar.b(list);
        aVar.d(5);
        return iVar.m(new C1325d(this, iVar, aVar.c(), pendingIntent));
    }

    @Override // com.google.android.gms.location.InterfaceC1578m
    public final com.google.android.gms.common.api.l<Status> b(com.google.android.gms.common.api.i iVar, PendingIntent pendingIntent) {
        return e(iVar, C1602y0.e0(pendingIntent));
    }

    @Override // com.google.android.gms.location.InterfaceC1578m
    public final com.google.android.gms.common.api.l<Status> c(com.google.android.gms.common.api.i iVar, C1584p c1584p, PendingIntent pendingIntent) {
        return iVar.m(new C1325d(this, iVar, c1584p, pendingIntent));
    }

    @Override // com.google.android.gms.location.InterfaceC1578m
    public final com.google.android.gms.common.api.l<Status> d(com.google.android.gms.common.api.i iVar, List<String> list) {
        return e(iVar, C1602y0.c0(list));
    }

    public final com.google.android.gms.common.api.l<Status> e(com.google.android.gms.common.api.i iVar, C1602y0 c1602y0) {
        return iVar.m(new C1326e(this, iVar, c1602y0));
    }
}
