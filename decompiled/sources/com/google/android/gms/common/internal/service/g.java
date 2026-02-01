package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class g extends h<Status> {
    public g(com.google.android.gms.common.api.i iVar) {
        super(iVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.q createFailedResult(Status status) {
        return status;
    }
}
