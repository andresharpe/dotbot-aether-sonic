package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1181e;
import com.google.android.gms.location.C1601y;

/* renamed from: com.google.android.gms.internal.location.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1345y extends AbstractBinderC1332k {

    /* renamed from: i, reason: collision with root package name */
    private C1181e.b<Status> f29253i;

    public BinderC1345y(C1181e.b<Status> bVar) {
        this.f29253i = bVar;
    }

    private final void A(int i4) {
        if (this.f29253i == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.f29253i.b(C1601y.b(C1601y.a(i4)));
        this.f29253i = null;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1333l
    public final void L1(int i4, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1333l
    public final void Y(int i4, String[] strArr) {
        A(i4);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1333l
    public final void w1(int i4, PendingIntent pendingIntent) {
        A(i4);
    }
}
