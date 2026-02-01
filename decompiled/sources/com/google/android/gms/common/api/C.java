package com.google.android.gms.common.api;

import androidx.annotation.P;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.q;

/* loaded from: classes.dex */
final class C<R extends q> extends BasePendingResult<R> {
    public C(@P i iVar) {
        super(iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
