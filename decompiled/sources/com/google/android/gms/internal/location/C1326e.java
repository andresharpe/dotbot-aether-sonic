package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.C1602y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.location.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1326e extends AbstractC1327f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1602y0 f29215c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326e(C1328g c1328g, com.google.android.gms.common.api.i iVar, C1602y0 c1602y0) {
        super(iVar);
        this.f29215c = c1602y0;
    }

    @Override // com.google.android.gms.common.api.internal.C1181e.a
    protected final /* bridge */ /* synthetic */ void e(A a4) throws RemoteException {
        a4.N0(this.f29215c, this);
    }
}
