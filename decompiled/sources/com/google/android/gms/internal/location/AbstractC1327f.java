package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC1587q0;

/* renamed from: com.google.android.gms.internal.location.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1327f extends AbstractC1587q0<Status> {
    public AbstractC1327f(com.google.android.gms.common.api.i iVar) {
        super(iVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.q createFailedResult(Status status) {
        return status;
    }
}
