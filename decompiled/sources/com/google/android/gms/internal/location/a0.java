package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC1569h0;

/* loaded from: classes.dex */
abstract class a0 extends AbstractC1569h0<Status> {
    public a0(com.google.android.gms.common.api.i iVar) {
        super(iVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.q createFailedResult(Status status) {
        return status;
    }
}
